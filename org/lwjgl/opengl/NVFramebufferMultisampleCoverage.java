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
/*    */ public final class NVFramebufferMultisampleCoverage
/*    */ {
/*    */   public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 36011;
/*    */   public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = 36368;
/*    */   public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 36369;
/*    */   public static final int GL_MULITSAMPLE_COVERAGE_MODES_NV = 36370;
/*    */   
/*    */   public static void glRenderbufferStorageMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.NV_framebuffer_multisample_coverage_glRenderbufferStorageMultisampleCoverageNV_pointer;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     nglRenderbufferStorageMultisampleCoverageNV(target, coverageSamples, colorSamples, internalformat, width, height, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglRenderbufferStorageMultisampleCoverageNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVFramebufferMultisampleCoverage.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */