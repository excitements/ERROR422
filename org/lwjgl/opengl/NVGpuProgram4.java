/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NVGpuProgram4
/*     */ {
/*     */   public static final int GL_PROGRAM_ATTRIB_COMPONENTS_NV = 35078;
/*     */   public static final int GL_PROGRAM_RESULT_COMPONENTS_NV = 35079;
/*     */   public static final int GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV = 35080;
/*     */   public static final int GL_MAX_PROGRAM_RESULT_COMPONENTS_NV = 35081;
/*     */   public static final int GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV = 36261;
/*     */   public static final int GL_MAX_PROGRAM_GENERIC_RESULTS_NV = 36262;
/*     */   
/*     */   private static native void nglProgramLocalParameterI4iNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameterI4iNV(int target, int index, int x, int y, int z, int w) {
/*  25 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  26 */     long function_pointer = caps.NV_gpu_program4_glProgramLocalParameterI4iNV_pointer;
/*  27 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  28 */     nglProgramLocalParameterI4iNV(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParameterI4ivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameterI4NV(int target, int index, IntBuffer params) {
/*  33 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  34 */     long function_pointer = caps.NV_gpu_program4_glProgramLocalParameterI4ivNV_pointer;
/*  35 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  36 */     BufferChecks.checkBuffer(params, 4);
/*  37 */     nglProgramLocalParameterI4ivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glProgramLocalParametersI4NV(int target, int index, IntBuffer params) {
/*  42 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  43 */     long function_pointer = caps.NV_gpu_program4_glProgramLocalParametersI4ivNV_pointer;
/*  44 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  45 */     BufferChecks.checkDirect(params);
/*  46 */     nglProgramLocalParametersI4ivNV(target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParametersI4ivNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
/*  51 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  52 */     long function_pointer = caps.NV_gpu_program4_glProgramLocalParameterI4uiNV_pointer;
/*  53 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  54 */     nglProgramLocalParameterI4uiNV(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParameterI4uiNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameterI4uNV(int target, int index, IntBuffer params) {
/*  59 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  60 */     long function_pointer = caps.NV_gpu_program4_glProgramLocalParameterI4uivNV_pointer;
/*  61 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  62 */     BufferChecks.checkBuffer(params, 4);
/*  63 */     nglProgramLocalParameterI4uivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParameterI4uivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParametersI4uNV(int target, int index, IntBuffer params) {
/*  68 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  69 */     long function_pointer = caps.NV_gpu_program4_glProgramLocalParametersI4uivNV_pointer;
/*  70 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  71 */     BufferChecks.checkDirect(params);
/*  72 */     nglProgramLocalParametersI4uivNV(target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParametersI4uivNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParameterI4iNV(int target, int index, int x, int y, int z, int w) {
/*  77 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  78 */     long function_pointer = caps.NV_gpu_program4_glProgramEnvParameterI4iNV_pointer;
/*  79 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  80 */     nglProgramEnvParameterI4iNV(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameterI4iNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParameterI4NV(int target, int index, IntBuffer params) {
/*  85 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  86 */     long function_pointer = caps.NV_gpu_program4_glProgramEnvParameterI4ivNV_pointer;
/*  87 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  88 */     BufferChecks.checkBuffer(params, 4);
/*  89 */     nglProgramEnvParameterI4ivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameterI4ivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParametersI4NV(int target, int index, IntBuffer params) {
/*  94 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  95 */     long function_pointer = caps.NV_gpu_program4_glProgramEnvParametersI4ivNV_pointer;
/*  96 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  97 */     BufferChecks.checkDirect(params);
/*  98 */     nglProgramEnvParametersI4ivNV(target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParametersI4ivNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.NV_gpu_program4_glProgramEnvParameterI4uiNV_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     nglProgramEnvParameterI4uiNV(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameterI4uiNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParameterI4uNV(int target, int index, IntBuffer params) {
/* 111 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 112 */     long function_pointer = caps.NV_gpu_program4_glProgramEnvParameterI4uivNV_pointer;
/* 113 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 114 */     BufferChecks.checkBuffer(params, 4);
/* 115 */     nglProgramEnvParameterI4uivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameterI4uivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParametersI4uNV(int target, int index, IntBuffer params) {
/* 120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 121 */     long function_pointer = caps.NV_gpu_program4_glProgramEnvParametersI4uivNV_pointer;
/* 122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 123 */     BufferChecks.checkDirect(params);
/* 124 */     nglProgramEnvParametersI4uivNV(target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParametersI4uivNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetProgramLocalParameterINV(int target, int index, IntBuffer params) {
/* 129 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 130 */     long function_pointer = caps.NV_gpu_program4_glGetProgramLocalParameterIivNV_pointer;
/* 131 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 132 */     BufferChecks.checkBuffer(params, 4);
/* 133 */     nglGetProgramLocalParameterIivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramLocalParameterIivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramLocalParameterIuNV(int target, int index, IntBuffer params) {
/* 138 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 139 */     long function_pointer = caps.NV_gpu_program4_glGetProgramLocalParameterIuivNV_pointer;
/* 140 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 141 */     BufferChecks.checkBuffer(params, 4);
/* 142 */     nglGetProgramLocalParameterIuivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramLocalParameterIuivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramEnvParameterINV(int target, int index, IntBuffer params) {
/* 147 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 148 */     long function_pointer = caps.NV_gpu_program4_glGetProgramEnvParameterIivNV_pointer;
/* 149 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 150 */     BufferChecks.checkBuffer(params, 4);
/* 151 */     nglGetProgramEnvParameterIivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramEnvParameterIivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramEnvParameterIuNV(int target, int index, IntBuffer params) {
/* 156 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 157 */     long function_pointer = caps.NV_gpu_program4_glGetProgramEnvParameterIuivNV_pointer;
/* 158 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 159 */     BufferChecks.checkBuffer(params, 4);
/* 160 */     nglGetProgramEnvParameterIuivNV(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetProgramEnvParameterIuivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVGpuProgram4.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */