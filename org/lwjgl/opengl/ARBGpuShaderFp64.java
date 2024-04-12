/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.DoubleBuffer;
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
/*     */ public final class ARBGpuShaderFp64
/*     */ {
/*     */   public static final int GL_DOUBLE = 5130;
/*     */   public static final int GL_DOUBLE_VEC2 = 36860;
/*     */   public static final int GL_DOUBLE_VEC3 = 36861;
/*     */   public static final int GL_DOUBLE_VEC4 = 36862;
/*     */   public static final int GL_DOUBLE_MAT2 = 36678;
/*     */   public static final int GL_DOUBLE_MAT3 = 36679;
/*     */   public static final int GL_DOUBLE_MAT4 = 36680;
/*     */   public static final int GL_DOUBLE_MAT2x3 = 36681;
/*     */   public static final int GL_DOUBLE_MAT2x4 = 36682;
/*     */   public static final int GL_DOUBLE_MAT3x2 = 36683;
/*     */   public static final int GL_DOUBLE_MAT3x4 = 36684;
/*     */   public static final int GL_DOUBLE_MAT4x2 = 36685;
/*     */   public static final int GL_DOUBLE_MAT4x3 = 36686;
/*     */   
/*     */   private static native void nglUniform1d(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glUniform1d(int location, double x) {
/*  33 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  34 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform1d_pointer;
/*  35 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  36 */     nglUniform1d(location, x, function_pointer);
/*     */   }
/*     */   private static native void nglUniform2d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glUniform2d(int location, double x, double y) {
/*  41 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  42 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform2d_pointer;
/*  43 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  44 */     nglUniform2d(location, x, y, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glUniform3d(int location, double x, double y, double z) {
/*  49 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  50 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform3d_pointer;
/*  51 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  52 */     nglUniform3d(location, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglUniform3d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glUniform4d(int location, double x, double y, double z, double w) {
/*  57 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  58 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform4d_pointer;
/*  59 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  60 */     nglUniform4d(location, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglUniform4d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glUniform1(int location, DoubleBuffer value) {
/*  65 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  66 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform1dv_pointer;
/*  67 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  68 */     BufferChecks.checkDirect(value);
/*  69 */     nglUniform1dv(location, value.remaining(), value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform1dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform2(int location, DoubleBuffer value) {
/*  74 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  75 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform2dv_pointer;
/*  76 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  77 */     BufferChecks.checkDirect(value);
/*  78 */     nglUniform2dv(location, value.remaining() >> 1, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform2dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3(int location, DoubleBuffer value) {
/*  83 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  84 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform3dv_pointer;
/*  85 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  86 */     BufferChecks.checkDirect(value);
/*  87 */     nglUniform3dv(location, value.remaining() / 3, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform3dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform4(int location, DoubleBuffer value) {
/*  92 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  93 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniform4dv_pointer;
/*  94 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  95 */     BufferChecks.checkDirect(value);
/*  96 */     nglUniform4dv(location, value.remaining() >> 2, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform4dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2(int location, boolean transpose, DoubleBuffer value) {
/* 101 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 102 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix2dv_pointer;
/* 103 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 104 */     BufferChecks.checkDirect(value);
/* 105 */     nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3(int location, boolean transpose, DoubleBuffer value) {
/* 110 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 111 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix3dv_pointer;
/* 112 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 113 */     BufferChecks.checkDirect(value);
/* 114 */     nglUniformMatrix3dv(location, value.remaining() / 9, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4(int location, boolean transpose, DoubleBuffer value) {
/* 119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 120 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix4dv_pointer;
/* 121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 122 */     BufferChecks.checkDirect(value);
/* 123 */     nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2x3(int location, boolean transpose, DoubleBuffer value) {
/* 128 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 129 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix2x3dv_pointer;
/* 130 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 131 */     BufferChecks.checkDirect(value);
/* 132 */     nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2x3dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2x4(int location, boolean transpose, DoubleBuffer value) {
/* 137 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 138 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix2x4dv_pointer;
/* 139 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 140 */     BufferChecks.checkDirect(value);
/* 141 */     nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2x4dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3x2(int location, boolean transpose, DoubleBuffer value) {
/* 146 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 147 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix3x2dv_pointer;
/* 148 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 149 */     BufferChecks.checkDirect(value);
/* 150 */     nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3x2dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3x4(int location, boolean transpose, DoubleBuffer value) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix3x4dv_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     BufferChecks.checkDirect(value);
/* 159 */     nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3x4dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4x2(int location, boolean transpose, DoubleBuffer value) {
/* 164 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 165 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix4x2dv_pointer;
/* 166 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 167 */     BufferChecks.checkDirect(value);
/* 168 */     nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4x2dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4x3(int location, boolean transpose, DoubleBuffer value) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.ARB_gpu_shader_fp64_glUniformMatrix4x3dv_pointer;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     BufferChecks.checkDirect(value);
/* 177 */     nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4x3dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniform(int program, int location, DoubleBuffer params) {
/* 182 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 183 */     long function_pointer = caps.ARB_gpu_shader_fp64_glGetUniformdv_pointer;
/* 184 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 185 */     BufferChecks.checkDirect(params);
/* 186 */     nglGetUniformdv(program, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformdv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramUniform1dEXT(int program, int location, double x) {
/* 191 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 192 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform1dEXT_pointer;
/* 193 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 194 */     nglProgramUniform1dEXT(program, location, x, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform1dEXT(int paramInt1, int paramInt2, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glProgramUniform2dEXT(int program, int location, double x, double y) {
/* 199 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 200 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform2dEXT_pointer;
/* 201 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 202 */     nglProgramUniform2dEXT(program, location, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform2dEXT(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glProgramUniform3dEXT(int program, int location, double x, double y, double z) {
/* 207 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 208 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform3dEXT_pointer;
/* 209 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 210 */     nglProgramUniform3dEXT(program, location, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform3dEXT(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glProgramUniform4dEXT(int program, int location, double x, double y, double z, double w) {
/* 215 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 216 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform4dEXT_pointer;
/* 217 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 218 */     nglProgramUniform4dEXT(program, location, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform4dEXT(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform1EXT(int program, int location, DoubleBuffer value) {
/* 223 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 224 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform1dvEXT_pointer;
/* 225 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 226 */     BufferChecks.checkDirect(value);
/* 227 */     nglProgramUniform1dvEXT(program, location, value.remaining(), value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform1dvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform2EXT(int program, int location, DoubleBuffer value) {
/* 232 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 233 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform2dvEXT_pointer;
/* 234 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 235 */     BufferChecks.checkDirect(value);
/* 236 */     nglProgramUniform2dvEXT(program, location, value.remaining() >> 1, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform2dvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform3EXT(int program, int location, DoubleBuffer value) {
/* 241 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 242 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform3dvEXT_pointer;
/* 243 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 244 */     BufferChecks.checkDirect(value);
/* 245 */     nglProgramUniform3dvEXT(program, location, value.remaining() / 3, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform3dvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniform4EXT(int program, int location, DoubleBuffer value) {
/* 250 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 251 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniform4dvEXT_pointer;
/* 252 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 253 */     BufferChecks.checkDirect(value);
/* 254 */     nglProgramUniform4dvEXT(program, location, value.remaining() >> 2, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniform4dvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix2EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 259 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 260 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix2dvEXT_pointer;
/* 261 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 262 */     BufferChecks.checkDirect(value);
/* 263 */     nglProgramUniformMatrix2dvEXT(program, location, value.remaining() >> 2, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix2dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix3EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 268 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 269 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix3dvEXT_pointer;
/* 270 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 271 */     BufferChecks.checkDirect(value);
/* 272 */     nglProgramUniformMatrix3dvEXT(program, location, value.remaining() / 9, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix3dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix4EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 277 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 278 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix4dvEXT_pointer;
/* 279 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 280 */     BufferChecks.checkDirect(value);
/* 281 */     nglProgramUniformMatrix4dvEXT(program, location, value.remaining() >> 4, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix4dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix2x3EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 286 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 287 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix2x3dvEXT_pointer;
/* 288 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 289 */     BufferChecks.checkDirect(value);
/* 290 */     nglProgramUniformMatrix2x3dvEXT(program, location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix2x3dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix2x4EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 295 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 296 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix2x4dvEXT_pointer;
/* 297 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 298 */     BufferChecks.checkDirect(value);
/* 299 */     nglProgramUniformMatrix2x4dvEXT(program, location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix2x4dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix3x2EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 304 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 305 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix3x2dvEXT_pointer;
/* 306 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 307 */     BufferChecks.checkDirect(value);
/* 308 */     nglProgramUniformMatrix3x2dvEXT(program, location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix3x2dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix3x4EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 313 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 314 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix3x4dvEXT_pointer;
/* 315 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 316 */     BufferChecks.checkDirect(value);
/* 317 */     nglProgramUniformMatrix3x4dvEXT(program, location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix3x4dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix4x2EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 322 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 323 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix4x2dvEXT_pointer;
/* 324 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 325 */     BufferChecks.checkDirect(value);
/* 326 */     nglProgramUniformMatrix4x2dvEXT(program, location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramUniformMatrix4x2dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramUniformMatrix4x3EXT(int program, int location, boolean transpose, DoubleBuffer value) {
/* 331 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 332 */     long function_pointer = caps.ARB_gpu_shader_fp64_glProgramUniformMatrix4x3dvEXT_pointer;
/* 333 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 334 */     BufferChecks.checkDirect(value);
/* 335 */     nglProgramUniformMatrix4x3dvEXT(program, location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglProgramUniformMatrix4x3dvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBGpuShaderFp64.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */