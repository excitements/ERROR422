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
/*     */ final class LinuxContextImplementation
/*     */   implements ContextImplementation
/*     */ {
/*     */   public ByteBuffer create(PeerInfo peer_info, IntBuffer attribs, ByteBuffer shared_context_handle) throws LWJGLException {
/*  47 */     LinuxDisplay.lockAWT();
/*     */     try {
/*  49 */       ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */ 
/*     */     
/*     */     }
/*     */     finally {
/*     */ 
/*     */       
/*  56 */       LinuxDisplay.unlockAWT();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static native ByteBuffer nCreate(ByteBuffer paramByteBuffer1, IntBuffer paramIntBuffer, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*     */   
/*     */   public void releaseDrawable(ByteBuffer context_handle) throws LWJGLException {}
/*     */   
/*     */   public void swapBuffers() throws LWJGLException {
/*  66 */     Context current_context = Context.getCurrentContext();
/*  67 */     if (current_context == null)
/*  68 */       throw new IllegalStateException("No context is current"); 
/*  69 */     synchronized (current_context) {
/*  70 */       PeerInfo current_peer_info = current_context.getPeerInfo();
/*  71 */       LinuxDisplay.lockAWT();
/*     */       try {
/*  73 */         ByteBuffer peer_handle = current_peer_info.lockAndGetHandle();
/*     */         try {
/*  75 */           nSwapBuffers(peer_handle);
/*     */         } finally {
/*  77 */           current_peer_info.unlock();
/*     */         } 
/*     */       } finally {
/*  80 */         LinuxDisplay.unlockAWT();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void nSwapBuffers(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public void releaseCurrentContext() throws LWJGLException {
/*  88 */     Context current_context = Context.getCurrentContext();
/*  89 */     if (current_context == null)
/*  90 */       throw new IllegalStateException("No context is current"); 
/*  91 */     synchronized (current_context) {
/*  92 */       PeerInfo current_peer_info = current_context.getPeerInfo();
/*  93 */       LinuxDisplay.lockAWT();
/*     */       try {
/*  95 */         ByteBuffer peer_handle = current_peer_info.lockAndGetHandle();
/*     */         try {
/*  97 */           nReleaseCurrentContext(peer_handle);
/*     */         } finally {
/*  99 */           current_peer_info.unlock();
/*     */         } 
/*     */       } finally {
/* 102 */         LinuxDisplay.unlockAWT();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static native void nReleaseCurrentContext(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public void update(ByteBuffer context_handle) {}
/*     */   
/*     */   public void makeCurrent(PeerInfo peer_info, ByteBuffer handle) throws LWJGLException {
/* 113 */     LinuxDisplay.lockAWT();
/*     */     try {
/* 115 */       ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */       try {
/* 117 */         nMakeCurrent(peer_handle, handle);
/*     */       } finally {
/* 119 */         peer_info.unlock();
/*     */       } 
/*     */     } finally {
/* 122 */       LinuxDisplay.unlockAWT();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void nMakeCurrent(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*     */   
/*     */   public boolean isCurrent(ByteBuffer handle) throws LWJGLException {
/* 129 */     LinuxDisplay.lockAWT();
/*     */     try {
/* 131 */       boolean result = nIsCurrent(handle);
/* 132 */       return result;
/*     */     } finally {
/* 134 */       LinuxDisplay.unlockAWT();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native boolean nIsCurrent(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */   
/*     */   public void setSwapInterval(int value) {
/* 141 */     Context current_context = Context.getCurrentContext();
/* 142 */     if (current_context == null)
/* 143 */       throw new IllegalStateException("No context is current"); 
/* 144 */     synchronized (current_context) {
/* 145 */       LinuxDisplay.lockAWT();
/* 146 */       nSetSwapInterval(current_context.getHandle(), value);
/* 147 */       LinuxDisplay.unlockAWT();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void nSetSwapInterval(ByteBuffer paramByteBuffer, int paramInt);
/*     */   
/*     */   public void destroy(PeerInfo peer_info, ByteBuffer handle) throws LWJGLException {
/* 154 */     LinuxDisplay.lockAWT();
/*     */     try {
/* 156 */       ByteBuffer peer_handle = peer_info.lockAndGetHandle();
/*     */       try {
/* 158 */         nDestroy(peer_handle, handle);
/*     */       } finally {
/* 160 */         peer_info.unlock();
/*     */       } 
/*     */     } finally {
/* 163 */       LinuxDisplay.unlockAWT();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native void nDestroy(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxContextImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */