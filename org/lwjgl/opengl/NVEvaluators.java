/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NVEvaluators
/*     */ {
/*     */   public static final int GL_EVAL_2D_NV = 34496;
/*     */   public static final int GL_EVAL_TRIANGULAR_2D_NV = 34497;
/*     */   public static final int GL_MAP_TESSELLATION_NV = 34498;
/*     */   public static final int GL_MAP_ATTRIB_U_ORDER_NV = 34499;
/*     */   public static final int GL_MAP_ATTRIB_V_ORDER_NV = 34500;
/*     */   public static final int GL_EVAL_FRACTIONAL_TESSELLATION_NV = 34501;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB0_NV = 34502;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB1_NV = 34503;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB2_NV = 34504;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB3_NV = 34505;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB4_NV = 34506;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB5_NV = 34507;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB6_NV = 34508;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB7_NV = 34509;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB8_NV = 34510;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB9_NV = 34511;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB10_NV = 34512;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB11_NV = 34513;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB12_NV = 34514;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB13_NV = 34515;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB14_NV = 34516;
/*     */   public static final int GL_EVAL_VERTEX_ATTRIB15_NV = 34517;
/*     */   public static final int GL_MAX_MAP_TESSELLATION_NV = 34518;
/*     */   public static final int GL_MAX_RATIONAL_EVAL_ORDER_NV = 34519;
/*     */   
/*     */   private static native void nglGetMapControlPointsNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, Buffer paramBuffer, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glGetMapControlPointsNV(int target, int index, int type, int ustride, int vstride, boolean packed, FloatBuffer pPoints) {
/*  40 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  41 */     long function_pointer = caps.NV_evaluators_glGetMapControlPointsNV_pointer;
/*  42 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  43 */     BufferChecks.checkDirect(pPoints);
/*  44 */     nglGetMapControlPointsNV(target, index, type, ustride, vstride, packed, pPoints, pPoints.position() << 2, function_pointer);
/*     */   }
/*     */   private static native void nglMapControlPointsNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, Buffer paramBuffer, int paramInt8, long paramLong);
/*     */   
/*     */   public static void glMapControlPointsNV(int target, int index, int type, int ustride, int vstride, int uorder, int vorder, boolean packed, FloatBuffer pPoints) {
/*  49 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  50 */     long function_pointer = caps.NV_evaluators_glMapControlPointsNV_pointer;
/*  51 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  52 */     BufferChecks.checkDirect(pPoints);
/*  53 */     nglMapControlPointsNV(target, index, type, ustride, vstride, uorder, vorder, packed, pPoints, pPoints.position() << 2, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glMapParameterNV(int target, int pname, FloatBuffer params) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.NV_evaluators_glMapParameterfvNV_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     BufferChecks.checkBuffer(params, 4);
/*  62 */     nglMapParameterfvNV(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMapParameterfvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMapParameterNV(int target, int pname, IntBuffer params) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.NV_evaluators_glMapParameterivNV_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     BufferChecks.checkBuffer(params, 4);
/*  71 */     nglMapParameterivNV(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMapParameterivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetMapParameterNV(int target, int pname, FloatBuffer params) {
/*  76 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  77 */     long function_pointer = caps.NV_evaluators_glGetMapParameterfvNV_pointer;
/*  78 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  79 */     BufferChecks.checkBuffer(params, 4);
/*  80 */     nglGetMapParameterfvNV(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetMapParameterfvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetMapParameterNV(int target, int pname, IntBuffer params) {
/*  85 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  86 */     long function_pointer = caps.NV_evaluators_glGetMapParameterivNV_pointer;
/*  87 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  88 */     BufferChecks.checkBuffer(params, 4);
/*  89 */     nglGetMapParameterivNV(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetMapParameterivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetMapAttribParameterNV(int target, int index, int pname, FloatBuffer params) {
/*  94 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  95 */     long function_pointer = caps.NV_evaluators_glGetMapAttribParameterfvNV_pointer;
/*  96 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  97 */     BufferChecks.checkBuffer(params, 4);
/*  98 */     nglGetMapAttribParameterfvNV(target, index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetMapAttribParameterfvNV(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetMapAttribParameterNV(int target, int index, int pname, IntBuffer params) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.NV_evaluators_glGetMapAttribParameterivNV_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     BufferChecks.checkBuffer(params, 4);
/* 107 */     nglGetMapAttribParameterivNV(target, index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetMapAttribParameterivNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glEvalMapsNV(int target, int mode) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.NV_evaluators_glEvalMapsNV_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     nglEvalMapsNV(target, mode, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglEvalMapsNV(int paramInt1, int paramInt2, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVEvaluators.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */