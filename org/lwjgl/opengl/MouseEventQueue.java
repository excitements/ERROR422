/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.awt.event.MouseMotionListener;
/*     */ import java.awt.event.MouseWheelEvent;
/*     */ import java.awt.event.MouseWheelListener;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class MouseEventQueue
/*     */   extends EventQueue
/*     */   implements MouseListener, MouseMotionListener, MouseWheelListener
/*     */ {
/*     */   private static final int WHEEL_SCALE = 120;
/*     */   public static final int NUM_BUTTONS = 3;
/*     */   private final Component component;
/*     */   private boolean grabbed;
/*     */   private int accum_dx;
/*     */   private int accum_dy;
/*     */   private int accum_dz;
/*     */   private int last_x;
/*     */   private int last_y;
/*     */   private boolean saved_control_state;
/*  72 */   private final ByteBuffer event = ByteBuffer.allocate(22);
/*     */ 
/*     */   
/*  75 */   private final byte[] buttons = new byte[3];
/*     */   
/*     */   MouseEventQueue(Component component) {
/*  78 */     super(22);
/*  79 */     this.component = component;
/*     */   }
/*     */   
/*     */   public synchronized void register() {
/*  83 */     resetCursorToCenter();
/*  84 */     this.component.addMouseListener(this);
/*  85 */     this.component.addMouseMotionListener(this);
/*  86 */     this.component.addMouseWheelListener(this);
/*     */   }
/*     */   
/*     */   public synchronized void unregister() {
/*  90 */     this.component.removeMouseListener(this);
/*  91 */     this.component.removeMouseMotionListener(this);
/*  92 */     this.component.removeMouseWheelListener(this);
/*     */   }
/*     */   
/*     */   protected Component getComponent() {
/*  96 */     return this.component;
/*     */   }
/*     */   
/*     */   public synchronized void setGrabbed(boolean grabbed) {
/* 100 */     this.grabbed = grabbed;
/* 101 */     resetCursorToCenter();
/*     */   }
/*     */   
/*     */   public synchronized boolean isGrabbed() {
/* 105 */     return this.grabbed;
/*     */   }
/*     */   
/*     */   private int transformY(int y) {
/* 109 */     return this.component.getHeight() - 1 - y;
/*     */   }
/*     */   
/*     */   protected void resetCursorToCenter() {
/* 113 */     clearEvents();
/* 114 */     this.accum_dx = this.accum_dy = 0;
/* 115 */     Point cursor_location = AWTUtil.getCursorPosition(this.component);
/* 116 */     if (cursor_location != null) {
/* 117 */       this.last_x = cursor_location.x;
/* 118 */       this.last_y = cursor_location.y;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void putMouseEvent(byte button, byte state, int dz, long nanos) {
/* 123 */     if (this.grabbed) {
/* 124 */       putMouseEventWithCoords(button, state, 0, 0, dz, nanos);
/*     */     } else {
/* 126 */       putMouseEventWithCoords(button, state, this.last_x, this.last_y, dz, nanos);
/*     */     } 
/*     */   }
/*     */   protected void putMouseEventWithCoords(byte button, byte state, int coord1, int coord2, int dz, long nanos) {
/* 130 */     this.event.clear();
/* 131 */     this.event.put(button).put(state).putInt(coord1).putInt(coord2).putInt(dz).putLong(nanos);
/* 132 */     this.event.flip();
/* 133 */     putEvent(this.event);
/*     */   }
/*     */   
/*     */   public synchronized void poll(IntBuffer coord_buffer, ByteBuffer buttons_buffer) {
/* 137 */     if (this.grabbed) {
/* 138 */       coord_buffer.put(0, this.accum_dx);
/* 139 */       coord_buffer.put(1, this.accum_dy);
/*     */     } else {
/* 141 */       coord_buffer.put(0, this.last_x);
/* 142 */       coord_buffer.put(1, this.last_y);
/*     */     } 
/* 144 */     coord_buffer.put(2, this.accum_dz);
/* 145 */     this.accum_dx = this.accum_dy = this.accum_dz = 0;
/* 146 */     int old_position = buttons_buffer.position();
/* 147 */     buttons_buffer.put(this.buttons, 0, this.buttons.length);
/* 148 */     buttons_buffer.position(old_position);
/*     */   }
/*     */   
/*     */   private void setCursorPos(int x, int y, long nanos) {
/* 152 */     y = transformY(y);
/* 153 */     if (this.grabbed)
/*     */       return; 
/* 155 */     int dx = x - this.last_x;
/* 156 */     int dy = y - this.last_y;
/* 157 */     addDelta(dx, dy);
/* 158 */     this.last_x = x;
/* 159 */     this.last_y = y;
/* 160 */     putMouseEventWithCoords((byte)-1, (byte)0, x, y, 0, nanos);
/*     */   }
/*     */   
/*     */   protected void addDelta(int dx, int dy) {
/* 164 */     this.accum_dx += dx;
/* 165 */     this.accum_dy += dy;
/*     */   }
/*     */ 
/*     */   
/*     */   public void mouseClicked(MouseEvent e) {}
/*     */ 
/*     */   
/*     */   public void mouseEntered(MouseEvent e) {}
/*     */ 
/*     */   
/*     */   public void mouseExited(MouseEvent e) {}
/*     */   
/*     */   private void handleButton(MouseEvent e) {
/*     */     byte state, button;
/* 179 */     switch (e.getID()) {
/*     */       case 501:
/* 181 */         state = 1;
/*     */         break;
/*     */       case 502:
/* 184 */         state = 0;
/*     */         break;
/*     */       default:
/* 187 */         throw new IllegalArgumentException("Not a valid event ID: " + e.getID());
/*     */     } 
/*     */     
/* 190 */     switch (e.getButton()) {
/*     */       case 0:
/*     */         return;
/*     */ 
/*     */       
/*     */       case 1:
/* 196 */         if (state == 1)
/* 197 */           this.saved_control_state = e.isControlDown(); 
/* 198 */         if (this.saved_control_state) {
/* 199 */           if (this.buttons[1] == state)
/*     */             return; 
/* 201 */           byte b = 1; break;
/*     */         } 
/* 203 */         button = 0;
/*     */         break;
/*     */       
/*     */       case 2:
/* 207 */         button = 2;
/*     */         break;
/*     */       case 3:
/* 210 */         if (this.buttons[1] == state)
/*     */           return; 
/* 212 */         button = 1;
/*     */         break;
/*     */       default:
/* 215 */         throw new IllegalArgumentException("Not a valid button: " + e.getButton());
/*     */     } 
/* 217 */     setButton(button, state, e.getWhen() * 1000000L);
/*     */   }
/*     */   
/*     */   public synchronized void mousePressed(MouseEvent e) {
/* 221 */     handleButton(e);
/*     */   }
/*     */   
/*     */   private void setButton(byte button, byte state, long nanos) {
/* 225 */     this.buttons[button] = state;
/* 226 */     putMouseEvent(button, state, 0, nanos);
/*     */   }
/*     */   
/*     */   public synchronized void mouseReleased(MouseEvent e) {
/* 230 */     handleButton(e);
/*     */   }
/*     */   
/*     */   private void handleMotion(MouseEvent e) {
/* 234 */     if (this.grabbed) {
/* 235 */       updateDeltas(e.getWhen() * 1000000L);
/*     */     } else {
/* 237 */       setCursorPos(e.getX(), e.getY(), e.getWhen() * 1000000L);
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized void mouseDragged(MouseEvent e) {
/* 242 */     handleMotion(e);
/*     */   }
/*     */   
/*     */   public synchronized void mouseMoved(MouseEvent e) {
/* 246 */     handleMotion(e);
/*     */   }
/*     */   
/*     */   private void handleWheel(int amount, long nanos) {
/* 250 */     this.accum_dz += amount;
/* 251 */     putMouseEvent((byte)-1, (byte)0, amount, nanos);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void updateDeltas(long nanos) {}
/*     */   
/*     */   public synchronized void mouseWheelMoved(MouseWheelEvent e) {
/* 258 */     int wheel_amount = -e.getWheelRotation() * 120;
/* 259 */     handleWheel(wheel_amount, e.getWhen() * 1000000L);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MouseEventQueue.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */