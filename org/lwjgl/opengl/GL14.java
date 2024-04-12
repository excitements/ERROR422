/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
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
/*     */ public final class GL14
/*     */ {
/*     */   public static final int GL_GENERATE_MIPMAP = 33169;
/*     */   public static final int GL_GENERATE_MIPMAP_HINT = 33170;
/*     */   public static final int GL_DEPTH_COMPONENT16 = 33189;
/*     */   public static final int GL_DEPTH_COMPONENT24 = 33190;
/*     */   public static final int GL_DEPTH_COMPONENT32 = 33191;
/*     */   public static final int GL_TEXTURE_DEPTH_SIZE = 34890;
/*     */   public static final int GL_DEPTH_TEXTURE_MODE = 34891;
/*     */   public static final int GL_TEXTURE_COMPARE_MODE = 34892;
/*     */   public static final int GL_TEXTURE_COMPARE_FUNC = 34893;
/*     */   public static final int GL_COMPARE_R_TO_TEXTURE = 34894;
/*     */   public static final int GL_FOG_COORDINATE_SOURCE = 33872;
/*     */   public static final int GL_FOG_COORDINATE = 33873;
/*     */   public static final int GL_FRAGMENT_DEPTH = 33874;
/*     */   public static final int GL_CURRENT_FOG_COORDINATE = 33875;
/*     */   public static final int GL_FOG_COORDINATE_ARRAY_TYPE = 33876;
/*     */   public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = 33877;
/*     */   public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 33878;
/*     */   public static final int GL_FOG_COORDINATE_ARRAY = 33879;
/*     */   public static final int GL_POINT_SIZE_MIN = 33062;
/*     */   public static final int GL_POINT_SIZE_MAX = 33063;
/*     */   public static final int GL_POINT_FADE_THRESHOLD_SIZE = 33064;
/*     */   public static final int GL_POINT_DISTANCE_ATTENUATION = 33065;
/*     */   public static final int GL_COLOR_SUM = 33880;
/*     */   public static final int GL_CURRENT_SECONDARY_COLOR = 33881;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = 33882;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = 33883;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = 33884;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 33885;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY = 33886;
/*     */   public static final int GL_BLEND_DST_RGB = 32968;
/*     */   public static final int GL_BLEND_SRC_RGB = 32969;
/*     */   public static final int GL_BLEND_DST_ALPHA = 32970;
/*     */   public static final int GL_BLEND_SRC_ALPHA = 32971;
/*     */   public static final int GL_INCR_WRAP = 34055;
/*     */   public static final int GL_DECR_WRAP = 34056;
/*     */   public static final int GL_TEXTURE_FILTER_CONTROL = 34048;
/*     */   public static final int GL_TEXTURE_LOD_BIAS = 34049;
/*     */   public static final int GL_MAX_TEXTURE_LOD_BIAS = 34045;
/*     */   public static final int GL_MIRRORED_REPEAT = 33648;
/*     */   public static final int GL_BLEND_COLOR = 32773;
/*     */   public static final int GL_BLEND_EQUATION = 32777;
/*     */   public static final int GL_FUNC_ADD = 32774;
/*     */   public static final int GL_FUNC_SUBTRACT = 32778;
/*     */   public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
/*     */   public static final int GL_MIN = 32775;
/*     */   public static final int GL_MAX = 32776;
/*     */   
/*     */   public static void glBlendEquation(int mode) {
/*  69 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  70 */     long function_pointer = caps.GL14_glBlendEquation_pointer;
/*  71 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  72 */     nglBlendEquation(mode, function_pointer);
/*     */   }
/*     */   private static native void nglBlendEquation(int paramInt, long paramLong);
/*     */   
/*     */   public static void glBlendColor(float red, float green, float blue, float alpha) {
/*  77 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  78 */     long function_pointer = caps.GL14_glBlendColor_pointer;
/*  79 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  80 */     nglBlendColor(red, green, blue, alpha, function_pointer);
/*     */   }
/*     */   private static native void nglBlendColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glFogCoordf(float coord) {
/*  85 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  86 */     long function_pointer = caps.GL14_glFogCoordf_pointer;
/*  87 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  88 */     nglFogCoordf(coord, function_pointer);
/*     */   }
/*     */   private static native void nglFogCoordf(float paramFloat, long paramLong);
/*     */   
/*     */   public static void glFogCoordd(double coord) {
/*  93 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  94 */     long function_pointer = caps.GL14_glFogCoordd_pointer;
/*  95 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  96 */     nglFogCoordd(coord, function_pointer);
/*     */   }
/*     */   private static native void nglFogCoordd(double paramDouble, long paramLong);
/*     */   
/*     */   public static void glFogCoordPointer(int stride, DoubleBuffer data) {
/* 101 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 102 */     long function_pointer = caps.GL14_glFogCoordPointer_pointer;
/* 103 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 104 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 105 */     BufferChecks.checkDirect(data);
/* 106 */     (GLChecks.getReferences(caps)).GL14_glFogCoordPointer_data = data;
/* 107 */     nglFogCoordPointer(5130, stride, data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glFogCoordPointer(int stride, FloatBuffer data) {
/* 110 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 111 */     long function_pointer = caps.GL14_glFogCoordPointer_pointer;
/* 112 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 113 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 114 */     BufferChecks.checkDirect(data);
/* 115 */     (GLChecks.getReferences(caps)).GL14_glFogCoordPointer_data = data;
/* 116 */     nglFogCoordPointer(5126, stride, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glFogCoordPointer(int type, int stride, long data_buffer_offset) {
/* 120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 121 */     long function_pointer = caps.GL14_glFogCoordPointer_pointer;
/* 122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 123 */     GLChecks.ensureArrayVBOenabled(caps);
/* 124 */     nglFogCoordPointerBO(type, stride, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglFogCoordPointer(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*     */   private static native void nglFogCoordPointerBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   public static void glMultiDrawArrays(int mode, IntBuffer piFirst, IntBuffer piCount) {
/* 129 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 130 */     long function_pointer = caps.GL14_glMultiDrawArrays_pointer;
/* 131 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 132 */     BufferChecks.checkDirect(piFirst);
/* 133 */     BufferChecks.checkBuffer(piCount, piFirst.remaining());
/* 134 */     nglMultiDrawArrays(mode, piFirst, piFirst.position(), piCount, piCount.position(), piFirst.remaining(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiDrawArrays(int paramInt1, IntBuffer paramIntBuffer1, int paramInt2, IntBuffer paramIntBuffer2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glPointParameteri(int pname, int param) {
/* 139 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 140 */     long function_pointer = caps.GL14_glPointParameteri_pointer;
/* 141 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 142 */     nglPointParameteri(pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglPointParameteri(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glPointParameterf(int pname, float param) {
/* 147 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 148 */     long function_pointer = caps.GL14_glPointParameterf_pointer;
/* 149 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 150 */     nglPointParameterf(pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglPointParameterf(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glPointParameter(int pname, IntBuffer params) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.GL14_glPointParameteriv_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     BufferChecks.checkBuffer(params, 4);
/* 159 */     nglPointParameteriv(pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglPointParameteriv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glPointParameter(int pname, FloatBuffer params) {
/* 164 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 165 */     long function_pointer = caps.GL14_glPointParameterfv_pointer;
/* 166 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 167 */     BufferChecks.checkBuffer(params, 4);
/* 168 */     nglPointParameterfv(pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglPointParameterfv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glSecondaryColor3b(byte red, byte green, byte blue) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.GL14_glSecondaryColor3b_pointer;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     nglSecondaryColor3b(red, green, blue, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColor3b(byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*     */   
/*     */   public static void glSecondaryColor3f(float red, float green, float blue) {
/* 181 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 182 */     long function_pointer = caps.GL14_glSecondaryColor3f_pointer;
/* 183 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 184 */     nglSecondaryColor3f(red, green, blue, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColor3f(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glSecondaryColor3d(double red, double green, double blue) {
/* 189 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 190 */     long function_pointer = caps.GL14_glSecondaryColor3d_pointer;
/* 191 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 192 */     nglSecondaryColor3d(red, green, blue, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColor3d(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glSecondaryColor3ub(byte red, byte green, byte blue) {
/* 197 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 198 */     long function_pointer = caps.GL14_glSecondaryColor3ub_pointer;
/* 199 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 200 */     nglSecondaryColor3ub(red, green, blue, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColor3ub(byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*     */   
/*     */   public static void glSecondaryColorPointer(int size, int stride, DoubleBuffer data) {
/* 205 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 206 */     long function_pointer = caps.GL14_glSecondaryColorPointer_pointer;
/* 207 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 208 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 209 */     BufferChecks.checkDirect(data);
/* 210 */     nglSecondaryColorPointer(size, 5130, stride, data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glSecondaryColorPointer(int size, int stride, FloatBuffer data) {
/* 213 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 214 */     long function_pointer = caps.GL14_glSecondaryColorPointer_pointer;
/* 215 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 216 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 217 */     BufferChecks.checkDirect(data);
/* 218 */     nglSecondaryColorPointer(size, 5126, stride, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glSecondaryColorPointer(int size, boolean unsigned, int stride, ByteBuffer data) {
/* 221 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 222 */     long function_pointer = caps.GL14_glSecondaryColorPointer_pointer;
/* 223 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 224 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 225 */     BufferChecks.checkDirect(data);
/* 226 */     nglSecondaryColorPointer(size, unsigned ? 5121 : 5120, stride, data, data.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColorPointer(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*     */   public static void glSecondaryColorPointer(int size, int type, int stride, long data_buffer_offset) {
/* 230 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 231 */     long function_pointer = caps.GL14_glSecondaryColorPointer_pointer;
/* 232 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 233 */     GLChecks.ensureArrayVBOenabled(caps);
/* 234 */     nglSecondaryColorPointerBO(size, type, stride, data_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColorPointerBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
/* 239 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 240 */     long function_pointer = caps.GL14_glBlendFuncSeparate_pointer;
/* 241 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 242 */     nglBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha, function_pointer);
/*     */   }
/*     */   private static native void nglBlendFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glWindowPos2f(float x, float y) {
/* 247 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 248 */     long function_pointer = caps.GL14_glWindowPos2f_pointer;
/* 249 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 250 */     nglWindowPos2f(x, y, function_pointer);
/*     */   }
/*     */   private static native void nglWindowPos2f(float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glWindowPos2d(double x, double y) {
/* 255 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 256 */     long function_pointer = caps.GL14_glWindowPos2d_pointer;
/* 257 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 258 */     nglWindowPos2d(x, y, function_pointer);
/*     */   }
/*     */   private static native void nglWindowPos2d(double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glWindowPos2i(int x, int y) {
/* 263 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 264 */     long function_pointer = caps.GL14_glWindowPos2i_pointer;
/* 265 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 266 */     nglWindowPos2i(x, y, function_pointer);
/*     */   }
/*     */   private static native void nglWindowPos2i(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWindowPos3f(float x, float y, float z) {
/* 271 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 272 */     long function_pointer = caps.GL14_glWindowPos3f_pointer;
/* 273 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 274 */     nglWindowPos3f(x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglWindowPos3f(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glWindowPos3d(double x, double y, double z) {
/* 279 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 280 */     long function_pointer = caps.GL14_glWindowPos3d_pointer;
/* 281 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 282 */     nglWindowPos3d(x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglWindowPos3d(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glWindowPos3i(int x, int y, int z) {
/* 287 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 288 */     long function_pointer = caps.GL14_glWindowPos3i_pointer;
/* 289 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 290 */     nglWindowPos3i(x, y, z, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglWindowPos3i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL14.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */