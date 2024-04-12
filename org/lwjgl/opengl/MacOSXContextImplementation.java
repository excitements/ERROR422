/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
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
/*     */ final class MacOSXContextImplementation
/*     */   implements ContextImplementation
/*     */ {
/*     */   public ByteBuffer create(PeerInfo peer_info, IntBuffer attribs, ByteBuffer shared_context_handle) throws LWJGLException {
/*  47 */     ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */     try {
/*  49 */       return nCreate(peer_handle, attribs, shared_context_handle);
/*     */     } finally {
/*  51 */       peer_info.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native ByteBuffer nCreate(ByteBuffer paramByteBuffer1, IntBuffer paramIntBuffer, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*     */   
/*     */   public void swapBuffers() throws LWJGLException {
/*  58 */     Context current_context = Context.getCurrentContext();
/*  59 */     if (current_context == null)
/*  60 */       throw new IllegalStateException("No context is current"); 
/*  61 */     synchronized (current_context) {
/*  62 */       nSwapBuffers(current_context.getHandle());
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void nSwapBuffers(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public void update(ByteBuffer context_handle) {
/*  69 */     nUpdate(context_handle);
/*     */   }
/*     */   
/*     */   private static native void nUpdate(ByteBuffer paramByteBuffer);
/*     */   
/*     */   public void releaseCurrentContext() throws LWJGLException {
/*  75 */     nReleaseCurrentContext();
/*     */   }
/*     */   
/*     */   private static native void nReleaseCurrentContext() throws LWJGLException;
/*     */   
/*     */   public void releaseDrawable(ByteBuffer context_handle) throws LWJGLException {
/*  81 */     clearDrawable(context_handle);
/*     */   }
/*     */   
/*     */   private static native void clearDrawable(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   static void resetView(PeerInfo peer_info, Context context) throws LWJGLException {
/*  87 */     ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */     try {
/*  89 */       synchronized (context) {
/*  90 */         clearDrawable(context.getHandle());
/*  91 */         setView(peer_handle, context.getHandle());
/*     */       } 
/*     */     } finally {
/*  94 */       peer_info.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void makeCurrent(PeerInfo peer_info, ByteBuffer handle) throws LWJGLException {
/*  99 */     ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */     try {
/* 101 */       setView(peer_handle, handle);
/* 102 */       nMakeCurrent(handle);
/*     */     } finally {
/* 104 */       peer_info.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void setView(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*     */   
/*     */   private static native void nMakeCurrent(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public boolean isCurrent(ByteBuffer handle) throws LWJGLException {
/* 113 */     boolean result = nIsCurrent(handle);
/* 114 */     return result;
/*     */   }
/*     */   
/*     */   private static native boolean nIsCurrent(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public void setSwapInterval(int value) {
/* 120 */     Context current_context = Context.getCurrentContext();
/* 121 */     synchronized (current_context) {
/* 122 */       nSetSwapInterval(current_context.getHandle(), value);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void nSetSwapInterval(ByteBuffer paramByteBuffer, int paramInt);
/*     */   
/*     */   public void destroy(PeerInfo peer_info, ByteBuffer handle) throws LWJGLException {
/* 129 */     nDestroy(handle);
/*     */   }
/*     */   
/*     */   private static native void nDestroy(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXContextImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */