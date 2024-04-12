/*    */ package org.lwjgl.opengl;
/*    */ 
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
/*    */ abstract class WindowsPeerInfo
/*    */   extends PeerInfo
/*    */ {
/*    */   protected WindowsPeerInfo() {
/* 47 */     super(createHandle());
/*    */   }
/*    */   private static native ByteBuffer createHandle();
/*    */   
/*    */   protected static int choosePixelFormat(long hdc, int origin_x, int origin_y, PixelFormat pixel_format, IntBuffer pixel_format_caps, boolean use_hdc_bpp, boolean support_window, boolean support_pbuffer, boolean double_buffered) throws LWJGLException {
/* 52 */     return nChoosePixelFormat(hdc, origin_x, origin_y, pixel_format, pixel_format_caps, use_hdc_bpp, support_window, support_pbuffer, double_buffered);
/*    */   }
/*    */   
/*    */   private static native int nChoosePixelFormat(long paramLong, int paramInt1, int paramInt2, PixelFormat paramPixelFormat, IntBuffer paramIntBuffer, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) throws LWJGLException;
/*    */   
/*    */   public final long getHdc() {
/* 58 */     return nGetHdc(getHandle());
/*    */   }
/*    */   protected static native void setPixelFormat(long paramLong, int paramInt) throws LWJGLException;
/*    */   private static native long nGetHdc(ByteBuffer paramByteBuffer);
/*    */   public final long getHwnd() {
/* 63 */     return nGetHwnd(getHandle());
/*    */   }
/*    */   
/*    */   private static native long nGetHwnd(ByteBuffer paramByteBuffer);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */