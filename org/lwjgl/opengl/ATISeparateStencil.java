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
/*    */ public final class ATISeparateStencil
/*    */ {
/*    */   public static final int GL_STENCIL_BACK_FUNC_ATI = 34816;
/*    */   public static final int GL_STENCIL_BACK_FAIL_ATI = 34817;
/*    */   public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = 34818;
/*    */   public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = 34819;
/*    */   
/*    */   public static void glStencilOpSeparateATI(int face, int sfail, int dpfail, int dppass) {
/* 20 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 21 */     long function_pointer = caps.ATI_separate_stencil_glStencilOpSeparateATI_pointer;
/* 22 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 23 */     nglStencilOpSeparateATI(face, sfail, dpfail, dppass, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glStencilFuncSeparateATI(int frontfunc, int backfunc, int ref, int mask) {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.ATI_separate_stencil_glStencilFuncSeparateATI_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     nglStencilFuncSeparateATI(frontfunc, backfunc, ref, mask, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglStencilOpSeparateATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */   
/*    */   private static native void nglStencilFuncSeparateATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATISeparateStencil.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */