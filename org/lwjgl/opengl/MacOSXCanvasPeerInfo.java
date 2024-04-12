/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.awt.Canvas;
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
/*    */ abstract class MacOSXCanvasPeerInfo
/*    */   extends MacOSXPeerInfo
/*    */ {
/* 46 */   private final AWTSurfaceLock awt_surface = new AWTSurfaceLock();
/*    */   
/*    */   protected MacOSXCanvasPeerInfo(PixelFormat pixel_format, boolean support_pbuffer) throws LWJGLException {
/* 49 */     super(pixel_format, true, true, support_pbuffer, true);
/*    */   }
/*    */   
/*    */   protected void initHandle(Canvas component) throws LWJGLException {
/* 53 */     nInitHandle(this.awt_surface.lockAndGetHandle(component), getHandle());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void doUnlock() throws LWJGLException {
/* 58 */     this.awt_surface.unlock();
/*    */   }
/*    */   
/*    */   private static native void nInitHandle(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) throws LWJGLException;
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXCanvasPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */