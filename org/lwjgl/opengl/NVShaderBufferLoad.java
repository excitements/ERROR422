/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.LongBuffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NVShaderBufferLoad
/*     */ {
/*     */   public static final int GL_BUFFER_GPU_ADDRESS_NV = 36637;
/*     */   public static final int GL_GPU_ADDRESS_NV = 36660;
/*     */   public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 36661;
/*     */   
/*     */   private static native void nglMakeBufferResidentNV(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glMakeBufferResidentNV(int target, int access) {
/*  29 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  30 */     long function_pointer = caps.NV_shader_buffer_load_glMakeBufferResidentNV_pointer;
/*  31 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  32 */     nglMakeBufferResidentNV(target, access, function_pointer);
/*     */   }
/*     */   private static native void nglMakeBufferNonResidentNV(int paramInt, long paramLong);
/*     */   
/*     */   public static void glMakeBufferNonResidentNV(int target) {
/*  37 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  38 */     long function_pointer = caps.NV_shader_buffer_load_glMakeBufferNonResidentNV_pointer;
/*  39 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  40 */     nglMakeBufferNonResidentNV(target, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean glIsBufferResidentNV(int target) {
/*  45 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  46 */     long function_pointer = caps.NV_shader_buffer_load_glIsBufferResidentNV_pointer;
/*  47 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  48 */     boolean __result = nglIsBufferResidentNV(target, function_pointer);
/*  49 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsBufferResidentNV(int paramInt, long paramLong);
/*     */   
/*     */   public static void glMakeNamedBufferResidentNV(int buffer, int access) {
/*  54 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  55 */     long function_pointer = caps.NV_shader_buffer_load_glMakeNamedBufferResidentNV_pointer;
/*  56 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  57 */     nglMakeNamedBufferResidentNV(buffer, access, function_pointer);
/*     */   }
/*     */   private static native void nglMakeNamedBufferResidentNV(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glMakeNamedBufferNonResidentNV(int buffer) {
/*  62 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  63 */     long function_pointer = caps.NV_shader_buffer_load_glMakeNamedBufferNonResidentNV_pointer;
/*  64 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  65 */     nglMakeNamedBufferNonResidentNV(buffer, function_pointer);
/*     */   }
/*     */   private static native void nglMakeNamedBufferNonResidentNV(int paramInt, long paramLong);
/*     */   
/*     */   public static boolean glIsNamedBufferResidentNV(int buffer) {
/*  70 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  71 */     long function_pointer = caps.NV_shader_buffer_load_glIsNamedBufferResidentNV_pointer;
/*  72 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  73 */     boolean __result = nglIsNamedBufferResidentNV(buffer, function_pointer);
/*  74 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsNamedBufferResidentNV(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetBufferParameteruNV(int target, int pname, LongBuffer params) {
/*  79 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  80 */     long function_pointer = caps.NV_shader_buffer_load_glGetBufferParameterui64vNV_pointer;
/*  81 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  82 */     BufferChecks.checkBuffer(params, 1);
/*  83 */     nglGetBufferParameterui64vNV(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetBufferParameterui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static long glGetBufferParameteruNV(int target, int pname) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.NV_shader_buffer_load_glGetBufferParameterui64vNV_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     LongBuffer params = APIUtils.getBufferLong();
/*  93 */     nglGetBufferParameterui64vNV(target, pname, params, params.position(), function_pointer);
/*  94 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetNamedBufferParameteruNV(int buffer, int pname, LongBuffer params) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.NV_shader_buffer_load_glGetNamedBufferParameterui64vNV_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     BufferChecks.checkBuffer(params, 1);
/* 102 */     nglGetNamedBufferParameterui64vNV(buffer, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetNamedBufferParameterui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static long glGetNamedBufferParameteruNV(int buffer, int pname) {
/* 108 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 109 */     long function_pointer = caps.NV_shader_buffer_load_glGetNamedBufferParameterui64vNV_pointer;
/* 110 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 111 */     LongBuffer params = APIUtils.getBufferLong();
/* 112 */     nglGetNamedBufferParameterui64vNV(buffer, pname, params, params.position(), function_pointer);
/* 113 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetIntegeruNV(int value, LongBuffer result) {
/* 117 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 118 */     long function_pointer = caps.NV_shader_buffer_load_glGetIntegerui64vNV_pointer;
/* 119 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 120 */     BufferChecks.checkBuffer(result, 1);
/* 121 */     nglGetIntegerui64vNV(value, result, result.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetIntegerui64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static long glGetIntegeruNV(int value) {
/* 127 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 128 */     long function_pointer = caps.NV_shader_buffer_load_glGetIntegerui64vNV_pointer;
/* 129 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 130 */     LongBuffer result = APIUtils.getBufferLong();
/* 131 */     nglGetIntegerui64vNV(value, result, result.position(), function_pointer);
/* 132 */     return result.get(0);
/*     */   }
/*     */   
/*     */   public static void glUniformui64NV(int location, long value) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.NV_shader_buffer_load_glUniformui64NV_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     nglUniformui64NV(location, value, function_pointer);
/*     */   }
/*     */   private static native void nglUniformui64NV(int paramInt, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glUniformuNV(int location, LongBuffer value) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.NV_shader_buffer_load_glUniformui64vNV_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     BufferChecks.checkDirect(value);
/* 148 */     nglUniformui64vNV(location, value.remaining(), value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformuNV(int program, int location, LongBuffer params) {
/* 153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 154 */     long function_pointer = caps.NV_shader_buffer_load_glGetUniformui64vNV_pointer;
/* 155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 156 */     BufferChecks.checkBuffer(params, 1);
/* 157 */     nglGetUniformui64vNV(program, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramUniformui64NV(int program, int location, long value) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.NV_shader_buffer_load_glProgramUniformui64NV_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     nglProgramUniformui64NV(program, location, value, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformui64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glProgramUniformuNV(int program, int location, LongBuffer value) {
/* 170 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 171 */     long function_pointer = caps.NV_shader_buffer_load_glProgramUniformui64vNV_pointer;
/* 172 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 173 */     BufferChecks.checkDirect(value);
/* 174 */     nglProgramUniformui64vNV(program, location, value.remaining(), value, value.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglProgramUniformui64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVShaderBufferLoad.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */