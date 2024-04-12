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
/*    */ public final class ARBSampleShading
/*    */ {
/*    */   public static final int GL_SAMPLE_SHADING_ARB = 35894;
/*    */   public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 35895;
/*    */   
/*    */   public static void glMinSampleShadingARB(float value) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.ARB_sample_shading_glMinSampleShadingARB_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglMinSampleShadingARB(value, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglMinSampleShadingARB(float paramFloat, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBSampleShading.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */