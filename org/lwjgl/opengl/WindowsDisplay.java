/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ import org.lwjgl.input.Mouse;
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
/*     */ final class WindowsDisplay
/*     */   implements DisplayImplementation
/*     */ {
/*     */   private static final int GAMMA_LENGTH = 256;
/*     */   private static final int WM_CANCELMODE = 31;
/*     */   private static final int WM_MOUSEMOVE = 512;
/*     */   private static final int WM_LBUTTONDOWN = 513;
/*     */   private static final int WM_LBUTTONUP = 514;
/*     */   private static final int WM_LBUTTONDBLCLK = 515;
/*     */   private static final int WM_RBUTTONDOWN = 516;
/*     */   private static final int WM_RBUTTONUP = 517;
/*     */   private static final int WM_RBUTTONDBLCLK = 518;
/*     */   private static final int WM_MBUTTONDOWN = 519;
/*     */   private static final int WM_MBUTTONUP = 520;
/*     */   private static final int WM_MBUTTONDBLCLK = 521;
/*     */   private static final int WM_MOUSEWHEEL = 522;
/*     */   private static final int WM_CAPTURECHANGED = 533;
/*     */   private static final int WM_MOUSELEAVE = 675;
/*     */   private static final int WM_KEYDOWN = 256;
/*     */   private static final int WM_KEYUP = 257;
/*     */   private static final int WM_SYSKEYUP = 261;
/*     */   private static final int WM_SYSKEYDOWN = 260;
/*     */   private static final int WM_SYSCHAR = 262;
/*     */   private static final int WM_CHAR = 258;
/*     */   private static final int WM_SETICON = 128;
/*     */   private static final int WM_QUIT = 18;
/*     */   private static final int WM_SYSCOMMAND = 274;
/*     */   private static final int WM_PAINT = 15;
/*     */   private static final int WM_KILLFOCUS = 8;
/*     */   private static final int WM_SETFOCUS = 7;
/*     */   private static final int SC_SIZE = 61440;
/*     */   private static final int SC_MOVE = 61456;
/*     */   private static final int SC_MINIMIZE = 61472;
/*     */   private static final int SC_MAXIMIZE = 61488;
/*     */   private static final int SC_NEXTWINDOW = 61504;
/*     */   private static final int SC_PREVWINDOW = 61520;
/*     */   private static final int SC_CLOSE = 61536;
/*     */   private static final int SC_VSCROLL = 61552;
/*     */   private static final int SC_HSCROLL = 61568;
/*     */   private static final int SC_MOUSEMENU = 61584;
/*     */   private static final int SC_KEYMENU = 61696;
/*     */   private static final int SC_ARRANGE = 61712;
/*     */   private static final int SC_RESTORE = 61728;
/*     */   private static final int SC_TASKLIST = 61744;
/*     */   private static final int SC_SCREENSAVE = 61760;
/*     */   private static final int SC_HOTKEY = 61776;
/*     */   private static final int SC_DEFAULT = 61792;
/*     */   private static final int SC_MONITORPOWER = 61808;
/*     */   private static final int SC_CONTEXTHELP = 61824;
/*     */   private static final int SC_SEPARATOR = 61455;
/*     */   static final int SM_CXCURSOR = 13;
/*     */   static final int SM_CYCURSOR = 14;
/*     */   static final int SM_CMOUSEBUTTONS = 43;
/*     */   static final int SM_MOUSEWHEELPRESENT = 75;
/*     */   private static final int SIZE_RESTORED = 0;
/*     */   private static final int SIZE_MINIMIZED = 1;
/*     */   private static final int SIZE_MAXIMIZED = 2;
/*     */   private static final int WM_SIZE = 5;
/*     */   private static final int WM_ACTIVATE = 6;
/*     */   private static final int WA_INACTIVE = 0;
/*     */   private static final int WA_ACTIVE = 1;
/*     */   private static final int WA_CLICKACTIVE = 2;
/*     */   private static final int SW_SHOWMINNOACTIVE = 7;
/*     */   private static final int SW_SHOWDEFAULT = 10;
/*     */   private static final int SW_RESTORE = 9;
/*     */   private static final int ICON_SMALL = 0;
/*     */   private static final int ICON_BIG = 1;
/* 125 */   private static final IntBuffer rect_buffer = BufferUtils.createIntBuffer(4);
/* 126 */   private static final Rect rect = new Rect();
/* 127 */   private static final Rect rect2 = new Rect();
/*     */   
/*     */   private static WindowsDisplay current_display;
/*     */   
/*     */   private static boolean cursor_clipped;
/*     */   
/*     */   private WindowsDisplayPeerInfo peer_info;
/*     */   
/*     */   private Object current_cursor;
/*     */   
/*     */   private Canvas parent;
/*     */   
/*     */   private static boolean hasParent = false;
/*     */   
/*     */   private WindowsKeyboard keyboard;
/*     */   
/*     */   private WindowsMouse mouse;
/*     */   private boolean close_requested;
/*     */   private boolean is_dirty;
/*     */   private ByteBuffer current_gamma;
/*     */   private ByteBuffer saved_gamma;
/*     */   private DisplayMode current_mode;
/*     */   private boolean mode_set;
/*     */   private boolean isMinimized;
/*     */   private boolean isFocused;
/*     */   private boolean did_maximize;
/*     */   private boolean inAppActivate;
/*     */   private long hwnd;
/*     */   private long hdc;
/*     */   private long small_icon;
/*     */   private long large_icon;
/* 158 */   private int captureMouse = -1;
/*     */   private boolean trackingMouse = false;
/*     */   private boolean mouseInside = false;
/*     */   
/*     */   WindowsDisplay() {
/* 163 */     current_display = this;
/*     */   }
/*     */   
/*     */   public void createWindow(DisplayMode mode, Canvas parent, int x, int y) throws LWJGLException {
/* 167 */     this.close_requested = false;
/* 168 */     this.is_dirty = false;
/* 169 */     this.isMinimized = false;
/* 170 */     this.isFocused = false;
/* 171 */     this.did_maximize = false;
/* 172 */     this.parent = parent;
/* 173 */     hasParent = (parent != null);
/* 174 */     long parent_hwnd = (parent != null) ? getHwnd(parent) : 0L;
/* 175 */     this.hwnd = nCreateWindow(x, y, mode.getWidth(), mode.getHeight(), (Display.isFullscreen() || isUndecorated()), (parent != null), parent_hwnd);
/* 176 */     if (this.hwnd == 0L) {
/* 177 */       throw new LWJGLException("Failed to create window");
/*     */     }
/* 179 */     this.hdc = getDC(this.hwnd);
/* 180 */     if (this.hdc == 0L) {
/* 181 */       nDestroyWindow(this.hwnd);
/* 182 */       throw new LWJGLException("Failed to get dc");
/*     */     } 
/*     */     try {
/* 185 */       int format = WindowsPeerInfo.choosePixelFormat(getHdc(), 0, 0, this.peer_info.getPixelFormat(), (IntBuffer)null, true, true, false, true);
/* 186 */       WindowsPeerInfo.setPixelFormat(getHdc(), format);
/* 187 */       this.peer_info.initDC(getHwnd(), getHdc());
/* 188 */       showWindow(getHwnd(), 10);
/* 189 */       if (parent == null) {
/* 190 */         setForegroundWindow(getHwnd());
/* 191 */         setFocus(getHwnd());
/*     */       } 
/* 193 */     } catch (LWJGLException e) {
/* 194 */       nReleaseDC(this.hwnd, this.hdc);
/* 195 */       nDestroyWindow(this.hwnd);
/* 196 */       throw e;
/*     */     } 
/*     */   }
/*     */   private static native long nCreateWindow(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, long paramLong) throws LWJGLException;
/*     */   
/*     */   private static boolean isUndecorated() {
/* 202 */     return Display.getPrivilegedBoolean("org.lwjgl.opengl.Window.undecorated");
/*     */   }
/*     */   
/*     */   private static long getHwnd(Canvas parent) throws LWJGLException {
/* 206 */     AWTCanvasImplementation awt_impl = AWTGLCanvas.createImplementation();
/* 207 */     WindowsPeerInfo parent_peer_info = (WindowsPeerInfo)awt_impl.createPeerInfo(parent, null);
/* 208 */     ByteBuffer parent_peer_info_handle = parent_peer_info.lockAndGetHandle();
/*     */     try {
/* 210 */       return parent_peer_info.getHwnd();
/*     */     } finally {
/* 212 */       parent_peer_info.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void destroyWindow() {
/* 217 */     nReleaseDC(this.hwnd, this.hdc);
/* 218 */     nDestroyWindow(this.hwnd);
/* 219 */     freeLargeIcon();
/* 220 */     freeSmallIcon();
/* 221 */     resetCursorClipping();
/*     */   }
/*     */   private static native void nReleaseDC(long paramLong1, long paramLong2);
/*     */   
/*     */   static void resetCursorClipping() {
/* 226 */     if (cursor_clipped) {
/*     */       try {
/* 228 */         clipCursor(null);
/* 229 */       } catch (LWJGLException e) {
/* 230 */         LWJGLUtil.log("Failed to reset cursor clipping: " + e);
/*     */       } 
/* 232 */       cursor_clipped = false;
/*     */     } 
/*     */   }
/*     */   private static native void nDestroyWindow(long paramLong);
/*     */   private static void getGlobalClientRect(long hwnd, Rect rect) {
/* 237 */     rect_buffer.put(0, 0).put(1, 0);
/* 238 */     clientToScreen(hwnd, rect_buffer);
/* 239 */     int offset_x = rect_buffer.get(0);
/* 240 */     int offset_y = rect_buffer.get(1);
/* 241 */     getClientRect(hwnd, rect_buffer);
/* 242 */     rect.copyFromBuffer(rect_buffer);
/* 243 */     rect.offset(offset_x, offset_y);
/*     */   }
/*     */   
/*     */   static void setupCursorClipping(long hwnd) throws LWJGLException {
/* 247 */     cursor_clipped = true;
/* 248 */     getGlobalClientRect(hwnd, rect);
/* 249 */     rect.copyToBuffer(rect_buffer);
/* 250 */     clipCursor(rect_buffer);
/*     */   }
/*     */   private static native void clipCursor(IntBuffer paramIntBuffer) throws LWJGLException;
/*     */   
/*     */   public void switchDisplayMode(DisplayMode mode) throws LWJGLException {
/* 255 */     nSwitchDisplayMode(mode);
/* 256 */     this.current_mode = mode;
/* 257 */     this.mode_set = true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static native void nSwitchDisplayMode(DisplayMode paramDisplayMode) throws LWJGLException;
/*     */ 
/*     */   
/*     */   private void appActivate(boolean active) {
/* 265 */     if (this.inAppActivate) {
/*     */       return;
/*     */     }
/* 268 */     this.inAppActivate = true;
/* 269 */     this.isFocused = active;
/* 270 */     if (active) {
/* 271 */       if (Display.isFullscreen()) {
/* 272 */         restoreDisplayMode();
/*     */       }
/* 274 */       if (this.parent == null) {
/* 275 */         showWindow(getHwnd(), 9);
/* 276 */         setForegroundWindow(getHwnd());
/* 277 */         setFocus(getHwnd());
/*     */       } 
/* 279 */       this.did_maximize = true;
/* 280 */       if (Display.isFullscreen())
/* 281 */         updateClipping(); 
/* 282 */     } else if (Display.isFullscreen()) {
/* 283 */       showWindow(getHwnd(), 7);
/* 284 */       resetDisplayMode();
/*     */     } else {
/* 286 */       updateClipping();
/* 287 */     }  updateCursor();
/* 288 */     this.inAppActivate = false;
/*     */   }
/*     */   private static native void showWindow(long paramLong, int paramInt);
/*     */   private static native void setForegroundWindow(long paramLong);
/*     */   private static native void setFocus(long paramLong);
/*     */   
/*     */   private void restoreDisplayMode() {
/*     */     try {
/* 296 */       doSetGammaRamp(this.current_gamma);
/* 297 */     } catch (LWJGLException e) {
/* 298 */       LWJGLUtil.log("Failed to restore gamma: " + e.getMessage());
/*     */     } 
/*     */     
/* 301 */     if (!this.mode_set) {
/* 302 */       this.mode_set = true;
/*     */       try {
/* 304 */         nSwitchDisplayMode(this.current_mode);
/* 305 */       } catch (LWJGLException e) {
/* 306 */         LWJGLUtil.log("Failed to restore display mode: " + e.getMessage());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void resetDisplayMode() {
/*     */     try {
/* 313 */       doSetGammaRamp(this.saved_gamma);
/* 314 */     } catch (LWJGLException e) {
/* 315 */       LWJGLUtil.log("Failed to reset gamma ramp: " + e.getMessage());
/*     */     } 
/* 317 */     this.current_gamma = this.saved_gamma;
/* 318 */     if (this.mode_set) {
/* 319 */       this.mode_set = false;
/* 320 */       nResetDisplayMode();
/*     */     } 
/* 322 */     resetCursorClipping();
/*     */   }
/*     */   private static native void nResetDisplayMode();
/*     */   
/*     */   public int getGammaRampLength() {
/* 327 */     return 256;
/*     */   }
/*     */   
/*     */   public void setGammaRamp(FloatBuffer gammaRamp) throws LWJGLException {
/* 331 */     doSetGammaRamp(convertToNativeRamp(gammaRamp));
/*     */   }
/*     */   private static native ByteBuffer convertToNativeRamp(FloatBuffer paramFloatBuffer) throws LWJGLException;
/*     */   private static native ByteBuffer getCurrentGammaRamp() throws LWJGLException;
/*     */   
/*     */   private void doSetGammaRamp(ByteBuffer native_gamma) throws LWJGLException {
/* 337 */     nSetGammaRamp(native_gamma);
/* 338 */     this.current_gamma = native_gamma;
/*     */   }
/*     */   private static native void nSetGammaRamp(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public String getAdapter() {
/*     */     try {
/* 344 */       String maxObjNo = WindowsRegistry.queryRegistrationKey(3, "HARDWARE\\DeviceMap\\Video", "MaxObjectNumber");
/*     */ 
/*     */ 
/*     */       
/* 348 */       int maxObjectNumber = maxObjNo.charAt(0);
/* 349 */       String vga_driver_value = "";
/* 350 */       for (int i = 0; i < maxObjectNumber; i++) {
/* 351 */         String adapter_string = WindowsRegistry.queryRegistrationKey(3, "HARDWARE\\DeviceMap\\Video", "\\Device\\Video" + i);
/*     */ 
/*     */ 
/*     */         
/* 355 */         String root_key = "\\registry\\machine\\";
/* 356 */         if (adapter_string.toLowerCase().startsWith(root_key)) {
/* 357 */           String driver_value = WindowsRegistry.queryRegistrationKey(3, adapter_string.substring(root_key.length()), "InstalledDisplayDrivers");
/*     */ 
/*     */ 
/*     */           
/* 361 */           if (driver_value.toUpperCase().startsWith("VGA")) {
/* 362 */             vga_driver_value = driver_value;
/* 363 */           } else if (!driver_value.toUpperCase().startsWith("RDP") && !driver_value.toUpperCase().startsWith("NMNDD")) {
/* 364 */             return driver_value;
/*     */           } 
/*     */         } 
/*     */       } 
/* 368 */       if (!vga_driver_value.equals("")) {
/* 369 */         return vga_driver_value;
/*     */       }
/* 371 */     } catch (LWJGLException e) {
/* 372 */       LWJGLUtil.log("Exception occurred while querying registry: " + e);
/*     */     } 
/* 374 */     return null;
/*     */   }
/*     */   
/*     */   public String getVersion() {
/* 378 */     String driver = getAdapter();
/* 379 */     if (driver != null) {
/* 380 */       String[] drivers = driver.split(",");
/* 381 */       if (drivers.length > 0) {
/* 382 */         WindowsFileVersion version = nGetVersion(drivers[0] + ".dll");
/* 383 */         if (version != null)
/* 384 */           return version.toString(); 
/*     */       } 
/*     */     } 
/* 387 */     return null;
/*     */   }
/*     */   private native WindowsFileVersion nGetVersion(String paramString);
/*     */   
/*     */   public DisplayMode init() throws LWJGLException {
/* 392 */     this.current_gamma = this.saved_gamma = getCurrentGammaRamp();
/* 393 */     return this.current_mode = getCurrentDisplayMode();
/*     */   }
/*     */   private static native DisplayMode getCurrentDisplayMode() throws LWJGLException;
/*     */   
/*     */   public void setTitle(String title) {
/* 398 */     nSetTitle(this.hwnd, title);
/*     */   }
/*     */   private static native void nSetTitle(long paramLong, String paramString);
/*     */   
/*     */   public boolean isCloseRequested() {
/* 403 */     boolean saved = this.close_requested;
/* 404 */     this.close_requested = false;
/* 405 */     return saved;
/*     */   }
/*     */   
/*     */   public boolean isVisible() {
/* 409 */     return !this.isMinimized;
/*     */   }
/*     */   
/*     */   public boolean isActive() {
/* 413 */     return this.isFocused;
/*     */   }
/*     */   
/*     */   public boolean isDirty() {
/* 417 */     boolean saved = this.is_dirty;
/* 418 */     this.is_dirty = false;
/* 419 */     return saved;
/*     */   }
/*     */   
/*     */   public PeerInfo createPeerInfo(PixelFormat pixel_format) throws LWJGLException {
/* 423 */     this.peer_info = new WindowsDisplayPeerInfo(pixel_format);
/* 424 */     return this.peer_info;
/*     */   }
/*     */   
/*     */   public void update() {
/* 428 */     nUpdate();
/* 429 */     if (this.parent != null && this.parent.isFocusOwner()) {
/* 430 */       setFocus(getHwnd());
/*     */     }
/* 432 */     if (this.did_maximize) {
/* 433 */       this.did_maximize = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 440 */         if (Display.getDrawable().getContext() != null && Display.getDrawable().getContext().isCurrent())
/* 441 */           Display.getDrawable().getContext().makeCurrent(); 
/* 442 */       } catch (LWJGLException e) {
/* 443 */         LWJGLUtil.log("Exception occurred while trying to make context current: " + e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private static native void nUpdate();
/*     */   
/*     */   public void reshape(int x, int y, int width, int height) {
/* 450 */     nReshape(getHwnd(), x, y, width, height, (Display.isFullscreen() || isUndecorated()), (this.parent != null));
/*     */   }
/*     */   private static native void nReshape(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   public native DisplayMode[] getAvailableDisplayModes() throws LWJGLException;
/*     */   
/*     */   public boolean hasWheel() {
/* 457 */     return this.mouse.hasWheel();
/*     */   }
/*     */   
/*     */   public int getButtonCount() {
/* 461 */     return this.mouse.getButtonCount();
/*     */   }
/*     */   
/*     */   public void createMouse() throws LWJGLException {
/* 465 */     this.mouse = new WindowsMouse(getHwnd());
/*     */   }
/*     */   
/*     */   public void destroyMouse() {
/* 469 */     if (this.mouse != null)
/* 470 */       this.mouse.destroy(); 
/* 471 */     this.mouse = null;
/*     */   }
/*     */   
/*     */   public void pollMouse(IntBuffer coord_buffer, ByteBuffer buttons) {
/* 475 */     this.mouse.poll(coord_buffer, buttons);
/*     */   }
/*     */   
/*     */   public void readMouse(ByteBuffer buffer) {
/* 479 */     this.mouse.read(buffer);
/*     */   }
/*     */   
/*     */   public void grabMouse(boolean grab) {
/* 483 */     this.mouse.grab(grab, shouldGrab());
/* 484 */     updateCursor();
/*     */   }
/*     */   
/*     */   public int getNativeCursorCapabilities() {
/* 488 */     return 1;
/*     */   }
/*     */   
/*     */   public void setCursorPosition(int x, int y) {
/* 492 */     getGlobalClientRect(getHwnd(), rect);
/* 493 */     int transformed_x = rect.left + x;
/* 494 */     int transformed_y = rect.bottom - 1 - y;
/* 495 */     nSetCursorPosition(transformed_x, transformed_y);
/* 496 */     setMousePosition(x, y);
/*     */   }
/*     */   private static native void nSetCursorPosition(int paramInt1, int paramInt2);
/*     */   
/*     */   public void setNativeCursor(Object handle) throws LWJGLException {
/* 501 */     this.current_cursor = handle;
/* 502 */     updateCursor();
/*     */   }
/*     */   
/*     */   private void updateCursor() {
/*     */     try {
/* 507 */       if (this.mouse != null && shouldGrab())
/* 508 */       { nSetNativeCursor(getHwnd(), this.mouse.getBlankCursor()); }
/*     */       else
/* 510 */       { nSetNativeCursor(getHwnd(), this.current_cursor); } 
/* 511 */     } catch (LWJGLException e) {
/* 512 */       LWJGLUtil.log("Failed to update cursor: " + e);
/*     */     } 
/*     */   }
/*     */   static native void nSetNativeCursor(long paramLong, Object paramObject) throws LWJGLException;
/*     */   
/*     */   public int getMinCursorSize() {
/* 518 */     return getSystemMetrics(13);
/*     */   }
/*     */   
/*     */   public int getMaxCursorSize() {
/* 522 */     return getSystemMetrics(13);
/*     */   }
/*     */   
/*     */   static native int getSystemMetrics(int paramInt);
/*     */   
/*     */   private static native long getDllInstance();
/*     */   
/*     */   private long getHwnd() {
/* 530 */     return this.hwnd;
/*     */   }
/*     */   
/*     */   private long getHdc() {
/* 534 */     return this.hdc;
/*     */   }
/*     */   private static native long getDC(long paramLong);
/*     */   private static native long getDesktopWindow();
/*     */   
/*     */   private static native long getForegroundWindow();
/*     */   
/*     */   static void centerCursor(long hwnd) {
/* 542 */     if (getForegroundWindow() != hwnd && !hasParent)
/*     */       return; 
/* 544 */     getGlobalClientRect(hwnd, rect);
/* 545 */     int local_offset_x = rect.left;
/* 546 */     int local_offset_y = rect.top;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 551 */     int center_x = (rect.left + rect.right) / 2;
/* 552 */     int center_y = (rect.top + rect.bottom) / 2;
/* 553 */     nSetCursorPosition(center_x, center_y);
/* 554 */     int local_x = center_x - local_offset_x;
/* 555 */     int local_y = center_y - local_offset_y;
/* 556 */     if (current_display != null)
/* 557 */       current_display.setMousePosition(local_x, transformY(hwnd, local_y)); 
/*     */   }
/*     */   
/*     */   private void setMousePosition(int x, int y) {
/* 561 */     if (this.mouse != null) {
/* 562 */       this.mouse.setPosition(x, y);
/*     */     }
/*     */   }
/*     */   
/*     */   public void createKeyboard() throws LWJGLException {
/* 567 */     this.keyboard = new WindowsKeyboard(getHwnd());
/*     */   }
/*     */   
/*     */   public void destroyKeyboard() {
/* 571 */     this.keyboard.destroy();
/* 572 */     this.keyboard = null;
/*     */   }
/*     */   
/*     */   public void pollKeyboard(ByteBuffer keyDownBuffer) {
/* 576 */     this.keyboard.poll(keyDownBuffer);
/*     */   }
/*     */   
/*     */   public void readKeyboard(ByteBuffer buffer) {
/* 580 */     this.keyboard.read(buffer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static native ByteBuffer nCreateCursor(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, IntBuffer paramIntBuffer1, int paramInt6, IntBuffer paramIntBuffer2, int paramInt7) throws LWJGLException;
/*     */ 
/*     */   
/*     */   public Object createCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/* 588 */     return doCreateCursor(width, height, xHotspot, yHotspot, numImages, images, delays);
/*     */   }
/*     */   
/*     */   static Object doCreateCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/* 592 */     return nCreateCursor(width, height, xHotspot, yHotspot, numImages, images, images.position(), delays, (delays != null) ? delays.position() : -1);
/*     */   }
/*     */   
/*     */   public void destroyCursor(Object cursorHandle) {
/* 596 */     doDestroyCursor(cursorHandle);
/*     */   }
/*     */   
/*     */   static native void doDestroyCursor(Object paramObject);
/*     */   
/*     */   public int getPbufferCapabilities() {
/*     */     try {
/* 603 */       return nGetPbufferCapabilities(new PixelFormat(0, 0, 0, 0, 0, 0, 0, 0, false));
/* 604 */     } catch (LWJGLException e) {
/* 605 */       LWJGLUtil.log("Exception occurred while determining pbuffer capabilities: " + e);
/* 606 */       return 0;
/*     */     } 
/*     */   }
/*     */   private native int nGetPbufferCapabilities(PixelFormat paramPixelFormat) throws LWJGLException;
/*     */   
/*     */   public boolean isBufferLost(PeerInfo handle) {
/* 612 */     return ((WindowsPbufferPeerInfo)handle).isBufferLost();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public PeerInfo createPbuffer(int width, int height, PixelFormat pixel_format, IntBuffer pixelFormatCaps, IntBuffer pBufferAttribs) throws LWJGLException {
/* 618 */     return new WindowsPbufferPeerInfo(width, height, pixel_format, pixelFormatCaps, pBufferAttribs);
/*     */   }
/*     */   
/*     */   public void setPbufferAttrib(PeerInfo handle, int attrib, int value) {
/* 622 */     ((WindowsPbufferPeerInfo)handle).setPbufferAttrib(attrib, value);
/*     */   }
/*     */   
/*     */   public void bindTexImageToPbuffer(PeerInfo handle, int buffer) {
/* 626 */     ((WindowsPbufferPeerInfo)handle).bindTexImageToPbuffer(buffer);
/*     */   }
/*     */   
/*     */   public void releaseTexImageFromPbuffer(PeerInfo handle, int buffer) {
/* 630 */     ((WindowsPbufferPeerInfo)handle).releaseTexImageFromPbuffer(buffer);
/*     */   }
/*     */   
/*     */   private void freeSmallIcon() {
/* 634 */     if (this.small_icon != 0L) {
/* 635 */       destroyIcon(this.small_icon);
/* 636 */       this.small_icon = 0L;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void freeLargeIcon() {
/* 641 */     if (this.large_icon != 0L) {
/* 642 */       destroyIcon(this.large_icon);
/* 643 */       this.large_icon = 0L;
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
/*     */   public int setIcon(ByteBuffer[] icons) {
/* 660 */     boolean done_small = false;
/* 661 */     boolean done_large = false;
/* 662 */     int used = 0;
/*     */     
/* 664 */     int small_icon_size = 16;
/* 665 */     int large_icon_size = 32;
/* 666 */     for (int i = 0; i < icons.length; i++) {
/* 667 */       int size = icons[i].limit() / 4;
/*     */       
/* 669 */       if ((int)Math.sqrt(size) == small_icon_size && !done_small) {
/* 670 */         freeSmallIcon();
/* 671 */         this.small_icon = createIcon(small_icon_size, small_icon_size, icons[i].asIntBuffer());
/* 672 */         sendMessage(this.hwnd, 128L, 0L, this.small_icon);
/* 673 */         used++;
/* 674 */         done_small = true;
/*     */       } 
/* 676 */       if ((int)Math.sqrt(size) == large_icon_size && !done_large) {
/* 677 */         freeLargeIcon();
/* 678 */         this.large_icon = createIcon(large_icon_size, large_icon_size, icons[i].asIntBuffer());
/* 679 */         sendMessage(this.hwnd, 128L, 1L, this.large_icon);
/* 680 */         used++;
/* 681 */         done_large = true;
/*     */       } 
/*     */     } 
/*     */     
/* 685 */     return used;
/*     */   }
/*     */   private static native long createIcon(int paramInt1, int paramInt2, IntBuffer paramIntBuffer);
/*     */   private static native void destroyIcon(long paramLong);
/*     */   private static native long sendMessage(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   private void handleMouseButton(int button, int state, long millis) {
/* 692 */     if (this.mouse != null) {
/* 693 */       this.mouse.handleMouseButton((byte)button, (byte)state, millis);
/*     */ 
/*     */       
/* 696 */       if (this.captureMouse == -1 && button != -1 && state == 1) {
/* 697 */         this.captureMouse = button;
/* 698 */         nSetCapture(this.hwnd);
/*     */       } 
/*     */ 
/*     */       
/* 702 */       if (this.captureMouse != -1 && button == this.captureMouse && state == 0) {
/* 703 */         this.captureMouse = -1;
/* 704 */         nReleaseCapture();
/*     */       } 
/*     */     } 
/*     */     
/* 708 */     if (this.parent != null && !this.isFocused) {
/* 709 */       setFocus(getHwnd());
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean shouldGrab() {
/* 714 */     return (!this.isMinimized && this.isFocused && Mouse.isGrabbed());
/*     */   }
/*     */   
/*     */   private void handleMouseMoved(int x, int y, long millis) {
/* 718 */     if (this.mouse != null)
/* 719 */       this.mouse.handleMouseMoved(x, y, millis, shouldGrab()); 
/*     */   }
/*     */   
/*     */   private static native long nSetCapture(long paramLong);
/*     */   
/*     */   private static native boolean nReleaseCapture();
/*     */   
/*     */   private void handleMouseScrolled(int amount, long millis) {
/* 727 */     if (this.mouse != null)
/* 728 */       this.mouse.handleMouseScrolled(amount, millis); 
/*     */   }
/*     */   
/*     */   private static native void getClientRect(long paramLong, IntBuffer paramIntBuffer);
/*     */   
/*     */   private void handleChar(long wParam, long lParam, long millis) {
/* 734 */     byte previous_state = (byte)(int)(lParam >>> 30L & 0x1L);
/* 735 */     byte state = (byte)(int)(1L - (lParam >>> 31L & 0x1L));
/* 736 */     boolean repeat = (state == previous_state);
/* 737 */     if (this.keyboard != null)
/* 738 */       this.keyboard.handleChar((int)(wParam & 0xFFL), millis, repeat); 
/*     */   }
/*     */   
/*     */   private void handleKeyButton(long wParam, long lParam, long millis) {
/* 742 */     byte previous_state = (byte)(int)(lParam >>> 30L & 0x1L);
/* 743 */     byte state = (byte)(int)(1L - (lParam >>> 31L & 0x1L));
/* 744 */     boolean repeat = (state == previous_state);
/* 745 */     byte extended = (byte)(int)(lParam >>> 24L & 0x1L);
/* 746 */     int scan_code = (int)(lParam >>> 16L & 0xFFL);
/* 747 */     if (this.keyboard != null) {
/* 748 */       this.keyboard.handleKey((int)wParam, scan_code, (extended != 0), state, millis, repeat);
/*     */       
/* 750 */       if (this.captureMouse != -1 && this.keyboard.isKeyDown(1)) {
/* 751 */         nReleaseCapture();
/* 752 */         this.captureMouse = -1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int transformY(long hwnd, int y) {
/* 758 */     getClientRect(hwnd, rect_buffer);
/* 759 */     rect.copyFromBuffer(rect_buffer);
/* 760 */     return rect.bottom - rect.top - 1 - y;
/*     */   }
/*     */   
/*     */   private static native void clientToScreen(long paramLong, IntBuffer paramIntBuffer);
/*     */   
/*     */   private static int handleMessage(long hwnd, int msg, long wParam, long lParam, long millis) {
/* 766 */     if (current_display != null) {
/* 767 */       return current_display.doHandleMessage(hwnd, msg, wParam, lParam, millis);
/*     */     }
/* 769 */     return defWindowProc(hwnd, msg, wParam, lParam);
/*     */   }
/*     */   
/*     */   private static native int defWindowProc(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*     */   
/*     */   private void checkCursorState() {
/* 775 */     updateClipping();
/*     */   }
/*     */   
/*     */   private void updateClipping() {
/* 779 */     if ((Display.isFullscreen() || (this.mouse != null && this.mouse.isGrabbed())) && !this.isMinimized && this.isFocused && (getForegroundWindow() == getHwnd() || hasParent)) {
/*     */       try {
/* 781 */         setupCursorClipping(getHwnd());
/* 782 */       } catch (LWJGLException e) {
/* 783 */         LWJGLUtil.log("setupCursorClipping failed: " + e.getMessage());
/*     */       } 
/*     */     } else {
/* 786 */       resetCursorClipping();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setMinimized(boolean m) {
/* 791 */     this.isMinimized = m;
/* 792 */     checkCursorState(); } private int doHandleMessage(long hwnd, int msg, long wParam, long lParam, long millis) {
/*     */     int xPos;
/*     */     int yPos;
/*     */     int dwheel;
/* 796 */     switch (msg) {
/*     */       
/*     */       case 6:
/* 799 */         switch ((int)wParam) {
/*     */           case 1:
/*     */           case 2:
/* 802 */             appActivate(true);
/*     */             break;
/*     */           case 0:
/* 805 */             appActivate(false);
/*     */             break;
/*     */         } 
/* 808 */         return 0;
/*     */       case 5:
/* 810 */         switch ((int)wParam) {
/*     */           case 0:
/*     */           case 2:
/* 813 */             setMinimized(false);
/*     */             break;
/*     */           case 1:
/* 816 */             setMinimized(true);
/*     */             break;
/*     */         } 
/* 819 */         return defWindowProc(hwnd, msg, wParam, lParam);
/*     */       case 8:
/* 821 */         appActivate(false);
/* 822 */         return 0;
/*     */       case 7:
/* 824 */         appActivate(true);
/* 825 */         return 0;
/*     */       case 512:
/* 827 */         xPos = (short)(int)(lParam & 0xFFFFL);
/* 828 */         yPos = transformY(getHwnd(), (short)(int)(lParam >> 16L & 0xFFFFL));
/* 829 */         handleMouseMoved(xPos, yPos, millis);
/* 830 */         checkCursorState();
/* 831 */         this.mouseInside = true;
/* 832 */         if (!this.trackingMouse) {
/* 833 */           this.trackingMouse = nTrackMouseEvent(hwnd);
/*     */         }
/* 835 */         return 0;
/*     */       case 522:
/* 837 */         dwheel = (short)(int)(wParam >> 16L & 0xFFFFL);
/* 838 */         handleMouseScrolled(dwheel, millis);
/* 839 */         return 0;
/*     */       case 513:
/* 841 */         handleMouseButton(0, 1, millis);
/* 842 */         return 0;
/*     */       case 514:
/* 844 */         handleMouseButton(0, 0, millis);
/* 845 */         return 0;
/*     */       case 516:
/* 847 */         handleMouseButton(1, 1, millis);
/* 848 */         return 0;
/*     */       case 517:
/* 850 */         handleMouseButton(1, 0, millis);
/* 851 */         return 0;
/*     */       case 519:
/* 853 */         handleMouseButton(2, 1, millis);
/* 854 */         return 0;
/*     */       case 520:
/* 856 */         handleMouseButton(2, 0, millis);
/* 857 */         return 0;
/*     */       case 258:
/*     */       case 262:
/* 860 */         handleChar(wParam, lParam, millis);
/* 861 */         return 0;
/*     */ 
/*     */       
/*     */       case 257:
/*     */       case 261:
/* 866 */         if (wParam == 44L && this.keyboard != null && !this.keyboard.isKeyDown(183)) {
/*     */ 
/*     */           
/* 869 */           long fake_lparam = lParam & 0x7FFFFFFFL;
/*     */           
/* 871 */           fake_lparam &= 0xFFFFFFFFBFFFFFFFL;
/* 872 */           handleKeyButton(wParam, fake_lparam, millis);
/*     */         } 
/*     */ 
/*     */       
/*     */       case 256:
/*     */       case 260:
/* 878 */         handleKeyButton(wParam, lParam, millis);
/* 879 */         return defWindowProc(hwnd, msg, wParam, lParam);
/*     */       case 18:
/* 881 */         this.close_requested = true;
/* 882 */         return 0;
/*     */       case 274:
/* 884 */         switch ((int)(wParam & 0xFFF0L)) {
/*     */           case 61584:
/*     */           case 61696:
/*     */           case 61760:
/*     */           case 61808:
/* 889 */             return 0;
/*     */           case 61536:
/* 891 */             this.close_requested = true;
/* 892 */             return 0;
/*     */         } 
/*     */ 
/*     */         
/* 896 */         return defWindowProc(hwnd, msg, wParam, lParam);
/*     */       case 15:
/* 898 */         this.is_dirty = true;
/* 899 */         return defWindowProc(hwnd, msg, wParam, lParam);
/*     */       case 675:
/* 901 */         this.mouseInside = false;
/* 902 */         this.trackingMouse = false;
/* 903 */         return defWindowProc(hwnd, msg, wParam, lParam);
/*     */       case 31:
/* 905 */         nReleaseCapture();
/*     */       
/*     */       case 533:
/* 908 */         if (this.captureMouse != -1) {
/* 909 */           handleMouseButton(this.captureMouse, 0, millis);
/* 910 */           this.captureMouse = -1;
/*     */         } 
/* 912 */         return 0;
/*     */     } 
/* 914 */     return defWindowProc(hwnd, msg, wParam, lParam);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getWidth() {
/* 919 */     return Display.getDisplayMode().getWidth();
/*     */   }
/*     */   
/*     */   public int getHeight() {
/* 923 */     return Display.getDisplayMode().getHeight();
/*     */   }
/*     */   
/*     */   private int firstMouseButtonDown() {
/* 927 */     for (int i = 0; i < Mouse.getButtonCount(); i++) {
/* 928 */       if (Mouse.isButtonDown(i)) {
/* 929 */         return i;
/*     */       }
/*     */     } 
/* 932 */     return -1;
/*     */   }
/*     */   
/*     */   private native boolean nTrackMouseEvent(long paramLong);
/*     */   
/*     */   public boolean isInsideWindow() {
/* 938 */     return this.mouseInside;
/*     */   }
/*     */   private static final class Rect { public int top;
/*     */     public int bottom;
/*     */     public int left;
/*     */     public int right;
/*     */     
/*     */     private Rect() {}
/*     */     
/*     */     public void copyToBuffer(IntBuffer buffer) {
/* 948 */       buffer.put(0, this.top).put(1, this.bottom).put(2, this.left).put(3, this.right);
/*     */     }
/*     */     
/*     */     public void copyFromBuffer(IntBuffer buffer) {
/* 952 */       this.top = buffer.get(0);
/* 953 */       this.bottom = buffer.get(1);
/* 954 */       this.left = buffer.get(2);
/* 955 */       this.right = buffer.get(3);
/*     */     }
/*     */     
/*     */     public void offset(int offset_x, int offset_y) {
/* 959 */       this.left += offset_x;
/* 960 */       this.right += offset_x;
/* 961 */       this.top += offset_y;
/* 962 */       this.bottom += offset_y;
/*     */     }
/*     */     
/*     */     public static void intersect(Rect r1, Rect r2, Rect dst) {
/* 966 */       dst.top = Math.max(r1.top, r2.top);
/* 967 */       dst.bottom = Math.min(r1.bottom, r2.bottom);
/* 968 */       dst.left = Math.max(r1.left, r2.left);
/* 969 */       dst.right = Math.min(r1.right, r2.right);
/*     */     }
/*     */     
/*     */     public String toString() {
/* 973 */       return "Rect: top = " + this.top + " bottom = " + this.bottom + " left = " + this.left + " right = " + this.right;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsDisplay.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */