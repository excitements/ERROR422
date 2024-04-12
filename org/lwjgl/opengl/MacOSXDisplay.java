/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import com.apple.eawt.Application;
/*     */ import com.apple.eawt.ApplicationAdapter;
/*     */ import com.apple.eawt.ApplicationEvent;
/*     */ import com.apple.eawt.ApplicationListener;
/*     */ import java.awt.Canvas;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.DisplayMode;
/*     */ import java.awt.Robot;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.security.PrivilegedExceptionAction;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
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
/*     */ final class MacOSXDisplay
/*     */   implements DisplayImplementation
/*     */ {
/*     */   private static final int PBUFFER_HANDLE_SIZE = 24;
/*     */   private static final int GAMMA_LENGTH = 256;
/*     */   private MacOSXCanvasListener canvas_listener;
/*     */   private MacOSXFrame frame;
/*     */   private Canvas canvas;
/*     */   private Robot robot;
/*     */   private MacOSXMouseEventQueue mouse_queue;
/*     */   private KeyboardEventQueue keyboard_queue;
/*     */   private DisplayMode requested_mode;
/*     */   private boolean close_requested;
/*     */   
/*     */   MacOSXDisplay() {
/*     */     try {
/*  78 */       AccessController.doPrivileged(new PrivilegedExceptionAction() {
/*     */             public Object run() throws Exception {
/*  80 */               Application.getApplication().addApplicationListener((ApplicationListener)new ApplicationAdapter() {
/*     */                     public final void handleQuit(ApplicationEvent event) {
/*  82 */                       MacOSXDisplay.null.access$000(MacOSXDisplay.null.this).doHandleQuit();
/*     */                     } private final MacOSXDisplay.null this$1;
/*     */                   });
/*  85 */               return null;
/*     */             } private final MacOSXDisplay this$0;
/*     */           });
/*  88 */     } catch (Throwable e) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  93 */       LWJGLUtil.log("Failed to register quit handler: " + e.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void createWindow(DisplayMode mode, Canvas parent, int x, int y) throws LWJGLException {
/*  98 */     boolean fullscreen = Display.isFullscreen();
/*  99 */     hideUI(fullscreen);
/* 100 */     this.close_requested = false;
/*     */     try {
/* 102 */       if (parent == null) {
/* 103 */         this.frame = new MacOSXFrame(mode, this.requested_mode, fullscreen, x, y);
/* 104 */         this.canvas = this.frame.getCanvas();
/*     */       } else {
/* 106 */         this.frame = null;
/* 107 */         this.canvas = parent;
/*     */       } 
/* 109 */       this.canvas_listener = new MacOSXCanvasListener(this.canvas);
/* 110 */       this.robot = AWTUtil.createRobot(this.canvas);
/* 111 */     } catch (LWJGLException e) {
/* 112 */       destroyWindow();
/* 113 */       throw e;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void doHandleQuit() {
/* 118 */     synchronized (this) {
/* 119 */       this.close_requested = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void destroyWindow() {
/* 124 */     if (this.canvas_listener != null) {
/* 125 */       this.canvas_listener.disableListeners();
/* 126 */       this.canvas_listener = null;
/*     */     } 
/* 128 */     if (this.frame != null) {
/* 129 */       AccessController.doPrivileged(new PrivilegedAction() { private final MacOSXDisplay this$0;
/*     */             public Object run() {
/* 131 */               if (MacOSXFrame.getDevice().getFullScreenWindow() == MacOSXDisplay.this.frame)
/* 132 */                 MacOSXFrame.getDevice().setFullScreenWindow(null); 
/* 133 */               return null;
/*     */             } }
/*     */         );
/* 136 */       if (this.frame.isDisplayable())
/* 137 */         this.frame.dispose(); 
/* 138 */       this.frame = null;
/*     */     } 
/* 140 */     hideUI(false);
/*     */   }
/*     */   
/*     */   public int getGammaRampLength() {
/* 144 */     return 256;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAdapter() {
/* 150 */     return null;
/*     */   }
/*     */   
/*     */   public String getVersion() {
/* 154 */     return null;
/*     */   }
/*     */   
/*     */   private boolean equals(DisplayMode awt_mode, DisplayMode mode) {
/* 158 */     return (awt_mode.getWidth() == mode.getWidth() && awt_mode.getHeight() == mode.getHeight() && awt_mode.getBitDepth() == mode.getBitsPerPixel() && awt_mode.getRefreshRate() == mode.getFrequency());
/*     */   }
/*     */ 
/*     */   
/*     */   public void switchDisplayMode(DisplayMode mode) throws LWJGLException {
/* 163 */     DisplayMode[] awt_modes = MacOSXFrame.getDevice().getDisplayModes();
/* 164 */     for (int i = 0; i < awt_modes.length; i++) {
/* 165 */       if (equals(awt_modes[i], mode)) {
/* 166 */         this.requested_mode = awt_modes[i]; return;
/*     */       } 
/*     */     } 
/* 169 */     throw new LWJGLException(mode + " is not supported");
/*     */   }
/*     */   
/*     */   public void resetDisplayMode() {
/* 173 */     if (MacOSXFrame.getDevice().getFullScreenWindow() != null)
/* 174 */       MacOSXFrame.getDevice().setFullScreenWindow(null); 
/* 175 */     this.requested_mode = null;
/* 176 */     restoreGamma();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private DisplayMode createLWJGLDisplayMode(DisplayMode awt_mode) {
/* 184 */     int bit_depth, refresh_rate, awt_bit_depth = awt_mode.getBitDepth();
/* 185 */     int awt_refresh_rate = awt_mode.getRefreshRate();
/* 186 */     if (awt_bit_depth != -1) {
/* 187 */       bit_depth = awt_bit_depth;
/*     */     } else {
/* 189 */       bit_depth = 32;
/* 190 */     }  if (awt_refresh_rate != 0) {
/* 191 */       refresh_rate = awt_refresh_rate;
/*     */     } else {
/* 193 */       refresh_rate = 0;
/* 194 */     }  return new DisplayMode(awt_mode.getWidth(), awt_mode.getHeight(), bit_depth, refresh_rate);
/*     */   }
/*     */   
/*     */   public DisplayMode init() throws LWJGLException {
/* 198 */     return createLWJGLDisplayMode(MacOSXFrame.getDevice().getDisplayMode());
/*     */   }
/*     */   
/*     */   public DisplayMode[] getAvailableDisplayModes() throws LWJGLException {
/* 202 */     DisplayMode[] awt_modes = MacOSXFrame.getDevice().getDisplayModes();
/* 203 */     List modes = new ArrayList();
/* 204 */     for (int i = 0; i < awt_modes.length; i++) {
/* 205 */       if (awt_modes[i].getBitDepth() >= 16)
/* 206 */         modes.add(createLWJGLDisplayMode(awt_modes[i])); 
/* 207 */     }  DisplayMode[] mode_list = new DisplayMode[modes.size()];
/* 208 */     modes.toArray(mode_list);
/* 209 */     return mode_list;
/*     */   }
/*     */   
/*     */   public void setTitle(String title) {
/* 213 */     if (this.frame != null)
/* 214 */       this.frame.setTitle(title); 
/*     */   }
/*     */   
/*     */   public boolean isCloseRequested() {
/*     */     boolean result;
/* 219 */     synchronized (this) {
/* 220 */       result = (this.close_requested || (this.frame != null && this.frame.syncIsCloseRequested()));
/* 221 */       this.close_requested = false;
/*     */     } 
/* 223 */     return result;
/*     */   }
/*     */   
/*     */   public boolean isVisible() {
/* 227 */     return (this.frame == null || this.frame.syncIsVisible());
/*     */   }
/*     */   
/*     */   public boolean isActive() {
/* 231 */     return this.canvas.isFocusOwner();
/*     */   }
/*     */   
/*     */   public Canvas getCanvas() {
/* 235 */     return this.canvas;
/*     */   }
/*     */   
/*     */   public boolean isDirty() {
/* 239 */     return (this.frame != null && this.frame.getCanvas().syncIsDirty());
/*     */   }
/*     */   
/*     */   public PeerInfo createPeerInfo(PixelFormat pixel_format) throws LWJGLException {
/*     */     try {
/* 244 */       return new MacOSXDisplayPeerInfo(pixel_format, true);
/* 245 */     } catch (LWJGLException e) {
/* 246 */       return new MacOSXDisplayPeerInfo(pixel_format, false);
/*     */     } 
/*     */   }
/*     */   
/* 250 */   private static final IntBuffer current_viewport = BufferUtils.createIntBuffer(16);
/*     */   public void update() {
/* 252 */     boolean should_update = this.canvas_listener.syncShouldUpdateContext();
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
/* 274 */     if (Display.isFullscreen() && ((this.frame != null && this.frame.getCanvas().syncCanvasPainted()) || should_update)) {
/*     */       try {
/* 276 */         MacOSXContextImplementation.resetView(Display.getDrawable().getContext().getPeerInfo(), Display.getDrawable().getContext());
/* 277 */       } catch (LWJGLException e) {
/* 278 */         LWJGLUtil.log("Failed to reset context: " + e);
/*     */       } 
/*     */     }
/* 281 */     if (should_update) {
/* 282 */       Display.getDrawable().getContext().update();
/*     */       
/* 284 */       GL11.glGetInteger(2978, current_viewport);
/* 285 */       GL11.glViewport(current_viewport.get(0), current_viewport.get(1), current_viewport.get(2), current_viewport.get(3));
/*     */     } 
/* 287 */     if (this.frame != null && this.mouse_queue != null) {
/* 288 */       if (this.frame.syncShouldReleaseCursor())
/* 289 */         MacOSXMouseEventQueue.nGrabMouse(false); 
/* 290 */       if (this.frame.syncShouldWarpCursor()) {
/* 291 */         this.mouse_queue.warpCursor();
/*     */       }
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
/*     */   private void hideUI(boolean hide) {
/* 305 */     if (!LWJGLUtil.isMacOSXEqualsOrBetterThan(10, 4)) {
/* 306 */       nHideUI(hide);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void reshape(int x, int y, int width, int height) {
/* 312 */     if (this.frame != null) {
/* 313 */       this.frame.resize(x, y, width, height);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean hasWheel() {
/* 318 */     return AWTUtil.hasWheel();
/*     */   }
/*     */   
/*     */   public int getButtonCount() {
/* 322 */     return AWTUtil.getButtonCount();
/*     */   }
/*     */   
/*     */   public void createMouse() throws LWJGLException {
/* 326 */     this.mouse_queue = new MacOSXMouseEventQueue(this.canvas);
/* 327 */     this.mouse_queue.register();
/*     */   }
/*     */   
/*     */   public void destroyMouse() {
/* 331 */     if (this.mouse_queue != null) {
/* 332 */       MacOSXMouseEventQueue.nGrabMouse(false);
/* 333 */       this.mouse_queue.unregister();
/*     */     } 
/* 335 */     this.mouse_queue = null;
/*     */   }
/*     */   
/*     */   public void pollMouse(IntBuffer coord_buffer, ByteBuffer buttons_buffer) {
/* 339 */     this.mouse_queue.poll(coord_buffer, buttons_buffer);
/*     */   }
/*     */   
/*     */   public void readMouse(ByteBuffer buffer) {
/* 343 */     this.mouse_queue.copyEvents(buffer);
/*     */   }
/*     */   
/*     */   public void grabMouse(boolean grab) {
/* 347 */     this.mouse_queue.setGrabbed(grab);
/*     */   }
/*     */   
/*     */   public int getNativeCursorCapabilities() {
/* 351 */     return AWTUtil.getNativeCursorCapabilities();
/*     */   }
/*     */   
/*     */   public void setCursorPosition(int x, int y) {
/* 355 */     AWTUtil.setCursorPosition(this.canvas, this.robot, x, y);
/*     */   }
/*     */   
/*     */   public void setNativeCursor(Object handle) throws LWJGLException {
/* 359 */     Cursor awt_cursor = (Cursor)handle;
/* 360 */     if (this.frame != null)
/* 361 */       this.frame.setCursor(awt_cursor); 
/*     */   }
/*     */   
/*     */   public int getMinCursorSize() {
/* 365 */     return AWTUtil.getMinCursorSize();
/*     */   }
/*     */   
/*     */   public int getMaxCursorSize() {
/* 369 */     return AWTUtil.getMaxCursorSize();
/*     */   }
/*     */ 
/*     */   
/*     */   public void createKeyboard() throws LWJGLException {
/* 374 */     this.keyboard_queue = new KeyboardEventQueue(this.canvas);
/* 375 */     this.keyboard_queue.register();
/*     */   }
/*     */   
/*     */   public void destroyKeyboard() {
/* 379 */     if (this.keyboard_queue != null)
/* 380 */       this.keyboard_queue.unregister(); 
/* 381 */     this.keyboard_queue = null;
/*     */   }
/*     */   
/*     */   public void pollKeyboard(ByteBuffer keyDownBuffer) {
/* 385 */     this.keyboard_queue.poll(keyDownBuffer);
/*     */   }
/*     */   
/*     */   public void readKeyboard(ByteBuffer buffer) {
/* 389 */     this.keyboard_queue.copyEvents(buffer);
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
/*     */   
/*     */   public Object createCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/* 418 */     return AWTUtil.createCursor(width, height, xHotspot, yHotspot, numImages, images, delays);
/*     */   }
/*     */ 
/*     */   
/*     */   public void destroyCursor(Object cursor_handle) {}
/*     */   
/*     */   public int getPbufferCapabilities() {
/* 425 */     if (LWJGLUtil.isMacOSXEqualsOrBetterThan(10, 3)) {
/* 426 */       return 1;
/*     */     }
/* 428 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean isBufferLost(PeerInfo handle) {
/* 432 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public PeerInfo createPbuffer(int width, int height, PixelFormat pixel_format, IntBuffer pixelFormatCaps, IntBuffer pBufferAttribs) throws LWJGLException {
/* 438 */     return new MacOSXPbufferPeerInfo(width, height, pixel_format);
/*     */   }
/*     */   
/*     */   public void setPbufferAttrib(PeerInfo handle, int attrib, int value) {
/* 442 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void bindTexImageToPbuffer(PeerInfo handle, int buffer) {
/* 446 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void releaseTexImageFromPbuffer(PeerInfo handle, int buffer) {
/* 450 */     throw new UnsupportedOperationException();
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
/*     */   public int setIcon(ByteBuffer[] icons) {
/* 494 */     return 0;
/*     */   }
/*     */   
/*     */   public int getWidth() {
/* 498 */     return Display.getDisplayMode().getWidth();
/*     */   }
/*     */   
/*     */   public int getHeight() {
/* 502 */     return Display.getDisplayMode().getHeight();
/*     */   }
/*     */   
/*     */   public boolean isInsideWindow() {
/* 506 */     return true;
/*     */   }
/*     */   
/*     */   public native void setGammaRamp(FloatBuffer paramFloatBuffer) throws LWJGLException;
/*     */   
/*     */   private native void restoreGamma();
/*     */   
/*     */   private native void nHideUI(boolean paramBoolean);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXDisplay.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */