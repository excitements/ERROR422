/*      */ package org.lwjgl.opengl;
/*      */ 
/*      */ import java.awt.Canvas;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import org.lwjgl.BufferUtils;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.LWJGLUtil;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ final class LinuxDisplay
/*      */   implements DisplayImplementation
/*      */ {
/*      */   public static final int CurrentTime = 0;
/*      */   public static final int GrabSuccess = 0;
/*      */   public static final int AutoRepeatModeOff = 0;
/*      */   public static final int AutoRepeatModeOn = 1;
/*      */   public static final int AutoRepeatModeDefault = 2;
/*      */   public static final int None = 0;
/*      */   private static final int KeyPressMask = 1;
/*      */   private static final int KeyReleaseMask = 2;
/*      */   private static final int ButtonPressMask = 4;
/*      */   private static final int ButtonReleaseMask = 8;
/*      */   private static final int NotifyAncestor = 0;
/*      */   private static final int NotifyNonlinear = 3;
/*      */   private static final int NotifyPointer = 5;
/*      */   private static final int NotifyPointerRoot = 6;
/*      */   private static final int NotifyDetailNone = 7;
/*      */   private static final int SetModeInsert = 0;
/*      */   private static final int SaveSetRoot = 1;
/*      */   private static final int SaveSetUnmap = 1;
/*      */   private static final int FULLSCREEN_LEGACY = 1;
/*      */   private static final int FULLSCREEN_NETWM = 2;
/*      */   private static final int WINDOWED = 3;
/*   81 */   private static int current_window_mode = 3;
/*      */   
/*      */   private static final int XRANDR = 10;
/*      */   
/*      */   private static final int XF86VIDMODE = 11;
/*      */   
/*      */   private static final int NONE = 12;
/*      */   
/*      */   private static long display;
/*      */   
/*      */   private static long current_window;
/*      */   private static long saved_error_handler;
/*   93 */   private static int display_connection_usage_count = 0;
/*      */ 
/*      */   
/*   96 */   private final LinuxEvent event_buffer = new LinuxEvent();
/*   97 */   private final LinuxEvent tmp_event_buffer = new LinuxEvent();
/*      */ 
/*      */   
/*  100 */   private int current_displaymode_extension = 12;
/*      */   
/*      */   private long delete_atom;
/*      */   
/*      */   private PeerInfo peer_info;
/*      */   
/*      */   private ByteBuffer saved_gamma;
/*      */   
/*      */   private ByteBuffer current_gamma;
/*      */   
/*      */   private DisplayMode saved_mode;
/*      */   
/*      */   private DisplayMode current_mode;
/*      */   
/*      */   private XRandR.Screen[] savedXrandrConfig;
/*      */   
/*      */   private boolean keyboard_grabbed;
/*      */   
/*      */   private boolean pointer_grabbed;
/*      */   
/*      */   private boolean input_released;
/*      */   private boolean grab;
/*      */   private boolean focused;
/*      */   private boolean minimized;
/*      */   private boolean dirty;
/*      */   private boolean close_requested;
/*      */   private long current_cursor;
/*      */   private long blank_cursor;
/*      */   private Canvas parent;
/*      */   private long parent_window;
/*      */   private boolean xembedded;
/*      */   private boolean parent_focus;
/*      */   private LinuxKeyboard keyboard;
/*      */   private LinuxMouse mouse;
/*      */   
/*      */   private static ByteBuffer getCurrentGammaRamp() throws LWJGLException {
/*  136 */     lockAWT();
/*      */     try {
/*  138 */       incDisplay();
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  148 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native ByteBuffer nGetCurrentGammaRamp(long paramLong, int paramInt) throws LWJGLException;
/*      */   
/*      */   private static int getBestDisplayModeExtension() {
/*      */     int result;
/*  155 */     if (isXrandrSupported()) {
/*  156 */       LWJGLUtil.log("Using Xrandr for display mode switching");
/*  157 */       result = 10;
/*  158 */     } else if (isXF86VidModeSupported()) {
/*  159 */       LWJGLUtil.log("Using XF86VidMode for display mode switching");
/*  160 */       result = 11;
/*      */     } else {
/*  162 */       LWJGLUtil.log("No display mode extensions available");
/*  163 */       result = 12;
/*      */     } 
/*  165 */     return result;
/*      */   }
/*      */   
/*      */   private static boolean isXrandrSupported() {
/*  169 */     if (Display.getPrivilegedBoolean("LWJGL_DISABLE_XRANDR"))
/*  170 */       return false; 
/*  171 */     lockAWT();
/*      */     try {
/*  173 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  179 */     catch (LWJGLException e) {
/*  180 */       LWJGLUtil.log("Got exception while querying Xrandr support: " + e);
/*  181 */       return false;
/*      */     } finally {
/*  183 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native boolean nIsXrandrSupported(long paramLong) throws LWJGLException;
/*      */   
/*      */   private static boolean isXF86VidModeSupported() {
/*  189 */     lockAWT();
/*      */     try {
/*  191 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  197 */     catch (LWJGLException e) {
/*  198 */       LWJGLUtil.log("Got exception while querying XF86VM support: " + e);
/*  199 */       return false;
/*      */     } finally {
/*  201 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native boolean nIsXF86VidModeSupported(long paramLong) throws LWJGLException;
/*      */   
/*      */   private static boolean isNetWMFullscreenSupported() throws LWJGLException {
/*  207 */     if (Display.getPrivilegedBoolean("LWJGL_DISABLE_NETWM"))
/*  208 */       return false; 
/*  209 */     lockAWT();
/*      */     try {
/*  211 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  217 */     catch (LWJGLException e) {
/*  218 */       LWJGLUtil.log("Got exception while querying NetWM support: " + e);
/*  219 */       return false;
/*      */     } finally {
/*  221 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static native boolean nIsNetWMFullscreenSupported(long paramLong, int paramInt) throws LWJGLException;
/*      */ 
/*      */   
/*      */   static void lockAWT() {
/*      */     try {
/*  232 */       nLockAWT();
/*  233 */     } catch (LWJGLException e) {
/*  234 */       LWJGLUtil.log("Caught exception while locking AWT: " + e);
/*      */     } 
/*      */   }
/*      */   private static native void nLockAWT() throws LWJGLException;
/*      */   
/*      */   static void unlockAWT() {
/*      */     try {
/*  241 */       nUnlockAWT();
/*  242 */     } catch (LWJGLException e) {
/*  243 */       LWJGLUtil.log("Caught exception while unlocking AWT: " + e);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static native void nUnlockAWT() throws LWJGLException;
/*      */ 
/*      */   
/*      */   static void incDisplay() throws LWJGLException {
/*  252 */     if (display_connection_usage_count == 0) {
/*  253 */       GLContext.loadOpenGLLibrary();
/*  254 */       saved_error_handler = setErrorHandler();
/*  255 */       display = openDisplay();
/*      */     } 
/*      */     
/*  258 */     display_connection_usage_count++;
/*      */   }
/*      */   private static native int callErrorHandler(long paramLong1, long paramLong2, long paramLong3);
/*      */   private static native long setErrorHandler();
/*      */   private static native long resetErrorHandler(long paramLong);
/*      */   private static native void synchronize(long paramLong, boolean paramBoolean);
/*      */   
/*      */   private static int globalErrorHandler(long display, long event_ptr, long error_display, long serial, long error_code, long request_code, long minor_code) throws LWJGLException {
/*  266 */     if (display == getDisplay()) {
/*  267 */       String error_msg = getErrorText(display, error_code);
/*  268 */       throw new LWJGLException("X Error - disp: 0x" + Long.toHexString(error_display) + " serial: " + serial + " error: " + error_msg + " request_code: " + request_code + " minor_code: " + minor_code);
/*  269 */     }  if (saved_error_handler != 0L)
/*  270 */       return callErrorHandler(saved_error_handler, display, event_ptr); 
/*  271 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native String getErrorText(long paramLong1, long paramLong2);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void decDisplay() {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static native long openDisplay() throws LWJGLException;
/*      */ 
/*      */ 
/*      */   
/*      */   static native void closeDisplay(long paramLong);
/*      */ 
/*      */ 
/*      */   
/*      */   private int getWindowMode(boolean fullscreen) throws LWJGLException {
/*  296 */     if (fullscreen) {
/*  297 */       if (this.current_displaymode_extension == 10 && isNetWMFullscreenSupported()) {
/*  298 */         LWJGLUtil.log("Using NetWM for fullscreen window");
/*  299 */         return 2;
/*      */       } 
/*  301 */       LWJGLUtil.log("Using legacy mode for fullscreen window");
/*  302 */       return 1;
/*      */     } 
/*      */     
/*  305 */     return 3;
/*      */   }
/*      */   
/*      */   static long getDisplay() {
/*  309 */     if (display_connection_usage_count <= 0)
/*  310 */       throw new InternalError("display_connection_usage_count = " + display_connection_usage_count); 
/*  311 */     return display;
/*      */   }
/*      */   
/*      */   static int getDefaultScreen() {
/*  315 */     return nGetDefaultScreen(getDisplay());
/*      */   }
/*      */   static native int nGetDefaultScreen(long paramLong);
/*      */   
/*      */   static long getWindow() {
/*  320 */     return current_window;
/*      */   }
/*      */   
/*      */   private void ungrabKeyboard() {
/*  324 */     if (this.keyboard_grabbed) {
/*  325 */       nUngrabKeyboard(getDisplay());
/*  326 */       this.keyboard_grabbed = false;
/*      */     } 
/*      */   }
/*      */   static native int nUngrabKeyboard(long paramLong);
/*      */   
/*      */   private void grabKeyboard() {
/*  332 */     if (!this.keyboard_grabbed) {
/*  333 */       int res = nGrabKeyboard(getDisplay(), getWindow());
/*  334 */       if (res == 0)
/*  335 */         this.keyboard_grabbed = true; 
/*      */     } 
/*      */   }
/*      */   static native int nGrabKeyboard(long paramLong1, long paramLong2);
/*      */   
/*      */   private void grabPointer() {
/*  341 */     if (!this.pointer_grabbed) {
/*  342 */       int result = nGrabPointer(getDisplay(), getWindow(), 0L);
/*  343 */       if (result == 0) {
/*  344 */         this.pointer_grabbed = true;
/*      */         
/*  346 */         if (isLegacyFullscreen())
/*  347 */           nSetViewPort(getDisplay(), getWindow(), getDefaultScreen()); 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   static native int nGrabPointer(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private static native void nSetViewPort(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private void ungrabPointer() {
/*  356 */     if (this.pointer_grabbed) {
/*  357 */       this.pointer_grabbed = false;
/*  358 */       nUngrabPointer(getDisplay());
/*      */     } 
/*      */   }
/*      */   static native int nUngrabPointer(long paramLong);
/*      */   
/*      */   private boolean isFullscreen() {
/*  364 */     return (current_window_mode == 1 || current_window_mode == 2);
/*      */   }
/*      */   
/*      */   private boolean shouldGrab() {
/*  368 */     return (!this.input_released && this.grab && this.mouse != null);
/*      */   }
/*      */   
/*      */   private void updatePointerGrab() {
/*  372 */     if (isFullscreen() || shouldGrab()) {
/*  373 */       grabPointer();
/*      */     } else {
/*  375 */       ungrabPointer();
/*      */     } 
/*  377 */     updateCursor();
/*      */   }
/*      */   
/*      */   private void updateCursor() {
/*      */     long cursor;
/*  382 */     if (shouldGrab()) {
/*  383 */       cursor = this.blank_cursor;
/*      */     } else {
/*  385 */       cursor = this.current_cursor;
/*      */     } 
/*  387 */     nDefineCursor(getDisplay(), getWindow(), cursor);
/*      */   }
/*      */   private static native void nDefineCursor(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private boolean isLegacyFullscreen() {
/*  392 */     return (current_window_mode == 1);
/*      */   }
/*      */   
/*      */   private void updateKeyboardGrab() {
/*  396 */     if (isLegacyFullscreen()) {
/*  397 */       grabKeyboard();
/*      */     } else {
/*  399 */       ungrabKeyboard();
/*      */     } 
/*      */   }
/*      */   public void createWindow(DisplayMode mode, Canvas parent, int x, int y) throws LWJGLException {
/*  403 */     lockAWT();
/*      */     try {
/*  405 */       incDisplay();
/*      */       try {
/*  407 */         ByteBuffer handle = this.peer_info.lockAndGetHandle();
/*      */         try {
/*  409 */           current_window_mode = getWindowMode(Display.isFullscreen());
/*  410 */           boolean undecorated = (Display.getPrivilegedBoolean("org.lwjgl.opengl.Window.undecorated") || current_window_mode != 3);
/*  411 */           this.parent = parent;
/*  412 */           this.parent_window = (parent != null) ? getHandle(parent) : getRootWindow(getDisplay(), getDefaultScreen());
/*  413 */           current_window = nCreateWindow(getDisplay(), getDefaultScreen(), handle, mode, current_window_mode, x, y, undecorated, this.parent_window);
/*  414 */           mapRaised(getDisplay(), current_window);
/*  415 */           this.xembedded = (parent != null && isAncestorXEmbedded(this.parent_window));
/*  416 */           this.blank_cursor = createBlankCursor();
/*  417 */           this.current_cursor = 0L;
/*  418 */           this.focused = false;
/*  419 */           this.input_released = false;
/*  420 */           this.pointer_grabbed = false;
/*  421 */           this.keyboard_grabbed = false;
/*  422 */           this.close_requested = false;
/*  423 */           this.grab = false;
/*  424 */           this.minimized = false;
/*  425 */           this.dirty = true;
/*      */         } finally {
/*  427 */           this.peer_info.unlock();
/*      */         } 
/*  429 */       } catch (LWJGLException e) {
/*  430 */         decDisplay();
/*  431 */         throw e;
/*      */       } 
/*      */     } finally {
/*  434 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native long nCreateWindow(long paramLong1, int paramInt1, ByteBuffer paramByteBuffer, DisplayMode paramDisplayMode, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, long paramLong2) throws LWJGLException;
/*      */   private static native long getRootWindow(long paramLong, int paramInt);
/*      */   private static native boolean hasProperty(long paramLong1, long paramLong2, long paramLong3);
/*      */   private static native long getParentWindow(long paramLong1, long paramLong2) throws LWJGLException;
/*      */   private static native void mapRaised(long paramLong1, long paramLong2);
/*      */   private static native void reparentWindow(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*      */   
/*      */   private boolean isAncestorXEmbedded(long window) throws LWJGLException {
/*  445 */     long xembed_atom = internAtom("_XEMBED_INFO", true);
/*  446 */     if (xembed_atom != 0L) {
/*  447 */       long w = window;
/*  448 */       while (w != 0L) {
/*  449 */         if (hasProperty(getDisplay(), w, xembed_atom))
/*  450 */           return true; 
/*  451 */         w = getParentWindow(getDisplay(), w);
/*      */       } 
/*      */     } 
/*  454 */     return false;
/*      */   }
/*      */   
/*      */   private static long getHandle(Canvas parent) throws LWJGLException {
/*  458 */     AWTCanvasImplementation awt_impl = AWTGLCanvas.createImplementation();
/*  459 */     LinuxPeerInfo parent_peer_info = (LinuxPeerInfo)awt_impl.createPeerInfo(parent, null);
/*  460 */     ByteBuffer parent_peer_info_handle = parent_peer_info.lockAndGetHandle();
/*      */     try {
/*  462 */       return parent_peer_info.getDrawable();
/*      */     } finally {
/*  464 */       parent_peer_info.unlock();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void updateInputGrab() {
/*  469 */     updatePointerGrab();
/*  470 */     updateKeyboardGrab();
/*      */   }
/*      */   
/*      */   public void destroyWindow() {
/*  474 */     lockAWT();
/*      */     try {
/*      */       try {
/*  477 */         setNativeCursor(null);
/*  478 */       } catch (LWJGLException e) {
/*  479 */         LWJGLUtil.log("Failed to reset cursor: " + e.getMessage());
/*      */       } 
/*  481 */       nDestroyCursor(getDisplay(), this.blank_cursor);
/*  482 */       this.blank_cursor = 0L;
/*  483 */       ungrabKeyboard();
/*  484 */       nDestroyWindow(getDisplay(), getWindow());
/*  485 */       decDisplay();
/*      */     } finally {
/*  487 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   static native void nDestroyWindow(long paramLong1, long paramLong2);
/*      */   
/*      */   public void switchDisplayMode(DisplayMode mode) throws LWJGLException {
/*  493 */     lockAWT();
/*      */     try {
/*  495 */       switchDisplayModeOnTmpDisplay(mode);
/*  496 */       this.current_mode = mode;
/*      */     } finally {
/*  498 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void switchDisplayModeOnTmpDisplay(DisplayMode mode) throws LWJGLException {
/*  503 */     incDisplay();
/*      */     try {
/*  505 */       nSwitchDisplayMode(getDisplay(), getDefaultScreen(), this.current_displaymode_extension, mode);
/*      */     } finally {
/*  507 */       decDisplay();
/*      */     } 
/*      */   }
/*      */   private static native void nSwitchDisplayMode(long paramLong, int paramInt1, int paramInt2, DisplayMode paramDisplayMode) throws LWJGLException;
/*      */   
/*      */   private static long internAtom(String atom_name, boolean only_if_exists) throws LWJGLException {
/*  513 */     incDisplay();
/*      */     try {
/*  515 */       return nInternAtom(getDisplay(), atom_name, only_if_exists);
/*      */     } finally {
/*  517 */       decDisplay();
/*      */     } 
/*      */   }
/*      */   static native long nInternAtom(long paramLong, String paramString, boolean paramBoolean);
/*      */   
/*      */   public void resetDisplayMode() {
/*  523 */     lockAWT();
/*      */     try {
/*  525 */       if (this.current_displaymode_extension == 10 && this.savedXrandrConfig.length > 0) {
/*      */         
/*  527 */         XRandR.setConfiguration(this.savedXrandrConfig);
/*      */       }
/*      */       else {
/*      */         
/*  531 */         switchDisplayMode(this.saved_mode);
/*      */       } 
/*  533 */       if (isXF86VidModeSupported())
/*  534 */         doSetGamma(this.saved_gamma); 
/*  535 */     } catch (LWJGLException e) {
/*  536 */       LWJGLUtil.log("Caught exception while resetting mode: " + e);
/*      */     } finally {
/*  538 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public int getGammaRampLength() {
/*  543 */     if (!isXF86VidModeSupported())
/*  544 */       return 0; 
/*  545 */     lockAWT();
/*      */     
/*      */     try {
/*  548 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  557 */     catch (LWJGLException e) {
/*  558 */       LWJGLUtil.log("Failed to get gamma ramp length: " + e);
/*  559 */       return 0;
/*      */     } finally {
/*      */       
/*  562 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native int nGetGammaRampLength(long paramLong, int paramInt) throws LWJGLException;
/*      */   
/*      */   public void setGammaRamp(FloatBuffer gammaRamp) throws LWJGLException {
/*  568 */     if (!isXF86VidModeSupported())
/*  569 */       throw new LWJGLException("No gamma ramp support (Missing XF86VM extension)"); 
/*  570 */     doSetGamma(convertToNativeRamp(gammaRamp));
/*      */   }
/*      */   
/*      */   private void doSetGamma(ByteBuffer native_gamma) throws LWJGLException {
/*  574 */     lockAWT();
/*      */     try {
/*  576 */       setGammaRampOnTmpDisplay(native_gamma);
/*  577 */       this.current_gamma = native_gamma;
/*      */     } finally {
/*  579 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void setGammaRampOnTmpDisplay(ByteBuffer native_gamma) throws LWJGLException {
/*  584 */     incDisplay();
/*      */     try {
/*  586 */       nSetGammaRamp(getDisplay(), getDefaultScreen(), native_gamma);
/*      */     } finally {
/*  588 */       decDisplay();
/*      */     } 
/*      */   }
/*      */   private static native void nSetGammaRamp(long paramLong, int paramInt, ByteBuffer paramByteBuffer) throws LWJGLException;
/*      */   
/*      */   private static ByteBuffer convertToNativeRamp(FloatBuffer ramp) throws LWJGLException {
/*  594 */     return nConvertToNativeRamp(ramp, ramp.position(), ramp.remaining());
/*      */   }
/*      */   private static native ByteBuffer nConvertToNativeRamp(FloatBuffer paramFloatBuffer, int paramInt1, int paramInt2) throws LWJGLException;
/*      */   
/*      */   public String getAdapter() {
/*  599 */     return null;
/*      */   }
/*      */   
/*      */   public String getVersion() {
/*  603 */     return null;
/*      */   }
/*      */   
/*      */   public DisplayMode init() throws LWJGLException {
/*  607 */     lockAWT(); 
/*      */     try { DisplayMode displayMode;
/*  609 */       this.delete_atom = internAtom("WM_DELETE_WINDOW", false);
/*  610 */       this.current_displaymode_extension = getBestDisplayModeExtension();
/*  611 */       if (this.current_displaymode_extension == 12)
/*  612 */         throw new LWJGLException("No display mode extension is available"); 
/*  613 */       DisplayMode[] modes = getAvailableDisplayModes();
/*  614 */       if (modes == null || modes.length == 0)
/*  615 */         throw new LWJGLException("No modes available"); 
/*  616 */       switch (this.current_displaymode_extension)
/*      */       { case 10:
/*  618 */           this.savedXrandrConfig = XRandR.getConfiguration();
/*  619 */           this.saved_mode = getCurrentXRandrMode();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  627 */           this.current_mode = this.saved_mode;
/*  628 */           this.saved_gamma = getCurrentGammaRamp();
/*  629 */           this.current_gamma = this.saved_gamma;
/*  630 */           displayMode = this.saved_mode;
/*      */           
/*  632 */           return displayMode;case 11: this.saved_mode = modes[0]; this.current_mode = this.saved_mode; this.saved_gamma = getCurrentGammaRamp(); this.current_gamma = this.saved_gamma; displayMode = this.saved_mode; return displayMode; }  throw new LWJGLException("Unknown display mode extension: " + this.current_displaymode_extension); } finally { unlockAWT(); }
/*      */   
/*      */   }
/*      */   
/*      */   private static DisplayMode getCurrentXRandrMode() throws LWJGLException {
/*  637 */     lockAWT();
/*      */     try {
/*  639 */       incDisplay();
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */       
/*  646 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static native DisplayMode nGetCurrentXRandrMode(long paramLong, int paramInt) throws LWJGLException;
/*      */   
/*      */   public void setTitle(String title) {
/*  654 */     lockAWT();
/*      */     try {
/*  656 */       nSetTitle(getDisplay(), getWindow(), title);
/*      */     } finally {
/*  658 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native void nSetTitle(long paramLong1, long paramLong2, String paramString);
/*      */   
/*      */   public boolean isCloseRequested() {
/*  664 */     boolean result = this.close_requested;
/*  665 */     this.close_requested = false;
/*  666 */     return result;
/*      */   }
/*      */   
/*      */   public boolean isVisible() {
/*  670 */     return !this.minimized;
/*      */   }
/*      */   
/*      */   public boolean isActive() {
/*  674 */     return (this.focused || isLegacyFullscreen());
/*      */   }
/*      */   
/*      */   public boolean isDirty() {
/*  678 */     boolean result = this.dirty;
/*  679 */     this.dirty = false;
/*  680 */     return result;
/*      */   }
/*      */   
/*      */   public PeerInfo createPeerInfo(PixelFormat pixel_format) throws LWJGLException {
/*  684 */     this.peer_info = new LinuxDisplayPeerInfo(pixel_format);
/*  685 */     return this.peer_info;
/*      */   }
/*      */   
/*      */   static native void setInputFocus(long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   private void relayEventToParent(LinuxEvent event_buffer, int event_mask) {
/*  691 */     this.tmp_event_buffer.copyFrom(event_buffer);
/*  692 */     this.tmp_event_buffer.setWindow(this.parent_window);
/*  693 */     this.tmp_event_buffer.sendEvent(getDisplay(), this.parent_window, true, event_mask);
/*      */   }
/*      */   
/*      */   private void relayEventToParent(LinuxEvent event_buffer) {
/*  697 */     if (this.parent == null)
/*      */       return; 
/*  699 */     switch (event_buffer.getType()) {
/*      */       case 2:
/*  701 */         relayEventToParent(event_buffer, 1);
/*      */         break;
/*      */       case 3:
/*  704 */         relayEventToParent(event_buffer, 1);
/*      */         break;
/*      */       case 4:
/*  707 */         relayEventToParent(event_buffer, 1);
/*      */         break;
/*      */       case 5:
/*  710 */         relayEventToParent(event_buffer, 1);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void processEvents() {
/*  718 */     while (LinuxEvent.getPending(getDisplay()) > 0) {
/*  719 */       this.event_buffer.nextEvent(getDisplay());
/*  720 */       long event_window = this.event_buffer.getWindow();
/*  721 */       relayEventToParent(this.event_buffer);
/*  722 */       if (event_window != getWindow() || this.event_buffer.filterEvent(event_window) || (this.mouse != null && this.mouse.filterEvent(this.grab, shouldWarpPointer(), this.event_buffer)) || (this.keyboard != null && this.keyboard.filterEvent(this.event_buffer))) {
/*      */         continue;
/*      */       }
/*      */       
/*  726 */       switch (this.event_buffer.getType()) {
/*      */         case 9:
/*  728 */           setFocused(true, this.event_buffer.getFocusDetail());
/*      */         
/*      */         case 10:
/*  731 */           setFocused(false, this.event_buffer.getFocusDetail());
/*      */         
/*      */         case 33:
/*  734 */           if (this.event_buffer.getClientFormat() == 32 && this.event_buffer.getClientData(0) == this.delete_atom) {
/*  735 */             this.close_requested = true;
/*      */           }
/*      */         case 19:
/*  738 */           this.dirty = true;
/*  739 */           this.minimized = false;
/*      */         
/*      */         case 18:
/*  742 */           this.dirty = true;
/*  743 */           this.minimized = true;
/*      */         
/*      */         case 12:
/*  746 */           this.dirty = true;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void update() {
/*  755 */     lockAWT();
/*      */     try {
/*  757 */       processEvents();
/*  758 */       checkInput();
/*      */     } finally {
/*  760 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void reshape(int x, int y, int width, int height) {
/*  765 */     lockAWT();
/*      */     try {
/*  767 */       nReshape(getDisplay(), getWindow(), x, y, width, height);
/*      */     } finally {
/*  769 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native void nReshape(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   public DisplayMode[] getAvailableDisplayModes() throws LWJGLException {
/*  775 */     lockAWT();
/*      */     try {
/*  777 */       incDisplay();
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */ 
/*      */       
/*  785 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static native DisplayMode[] nGetAvailableDisplayModes(long paramLong, int paramInt1, int paramInt2) throws LWJGLException;
/*      */   
/*      */   public boolean hasWheel() {
/*  792 */     return true;
/*      */   }
/*      */   
/*      */   public int getButtonCount() {
/*  796 */     return this.mouse.getButtonCount();
/*      */   }
/*      */   
/*      */   public void createMouse() throws LWJGLException {
/*  800 */     lockAWT();
/*      */     try {
/*  802 */       this.mouse = new LinuxMouse(getDisplay(), getWindow(), getWindow());
/*      */     } finally {
/*  804 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void destroyMouse() {
/*  809 */     this.mouse = null;
/*  810 */     updateInputGrab();
/*      */   }
/*      */   
/*      */   public void pollMouse(IntBuffer coord_buffer, ByteBuffer buttons) {
/*  814 */     lockAWT();
/*      */     try {
/*  816 */       this.mouse.poll(this.grab, coord_buffer, buttons);
/*      */     } finally {
/*  818 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void readMouse(ByteBuffer buffer) {
/*  823 */     lockAWT();
/*      */     try {
/*  825 */       this.mouse.read(buffer);
/*      */     } finally {
/*  827 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void setCursorPosition(int x, int y) {
/*  832 */     lockAWT();
/*      */     try {
/*  834 */       this.mouse.setCursorPosition(x, y);
/*      */     } finally {
/*  836 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void checkInput() {
/*  841 */     if (this.parent == null)
/*      */       return; 
/*  843 */     if (this.parent_focus != this.parent.hasFocus()) {
/*  844 */       this.parent_focus = this.parent.hasFocus();
/*      */       
/*  846 */       if (this.parent_focus) {
/*  847 */         setInputFocusUnsafe(current_window);
/*      */       }
/*  849 */       else if (this.xembedded) {
/*  850 */         setInputFocusUnsafe(0L);
/*      */       }
/*      */     
/*  853 */     } else if (this.parent_focus && !this.focused) {
/*  854 */       setInputFocusUnsafe(current_window);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void setFocused(boolean got_focus, int focus_detail) {
/*  859 */     if (this.focused == got_focus || focus_detail == 7 || focus_detail == 5 || focus_detail == 6)
/*      */       return; 
/*  861 */     this.focused = got_focus;
/*      */     
/*  863 */     if (this.focused) {
/*  864 */       acquireInput();
/*      */     } else {
/*      */       
/*  867 */       releaseInput();
/*      */     } 
/*      */   }
/*      */   static native long nGetInputFocus(long paramLong);
/*      */   
/*      */   private void setInputFocusUnsafe(long window) {
/*      */     try {
/*  874 */       setInputFocus(getDisplay(), window, 0L);
/*  875 */       sync(getDisplay(), false);
/*  876 */     } catch (LWJGLException e) {
/*      */       
/*  878 */       LWJGLUtil.log("Got exception while trying to focus: " + e);
/*      */     } 
/*      */   }
/*      */   private static native void sync(long paramLong, boolean paramBoolean) throws LWJGLException;
/*      */   
/*      */   private void releaseInput() {
/*  884 */     if (isLegacyFullscreen() || this.input_released)
/*      */       return; 
/*  886 */     this.input_released = true;
/*  887 */     updateInputGrab();
/*  888 */     if (current_window_mode == 2) {
/*  889 */       nIconifyWindow(getDisplay(), getWindow(), getDefaultScreen());
/*      */       try {
/*  891 */         if (this.current_displaymode_extension == 10 && this.savedXrandrConfig.length > 0) {
/*      */           
/*  893 */           XRandR.setConfiguration(this.savedXrandrConfig);
/*      */         }
/*      */         else {
/*      */           
/*  897 */           switchDisplayModeOnTmpDisplay(this.saved_mode);
/*      */         } 
/*  899 */         setGammaRampOnTmpDisplay(this.saved_gamma);
/*  900 */       } catch (LWJGLException e) {
/*  901 */         LWJGLUtil.log("Failed to restore saved mode: " + e.getMessage());
/*      */       } 
/*      */     } 
/*      */   }
/*      */   private static native void nIconifyWindow(long paramLong1, long paramLong2, int paramInt);
/*      */   
/*      */   private void acquireInput() {
/*  908 */     if (isLegacyFullscreen() || !this.input_released)
/*      */       return; 
/*  910 */     this.input_released = false;
/*  911 */     updateInputGrab();
/*  912 */     if (current_window_mode == 2) {
/*      */       try {
/*  914 */         switchDisplayModeOnTmpDisplay(this.current_mode);
/*  915 */         setGammaRampOnTmpDisplay(this.current_gamma);
/*  916 */       } catch (LWJGLException e) {
/*  917 */         LWJGLUtil.log("Failed to restore mode: " + e.getMessage());
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public void grabMouse(boolean new_grab) {
/*  923 */     lockAWT();
/*      */     try {
/*  925 */       if (new_grab != this.grab) {
/*  926 */         this.grab = new_grab;
/*  927 */         updateInputGrab();
/*  928 */         this.mouse.changeGrabbed(this.grab, shouldWarpPointer());
/*      */       } 
/*      */     } finally {
/*  931 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean shouldWarpPointer() {
/*  936 */     return (this.pointer_grabbed && shouldGrab());
/*      */   }
/*      */   
/*      */   public int getNativeCursorCapabilities() {
/*  940 */     lockAWT();
/*      */     try {
/*  942 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  948 */     catch (LWJGLException e) {
/*  949 */       throw new RuntimeException(e);
/*      */     } finally {
/*  951 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native int nGetNativeCursorCapabilities(long paramLong) throws LWJGLException;
/*      */   
/*      */   public void setNativeCursor(Object handle) throws LWJGLException {
/*  957 */     this.current_cursor = getCursorHandle(handle);
/*  958 */     lockAWT();
/*      */     try {
/*  960 */       updateCursor();
/*      */     } finally {
/*  962 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public int getMinCursorSize() {
/*  967 */     lockAWT();
/*      */     try {
/*  969 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  975 */     catch (LWJGLException e) {
/*  976 */       LWJGLUtil.log("Exception occurred in getMinCursorSize: " + e);
/*  977 */       return 0;
/*      */     } finally {
/*  979 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native int nGetMinCursorSize(long paramLong1, long paramLong2);
/*      */   
/*      */   public int getMaxCursorSize() {
/*  985 */     lockAWT();
/*      */     try {
/*  987 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  993 */     catch (LWJGLException e) {
/*  994 */       LWJGLUtil.log("Exception occurred in getMaxCursorSize: " + e);
/*  995 */       return 0;
/*      */     } finally {
/*  997 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static native int nGetMaxCursorSize(long paramLong1, long paramLong2);
/*      */   
/*      */   public void createKeyboard() throws LWJGLException {
/* 1004 */     lockAWT();
/*      */     try {
/* 1006 */       this.keyboard = new LinuxKeyboard(getDisplay(), getWindow());
/*      */     } finally {
/* 1008 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void destroyKeyboard() {
/* 1013 */     lockAWT();
/*      */     try {
/* 1015 */       this.keyboard.destroy(getDisplay());
/* 1016 */       this.keyboard = null;
/*      */     } finally {
/* 1018 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void pollKeyboard(ByteBuffer keyDownBuffer) {
/* 1023 */     lockAWT();
/*      */     try {
/* 1025 */       this.keyboard.poll(keyDownBuffer);
/*      */     } finally {
/* 1027 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void readKeyboard(ByteBuffer buffer) {
/* 1032 */     lockAWT();
/*      */     try {
/* 1034 */       this.keyboard.read(buffer);
/*      */     } finally {
/* 1036 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static native long nCreateCursor(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, IntBuffer paramIntBuffer1, int paramInt6, IntBuffer paramIntBuffer2, int paramInt7) throws LWJGLException;
/*      */   
/*      */   private static long createBlankCursor() {
/* 1043 */     return nCreateBlankCursor(getDisplay(), getWindow());
/*      */   }
/*      */   static native long nCreateBlankCursor(long paramLong1, long paramLong2);
/*      */   
/*      */   public Object createCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/* 1048 */     lockAWT();
/*      */     try {
/* 1050 */       incDisplay();
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */ 
/*      */       
/* 1059 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static long getCursorHandle(Object cursor_handle) {
/* 1064 */     return (cursor_handle != null) ? ((Long)cursor_handle).longValue() : 0L;
/*      */   }
/*      */   
/*      */   public void destroyCursor(Object cursorHandle) {
/* 1068 */     lockAWT();
/*      */     try {
/* 1070 */       nDestroyCursor(getDisplay(), getCursorHandle(cursorHandle));
/* 1071 */       decDisplay();
/*      */     } finally {
/* 1073 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   static native void nDestroyCursor(long paramLong1, long paramLong2);
/*      */   
/*      */   public int getPbufferCapabilities() {
/* 1079 */     lockAWT();
/*      */     try {
/* 1081 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1087 */     catch (LWJGLException e) {
/* 1088 */       LWJGLUtil.log("Exception occurred in getPbufferCapabilities: " + e);
/* 1089 */       return 0;
/*      */     } finally {
/* 1091 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   private static native int nGetPbufferCapabilities(long paramLong, int paramInt);
/*      */   
/*      */   public boolean isBufferLost(PeerInfo handle) {
/* 1097 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public PeerInfo createPbuffer(int width, int height, PixelFormat pixel_format, IntBuffer pixelFormatCaps, IntBuffer pBufferAttribs) throws LWJGLException {
/* 1103 */     return new LinuxPbufferPeerInfo(width, height, pixel_format);
/*      */   }
/*      */   
/*      */   public void setPbufferAttrib(PeerInfo handle, int attrib, int value) {
/* 1107 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*      */   public void bindTexImageToPbuffer(PeerInfo handle, int buffer) {
/* 1111 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*      */   public void releaseTexImageFromPbuffer(PeerInfo handle, int buffer) {
/* 1115 */     throw new UnsupportedOperationException();
/*      */   }
/*      */   
/*      */   private static ByteBuffer convertIcon(ByteBuffer icon, int width, int height) {
/* 1119 */     ByteBuffer icon_rgb = BufferUtils.createByteBuffer(icon.capacity());
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1124 */     int depth = 4;
/*      */     
/* 1126 */     for (int y = 0; y < height; y++) {
/* 1127 */       for (int x = 0; x < width; x++) {
/* 1128 */         byte r = icon.get(x * 4 + y * width * 4);
/* 1129 */         byte g = icon.get(x * 4 + y * width * 4 + 1);
/* 1130 */         byte b = icon.get(x * 4 + y * width * 4 + 2);
/*      */         
/* 1132 */         icon_rgb.put(x * depth + y * width * depth, b);
/* 1133 */         icon_rgb.put(x * depth + y * width * depth + 1, g);
/* 1134 */         icon_rgb.put(x * depth + y * width * depth + 2, r);
/*      */       } 
/*      */     } 
/* 1137 */     return icon_rgb;
/*      */   }
/*      */   
/*      */   private static ByteBuffer convertIconMask(ByteBuffer icon, int width, int height) {
/* 1141 */     ByteBuffer icon_mask = BufferUtils.createByteBuffer(icon.capacity() / 4 / 8);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1146 */     int depth = 4;
/*      */     
/* 1148 */     for (int y = 0; y < height; y++) {
/* 1149 */       for (int x = 0; x < width; x++) {
/* 1150 */         byte a = icon.get(x * 4 + y * width * 4 + 3);
/*      */         
/* 1152 */         int mask_index = x + y * width;
/* 1153 */         int mask_byte_index = mask_index / 8;
/* 1154 */         int mask_bit_index = mask_index % 8;
/* 1155 */         byte bit = ((a & 0xFF) >= 127) ? 1 : 0;
/* 1156 */         byte new_byte = (byte)((icon_mask.get(mask_byte_index) | bit << mask_bit_index) & 0xFF);
/* 1157 */         icon_mask.put(mask_byte_index, new_byte);
/*      */       } 
/*      */     } 
/* 1160 */     return icon_mask;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int setIcon(ByteBuffer[] icons) {
/* 1176 */     lockAWT();
/*      */     try {
/* 1178 */       incDisplay();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1194 */     catch (LWJGLException e) {
/* 1195 */       LWJGLUtil.log("Failed to set display icon: " + e);
/* 1196 */       return 0;
/*      */     } finally {
/* 1198 */       unlockAWT();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static native void nSetWindowIcon(long paramLong1, long paramLong2, ByteBuffer paramByteBuffer1, int paramInt1, ByteBuffer paramByteBuffer2, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   public int getWidth() {
/* 1205 */     return Display.getDisplayMode().getWidth();
/*      */   }
/*      */   
/*      */   public int getHeight() {
/* 1209 */     return Display.getDisplayMode().getHeight();
/*      */   }
/*      */   
/*      */   public boolean isInsideWindow() {
/* 1213 */     return true;
/*      */   }
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxDisplay.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */