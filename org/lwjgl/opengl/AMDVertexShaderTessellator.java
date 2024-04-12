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
/*    */ public final class AMDVertexShaderTessellator
/*    */ {
/*    */   public static final int GL_SAMPLER_BUFFER_AMD = 36865;
/*    */   public static final int GL_INT_SAMPLER_BUFFER_AMD = 36866;
/*    */   public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 36867;
/*    */   public static final int GL_DISCRETE_AMD = 36870;
/*    */   public static final int GL_CONTINUOUS_AMD = 36871;
/*    */   public static final int GL_TESSELLATION_MODE_AMD = 36868;
/*    */   public static final int GL_TESSELLATION_FACTOR_AMD = 36869;
/*    */   
/*    */   public static void glTessellationFactorAMD(float factor) {
/* 35 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 36 */     long function_pointer = caps.AMD_vertex_shader_tessellator_glTessellationFactorAMD_pointer;
/* 37 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 38 */     nglTessellationFactorAMD(factor, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glTessellationModeAMD(int mode) {
/* 43 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 44 */     long function_pointer = caps.AMD_vertex_shader_tessellator_glTessellationModeAMD_pointer;
/* 45 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 46 */     nglTessellationModeAMD(mode, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglTessellationFactorAMD(float paramFloat, long paramLong);
/*    */   
/*    */   private static native void nglTessellationModeAMD(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\AMDVertexShaderTessellator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */