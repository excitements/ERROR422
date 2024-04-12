/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
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
/*     */ final class WindowsContextImplementation
/*     */   implements ContextImplementation
/*     */ {
/*     */   public ByteBuffer create(PeerInfo peer_info, IntBuffer attribs, ByteBuffer shared_context_handle) throws LWJGLException {
/*  48 */     ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */     try {
/*  50 */       return nCreate(peer_handle, attribs, shared_context_handle);
/*     */     } finally {
/*  52 */       peer_info.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native ByteBuffer nCreate(ByteBuffer paramByteBuffer1, IntBuffer paramIntBuffer, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*     */   
/*     */   public void swapBuffers() throws LWJGLException {
/*  59 */     Context current_context = Context.getCurrentContext();
/*  60 */     if (current_context == null)
/*  61 */       throw new IllegalStateException("No context is current"); 
/*  62 */     synchronized (current_context) {
/*  63 */       PeerInfo current_peer_info = current_context.getPeerInfo();
/*  64 */       ByteBuffer peer_handle = current_peer_info.lockAndGetHandle();
/*     */       try {
/*  66 */         nSwapBuffers(peer_handle);
/*     */       } finally {
/*  68 */         current_peer_info.unlock();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static native void nSwapBuffers(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */ 
/*     */   
/*     */   public void releaseDrawable(ByteBuffer context_handle) throws LWJGLException {}
/*     */   
/*     */   public void update(ByteBuffer context_handle) {}
/*     */   
/*     */   public void releaseCurrentContext() throws LWJGLException {
/*  82 */     nReleaseCurrentContext();
/*     */   }
/*     */   
/*     */   private static native void nReleaseCurrentContext() throws LWJGLException;
/*     */   
/*     */   public void makeCurrent(PeerInfo peer_info, ByteBuffer handle) throws LWJGLException {
/*  88 */     ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */     try {
/*  90 */       nMakeCurrent(peer_handle, handle);
/*     */     } finally {
/*  92 */       peer_info.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void nMakeCurrent(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*     */   
/*     */   public boolean isCurrent(ByteBuffer handle) throws LWJGLException {
/*  99 */     boolean result = nIsCurrent(handle);
/* 100 */     return result;
/*     */   }
/*     */   
/*     */   private static native boolean nIsCurrent(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public void setSwapInterval(int value) {
/* 106 */     boolean success = nSetSwapInterval(value);
/* 107 */     if (!success)
/* 108 */       LWJGLUtil.log("Failed to set swap interval"); 
/* 109 */     Util.checkGLError();
/*     */   }
/*     */   
/*     */   private static native boolean nSetSwapInterval(int paramInt);
/*     */   
/*     */   public void destroy(PeerInfo peer_info, ByteBuffer handle) throws LWJGLException {
/* 115 */     nDestroy(handle);
/*     */   }
/*     */   
/*     */   private static native void nDestroy(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsContextImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */