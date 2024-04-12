/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedActionException;
/*     */ import java.security.PrivilegedExceptionAction;
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
/*     */ 
/*     */ final class AWTSurfaceLock
/*     */ {
/*     */   private static final int WAIT_DELAY_MILLIS = 100;
/*     */   private final ByteBuffer lock_buffer;
/*     */   private boolean firstLockSucceeded = false;
/*     */   
/*     */   AWTSurfaceLock() {
/*  58 */     this.lock_buffer = createHandle();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ByteBuffer lockAndGetHandle(Canvas component) throws LWJGLException {
/*  64 */     while (!privilegedLockAndInitHandle(component)) {
/*  65 */       LWJGLUtil.log("Could not get drawing surface info, retrying...");
/*     */       try {
/*  67 */         Thread.sleep(100L);
/*  68 */       } catch (InterruptedException e) {
/*  69 */         LWJGLUtil.log("Interrupted while retrying: " + e);
/*     */       } 
/*     */     } 
/*     */     
/*  73 */     return this.lock_buffer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean privilegedLockAndInitHandle(final Canvas component) throws LWJGLException {
/*  82 */     if (this.firstLockSucceeded) {
/*  83 */       return lockAndInitHandle(this.lock_buffer, component);
/*     */     }
/*     */     try {
/*  86 */       Object result = AccessController.doPrivileged(new PrivilegedExceptionAction() { private final Canvas val$component;
/*     */             
/*     */             public Object run() throws LWJGLException {
/*  89 */               return Boolean.valueOf(AWTSurfaceLock.lockAndInitHandle(AWTSurfaceLock.this.lock_buffer, component));
/*     */             } private final AWTSurfaceLock this$0; }
/*     */         );
/*  92 */       this.firstLockSucceeded = ((Boolean)result).booleanValue();
/*  93 */       return this.firstLockSucceeded;
/*  94 */     } catch (PrivilegedActionException e) {
/*  95 */       throw (LWJGLException)e.getException();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   void unlock() throws LWJGLException {
/* 102 */     nUnlock(this.lock_buffer);
/*     */   }
/*     */   
/*     */   private static native ByteBuffer createHandle();
/*     */   
/*     */   private static native boolean lockAndInitHandle(ByteBuffer paramByteBuffer, Canvas paramCanvas) throws LWJGLException;
/*     */   
/*     */   private static native void nUnlock(ByteBuffer paramByteBuffer) throws LWJGLException;
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\AWTSurfaceLock.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */