/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.DoubleBuffer;
/*     */ import java.nio.FloatBuffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NVVertexProgram
/*     */   extends NVProgram
/*     */ {
/*     */   public static final int GL_VERTEX_PROGRAM_NV = 34336;
/*     */   public static final int GL_VERTEX_PROGRAM_POINT_SIZE_NV = 34370;
/*     */   public static final int GL_VERTEX_PROGRAM_TWO_SIDE_NV = 34371;
/*     */   public static final int GL_VERTEX_STATE_PROGRAM_NV = 34337;
/*     */   public static final int GL_ATTRIB_ARRAY_SIZE_NV = 34339;
/*     */   public static final int GL_ATTRIB_ARRAY_STRIDE_NV = 34340;
/*     */   public static final int GL_ATTRIB_ARRAY_TYPE_NV = 34341;
/*     */   public static final int GL_CURRENT_ATTRIB_NV = 34342;
/*     */   public static final int GL_PROGRAM_PARAMETER_NV = 34372;
/*     */   public static final int GL_ATTRIB_ARRAY_POINTER_NV = 34373;
/*     */   public static final int GL_TRACK_MATRIX_NV = 34376;
/*     */   public static final int GL_TRACK_MATRIX_TRANSFORM_NV = 34377;
/*     */   public static final int GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV = 34350;
/*     */   public static final int GL_MAX_TRACK_MATRICES_NV = 34351;
/*     */   public static final int GL_CURRENT_MATRIX_STACK_DEPTH_NV = 34368;
/*     */   public static final int GL_CURRENT_MATRIX_NV = 34369;
/*     */   public static final int GL_VERTEX_PROGRAM_BINDING_NV = 34378;
/*     */   public static final int GL_MODELVIEW_PROJECTION_NV = 34345;
/*     */   public static final int GL_MATRIX0_NV = 34352;
/*     */   public static final int GL_MATRIX1_NV = 34353;
/*     */   public static final int GL_MATRIX2_NV = 34354;
/*     */   public static final int GL_MATRIX3_NV = 34355;
/*     */   public static final int GL_MATRIX4_NV = 34356;
/*     */   public static final int GL_MATRIX5_NV = 34357;
/*     */   public static final int GL_MATRIX6_NV = 34358;
/*     */   public static final int GL_MATRIX7_NV = 34359;
/*     */   public static final int GL_IDENTITY_NV = 34346;
/*     */   public static final int GL_INVERSE_NV = 34347;
/*     */   public static final int GL_TRANSPOSE_NV = 34348;
/*     */   public static final int GL_INVERSE_TRANSPOSE_NV = 34349;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY0_NV = 34384;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY1_NV = 34385;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY2_NV = 34386;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY3_NV = 34387;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY4_NV = 34388;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY5_NV = 34389;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY6_NV = 34390;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY7_NV = 34391;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY8_NV = 34392;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY9_NV = 34393;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY10_NV = 34394;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY11_NV = 34395;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY12_NV = 34396;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY13_NV = 34397;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY14_NV = 34398;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY15_NV = 34399;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB0_4_NV = 34400;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB1_4_NV = 34401;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB2_4_NV = 34402;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB3_4_NV = 34403;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB4_4_NV = 34404;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB5_4_NV = 34405;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB6_4_NV = 34406;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB7_4_NV = 34407;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB8_4_NV = 34408;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB9_4_NV = 34409;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB10_4_NV = 34410;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB11_4_NV = 34411;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB12_4_NV = 34412;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB13_4_NV = 34413;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB14_4_NV = 34414;
/*     */   public static final int GL_MAP1_VERTEX_ATTRIB15_4_NV = 34415;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB0_4_NV = 34416;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB1_4_NV = 34417;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB2_4_NV = 34418;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB3_4_NV = 34419;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB4_4_NV = 34420;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB5_4_NV = 34421;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB6_4_NV = 34422;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB7_4_NV = 34423;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB8_4_NV = 34424;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB9_4_NV = 34425;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB10_4_NV = 34426;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB11_4_NV = 34427;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB12_4_NV = 34428;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB13_4_NV = 34429;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB14_4_NV = 34430;
/*     */   public static final int GL_MAP2_VERTEX_ATTRIB15_4_NV = 34431;
/*     */   
/*     */   public static void glExecuteProgramNV(int target, int id, FloatBuffer params) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.NV_vertex_program_glExecuteProgramNV_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     BufferChecks.checkBuffer(params, 4);
/* 159 */     nglExecuteProgramNV(target, id, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglExecuteProgramNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramParameterNV(int target, int index, int parameterName, FloatBuffer params) {
/* 164 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 165 */     long function_pointer = caps.NV_vertex_program_glGetProgramParameterfvNV_pointer;
/* 166 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 167 */     BufferChecks.checkBuffer(params, 4);
/* 168 */     nglGetProgramParameterfvNV(target, index, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramParameterfvNV(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetProgramParameterNV(int target, int index, int parameterName, DoubleBuffer params) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.NV_vertex_program_glGetProgramParameterdvNV_pointer;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     BufferChecks.checkBuffer(params, 4);
/* 177 */     nglGetProgramParameterdvNV(target, index, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramParameterdvNV(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetTrackMatrixNV(int target, int address, int parameterName, IntBuffer params) {
/* 182 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 183 */     long function_pointer = caps.NV_vertex_program_glGetTrackMatrixivNV_pointer;
/* 184 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 185 */     BufferChecks.checkBuffer(params, 4);
/* 186 */     nglGetTrackMatrixivNV(target, address, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetTrackMatrixivNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribNV(int index, int parameterName, FloatBuffer params) {
/* 191 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 192 */     long function_pointer = caps.NV_vertex_program_glGetVertexAttribfvNV_pointer;
/* 193 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 194 */     BufferChecks.checkBuffer(params, 4);
/* 195 */     nglGetVertexAttribfvNV(index, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribfvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribNV(int index, int parameterName, DoubleBuffer params) {
/* 200 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 201 */     long function_pointer = caps.NV_vertex_program_glGetVertexAttribdvNV_pointer;
/* 202 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 203 */     BufferChecks.checkBuffer(params, 4);
/* 204 */     nglGetVertexAttribdvNV(index, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribdvNV(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribNV(int index, int parameterName, IntBuffer params) {
/* 209 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 210 */     long function_pointer = caps.NV_vertex_program_glGetVertexAttribivNV_pointer;
/* 211 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 212 */     BufferChecks.checkBuffer(params, 4);
/* 213 */     nglGetVertexAttribivNV(index, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static ByteBuffer glGetVertexAttribPointerNV(int index, int parameterName, long result_size) {
/* 218 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 219 */     long function_pointer = caps.NV_vertex_program_glGetVertexAttribPointervNV_pointer;
/* 220 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 221 */     ByteBuffer __result = nglGetVertexAttribPointervNV(index, parameterName, result_size, function_pointer);
/* 222 */     return __result;
/*     */   }
/*     */   private static native ByteBuffer nglGetVertexAttribPointervNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glProgramParameter4fNV(int target, int index, float x, float y, float z, float w) {
/* 227 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 228 */     long function_pointer = caps.NV_vertex_program_glProgramParameter4fNV_pointer;
/* 229 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 230 */     nglProgramParameter4fNV(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramParameter4fNV(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glProgramParameter4dNV(int target, int index, double x, double y, double z, double w) {
/* 235 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 236 */     long function_pointer = caps.NV_vertex_program_glProgramParameter4dNV_pointer;
/* 237 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 238 */     nglProgramParameter4dNV(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramParameter4dNV(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glProgramParameters4NV(int target, int index, FloatBuffer params) {
/* 243 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 244 */     long function_pointer = caps.NV_vertex_program_glProgramParameters4fvNV_pointer;
/* 245 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 246 */     BufferChecks.checkDirect(params);
/* 247 */     nglProgramParameters4fvNV(target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramParameters4fvNV(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramParameters4NV(int target, int index, DoubleBuffer params) {
/* 252 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 253 */     long function_pointer = caps.NV_vertex_program_glProgramParameters4dvNV_pointer;
/* 254 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 255 */     BufferChecks.checkDirect(params);
/* 256 */     nglProgramParameters4dvNV(target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramParameters4dvNV(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glTrackMatrixNV(int target, int address, int matrix, int transform) {
/* 261 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 262 */     long function_pointer = caps.NV_vertex_program_glTrackMatrixNV_pointer;
/* 263 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 264 */     nglTrackMatrixNV(target, address, matrix, transform, function_pointer);
/*     */   }
/*     */   private static native void nglTrackMatrixNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribPointerNV(int index, int size, int type, int stride, DoubleBuffer buffer) {
/* 269 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 270 */     long function_pointer = caps.NV_vertex_program_glVertexAttribPointerNV_pointer;
/* 271 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 272 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 273 */     BufferChecks.checkDirect(buffer);
/* 274 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 275 */     nglVertexAttribPointerNV(index, size, type, stride, buffer, buffer.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerNV(int index, int size, int type, int stride, FloatBuffer buffer) {
/* 278 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 279 */     long function_pointer = caps.NV_vertex_program_glVertexAttribPointerNV_pointer;
/* 280 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 281 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 282 */     BufferChecks.checkDirect(buffer);
/* 283 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 284 */     nglVertexAttribPointerNV(index, size, type, stride, buffer, buffer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerNV(int index, int size, int type, int stride, ByteBuffer buffer) {
/* 287 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 288 */     long function_pointer = caps.NV_vertex_program_glVertexAttribPointerNV_pointer;
/* 289 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 290 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 291 */     BufferChecks.checkDirect(buffer);
/* 292 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 293 */     nglVertexAttribPointerNV(index, size, type, stride, buffer, buffer.position(), function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerNV(int index, int size, int type, int stride, IntBuffer buffer) {
/* 296 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 297 */     long function_pointer = caps.NV_vertex_program_glVertexAttribPointerNV_pointer;
/* 298 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 299 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 300 */     BufferChecks.checkDirect(buffer);
/* 301 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 302 */     nglVertexAttribPointerNV(index, size, type, stride, buffer, buffer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerNV(int index, int size, int type, int stride, ShortBuffer buffer) {
/* 305 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 306 */     long function_pointer = caps.NV_vertex_program_glVertexAttribPointerNV_pointer;
/* 307 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 308 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 309 */     BufferChecks.checkDirect(buffer);
/* 310 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 311 */     nglVertexAttribPointerNV(index, size, type, stride, buffer, buffer.position() << 1, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glVertexAttribPointerNV(int index, int size, int type, int stride, long buffer_buffer_offset) {
/* 315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 316 */     long function_pointer = caps.NV_vertex_program_glVertexAttribPointerNV_pointer;
/* 317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 318 */     GLChecks.ensureArrayVBOenabled(caps);
/* 319 */     nglVertexAttribPointerNVBO(index, size, type, stride, buffer_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribPointerNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*     */   private static native void nglVertexAttribPointerNVBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*     */   public static void glVertexAttrib1sNV(int index, short x) {
/* 324 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 325 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib1sNV_pointer;
/* 326 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 327 */     nglVertexAttrib1sNV(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1sNV(int paramInt, short paramShort, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib1fNV(int index, float x) {
/* 332 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 333 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib1fNV_pointer;
/* 334 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 335 */     nglVertexAttrib1fNV(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1fNV(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib1dNV(int index, double x) {
/* 340 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 341 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib1dNV_pointer;
/* 342 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 343 */     nglVertexAttrib1dNV(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1dNV(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2sNV(int index, short x, short y) {
/* 348 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 349 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib2sNV_pointer;
/* 350 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 351 */     nglVertexAttrib2sNV(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2sNV(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2fNV(int index, float x, float y) {
/* 356 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 357 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib2fNV_pointer;
/* 358 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 359 */     nglVertexAttrib2fNV(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2fNV(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2dNV(int index, double x, double y) {
/* 364 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 365 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib2dNV_pointer;
/* 366 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 367 */     nglVertexAttrib2dNV(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2dNV(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3sNV(int index, short x, short y, short z) {
/* 372 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 373 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib3sNV_pointer;
/* 374 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 375 */     nglVertexAttrib3sNV(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3sNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3fNV(int index, float x, float y, float z) {
/* 380 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 381 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib3fNV_pointer;
/* 382 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 383 */     nglVertexAttrib3fNV(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3fNV(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3dNV(int index, double x, double y, double z) {
/* 388 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 389 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib3dNV_pointer;
/* 390 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 391 */     nglVertexAttrib3dNV(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3dNV(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4sNV(int index, short x, short y, short z, short w) {
/* 396 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 397 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib4sNV_pointer;
/* 398 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 399 */     nglVertexAttrib4sNV(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4sNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4fNV(int index, float x, float y, float z, float w) {
/* 404 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 405 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib4fNV_pointer;
/* 406 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 407 */     nglVertexAttrib4fNV(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4fNV(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4dNV(int index, double x, double y, double z, double w) {
/* 412 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 413 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib4dNV_pointer;
/* 414 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 415 */     nglVertexAttrib4dNV(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4dNV(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4ubNV(int index, byte x, byte y, byte z, byte w) {
/* 420 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 421 */     long function_pointer = caps.NV_vertex_program_glVertexAttrib4ubNV_pointer;
/* 422 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 423 */     nglVertexAttrib4ubNV(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4ubNV(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs1NV(int index, ShortBuffer v) {
/* 428 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 429 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs1svNV_pointer;
/* 430 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 431 */     BufferChecks.checkDirect(v);
/* 432 */     nglVertexAttribs1svNV(index, v.remaining(), v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs1svNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs1NV(int index, FloatBuffer v) {
/* 437 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 438 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs1fvNV_pointer;
/* 439 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 440 */     BufferChecks.checkDirect(v);
/* 441 */     nglVertexAttribs1fvNV(index, v.remaining(), v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs1fvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs1NV(int index, DoubleBuffer v) {
/* 446 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 447 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs1dvNV_pointer;
/* 448 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 449 */     BufferChecks.checkDirect(v);
/* 450 */     nglVertexAttribs1dvNV(index, v.remaining(), v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs1dvNV(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs2NV(int index, ShortBuffer v) {
/* 455 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 456 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs2svNV_pointer;
/* 457 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 458 */     BufferChecks.checkDirect(v);
/* 459 */     nglVertexAttribs2svNV(index, v.remaining() >> 1, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs2svNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs2NV(int index, FloatBuffer v) {
/* 464 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 465 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs2fvNV_pointer;
/* 466 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 467 */     BufferChecks.checkDirect(v);
/* 468 */     nglVertexAttribs2fvNV(index, v.remaining() >> 1, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs2fvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs2NV(int index, DoubleBuffer v) {
/* 473 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 474 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs2dvNV_pointer;
/* 475 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 476 */     BufferChecks.checkDirect(v);
/* 477 */     nglVertexAttribs2dvNV(index, v.remaining() >> 1, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs2dvNV(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs3NV(int index, ShortBuffer v) {
/* 482 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 483 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs3svNV_pointer;
/* 484 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 485 */     BufferChecks.checkDirect(v);
/* 486 */     nglVertexAttribs3svNV(index, v.remaining() / 3, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs3svNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs3NV(int index, FloatBuffer v) {
/* 491 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 492 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs3fvNV_pointer;
/* 493 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 494 */     BufferChecks.checkDirect(v);
/* 495 */     nglVertexAttribs3fvNV(index, v.remaining() / 3, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs3fvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs3NV(int index, DoubleBuffer v) {
/* 500 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 501 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs3dvNV_pointer;
/* 502 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 503 */     BufferChecks.checkDirect(v);
/* 504 */     nglVertexAttribs3dvNV(index, v.remaining() / 3, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs3dvNV(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs4NV(int index, ShortBuffer v) {
/* 509 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 510 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs4svNV_pointer;
/* 511 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 512 */     BufferChecks.checkDirect(v);
/* 513 */     nglVertexAttribs4svNV(index, v.remaining() >> 2, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs4svNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs4NV(int index, FloatBuffer v) {
/* 518 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 519 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs4fvNV_pointer;
/* 520 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 521 */     BufferChecks.checkDirect(v);
/* 522 */     nglVertexAttribs4fvNV(index, v.remaining() >> 2, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs4fvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs4NV(int index, DoubleBuffer v) {
/* 527 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 528 */     long function_pointer = caps.NV_vertex_program_glVertexAttribs4dvNV_pointer;
/* 529 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 530 */     BufferChecks.checkDirect(v);
/* 531 */     nglVertexAttribs4dvNV(index, v.remaining() >> 2, v, v.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexAttribs4dvNV(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVVertexProgram.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */