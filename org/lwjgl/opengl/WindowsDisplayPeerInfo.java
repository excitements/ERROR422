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
/*    */ final class WindowsDisplayPeerInfo
/*    */   extends WindowsPeerInfo
/*    */ {
/*    */   private final PixelFormat pixel_format;
/*    */   
/*    */   WindowsDisplayPeerInfo(PixelFormat pixel_format) throws LWJGLException {
/* 48 */     this.pixel_format = pixel_format;
/* 49 */     GLContext.loadOpenGLLibrary();
/*    */   }
/*    */   
/*    */   PixelFormat getPixelFormat() {
/* 53 */     return this.pixel_format;
/*    */   }
/*    */   
/*    */   void initDC(long hwnd, long hdc) throws LWJGLException {
/* 57 */     nInitDC(getHandle(), hwnd, hdc);
/*    */   }
/*    */ 
/*    */   
/*    */   private static native void nInitDC(ByteBuffer paramByteBuffer, long paramLong1, long paramLong2);
/*    */ 
/*    */   
/*    */   protected void doLockAndInitHandle() throws LWJGLException {}
/*    */ 
/*    */   
/*    */   protected void doUnlock() throws LWJGLException {}
/*    */   
/*    */   public void destroy() {
/* 70 */     super.destroy();
/* 71 */     GLContext.unloadOpenGLLibrary();
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsDisplayPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */