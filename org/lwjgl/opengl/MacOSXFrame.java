/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.DisplayMode;
/*     */ import java.awt.Frame;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.awt.event.ComponentListener;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.awt.event.WindowListener;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedActionException;
/*     */ import java.security.PrivilegedExceptionAction;
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
/*     */ final class MacOSXFrame
/*     */   extends Frame
/*     */   implements WindowListener, ComponentListener
/*     */ {
/*     */   private static final long serialVersionUID = -5823294716668988777L;
/*     */   private final MacOSXGLCanvas canvas;
/*     */   private boolean close_requested;
/*     */   private Rectangle bounds;
/*     */   private boolean active;
/*     */   private boolean minimized;
/*     */   private boolean should_warp_cursor;
/*     */   private boolean should_release_cursor;
/*     */   
/*     */   MacOSXFrame(DisplayMode mode, final DisplayMode requested_mode, boolean fullscreen, int x, int y) throws LWJGLException {
/*  71 */     setResizable(false);
/*  72 */     addWindowListener(this);
/*  73 */     addComponentListener(this);
/*  74 */     this.canvas = new MacOSXGLCanvas();
/*  75 */     this.canvas.setFocusTraversalKeysEnabled(false);
/*  76 */     add(this.canvas, "Center");
/*  77 */     boolean undecorated = Display.getPrivilegedBoolean("org.lwjgl.opengl.Window.undecorated");
/*  78 */     setUndecorated((fullscreen || undecorated));
/*  79 */     if (fullscreen) {
/*     */       try {
/*  81 */         AccessController.doPrivileged(new PrivilegedExceptionAction() { private final DisplayMode val$requested_mode;
/*     */               public Object run() throws Exception {
/*  83 */                 MacOSXFrame.getDevice().setFullScreenWindow(MacOSXFrame.this);
/*  84 */                 MacOSXFrame.getDevice().setDisplayMode(requested_mode);
/*  85 */                 DisplayMode real_mode = MacOSXFrame.getDevice().getDisplayMode();
/*     */                 
/*  87 */                 if (requested_mode.getWidth() != real_mode.getWidth() || requested_mode.getHeight() != real_mode.getHeight()) {
/*  88 */                   MacOSXFrame.getDevice().setFullScreenWindow(null);
/*  89 */                   if (MacOSXFrame.this.isDisplayable())
/*  90 */                     MacOSXFrame.this.dispose(); 
/*  91 */                   throw new LWJGLException("AWT capped mode: requested mode = " + requested_mode.getWidth() + "x" + requested_mode.getHeight() + " but got " + real_mode.getWidth() + " " + real_mode.getHeight());
/*     */                 } 
/*     */                 
/*  94 */                 return null;
/*     */               } private final MacOSXFrame this$0; }
/*     */           );
/*  97 */       } catch (PrivilegedActionException e) {
/*  98 */         throw new LWJGLException(e);
/*     */       } 
/*     */     }
/* 101 */     pack();
/* 102 */     resize(x, y, mode.getWidth(), mode.getHeight());
/* 103 */     setVisible(true);
/* 104 */     requestFocus();
/* 105 */     this.canvas.requestFocus();
/* 106 */     updateBounds();
/*     */   }
/*     */   
/*     */   public void resize(int x, int y, int width, int height) {
/* 110 */     Insets insets = getInsets();
/* 111 */     setBounds(x, y, width + insets.left + insets.right, height + insets.top + insets.bottom);
/*     */   }
/*     */   
/*     */   public Rectangle syncGetBounds() {
/* 115 */     synchronized (this) {
/* 116 */       return this.bounds;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void componentShown(ComponentEvent e) {}
/*     */ 
/*     */   
/*     */   public void componentHidden(ComponentEvent e) {}
/*     */   
/*     */   private void updateBounds() {
/* 127 */     synchronized (this) {
/* 128 */       this.bounds = getBounds();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void componentResized(ComponentEvent e) {
/* 133 */     updateBounds();
/*     */   }
/*     */   
/*     */   public void componentMoved(ComponentEvent e) {
/* 137 */     updateBounds();
/*     */   }
/*     */   
/*     */   public static GraphicsDevice getDevice() {
/* 141 */     GraphicsEnvironment g_env = GraphicsEnvironment.getLocalGraphicsEnvironment();
/* 142 */     GraphicsDevice device = g_env.getDefaultScreenDevice();
/* 143 */     return device;
/*     */   }
/*     */   
/*     */   public void windowIconified(WindowEvent e) {
/* 147 */     synchronized (this) {
/* 148 */       this.minimized = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void windowDeiconified(WindowEvent e) {
/* 153 */     synchronized (this) {
/* 154 */       this.minimized = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void windowOpened(WindowEvent e) {}
/*     */ 
/*     */   
/*     */   public void windowClosed(WindowEvent e) {}
/*     */   
/*     */   public void windowClosing(WindowEvent e) {
/* 165 */     synchronized (this) {
/* 166 */       this.close_requested = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void windowDeactivated(WindowEvent e) {
/* 171 */     synchronized (this) {
/* 172 */       this.active = false;
/* 173 */       this.should_release_cursor = true;
/* 174 */       this.should_warp_cursor = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void windowActivated(WindowEvent e) {
/* 179 */     synchronized (this) {
/* 180 */       this.active = true;
/* 181 */       this.should_warp_cursor = true;
/* 182 */       this.should_release_cursor = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean syncIsCloseRequested() {
/*     */     boolean result;
/* 188 */     synchronized (this) {
/* 189 */       result = this.close_requested;
/* 190 */       this.close_requested = false;
/*     */     } 
/* 192 */     return result;
/*     */   }
/*     */   
/*     */   public boolean syncIsVisible() {
/* 196 */     synchronized (this) {
/* 197 */       return !this.minimized;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean syncIsActive() {
/* 202 */     synchronized (this) {
/* 203 */       return this.active;
/*     */     } 
/*     */   }
/*     */   
/*     */   public MacOSXGLCanvas getCanvas() {
/* 208 */     return this.canvas;
/*     */   }
/*     */   
/*     */   public boolean syncShouldReleaseCursor() {
/*     */     boolean result;
/* 213 */     synchronized (this) {
/* 214 */       result = this.should_release_cursor;
/* 215 */       this.should_release_cursor = false;
/*     */     } 
/* 217 */     return result;
/*     */   }
/*     */   
/*     */   public boolean syncShouldWarpCursor() {
/*     */     boolean result;
/* 222 */     synchronized (this) {
/* 223 */       result = this.should_warp_cursor;
/* 224 */       this.should_warp_cursor = false;
/*     */     } 
/* 226 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXFrame.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */