/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.IntBuffer;
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
/*    */ final class WindowsAWTGLCanvasPeerInfo
/*    */   extends WindowsPeerInfo
/*    */ {
/*    */   private final Canvas component;
/* 48 */   private final AWTSurfaceLock awt_surface = new AWTSurfaceLock();
/*    */   private final PixelFormat pixel_format;
/*    */   private boolean has_pixel_format = false;
/*    */   
/*    */   WindowsAWTGLCanvasPeerInfo(Canvas component, PixelFormat pixel_format) {
/* 53 */     this.component = component;
/* 54 */     this.pixel_format = pixel_format;
/*    */   }
/*    */   
/*    */   protected void doLockAndInitHandle() throws LWJGLException {
/* 58 */     nInitHandle(this.awt_surface.lockAndGetHandle(this.component), getHandle());
/* 59 */     if (!this.has_pixel_format && this.pixel_format != null) {
/*    */       
/* 61 */       int format = choosePixelFormat(getHdc(), this.component.getX(), this.component.getY(), this.pixel_format, (IntBuffer)null, true, true, false, true);
/* 62 */       setPixelFormat(getHdc(), format);
/* 63 */       this.has_pixel_format = true;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void doUnlock() throws LWJGLException {
/* 69 */     this.awt_surface.unlock();
/*    */   }
/*    */   
/*    */   private static native void nInitHandle(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsAWTGLCanvasPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */