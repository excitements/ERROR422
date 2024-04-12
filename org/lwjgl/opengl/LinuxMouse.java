/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class LinuxMouse
/*     */ {
/*     */   private static final int NUM_BUTTONS = 3;
/*     */   private static final int POINTER_WARP_BORDER = 10;
/*     */   private static final int WHEEL_SCALE = 120;
/*     */   private static final int Button1 = 1;
/*     */   private static final int Button2 = 2;
/*     */   private static final int Button3 = 3;
/*     */   private static final int Button4 = 4;
/*     */   private static final int Button5 = 5;
/*     */   private static final int ButtonPress = 4;
/*     */   private static final int ButtonRelease = 5;
/*     */   private final long display;
/*     */   private final long window;
/*     */   private final long input_window;
/*     */   private final long warp_atom;
/*  65 */   private final IntBuffer query_pointer_buffer = BufferUtils.createIntBuffer(4);
/*  66 */   private final ByteBuffer event_buffer = ByteBuffer.allocate(22);
/*     */   
/*     */   private int last_x;
/*     */   private int last_y;
/*     */   private int accum_dx;
/*     */   private int accum_dy;
/*     */   private int accum_dz;
/*  73 */   private byte[] buttons = new byte[3];
/*     */   private EventQueue event_queue;
/*     */   private long last_event_nanos;
/*     */   
/*     */   LinuxMouse(long display, long window, long input_window) throws LWJGLException {
/*  78 */     this.display = display;
/*  79 */     this.window = window;
/*  80 */     this.input_window = input_window;
/*  81 */     this.warp_atom = LinuxDisplay.nInternAtom(display, "_LWJGL", false);
/*  82 */     reset(false, false);
/*     */   }
/*     */   
/*     */   private void reset(boolean grab, boolean warp_pointer) {
/*  86 */     this.event_queue = new EventQueue(this.event_buffer.capacity());
/*  87 */     this.accum_dx = this.accum_dy = 0;
/*  88 */     long root_window = nQueryPointer(this.display, this.window, this.query_pointer_buffer);
/*     */     
/*  90 */     int root_x = this.query_pointer_buffer.get(0);
/*  91 */     int root_y = this.query_pointer_buffer.get(1);
/*  92 */     int win_x = this.query_pointer_buffer.get(2);
/*  93 */     int win_y = this.query_pointer_buffer.get(3);
/*     */     
/*  95 */     this.last_x = win_x;
/*  96 */     this.last_y = transformY(win_y);
/*  97 */     doHandlePointerMotion(grab, warp_pointer, root_window, root_x, root_y, win_x, win_y, this.last_event_nanos);
/*     */   }
/*     */   
/*     */   public void read(ByteBuffer buffer) {
/* 101 */     this.event_queue.copyEvents(buffer);
/*     */   }
/*     */   
/*     */   public void poll(boolean grab, IntBuffer coord_buffer, ByteBuffer buttons_buffer) {
/* 105 */     if (grab) {
/* 106 */       coord_buffer.put(0, this.accum_dx);
/* 107 */       coord_buffer.put(1, this.accum_dy);
/*     */     } else {
/* 109 */       coord_buffer.put(0, this.last_x);
/* 110 */       coord_buffer.put(1, this.last_y);
/*     */     } 
/* 112 */     coord_buffer.put(2, this.accum_dz);
/* 113 */     this.accum_dx = this.accum_dy = this.accum_dz = 0;
/* 114 */     for (int i = 0; i < this.buttons.length; i++)
/* 115 */       buttons_buffer.put(i, this.buttons[i]); 
/*     */   }
/*     */   
/*     */   private void putMouseEventWithCoords(byte button, byte state, int coord1, int coord2, int dz, long nanos) {
/* 119 */     this.event_buffer.clear();
/* 120 */     this.event_buffer.put(button).put(state).putInt(coord1).putInt(coord2).putInt(dz).putLong(nanos);
/* 121 */     this.event_buffer.flip();
/* 122 */     this.event_queue.putEvent(this.event_buffer);
/* 123 */     this.last_event_nanos = nanos;
/*     */   }
/*     */   
/*     */   private void setCursorPos(boolean grab, int x, int y, long nanos) {
/* 127 */     y = transformY(y);
/* 128 */     int dx = x - this.last_x;
/* 129 */     int dy = y - this.last_y;
/* 130 */     if (dx != 0 || dy != 0) {
/* 131 */       this.accum_dx += dx;
/* 132 */       this.accum_dy += dy;
/* 133 */       this.last_x = x;
/* 134 */       this.last_y = y;
/* 135 */       if (grab) {
/* 136 */         putMouseEventWithCoords((byte)-1, (byte)0, dx, dy, 0, nanos);
/*     */       } else {
/* 138 */         putMouseEventWithCoords((byte)-1, (byte)0, x, y, 0, nanos);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void doWarpPointer(int center_x, int center_y) {
/* 144 */     nSendWarpEvent(this.display, this.input_window, this.warp_atom, center_x, center_y);
/* 145 */     nWarpCursor(this.display, this.window, center_x, center_y);
/*     */   }
/*     */   private static native void nSendWarpEvent(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*     */   
/*     */   private void doHandlePointerMotion(boolean grab, boolean warp_pointer, long root_window, int root_x, int root_y, int win_x, int win_y, long nanos) {
/* 150 */     setCursorPos(grab, win_x, win_y, nanos);
/* 151 */     if (!warp_pointer)
/*     */       return; 
/* 153 */     int root_window_height = nGetWindowHeight(this.display, root_window);
/* 154 */     int root_window_width = nGetWindowWidth(this.display, root_window);
/* 155 */     int window_height = nGetWindowHeight(this.display, this.window);
/* 156 */     int window_width = nGetWindowWidth(this.display, this.window);
/*     */ 
/*     */     
/* 159 */     int win_left = root_x - win_x;
/* 160 */     int win_top = root_y - win_y;
/* 161 */     int win_right = win_left + window_width;
/* 162 */     int win_bottom = win_top + window_height;
/*     */     
/* 164 */     int border_left = Math.max(0, win_left);
/* 165 */     int border_top = Math.max(0, win_top);
/* 166 */     int border_right = Math.min(root_window_width, win_right);
/* 167 */     int border_bottom = Math.min(root_window_height, win_bottom);
/*     */     
/* 169 */     boolean outside_limits = (root_x < border_left + 10 || root_y < border_top + 10 || root_x > border_right - 10 || root_y > border_bottom - 10);
/*     */     
/* 171 */     if (outside_limits) {
/*     */       
/* 173 */       int center_x = (border_right - border_left) / 2;
/* 174 */       int center_y = (border_bottom - border_top) / 2;
/* 175 */       doWarpPointer(center_x, center_y);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void changeGrabbed(boolean grab, boolean warp_pointer) {
/* 180 */     reset(grab, warp_pointer);
/*     */   }
/*     */   
/*     */   public int getButtonCount() {
/* 184 */     return this.buttons.length;
/*     */   } private static native int nGetWindowHeight(long paramLong1, long paramLong2);
/*     */   private static native int nGetWindowWidth(long paramLong1, long paramLong2);
/*     */   private int transformY(int y) {
/* 188 */     return nGetWindowHeight(this.display, this.window) - 1 - y;
/*     */   }
/*     */ 
/*     */   
/*     */   private static native long nQueryPointer(long paramLong1, long paramLong2, IntBuffer paramIntBuffer);
/*     */ 
/*     */   
/*     */   public void setCursorPosition(int x, int y) {
/* 196 */     nWarpCursor(this.display, this.window, x, transformY(y));
/*     */   }
/*     */   private static native void nWarpCursor(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private void handlePointerMotion(boolean grab, boolean warp_pointer, long millis, long root_window, int x_root, int y_root, int x, int y) {
/* 201 */     doHandlePointerMotion(grab, warp_pointer, root_window, x_root, y_root, x, y, millis * 1000000L);
/*     */   }
/*     */   
/*     */   private void handleButton(boolean grab, int button, byte state, long nanos) {
/*     */     byte button_num;
/* 206 */     switch (button) {
/*     */       case 1:
/* 208 */         button_num = 0;
/*     */         break;
/*     */       case 2:
/* 211 */         button_num = 2;
/*     */         break;
/*     */       case 3:
/* 214 */         button_num = 1;
/*     */         break;
/*     */       default:
/*     */         return;
/*     */     } 
/* 219 */     this.buttons[button_num] = state;
/* 220 */     putMouseEvent(grab, button_num, state, 0, nanos);
/*     */   }
/*     */   
/*     */   private void putMouseEvent(boolean grab, byte button, byte state, int dz, long nanos) {
/* 224 */     if (grab) {
/* 225 */       putMouseEventWithCoords(button, state, 0, 0, dz, nanos);
/*     */     } else {
/* 227 */       putMouseEventWithCoords(button, state, this.last_x, this.last_y, dz, nanos);
/*     */     } 
/*     */   }
/*     */   private void handleButtonPress(boolean grab, byte button, long nanos) {
/* 231 */     int delta = 0;
/* 232 */     switch (button) {
/*     */       case 4:
/* 234 */         delta = 120;
/* 235 */         putMouseEvent(grab, (byte)-1, (byte)0, delta, nanos);
/* 236 */         this.accum_dz += delta;
/*     */         return;
/*     */       case 5:
/* 239 */         delta = -120;
/* 240 */         putMouseEvent(grab, (byte)-1, (byte)0, delta, nanos);
/* 241 */         this.accum_dz += delta;
/*     */         return;
/*     */     } 
/* 244 */     handleButton(grab, button, (byte)1, nanos);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void handleButtonEvent(boolean grab, long millis, int type, byte button) {
/* 250 */     long nanos = millis * 1000000L;
/* 251 */     switch (type) {
/*     */       case 5:
/* 253 */         handleButton(grab, button, (byte)0, nanos);
/*     */         break;
/*     */       case 4:
/* 256 */         handleButtonPress(grab, button, nanos);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void resetCursor(int x, int y) {
/* 264 */     this.last_x = x;
/* 265 */     this.last_y = transformY(y);
/*     */   }
/*     */   
/*     */   private void handleWarpEvent(int x, int y) {
/* 269 */     resetCursor(x, y);
/*     */   }
/*     */   
/*     */   public boolean filterEvent(boolean grab, boolean warp_pointer, LinuxEvent event) {
/* 273 */     switch (event.getType()) {
/*     */       case 33:
/* 275 */         if (event.getClientMessageType() == this.warp_atom) {
/* 276 */           handleWarpEvent(event.getClientData(0), event.getClientData(1));
/* 277 */           return true;
/*     */         } 
/*     */         break;
/*     */       case 4:
/*     */       case 5:
/* 282 */         handleButtonEvent(grab, event.getButtonTime(), event.getButtonType(), (byte)event.getButtonButton());
/* 283 */         return true;
/*     */       case 6:
/* 285 */         handlePointerMotion(grab, warp_pointer, event.getButtonTime(), event.getButtonRoot(), event.getButtonXRoot(), event.getButtonYRoot(), event.getButtonX(), event.getButtonY());
/* 286 */         return true;
/*     */     } 
/*     */ 
/*     */     
/* 290 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxMouse.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */