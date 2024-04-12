/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.LongBuffer;
/*     */ import java.nio.ShortBuffer;
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
/*     */ public final class GL32
/*     */ {
/*     */   public static final int GL_CONTEXT_PROFILE_MASK = 37158;
/*     */   public static final int GL_CONTEXT_CORE_PROFILE_BIT = 1;
/*     */   public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 2;
/*     */   public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 37154;
/*     */   public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 37155;
/*     */   public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 37156;
/*     */   public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 37157;
/*     */   public static final int GL_BGRA = 32993;
/*     */   public static final int GL_FIRST_VERTEX_CONVENTION = 36429;
/*     */   public static final int GL_LAST_VERTEX_CONVENTION = 36430;
/*     */   public static final int GL_PROVOKING_VERTEX = 36431;
/*     */   public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 36428;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 34895;
/*     */   public static final int GL_SAMPLE_POSITION = 36432;
/*     */   public static final int GL_SAMPLE_MASK = 36433;
/*     */   public static final int GL_SAMPLE_MASK_VALUE = 36434;
/*     */   public static final int GL_TEXTURE_2D_MULTISAMPLE = 37120;
/*     */   public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 37121;
/*     */   public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 37122;
/*     */   public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 37123;
/*     */   public static final int GL_MAX_SAMPLE_MASK_WORDS = 36441;
/*     */   public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 37134;
/*     */   public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 37135;
/*     */   public static final int GL_MAX_INTEGER_SAMPLES = 37136;
/*     */   public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 37124;
/*     */   public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 37125;
/*     */   public static final int GL_TEXTURE_SAMPLES = 37126;
/*     */   public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 37127;
/*     */   public static final int GL_SAMPLER_2D_MULTISAMPLE = 37128;
/*     */   public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 37129;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 37130;
/*     */   public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 37131;
/*     */   public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37132;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37133;
/*     */   public static final int GL_DEPTH_CLAMP = 34383;
/*     */   public static final int GL_GEOMETRY_SHADER = 36313;
/*     */   public static final int GL_GEOMETRY_VERTICES_OUT = 36314;
/*     */   public static final int GL_GEOMETRY_INPUT_TYPE = 36315;
/*     */   public static final int GL_GEOMETRY_OUTPUT_TYPE = 36316;
/*     */   public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 35881;
/*     */   public static final int GL_MAX_VARYING_COMPONENTS = 35659;
/*     */   public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 36319;
/*     */   public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 36320;
/*     */   public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 36321;
/*     */   public static final int GL_LINES_ADJACENCY = 10;
/*     */   public static final int GL_LINE_STRIP_ADJACENCY = 11;
/*     */   public static final int GL_TRIANGLES_ADJACENCY = 12;
/*     */   public static final int GL_TRIANGLE_STRIP_ADJACENCY = 13;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 36264;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT = 36265;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 36263;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;
/*     */   public static final int GL_PROGRAM_POINT_SIZE = 34370;
/*     */   public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 37137;
/*     */   public static final int GL_OBJECT_TYPE = 37138;
/*     */   public static final int GL_SYNC_CONDITION = 37139;
/*     */   public static final int GL_SYNC_STATUS = 37140;
/*     */   public static final int GL_SYNC_FLAGS = 37141;
/*     */   public static final int GL_SYNC_FENCE = 37142;
/*     */   public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 37143;
/*     */   public static final int GL_UNSIGNALED = 37144;
/*     */   public static final int GL_SIGNALED = 37145;
/*     */   public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 1;
/*     */   public static final long GL_TIMEOUT_IGNORED = -1L;
/*     */   public static final int GL_ALREADY_SIGNALED = 37146;
/*     */   public static final int GL_TIMEOUT_EXPIRED = 37147;
/*     */   public static final int GL_CONDITION_SATISFIED = 37148;
/*     */   public static final int GL_WAIT_FAILED = 37149;
/*     */   
/*     */   public static void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
/* 190 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 191 */     long function_pointer = caps.GL32_glDrawElementsBaseVertex_pointer;
/* 192 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 193 */     GLChecks.ensureElementVBOdisabled(caps);
/* 194 */     BufferChecks.checkDirect(indices);
/* 195 */     nglDrawElementsBaseVertex(mode, indices.remaining(), 5121, indices, indices.position(), basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
/* 198 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 199 */     long function_pointer = caps.GL32_glDrawElementsBaseVertex_pointer;
/* 200 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 201 */     GLChecks.ensureElementVBOdisabled(caps);
/* 202 */     BufferChecks.checkDirect(indices);
/* 203 */     nglDrawElementsBaseVertex(mode, indices.remaining(), 5125, indices, indices.position() << 2, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
/* 206 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 207 */     long function_pointer = caps.GL32_glDrawElementsBaseVertex_pointer;
/* 208 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 209 */     GLChecks.ensureElementVBOdisabled(caps);
/* 210 */     BufferChecks.checkDirect(indices);
/* 211 */     nglDrawElementsBaseVertex(mode, indices.remaining(), 5123, indices, indices.position() << 1, basevertex, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDrawElementsBaseVertex(int mode, int count, int type, long indices_buffer_offset, int basevertex) {
/* 215 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 216 */     long function_pointer = caps.GL32_glDrawElementsBaseVertex_pointer;
/* 217 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 218 */     GLChecks.ensureElementVBOenabled(caps);
/* 219 */     nglDrawElementsBaseVertexBO(mode, count, type, indices_buffer_offset, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsBaseVertex(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, int paramInt5, long paramLong);
/*     */   private static native void nglDrawElementsBaseVertexBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2);
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
/* 224 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 225 */     long function_pointer = caps.GL32_glDrawRangeElementsBaseVertex_pointer;
/* 226 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 227 */     GLChecks.ensureElementVBOdisabled(caps);
/* 228 */     BufferChecks.checkDirect(indices);
/* 229 */     nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), 5121, indices, indices.position(), basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
/* 232 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 233 */     long function_pointer = caps.GL32_glDrawRangeElementsBaseVertex_pointer;
/* 234 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 235 */     GLChecks.ensureElementVBOdisabled(caps);
/* 236 */     BufferChecks.checkDirect(indices);
/* 237 */     nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), 5125, indices, indices.position() << 2, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
/* 240 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 241 */     long function_pointer = caps.GL32_glDrawRangeElementsBaseVertex_pointer;
/* 242 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 243 */     GLChecks.ensureElementVBOdisabled(caps);
/* 244 */     BufferChecks.checkDirect(indices);
/* 245 */     nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), 5123, indices, indices.position() << 1, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawRangeElementsBaseVertex(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, int paramInt7, long paramLong);
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices_buffer_offset, int basevertex) {
/* 249 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 250 */     long function_pointer = caps.GL32_glDrawRangeElementsBaseVertex_pointer;
/* 251 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 252 */     GLChecks.ensureElementVBOenabled(caps);
/* 253 */     nglDrawRangeElementsBaseVertexBO(mode, start, end, count, type, indices_buffer_offset, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawRangeElementsBaseVertexBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, int paramInt6, long paramLong2);
/*     */   
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
/* 258 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 259 */     long function_pointer = caps.GL32_glDrawElementsInstancedBaseVertex_pointer;
/* 260 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 261 */     GLChecks.ensureElementVBOdisabled(caps);
/* 262 */     BufferChecks.checkDirect(indices);
/* 263 */     nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), 5121, indices, indices.position(), primcount, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
/* 266 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 267 */     long function_pointer = caps.GL32_glDrawElementsInstancedBaseVertex_pointer;
/* 268 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 269 */     GLChecks.ensureElementVBOdisabled(caps);
/* 270 */     BufferChecks.checkDirect(indices);
/* 271 */     nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), 5125, indices, indices.position() << 2, primcount, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
/* 274 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 275 */     long function_pointer = caps.GL32_glDrawElementsInstancedBaseVertex_pointer;
/* 276 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 277 */     GLChecks.ensureElementVBOdisabled(caps);
/* 278 */     BufferChecks.checkDirect(indices);
/* 279 */     nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), 5123, indices, indices.position() << 1, primcount, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsInstancedBaseVertex(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices_buffer_offset, int primcount, int basevertex) {
/* 283 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 284 */     long function_pointer = caps.GL32_glDrawElementsInstancedBaseVertex_pointer;
/* 285 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 286 */     GLChecks.ensureElementVBOenabled(caps);
/* 287 */     nglDrawElementsInstancedBaseVertexBO(mode, count, type, indices_buffer_offset, primcount, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsInstancedBaseVertexBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, int paramInt5, long paramLong2);
/*     */   
/*     */   public static void glProvokingVertex(int mode) {
/* 292 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 293 */     long function_pointer = caps.GL32_glProvokingVertex_pointer;
/* 294 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 295 */     nglProvokingVertex(mode, function_pointer);
/*     */   }
/*     */   private static native void nglProvokingVertex(int paramInt, long paramLong);
/*     */   
/*     */   public static void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
/* 300 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 301 */     long function_pointer = caps.GL32_glTexImage2DMultisample_pointer;
/* 302 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 303 */     nglTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations, function_pointer);
/*     */   }
/*     */   private static native void nglTexImage2DMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, long paramLong);
/*     */   
/*     */   public static void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
/* 308 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 309 */     long function_pointer = caps.GL32_glTexImage3DMultisample_pointer;
/* 310 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 311 */     nglTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations, function_pointer);
/*     */   }
/*     */   private static native void nglTexImage3DMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, long paramLong);
/*     */   
/*     */   public static void glGetMultisample(int pname, int index, FloatBuffer val) {
/* 316 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 317 */     long function_pointer = caps.GL32_glGetMultisamplefv_pointer;
/* 318 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 319 */     BufferChecks.checkBuffer(val, 2);
/* 320 */     nglGetMultisamplefv(pname, index, val, val.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetMultisamplefv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSampleMaski(int index, int mask) {
/* 325 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 326 */     long function_pointer = caps.GL32_glSampleMaski_pointer;
/* 327 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 328 */     nglSampleMaski(index, mask, function_pointer);
/*     */   }
/*     */   private static native void nglSampleMaski(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glFramebufferTexture(int target, int attachment, int texture, int level) {
/* 333 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 334 */     long function_pointer = caps.GL32_glFramebufferTexture_pointer;
/* 335 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 336 */     nglFramebufferTexture(target, attachment, texture, level, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
/* 341 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 342 */     long function_pointer = caps.GL32_glFramebufferTextureLayer_pointer;
/* 343 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 344 */     nglFramebufferTextureLayer(target, attachment, texture, level, layer, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTextureLayer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static GLSync glFenceSync(int condition, int flags) {
/* 349 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 350 */     long function_pointer = caps.GL32_glFenceSync_pointer;
/* 351 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 352 */     GLSync __result = new GLSync(nglFenceSync(condition, flags, function_pointer));
/* 353 */     return __result;
/*     */   }
/*     */   private static native long nglFenceSync(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static boolean glIsSync(GLSync sync) {
/* 358 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 359 */     long function_pointer = caps.GL32_glIsSync_pointer;
/* 360 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 361 */     boolean __result = nglIsSync(sync.getPointer(), function_pointer);
/* 362 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsSync(long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glDeleteSync(GLSync sync) {
/* 367 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 368 */     long function_pointer = caps.GL32_glDeleteSync_pointer;
/* 369 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 370 */     nglDeleteSync(sync.getPointer(), function_pointer);
/*     */   }
/*     */   private static native void nglDeleteSync(long paramLong1, long paramLong2);
/*     */   
/*     */   public static int glClientWaitSync(GLSync sync, int flags, long timeout) {
/* 375 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 376 */     long function_pointer = caps.GL32_glClientWaitSync_pointer;
/* 377 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 378 */     int __result = nglClientWaitSync(sync.getPointer(), flags, timeout, function_pointer);
/* 379 */     return __result;
/*     */   }
/*     */   private static native int nglClientWaitSync(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glWaitSync(GLSync sync, int flags, long timeout) {
/* 384 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 385 */     long function_pointer = caps.GL32_glWaitSync_pointer;
/* 386 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 387 */     nglWaitSync(sync.getPointer(), flags, timeout, function_pointer);
/*     */   }
/*     */   private static native void nglWaitSync(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glGetInteger(int pname, LongBuffer data) {
/* 392 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 393 */     long function_pointer = caps.GL32_glGetInteger64v_pointer;
/* 394 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 395 */     BufferChecks.checkBuffer(data, 1);
/* 396 */     nglGetInteger64v(pname, data, data.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetInteger64v(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static long glGetInteger(int pname) {
/* 402 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 403 */     long function_pointer = caps.GL32_glGetInteger64v_pointer;
/* 404 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 405 */     LongBuffer data = APIUtils.getBufferLong();
/* 406 */     nglGetInteger64v(pname, data, data.position(), function_pointer);
/* 407 */     return data.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetInteger(int value, int index, LongBuffer data) {
/* 411 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 412 */     long function_pointer = caps.GL32_glGetInteger64i_v_pointer;
/* 413 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 414 */     BufferChecks.checkBuffer(data, 4);
/* 415 */     nglGetInteger64i_v(value, index, data, data.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetInteger64i_v(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static long glGetInteger(int value, int index) {
/* 421 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 422 */     long function_pointer = caps.GL32_glGetInteger64i_v_pointer;
/* 423 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 424 */     LongBuffer data = APIUtils.getBufferLong();
/* 425 */     nglGetInteger64i_v(value, index, data, data.position(), function_pointer);
/* 426 */     return data.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSync(GLSync sync, int pname, IntBuffer length, IntBuffer values) {
/* 430 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 431 */     long function_pointer = caps.GL32_glGetSynciv_pointer;
/* 432 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 433 */     if (length != null)
/* 434 */       BufferChecks.checkBuffer(length, 1); 
/* 435 */     BufferChecks.checkDirect(values);
/* 436 */     nglGetSynciv(sync.getPointer(), pname, values.remaining(), length, (length != null) ? length.position() : 0, values, values.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSynciv(long paramLong1, int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, int paramInt3, IntBuffer paramIntBuffer2, int paramInt4, long paramLong2);
/*     */   
/*     */   public static int glGetSync(GLSync sync, int pname) {
/* 442 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 443 */     long function_pointer = caps.GL32_glGetSynciv_pointer;
/* 444 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 445 */     IntBuffer values = APIUtils.getBufferInt();
/* 446 */     nglGetSynciv(sync.getPointer(), pname, 1, null, 0, values, values.position(), function_pointer);
/* 447 */     return values.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL32.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */