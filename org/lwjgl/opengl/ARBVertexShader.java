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
/*     */ public final class ARBVertexShader
/*     */ {
/*     */   public static final int GL_VERTEX_SHADER_ARB = 35633;
/*     */   public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB = 35658;
/*     */   public static final int GL_MAX_VARYING_FLOATS_ARB = 35659;
/*     */   public static final int GL_MAX_VERTEX_ATTRIBS_ARB = 34921;
/*     */   public static final int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 34930;
/*     */   public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB = 35660;
/*     */   public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = 35661;
/*     */   public static final int GL_MAX_TEXTURE_COORDS_ARB = 34929;
/*     */   public static final int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 34370;
/*     */   public static final int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = 34371;
/*     */   public static final int GL_OBJECT_ACTIVE_ATTRIBUTES_ARB = 35721;
/*     */   public static final int GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = 35722;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = 34338;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = 34339;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = 34340;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = 34341;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 34922;
/*     */   public static final int GL_CURRENT_VERTEX_ATTRIB_ARB = 34342;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 34373;
/*     */   public static final int GL_FLOAT = 5126;
/*     */   public static final int GL_FLOAT_VEC2_ARB = 35664;
/*     */   public static final int GL_FLOAT_VEC3_ARB = 35665;
/*     */   public static final int GL_FLOAT_VEC4_ARB = 35666;
/*     */   public static final int GL_FLOAT_MAT2_ARB = 35674;
/*     */   public static final int GL_FLOAT_MAT3_ARB = 35675;
/*     */   public static final int GL_FLOAT_MAT4_ARB = 35676;
/*     */   
/*     */   public static void glVertexAttrib1sARB(int index, short v0) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib1sARB_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     nglVertexAttrib1sARB(index, v0, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1sARB(int paramInt, short paramShort, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib1fARB(int index, float v0) {
/*  75 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  76 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib1fARB_pointer;
/*  77 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  78 */     nglVertexAttrib1fARB(index, v0, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1fARB(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib1dARB(int index, double v0) {
/*  83 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  84 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib1dARB_pointer;
/*  85 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  86 */     nglVertexAttrib1dARB(index, v0, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1dARB(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2sARB(int index, short v0, short v1) {
/*  91 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  92 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib2sARB_pointer;
/*  93 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  94 */     nglVertexAttrib2sARB(index, v0, v1, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2sARB(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2fARB(int index, float v0, float v1) {
/*  99 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 100 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib2fARB_pointer;
/* 101 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 102 */     nglVertexAttrib2fARB(index, v0, v1, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2fARB(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2dARB(int index, double v0, double v1) {
/* 107 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 108 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib2dARB_pointer;
/* 109 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 110 */     nglVertexAttrib2dARB(index, v0, v1, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2dARB(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3sARB(int index, short v0, short v1, short v2) {
/* 115 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 116 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib3sARB_pointer;
/* 117 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 118 */     nglVertexAttrib3sARB(index, v0, v1, v2, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3sARB(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3fARB(int index, float v0, float v1, float v2) {
/* 123 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 124 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib3fARB_pointer;
/* 125 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 126 */     nglVertexAttrib3fARB(index, v0, v1, v2, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3dARB(int index, double v0, double v1, double v2) {
/* 131 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 132 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib3dARB_pointer;
/* 133 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 134 */     nglVertexAttrib3dARB(index, v0, v1, v2, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3dARB(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4sARB(int index, short v0, short v1, short v2, short v3) {
/* 139 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 140 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib4sARB_pointer;
/* 141 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 142 */     nglVertexAttrib4sARB(index, v0, v1, v2, v3, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4sARB(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4fARB(int index, float v0, float v1, float v2, float v3) {
/* 147 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 148 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib4fARB_pointer;
/* 149 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 150 */     nglVertexAttrib4fARB(index, v0, v1, v2, v3, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4dARB(int index, double v0, double v1, double v2, double v3) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib4dARB_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     nglVertexAttrib4dARB(index, v0, v1, v2, v3, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4dARB(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
/* 163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 164 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttrib4NubARB_pointer;
/* 165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 166 */     nglVertexAttrib4NubARB(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4NubARB(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, DoubleBuffer buffer) {
/* 171 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 172 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttribPointerARB_pointer;
/* 173 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 174 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 175 */     BufferChecks.checkDirect(buffer);
/* 176 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 177 */     nglVertexAttribPointerARB(index, size, 5130, normalized, stride, buffer, buffer.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, FloatBuffer buffer) {
/* 180 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 181 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttribPointerARB_pointer;
/* 182 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 183 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 184 */     BufferChecks.checkDirect(buffer);
/* 185 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 186 */     nglVertexAttribPointerARB(index, size, 5126, normalized, stride, buffer, buffer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer buffer) {
/* 189 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 190 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttribPointerARB_pointer;
/* 191 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 192 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 193 */     BufferChecks.checkDirect(buffer);
/* 194 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 195 */     nglVertexAttribPointerARB(index, size, unsigned ? 5121 : 5120, normalized, stride, buffer, buffer.position(), function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, IntBuffer buffer) {
/* 198 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 199 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttribPointerARB_pointer;
/* 200 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 201 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 202 */     BufferChecks.checkDirect(buffer);
/* 203 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 204 */     nglVertexAttribPointerARB(index, size, unsigned ? 5125 : 5124, normalized, stride, buffer, buffer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer buffer) {
/* 207 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 208 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttribPointerARB_pointer;
/* 209 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 210 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 211 */     BufferChecks.checkDirect(buffer);
/* 212 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 213 */     nglVertexAttribPointerARB(index, size, unsigned ? 5123 : 5122, normalized, stride, buffer, buffer.position() << 1, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long buffer_buffer_offset) {
/* 217 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 218 */     long function_pointer = caps.ARB_vertex_shader_glVertexAttribPointerARB_pointer;
/* 219 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 220 */     GLChecks.ensureArrayVBOenabled(caps);
/* 221 */     nglVertexAttribPointerARBBO(index, size, type, normalized, stride, buffer_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribPointerARB(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*     */   private static native void nglVertexAttribPointerARBBO(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, long paramLong1, long paramLong2);
/*     */   public static void glEnableVertexAttribArrayARB(int index) {
/* 226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 227 */     long function_pointer = caps.ARB_vertex_shader_glEnableVertexAttribArrayARB_pointer;
/* 228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 229 */     nglEnableVertexAttribArrayARB(index, function_pointer);
/*     */   }
/*     */   private static native void nglEnableVertexAttribArrayARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glDisableVertexAttribArrayARB(int index) {
/* 234 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 235 */     long function_pointer = caps.ARB_vertex_shader_glDisableVertexAttribArrayARB_pointer;
/* 236 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 237 */     nglDisableVertexAttribArrayARB(index, function_pointer);
/*     */   }
/*     */   private static native void nglDisableVertexAttribArrayARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glBindAttribLocationARB(int programObj, int index, ByteBuffer name) {
/* 242 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 243 */     long function_pointer = caps.ARB_vertex_shader_glBindAttribLocationARB_pointer;
/* 244 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 245 */     BufferChecks.checkDirect(name);
/* 246 */     BufferChecks.checkNullTerminated(name);
/* 247 */     nglBindAttribLocationARB(programObj, index, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglBindAttribLocationARB(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glBindAttribLocationARB(int programObj, int index, CharSequence name) {
/* 253 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 254 */     long function_pointer = caps.ARB_vertex_shader_glBindAttribLocationARB_pointer;
/* 255 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 256 */     nglBindAttribLocationARB(programObj, index, APIUtils.getBufferNT(name), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGetActiveAttribARB(int programObj, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.ARB_vertex_shader_glGetActiveAttribARB_pointer;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     if (length != null)
/* 264 */       BufferChecks.checkBuffer(length, 1); 
/* 265 */     BufferChecks.checkBuffer(size, 1);
/* 266 */     BufferChecks.checkBuffer(type, 1);
/* 267 */     BufferChecks.checkDirect(name);
/* 268 */     nglGetActiveAttribARB(programObj, index, name.remaining(), length, (length != null) ? length.position() : 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   private static native void nglGetActiveAttribARB(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, IntBuffer paramIntBuffer3, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*     */ 
/*     */   
/*     */   public static String glGetActiveAttribARB(int programObj, int index, int maxLength, IntBuffer sizeType) {
/* 276 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 277 */     long function_pointer = caps.ARB_vertex_shader_glGetActiveAttribARB_pointer;
/* 278 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 279 */     BufferChecks.checkBuffer(sizeType, 2);
/* 280 */     IntBuffer name_length = APIUtils.getLengths();
/* 281 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/* 282 */     nglGetActiveAttribARB(programObj, index, maxLength, name_length, 0, sizeType, sizeType.position(), sizeType, sizeType.position() + 1, name, name.position(), function_pointer);
/* 283 */     name.limit(name_length.get(0));
/* 284 */     return APIUtils.getString(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetActiveAttribARB(int programObj, int index, int maxLength) {
/* 291 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 292 */     long function_pointer = caps.ARB_vertex_shader_glGetActiveAttribARB_pointer;
/* 293 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 294 */     IntBuffer name_length = APIUtils.getLengths();
/* 295 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/* 296 */     nglGetActiveAttribARB(programObj, index, maxLength, name_length, 0, APIUtils.getBufferInt(), 0, APIUtils.getBufferInt(), 1, name, name.position(), function_pointer);
/* 297 */     name.limit(name_length.get(0));
/* 298 */     return APIUtils.getString(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetActiveAttribSizeARB(int programObj, int index) {
/* 305 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 306 */     long function_pointer = caps.ARB_vertex_shader_glGetActiveAttribARB_pointer;
/* 307 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 308 */     IntBuffer size = APIUtils.getBufferInt();
/* 309 */     nglGetActiveAttribARB(programObj, index, 0, null, 0, size, size.position(), size, 1, APIUtils.getBufferByte(0), 0, function_pointer);
/* 310 */     return size.get(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetActiveAttribTypeARB(int programObj, int index) {
/* 317 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 318 */     long function_pointer = caps.ARB_vertex_shader_glGetActiveAttribARB_pointer;
/* 319 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 320 */     IntBuffer type = APIUtils.getBufferInt();
/* 321 */     nglGetActiveAttribARB(programObj, index, 0, null, 0, type, 1, type, type.position(), APIUtils.getBufferByte(0), 0, function_pointer);
/* 322 */     return type.get(0);
/*     */   }
/*     */   
/*     */   public static int glGetAttribLocationARB(int programObj, ByteBuffer name) {
/* 326 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 327 */     long function_pointer = caps.ARB_vertex_shader_glGetAttribLocationARB_pointer;
/* 328 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 329 */     BufferChecks.checkDirect(name);
/* 330 */     BufferChecks.checkNullTerminated(name);
/* 331 */     int __result = nglGetAttribLocationARB(programObj, name, name.position(), function_pointer);
/* 332 */     return __result;
/*     */   }
/*     */   
/*     */   private static native int nglGetAttribLocationARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGetAttribLocationARB(int programObj, CharSequence name) {
/* 338 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 339 */     long function_pointer = caps.ARB_vertex_shader_glGetAttribLocationARB_pointer;
/* 340 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 341 */     int __result = nglGetAttribLocationARB(programObj, APIUtils.getBufferNT(name), 0, function_pointer);
/* 342 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGetVertexAttribARB(int index, int pname, FloatBuffer params) {
/* 346 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 347 */     long function_pointer = caps.ARB_vertex_shader_glGetVertexAttribfvARB_pointer;
/* 348 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 349 */     BufferChecks.checkBuffer(params, 4);
/* 350 */     nglGetVertexAttribfvARB(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribfvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribARB(int index, int pname, DoubleBuffer params) {
/* 355 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 356 */     long function_pointer = caps.ARB_vertex_shader_glGetVertexAttribdvARB_pointer;
/* 357 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 358 */     BufferChecks.checkBuffer(params, 4);
/* 359 */     nglGetVertexAttribdvARB(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribdvARB(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribARB(int index, int pname, IntBuffer params) {
/* 364 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 365 */     long function_pointer = caps.ARB_vertex_shader_glGetVertexAttribivARB_pointer;
/* 366 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 367 */     BufferChecks.checkBuffer(params, 4);
/* 368 */     nglGetVertexAttribivARB(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static ByteBuffer glGetVertexAttribPointerARB(int index, int pname, long result_size) {
/* 373 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 374 */     long function_pointer = caps.ARB_vertex_shader_glGetVertexAttribPointervARB_pointer;
/* 375 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 376 */     ByteBuffer __result = nglGetVertexAttribPointervARB(index, pname, result_size, function_pointer);
/* 377 */     return __result;
/*     */   }
/*     */   
/*     */   private static native ByteBuffer nglGetVertexAttribPointervARB(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBVertexShader.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */