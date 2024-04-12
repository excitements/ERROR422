/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
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
/*     */ public final class GL33
/*     */ {
/*     */   public static final int GL_SRC1_COLOR = 35065;
/*     */   public static final int GL_SRC1_ALPHA = 34185;
/*     */   public static final int GL_ONE_MINUS_SRC1_COLOR = 35066;
/*     */   public static final int GL_ONE_MINUS_SRC1_ALPHA = 35067;
/*     */   public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 35068;
/*     */   public static final int GL_ANY_SAMPLES_PASSED = 35887;
/*     */   public static final int GL_SAMPLER_BINDING = 35097;
/*     */   public static final int GL_RGB10_A2UI = 36975;
/*     */   public static final int GL_TEXTURE_SWIZZLE_R = 36418;
/*     */   public static final int GL_TEXTURE_SWIZZLE_G = 36419;
/*     */   public static final int GL_TEXTURE_SWIZZLE_B = 36420;
/*     */   public static final int GL_TEXTURE_SWIZZLE_A = 36421;
/*     */   public static final int GL_TEXTURE_SWIZZLE_RGBA = 36422;
/*     */   public static final int GL_TIME_ELAPSED = 35007;
/*     */   public static final int GL_TIMESTAMP = 36392;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 35070;
/*     */   public static final int GL_INT_2_10_10_10_REV = 36255;
/*     */   
/*     */   public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name) {
/*  83 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  84 */     long function_pointer = caps.GL33_glBindFragDataLocationIndexed_pointer;
/*  85 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  86 */     BufferChecks.checkDirect(name);
/*  87 */     BufferChecks.checkNullTerminated(name);
/*  88 */     nglBindFragDataLocationIndexed(program, colorNumber, index, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglBindFragDataLocationIndexed(int paramInt1, int paramInt2, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
/*  94 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  95 */     long function_pointer = caps.GL33_glBindFragDataLocationIndexed_pointer;
/*  96 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  97 */     nglBindFragDataLocationIndexed(program, colorNumber, index, APIUtils.getBufferNT(name), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static int glGetFragDataIndex(int program, ByteBuffer name) {
/* 101 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 102 */     long function_pointer = caps.GL33_glGetFragDataIndex_pointer;
/* 103 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 104 */     BufferChecks.checkDirect(name);
/* 105 */     BufferChecks.checkNullTerminated(name);
/* 106 */     int __result = nglGetFragDataIndex(program, name, name.position(), function_pointer);
/* 107 */     return __result;
/*     */   }
/*     */   
/*     */   private static native int nglGetFragDataIndex(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGetFragDataIndex(int program, CharSequence name) {
/* 113 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 114 */     long function_pointer = caps.GL33_glGetFragDataIndex_pointer;
/* 115 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 116 */     int __result = nglGetFragDataIndex(program, APIUtils.getBufferNT(name), 0, function_pointer);
/* 117 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGenSamplers(IntBuffer samplers) {
/* 121 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 122 */     long function_pointer = caps.GL33_glGenSamplers_pointer;
/* 123 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 124 */     BufferChecks.checkDirect(samplers);
/* 125 */     nglGenSamplers(samplers.remaining(), samplers, samplers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenSamplers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenSamplers() {
/* 131 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 132 */     long function_pointer = caps.GL33_glGenSamplers_pointer;
/* 133 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 134 */     IntBuffer samplers = APIUtils.getBufferInt();
/* 135 */     nglGenSamplers(1, samplers, samplers.position(), function_pointer);
/* 136 */     return samplers.get(0);
/*     */   }
/*     */   
/*     */   public static void glDeleteSamplers(IntBuffer samplers) {
/* 140 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 141 */     long function_pointer = caps.GL33_glDeleteSamplers_pointer;
/* 142 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 143 */     BufferChecks.checkDirect(samplers);
/* 144 */     nglDeleteSamplers(samplers.remaining(), samplers, samplers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteSamplers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteSamplers(int sampler) {
/* 150 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 151 */     long function_pointer = caps.GL33_glDeleteSamplers_pointer;
/* 152 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 153 */     nglDeleteSamplers(1, APIUtils.getBufferInt().put(0, sampler), 0, function_pointer);
/*     */   }
/*     */   private static native boolean nglIsSampler(int paramInt, long paramLong);
/*     */   public static boolean glIsSampler(int sampler) {
/* 157 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 158 */     long function_pointer = caps.GL33_glIsSampler_pointer;
/* 159 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 160 */     boolean __result = nglIsSampler(sampler, function_pointer);
/* 161 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBindSampler(int unit, int sampler) {
/* 166 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 167 */     long function_pointer = caps.GL33_glBindSampler_pointer;
/* 168 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 169 */     nglBindSampler(unit, sampler, function_pointer);
/*     */   }
/*     */   private static native void nglBindSampler(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glSamplerParameteri(int sampler, int pname, int param) {
/* 174 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 175 */     long function_pointer = caps.GL33_glSamplerParameteri_pointer;
/* 176 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 177 */     nglSamplerParameteri(sampler, pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameterf(int sampler, int pname, float param) {
/* 182 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 183 */     long function_pointer = caps.GL33_glSamplerParameterf_pointer;
/* 184 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 185 */     nglSamplerParameterf(sampler, pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glSamplerParameter(int sampler, int pname, IntBuffer params) {
/* 190 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 191 */     long function_pointer = caps.GL33_glSamplerParameteriv_pointer;
/* 192 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 193 */     BufferChecks.checkBuffer(params, 4);
/* 194 */     nglSamplerParameteriv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameter(int sampler, int pname, FloatBuffer params) {
/* 199 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 200 */     long function_pointer = caps.GL33_glSamplerParameterfv_pointer;
/* 201 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 202 */     BufferChecks.checkBuffer(params, 4);
/* 203 */     nglSamplerParameterfv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameterI(int sampler, int pname, IntBuffer params) {
/* 208 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 209 */     long function_pointer = caps.GL33_glSamplerParameterIiv_pointer;
/* 210 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 211 */     BufferChecks.checkBuffer(params, 4);
/* 212 */     nglSamplerParameterIiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterIiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSamplerParameterIu(int sampler, int pname, IntBuffer params) {
/* 217 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 218 */     long function_pointer = caps.GL33_glSamplerParameterIuiv_pointer;
/* 219 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 220 */     BufferChecks.checkBuffer(params, 4);
/* 221 */     nglSamplerParameterIuiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSamplerParameterIuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetSamplerParameter(int sampler, int pname, IntBuffer params) {
/* 226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 227 */     long function_pointer = caps.GL33_glGetSamplerParameteriv_pointer;
/* 228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 229 */     BufferChecks.checkBuffer(params, 4);
/* 230 */     nglGetSamplerParameteriv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSamplerParameteri(int sampler, int pname) {
/* 236 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 237 */     long function_pointer = caps.GL33_glGetSamplerParameteriv_pointer;
/* 238 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 239 */     IntBuffer params = APIUtils.getBufferInt();
/* 240 */     nglGetSamplerParameteriv(sampler, pname, params, params.position(), function_pointer);
/* 241 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSamplerParameter(int sampler, int pname, FloatBuffer params) {
/* 245 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 246 */     long function_pointer = caps.GL33_glGetSamplerParameterfv_pointer;
/* 247 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 248 */     BufferChecks.checkBuffer(params, 4);
/* 249 */     nglGetSamplerParameterfv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static float glGetSamplerParameterf(int sampler, int pname) {
/* 255 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 256 */     long function_pointer = caps.GL33_glGetSamplerParameterfv_pointer;
/* 257 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 258 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 259 */     nglGetSamplerParameterfv(sampler, pname, params, params.position(), function_pointer);
/* 260 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSamplerParameterI(int sampler, int pname, IntBuffer params) {
/* 264 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 265 */     long function_pointer = caps.GL33_glGetSamplerParameterIiv_pointer;
/* 266 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 267 */     BufferChecks.checkBuffer(params, 4);
/* 268 */     nglGetSamplerParameterIiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameterIiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSamplerParameterIi(int sampler, int pname) {
/* 274 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 275 */     long function_pointer = caps.GL33_glGetSamplerParameterIiv_pointer;
/* 276 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 277 */     IntBuffer params = APIUtils.getBufferInt();
/* 278 */     nglGetSamplerParameterIiv(sampler, pname, params, params.position(), function_pointer);
/* 279 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSamplerParameterIu(int sampler, int pname, IntBuffer params) {
/* 283 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 284 */     long function_pointer = caps.GL33_glGetSamplerParameterIuiv_pointer;
/* 285 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 286 */     BufferChecks.checkBuffer(params, 4);
/* 287 */     nglGetSamplerParameterIuiv(sampler, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSamplerParameterIuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSamplerParameterIui(int sampler, int pname) {
/* 293 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 294 */     long function_pointer = caps.GL33_glGetSamplerParameterIuiv_pointer;
/* 295 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 296 */     IntBuffer params = APIUtils.getBufferInt();
/* 297 */     nglGetSamplerParameterIuiv(sampler, pname, params, params.position(), function_pointer);
/* 298 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glQueryCounter(int id, int target) {
/* 302 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 303 */     long function_pointer = caps.GL33_glQueryCounter_pointer;
/* 304 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 305 */     nglQueryCounter(id, target, function_pointer);
/*     */   }
/*     */   private static native void nglQueryCounter(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glGetQueryObject(int id, int pname, LongBuffer params) {
/* 310 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 311 */     long function_pointer = caps.GL33_glGetQueryObjecti64v_pointer;
/* 312 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 313 */     BufferChecks.checkBuffer(params, 1);
/* 314 */     nglGetQueryObjecti64v(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryObjecti64v(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static long glGetQueryObject(int id, int pname) {
/* 320 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 321 */     long function_pointer = caps.GL33_glGetQueryObjecti64v_pointer;
/* 322 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 323 */     LongBuffer params = APIUtils.getBufferLong();
/* 324 */     nglGetQueryObjecti64v(id, pname, params, params.position(), function_pointer);
/* 325 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetQueryObjectu(int id, int pname, LongBuffer params) {
/* 329 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 330 */     long function_pointer = caps.GL33_glGetQueryObjectui64v_pointer;
/* 331 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 332 */     BufferChecks.checkBuffer(params, 1);
/* 333 */     nglGetQueryObjectui64v(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryObjectui64v(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static long glGetQueryObjectu(int id, int pname) {
/* 339 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 340 */     long function_pointer = caps.GL33_glGetQueryObjectui64v_pointer;
/* 341 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 342 */     LongBuffer params = APIUtils.getBufferLong();
/* 343 */     nglGetQueryObjectui64v(id, pname, params, params.position(), function_pointer);
/* 344 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glVertexAttribDivisor(int index, int divisor) {
/* 348 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 349 */     long function_pointer = caps.GL33_glVertexAttribDivisor_pointer;
/* 350 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 351 */     nglVertexAttribDivisor(index, divisor, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribDivisor(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP2ui(int type, int value) {
/* 356 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 357 */     long function_pointer = caps.GL33_glVertexP2ui_pointer;
/* 358 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 359 */     nglVertexP2ui(type, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexP2ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP3ui(int type, int value) {
/* 364 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 365 */     long function_pointer = caps.GL33_glVertexP3ui_pointer;
/* 366 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 367 */     nglVertexP3ui(type, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP4ui(int type, int value) {
/* 372 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 373 */     long function_pointer = caps.GL33_glVertexP4ui_pointer;
/* 374 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 375 */     nglVertexP4ui(type, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexP4ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP2u(int type, IntBuffer value) {
/* 380 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 381 */     long function_pointer = caps.GL33_glVertexP2uiv_pointer;
/* 382 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 383 */     BufferChecks.checkBuffer(value, 2);
/* 384 */     nglVertexP2uiv(type, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexP2uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP3u(int type, IntBuffer value) {
/* 389 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 390 */     long function_pointer = caps.GL33_glVertexP3uiv_pointer;
/* 391 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 392 */     BufferChecks.checkBuffer(value, 3);
/* 393 */     nglVertexP3uiv(type, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP4u(int type, IntBuffer value) {
/* 398 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 399 */     long function_pointer = caps.GL33_glVertexP4uiv_pointer;
/* 400 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 401 */     BufferChecks.checkBuffer(value, 4);
/* 402 */     nglVertexP4uiv(type, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexP4uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP1ui(int type, int coords) {
/* 407 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 408 */     long function_pointer = caps.GL33_glTexCoordP1ui_pointer;
/* 409 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 410 */     nglTexCoordP1ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP1ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP2ui(int type, int coords) {
/* 415 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 416 */     long function_pointer = caps.GL33_glTexCoordP2ui_pointer;
/* 417 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 418 */     nglTexCoordP2ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP2ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP3ui(int type, int coords) {
/* 423 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 424 */     long function_pointer = caps.GL33_glTexCoordP3ui_pointer;
/* 425 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 426 */     nglTexCoordP3ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP4ui(int type, int coords) {
/* 431 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 432 */     long function_pointer = caps.GL33_glTexCoordP4ui_pointer;
/* 433 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 434 */     nglTexCoordP4ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP4ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP1u(int type, IntBuffer coords) {
/* 439 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 440 */     long function_pointer = caps.GL33_glTexCoordP1uiv_pointer;
/* 441 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 442 */     BufferChecks.checkBuffer(coords, 1);
/* 443 */     nglTexCoordP1uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP1uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP2u(int type, IntBuffer coords) {
/* 448 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 449 */     long function_pointer = caps.GL33_glTexCoordP2uiv_pointer;
/* 450 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 451 */     BufferChecks.checkBuffer(coords, 2);
/* 452 */     nglTexCoordP2uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP2uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP3u(int type, IntBuffer coords) {
/* 457 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 458 */     long function_pointer = caps.GL33_glTexCoordP3uiv_pointer;
/* 459 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 460 */     BufferChecks.checkBuffer(coords, 3);
/* 461 */     nglTexCoordP3uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP4u(int type, IntBuffer coords) {
/* 466 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 467 */     long function_pointer = caps.GL33_glTexCoordP4uiv_pointer;
/* 468 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 469 */     BufferChecks.checkBuffer(coords, 4);
/* 470 */     nglTexCoordP4uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP4uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
/* 475 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 476 */     long function_pointer = caps.GL33_glMultiTexCoordP1ui_pointer;
/* 477 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 478 */     nglMultiTexCoordP1ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP1ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
/* 483 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 484 */     long function_pointer = caps.GL33_glMultiTexCoordP2ui_pointer;
/* 485 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 486 */     nglMultiTexCoordP2ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP2ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
/* 491 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 492 */     long function_pointer = caps.GL33_glMultiTexCoordP3ui_pointer;
/* 493 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 494 */     nglMultiTexCoordP3ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP3ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
/* 499 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 500 */     long function_pointer = caps.GL33_glMultiTexCoordP4ui_pointer;
/* 501 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 502 */     nglMultiTexCoordP4ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP4ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP1u(int texture, int type, IntBuffer coords) {
/* 507 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 508 */     long function_pointer = caps.GL33_glMultiTexCoordP1uiv_pointer;
/* 509 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 510 */     BufferChecks.checkBuffer(coords, 1);
/* 511 */     nglMultiTexCoordP1uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP1uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP2u(int texture, int type, IntBuffer coords) {
/* 516 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 517 */     long function_pointer = caps.GL33_glMultiTexCoordP2uiv_pointer;
/* 518 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 519 */     BufferChecks.checkBuffer(coords, 2);
/* 520 */     nglMultiTexCoordP2uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP2uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP3u(int texture, int type, IntBuffer coords) {
/* 525 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 526 */     long function_pointer = caps.GL33_glMultiTexCoordP3uiv_pointer;
/* 527 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 528 */     BufferChecks.checkBuffer(coords, 3);
/* 529 */     nglMultiTexCoordP3uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP3uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP4u(int texture, int type, IntBuffer coords) {
/* 534 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 535 */     long function_pointer = caps.GL33_glMultiTexCoordP4uiv_pointer;
/* 536 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 537 */     BufferChecks.checkBuffer(coords, 4);
/* 538 */     nglMultiTexCoordP4uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP4uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glNormalP3ui(int type, int coords) {
/* 543 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 544 */     long function_pointer = caps.GL33_glNormalP3ui_pointer;
/* 545 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 546 */     nglNormalP3ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglNormalP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glNormalP3u(int type, IntBuffer coords) {
/* 551 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 552 */     long function_pointer = caps.GL33_glNormalP3uiv_pointer;
/* 553 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 554 */     BufferChecks.checkBuffer(coords, 3);
/* 555 */     nglNormalP3uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglNormalP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP3ui(int type, int color) {
/* 560 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 561 */     long function_pointer = caps.GL33_glColorP3ui_pointer;
/* 562 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 563 */     nglColorP3ui(type, color, function_pointer);
/*     */   }
/*     */   private static native void nglColorP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP4ui(int type, int color) {
/* 568 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 569 */     long function_pointer = caps.GL33_glColorP4ui_pointer;
/* 570 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 571 */     nglColorP4ui(type, color, function_pointer);
/*     */   }
/*     */   private static native void nglColorP4ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP3u(int type, IntBuffer color) {
/* 576 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 577 */     long function_pointer = caps.GL33_glColorP3uiv_pointer;
/* 578 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 579 */     BufferChecks.checkBuffer(color, 3);
/* 580 */     nglColorP3uiv(type, color, color.position(), function_pointer);
/*     */   }
/*     */   private static native void nglColorP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP4u(int type, IntBuffer color) {
/* 585 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 586 */     long function_pointer = caps.GL33_glColorP4uiv_pointer;
/* 587 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 588 */     BufferChecks.checkBuffer(color, 4);
/* 589 */     nglColorP4uiv(type, color, color.position(), function_pointer);
/*     */   }
/*     */   private static native void nglColorP4uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glSecondaryColorP3ui(int type, int color) {
/* 594 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 595 */     long function_pointer = caps.GL33_glSecondaryColorP3ui_pointer;
/* 596 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 597 */     nglSecondaryColorP3ui(type, color, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColorP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glSecondaryColorP3u(int type, IntBuffer color) {
/* 602 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 603 */     long function_pointer = caps.GL33_glSecondaryColorP3uiv_pointer;
/* 604 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 605 */     BufferChecks.checkBuffer(color, 3);
/* 606 */     nglSecondaryColorP3uiv(type, color, color.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColorP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
/* 611 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 612 */     long function_pointer = caps.GL33_glVertexAttribP1ui_pointer;
/* 613 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 614 */     nglVertexAttribP1ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP1ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
/* 619 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 620 */     long function_pointer = caps.GL33_glVertexAttribP2ui_pointer;
/* 621 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 622 */     nglVertexAttribP2ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP2ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
/* 627 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 628 */     long function_pointer = caps.GL33_glVertexAttribP3ui_pointer;
/* 629 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 630 */     nglVertexAttribP3ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP3ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
/* 635 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 636 */     long function_pointer = caps.GL33_glVertexAttribP4ui_pointer;
/* 637 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 638 */     nglVertexAttribP4ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP4ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP1u(int index, int type, boolean normalized, IntBuffer value) {
/* 643 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 644 */     long function_pointer = caps.GL33_glVertexAttribP1uiv_pointer;
/* 645 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 646 */     BufferChecks.checkBuffer(value, 1);
/* 647 */     nglVertexAttribP1uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP1uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP2u(int index, int type, boolean normalized, IntBuffer value) {
/* 652 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 653 */     long function_pointer = caps.GL33_glVertexAttribP2uiv_pointer;
/* 654 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 655 */     BufferChecks.checkBuffer(value, 2);
/* 656 */     nglVertexAttribP2uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP2uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP3u(int index, int type, boolean normalized, IntBuffer value) {
/* 661 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 662 */     long function_pointer = caps.GL33_glVertexAttribP3uiv_pointer;
/* 663 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 664 */     BufferChecks.checkBuffer(value, 3);
/* 665 */     nglVertexAttribP3uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP3uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP4u(int index, int type, boolean normalized, IntBuffer value) {
/* 670 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 671 */     long function_pointer = caps.GL33_glVertexAttribP4uiv_pointer;
/* 672 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 673 */     BufferChecks.checkBuffer(value, 4);
/* 674 */     nglVertexAttribP4uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexAttribP4uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL33.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */