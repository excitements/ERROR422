/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.DoubleBuffer;
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
/*     */ public final class GL40
/*     */ {
/*     */   public static final int GL_DRAW_INDIRECT_BUFFER = 36671;
/*     */   public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 36675;
/*     */   public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 34943;
/*     */   public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 36442;
/*     */   public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 36443;
/*     */   public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 36444;
/*     */   public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 36445;
/*     */   public static final int GL_MAX_VERTEX_STREAMS = 36465;
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
/*     */   public static final int GL_SAMPLE_SHADING = 35894;
/*     */   public static final int GL_MIN_SAMPLE_SHADING_VALUE = 35895;
/*     */   public static final int GL_ACTIVE_SUBROUTINES = 36325;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 36326;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 36423;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 36424;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 36425;
/*     */   public static final int GL_MAX_SUBROUTINES = 36327;
/*     */   public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 36328;
/*     */   public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 36426;
/*     */   public static final int GL_COMPATIBLE_SUBROUTINES = 36427;
/*     */   public static final int GL_UNIFORM_SIZE = 35384;
/*     */   public static final int GL_UNIFORM_NAME_LENGTH = 35385;
/*     */   public static final int GL_PATCHES = 14;
/*     */   public static final int GL_PATCH_VERTICES = 36466;
/*     */   public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 36467;
/*     */   public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 36468;
/*     */   public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 36469;
/*     */   public static final int GL_TESS_GEN_MODE = 36470;
/*     */   public static final int GL_TESS_GEN_SPACING = 36471;
/*     */   public static final int GL_TESS_GEN_VERTEX_ORDER = 36472;
/*     */   public static final int GL_TESS_GEN_POINT_MODE = 36473;
/*     */   public static final int GL_ISOLINES = 36474;
/*     */   public static final int GL_FRACTIONAL_ODD = 36475;
/*     */   public static final int GL_FRACTIONAL_EVEN = 36476;
/*     */   public static final int GL_MAX_PATCH_VERTICES = 36477;
/*     */   public static final int GL_MAX_TESS_GEN_LEVEL = 36478;
/*     */   public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 36479;
/*     */   public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 36480;
/*     */   public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 36481;
/*     */   public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 36482;
/*     */   public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 36483;
/*     */   public static final int GL_MAX_TESS_PATCH_COMPONENTS = 36484;
/*     */   public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 36485;
/*     */   public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 36486;
/*     */   public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 36489;
/*     */   public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 36490;
/*     */   public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 34924;
/*     */   public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 34925;
/*     */   public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 36382;
/*     */   public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 36383;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 34032;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 34033;
/*     */   public static final int GL_TESS_EVALUATION_SHADER = 36487;
/*     */   public static final int GL_TESS_CONTROL_SHADER = 36488;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 36873;
/*     */   public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 36874;
/*     */   public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 36875;
/*     */   public static final int GL_SAMPLER_CUBE_MAP_ARRAY = 36876;
/*     */   public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 36877;
/*     */   public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 36878;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 36879;
/*     */   public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 36446;
/*     */   public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 36447;
/*     */   public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB = 36767;
/*     */   public static final int GL_TRANSFORM_FEEDBACK = 36386;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 36387;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 36388;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BINDING = 36389;
/*     */   public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 36464;
/*     */   
/*     */   public static void glBlendEquationi(int buf, int mode) {
/* 204 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 205 */     long function_pointer = caps.GL40_glBlendEquationi_pointer;
/* 206 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 207 */     nglBlendEquationi(buf, mode, function_pointer);
/*     */   }
/*     */   private static native void nglBlendEquationi(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
/* 212 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 213 */     long function_pointer = caps.GL40_glBlendEquationSeparatei_pointer;
/* 214 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 215 */     nglBlendEquationSeparatei(buf, modeRGB, modeAlpha, function_pointer);
/*     */   }
/*     */   private static native void nglBlendEquationSeparatei(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glBlendFunci(int buf, int src, int dst) {
/* 220 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 221 */     long function_pointer = caps.GL40_glBlendFunci_pointer;
/* 222 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 223 */     nglBlendFunci(buf, src, dst, function_pointer);
/*     */   }
/*     */   private static native void nglBlendFunci(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
/* 228 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 229 */     long function_pointer = caps.GL40_glBlendFuncSeparatei_pointer;
/* 230 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 231 */     nglBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, function_pointer);
/*     */   }
/*     */   private static native void nglBlendFuncSeparatei(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glDrawArraysIndirect(int mode, IntBuffer indirect) {
/* 236 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 237 */     long function_pointer = caps.GL40_glDrawArraysIndirect_pointer;
/* 238 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 239 */     GLChecks.ensureIndirectBOdisabled(caps);
/* 240 */     BufferChecks.checkBuffer(indirect, 4);
/* 241 */     BufferChecks.checkNullTerminated(indirect);
/* 242 */     nglDrawArraysIndirect(mode, indirect, indirect.position(), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDrawArraysIndirect(int mode, long indirect_buffer_offset) {
/* 246 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 247 */     long function_pointer = caps.GL40_glDrawArraysIndirect_pointer;
/* 248 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 249 */     GLChecks.ensureIndirectBOenabled(caps);
/* 250 */     nglDrawArraysIndirectBO(mode, indirect_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglDrawArraysIndirect(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   private static native void nglDrawArraysIndirectBO(int paramInt, long paramLong1, long paramLong2);
/*     */   public static void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
/* 255 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 256 */     long function_pointer = caps.GL40_glDrawElementsIndirect_pointer;
/* 257 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 258 */     GLChecks.ensureIndirectBOdisabled(caps);
/* 259 */     BufferChecks.checkBuffer(indirect, 5);
/* 260 */     BufferChecks.checkNullTerminated(indirect);
/* 261 */     nglDrawElementsIndirect(mode, type, indirect, indirect.position(), function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsIndirect(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   public static void glDrawElementsIndirect(int mode, int type, long indirect_buffer_offset) {
/* 265 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 266 */     long function_pointer = caps.GL40_glDrawElementsIndirect_pointer;
/* 267 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 268 */     GLChecks.ensureIndirectBOenabled(caps);
/* 269 */     nglDrawElementsIndirectBO(mode, type, indirect_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsIndirectBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glUniform1d(int location, double x) {
/* 274 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 275 */     long function_pointer = caps.GL40_glUniform1d_pointer;
/* 276 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 277 */     nglUniform1d(location, x, function_pointer);
/*     */   }
/*     */   private static native void nglUniform1d(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glUniform2d(int location, double x, double y) {
/* 282 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 283 */     long function_pointer = caps.GL40_glUniform2d_pointer;
/* 284 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 285 */     nglUniform2d(location, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglUniform2d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glUniform3d(int location, double x, double y, double z) {
/* 290 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 291 */     long function_pointer = caps.GL40_glUniform3d_pointer;
/* 292 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 293 */     nglUniform3d(location, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglUniform3d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glUniform4d(int location, double x, double y, double z, double w) {
/* 298 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 299 */     long function_pointer = caps.GL40_glUniform4d_pointer;
/* 300 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 301 */     nglUniform4d(location, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglUniform4d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glUniform1(int location, DoubleBuffer value) {
/* 306 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 307 */     long function_pointer = caps.GL40_glUniform1dv_pointer;
/* 308 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 309 */     BufferChecks.checkDirect(value);
/* 310 */     nglUniform1dv(location, value.remaining(), value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform1dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform2(int location, DoubleBuffer value) {
/* 315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 316 */     long function_pointer = caps.GL40_glUniform2dv_pointer;
/* 317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 318 */     BufferChecks.checkDirect(value);
/* 319 */     nglUniform2dv(location, value.remaining() >> 1, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform2dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3(int location, DoubleBuffer value) {
/* 324 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 325 */     long function_pointer = caps.GL40_glUniform3dv_pointer;
/* 326 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 327 */     BufferChecks.checkDirect(value);
/* 328 */     nglUniform3dv(location, value.remaining() / 3, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform3dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform4(int location, DoubleBuffer value) {
/* 333 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 334 */     long function_pointer = caps.GL40_glUniform4dv_pointer;
/* 335 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 336 */     BufferChecks.checkDirect(value);
/* 337 */     nglUniform4dv(location, value.remaining() >> 2, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform4dv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2(int location, boolean transpose, DoubleBuffer value) {
/* 342 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 343 */     long function_pointer = caps.GL40_glUniformMatrix2dv_pointer;
/* 344 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 345 */     BufferChecks.checkDirect(value);
/* 346 */     nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3(int location, boolean transpose, DoubleBuffer value) {
/* 351 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 352 */     long function_pointer = caps.GL40_glUniformMatrix3dv_pointer;
/* 353 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 354 */     BufferChecks.checkDirect(value);
/* 355 */     nglUniformMatrix3dv(location, value.remaining() / 9, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4(int location, boolean transpose, DoubleBuffer value) {
/* 360 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 361 */     long function_pointer = caps.GL40_glUniformMatrix4dv_pointer;
/* 362 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 363 */     BufferChecks.checkDirect(value);
/* 364 */     nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2x3(int location, boolean transpose, DoubleBuffer value) {
/* 369 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 370 */     long function_pointer = caps.GL40_glUniformMatrix2x3dv_pointer;
/* 371 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 372 */     BufferChecks.checkDirect(value);
/* 373 */     nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2x3dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2x4(int location, boolean transpose, DoubleBuffer value) {
/* 378 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 379 */     long function_pointer = caps.GL40_glUniformMatrix2x4dv_pointer;
/* 380 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 381 */     BufferChecks.checkDirect(value);
/* 382 */     nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2x4dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3x2(int location, boolean transpose, DoubleBuffer value) {
/* 387 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 388 */     long function_pointer = caps.GL40_glUniformMatrix3x2dv_pointer;
/* 389 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 390 */     BufferChecks.checkDirect(value);
/* 391 */     nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3x2dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3x4(int location, boolean transpose, DoubleBuffer value) {
/* 396 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 397 */     long function_pointer = caps.GL40_glUniformMatrix3x4dv_pointer;
/* 398 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 399 */     BufferChecks.checkDirect(value);
/* 400 */     nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3x4dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4x2(int location, boolean transpose, DoubleBuffer value) {
/* 405 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 406 */     long function_pointer = caps.GL40_glUniformMatrix4x2dv_pointer;
/* 407 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 408 */     BufferChecks.checkDirect(value);
/* 409 */     nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4x2dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4x3(int location, boolean transpose, DoubleBuffer value) {
/* 414 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 415 */     long function_pointer = caps.GL40_glUniformMatrix4x3dv_pointer;
/* 416 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 417 */     BufferChecks.checkDirect(value);
/* 418 */     nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4x3dv(int paramInt1, int paramInt2, boolean paramBoolean, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniform(int program, int location, DoubleBuffer params) {
/* 423 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 424 */     long function_pointer = caps.GL40_glGetUniformdv_pointer;
/* 425 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 426 */     BufferChecks.checkDirect(params);
/* 427 */     nglGetUniformdv(program, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformdv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMinSampleShading(float value) {
/* 432 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 433 */     long function_pointer = caps.GL40_glMinSampleShading_pointer;
/* 434 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 435 */     nglMinSampleShading(value, function_pointer);
/*     */   }
/*     */   private static native void nglMinSampleShading(float paramFloat, long paramLong);
/*     */   
/*     */   public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
/* 440 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 441 */     long function_pointer = caps.GL40_glGetSubroutineUniformLocation_pointer;
/* 442 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 443 */     BufferChecks.checkDirect(name);
/* 444 */     BufferChecks.checkNullTerminated(name);
/* 445 */     int __result = nglGetSubroutineUniformLocation(program, shadertype, name, name.position(), function_pointer);
/* 446 */     return __result;
/*     */   }
/*     */   private static native int nglGetSubroutineUniformLocation(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
/* 451 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 452 */     long function_pointer = caps.GL40_glGetSubroutineIndex_pointer;
/* 453 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 454 */     BufferChecks.checkDirect(name);
/* 455 */     BufferChecks.checkNullTerminated(name);
/* 456 */     int __result = nglGetSubroutineIndex(program, shadertype, name, name.position(), function_pointer);
/* 457 */     return __result;
/*     */   }
/*     */   private static native int nglGetSubroutineIndex(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname, IntBuffer values) {
/* 462 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 463 */     long function_pointer = caps.GL40_glGetActiveSubroutineUniformiv_pointer;
/* 464 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 465 */     BufferChecks.checkBuffer(values, 1);
/* 466 */     nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values, values.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveSubroutineUniformiv(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static int glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname) {
/* 472 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 473 */     long function_pointer = caps.GL40_glGetActiveSubroutineUniformiv_pointer;
/* 474 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 475 */     IntBuffer values = APIUtils.getBufferInt();
/* 476 */     nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values, values.position(), function_pointer);
/* 477 */     return values.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
/* 481 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 482 */     long function_pointer = caps.GL40_glGetActiveSubroutineUniformName_pointer;
/* 483 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 484 */     if (length != null)
/* 485 */       BufferChecks.checkBuffer(length, 1); 
/* 486 */     BufferChecks.checkDirect(name);
/* 487 */     nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), length, (length != null) ? length.position() : 0, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveSubroutineUniformName(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, ByteBuffer paramByteBuffer, int paramInt6, long paramLong);
/*     */   
/*     */   public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
/* 493 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 494 */     long function_pointer = caps.GL40_glGetActiveSubroutineUniformName_pointer;
/* 495 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 496 */     IntBuffer name_length = APIUtils.getLengths();
/* 497 */     ByteBuffer name = APIUtils.getBufferByte(bufsize);
/* 498 */     nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, name_length, 0, name, name.position(), function_pointer);
/* 499 */     name.limit(name_length.get(0));
/* 500 */     return APIUtils.getString(name);
/*     */   }
/*     */   
/*     */   public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
/* 504 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 505 */     long function_pointer = caps.GL40_glGetActiveSubroutineName_pointer;
/* 506 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 507 */     if (length != null)
/* 508 */       BufferChecks.checkBuffer(length, 1); 
/* 509 */     BufferChecks.checkDirect(name);
/* 510 */     nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), length, (length != null) ? length.position() : 0, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveSubroutineName(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, ByteBuffer paramByteBuffer, int paramInt6, long paramLong);
/*     */   
/*     */   public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
/* 516 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 517 */     long function_pointer = caps.GL40_glGetActiveSubroutineName_pointer;
/* 518 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 519 */     IntBuffer name_length = APIUtils.getLengths();
/* 520 */     ByteBuffer name = APIUtils.getBufferByte(bufsize);
/* 521 */     nglGetActiveSubroutineName(program, shadertype, index, bufsize, name_length, 0, name, name.position(), function_pointer);
/* 522 */     name.limit(name_length.get(0));
/* 523 */     return APIUtils.getString(name);
/*     */   }
/*     */   
/*     */   public static void glUniformSubroutinesu(int shadertype, IntBuffer indices) {
/* 527 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 528 */     long function_pointer = caps.GL40_glUniformSubroutinesuiv_pointer;
/* 529 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 530 */     BufferChecks.checkDirect(indices);
/* 531 */     nglUniformSubroutinesuiv(shadertype, indices.remaining(), indices, indices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformSubroutinesuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformSubroutineu(int shadertype, int location, IntBuffer params) {
/* 536 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 537 */     long function_pointer = caps.GL40_glGetUniformSubroutineuiv_pointer;
/* 538 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 539 */     BufferChecks.checkBuffer(params, 1);
/* 540 */     nglGetUniformSubroutineuiv(shadertype, location, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetUniformSubroutineuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetUniformSubroutineu(int shadertype, int location) {
/* 546 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 547 */     long function_pointer = caps.GL40_glGetUniformSubroutineuiv_pointer;
/* 548 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 549 */     IntBuffer params = APIUtils.getBufferInt();
/* 550 */     nglGetUniformSubroutineuiv(shadertype, location, params, params.position(), function_pointer);
/* 551 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetProgramStage(int program, int shadertype, int pname, IntBuffer values) {
/* 555 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 556 */     long function_pointer = caps.GL40_glGetProgramStageiv_pointer;
/* 557 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 558 */     BufferChecks.checkBuffer(values, 1);
/* 559 */     nglGetProgramStageiv(program, shadertype, pname, values, values.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetProgramStageiv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetProgramStage(int program, int shadertype, int pname) {
/* 565 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 566 */     long function_pointer = caps.GL40_glGetProgramStageiv_pointer;
/* 567 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 568 */     IntBuffer values = APIUtils.getBufferInt();
/* 569 */     nglGetProgramStageiv(program, shadertype, pname, values, values.position(), function_pointer);
/* 570 */     return values.get(0);
/*     */   }
/*     */   
/*     */   public static void glPatchParameteri(int pname, int value) {
/* 574 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 575 */     long function_pointer = caps.GL40_glPatchParameteri_pointer;
/* 576 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 577 */     nglPatchParameteri(pname, value, function_pointer);
/*     */   }
/*     */   private static native void nglPatchParameteri(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glPatchParameter(int pname, FloatBuffer values) {
/* 582 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 583 */     long function_pointer = caps.GL40_glPatchParameterfv_pointer;
/* 584 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 585 */     BufferChecks.checkBuffer(values, 4);
/* 586 */     nglPatchParameterfv(pname, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglPatchParameterfv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glBindTransformFeedback(int target, int id) {
/* 591 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 592 */     long function_pointer = caps.GL40_glBindTransformFeedback_pointer;
/* 593 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 594 */     nglBindTransformFeedback(target, id, function_pointer);
/*     */   }
/*     */   private static native void nglBindTransformFeedback(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteTransformFeedbacks(IntBuffer ids) {
/* 599 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 600 */     long function_pointer = caps.GL40_glDeleteTransformFeedbacks_pointer;
/* 601 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 602 */     BufferChecks.checkDirect(ids);
/* 603 */     nglDeleteTransformFeedbacks(ids.remaining(), ids, ids.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteTransformFeedbacks(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteTransformFeedbacks(int id) {
/* 609 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 610 */     long function_pointer = caps.GL40_glDeleteTransformFeedbacks_pointer;
/* 611 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 612 */     nglDeleteTransformFeedbacks(1, APIUtils.getBufferInt().put(0, id), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenTransformFeedbacks(IntBuffer ids) {
/* 616 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 617 */     long function_pointer = caps.GL40_glGenTransformFeedbacks_pointer;
/* 618 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 619 */     BufferChecks.checkDirect(ids);
/* 620 */     nglGenTransformFeedbacks(ids.remaining(), ids, ids.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenTransformFeedbacks(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenTransformFeedbacks() {
/* 626 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 627 */     long function_pointer = caps.GL40_glGenTransformFeedbacks_pointer;
/* 628 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 629 */     IntBuffer ids = APIUtils.getBufferInt();
/* 630 */     nglGenTransformFeedbacks(1, ids, ids.position(), function_pointer);
/* 631 */     return ids.get(0);
/*     */   }
/*     */   
/*     */   public static boolean glIsTransformFeedback(int id) {
/* 635 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 636 */     long function_pointer = caps.GL40_glIsTransformFeedback_pointer;
/* 637 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 638 */     boolean __result = nglIsTransformFeedback(id, function_pointer);
/* 639 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsTransformFeedback(int paramInt, long paramLong);
/*     */   
/*     */   public static void glPauseTransformFeedback() {
/* 644 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 645 */     long function_pointer = caps.GL40_glPauseTransformFeedback_pointer;
/* 646 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 647 */     nglPauseTransformFeedback(function_pointer);
/*     */   }
/*     */   private static native void nglPauseTransformFeedback(long paramLong);
/*     */   
/*     */   public static void glResumeTransformFeedback() {
/* 652 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 653 */     long function_pointer = caps.GL40_glResumeTransformFeedback_pointer;
/* 654 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 655 */     nglResumeTransformFeedback(function_pointer);
/*     */   }
/*     */   private static native void nglResumeTransformFeedback(long paramLong);
/*     */   
/*     */   public static void glDrawTransformFeedback(int mode, int id) {
/* 660 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 661 */     long function_pointer = caps.GL40_glDrawTransformFeedback_pointer;
/* 662 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 663 */     nglDrawTransformFeedback(mode, id, function_pointer);
/*     */   }
/*     */   private static native void nglDrawTransformFeedback(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDrawTransformFeedbackStream(int mode, int id, int stream) {
/* 668 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 669 */     long function_pointer = caps.GL40_glDrawTransformFeedbackStream_pointer;
/* 670 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 671 */     nglDrawTransformFeedbackStream(mode, id, stream, function_pointer);
/*     */   }
/*     */   private static native void nglDrawTransformFeedbackStream(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glBeginQueryIndexed(int target, int index, int id) {
/* 676 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 677 */     long function_pointer = caps.GL40_glBeginQueryIndexed_pointer;
/* 678 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 679 */     nglBeginQueryIndexed(target, index, id, function_pointer);
/*     */   }
/*     */   private static native void nglBeginQueryIndexed(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glEndQueryIndexed(int target, int index) {
/* 684 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 685 */     long function_pointer = caps.GL40_glEndQueryIndexed_pointer;
/* 686 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 687 */     nglEndQueryIndexed(target, index, function_pointer);
/*     */   }
/*     */   private static native void nglEndQueryIndexed(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glGetQueryIndexed(int target, int index, int pname, IntBuffer params) {
/* 692 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 693 */     long function_pointer = caps.GL40_glGetQueryIndexediv_pointer;
/* 694 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 695 */     BufferChecks.checkBuffer(params, 1);
/* 696 */     nglGetQueryIndexediv(target, index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryIndexediv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetQueryIndexed(int target, int index, int pname) {
/* 702 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 703 */     long function_pointer = caps.GL40_glGetQueryIndexediv_pointer;
/* 704 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 705 */     IntBuffer params = APIUtils.getBufferInt();
/* 706 */     nglGetQueryIndexediv(target, index, pname, params, params.position(), function_pointer);
/* 707 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL40.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */