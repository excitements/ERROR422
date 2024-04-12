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
/*    */ public final class EXTPointParameters
/*    */ {
/*    */   public static final int GL_POINT_SIZE_MIN_EXT = 33062;
/*    */   public static final int GL_POINT_SIZE_MAX_EXT = 33063;
/*    */   public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = 33064;
/*    */   public static final int GL_DISTANCE_ATTENUATION_EXT = 33065;
/*    */   
/*    */   public static void glPointParameterfEXT(int pname, float param) {
/* 20 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 21 */     long function_pointer = caps.EXT_point_parameters_glPointParameterfEXT_pointer;
/* 22 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 23 */     nglPointParameterfEXT(pname, param, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glPointParameterEXT(int pname, FloatBuffer pfParams) {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.EXT_point_parameters_glPointParameterfvEXT_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     BufferChecks.checkBuffer(pfParams, 4);
/* 32 */     nglPointParameterfvEXT(pname, pfParams, pfParams.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglPointParameterfEXT(int paramInt, float paramFloat, long paramLong);
/*    */   
/*    */   private static native void nglPointParameterfvEXT(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTPointParameters.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */