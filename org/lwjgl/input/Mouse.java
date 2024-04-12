/*     */ package org.lwjgl.input;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ import org.lwjgl.Sys;
/*     */ import org.lwjgl.opengl.Display;
/*     */ import org.lwjgl.opengl.InputImplementation;
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
/*     */ public class Mouse
/*     */ {
/*     */   public static final int EVENT_SIZE = 22;
/*     */   private static boolean created;
/*     */   private static ByteBuffer buttons;
/*     */   private static int x;
/*     */   private static int y;
/*     */   private static IntBuffer coord_buffer;
/*     */   private static int dx;
/*     */   private static int dy;
/*     */   private static int dwheel;
/*  94 */   private static int buttonCount = -1;
/*     */ 
/*     */   
/*     */   private static boolean hasWheel;
/*     */ 
/*     */   
/*     */   private static Cursor currentCursor;
/*     */ 
/*     */   
/*     */   private static String[] buttonName;
/*     */ 
/*     */   
/* 106 */   private static final Map buttonMap = new HashMap(16);
/*     */ 
/*     */   
/*     */   private static boolean initialized;
/*     */ 
/*     */   
/*     */   private static ByteBuffer readBuffer;
/*     */   
/*     */   private static int eventButton;
/*     */   
/*     */   private static boolean eventState;
/*     */   
/*     */   private static int event_dx;
/*     */   
/*     */   private static int event_dy;
/*     */   
/*     */   private static int event_dwheel;
/*     */   
/*     */   private static int event_x;
/*     */   
/*     */   private static int event_y;
/*     */   
/*     */   private static long event_nanos;
/*     */   
/*     */   private static int grab_x;
/*     */   
/*     */   private static int grab_y;
/*     */   
/*     */   private static final int BUFFER_SIZE = 50;
/*     */   
/*     */   private static boolean isGrabbed;
/*     */   
/*     */   private static InputImplementation implementation;
/*     */   
/* 140 */   private static final boolean emulateCursorAnimation = (LWJGLUtil.getPlatform() == 3 || LWJGLUtil.getPlatform() == 2);
/*     */ 
/*     */   
/* 143 */   private static final boolean allowNegativeMouseCoords = getPrivilegedBoolean("org.lwjgl.input.Mouse.allowNegativeMouseCoords");
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
/*     */   public static Cursor getNativeCursor() {
/* 157 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 158 */       return currentCursor;
/*     */     } 
/*     */   }
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
/*     */   public static Cursor setNativeCursor(Cursor cursor) throws LWJGLException {
/* 175 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 176 */       if ((Cursor.getCapabilities() & 0x1) == 0)
/* 177 */         throw new IllegalStateException("Mouse doesn't support native cursors"); 
/* 178 */       Cursor oldCursor = currentCursor;
/* 179 */       currentCursor = cursor;
/* 180 */       if (isCreated()) {
/* 181 */         if (currentCursor != null) {
/* 182 */           implementation.setNativeCursor(currentCursor.getHandle());
/* 183 */           currentCursor.setTimeout();
/*     */         } else {
/* 185 */           implementation.setNativeCursor(null);
/*     */         } 
/*     */       }
/* 188 */       return oldCursor;
/*     */     } 
/*     */   }
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
/*     */   public static void setCursorPosition(int new_x, int new_y) {
/* 202 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 203 */       if (!isCreated())
/* 204 */         throw new IllegalStateException("Mouse is not created"); 
/* 205 */       x = event_x = new_x;
/* 206 */       y = event_y = new_y;
/* 207 */       if (!isGrabbed() && (Cursor.getCapabilities() & 0x1) != 0) {
/* 208 */         implementation.setCursorPosition(x, y);
/*     */       } else {
/*     */         
/* 211 */         grab_x = new_x;
/* 212 */         grab_y = new_y;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void initialize() {
/* 221 */     Sys.initialize();
/*     */ 
/*     */     
/* 224 */     buttonName = new String[16];
/* 225 */     for (int i = 0; i < 16; i++) {
/* 226 */       buttonName[i] = "BUTTON" + i;
/* 227 */       buttonMap.put(buttonName[i], new Integer(i));
/*     */     } 
/*     */     
/* 230 */     initialized = true;
/*     */   }
/*     */   
/*     */   private static void resetMouse() {
/* 234 */     dx = dy = dwheel = 0;
/* 235 */     readBuffer.position(readBuffer.limit());
/*     */   }
/*     */   
/*     */   static InputImplementation getImplementation() {
/* 239 */     return implementation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void create(InputImplementation impl) throws LWJGLException {
/* 249 */     if (created)
/*     */       return; 
/* 251 */     if (!initialized)
/* 252 */       initialize(); 
/* 253 */     implementation = impl;
/* 254 */     implementation.createMouse();
/* 255 */     hasWheel = implementation.hasWheel();
/* 256 */     created = true;
/*     */ 
/*     */     
/* 259 */     buttonCount = implementation.getButtonCount();
/* 260 */     buttons = BufferUtils.createByteBuffer(buttonCount);
/* 261 */     coord_buffer = BufferUtils.createIntBuffer(3);
/* 262 */     if (currentCursor != null && implementation.getNativeCursorCapabilities() != 0)
/* 263 */       setNativeCursor(currentCursor); 
/* 264 */     readBuffer = ByteBuffer.allocate(1100);
/* 265 */     readBuffer.limit(0);
/* 266 */     setGrabbed(isGrabbed);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void create() throws LWJGLException {
/* 277 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 278 */       if (!Display.isCreated()) throw new IllegalStateException("Display must be created.");
/*     */       
/* 280 */       create(OpenGLPackageAccess.createImplementation());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isCreated() {
/* 288 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 289 */       return created;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void destroy() {
/* 297 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 298 */       if (!created)
/* 299 */         return;  created = false;
/* 300 */       buttons = null;
/* 301 */       coord_buffer = null;
/*     */       
/* 303 */       implementation.destroyMouse();
/*     */     } 
/*     */   }
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
/*     */   public static void poll() {
/* 332 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 333 */       if (!created) throw new IllegalStateException("Mouse must be created before you can poll it"); 
/* 334 */       implementation.pollMouse(coord_buffer, buttons);
/*     */ 
/*     */       
/* 337 */       int poll_coord1 = coord_buffer.get(0);
/* 338 */       int poll_coord2 = coord_buffer.get(1);
/*     */       
/* 340 */       int poll_dwheel = coord_buffer.get(2);
/*     */       
/* 342 */       if (isGrabbed()) {
/* 343 */         dx += poll_coord1;
/* 344 */         dy += poll_coord2;
/* 345 */         x += poll_coord1;
/* 346 */         y += poll_coord2;
/*     */       } else {
/* 348 */         dx = poll_coord1 - x;
/* 349 */         dy = poll_coord2 - y;
/* 350 */         x = poll_coord1;
/* 351 */         y = poll_coord2;
/*     */       } 
/* 353 */       if (!allowNegativeMouseCoords) {
/* 354 */         x = Math.min(implementation.getWidth() - 1, Math.max(0, x));
/* 355 */         y = Math.min(implementation.getHeight() - 1, Math.max(0, y));
/*     */       } 
/* 357 */       dwheel += poll_dwheel;
/* 358 */       read();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void read() {
/* 363 */     readBuffer.compact();
/* 364 */     implementation.readMouse(readBuffer);
/* 365 */     readBuffer.flip();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isButtonDown(int button) {
/* 375 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 376 */       if (!created) throw new IllegalStateException("Mouse must be created before you can poll the button state"); 
/* 377 */       if (button >= buttonCount || button < 0) {
/* 378 */         return false;
/*     */       }
/* 380 */       return (buttons.get(button) == 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getButtonName(int button) {
/* 390 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 391 */       if (button >= buttonName.length || button < 0) {
/* 392 */         return null;
/*     */       }
/* 394 */       return buttonName[button];
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getButtonIndex(String buttonName) {
/* 403 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 404 */       Integer ret = (Integer)buttonMap.get(buttonName);
/* 405 */       if (ret == null) {
/* 406 */         return -1;
/*     */       }
/* 408 */       return ret.intValue();
/*     */     } 
/*     */   }
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
/*     */   public static boolean next() {
/* 422 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 423 */       if (!created) throw new IllegalStateException("Mouse must be created before you can read events"); 
/* 424 */       if (readBuffer.hasRemaining()) {
/* 425 */         eventButton = readBuffer.get();
/* 426 */         eventState = (readBuffer.get() != 0);
/* 427 */         if (isGrabbed()) {
/* 428 */           event_dx = readBuffer.getInt();
/* 429 */           event_dy = readBuffer.getInt();
/* 430 */           event_x += event_dx;
/* 431 */           event_y += event_dy;
/*     */         } else {
/* 433 */           int new_event_x = readBuffer.getInt();
/* 434 */           int new_event_y = readBuffer.getInt();
/* 435 */           event_dx = new_event_x - event_x;
/* 436 */           event_dy = new_event_y - event_y;
/* 437 */           event_x = new_event_x;
/* 438 */           event_y = new_event_y;
/*     */         } 
/* 440 */         event_x = Math.min(implementation.getWidth() - 1, Math.max(0, event_x));
/* 441 */         event_y = Math.min(implementation.getHeight() - 1, Math.max(0, event_y));
/* 442 */         event_dwheel = readBuffer.getInt();
/* 443 */         event_nanos = readBuffer.getLong();
/* 444 */         return true;
/*     */       } 
/* 446 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventButton() {
/* 454 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 455 */       return eventButton;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean getEventButtonState() {
/* 464 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 465 */       return eventState;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventDX() {
/* 473 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 474 */       return event_dx;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventDY() {
/* 482 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 483 */       return event_dy;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventX() {
/* 491 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 492 */       return event_x;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventY() {
/* 500 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 501 */       return event_y;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventDWheel() {
/* 509 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 510 */       return event_dwheel;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getEventNanoseconds() {
/* 523 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 524 */       return event_nanos;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getX() {
/* 535 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 536 */       return x;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getY() {
/* 547 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 548 */       return y;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getDX() {
/* 556 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 557 */       int result = dx;
/* 558 */       dx = 0;
/* 559 */       return result;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getDY() {
/* 567 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 568 */       int result = dy;
/* 569 */       dy = 0;
/* 570 */       return result;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getDWheel() {
/* 578 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 579 */       int result = dwheel;
/* 580 */       dwheel = 0;
/* 581 */       return result;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getButtonCount() {
/* 589 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 590 */       return buttonCount;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean hasWheel() {
/* 598 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 599 */       return hasWheel;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isGrabbed() {
/* 607 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 608 */       return isGrabbed;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGrabbed(boolean grab) {
/* 621 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 622 */       boolean grabbed = isGrabbed;
/* 623 */       isGrabbed = grab;
/* 624 */       if (isCreated()) {
/* 625 */         if (grab && !grabbed) {
/*     */           
/* 627 */           grab_x = x;
/* 628 */           grab_y = y;
/*     */         }
/* 630 */         else if (!grab && grabbed) {
/*     */           
/* 632 */           if ((Cursor.getCapabilities() & 0x1) != 0) {
/* 633 */             implementation.setCursorPosition(grab_x, grab_y);
/*     */           }
/*     */         } 
/* 636 */         implementation.grabMouse(grab);
/*     */         
/* 638 */         poll();
/* 639 */         event_x = x;
/* 640 */         event_y = y;
/* 641 */         resetMouse();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void updateCursor() {
/* 652 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 653 */       if (emulateCursorAnimation && currentCursor != null && currentCursor.hasTimedOut() && isInsideWindow()) {
/* 654 */         currentCursor.nextCursor();
/*     */         try {
/* 656 */           setNativeCursor(currentCursor);
/* 657 */         } catch (LWJGLException e) {
/* 658 */           if (LWJGLUtil.DEBUG) e.printStackTrace();
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   static boolean getPrivilegedBoolean(final String property_name) {
/* 666 */     Boolean value = AccessController.<Boolean>doPrivileged(new PrivilegedAction() {
/*     */           public Object run() {
/* 668 */             return new Boolean(Boolean.getBoolean(property_name));
/*     */           } private final String val$property_name;
/*     */         });
/* 671 */     return value.booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isInsideWindow() {
/* 681 */     return implementation.isInsideWindow();
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\input\Mouse.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */