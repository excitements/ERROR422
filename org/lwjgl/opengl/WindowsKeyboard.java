/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.CharBuffer;
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
/*     */ final class WindowsKeyboard
/*     */ {
/*     */   private static final int MAPVK_VK_TO_VSC = 0;
/*     */   private static final int BUFFER_SIZE = 50;
/*     */   private final long hwnd;
/*     */   private final ByteBuffer keyboard_state;
/*  53 */   private final byte[] key_down_buffer = new byte[256];
/*  54 */   private final EventQueue event_queue = new EventQueue(18);
/*  55 */   private final ByteBuffer tmp_event = ByteBuffer.allocate(18);
/*     */   
/*     */   private boolean grabbed;
/*     */   
/*     */   private boolean has_retained_event;
/*     */   private int retained_key_code;
/*     */   private byte retained_state;
/*     */   private int retained_char;
/*     */   private long retained_millis;
/*     */   private boolean retained_repeat;
/*     */   
/*     */   WindowsKeyboard(long hwnd) throws LWJGLException {
/*  67 */     this.hwnd = hwnd;
/*  68 */     this.keyboard_state = BufferUtils.createByteBuffer(256);
/*     */   }
/*     */   
/*     */   private static native boolean isWindowsNT();
/*     */   
/*     */   public void destroy() {}
/*     */   
/*     */   boolean isKeyDown(int lwjgl_keycode) {
/*  76 */     return (this.key_down_buffer[lwjgl_keycode] == 1);
/*     */   }
/*     */   
/*     */   public void grab(boolean grab) {
/*  80 */     if (grab) {
/*  81 */       if (!this.grabbed) {
/*  82 */         this.grabbed = true;
/*     */       }
/*     */     }
/*  85 */     else if (this.grabbed) {
/*  86 */       this.grabbed = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void poll(ByteBuffer keyDownBuffer) {
/*  92 */     int old_position = keyDownBuffer.position();
/*  93 */     keyDownBuffer.put(this.key_down_buffer);
/*  94 */     keyDownBuffer.position(old_position);
/*     */   }
/*     */ 
/*     */   
/*     */   private static native int MapVirtualKey(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   private static native int ToUnicode(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, CharBuffer paramCharBuffer, int paramInt3, int paramInt4);
/*     */   
/*     */   private void putEvent(int keycode, byte state, int ch, long millis, boolean repeat) {
/* 104 */     this.tmp_event.clear();
/* 105 */     this.tmp_event.putInt(keycode).put(state).putInt(ch).putLong(millis * 1000000L).put(repeat ? 1 : 0);
/* 106 */     this.tmp_event.flip();
/* 107 */     this.event_queue.putEvent(this.tmp_event);
/*     */   } private static native int ToAscii(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, int paramInt3); private static native int GetKeyboardState(ByteBuffer paramByteBuffer);
/*     */   private static native int GetKeyState(int paramInt);
/*     */   private boolean checkShiftKey(int virt_key, byte state) {
/* 111 */     int key_state = GetKeyState(virt_key) >>> 15 & 0x1;
/* 112 */     int lwjgl_code = WindowsKeycodes.mapVirtualKeyToLWJGLCode(virt_key);
/* 113 */     return (this.key_down_buffer[lwjgl_code] == 1 - state && key_state == state);
/*     */   }
/*     */   
/*     */   private int translateShift(int scan_code, byte state) {
/* 117 */     if (checkShiftKey(160, state))
/* 118 */       return 160; 
/* 119 */     if (checkShiftKey(161, state)) {
/* 120 */       return 161;
/*     */     }
/* 122 */     if (scan_code == 42) {
/* 123 */       return 160;
/*     */     }
/* 125 */     if (scan_code == 54) {
/* 126 */       return 161;
/*     */     }
/* 128 */     return 160;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int translateExtended(int virt_key, int scan_code, byte state, boolean extended) {
/* 134 */     switch (virt_key) {
/*     */       case 16:
/* 136 */         return translateShift(scan_code, state);
/*     */       case 17:
/* 138 */         return extended ? 163 : 162;
/*     */       case 18:
/* 140 */         return extended ? 165 : 164;
/*     */     } 
/* 142 */     return virt_key;
/*     */   }
/*     */ 
/*     */   
/*     */   private void flushRetained() {
/* 147 */     if (this.has_retained_event) {
/* 148 */       this.has_retained_event = false;
/* 149 */       putEvent(this.retained_key_code, this.retained_state, this.retained_char, this.retained_millis, this.retained_repeat);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void handleKey(int virt_key, int scan_code, boolean extended, byte event_state, long millis, boolean repeat) {
/* 154 */     virt_key = translateExtended(virt_key, scan_code, event_state, extended);
/* 155 */     flushRetained();
/* 156 */     this.has_retained_event = true;
/* 157 */     int keycode = WindowsKeycodes.mapVirtualKeyToLWJGLCode(virt_key);
/* 158 */     if (keycode < this.key_down_buffer.length)
/* 159 */       this.key_down_buffer[keycode] = event_state; 
/* 160 */     this.retained_key_code = keycode;
/* 161 */     this.retained_state = event_state;
/* 162 */     this.retained_millis = millis;
/* 163 */     this.retained_char = 0;
/* 164 */     this.retained_repeat = repeat;
/*     */   }
/*     */   
/*     */   public void handleChar(int event_char, long millis, boolean repeat) {
/* 168 */     if (this.has_retained_event && this.retained_char != 0)
/* 169 */       flushRetained(); 
/* 170 */     if (!this.has_retained_event) {
/* 171 */       putEvent(0, (byte)0, event_char, millis, repeat);
/*     */     } else {
/* 173 */       this.retained_char = event_char;
/*     */     } 
/*     */   }
/*     */   public void read(ByteBuffer buffer) {
/* 177 */     flushRetained();
/* 178 */     this.event_queue.copyEvents(buffer);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsKeyboard.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */