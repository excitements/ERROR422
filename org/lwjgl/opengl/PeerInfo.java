/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import org.lwjgl.LWJGLException;
/*    */ import org.lwjgl.LWJGLUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class PeerInfo
/*    */ {
/*    */   private final ByteBuffer handle;
/*    */   private Thread locking_thread;
/*    */   private int lock_count;
/*    */   
/*    */   protected PeerInfo(ByteBuffer handle) {
/* 51 */     this.handle = handle;
/*    */   }
/*    */   
/*    */   private void lockAndInitHandle() throws LWJGLException {
/* 55 */     doLockAndInitHandle();
/*    */   }
/*    */   
/*    */   public final synchronized void unlock() throws LWJGLException {
/* 59 */     if (this.lock_count <= 0)
/* 60 */       throw new IllegalStateException("PeerInfo not locked!"); 
/* 61 */     if (Thread.currentThread() != this.locking_thread)
/* 62 */       throw new IllegalStateException("PeerInfo already locked by " + this.locking_thread); 
/* 63 */     this.lock_count--;
/* 64 */     if (this.lock_count == 0) {
/* 65 */       doUnlock();
/* 66 */       this.locking_thread = null;
/* 67 */       notify();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract void doLockAndInitHandle() throws LWJGLException;
/*    */   
/*    */   public final synchronized ByteBuffer lockAndGetHandle() throws LWJGLException {
/* 75 */     Thread this_thread = Thread.currentThread();
/* 76 */     while (this.locking_thread != null && this.locking_thread != this_thread) {
/*    */       try {
/* 78 */         wait();
/* 79 */       } catch (InterruptedException e) {
/* 80 */         LWJGLUtil.log("Interrupted while waiting for PeerInfo lock: " + e);
/*    */       } 
/*    */     } 
/* 83 */     if (this.lock_count == 0) {
/* 84 */       this.locking_thread = this_thread;
/* 85 */       doLockAndInitHandle();
/*    */     } 
/* 87 */     this.lock_count++;
/* 88 */     return getHandle();
/*    */   }
/*    */   protected abstract void doUnlock() throws LWJGLException;
/*    */   protected final ByteBuffer getHandle() {
/* 92 */     return this.handle;
/*    */   }
/*    */   
/*    */   public void destroy() {}
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\PeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */