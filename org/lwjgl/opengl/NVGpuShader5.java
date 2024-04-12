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
/*     */ public final class NVGpuShader5
/*     */ {
/*     */   public static final int GL_INT64_NV = 5134;
/*     */   public static final int GL_UNSIGNED_INT64_NV = 5135;
/*     */   public static final int GL_INT8_NV = 36832;
/*     */   public static final int GL_INT8_VEC2_NV = 36833;
/*     */   public static final int GL_INT8_VEC3_NV = 36834;
/*     */   public static final int GL_INT8_VEC4_NV = 36835;
/*     */   public static final int GL_INT16_NV = 36836;
/*     */   public static final int GL_INT16_VEC2_NV = 36837;
/*     */   public static final int GL_INT16_VEC3_NV = 36838;
/*     */   public static final int GL_INT16_VEC4_NV = 36839;
/*     */   public static final int GL_INT64_VEC2_NV = 36841;
/*     */   public static final int GL_INT64_VEC3_NV = 36842;
/*     */   public static final int GL_INT64_VEC4_NV = 36843;
/*     */   public static final int GL_UNSIGNED_INT8_NV = 36844;
/*     */   public static final int GL_UNSIGNED_INT8_VEC2_NV = 36845;
/*     */   public static final int GL_UNSIGNED_INT8_VEC3_NV = 36846;
/*     */   public static final int GL_UNSIGNED_INT8_VEC4_NV = 36847;
/*     */   public static final int GL_UNSIGNED_INT16_NV = 36848;
/*     */   public static final int GL_UNSIGNED_INT16_VEC2_NV = 36849;
/*     */   public static final int GL_UNSIGNED_INT16_VEC3_NV = 36850;
/*     */   public static final int GL_UNSIGNED_INT16_VEC4_NV = 36851;
/*     */   public static final int GL_UNSIGNED_INT64_VEC2_NV = 36853;
/*     */   public static final int GL_UNSIGNED_INT64_VEC3_NV = 36854;
/*     */   public static final int GL_UNSIGNED_INT64_VEC4_NV = 36855;
/*     */   public static final int GL_FLOAT16_NV = 36856;
/*     */   public static final int GL_FLOAT16_VEC2_NV = 36857;
/*     */   public static final int GL_FLOAT16_VEC3_NV = 36858;
/*     */   public static final int GL_FLOAT16_VEC4_NV = 36859;
/*     */   public static final int GL_PATCHES = 14;
/*     */   
/*     */   private static native void nglUniform1i64NV(int paramInt, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glUniform1i64NV(int location, long x) {
/*  52 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  53 */     long function_pointer = caps.NV_gpu_shader5_glUniform1i64NV_pointer;
/*  54 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  55 */     nglUniform1i64NV(location, x, function_pointer);
/*     */   }
/*     */   private static native void nglUniform2i64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glUniform2i64NV(int location, long x, long y) {
/*  60 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  61 */     long function_pointer = caps.NV_gpu_shader5_glUniform2i64NV_pointer;
/*  62 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  63 */     nglUniform2i64NV(location, x, y, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glUniform3i64NV(int location, long x, long y, long z) {
/*  68 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  69 */     long function_pointer = caps.NV_gpu_shader5_glUniform3i64NV_pointer;
/*  70 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  71 */     nglUniform3i64NV(location, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglUniform3i64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glUniform4i64NV(int location, long x, long y, long z, long w) {
/*  76 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  77 */     long function_pointer = caps.NV_gpu_shader5_glUniform4i64NV_pointer;
/*  78 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  79 */     nglUniform4i64NV(location, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglUniform4i64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   public static void glUniform1NV(int location, int count, LongBuffer value) {
/*  84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  85 */     long function_pointer = caps.NV_gpu_shader5_glUniform1i64vNV_pointer;
/*  86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  87 */     BufferChecks.checkBuffer(value, 1);
/*  88 */     nglUniform1i64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform1i64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform2NV(int location, int count, LongBuffer value) {
/*  93 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  94 */     long function_pointer = caps.NV_gpu_shader5_glUniform2i64vNV_pointer;
/*  95 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  96 */     BufferChecks.checkBuffer(value, 2);
/*  97 */     nglUniform2i64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform2i64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3NV(int location, int count, LongBuffer value) {
/* 102 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 103 */     long function_pointer = caps.NV_gpu_shader5_glUniform3i64vNV_pointer;
/* 104 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 105 */     BufferChecks.checkBuffer(value, 3);
/* 106 */     nglUniform3i64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform3i64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform4NV(int location, int count, LongBuffer value) {
/* 111 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 112 */     long function_pointer = caps.NV_gpu_shader5_glUniform4i64vNV_pointer;
/* 113 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 114 */     BufferChecks.checkBuffer(value, 4);
/* 115 */     nglUniform4i64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform4i64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform1ui64NV(int location, long x) {
/* 120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 121 */     long function_pointer = caps.NV_gpu_shader5_glUniform1ui64NV_pointer;
/* 122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 123 */     nglUniform1ui64NV(location, x, function_pointer);
/*     */   }
/*     */   private static native void nglUniform1ui64NV(int paramInt, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glUniform2ui64NV(int location, long x, long y) {
/* 128 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 129 */     long function_pointer = caps.NV_gpu_shader5_glUniform2ui64NV_pointer;
/* 130 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 131 */     nglUniform2ui64NV(location, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglUniform2ui64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glUniform3ui64NV(int location, long x, long y, long z) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.NV_gpu_shader5_glUniform3ui64NV_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     nglUniform3ui64NV(location, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglUniform3ui64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glUniform4ui64NV(int location, long x, long y, long z, long w) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.NV_gpu_shader5_glUniform4ui64NV_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     nglUniform4ui64NV(location, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglUniform4ui64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   public static void glUniform1uNV(int location, int count, LongBuffer value) {
/* 152 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 153 */     long function_pointer = caps.NV_gpu_shader5_glUniform1ui64vNV_pointer;
/* 154 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 155 */     BufferChecks.checkBuffer(value, 1);
/* 156 */     nglUniform1ui64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform1ui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform2uNV(int location, int count, LongBuffer value) {
/* 161 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 162 */     long function_pointer = caps.NV_gpu_shader5_glUniform2ui64vNV_pointer;
/* 163 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 164 */     BufferChecks.checkBuffer(value, 2);
/* 165 */     nglUniform2ui64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform2ui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3uNV(int location, int count, LongBuffer value) {
/* 170 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 171 */     long function_pointer = caps.NV_gpu_shader5_glUniform3ui64vNV_pointer;
/* 172 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 173 */     BufferChecks.checkBuffer(value, 3);
/* 174 */     nglUniform3ui64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform3ui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform4uNV(int location, int count, LongBuffer value) {
/* 179 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 180 */     long function_pointer = caps.NV_gpu_shader5_glUniform4ui64vNV_pointer;
/* 181 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 182 */     BufferChecks.checkBuffer(value, 4);
/* 183 */     nglUniform4ui64vNV(location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform4ui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformNV(int program, int location, LongBuffer params) {
/* 188 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 189 */     long function_pointer = caps.NV_gpu_shader5_glGetUniformi64vNV_pointer;
/* 190 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 191 */     BufferChecks.checkDirect(params);
/* 192 */     nglGetUniformi64vNV(program, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformi64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformuNV(int program, int location, LongBuffer params) {
/* 197 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 198 */     long function_pointer = caps.NV_gpu_shader5_glGetUniformui64vNV_pointer;
/* 199 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 200 */     BufferChecks.checkDirect(params);
/* 201 */     nglGetUniformui64vNV(program, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramUniform1i64NV(int program, int location, long x) {
/* 206 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 207 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform1i64NV_pointer;
/* 208 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 209 */     nglProgramUniform1i64NV(program, location, x, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform1i64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glProgramUniform2i64NV(int program, int location, long x, long y) {
/* 214 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 215 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform2i64NV_pointer;
/* 216 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 217 */     nglProgramUniform2i64NV(program, location, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform2i64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glProgramUniform3i64NV(int program, int location, long x, long y, long z) {
/* 222 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 223 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform3i64NV_pointer;
/* 224 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 225 */     nglProgramUniform3i64NV(program, location, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform3i64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
/* 230 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 231 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform4i64NV_pointer;
/* 232 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 233 */     nglProgramUniform4i64NV(program, location, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform4i64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   public static void glProgramUniform1NV(int program, int location, int count, LongBuffer value) {
/* 238 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 239 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform1i64vNV_pointer;
/* 240 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 241 */     BufferChecks.checkBuffer(value, 1);
/* 242 */     nglProgramUniform1i64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform1i64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform2NV(int program, int location, int count, LongBuffer value) {
/* 247 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 248 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform2i64vNV_pointer;
/* 249 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 250 */     BufferChecks.checkBuffer(value, 2);
/* 251 */     nglProgramUniform2i64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform2i64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform3NV(int program, int location, int count, LongBuffer value) {
/* 256 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 257 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform3i64vNV_pointer;
/* 258 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 259 */     BufferChecks.checkBuffer(value, 3);
/* 260 */     nglProgramUniform3i64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform3i64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform4NV(int program, int location, int count, LongBuffer value) {
/* 265 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 266 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform4i64vNV_pointer;
/* 267 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 268 */     BufferChecks.checkBuffer(value, 4);
/* 269 */     nglProgramUniform4i64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform4i64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform1ui64NV(int program, int location, long x) {
/* 274 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 275 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform1ui64NV_pointer;
/* 276 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 277 */     nglProgramUniform1ui64NV(program, location, x, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform1ui64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glProgramUniform2ui64NV(int program, int location, long x, long y) {
/* 282 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 283 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform2ui64NV_pointer;
/* 284 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 285 */     nglProgramUniform2ui64NV(program, location, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform2ui64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
/* 290 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 291 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform3ui64NV_pointer;
/* 292 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 293 */     nglProgramUniform3ui64NV(program, location, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform3ui64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
/* 298 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 299 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform4ui64NV_pointer;
/* 300 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 301 */     nglProgramUniform4ui64NV(program, location, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform4ui64NV(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   public static void glProgramUniform1uNV(int program, int location, int count, LongBuffer value) {
/* 306 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 307 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform1ui64vNV_pointer;
/* 308 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 309 */     BufferChecks.checkBuffer(value, 1);
/* 310 */     nglProgramUniform1ui64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform1ui64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform2uNV(int program, int location, int count, LongBuffer value) {
/* 315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 316 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform2ui64vNV_pointer;
/* 317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 318 */     BufferChecks.checkBuffer(value, 2);
/* 319 */     nglProgramUniform2ui64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform2ui64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform3uNV(int program, int location, int count, LongBuffer value) {
/* 324 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 325 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform3ui64vNV_pointer;
/* 326 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 327 */     BufferChecks.checkBuffer(value, 3);
/* 328 */     nglProgramUniform3ui64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform3ui64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform4uNV(int program, int location, int count, LongBuffer value) {
/* 333 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 334 */     long function_pointer = caps.NV_gpu_shader5_glProgramUniform4ui64vNV_pointer;
/* 335 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 336 */     BufferChecks.checkBuffer(value, 4);
/* 337 */     nglProgramUniform4ui64vNV(program, location, count, value, value.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglProgramUniform4ui64vNV(int paramInt1, int paramInt2, int paramInt3, LongBuffer paramLongBuffer, int paramInt4, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVGpuShader5.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */