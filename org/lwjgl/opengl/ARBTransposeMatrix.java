/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ARBTransposeMatrix
/*    */ {
/*    */   public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 34019;
/*    */   public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 34020;
/*    */   public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 34021;
/*    */   public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 34022;
/*    */   
/*    */   public static void glLoadTransposeMatrixARB(FloatBuffer pfMtx) {
/* 20 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 21 */     long function_pointer = caps.ARB_transpose_matrix_glLoadTransposeMatrixfARB_pointer;
/* 22 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 23 */     BufferChecks.checkBuffer(pfMtx, 16);
/* 24 */     nglLoadTransposeMatrixfARB(pfMtx, pfMtx.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glMultTransposeMatrixARB(FloatBuffer pfMtx) {
/* 29 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 30 */     long function_pointer = caps.ARB_transpose_matrix_glMultTransposeMatrixfARB_pointer;
/* 31 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 32 */     BufferChecks.checkBuffer(pfMtx, 16);
/* 33 */     nglMultTransposeMatrixfARB(pfMtx, pfMtx.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglLoadTransposeMatrixfARB(FloatBuffer paramFloatBuffer, int paramInt, long paramLong);
/*    */   
/*    */   private static native void nglMultTransposeMatrixfARB(FloatBuffer paramFloatBuffer, int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBTransposeMatrix.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */