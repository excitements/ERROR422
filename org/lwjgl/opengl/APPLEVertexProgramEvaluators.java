/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.DoubleBuffer;
/*    */ import java.nio.FloatBuffer;
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
/*    */ public final class APPLEVertexProgramEvaluators
/*    */ {
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_APPLE = 35328;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_APPLE = 35329;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = 35330;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = 35331;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = 35332;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 35333;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = 35334;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = 35335;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = 35336;
/*    */   public static final int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 35337;
/*    */   
/*    */   private static native void nglEnableVertexAttribAPPLE(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glEnableVertexAttribAPPLE(int index, int pname) {
/* 34 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 35 */     long function_pointer = caps.APPLE_vertex_program_evaluators_glEnableVertexAttribAPPLE_pointer;
/* 36 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 37 */     nglEnableVertexAttribAPPLE(index, pname, function_pointer);
/*    */   }
/*    */   private static native void nglDisableVertexAttribAPPLE(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDisableVertexAttribAPPLE(int index, int pname) {
/* 42 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 43 */     long function_pointer = caps.APPLE_vertex_program_evaluators_glDisableVertexAttribAPPLE_pointer;
/* 44 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 45 */     nglDisableVertexAttribAPPLE(index, pname, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean glIsVertexAttribEnabledAPPLE(int index, int pname) {
/* 50 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 51 */     long function_pointer = caps.APPLE_vertex_program_evaluators_glIsVertexAttribEnabledAPPLE_pointer;
/* 52 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 53 */     boolean __result = nglIsVertexAttribEnabledAPPLE(index, pname, function_pointer);
/* 54 */     return __result;
/*    */   }
/*    */   private static native boolean nglIsVertexAttribEnabledAPPLE(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, DoubleBuffer points) {
/* 59 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 60 */     long function_pointer = caps.APPLE_vertex_program_evaluators_glMapVertexAttrib1dAPPLE_pointer;
/* 61 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 62 */     BufferChecks.checkDirect(points);
/* 63 */     nglMapVertexAttrib1dAPPLE(index, size, u1, u2, stride, order, points, points.position(), function_pointer);
/*    */   }
/*    */   private static native void nglMapVertexAttrib1dAPPLE(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, DoubleBuffer paramDoubleBuffer, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, FloatBuffer points) {
/* 68 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 69 */     long function_pointer = caps.APPLE_vertex_program_evaluators_glMapVertexAttrib1fAPPLE_pointer;
/* 70 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 71 */     BufferChecks.checkDirect(points);
/* 72 */     nglMapVertexAttrib1fAPPLE(index, size, u1, u2, stride, order, points, points.position(), function_pointer);
/*    */   }
/*    */   private static native void nglMapVertexAttrib1fAPPLE(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
/* 77 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 78 */     long function_pointer = caps.APPLE_vertex_program_evaluators_glMapVertexAttrib2dAPPLE_pointer;
/* 79 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 80 */     BufferChecks.checkDirect(points);
/* 81 */     nglMapVertexAttrib2dAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, points.position(), function_pointer);
/*    */   }
/*    */   private static native void nglMapVertexAttrib2dAPPLE(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, double paramDouble3, double paramDouble4, int paramInt5, int paramInt6, DoubleBuffer paramDoubleBuffer, int paramInt7, long paramLong);
/*    */   
/*    */   public static void glMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
/* 86 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 87 */     long function_pointer = caps.APPLE_vertex_program_evaluators_glMapVertexAttrib2fAPPLE_pointer;
/* 88 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 89 */     BufferChecks.checkDirect(points);
/* 90 */     nglMapVertexAttrib2fAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, points.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglMapVertexAttrib2fAPPLE(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, int paramInt5, int paramInt6, FloatBuffer paramFloatBuffer, int paramInt7, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLEVertexProgramEvaluators.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */