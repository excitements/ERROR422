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
/*    */ public final class ARBPointParameters
/*    */ {
/*    */   public static final int GL_POINT_SIZE_MIN_ARB = 33062;
/*    */   public static final int GL_POINT_SIZE_MAX_ARB = 33063;
/*    */   public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = 33064;
/*    */   public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = 33065;
/*    */   
/*    */   public static void glPointParameterfARB(int pname, float param) {
/* 20 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 21 */     long function_pointer = caps.ARB_point_parameters_glPointParameterfARB_pointer;
/* 22 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 23 */     nglPointParameterfARB(pname, param, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glPointParameterARB(int pname, FloatBuffer pfParams) {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.ARB_point_parameters_glPointParameterfvARB_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     BufferChecks.checkBuffer(pfParams, 4);
/* 32 */     nglPointParameterfvARB(pname, pfParams, pfParams.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglPointParameterfARB(int paramInt, float paramFloat, long paramLong);
/*    */   
/*    */   private static native void nglPointParameterfvARB(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBPointParameters.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */