/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.FloatBuffer;
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
/*     */ 
/*     */ 
/*     */ public final class ARBSamplerObjects
/*     */ {
/*     */   public static final int GL_SAMPLER_BINDING = 35097;
/*     */   
/*     */   public static void glGenSamplers(IntBuffer samplers) {
/*  21 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  22 */     long function_pointer = caps.ARB_sampler_objects_glGenSamplers_pointer;
/*  23 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  24 */     BufferChecks.checkDirect(samplers);
/*  25 */     nglGenSamplers(samplers.remaining(), samplers, samplers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenSamplers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenSamplers() {
/*  31 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  32 */     long function_pointer = caps.ARB_sampler_objects_glGenSamplers_pointer;
/*  33 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  34 */     IntBuffer samplers = APIUtils.getBufferInt();
/*  35 */     nglGenSamplers(1, samplers, samplers.position(), function_pointer);
/*  36 */     return samplers.get(0);
/*     */   }
/*     */   
/*     */   public static void glDeleteSamplers(IntBuffer samplers) {
/*  40 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  41 */     long function_pointer = caps.ARB_sampler_objects_glDeleteSamplers_pointer;
/*  42 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  43 */     BufferChecks.checkDirect(samplers);
/*  44 */     nglDeleteSamplers(samplers.remaining(), samplers, samplers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteSamplers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteSamplers(int sampler) {
/*  50 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  51 */     long function_pointer = caps.ARB_sampler_objects_glDeleteSamplers_pointer;
/*  52 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  53 */     nglDeleteSamplers(1, APIUtils.getBufferInt().put(0, sampler), 0, function_pointer);
/*     */   }
/*     */   private static native boolean nglIsSampler(int paramInt, long paramLong);
/*     */   public static boolean glIsSampler(int sampler) {
/*  57 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  58 */     long function_pointer = caps.ARB_sampler_objects_glIsSampler_pointer;
/*  59 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  60 */     boolean __result = nglIsSampler(sampler, function_pointer);
/*  61 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBindSampler(int unit, int sampler) {
/*  66 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  67 */     long function_pointer = caps.ARB_sampler_objects_glBindSampler_pointer;
/*  68 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  69 */     nglBindSampler(unit, sampler, function_pointer);
/*     */   }
/*     */   private static native void nglBindSampler(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glSamplerParameteri(int sampler, int pname, int param) {
/*  74 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  75 */     long function_pointer = caps.ARB_sampler_objects_glSamplerParameteri_pointer;
/*  76 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  77 */     nglSamplerParameteri(sampler, pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameterf(int sampler, int pname, float param) {
/*  82 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  83 */     long function_pointer = caps.ARB_sampler_objects_glSamplerParameterf_pointer;
/*  84 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  85 */     nglSamplerParameterf(sampler, pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glSamplerParameter(int sampler, int pname, IntBuffer params) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.ARB_sampler_objects_glSamplerParameteriv_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     BufferChecks.checkBuffer(params, 4);
/*  94 */     nglSamplerParameteriv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameter(int sampler, int pname, FloatBuffer params) {
/*  99 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 100 */     long function_pointer = caps.ARB_sampler_objects_glSamplerParameterfv_pointer;
/* 101 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 102 */     BufferChecks.checkBuffer(params, 4);
/* 103 */     nglSamplerParameterfv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameterI(int sampler, int pname, IntBuffer params) {
/* 108 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 109 */     long function_pointer = caps.ARB_sampler_objects_glSamplerParameterIiv_pointer;
/* 110 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 111 */     BufferChecks.checkBuffer(params, 4);
/* 112 */     nglSamplerParameterIiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterIiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameterIu(int sampler, int pname, IntBuffer params) {
/* 117 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 118 */     long function_pointer = caps.ARB_sampler_objects_glSamplerParameterIuiv_pointer;
/* 119 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 120 */     BufferChecks.checkBuffer(params, 4);
/* 121 */     nglSamplerParameterIuiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterIuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetSamplerParameter(int sampler, int pname, IntBuffer params) {
/* 126 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 127 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameteriv_pointer;
/* 128 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 129 */     BufferChecks.checkBuffer(params, 4);
/* 130 */     nglGetSamplerParameteriv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSamplerParameteri(int sampler, int pname) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameteriv_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     IntBuffer params = APIUtils.getBufferInt();
/* 140 */     nglGetSamplerParameteriv(sampler, pname, params, params.position(), function_pointer);
/* 141 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSamplerParameter(int sampler, int pname, FloatBuffer params) {
/* 145 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 146 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameterfv_pointer;
/* 147 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 148 */     BufferChecks.checkBuffer(params, 4);
/* 149 */     nglGetSamplerParameterfv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static float glGetSamplerParameterf(int sampler, int pname) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameterfv_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 159 */     nglGetSamplerParameterfv(sampler, pname, params, params.position(), function_pointer);
/* 160 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSamplerParameterI(int sampler, int pname, IntBuffer params) {
/* 164 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 165 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameterIiv_pointer;
/* 166 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 167 */     BufferChecks.checkBuffer(params, 4);
/* 168 */     nglGetSamplerParameterIiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameterIiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSamplerParameterIi(int sampler, int pname) {
/* 174 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 175 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameterIiv_pointer;
/* 176 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 177 */     IntBuffer params = APIUtils.getBufferInt();
/* 178 */     nglGetSamplerParameterIiv(sampler, pname, params, params.position(), function_pointer);
/* 179 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSamplerParameterIu(int sampler, int pname, IntBuffer params) {
/* 183 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 184 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameterIuiv_pointer;
/* 185 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 186 */     BufferChecks.checkBuffer(params, 4);
/* 187 */     nglGetSamplerParameterIuiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameterIuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSamplerParameterIui(int sampler, int pname) {
/* 193 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 194 */     long function_pointer = caps.ARB_sampler_objects_glGetSamplerParameterIuiv_pointer;
/* 195 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 196 */     IntBuffer params = APIUtils.getBufferInt();
/* 197 */     nglGetSamplerParameterIuiv(sampler, pname, params, params.position(), function_pointer);
/* 198 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBSamplerObjects.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */