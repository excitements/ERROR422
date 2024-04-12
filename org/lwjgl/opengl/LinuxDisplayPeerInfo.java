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
/*    */ final class LinuxDisplayPeerInfo
/*    */   extends LinuxPeerInfo
/*    */ {
/*    */   LinuxDisplayPeerInfo(PixelFormat pixel_format) throws LWJGLException {
/* 46 */     LinuxDisplay.lockAWT();
/*    */     try {
/* 48 */       GLContext.loadOpenGLLibrary();
/*    */       try {
/* 50 */         LinuxDisplay.incDisplay();
/*    */         try {
/* 52 */           initDefaultPeerInfo(LinuxDisplay.getDisplay(), LinuxDisplay.getDefaultScreen(), getHandle(), pixel_format);
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
/*    */   protected void doLockAndInitHandle() throws LWJGLException {
/* 68 */     LinuxDisplay.lockAWT();
/*    */     try {
/* 70 */       initDrawable(LinuxDisplay.getWindow(), getHandle());
/*    */     } finally {
/* 72 */       LinuxDisplay.unlockAWT();
/*    */     } 
/*    */   }
/*    */   private static native void initDefaultPeerInfo(long paramLong, int paramInt, ByteBuffer paramByteBuffer, PixelFormat paramPixelFormat) throws LWJGLException;
/*    */   
/*    */   private static native void initDrawable(long paramLong, ByteBuffer paramByteBuffer);
/*    */   
/*    */   protected void doUnlock() throws LWJGLException {}
/*    */   
/*    */   public void destroy() {
/* 82 */     super.destroy();
/* 83 */     LinuxDisplay.lockAWT();
/* 84 */     LinuxDisplay.decDisplay();
/* 85 */     GLContext.unloadOpenGLLibrary();
/* 86 */     LinuxDisplay.unlockAWT();
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxDisplayPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */