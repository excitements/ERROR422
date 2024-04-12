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
/*    */ public final class EXTBlendEquationSeparate
/*    */ {
/*    */   public static final int GL_BLEND_EQUATION_RGB_EXT = 32777;
/*    */   public static final int GL_BLEND_EQUATION_ALPHA_EXT = 34877;
/*    */   
/*    */   public static void glBlendEquationSeparateEXT(int modeRGB, int modeAlpha) {
/* 22 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 23 */     long function_pointer = caps.EXT_blend_equation_separate_glBlendEquationSeparateEXT_pointer;
/* 24 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 25 */     nglBlendEquationSeparateEXT(modeRGB, modeAlpha, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBlendEquationSeparateEXT(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTBlendEquationSeparate.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */