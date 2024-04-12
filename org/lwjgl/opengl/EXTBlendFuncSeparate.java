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
/*    */ public final class EXTBlendFuncSeparate
/*    */ {
/*    */   public static final int GL_BLEND_DST_RGB_EXT = 32968;
/*    */   public static final int GL_BLEND_SRC_RGB_EXT = 32969;
/*    */   public static final int GL_BLEND_DST_ALPHA_EXT = 32970;
/*    */   public static final int GL_BLEND_SRC_ALPHA_EXT = 32971;
/*    */   
/*    */   public static void glBlendFuncSeparateEXT(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
/* 20 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 21 */     long function_pointer = caps.EXT_blend_func_separate_glBlendFuncSeparateEXT_pointer;
/* 22 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 23 */     nglBlendFuncSeparateEXT(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBlendFuncSeparateEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTBlendFuncSeparate.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */