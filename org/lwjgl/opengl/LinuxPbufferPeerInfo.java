/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import org.lwjgl.LWJGLException;
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
/*    */ final class LinuxPbufferPeerInfo
/*    */   extends LinuxPeerInfo
/*    */ {
/*    */   LinuxPbufferPeerInfo(int width, int height, PixelFormat pixel_format) throws LWJGLException {
/* 46 */     LinuxDisplay.lockAWT();
/*    */     try {
/* 48 */       GLContext.loadOpenGLLibrary();
/*    */       try {
/* 50 */         LinuxDisplay.incDisplay();
/*    */         try {
/* 52 */           nInitHandle(LinuxDisplay.getDisplay(), LinuxDisplay.getDefaultScreen(), getHandle(), width, height, pixel_format);
/* 53 */         } catch (LWJGLException e) {
/* 54 */           LinuxDisplay.decDisplay();
/* 55 */           throw e;
/*    */         } 
/* 57 */       } catch (LWJGLException e) {
/* 58 */         GLContext.unloadOpenGLLibrary();
/* 59 */         throw e;
/*    */       } 
/*    */     } finally {
/* 62 */       LinuxDisplay.unlockAWT();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void destroy() {
/* 68 */     LinuxDisplay.lockAWT();
/* 69 */     nDestroy(getHandle());
/* 70 */     LinuxDisplay.decDisplay();
/* 71 */     GLContext.unloadOpenGLLibrary();
/* 72 */     LinuxDisplay.unlockAWT();
/*    */   }
/*    */   
/*    */   private static native void nInitHandle(long paramLong, int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, int paramInt3, PixelFormat paramPixelFormat) throws LWJGLException;
/*    */   
/*    */   private static native void nDestroy(ByteBuffer paramByteBuffer);
/*    */   
/*    */   protected void doLockAndInitHandle() throws LWJGLException {}
/*    */   
/*    */   protected void doUnlock() throws LWJGLException {}
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxPbufferPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */