/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class Context
/*     */ {
/*     */   private static final ContextImplementation implementation;
/*  58 */   private static final ThreadLocal current_context_local = new ThreadLocal();
/*     */   
/*     */   private final ByteBuffer handle;
/*     */   
/*     */   private final PeerInfo peer_info;
/*     */   
/*     */   private final IntBuffer attribList;
/*     */   
/*     */   private final boolean forwardCompatible;
/*     */   
/*     */   private boolean destroyed;
/*     */   
/*     */   private boolean destroy_requested;
/*     */   
/*     */   private Thread thread;
/*     */ 
/*     */   
/*     */   static {
/*  76 */     Sys.initialize();
/*  77 */     implementation = createImplementation();
/*     */   }
/*     */   
/*     */   private static ContextImplementation createImplementation() {
/*  81 */     switch (LWJGLUtil.getPlatform()) {
/*     */       case 1:
/*  83 */         return new LinuxContextImplementation();
/*     */       case 3:
/*  85 */         return new WindowsContextImplementation();
/*     */       case 2:
/*  87 */         return new MacOSXContextImplementation();
/*     */     } 
/*  89 */     throw new IllegalStateException("Unsupported platform");
/*     */   }
/*     */ 
/*     */   
/*     */   PeerInfo getPeerInfo() {
/*  94 */     return this.peer_info;
/*     */   }
/*     */   
/*     */   static Context getCurrentContext() {
/*  98 */     return current_context_local.get();
/*     */   }
/*     */ 
/*     */   
/*     */   Context(PeerInfo peer_info, ContextAttribs attribs, Context shared_context) throws LWJGLException {
/* 103 */     Context context_lock = (shared_context != null) ? shared_context : this;
/*     */ 
/*     */     
/* 106 */     synchronized (context_lock) {
/* 107 */       if (shared_context != null && shared_context.destroyed)
/* 108 */         throw new IllegalArgumentException("Shared context is destroyed"); 
/* 109 */       GLContext.loadOpenGLLibrary();
/*     */       try {
/* 111 */         this.peer_info = peer_info;
/* 112 */         if (attribs != null) {
/* 113 */           this.attribList = attribs.getAttribList();
/* 114 */           this.forwardCompatible = attribs.isForwardCompatible();
/*     */         } else {
/* 116 */           this.attribList = null;
/* 117 */           this.forwardCompatible = false;
/*     */         } 
/*     */         
/* 120 */         this.handle = implementation.create(peer_info, this.attribList, (shared_context != null) ? shared_context.handle : null);
/* 121 */       } catch (LWJGLException e) {
/* 122 */         GLContext.unloadOpenGLLibrary();
/* 123 */         throw e;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void releaseCurrentContext() throws LWJGLException {
/* 130 */     Context current_context = getCurrentContext();
/* 131 */     if (current_context != null) {
/* 132 */       implementation.releaseCurrentContext();
/* 133 */       GLContext.useContext(null);
/* 134 */       current_context_local.set(null);
/* 135 */       synchronized (current_context) {
/* 136 */         current_context.thread = null;
/* 137 */         current_context.checkDestroy();
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
/*     */   public synchronized void releaseDrawable() throws LWJGLException {
/* 149 */     if (this.destroyed)
/* 150 */       throw new IllegalStateException("Context is destroyed"); 
/* 151 */     implementation.releaseDrawable(getHandle());
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void update() {
/* 156 */     if (this.destroyed)
/* 157 */       throw new IllegalStateException("Context is destroyed"); 
/* 158 */     implementation.update(getHandle());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void swapBuffers() throws LWJGLException {
/* 163 */     implementation.swapBuffers();
/*     */   }
/*     */   
/*     */   private boolean canAccess() {
/* 167 */     return (this.thread == null || Thread.currentThread() == this.thread);
/*     */   }
/*     */   
/*     */   private void checkAccess() {
/* 171 */     if (!canAccess()) {
/* 172 */       throw new IllegalStateException("From thread " + Thread.currentThread() + ": " + this.thread + " already has the context current");
/*     */     }
/*     */   }
/*     */   
/*     */   public synchronized void makeCurrent() throws LWJGLException {
/* 177 */     checkAccess();
/* 178 */     if (this.destroyed)
/* 179 */       throw new IllegalStateException("Context is destroyed"); 
/* 180 */     this.thread = Thread.currentThread();
/* 181 */     current_context_local.set(this);
/* 182 */     implementation.makeCurrent(this.peer_info, this.handle);
/* 183 */     GLContext.useContext(this, this.forwardCompatible);
/*     */   }
/*     */   
/*     */   ByteBuffer getHandle() {
/* 187 */     return this.handle;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized boolean isCurrent() throws LWJGLException {
/* 192 */     if (this.destroyed)
/* 193 */       throw new IllegalStateException("Context is destroyed"); 
/* 194 */     return implementation.isCurrent(this.handle);
/*     */   }
/*     */   
/*     */   private void checkDestroy() {
/* 198 */     if (!this.destroyed && this.destroy_requested) {
/*     */       try {
/* 200 */         releaseDrawable();
/* 201 */         implementation.destroy(this.peer_info, this.handle);
/* 202 */         this.destroyed = true;
/* 203 */         this.thread = null;
/* 204 */         GLContext.unloadOpenGLLibrary();
/* 205 */       } catch (LWJGLException e) {
/* 206 */         LWJGLUtil.log("Exception occurred while destroying context: " + e);
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
/*     */   public static void setSwapInterval(int value) {
/* 219 */     implementation.setSwapInterval(value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void forceDestroy() throws LWJGLException {
/* 228 */     checkAccess();
/* 229 */     destroy();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void destroy() throws LWJGLException {
/* 237 */     if (this.destroyed)
/*     */       return; 
/* 239 */     this.destroy_requested = true;
/* 240 */     boolean was_current = isCurrent();
/* 241 */     int error = 0;
/* 242 */     if (was_current) {
/* 243 */       if (GLContext.getCapabilities() != null && (GLContext.getCapabilities()).OpenGL11)
/* 244 */         error = GL11.glGetError(); 
/* 245 */       releaseCurrentContext();
/*     */     } 
/* 247 */     checkDestroy();
/* 248 */     if (was_current && error != 0)
/* 249 */       throw new OpenGLException(error); 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\Context.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */