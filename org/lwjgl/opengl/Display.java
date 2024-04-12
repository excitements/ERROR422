/*      */ package org.lwjgl.opengl;
/*      */ 
/*      */ import java.awt.Canvas;
/*      */ import java.awt.event.ComponentAdapter;
/*      */ import java.awt.event.ComponentEvent;
/*      */ import java.awt.event.ComponentListener;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.security.AccessController;
/*      */ import java.security.PrivilegedAction;
/*      */ import java.util.Arrays;
/*      */ import java.util.HashSet;
/*      */ import org.lwjgl.BufferUtils;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.LWJGLUtil;
/*      */ import org.lwjgl.Sys;
/*      */ import org.lwjgl.input.Controllers;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
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
/*      */ public final class Display
/*      */ {
/*   67 */   private static final Thread shutdown_hook = new Thread() {
/*      */       public void run() {
/*   69 */         Display.reset();
/*      */       }
/*      */     };
/*      */ 
/*      */ 
/*      */   
/*      */   private static final DisplayImplementation display_impl;
/*      */ 
/*      */   
/*      */   private static final DisplayMode initial_mode;
/*      */ 
/*      */   
/*      */   private static Canvas parent;
/*      */ 
/*      */   
/*      */   private static DisplayMode current_mode;
/*      */ 
/*      */   
/*      */   private static long timeThen;
/*      */   
/*   89 */   private static int x = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static ByteBuffer[] cached_icons;
/*      */ 
/*      */ 
/*      */   
/*   98 */   private static int y = -1;
/*      */ 
/*      */   
/*  101 */   private static String title = "Game";
/*      */ 
/*      */   
/*      */   private static boolean fullscreen;
/*      */ 
/*      */   
/*      */   private static int swap_interval;
/*      */ 
/*      */   
/*      */   private static PeerInfo peer_info;
/*      */ 
/*      */   
/*      */   private static Context context;
/*      */   
/*      */   private static final Drawable drawable;
/*      */   
/*      */   private static boolean window_created = false;
/*      */   
/*      */   private static boolean parent_resized;
/*      */   
/*  121 */   private static float r = 0.0F; private static float g = 0.0F; private static float b = 0.0F;
/*      */   
/*  123 */   private static ComponentListener component_listener = new ComponentAdapter() {
/*      */       public void componentResized(ComponentEvent e) {
/*  125 */         synchronized (GlobalLock.lock) {
/*  126 */           Display.parent_resized = true;
/*      */         } 
/*      */       }
/*      */     };
/*      */   
/*      */   static {
/*  132 */     Sys.initialize();
/*  133 */     display_impl = createDisplayImplementation();
/*      */     try {
/*  135 */       current_mode = initial_mode = display_impl.init();
/*  136 */       LWJGLUtil.log("Initial mode: " + initial_mode);
/*  137 */     } catch (LWJGLException e) {
/*  138 */       throw new RuntimeException(e);
/*      */     } 
/*  140 */     drawable = new Drawable() {
/*      */         public Context getContext() {
/*  142 */           synchronized (GlobalLock.lock) {
/*  143 */             return Display.isCreated() ? Display.context : null;
/*      */           } 
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static long timeLate;
/*      */ 
/*      */   
/*      */   public static Drawable getDrawable() {
/*  155 */     return drawable;
/*      */   }
/*      */   
/*      */   private static DisplayImplementation createDisplayImplementation() {
/*  159 */     switch (LWJGLUtil.getPlatform()) {
/*      */       case 1:
/*  161 */         return new LinuxDisplay();
/*      */       case 3:
/*  163 */         return new WindowsDisplay();
/*      */       case 2:
/*  165 */         return new MacOSXDisplay();
/*      */     } 
/*  167 */     throw new IllegalStateException("Unsupported platform");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DisplayMode[] getAvailableDisplayModes() throws LWJGLException {
/*  191 */     synchronized (GlobalLock.lock) {
/*  192 */       DisplayMode[] unfilteredModes = display_impl.getAvailableDisplayModes();
/*      */       
/*  194 */       if (unfilteredModes == null) {
/*  195 */         return new DisplayMode[0];
/*      */       }
/*      */ 
/*      */       
/*  199 */       HashSet modes = new HashSet(unfilteredModes.length);
/*      */       
/*  201 */       modes.addAll(Arrays.asList(unfilteredModes));
/*  202 */       DisplayMode[] filteredModes = new DisplayMode[modes.size()];
/*  203 */       modes.toArray((Object[])filteredModes);
/*      */       
/*  205 */       LWJGLUtil.log("Removed " + (unfilteredModes.length - filteredModes.length) + " duplicate displaymodes");
/*      */       
/*  207 */       return filteredModes;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DisplayMode getDesktopDisplayMode() {
/*  217 */     return initial_mode;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DisplayMode getDisplayMode() {
/*  226 */     return current_mode;
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
/*      */   public static void setDisplayMode(DisplayMode mode) throws LWJGLException {
/*  241 */     synchronized (GlobalLock.lock) {
/*  242 */       if (mode == null)
/*  243 */         throw new NullPointerException("mode must be non-null"); 
/*  244 */       boolean was_fullscreen = isFullscreen();
/*  245 */       current_mode = mode;
/*  246 */       if (isCreated()) {
/*  247 */         destroyWindow();
/*      */         
/*      */         try {
/*  250 */           if (was_fullscreen && !isFullscreen()) {
/*  251 */             display_impl.resetDisplayMode();
/*  252 */           } else if (isFullscreen()) {
/*  253 */             switchDisplayMode();
/*  254 */           }  createWindow();
/*  255 */           makeCurrentAndSetSwapInterval();
/*  256 */         } catch (LWJGLException e) {
/*  257 */           destroyContext();
/*  258 */           destroyPeerInfo();
/*  259 */           display_impl.resetDisplayMode();
/*  260 */           throw e;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static DisplayMode getEffectiveMode() {
/*  267 */     return (!isFullscreen() && parent != null) ? new DisplayMode(parent.getWidth(), parent.getHeight()) : current_mode;
/*      */   }
/*      */   
/*      */   private static int getWindowX() {
/*  271 */     if (!isFullscreen() && parent == null) {
/*      */       
/*  273 */       if (x == -1) {
/*  274 */         return Math.max(0, (initial_mode.getWidth() - current_mode.getWidth()) / 2);
/*      */       }
/*  276 */       return x;
/*      */     } 
/*      */     
/*  279 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   private static int getWindowY() {
/*  284 */     if (!isFullscreen() && parent == null) {
/*      */       
/*  286 */       if (y == -1) {
/*  287 */         return Math.max(0, (initial_mode.getHeight() - current_mode.getHeight()) / 2);
/*      */       }
/*  289 */       return y;
/*      */     } 
/*      */     
/*  292 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void createWindow() throws LWJGLException {
/*  301 */     if (window_created) {
/*      */       return;
/*      */     }
/*  304 */     Canvas tmp_parent = isFullscreen() ? null : parent;
/*  305 */     if (tmp_parent != null && !tmp_parent.isDisplayable())
/*  306 */       throw new LWJGLException("Parent.isDisplayable() must be true"); 
/*  307 */     if (tmp_parent != null) {
/*  308 */       tmp_parent.addComponentListener(component_listener);
/*      */     }
/*  310 */     DisplayMode mode = getEffectiveMode();
/*  311 */     display_impl.createWindow(mode, tmp_parent, getWindowX(), getWindowY());
/*  312 */     window_created = true;
/*      */     
/*  314 */     setTitle(title);
/*  315 */     initControls();
/*      */ 
/*      */     
/*  318 */     if (cached_icons != null) {
/*  319 */       setIcon(cached_icons);
/*      */     } else {
/*  321 */       setIcon(new ByteBuffer[] { LWJGLUtil.LWJGLIcon32x32, LWJGLUtil.LWJGLIcon16x16 });
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void releaseDrawable() {
/*      */     try {
/*  327 */       if (context != null && context.isCurrent()) {
/*  328 */         Context.releaseCurrentContext();
/*  329 */         context.releaseDrawable();
/*      */       } 
/*  331 */     } catch (LWJGLException e) {
/*  332 */       LWJGLUtil.log("Exception occurred while trying to release context: " + e);
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void destroyWindow() {
/*  337 */     if (!window_created) {
/*      */       return;
/*      */     }
/*  340 */     if (parent != null) {
/*  341 */       parent.removeComponentListener(component_listener);
/*      */     }
/*  343 */     releaseDrawable();
/*      */ 
/*      */     
/*  346 */     if (Mouse.isCreated()) {
/*  347 */       Mouse.destroy();
/*      */     }
/*  349 */     if (Keyboard.isCreated()) {
/*  350 */       Keyboard.destroy();
/*      */     }
/*  352 */     display_impl.destroyWindow();
/*  353 */     window_created = false;
/*      */   }
/*      */   
/*      */   private static void switchDisplayMode() throws LWJGLException {
/*  357 */     if (!current_mode.isFullscreenCapable()) {
/*  358 */       throw new IllegalStateException("Only modes acquired from getAvailableDisplayModes() can be used for fullscreen display");
/*      */     }
/*  360 */     display_impl.switchDisplayMode(current_mode);
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
/*      */   public static void setDisplayConfiguration(float gamma, float brightness, float contrast) throws LWJGLException {
/*  372 */     synchronized (GlobalLock.lock) {
/*  373 */       if (!isCreated()) {
/*  374 */         throw new LWJGLException("Display not yet created.");
/*      */       }
/*  376 */       if (brightness < -1.0F || brightness > 1.0F)
/*  377 */         throw new IllegalArgumentException("Invalid brightness value"); 
/*  378 */       if (contrast < 0.0F)
/*  379 */         throw new IllegalArgumentException("Invalid contrast value"); 
/*  380 */       int rampSize = display_impl.getGammaRampLength();
/*  381 */       if (rampSize == 0) {
/*  382 */         throw new LWJGLException("Display configuration not supported");
/*      */       }
/*  384 */       FloatBuffer gammaRamp = BufferUtils.createFloatBuffer(rampSize);
/*  385 */       for (int i = 0; i < rampSize; i++) {
/*  386 */         float intensity = i / (rampSize - 1);
/*      */         
/*  388 */         float rampEntry = (float)Math.pow(intensity, gamma);
/*      */         
/*  390 */         rampEntry += brightness;
/*      */         
/*  392 */         rampEntry = (rampEntry - 0.5F) * contrast + 0.5F;
/*      */         
/*  394 */         if (rampEntry > 1.0F) {
/*  395 */           rampEntry = 1.0F;
/*  396 */         } else if (rampEntry < 0.0F) {
/*  397 */           rampEntry = 0.0F;
/*  398 */         }  gammaRamp.put(i, rampEntry);
/*      */       } 
/*  400 */       display_impl.setGammaRamp(gammaRamp);
/*  401 */       LWJGLUtil.log("Gamma set, gamma = " + gamma + ", brightness = " + brightness + ", contrast = " + contrast);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void sync(int fps) {
/*      */     long timeNow;
/*      */     long gapTo;
/*      */     long savedTimeLate;
/*  416 */     synchronized (GlobalLock.lock) {
/*  417 */       gapTo = Sys.getTimerResolution() / fps + timeThen;
/*  418 */       timeNow = Sys.getTime();
/*  419 */       savedTimeLate = timeLate;
/*      */     } 
/*      */     
/*  422 */     while (gapTo > timeNow + savedTimeLate) {
/*      */       try {
/*  424 */         Thread.sleep(1L);
/*  425 */       } catch (InterruptedException e) {}
/*      */       
/*  427 */       timeNow = Sys.getTime();
/*      */     } 
/*      */     
/*  430 */     synchronized (GlobalLock.lock) {
/*  431 */       if (gapTo < timeNow) {
/*  432 */         timeLate = timeNow - gapTo;
/*      */       } else {
/*  434 */         timeLate = 0L;
/*      */       } 
/*  436 */       timeThen = timeNow;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getTitle() {
/*  442 */     synchronized (GlobalLock.lock) {
/*  443 */       return title;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static Canvas getParent() {
/*  449 */     synchronized (GlobalLock.lock) {
/*  450 */       return parent;
/*      */     } 
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
/*      */   public static void setParent(Canvas parent) throws LWJGLException {
/*  465 */     synchronized (GlobalLock.lock) {
/*  466 */       if (Display.parent != parent) {
/*  467 */         Display.parent = parent;
/*  468 */         if (!isCreated())
/*      */           return; 
/*  470 */         destroyWindow();
/*      */         try {
/*  472 */           if (isFullscreen()) {
/*  473 */             switchDisplayMode();
/*      */           } else {
/*  475 */             display_impl.resetDisplayMode();
/*      */           } 
/*  477 */           createWindow();
/*  478 */           makeCurrentAndSetSwapInterval();
/*  479 */         } catch (LWJGLException e) {
/*  480 */           destroyContext();
/*  481 */           destroyPeerInfo();
/*  482 */           display_impl.resetDisplayMode();
/*  483 */           throw e;
/*      */         } 
/*      */       } 
/*      */     } 
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
/*      */   public static void setFullscreen(boolean fullscreen) throws LWJGLException {
/*  502 */     setDisplayModeAndFullscreenInternal(fullscreen, current_mode);
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
/*      */   public static void setDisplayModeAndFullscreen(DisplayMode mode) throws LWJGLException {
/*  517 */     setDisplayModeAndFullscreenInternal(mode.isFullscreenCapable(), mode);
/*      */   }
/*      */   
/*      */   private static void setDisplayModeAndFullscreenInternal(boolean fullscreen, DisplayMode mode) throws LWJGLException {
/*  521 */     synchronized (GlobalLock.lock) {
/*  522 */       if (mode == null)
/*  523 */         throw new NullPointerException("mode must be non-null"); 
/*  524 */       DisplayMode old_mode = current_mode;
/*  525 */       current_mode = mode;
/*  526 */       boolean was_fullscreen = isFullscreen();
/*  527 */       Display.fullscreen = fullscreen;
/*  528 */       if (was_fullscreen != isFullscreen() || !mode.equals(old_mode)) {
/*  529 */         if (!isCreated())
/*      */           return; 
/*  531 */         destroyWindow();
/*      */         try {
/*  533 */           if (isFullscreen()) {
/*  534 */             switchDisplayMode();
/*      */           } else {
/*  536 */             display_impl.resetDisplayMode();
/*      */           } 
/*  538 */           createWindow();
/*  539 */           makeCurrentAndSetSwapInterval();
/*  540 */         } catch (LWJGLException e) {
/*  541 */           destroyContext();
/*  542 */           destroyPeerInfo();
/*  543 */           display_impl.resetDisplayMode();
/*  544 */           throw e;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isFullscreen() {
/*  552 */     synchronized (GlobalLock.lock) {
/*  553 */       return (fullscreen && current_mode.isFullscreenCapable());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setTitle(String newTitle) {
/*  563 */     synchronized (GlobalLock.lock) {
/*  564 */       if (newTitle == null) {
/*  565 */         newTitle = "";
/*      */       }
/*  567 */       title = newTitle;
/*  568 */       if (isCreated()) {
/*  569 */         display_impl.setTitle(title);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public static boolean isCloseRequested() {
/*  575 */     synchronized (GlobalLock.lock) {
/*  576 */       if (!isCreated())
/*  577 */         throw new IllegalStateException("Cannot determine close requested state of uncreated window"); 
/*  578 */       return display_impl.isCloseRequested();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isVisible() {
/*  584 */     synchronized (GlobalLock.lock) {
/*  585 */       if (!isCreated())
/*  586 */         throw new IllegalStateException("Cannot determine minimized state of uncreated window"); 
/*  587 */       return display_impl.isVisible();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isActive() {
/*  593 */     synchronized (GlobalLock.lock) {
/*  594 */       if (!isCreated())
/*  595 */         throw new IllegalStateException("Cannot determine focused state of uncreated window"); 
/*  596 */       return display_impl.isActive();
/*      */     } 
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
/*      */   public static boolean isDirty() {
/*  611 */     synchronized (GlobalLock.lock) {
/*  612 */       if (!isCreated())
/*  613 */         throw new IllegalStateException("Cannot determine dirty state of uncreated window"); 
/*  614 */       return display_impl.isDirty();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void processMessages() {
/*  624 */     synchronized (GlobalLock.lock) {
/*  625 */       if (!isCreated()) {
/*  626 */         throw new IllegalStateException("Display not created");
/*      */       }
/*  628 */       display_impl.update();
/*      */     } 
/*  630 */     pollDevices();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void swapBuffers() throws LWJGLException {
/*  640 */     synchronized (GlobalLock.lock) {
/*  641 */       if (!isCreated()) {
/*  642 */         throw new IllegalStateException("Display not created");
/*      */       }
/*  644 */       if (LWJGLUtil.DEBUG)
/*  645 */         Util.checkGLError(); 
/*  646 */       Context.swapBuffers();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void update() {
/*  657 */     update(true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void update(boolean processMessages) {
/*  668 */     synchronized (GlobalLock.lock) {
/*  669 */       if (!isCreated()) {
/*  670 */         throw new IllegalStateException("Display not created");
/*      */       }
/*      */       
/*  673 */       if (display_impl.isVisible() || display_impl.isDirty()) {
/*      */         try {
/*  675 */           swapBuffers();
/*  676 */         } catch (LWJGLException e) {
/*  677 */           throw new RuntimeException(e);
/*      */         } 
/*      */       }
/*      */       
/*  681 */       if (parent_resized) {
/*  682 */         reshape();
/*  683 */         parent_resized = false;
/*      */       } 
/*      */       
/*  686 */       if (processMessages) {
/*  687 */         processMessages();
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   static void pollDevices() {
/*  693 */     if (Mouse.isCreated()) {
/*  694 */       Mouse.poll();
/*  695 */       Mouse.updateCursor();
/*      */     } 
/*      */     
/*  698 */     if (Keyboard.isCreated()) {
/*  699 */       Keyboard.poll();
/*      */     }
/*      */     
/*  702 */     if (Controllers.isCreated()) {
/*  703 */       Controllers.poll();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void releaseContext() throws LWJGLException {
/*  713 */     synchronized (GlobalLock.lock) {
/*  714 */       if (!isCreated())
/*  715 */         throw new IllegalStateException("Display is not created"); 
/*  716 */       if (context.isCurrent()) {
/*  717 */         Context.releaseCurrentContext();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void makeCurrent() throws LWJGLException {
/*  727 */     synchronized (GlobalLock.lock) {
/*  728 */       if (!isCreated())
/*  729 */         throw new IllegalStateException("Display is not created"); 
/*  730 */       context.makeCurrent();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void removeShutdownHook() {
/*  735 */     AccessController.doPrivileged(new PrivilegedAction() {
/*      */           public Object run() {
/*  737 */             Runtime.getRuntime().removeShutdownHook(Display.shutdown_hook);
/*  738 */             return null;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   private static void registerShutdownHook() {
/*  744 */     AccessController.doPrivileged(new PrivilegedAction() {
/*      */           public Object run() {
/*  746 */             Runtime.getRuntime().addShutdownHook(Display.shutdown_hook);
/*  747 */             return null;
/*      */           }
/*      */         });
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
/*      */   public static void create() throws LWJGLException {
/*  764 */     synchronized (GlobalLock.lock) {
/*  765 */       create(new PixelFormat());
/*      */     } 
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
/*      */   
/*      */   public static void create(PixelFormat pixel_format) throws LWJGLException {
/*  783 */     synchronized (GlobalLock.lock) {
/*  784 */       create(pixel_format, null, null);
/*      */     } 
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
/*      */ 
/*      */   
/*      */   public static void create(PixelFormat pixel_format, Drawable shared_drawable) throws LWJGLException {
/*  803 */     synchronized (GlobalLock.lock) {
/*  804 */       create(pixel_format, shared_drawable, null);
/*      */     } 
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
/*      */ 
/*      */   
/*      */   public static void create(PixelFormat pixel_format, ContextAttribs attribs) throws LWJGLException {
/*  823 */     synchronized (GlobalLock.lock) {
/*  824 */       create(pixel_format, null, attribs);
/*      */     } 
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
/*      */ 
/*      */ 
/*      */   
/*      */   public static void create(PixelFormat pixel_format, Drawable shared_drawable, ContextAttribs attribs) throws LWJGLException {
/*  844 */     synchronized (GlobalLock.lock) {
/*  845 */       if (isCreated())
/*  846 */         throw new IllegalStateException("Only one LWJGL context may be instantiated at any one time."); 
/*  847 */       if (pixel_format == null)
/*  848 */         throw new NullPointerException("pixel_format cannot be null"); 
/*  849 */       removeShutdownHook();
/*  850 */       registerShutdownHook();
/*  851 */       if (isFullscreen())
/*  852 */         switchDisplayMode(); 
/*      */       try {
/*  854 */         peer_info = display_impl.createPeerInfo(pixel_format);
/*      */         try {
/*  856 */           createWindow();
/*      */           try {
/*  858 */             context = new Context(peer_info, attribs, (shared_drawable != null) ? shared_drawable.getContext() : null);
/*      */             try {
/*  860 */               makeCurrentAndSetSwapInterval();
/*  861 */               initContext();
/*  862 */             } catch (LWJGLException e) {
/*  863 */               destroyContext();
/*  864 */               throw e;
/*      */             } 
/*  866 */           } catch (LWJGLException e) {
/*  867 */             destroyWindow();
/*  868 */             throw e;
/*      */           } 
/*  870 */         } catch (LWJGLException e) {
/*  871 */           destroyPeerInfo();
/*  872 */           throw e;
/*      */         } 
/*  874 */       } catch (LWJGLException e) {
/*  875 */         display_impl.resetDisplayMode();
/*  876 */         throw e;
/*      */       } 
/*      */     } 
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
/*      */   public static void setInitialBackground(float red, float green, float blue) {
/*  890 */     r = red;
/*  891 */     g = green;
/*  892 */     b = blue;
/*      */   }
/*      */   
/*      */   private static void makeCurrentAndSetSwapInterval() throws LWJGLException {
/*  896 */     makeCurrent();
/*      */     try {
/*  898 */       Util.checkGLError();
/*  899 */     } catch (OpenGLException e) {
/*  900 */       LWJGLUtil.log("OpenGL error during context creation: " + e.getMessage());
/*      */     } 
/*  902 */     setSwapInterval(swap_interval);
/*      */   }
/*      */ 
/*      */   
/*      */   private static void initContext() {
/*  907 */     GL11.glClearColor(r, g, b, 1.0F);
/*      */     
/*  909 */     GL11.glClear(16384);
/*  910 */     update();
/*      */   }
/*      */   
/*      */   static DisplayImplementation getImplementation() {
/*  914 */     return display_impl;
/*      */   }
/*      */ 
/*      */   
/*      */   static boolean getPrivilegedBoolean(final String property_name) {
/*  919 */     Boolean value = AccessController.<Boolean>doPrivileged(new PrivilegedAction() {
/*      */           public Object run() {
/*  921 */             return new Boolean(Boolean.getBoolean(property_name));
/*      */           } private final String val$property_name;
/*      */         });
/*  924 */     return value.booleanValue();
/*      */   }
/*      */ 
/*      */   
/*      */   private static void initControls() {
/*  929 */     if (!getPrivilegedBoolean("org.lwjgl.opengl.Display.noinput")) {
/*  930 */       if (!Mouse.isCreated() && !getPrivilegedBoolean("org.lwjgl.opengl.Display.nomouse")) {
/*      */         try {
/*  932 */           Mouse.create();
/*  933 */         } catch (LWJGLException e) {
/*  934 */           if (LWJGLUtil.DEBUG) {
/*  935 */             e.printStackTrace(System.err);
/*      */           } else {
/*  937 */             LWJGLUtil.log("Failed to create Mouse: " + e);
/*      */           } 
/*      */         } 
/*      */       }
/*  941 */       if (!Keyboard.isCreated() && !getPrivilegedBoolean("org.lwjgl.opengl.Display.nokeyboard")) {
/*      */         try {
/*  943 */           Keyboard.create();
/*  944 */         } catch (LWJGLException e) {
/*  945 */           if (LWJGLUtil.DEBUG) {
/*  946 */             e.printStackTrace(System.err);
/*      */           } else {
/*  948 */             LWJGLUtil.log("Failed to create Keyboard: " + e);
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void destroy() {
/*  960 */     synchronized (GlobalLock.lock) {
/*  961 */       if (!isCreated()) {
/*      */         return;
/*      */       }
/*      */       
/*  965 */       releaseDrawable();
/*  966 */       destroyContext();
/*  967 */       destroyWindow();
/*  968 */       destroyPeerInfo();
/*  969 */       x = y = -1;
/*  970 */       cached_icons = null;
/*  971 */       reset();
/*  972 */       removeShutdownHook();
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void destroyPeerInfo() {
/*  977 */     peer_info.destroy();
/*  978 */     peer_info = null;
/*      */   }
/*      */   
/*      */   private static void destroyContext() {
/*      */     try {
/*  983 */       context.forceDestroy();
/*  984 */     } catch (LWJGLException e) {
/*  985 */       throw new RuntimeException(e);
/*      */     } finally {
/*  987 */       context = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void reset() {
/*  996 */     display_impl.resetDisplayMode();
/*  997 */     current_mode = initial_mode;
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isCreated() {
/* 1002 */     synchronized (GlobalLock.lock) {
/* 1003 */       return window_created;
/*      */     } 
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
/*      */   public static void setSwapInterval(int value) {
/* 1017 */     synchronized (GlobalLock.lock) {
/* 1018 */       swap_interval = value;
/* 1019 */       if (isCreated()) {
/* 1020 */         Context.setSwapInterval(swap_interval);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setVSyncEnabled(boolean sync) {
/* 1031 */     synchronized (GlobalLock.lock) {
/* 1032 */       setSwapInterval(sync ? 1 : 0);
/*      */     } 
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
/*      */   public static void setLocation(int new_x, int new_y) {
/* 1047 */     synchronized (GlobalLock.lock) {
/*      */       
/* 1049 */       x = new_x;
/* 1050 */       y = new_y;
/*      */ 
/*      */       
/* 1053 */       if (isCreated() && !isFullscreen()) {
/* 1054 */         reshape();
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void reshape() {
/* 1060 */     DisplayMode mode = getEffectiveMode();
/* 1061 */     display_impl.reshape(getWindowX(), getWindowY(), mode.getWidth(), mode.getHeight());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getAdapter() {
/* 1071 */     synchronized (GlobalLock.lock) {
/* 1072 */       return display_impl.getAdapter();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getVersion() {
/* 1083 */     synchronized (GlobalLock.lock) {
/* 1084 */       return display_impl.getVersion();
/*      */     } 
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int setIcon(ByteBuffer[] icons) {
/* 1106 */     synchronized (GlobalLock.lock) {
/*      */ 
/*      */       
/* 1109 */       if (cached_icons != icons) {
/* 1110 */         cached_icons = new ByteBuffer[icons.length];
/* 1111 */         for (int i = 0; i < icons.length; i++) {
/* 1112 */           cached_icons[i] = BufferUtils.createByteBuffer(icons[i].capacity());
/* 1113 */           int old_position = icons[i].position();
/* 1114 */           cached_icons[i].put(icons[i]);
/* 1115 */           icons[i].position(old_position);
/* 1116 */           cached_icons[i].flip();
/*      */         } 
/*      */       } 
/*      */       
/* 1120 */       if (isCreated() && parent == null) {
/* 1121 */         return display_impl.setIcon(cached_icons);
/*      */       }
/* 1123 */       return 0;
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\Display.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */