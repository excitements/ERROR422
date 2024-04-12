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
/*     */ public final class GL13
/*     */ {
/*     */   public static final int GL_TEXTURE0 = 33984;
/*     */   public static final int GL_TEXTURE1 = 33985;
/*     */   public static final int GL_TEXTURE2 = 33986;
/*     */   public static final int GL_TEXTURE3 = 33987;
/*     */   public static final int GL_TEXTURE4 = 33988;
/*     */   public static final int GL_TEXTURE5 = 33989;
/*     */   public static final int GL_TEXTURE6 = 33990;
/*     */   public static final int GL_TEXTURE7 = 33991;
/*     */   public static final int GL_TEXTURE8 = 33992;
/*     */   public static final int GL_TEXTURE9 = 33993;
/*     */   public static final int GL_TEXTURE10 = 33994;
/*     */   public static final int GL_TEXTURE11 = 33995;
/*     */   public static final int GL_TEXTURE12 = 33996;
/*     */   public static final int GL_TEXTURE13 = 33997;
/*     */   public static final int GL_TEXTURE14 = 33998;
/*     */   public static final int GL_TEXTURE15 = 33999;
/*     */   public static final int GL_TEXTURE16 = 34000;
/*     */   public static final int GL_TEXTURE17 = 34001;
/*     */   public static final int GL_TEXTURE18 = 34002;
/*     */   public static final int GL_TEXTURE19 = 34003;
/*     */   public static final int GL_TEXTURE20 = 34004;
/*     */   public static final int GL_TEXTURE21 = 34005;
/*     */   public static final int GL_TEXTURE22 = 34006;
/*     */   public static final int GL_TEXTURE23 = 34007;
/*     */   public static final int GL_TEXTURE24 = 34008;
/*     */   public static final int GL_TEXTURE25 = 34009;
/*     */   public static final int GL_TEXTURE26 = 34010;
/*     */   public static final int GL_TEXTURE27 = 34011;
/*     */   public static final int GL_TEXTURE28 = 34012;
/*     */   public static final int GL_TEXTURE29 = 34013;
/*     */   public static final int GL_TEXTURE30 = 34014;
/*     */   public static final int GL_TEXTURE31 = 34015;
/*     */   public static final int GL_ACTIVE_TEXTURE = 34016;
/*     */   public static final int GL_CLIENT_ACTIVE_TEXTURE = 34017;
/*     */   public static final int GL_MAX_TEXTURE_UNITS = 34018;
/*     */   public static final int GL_NORMAL_MAP = 34065;
/*     */   public static final int GL_REFLECTION_MAP = 34066;
/*     */   public static final int GL_TEXTURE_CUBE_MAP = 34067;
/*     */   public static final int GL_TEXTURE_BINDING_CUBE_MAP = 34068;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;
/*     */   public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;
/*     */   public static final int GL_PROXY_TEXTURE_CUBE_MAP = 34075;
/*     */   public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;
/*     */   public static final int GL_COMPRESSED_ALPHA = 34025;
/*     */   public static final int GL_COMPRESSED_LUMINANCE = 34026;
/*     */   public static final int GL_COMPRESSED_LUMINANCE_ALPHA = 34027;
/*     */   public static final int GL_COMPRESSED_INTENSITY = 34028;
/*     */   public static final int GL_COMPRESSED_RGB = 34029;
/*     */   public static final int GL_COMPRESSED_RGBA = 34030;
/*     */   public static final int GL_TEXTURE_COMPRESSION_HINT = 34031;
/*     */   public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 34464;
/*     */   public static final int GL_TEXTURE_COMPRESSED = 34465;
/*     */   public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;
/*     */   public static final int GL_COMPRESSED_TEXTURE_FORMATS = 34467;
/*     */   public static final int GL_MULTISAMPLE = 32925;
/*     */   public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 32926;
/*     */   public static final int GL_SAMPLE_ALPHA_TO_ONE = 32927;
/*     */   public static final int GL_SAMPLE_COVERAGE = 32928;
/*     */   public static final int GL_SAMPLE_BUFFERS = 32936;
/*     */   public static final int GL_SAMPLES = 32937;
/*     */   public static final int GL_SAMPLE_COVERAGE_VALUE = 32938;
/*     */   public static final int GL_SAMPLE_COVERAGE_INVERT = 32939;
/*     */   public static final int GL_MULTISAMPLE_BIT = 536870912;
/*     */   public static final int GL_TRANSPOSE_MODELVIEW_MATRIX = 34019;
/*     */   public static final int GL_TRANSPOSE_PROJECTION_MATRIX = 34020;
/*     */   public static final int GL_TRANSPOSE_TEXTURE_MATRIX = 34021;
/*     */   public static final int GL_TRANSPOSE_COLOR_MATRIX = 34022;
/*     */   public static final int GL_COMBINE = 34160;
/*     */   public static final int GL_COMBINE_RGB = 34161;
/*     */   public static final int GL_COMBINE_ALPHA = 34162;
/*     */   public static final int GL_SOURCE0_RGB = 34176;
/*     */   public static final int GL_SOURCE1_RGB = 34177;
/*     */   public static final int GL_SOURCE2_RGB = 34178;
/*     */   public static final int GL_SOURCE0_ALPHA = 34184;
/*     */   public static final int GL_SOURCE1_ALPHA = 34185;
/*     */   public static final int GL_SOURCE2_ALPHA = 34186;
/*     */   public static final int GL_OPERAND0_RGB = 34192;
/*     */   public static final int GL_OPERAND1_RGB = 34193;
/*     */   public static final int GL_OPERAND2_RGB = 34194;
/*     */   public static final int GL_OPERAND0_ALPHA = 34200;
/*     */   public static final int GL_OPERAND1_ALPHA = 34201;
/*     */   public static final int GL_OPERAND2_ALPHA = 34202;
/*     */   public static final int GL_RGB_SCALE = 34163;
/*     */   public static final int GL_ADD_SIGNED = 34164;
/*     */   public static final int GL_INTERPOLATE = 34165;
/*     */   public static final int GL_SUBTRACT = 34023;
/*     */   public static final int GL_CONSTANT = 34166;
/*     */   public static final int GL_PRIMARY_COLOR = 34167;
/*     */   public static final int GL_PREVIOUS = 34168;
/*     */   public static final int GL_DOT3_RGB = 34478;
/*     */   public static final int GL_DOT3_RGBA = 34479;
/*     */   public static final int GL_CLAMP_TO_BORDER = 33069;
/*     */   
/*     */   public static void glActiveTexture(int texture) {
/* 119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 120 */     long function_pointer = caps.GL13_glActiveTexture_pointer;
/* 121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 122 */     nglActiveTexture(texture, function_pointer);
/*     */   }
/*     */   private static native void nglActiveTexture(int paramInt, long paramLong);
/*     */   
/*     */   public static void glClientActiveTexture(int texture) {
/* 127 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 128 */     long function_pointer = caps.GL13_glClientActiveTexture_pointer;
/* 129 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 130 */     (GLChecks.getReferences(caps)).glClientActiveTexture = texture - 33984;
/* 131 */     nglClientActiveTexture(texture, function_pointer);
/*     */   }
/*     */   private static native void nglClientActiveTexture(int paramInt, long paramLong);
/*     */   
/*     */   public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, ByteBuffer data) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.GL13_glCompressedTexImage1D_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 140 */     BufferChecks.checkDirect(data);
/* 141 */     nglCompressedTexImage1D(target, level, internalformat, width, border, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data_buffer_offset) {
/* 145 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 146 */     long function_pointer = caps.GL13_glCompressedTexImage1D_pointer;
/* 147 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 148 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 149 */     nglCompressedTexImage1DBO(target, level, internalformat, width, border, imageSize, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer, int paramInt7, long paramLong);
/*     */   private static native void nglCompressedTexImage1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*     */   public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
/* 154 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 155 */     long function_pointer = caps.GL13_glCompressedTexImage2D_pointer;
/* 156 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 157 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 158 */     BufferChecks.checkDirect(data);
/* 159 */     nglCompressedTexImage2D(target, level, internalformat, width, height, border, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, ByteBuffer paramByteBuffer, int paramInt8, long paramLong);
/*     */   public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data_buffer_offset) {
/* 163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 164 */     long function_pointer = caps.GL13_glCompressedTexImage2D_pointer;
/* 165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 166 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 167 */     nglCompressedTexImage2DBO(target, level, internalformat, width, height, border, imageSize, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
/* 172 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 173 */     long function_pointer = caps.GL13_glCompressedTexImage3D_pointer;
/* 174 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 175 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 176 */     BufferChecks.checkDirect(data);
/* 177 */     nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ByteBuffer paramByteBuffer, int paramInt9, long paramLong);
/*     */   public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data_buffer_offset) {
/* 181 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 182 */     long function_pointer = caps.GL13_glCompressedTexImage3D_pointer;
/* 183 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 184 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 185 */     nglCompressedTexImage3DBO(target, level, internalformat, width, height, depth, border, imageSize, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage3DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, ByteBuffer data) {
/* 190 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 191 */     long function_pointer = caps.GL13_glCompressedTexSubImage1D_pointer;
/* 192 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 193 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 194 */     BufferChecks.checkDirect(data);
/* 195 */     nglCompressedTexSubImage1D(target, level, xoffset, width, format, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*     */   public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data_buffer_offset) {
/* 199 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 200 */     long function_pointer = caps.GL13_glCompressedTexSubImage1D_pointer;
/* 201 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 202 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 203 */     nglCompressedTexSubImage1DBO(target, level, xoffset, width, format, imageSize, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
/* 208 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 209 */     long function_pointer = caps.GL13_glCompressedTexSubImage2D_pointer;
/* 210 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 211 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 212 */     BufferChecks.checkDirect(data);
/* 213 */     nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ByteBuffer paramByteBuffer, int paramInt9, long paramLong);
/*     */   public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data_buffer_offset) {
/* 217 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 218 */     long function_pointer = caps.GL13_glCompressedTexSubImage2D_pointer;
/* 219 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 220 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 221 */     nglCompressedTexSubImage2DBO(target, level, xoffset, yoffset, width, height, format, imageSize, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
/* 226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 227 */     long function_pointer = caps.GL13_glCompressedTexSubImage3D_pointer;
/* 228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 229 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 230 */     BufferChecks.checkDirect(data);
/* 231 */     nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, ByteBuffer paramByteBuffer, int paramInt11, long paramLong);
/*     */   public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data_buffer_offset) {
/* 235 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 236 */     long function_pointer = caps.GL13_glCompressedTexSubImage3D_pointer;
/* 237 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 238 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 239 */     nglCompressedTexSubImage3DBO(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage3DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glGetCompressedTexImage(int target, int lod, ByteBuffer img) {
/* 244 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 245 */     long function_pointer = caps.GL13_glGetCompressedTexImage_pointer;
/* 246 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 247 */     GLChecks.ensurePackPBOdisabled(caps);
/* 248 */     BufferChecks.checkDirect(img);
/* 249 */     nglGetCompressedTexImage(target, lod, img, img.position(), function_pointer);
/*     */   }
/*     */   public static void glGetCompressedTexImage(int target, int lod, IntBuffer img) {
/* 252 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 253 */     long function_pointer = caps.GL13_glGetCompressedTexImage_pointer;
/* 254 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 255 */     GLChecks.ensurePackPBOdisabled(caps);
/* 256 */     BufferChecks.checkDirect(img);
/* 257 */     nglGetCompressedTexImage(target, lod, img, img.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glGetCompressedTexImage(int target, int lod, ShortBuffer img) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.GL13_glGetCompressedTexImage_pointer;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     GLChecks.ensurePackPBOdisabled(caps);
/* 264 */     BufferChecks.checkDirect(img);
/* 265 */     nglGetCompressedTexImage(target, lod, img, img.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglGetCompressedTexImage(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*     */   public static void glGetCompressedTexImage(int target, int lod, long img_buffer_offset) {
/* 269 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 270 */     long function_pointer = caps.GL13_glGetCompressedTexImage_pointer;
/* 271 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 272 */     GLChecks.ensurePackPBOenabled(caps);
/* 273 */     nglGetCompressedTexImageBO(target, lod, img_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglGetCompressedTexImageBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glMultiTexCoord1f(int target, float s) {
/* 278 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 279 */     long function_pointer = caps.GL13_glMultiTexCoord1f_pointer;
/* 280 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 281 */     nglMultiTexCoord1f(target, s, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord1f(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord1d(int target, double s) {
/* 286 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 287 */     long function_pointer = caps.GL13_glMultiTexCoord1d_pointer;
/* 288 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 289 */     nglMultiTexCoord1d(target, s, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord1d(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord2f(int target, float s, float t) {
/* 294 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 295 */     long function_pointer = caps.GL13_glMultiTexCoord2f_pointer;
/* 296 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 297 */     nglMultiTexCoord2f(target, s, t, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord2f(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord2d(int target, double s, double t) {
/* 302 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 303 */     long function_pointer = caps.GL13_glMultiTexCoord2d_pointer;
/* 304 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 305 */     nglMultiTexCoord2d(target, s, t, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord2d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord3f(int target, float s, float t, float r) {
/* 310 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 311 */     long function_pointer = caps.GL13_glMultiTexCoord3f_pointer;
/* 312 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 313 */     nglMultiTexCoord3f(target, s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord3d(int target, double s, double t, double r) {
/* 318 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 319 */     long function_pointer = caps.GL13_glMultiTexCoord3d_pointer;
/* 320 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 321 */     nglMultiTexCoord3d(target, s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord3d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
/* 326 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 327 */     long function_pointer = caps.GL13_glMultiTexCoord4f_pointer;
/* 328 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 329 */     nglMultiTexCoord4f(target, s, t, r, q, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord4d(int target, double s, double t, double r, double q) {
/* 334 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 335 */     long function_pointer = caps.GL13_glMultiTexCoord4d_pointer;
/* 336 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 337 */     nglMultiTexCoord4d(target, s, t, r, q, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord4d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glLoadTransposeMatrix(FloatBuffer m) {
/* 342 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 343 */     long function_pointer = caps.GL13_glLoadTransposeMatrixf_pointer;
/* 344 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 345 */     BufferChecks.checkBuffer(m, 16);
/* 346 */     nglLoadTransposeMatrixf(m, m.position(), function_pointer);
/*     */   }
/*     */   private static native void nglLoadTransposeMatrixf(FloatBuffer paramFloatBuffer, int paramInt, long paramLong);
/*     */   
/*     */   public static void glLoadTransposeMatrix(DoubleBuffer m) {
/* 351 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 352 */     long function_pointer = caps.GL13_glLoadTransposeMatrixd_pointer;
/* 353 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 354 */     BufferChecks.checkBuffer(m, 16);
/* 355 */     nglLoadTransposeMatrixd(m, m.position(), function_pointer);
/*     */   }
/*     */   private static native void nglLoadTransposeMatrixd(DoubleBuffer paramDoubleBuffer, int paramInt, long paramLong);
/*     */   
/*     */   public static void glMultTransposeMatrix(FloatBuffer m) {
/* 360 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 361 */     long function_pointer = caps.GL13_glMultTransposeMatrixf_pointer;
/* 362 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 363 */     BufferChecks.checkBuffer(m, 16);
/* 364 */     nglMultTransposeMatrixf(m, m.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultTransposeMatrixf(FloatBuffer paramFloatBuffer, int paramInt, long paramLong);
/*     */   
/*     */   public static void glMultTransposeMatrix(DoubleBuffer m) {
/* 369 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 370 */     long function_pointer = caps.GL13_glMultTransposeMatrixd_pointer;
/* 371 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 372 */     BufferChecks.checkBuffer(m, 16);
/* 373 */     nglMultTransposeMatrixd(m, m.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultTransposeMatrixd(DoubleBuffer paramDoubleBuffer, int paramInt, long paramLong);
/*     */   
/*     */   public static void glSampleCoverage(float value, boolean invert) {
/* 378 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 379 */     long function_pointer = caps.GL13_glSampleCoverage_pointer;
/* 380 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 381 */     nglSampleCoverage(value, invert, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglSampleCoverage(float paramFloat, boolean paramBoolean, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL13.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */