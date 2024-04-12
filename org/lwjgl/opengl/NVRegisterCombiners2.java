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
/*    */ public final class NVRegisterCombiners2
/*    */ {
/*    */   public static final int GL_PER_STAGE_CONSTANTS_NV = 34101;
/*    */   
/*    */   public static void glCombinerStageParameterNV(int stage, int pname, FloatBuffer params) {
/* 17 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 18 */     long function_pointer = caps.NV_register_combiners2_glCombinerStageParameterfvNV_pointer;
/* 19 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 20 */     BufferChecks.checkBuffer(params, 4);
/* 21 */     nglCombinerStageParameterfvNV(stage, pname, params, params.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetCombinerStageParameterNV(int stage, int pname, FloatBuffer params) {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.NV_register_combiners2_glGetCombinerStageParameterfvNV_pointer;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     BufferChecks.checkBuffer(params, 4);
/* 30 */     nglGetCombinerStageParameterfvNV(stage, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglCombinerStageParameterfvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   private static native void nglGetCombinerStageParameterfvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVRegisterCombiners2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */