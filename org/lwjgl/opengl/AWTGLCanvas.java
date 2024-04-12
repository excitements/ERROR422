/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.awt.event.ComponentListener;
/*     */ import java.awt.event.HierarchyEvent;
/*     */ import java.awt.event.HierarchyListener;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ import org.lwjgl.Sys;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AWTGLCanvas
/*     */   extends Canvas
/*     */   implements Drawable, ComponentListener, HierarchyListener
/*     */ {
/*     */   private boolean first_run;
/*     */   private int reentry_count;
/*     */   private Context context;
/*     */   private PeerInfo peer_info;
/*     */   private final ContextAttribs attribs;
/*     */   private final Drawable drawable;
/*     */   private final PixelFormat pixel_format;
/*  59 */   private Object SYNC_LOCK = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean update_context;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  84 */     Sys.initialize();
/*  85 */   } private static final AWTCanvasImplementation implementation = createImplementation();
/*     */   private static final long serialVersionUID = 1L;
/*     */   
/*     */   static AWTCanvasImplementation createImplementation() {
/*  89 */     switch (LWJGLUtil.getPlatform()) {
/*     */       case 1:
/*  91 */         return new LinuxCanvasImplementation();
/*     */       case 3:
/*  93 */         return new WindowsCanvasImplementation();
/*     */       case 2:
/*  95 */         return new MacOSXCanvasImplementation();
/*     */     } 
/*  97 */     throw new IllegalStateException("Unsupported platform");
/*     */   }
/*     */ 
/*     */   
/*     */   private void setUpdate() {
/* 102 */     synchronized (this.SYNC_LOCK) {
/* 103 */       this.update_context = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Context getContext() {
/* 109 */     return this.context;
/*     */   }
/*     */ 
/*     */   
/*     */   public AWTGLCanvas() throws LWJGLException {
/* 114 */     this(new PixelFormat());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AWTGLCanvas(PixelFormat pixel_format) throws LWJGLException {
/* 123 */     this(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(), pixel_format);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AWTGLCanvas(GraphicsDevice device, PixelFormat pixel_format) throws LWJGLException {
/* 133 */     this(device, pixel_format, (Drawable)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AWTGLCanvas(GraphicsDevice device, PixelFormat pixel_format, Drawable drawable) throws LWJGLException {
/* 144 */     this(device, pixel_format, drawable, (ContextAttribs)null);
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
/*     */   public AWTGLCanvas(GraphicsDevice device, PixelFormat pixel_format, Drawable drawable, ContextAttribs attribs) throws LWJGLException {
/* 156 */     super(implementation.findConfiguration(device, pixel_format));
/* 157 */     if (pixel_format == null)
/* 158 */       throw new NullPointerException("Pixel format must be non-null"); 
/* 159 */     addHierarchyListener(this);
/* 160 */     addComponentListener(this);
/* 161 */     this.drawable = drawable;
/* 162 */     this.pixel_format = pixel_format;
/* 163 */     this.attribs = attribs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addNotify() {
/* 170 */     super.addNotify();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeNotify() {
/* 177 */     synchronized (this.SYNC_LOCK) {
/* 178 */       destroyContext();
/* 179 */       super.removeNotify();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSwapInterval(int swap_interval) {
/* 185 */     synchronized (this.SYNC_LOCK) {
/* 186 */       if (this.context == null)
/* 187 */         throw new IllegalStateException("Canvas not yet displayable"); 
/* 188 */       Context.setSwapInterval(swap_interval);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVSyncEnabled(boolean enabled) {
/* 194 */     setSwapInterval(enabled ? 1 : 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void swapBuffers() throws LWJGLException {
/* 199 */     synchronized (this.SYNC_LOCK) {
/* 200 */       if (this.context == null)
/* 201 */         throw new IllegalStateException("Canvas not yet displayable"); 
/* 202 */       Context.swapBuffers();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void releaseContext() throws LWJGLException {
/* 207 */     synchronized (this.SYNC_LOCK) {
/* 208 */       if (this.context == null)
/* 209 */         throw new IllegalStateException("Canvas not yet displayable"); 
/* 210 */       if (this.context.isCurrent()) {
/* 211 */         Context.releaseCurrentContext();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void makeCurrent() throws LWJGLException {
/* 220 */     synchronized (this.SYNC_LOCK) {
/* 221 */       if (this.context == null)
/* 222 */         throw new IllegalStateException("Canvas not yet displayable"); 
/* 223 */       this.context.makeCurrent();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void destroyContext() {
/* 229 */     synchronized (this.SYNC_LOCK) {
/*     */       try {
/* 231 */         if (this.context != null) {
/* 232 */           this.context.forceDestroy();
/* 233 */           this.context = null;
/* 234 */           this.reentry_count = 0;
/* 235 */           this.peer_info.destroy();
/* 236 */           this.peer_info = null;
/*     */         } 
/* 238 */       } catch (LWJGLException e) {
/* 239 */         throw new RuntimeException(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void initGL() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintGL() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void paint(Graphics g) {
/* 261 */     LWJGLException exception = null;
/* 262 */     synchronized (this.SYNC_LOCK) {
/* 263 */       if (!isDisplayable())
/*     */         return; 
/*     */       try {
/* 266 */         if (this.peer_info == null) {
/* 267 */           this.peer_info = implementation.createPeerInfo(this, this.pixel_format);
/*     */         }
/* 269 */         this.peer_info.lockAndGetHandle();
/*     */         try {
/* 271 */           if (this.context == null) {
/* 272 */             this.context = new Context(this.peer_info, this.attribs, (this.drawable != null) ? this.drawable.getContext() : null);
/* 273 */             this.first_run = true;
/*     */           } 
/*     */           
/* 276 */           if (this.reentry_count == 0)
/* 277 */             this.context.makeCurrent(); 
/* 278 */           this.reentry_count++;
/*     */           try {
/* 280 */             if (this.update_context) {
/* 281 */               this.context.update();
/* 282 */               this.update_context = false;
/*     */             } 
/* 284 */             if (this.first_run) {
/* 285 */               this.first_run = false;
/* 286 */               initGL();
/*     */             } 
/* 288 */             paintGL();
/*     */           } finally {
/* 290 */             this.reentry_count--;
/* 291 */             if (this.reentry_count == 0)
/* 292 */               Context.releaseCurrentContext(); 
/*     */           } 
/*     */         } finally {
/* 295 */           this.peer_info.unlock();
/*     */         } 
/* 297 */       } catch (LWJGLException e) {
/* 298 */         exception = e;
/*     */       } 
/*     */     } 
/* 301 */     if (exception != null) {
/* 302 */       exceptionOccurred(exception);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void exceptionOccurred(LWJGLException exception) {
/* 312 */     LWJGLUtil.log("Unhandled exception occurred, skipping paint(): " + exception);
/*     */   }
/*     */ 
/*     */   
/*     */   public void update(Graphics g) {
/* 317 */     paint(g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void componentShown(ComponentEvent e) {}
/*     */ 
/*     */   
/*     */   public void componentHidden(ComponentEvent e) {}
/*     */   
/*     */   public void componentResized(ComponentEvent e) {
/* 327 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void componentMoved(ComponentEvent e) {
/* 331 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void setLocation(int x, int y) {
/* 335 */     super.setLocation(x, y);
/* 336 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void setLocation(Point p) {
/* 340 */     super.setLocation(p);
/* 341 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void setSize(Dimension d) {
/* 345 */     super.setSize(d);
/* 346 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void setSize(int width, int height) {
/* 350 */     super.setSize(width, height);
/* 351 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void setBounds(int x, int y, int width, int height) {
/* 355 */     super.setBounds(x, y, width, height);
/* 356 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void hierarchyChanged(HierarchyEvent e) {
/* 360 */     setUpdate();
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\AWTGLCanvas.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */