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
/*    */ abstract class MacOSXPeerInfo
/*    */   extends PeerInfo
/*    */ {
/*    */   private static native ByteBuffer createHandle();
/*    */   
/*    */   MacOSXPeerInfo(PixelFormat pixel_format, boolean use_display_bpp, boolean support_window, boolean support_pbuffer, boolean double_buffered) throws LWJGLException {
/* 47 */     super(createHandle());
/* 48 */     if (pixel_format.isFloatingPoint() && !LWJGLUtil.isMacOSXEqualsOrBetterThan(10, 4))
/* 49 */       throw new LWJGLException("Floating point pixel format requested, but is not supported"); 
/* 50 */     choosePixelFormat(pixel_format, use_display_bpp, support_window, support_pbuffer, double_buffered);
/*    */   }
/*    */ 
/*    */   
/*    */   private void choosePixelFormat(PixelFormat pixel_format, boolean use_display_bpp, boolean support_window, boolean support_pbuffer, boolean double_buffered) throws LWJGLException {
/* 55 */     nChoosePixelFormat(getHandle(), pixel_format, use_display_bpp, support_window, support_pbuffer, double_buffered);
/*    */   }
/*    */ 
/*    */   
/*    */   public void destroy() {
/* 60 */     nDestroy(getHandle());
/*    */   }
/*    */   
/*    */   private static native void nChoosePixelFormat(ByteBuffer paramByteBuffer, PixelFormat paramPixelFormat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) throws LWJGLException;
/*    */   
/*    */   private static native void nDestroy(ByteBuffer paramByteBuffer);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */