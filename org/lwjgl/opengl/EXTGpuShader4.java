/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
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
/*     */ public final class EXTGpuShader4
/*     */ {
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 35069;
/*     */   public static final int GL_SAMPLER_1D_ARRAY_EXT = 36288;
/*     */   public static final int GL_SAMPLER_2D_ARRAY_EXT = 36289;
/*     */   public static final int GL_SAMPLER_BUFFER_EXT = 36290;
/*     */   public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 36291;
/*     */   public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 36292;
/*     */   public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 36293;
/*     */   public static final int GL_UNSIGNED_INT = 5125;
/*     */   public static final int GL_UNSIGNED_INT_VEC2_EXT = 36294;
/*     */   public static final int GL_UNSIGNED_INT_VEC3_EXT = 36295;
/*     */   public static final int GL_UNSIGNED_INT_VEC4_EXT = 36296;
/*     */   public static final int GL_INT_SAMPLER_1D_EXT = 36297;
/*     */   public static final int GL_INT_SAMPLER_2D_EXT = 36298;
/*     */   public static final int GL_INT_SAMPLER_3D_EXT = 36299;
/*     */   public static final int GL_INT_SAMPLER_CUBE_EXT = 36300;
/*     */   public static final int GL_INT_SAMPLER_2D_RECT_EXT = 36301;
/*     */   public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 36302;
/*     */   public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 36303;
/*     */   public static final int GL_INT_SAMPLER_BUFFER_EXT = 36304;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 36305;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 36306;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 36307;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 36308;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 36309;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 36310;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 36311;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 36312;
/*     */   public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 35076;
/*     */   public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 35077;
/*     */   
/*     */   public static void glVertexAttribI1iEXT(int index, int x) {
/*  57 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  58 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI1iEXT_pointer;
/*  59 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  60 */     nglVertexAttribI1iEXT(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI1iEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI2iEXT(int index, int x, int y) {
/*  65 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  66 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI2iEXT_pointer;
/*  67 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  68 */     nglVertexAttribI2iEXT(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI2iEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI3iEXT(int index, int x, int y, int z) {
/*  73 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  74 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI3iEXT_pointer;
/*  75 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  76 */     nglVertexAttribI3iEXT(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI3iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4iEXT(int index, int x, int y, int z, int w) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4iEXT_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     nglVertexAttribI4iEXT(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI1uiEXT(int index, int x) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI1uiEXT_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     nglVertexAttribI1uiEXT(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI1uiEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI2uiEXT(int index, int x, int y) {
/*  97 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  98 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI2uiEXT_pointer;
/*  99 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 100 */     nglVertexAttribI2uiEXT(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI2uiEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI3uiEXT(int index, int x, int y, int z) {
/* 105 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 106 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI3uiEXT_pointer;
/* 107 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 108 */     nglVertexAttribI3uiEXT(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI3uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4uiEXT(int index, int x, int y, int z, int w) {
/* 113 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 114 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4uiEXT_pointer;
/* 115 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 116 */     nglVertexAttribI4uiEXT(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI1EXT(int index, IntBuffer v) {
/* 121 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 122 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI1ivEXT_pointer;
/* 123 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 124 */     BufferChecks.checkBuffer(v, 1);
/* 125 */     nglVertexAttribI1ivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI1ivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI2EXT(int index, IntBuffer v) {
/* 130 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 131 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI2ivEXT_pointer;
/* 132 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 133 */     BufferChecks.checkBuffer(v, 2);
/* 134 */     nglVertexAttribI2ivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI2ivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI3EXT(int index, IntBuffer v) {
/* 139 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 140 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI3ivEXT_pointer;
/* 141 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 142 */     BufferChecks.checkBuffer(v, 3);
/* 143 */     nglVertexAttribI3ivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI3ivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4EXT(int index, IntBuffer v) {
/* 148 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 149 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4ivEXT_pointer;
/* 150 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 151 */     BufferChecks.checkBuffer(v, 4);
/* 152 */     nglVertexAttribI4ivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4ivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI1uEXT(int index, IntBuffer v) {
/* 157 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 158 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI1uivEXT_pointer;
/* 159 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 160 */     BufferChecks.checkBuffer(v, 1);
/* 161 */     nglVertexAttribI1uivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI1uivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI2uEXT(int index, IntBuffer v) {
/* 166 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 167 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI2uivEXT_pointer;
/* 168 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 169 */     BufferChecks.checkBuffer(v, 2);
/* 170 */     nglVertexAttribI2uivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI2uivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI3uEXT(int index, IntBuffer v) {
/* 175 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 176 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI3uivEXT_pointer;
/* 177 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 178 */     BufferChecks.checkBuffer(v, 3);
/* 179 */     nglVertexAttribI3uivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI3uivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4uEXT(int index, IntBuffer v) {
/* 184 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 185 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4uivEXT_pointer;
/* 186 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 187 */     BufferChecks.checkBuffer(v, 4);
/* 188 */     nglVertexAttribI4uivEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4uivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4EXT(int index, ByteBuffer v) {
/* 193 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 194 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4bvEXT_pointer;
/* 195 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 196 */     BufferChecks.checkBuffer(v, 4);
/* 197 */     nglVertexAttribI4bvEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4bvEXT(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4EXT(int index, ShortBuffer v) {
/* 202 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 203 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4svEXT_pointer;
/* 204 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 205 */     BufferChecks.checkBuffer(v, 4);
/* 206 */     nglVertexAttribI4svEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4svEXT(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4uEXT(int index, ByteBuffer v) {
/* 211 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 212 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4ubvEXT_pointer;
/* 213 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 214 */     BufferChecks.checkBuffer(v, 4);
/* 215 */     nglVertexAttribI4ubvEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4ubvEXT(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribI4uEXT(int index, ShortBuffer v) {
/* 220 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 221 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribI4usvEXT_pointer;
/* 222 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 223 */     BufferChecks.checkBuffer(v, 4);
/* 224 */     nglVertexAttribI4usvEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribI4usvEXT(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ByteBuffer buffer) {
/* 229 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 230 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribIPointerEXT_pointer;
/* 231 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 232 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 233 */     BufferChecks.checkDirect(buffer);
/* 234 */     (GLChecks.getReferences(caps)).EXT_gpu_shader4_glVertexAttribIPointerEXT_buffer = buffer;
/* 235 */     nglVertexAttribIPointerEXT(index, size, type, stride, buffer, buffer.position(), function_pointer);
/*     */   }
/*     */   public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, IntBuffer buffer) {
/* 238 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 239 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribIPointerEXT_pointer;
/* 240 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 241 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 242 */     BufferChecks.checkDirect(buffer);
/* 243 */     (GLChecks.getReferences(caps)).EXT_gpu_shader4_glVertexAttribIPointerEXT_buffer = buffer;
/* 244 */     nglVertexAttribIPointerEXT(index, size, type, stride, buffer, buffer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ShortBuffer buffer) {
/* 247 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 248 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribIPointerEXT_pointer;
/* 249 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 250 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 251 */     BufferChecks.checkDirect(buffer);
/* 252 */     (GLChecks.getReferences(caps)).EXT_gpu_shader4_glVertexAttribIPointerEXT_buffer = buffer;
/* 253 */     nglVertexAttribIPointerEXT(index, size, type, stride, buffer, buffer.position() << 1, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, long buffer_buffer_offset) {
/* 257 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 258 */     long function_pointer = caps.EXT_gpu_shader4_glVertexAttribIPointerEXT_pointer;
/* 259 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 260 */     GLChecks.ensureArrayVBOenabled(caps);
/* 261 */     nglVertexAttribIPointerEXTBO(index, size, type, stride, buffer_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribIPointerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*     */   private static native void nglVertexAttribIPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*     */   public static void glGetVertexAttribIEXT(int index, int pname, IntBuffer params) {
/* 266 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 267 */     long function_pointer = caps.EXT_gpu_shader4_glGetVertexAttribIivEXT_pointer;
/* 268 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 269 */     BufferChecks.checkBuffer(params, 4);
/* 270 */     nglGetVertexAttribIivEXT(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribIivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribIuEXT(int index, int pname, IntBuffer params) {
/* 275 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 276 */     long function_pointer = caps.EXT_gpu_shader4_glGetVertexAttribIuivEXT_pointer;
/* 277 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 278 */     BufferChecks.checkBuffer(params, 4);
/* 279 */     nglGetVertexAttribIuivEXT(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribIuivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform1uiEXT(int location, int v0) {
/* 284 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 285 */     long function_pointer = caps.EXT_gpu_shader4_glUniform1uiEXT_pointer;
/* 286 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 287 */     nglUniform1uiEXT(location, v0, function_pointer);
/*     */   }
/*     */   private static native void nglUniform1uiEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glUniform2uiEXT(int location, int v0, int v1) {
/* 292 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 293 */     long function_pointer = caps.EXT_gpu_shader4_glUniform2uiEXT_pointer;
/* 294 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 295 */     nglUniform2uiEXT(location, v0, v1, function_pointer);
/*     */   }
/*     */   private static native void nglUniform2uiEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3uiEXT(int location, int v0, int v1, int v2) {
/* 300 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 301 */     long function_pointer = caps.EXT_gpu_shader4_glUniform3uiEXT_pointer;
/* 302 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 303 */     nglUniform3uiEXT(location, v0, v1, v2, function_pointer);
/*     */   }
/*     */   private static native void nglUniform3uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glUniform4uiEXT(int location, int v0, int v1, int v2, int v3) {
/* 308 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 309 */     long function_pointer = caps.EXT_gpu_shader4_glUniform4uiEXT_pointer;
/* 310 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 311 */     nglUniform4uiEXT(location, v0, v1, v2, v3, function_pointer);
/*     */   }
/*     */   private static native void nglUniform4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glUniform1uEXT(int location, IntBuffer value) {
/* 316 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 317 */     long function_pointer = caps.EXT_gpu_shader4_glUniform1uivEXT_pointer;
/* 318 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 319 */     BufferChecks.checkDirect(value);
/* 320 */     nglUniform1uivEXT(location, value.remaining(), value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform1uivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform2uEXT(int location, IntBuffer value) {
/* 325 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 326 */     long function_pointer = caps.EXT_gpu_shader4_glUniform2uivEXT_pointer;
/* 327 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 328 */     BufferChecks.checkDirect(value);
/* 329 */     nglUniform2uivEXT(location, value.remaining() >> 1, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform2uivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3uEXT(int location, IntBuffer value) {
/* 334 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 335 */     long function_pointer = caps.EXT_gpu_shader4_glUniform3uivEXT_pointer;
/* 336 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 337 */     BufferChecks.checkDirect(value);
/* 338 */     nglUniform3uivEXT(location, value.remaining() / 3, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform3uivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform4uEXT(int location, IntBuffer value) {
/* 343 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 344 */     long function_pointer = caps.EXT_gpu_shader4_glUniform4uivEXT_pointer;
/* 345 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 346 */     BufferChecks.checkDirect(value);
/* 347 */     nglUniform4uivEXT(location, value.remaining() >> 2, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform4uivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformuEXT(int program, int location, IntBuffer params) {
/* 352 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 353 */     long function_pointer = caps.EXT_gpu_shader4_glGetUniformuivEXT_pointer;
/* 354 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 355 */     BufferChecks.checkDirect(params);
/* 356 */     nglGetUniformuivEXT(program, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformuivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glBindFragDataLocationEXT(int program, int colorNumber, ByteBuffer name) {
/* 361 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 362 */     long function_pointer = caps.EXT_gpu_shader4_glBindFragDataLocationEXT_pointer;
/* 363 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 364 */     BufferChecks.checkDirect(name);
/* 365 */     BufferChecks.checkNullTerminated(name);
/* 366 */     nglBindFragDataLocationEXT(program, colorNumber, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglBindFragDataLocationEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glBindFragDataLocationEXT(int program, int colorNumber, CharSequence name) {
/* 372 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 373 */     long function_pointer = caps.EXT_gpu_shader4_glBindFragDataLocationEXT_pointer;
/* 374 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 375 */     nglBindFragDataLocationEXT(program, colorNumber, APIUtils.getBufferNT(name), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static int glGetFragDataLocationEXT(int program, ByteBuffer name) {
/* 379 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 380 */     long function_pointer = caps.EXT_gpu_shader4_glGetFragDataLocationEXT_pointer;
/* 381 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 382 */     BufferChecks.checkDirect(name);
/* 383 */     BufferChecks.checkNullTerminated(name);
/* 384 */     int __result = nglGetFragDataLocationEXT(program, name, name.position(), function_pointer);
/* 385 */     return __result;
/*     */   }
/*     */   
/*     */   private static native int nglGetFragDataLocationEXT(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGetFragDataLocationEXT(int program, CharSequence name) {
/* 391 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 392 */     long function_pointer = caps.EXT_gpu_shader4_glGetFragDataLocationEXT_pointer;
/* 393 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 394 */     int __result = nglGetFragDataLocationEXT(program, APIUtils.getBufferNT(name), 0, function_pointer);
/* 395 */     return __result;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTGpuShader4.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */