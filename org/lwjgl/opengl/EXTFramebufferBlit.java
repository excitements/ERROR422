/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import org.lwjgl.BufferChecks;
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
/*    */ public final class EXTFramebufferBlit
/*    */ {
/*    */   public static final int GL_READ_FRAMEBUFFER_EXT = 36008;
/*    */   public static final int GL_DRAW_FRAMEBUFFER_EXT = 36009;
/*    */   public static final int GL_DRAW_FRAMEBUFFER_BINDING_EXT = 36006;
/*    */   public static final int GL_READ_FRAMEBUFFER_BINDING_EXT = 36010;
/*    */   
/*    */   public static void glBlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
/* 46 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 47 */     long function_pointer = caps.EXT_framebuffer_blit_glBlitFramebufferEXT_pointer;
/* 48 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 49 */     nglBlitFramebufferEXT(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBlitFramebufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTFramebufferBlit.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */