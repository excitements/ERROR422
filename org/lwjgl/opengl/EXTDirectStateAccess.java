/*      */ package org.lwjgl.opengl;
/*      */ 
/*      */ import java.nio.Buffer;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.DoubleBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import java.nio.ShortBuffer;
/*      */ import org.lwjgl.BufferChecks;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class EXTDirectStateAccess
/*      */ {
/*      */   public static final int GL_PROGRAM_MATRIX_EXT = 36397;
/*      */   public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 36398;
/*      */   public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 36399;
/*      */   
/*      */   public static void glClientAttribDefaultEXT(int mask) {
/*   24 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   25 */     long function_pointer = caps.EXT_direct_state_access_glClientAttribDefaultEXT_pointer;
/*   26 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   27 */     nglClientAttribDefaultEXT(mask, function_pointer);
/*      */   }
/*      */   private static native void nglClientAttribDefaultEXT(int paramInt, long paramLong);
/*      */   
/*      */   public static void glPushClientAttribDefaultEXT(int mask) {
/*   32 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   33 */     long function_pointer = caps.EXT_direct_state_access_glPushClientAttribDefaultEXT_pointer;
/*   34 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   35 */     nglPushClientAttribDefaultEXT(mask, function_pointer);
/*      */   }
/*      */   private static native void nglPushClientAttribDefaultEXT(int paramInt, long paramLong);
/*      */   
/*      */   public static void glMatrixLoadEXT(int matrixMode, FloatBuffer m) {
/*   40 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   41 */     long function_pointer = caps.EXT_direct_state_access_glMatrixLoadfEXT_pointer;
/*   42 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   43 */     BufferChecks.checkBuffer(m, 16);
/*   44 */     nglMatrixLoadfEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixLoadfEXT(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glMatrixLoadEXT(int matrixMode, DoubleBuffer m) {
/*   49 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   50 */     long function_pointer = caps.EXT_direct_state_access_glMatrixLoaddEXT_pointer;
/*   51 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   52 */     BufferChecks.checkBuffer(m, 16);
/*   53 */     nglMatrixLoaddEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixLoaddEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glMatrixMultEXT(int matrixMode, FloatBuffer m) {
/*   58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   59 */     long function_pointer = caps.EXT_direct_state_access_glMatrixMultfEXT_pointer;
/*   60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   61 */     BufferChecks.checkBuffer(m, 16);
/*   62 */     nglMatrixMultfEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixMultfEXT(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glMatrixMultEXT(int matrixMode, DoubleBuffer m) {
/*   67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   68 */     long function_pointer = caps.EXT_direct_state_access_glMatrixMultdEXT_pointer;
/*   69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   70 */     BufferChecks.checkBuffer(m, 16);
/*   71 */     nglMatrixMultdEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixMultdEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glMatrixLoadIdentityEXT(int matrixMode) {
/*   76 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   77 */     long function_pointer = caps.EXT_direct_state_access_glMatrixLoadIdentityEXT_pointer;
/*   78 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   79 */     nglMatrixLoadIdentityEXT(matrixMode, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixLoadIdentityEXT(int paramInt, long paramLong);
/*      */   
/*      */   public static void glMatrixRotatefEXT(int matrixMode, float angle, float x, float y, float z) {
/*   84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   85 */     long function_pointer = caps.EXT_direct_state_access_glMatrixRotatefEXT_pointer;
/*   86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   87 */     nglMatrixRotatefEXT(matrixMode, angle, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixRotatefEXT(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glMatrixRotatedEXT(int matrixMode, double angle, double x, double y, double z) {
/*   92 */     ContextCapabilities caps = GLContext.getCapabilities();
/*   93 */     long function_pointer = caps.EXT_direct_state_access_glMatrixRotatedEXT_pointer;
/*   94 */     BufferChecks.checkFunctionAddress(function_pointer);
/*   95 */     nglMatrixRotatedEXT(matrixMode, angle, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixRotatedEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glMatrixScalefEXT(int matrixMode, float x, float y, float z) {
/*  100 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  101 */     long function_pointer = caps.EXT_direct_state_access_glMatrixScalefEXT_pointer;
/*  102 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  103 */     nglMatrixScalefEXT(matrixMode, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixScalefEXT(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glMatrixScaledEXT(int matrixMode, double x, double y, double z) {
/*  108 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  109 */     long function_pointer = caps.EXT_direct_state_access_glMatrixScaledEXT_pointer;
/*  110 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  111 */     nglMatrixScaledEXT(matrixMode, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixScaledEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glMatrixTranslatefEXT(int matrixMode, float x, float y, float z) {
/*  116 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  117 */     long function_pointer = caps.EXT_direct_state_access_glMatrixTranslatefEXT_pointer;
/*  118 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  119 */     nglMatrixTranslatefEXT(matrixMode, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixTranslatefEXT(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glMatrixTranslatedEXT(int matrixMode, double x, double y, double z) {
/*  124 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  125 */     long function_pointer = caps.EXT_direct_state_access_glMatrixTranslatedEXT_pointer;
/*  126 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  127 */     nglMatrixTranslatedEXT(matrixMode, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixTranslatedEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glMatrixOrthoEXT(int matrixMode, double l, double r, double b, double t, double n, double f) {
/*  132 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  133 */     long function_pointer = caps.EXT_direct_state_access_glMatrixOrthoEXT_pointer;
/*  134 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  135 */     nglMatrixOrthoEXT(matrixMode, l, r, b, t, n, f, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixOrthoEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong);
/*      */   
/*      */   public static void glMatrixFrustumEXT(int matrixMode, double l, double r, double b, double t, double n, double f) {
/*  140 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  141 */     long function_pointer = caps.EXT_direct_state_access_glMatrixFrustumEXT_pointer;
/*  142 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  143 */     nglMatrixFrustumEXT(matrixMode, l, r, b, t, n, f, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixFrustumEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong);
/*      */   
/*      */   public static void glMatrixPushEXT(int matrixMode) {
/*  148 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  149 */     long function_pointer = caps.EXT_direct_state_access_glMatrixPushEXT_pointer;
/*  150 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  151 */     nglMatrixPushEXT(matrixMode, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixPushEXT(int paramInt, long paramLong);
/*      */   
/*      */   public static void glMatrixPopEXT(int matrixMode) {
/*  156 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  157 */     long function_pointer = caps.EXT_direct_state_access_glMatrixPopEXT_pointer;
/*  158 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  159 */     nglMatrixPopEXT(matrixMode, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixPopEXT(int paramInt, long paramLong);
/*      */   
/*      */   public static void glTextureParameteriEXT(int texture, int target, int pname, int param) {
/*  164 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  165 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameteriEXT_pointer;
/*  166 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  167 */     nglTextureParameteriEXT(texture, target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTextureParameteriEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTextureParameterEXT(int texture, int target, int pname, IntBuffer param) {
/*  172 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  173 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameterivEXT_pointer;
/*  174 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  175 */     BufferChecks.checkBuffer(param, 4);
/*  176 */     nglTextureParameterivEXT(texture, target, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTextureParameterivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTextureParameterfEXT(int texture, int target, int pname, float param) {
/*  181 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  182 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameterfEXT_pointer;
/*  183 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  184 */     nglTextureParameterfEXT(texture, target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTextureParameterfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glTextureParameterEXT(int texture, int target, int pname, FloatBuffer param) {
/*  189 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  190 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameterfvEXT_pointer;
/*  191 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  192 */     BufferChecks.checkBuffer(param, 4);
/*  193 */     nglTextureParameterfvEXT(texture, target, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTextureParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
/*  198 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  199 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage1DEXT_pointer;
/*  200 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  201 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  202 */     if (pixels != null)
/*  203 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  204 */     nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
/*  207 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  208 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage1DEXT_pointer;
/*  209 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  210 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  211 */     if (pixels != null)
/*  212 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  213 */     nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
/*  216 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  217 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage1DEXT_pointer;
/*  218 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  219 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  220 */     if (pixels != null)
/*  221 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  222 */     nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
/*  225 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  226 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage1DEXT_pointer;
/*  227 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  228 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  229 */     if (pixels != null)
/*  230 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  231 */     nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
/*  234 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  235 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage1DEXT_pointer;
/*  236 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  237 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  238 */     if (pixels != null)
/*  239 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  240 */     nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels_buffer_offset) {
/*  244 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  245 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage1DEXT_pointer;
/*  246 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  247 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  248 */     nglTextureImage1DEXTBO(texture, target, level, internalformat, width, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTextureImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer, int paramInt9, long paramLong);
/*      */   private static native void nglTextureImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*      */   public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
/*  253 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  254 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage2DEXT_pointer;
/*  255 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  256 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  257 */     if (pixels != null)
/*  258 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  259 */     nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
/*  262 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  263 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage2DEXT_pointer;
/*  264 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  265 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  266 */     if (pixels != null)
/*  267 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  268 */     nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
/*  271 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  272 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage2DEXT_pointer;
/*  273 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  274 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  275 */     if (pixels != null)
/*  276 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  277 */     nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
/*  280 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  281 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage2DEXT_pointer;
/*  282 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  283 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  284 */     if (pixels != null)
/*  285 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  286 */     nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
/*  289 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  290 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage2DEXT_pointer;
/*  291 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  292 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  293 */     if (pixels != null)
/*  294 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  295 */     nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   private static native void nglTextureImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, Buffer paramBuffer, int paramInt10, long paramLong);
/*      */   public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels_buffer_offset) {
/*  299 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  300 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage2DEXT_pointer;
/*  301 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  302 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  303 */     nglTextureImage2DEXTBO(texture, target, level, internalformat, width, height, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTextureImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
/*  308 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  309 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage1DEXT_pointer;
/*  310 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  311 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  312 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/*  313 */     nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
/*  316 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  317 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage1DEXT_pointer;
/*  318 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  319 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  320 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/*  321 */     nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
/*  324 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  325 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage1DEXT_pointer;
/*  326 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  327 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  328 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/*  329 */     nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
/*  332 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  333 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage1DEXT_pointer;
/*  334 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  335 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  336 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/*  337 */     nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
/*  340 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  341 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage1DEXT_pointer;
/*  342 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  343 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  344 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/*  345 */     nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglTextureSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Buffer paramBuffer, int paramInt8, long paramLong);
/*      */   public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset) {
/*  349 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  350 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage1DEXT_pointer;
/*  351 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  352 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  353 */     nglTextureSubImage1DEXTBO(texture, target, level, xoffset, width, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTextureSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
/*  358 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  359 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage2DEXT_pointer;
/*  360 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  361 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  362 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/*  363 */     nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
/*  366 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  367 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage2DEXT_pointer;
/*  368 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  369 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  370 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/*  371 */     nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
/*  374 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  375 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage2DEXT_pointer;
/*  376 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  377 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  378 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/*  379 */     nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
/*  382 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  383 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage2DEXT_pointer;
/*  384 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  385 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  386 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/*  387 */     nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
/*  390 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  391 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage2DEXT_pointer;
/*  392 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  393 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  394 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/*  395 */     nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglTextureSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, Buffer paramBuffer, int paramInt10, long paramLong);
/*      */   public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset) {
/*  399 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  400 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage2DEXT_pointer;
/*  401 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  402 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  403 */     nglTextureSubImage2DEXTBO(texture, target, level, xoffset, yoffset, width, height, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTextureSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border) {
/*  408 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  409 */     long function_pointer = caps.EXT_direct_state_access_glCopyTextureImage1DEXT_pointer;
/*  410 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  411 */     nglCopyTextureImage1DEXT(texture, target, level, internalformat, x, y, width, border, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTextureImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong);
/*      */   
/*      */   public static void glCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
/*  416 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  417 */     long function_pointer = caps.EXT_direct_state_access_glCopyTextureImage2DEXT_pointer;
/*  418 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  419 */     nglCopyTextureImage2DEXT(texture, target, level, internalformat, x, y, width, height, border, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTextureImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
/*      */   
/*      */   public static void glCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width) {
/*  424 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  425 */     long function_pointer = caps.EXT_direct_state_access_glCopyTextureSubImage1DEXT_pointer;
/*  426 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  427 */     nglCopyTextureSubImage1DEXT(texture, target, level, xoffset, x, y, width, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTextureSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
/*      */   
/*      */   public static void glCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
/*  432 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  433 */     long function_pointer = caps.EXT_direct_state_access_glCopyTextureSubImage2DEXT_pointer;
/*  434 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  435 */     nglCopyTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, x, y, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTextureSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
/*      */   
/*      */   public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ByteBuffer pixels) {
/*  440 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  441 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureImageEXT_pointer;
/*  442 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  443 */     GLChecks.ensurePackPBOdisabled(caps);
/*  444 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/*  445 */     nglGetTextureImageEXT(texture, target, level, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, DoubleBuffer pixels) {
/*  448 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  449 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureImageEXT_pointer;
/*  450 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  451 */     GLChecks.ensurePackPBOdisabled(caps);
/*  452 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/*  453 */     nglGetTextureImageEXT(texture, target, level, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, FloatBuffer pixels) {
/*  456 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  457 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureImageEXT_pointer;
/*  458 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  459 */     GLChecks.ensurePackPBOdisabled(caps);
/*  460 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/*  461 */     nglGetTextureImageEXT(texture, target, level, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, IntBuffer pixels) {
/*  464 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  465 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureImageEXT_pointer;
/*  466 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  467 */     GLChecks.ensurePackPBOdisabled(caps);
/*  468 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/*  469 */     nglGetTextureImageEXT(texture, target, level, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ShortBuffer pixels) {
/*  472 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  473 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureImageEXT_pointer;
/*  474 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  475 */     GLChecks.ensurePackPBOdisabled(caps);
/*  476 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/*  477 */     nglGetTextureImageEXT(texture, target, level, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetTextureImageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*      */   public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels_buffer_offset) {
/*  481 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  482 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureImageEXT_pointer;
/*  483 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  484 */     GLChecks.ensurePackPBOenabled(caps);
/*  485 */     nglGetTextureImageEXTBO(texture, target, level, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetTextureImageEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetTextureParameterEXT(int texture, int target, int pname, FloatBuffer params) {
/*  490 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  491 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterfvEXT_pointer;
/*  492 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  493 */     BufferChecks.checkBuffer(params, 4);
/*  494 */     nglGetTextureParameterfvEXT(texture, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTextureParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static float glGetTextureParameterfEXT(int texture, int target, int pname) {
/*  500 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  501 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterfvEXT_pointer;
/*  502 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  503 */     FloatBuffer params = APIUtils.getBufferFloat();
/*  504 */     nglGetTextureParameterfvEXT(texture, target, pname, params, params.position(), function_pointer);
/*  505 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTextureParameterEXT(int texture, int target, int pname, IntBuffer params) {
/*  509 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  510 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterivEXT_pointer;
/*  511 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  512 */     BufferChecks.checkBuffer(params, 4);
/*  513 */     nglGetTextureParameterivEXT(texture, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTextureParameterivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetTextureParameteriEXT(int texture, int target, int pname) {
/*  519 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  520 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterivEXT_pointer;
/*  521 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  522 */     IntBuffer params = APIUtils.getBufferInt();
/*  523 */     nglGetTextureParameterivEXT(texture, target, pname, params, params.position(), function_pointer);
/*  524 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTextureLevelParameterEXT(int texture, int target, int level, int pname, FloatBuffer params) {
/*  528 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  529 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureLevelParameterfvEXT_pointer;
/*  530 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  531 */     BufferChecks.checkBuffer(params, 4);
/*  532 */     nglGetTextureLevelParameterfvEXT(texture, target, level, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTextureLevelParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static float glGetTextureLevelParameterfEXT(int texture, int target, int level, int pname) {
/*  538 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  539 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureLevelParameterfvEXT_pointer;
/*  540 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  541 */     FloatBuffer params = APIUtils.getBufferFloat();
/*  542 */     nglGetTextureLevelParameterfvEXT(texture, target, level, pname, params, params.position(), function_pointer);
/*  543 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTextureLevelParameterEXT(int texture, int target, int level, int pname, IntBuffer params) {
/*  547 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  548 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureLevelParameterivEXT_pointer;
/*  549 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  550 */     BufferChecks.checkBuffer(params, 4);
/*  551 */     nglGetTextureLevelParameterivEXT(texture, target, level, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTextureLevelParameterivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static int glGetTextureLevelParameteriEXT(int texture, int target, int level, int pname) {
/*  557 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  558 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureLevelParameterivEXT_pointer;
/*  559 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  560 */     IntBuffer params = APIUtils.getBufferInt();
/*  561 */     nglGetTextureLevelParameterivEXT(texture, target, level, pname, params, params.position(), function_pointer);
/*  562 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
/*  566 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  567 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage3DEXT_pointer;
/*  568 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  569 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  570 */     if (pixels != null)
/*  571 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/*  572 */     nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
/*  575 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  576 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage3DEXT_pointer;
/*  577 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  578 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  579 */     if (pixels != null)
/*  580 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/*  581 */     nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
/*  584 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  585 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage3DEXT_pointer;
/*  586 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  587 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  588 */     if (pixels != null)
/*  589 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/*  590 */     nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
/*  593 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  594 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage3DEXT_pointer;
/*  595 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  596 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  597 */     if (pixels != null)
/*  598 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/*  599 */     nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
/*  602 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  603 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage3DEXT_pointer;
/*  604 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  605 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  606 */     if (pixels != null)
/*  607 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/*  608 */     nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   private static native void nglTextureImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, Buffer paramBuffer, int paramInt11, long paramLong);
/*      */   public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels_buffer_offset) {
/*  612 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  613 */     long function_pointer = caps.EXT_direct_state_access_glTextureImage3DEXT_pointer;
/*  614 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  615 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  616 */     nglTextureImage3DEXTBO(texture, target, level, internalformat, width, height, depth, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTextureImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
/*  621 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  622 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage3DEXT_pointer;
/*  623 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  624 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  625 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/*  626 */     nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
/*  629 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  630 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage3DEXT_pointer;
/*  631 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  632 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  633 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/*  634 */     nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
/*  637 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  638 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage3DEXT_pointer;
/*  639 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  640 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  641 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/*  642 */     nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
/*  645 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  646 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage3DEXT_pointer;
/*  647 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  648 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  649 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/*  650 */     nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
/*  653 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  654 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage3DEXT_pointer;
/*  655 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  656 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  657 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/*  658 */     nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglTextureSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, Buffer paramBuffer, int paramInt12, long paramLong);
/*      */   public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels_buffer_offset) {
/*  662 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  663 */     long function_pointer = caps.EXT_direct_state_access_glTextureSubImage3DEXT_pointer;
/*  664 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  665 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  666 */     nglTextureSubImage3DEXTBO(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTextureSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
/*  671 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  672 */     long function_pointer = caps.EXT_direct_state_access_glCopyTextureSubImage3DEXT_pointer;
/*  673 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  674 */     nglCopyTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTextureSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
/*      */   
/*      */   public static void glBindMultiTextureEXT(int texunit, int target, int texture) {
/*  679 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  680 */     long function_pointer = caps.EXT_direct_state_access_glBindMultiTextureEXT_pointer;
/*  681 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  682 */     nglBindMultiTextureEXT(texunit, target, texture, function_pointer);
/*      */   }
/*      */   private static native void nglBindMultiTextureEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glMultiTexCoordPointerEXT(int texunit, int size, int stride, DoubleBuffer pointer) {
/*  687 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  688 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexCoordPointerEXT_pointer;
/*  689 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  690 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  691 */     BufferChecks.checkDirect(pointer);
/*  692 */     nglMultiTexCoordPointerEXT(texunit, size, 5130, stride, pointer, pointer.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glMultiTexCoordPointerEXT(int texunit, int size, int stride, FloatBuffer pointer) {
/*  695 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  696 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexCoordPointerEXT_pointer;
/*  697 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  698 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  699 */     BufferChecks.checkDirect(pointer);
/*  700 */     nglMultiTexCoordPointerEXT(texunit, size, 5126, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexCoordPointerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*      */   public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer_buffer_offset) {
/*  704 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  705 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexCoordPointerEXT_pointer;
/*  706 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  707 */     GLChecks.ensureArrayVBOenabled(caps);
/*  708 */     nglMultiTexCoordPointerEXTBO(texunit, size, type, stride, pointer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexCoordPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glMultiTexEnvfEXT(int texunit, int target, int pname, float param) {
/*  713 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  714 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexEnvfEXT_pointer;
/*  715 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  716 */     nglMultiTexEnvfEXT(texunit, target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexEnvfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glMultiTexEnvEXT(int texunit, int target, int pname, FloatBuffer params) {
/*  721 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  722 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexEnvfvEXT_pointer;
/*  723 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  724 */     BufferChecks.checkBuffer(params, 4);
/*  725 */     nglMultiTexEnvfvEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexEnvfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexEnviEXT(int texunit, int target, int pname, int param) {
/*  730 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  731 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexEnviEXT_pointer;
/*  732 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  733 */     nglMultiTexEnviEXT(texunit, target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexEnviEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexEnvEXT(int texunit, int target, int pname, IntBuffer params) {
/*  738 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  739 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexEnvivEXT_pointer;
/*  740 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  741 */     BufferChecks.checkBuffer(params, 4);
/*  742 */     nglMultiTexEnvivEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexEnvivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexGendEXT(int texunit, int coord, int pname, double param) {
/*  747 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  748 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexGendEXT_pointer;
/*  749 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  750 */     nglMultiTexGendEXT(texunit, coord, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexGendEXT(int paramInt1, int paramInt2, int paramInt3, double paramDouble, long paramLong);
/*      */   
/*      */   public static void glMultiTexGenEXT(int texunit, int coord, int pname, DoubleBuffer params) {
/*  755 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  756 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexGendvEXT_pointer;
/*  757 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  758 */     BufferChecks.checkBuffer(params, 4);
/*  759 */     nglMultiTexGendvEXT(texunit, coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexGendvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexGenfEXT(int texunit, int coord, int pname, float param) {
/*  764 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  765 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexGenfEXT_pointer;
/*  766 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  767 */     nglMultiTexGenfEXT(texunit, coord, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexGenfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glMultiTexGenEXT(int texunit, int coord, int pname, FloatBuffer params) {
/*  772 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  773 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexGenfvEXT_pointer;
/*  774 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  775 */     BufferChecks.checkBuffer(params, 4);
/*  776 */     nglMultiTexGenfvEXT(texunit, coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexGenfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexGeniEXT(int texunit, int coord, int pname, int param) {
/*  781 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  782 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexGeniEXT_pointer;
/*  783 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  784 */     nglMultiTexGeniEXT(texunit, coord, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexGeniEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexGenEXT(int texunit, int coord, int pname, IntBuffer params) {
/*  789 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  790 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexGenivEXT_pointer;
/*  791 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  792 */     BufferChecks.checkBuffer(params, 4);
/*  793 */     nglMultiTexGenivEXT(texunit, coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexGenivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetMultiTexEnvEXT(int texunit, int target, int pname, FloatBuffer params) {
/*  798 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  799 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexEnvfvEXT_pointer;
/*  800 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  801 */     BufferChecks.checkBuffer(params, 4);
/*  802 */     nglGetMultiTexEnvfvEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMultiTexEnvfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetMultiTexEnvEXT(int texunit, int target, int pname, IntBuffer params) {
/*  807 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  808 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexEnvivEXT_pointer;
/*  809 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  810 */     BufferChecks.checkBuffer(params, 4);
/*  811 */     nglGetMultiTexEnvivEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMultiTexEnvivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetMultiTexGenEXT(int texunit, int coord, int pname, DoubleBuffer params) {
/*  816 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  817 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexGendvEXT_pointer;
/*  818 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  819 */     BufferChecks.checkBuffer(params, 4);
/*  820 */     nglGetMultiTexGendvEXT(texunit, coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMultiTexGendvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetMultiTexGenEXT(int texunit, int coord, int pname, FloatBuffer params) {
/*  825 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  826 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexGenfvEXT_pointer;
/*  827 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  828 */     BufferChecks.checkBuffer(params, 4);
/*  829 */     nglGetMultiTexGenfvEXT(texunit, coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMultiTexGenfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetMultiTexGenEXT(int texunit, int coord, int pname, IntBuffer params) {
/*  834 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  835 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexGenivEXT_pointer;
/*  836 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  837 */     BufferChecks.checkBuffer(params, 4);
/*  838 */     nglGetMultiTexGenivEXT(texunit, coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMultiTexGenivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexParameteriEXT(int texunit, int target, int pname, int param) {
/*  843 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  844 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameteriEXT_pointer;
/*  845 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  846 */     nglMultiTexParameteriEXT(texunit, target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexParameteriEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexParameterEXT(int texunit, int target, int pname, IntBuffer param) {
/*  851 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  852 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameterivEXT_pointer;
/*  853 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  854 */     BufferChecks.checkBuffer(param, 4);
/*  855 */     nglMultiTexParameterivEXT(texunit, target, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexParameterivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexParameterfEXT(int texunit, int target, int pname, float param) {
/*  860 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  861 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameterfEXT_pointer;
/*  862 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  863 */     nglMultiTexParameterfEXT(texunit, target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexParameterfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glMultiTexParameterEXT(int texunit, int target, int pname, FloatBuffer param) {
/*  868 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  869 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameterfvEXT_pointer;
/*  870 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  871 */     BufferChecks.checkBuffer(param, 4);
/*  872 */     nglMultiTexParameterfvEXT(texunit, target, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
/*  877 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  878 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage1DEXT_pointer;
/*  879 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  880 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  881 */     if (pixels != null)
/*  882 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  883 */     nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
/*  886 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  887 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage1DEXT_pointer;
/*  888 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  889 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  890 */     if (pixels != null)
/*  891 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  892 */     nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
/*  895 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  896 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage1DEXT_pointer;
/*  897 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  898 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  899 */     if (pixels != null)
/*  900 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  901 */     nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
/*  904 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  905 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage1DEXT_pointer;
/*  906 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  907 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  908 */     if (pixels != null)
/*  909 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  910 */     nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
/*  913 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  914 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage1DEXT_pointer;
/*  915 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  916 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  917 */     if (pixels != null)
/*  918 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/*  919 */     nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer, int paramInt9, long paramLong);
/*      */   public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels_buffer_offset) {
/*  923 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  924 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage1DEXT_pointer;
/*  925 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  926 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  927 */     nglMultiTexImage1DEXTBO(texunit, target, level, internalformat, width, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
/*  932 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  933 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage2DEXT_pointer;
/*  934 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  935 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  936 */     if (pixels != null)
/*  937 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  938 */     nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
/*  941 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  942 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage2DEXT_pointer;
/*  943 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  944 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  945 */     if (pixels != null)
/*  946 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  947 */     nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
/*  950 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  951 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage2DEXT_pointer;
/*  952 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  953 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  954 */     if (pixels != null)
/*  955 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  956 */     nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
/*  959 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  960 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage2DEXT_pointer;
/*  961 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  962 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  963 */     if (pixels != null)
/*  964 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  965 */     nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
/*  968 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  969 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage2DEXT_pointer;
/*  970 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  971 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  972 */     if (pixels != null)
/*  973 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/*  974 */     nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, Buffer paramBuffer, int paramInt10, long paramLong);
/*      */   public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels_buffer_offset) {
/*  978 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  979 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage2DEXT_pointer;
/*  980 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  981 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  982 */     nglMultiTexImage2DEXTBO(texunit, target, level, internalformat, width, height, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
/*  987 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  988 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer;
/*  989 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  990 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  991 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/*  992 */     nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
/*  995 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  996 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer;
/*  997 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  998 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  999 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 1000 */     nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
/* 1003 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1004 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer;
/* 1005 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1006 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1007 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 1008 */     nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
/* 1011 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1012 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer;
/* 1013 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1014 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1015 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 1016 */     nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
/* 1019 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1020 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer;
/* 1021 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1022 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1023 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 1024 */     nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Buffer paramBuffer, int paramInt8, long paramLong);
/*      */   public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset) {
/* 1028 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1029 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer;
/* 1030 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1031 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1032 */     nglMultiTexSubImage1DEXTBO(texunit, target, level, xoffset, width, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
/* 1037 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1038 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer;
/* 1039 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1040 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1041 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1042 */     nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
/* 1045 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1046 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer;
/* 1047 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1048 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1049 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1050 */     nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
/* 1053 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1054 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer;
/* 1055 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1056 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1057 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1058 */     nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
/* 1061 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1062 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer;
/* 1063 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1064 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1065 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1066 */     nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
/* 1069 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1070 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer;
/* 1071 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1072 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1073 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1074 */     nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, Buffer paramBuffer, int paramInt10, long paramLong);
/*      */   public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset) {
/* 1078 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1079 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer;
/* 1080 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1081 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1082 */     nglMultiTexSubImage2DEXTBO(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border) {
/* 1087 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1088 */     long function_pointer = caps.EXT_direct_state_access_glCopyMultiTexImage1DEXT_pointer;
/* 1089 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1090 */     nglCopyMultiTexImage1DEXT(texunit, target, level, internalformat, x, y, width, border, function_pointer);
/*      */   }
/*      */   private static native void nglCopyMultiTexImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong);
/*      */   
/*      */   public static void glCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
/* 1095 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1096 */     long function_pointer = caps.EXT_direct_state_access_glCopyMultiTexImage2DEXT_pointer;
/* 1097 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1098 */     nglCopyMultiTexImage2DEXT(texunit, target, level, internalformat, x, y, width, height, border, function_pointer);
/*      */   }
/*      */   private static native void nglCopyMultiTexImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
/*      */   
/*      */   public static void glCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width) {
/* 1103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1104 */     long function_pointer = caps.EXT_direct_state_access_glCopyMultiTexSubImage1DEXT_pointer;
/* 1105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1106 */     nglCopyMultiTexSubImage1DEXT(texunit, target, level, xoffset, x, y, width, function_pointer);
/*      */   }
/*      */   private static native void nglCopyMultiTexSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
/*      */   
/*      */   public static void glCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
/* 1111 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1112 */     long function_pointer = caps.EXT_direct_state_access_glCopyMultiTexSubImage2DEXT_pointer;
/* 1113 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1114 */     nglCopyMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, x, y, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglCopyMultiTexSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
/*      */   
/*      */   public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ByteBuffer pixels) {
/* 1119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1120 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexImageEXT_pointer;
/* 1121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1122 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1123 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1124 */     nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, DoubleBuffer pixels) {
/* 1127 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1128 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexImageEXT_pointer;
/* 1129 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1130 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1131 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1132 */     nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, FloatBuffer pixels) {
/* 1135 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1136 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexImageEXT_pointer;
/* 1137 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1138 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1139 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1140 */     nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, IntBuffer pixels) {
/* 1143 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1144 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexImageEXT_pointer;
/* 1145 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1146 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1147 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1148 */     nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ShortBuffer pixels) {
/* 1151 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1152 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexImageEXT_pointer;
/* 1153 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1154 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1155 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1156 */     nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetMultiTexImageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*      */   public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels_buffer_offset) {
/* 1160 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1161 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexImageEXT_pointer;
/* 1162 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1163 */     GLChecks.ensurePackPBOenabled(caps);
/* 1164 */     nglGetMultiTexImageEXTBO(texunit, target, level, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetMultiTexImageEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetMultiTexParameterEXT(int texunit, int target, int pname, FloatBuffer params) {
/* 1169 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1170 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterfvEXT_pointer;
/* 1171 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1172 */     BufferChecks.checkBuffer(params, 4);
/* 1173 */     nglGetMultiTexParameterfvEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetMultiTexParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static float glGetMultiTexParameterfEXT(int texunit, int target, int pname) {
/* 1179 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1180 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterfvEXT_pointer;
/* 1181 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1182 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1183 */     nglGetMultiTexParameterfvEXT(texunit, target, pname, params, params.position(), function_pointer);
/* 1184 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetMultiTexParameterEXT(int texunit, int target, int pname, IntBuffer params) {
/* 1188 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1189 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterivEXT_pointer;
/* 1190 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1191 */     BufferChecks.checkBuffer(params, 4);
/* 1192 */     nglGetMultiTexParameterivEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetMultiTexParameterivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetMultiTexParameteriEXT(int texunit, int target, int pname) {
/* 1198 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1199 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterivEXT_pointer;
/* 1200 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1201 */     IntBuffer params = APIUtils.getBufferInt();
/* 1202 */     nglGetMultiTexParameterivEXT(texunit, target, pname, params, params.position(), function_pointer);
/* 1203 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetMultiTexLevelParameterEXT(int texunit, int target, int level, int pname, FloatBuffer params) {
/* 1207 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1208 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexLevelParameterfvEXT_pointer;
/* 1209 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1210 */     BufferChecks.checkBuffer(params, 4);
/* 1211 */     nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetMultiTexLevelParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static float glGetMultiTexLevelParameterfEXT(int texunit, int target, int level, int pname) {
/* 1217 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1218 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexLevelParameterfvEXT_pointer;
/* 1219 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1220 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1221 */     nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, params, params.position(), function_pointer);
/* 1222 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetMultiTexLevelParameterEXT(int texunit, int target, int level, int pname, IntBuffer params) {
/* 1226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1227 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexLevelParameterivEXT_pointer;
/* 1228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1229 */     BufferChecks.checkBuffer(params, 4);
/* 1230 */     nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetMultiTexLevelParameterivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static int glGetMultiTexLevelParameteriEXT(int texunit, int target, int level, int pname) {
/* 1236 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1237 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexLevelParameterivEXT_pointer;
/* 1238 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1239 */     IntBuffer params = APIUtils.getBufferInt();
/* 1240 */     nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, params, params.position(), function_pointer);
/* 1241 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
/* 1245 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1246 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage3DEXT_pointer;
/* 1247 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1248 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1249 */     if (pixels != null)
/* 1250 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 1251 */     nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
/* 1254 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1255 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage3DEXT_pointer;
/* 1256 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1257 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1258 */     if (pixels != null)
/* 1259 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 1260 */     nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
/* 1263 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1264 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage3DEXT_pointer;
/* 1265 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1266 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1267 */     if (pixels != null)
/* 1268 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 1269 */     nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
/* 1272 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1273 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage3DEXT_pointer;
/* 1274 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1275 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1276 */     if (pixels != null)
/* 1277 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 1278 */     nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
/* 1281 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1282 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage3DEXT_pointer;
/* 1283 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1284 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1285 */     if (pixels != null)
/* 1286 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 1287 */     nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, Buffer paramBuffer, int paramInt11, long paramLong);
/*      */   public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels_buffer_offset) {
/* 1291 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1292 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexImage3DEXT_pointer;
/* 1293 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1294 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1295 */     nglMultiTexImage3DEXTBO(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
/* 1300 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1301 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer;
/* 1302 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1303 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1304 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 1305 */     nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
/* 1308 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1309 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer;
/* 1310 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1311 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1312 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 1313 */     nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
/* 1316 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1317 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer;
/* 1318 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1319 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1320 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 1321 */     nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
/* 1324 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1325 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer;
/* 1326 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1327 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1328 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 1329 */     nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
/* 1332 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1333 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer;
/* 1334 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1335 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1336 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 1337 */     nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, Buffer paramBuffer, int paramInt12, long paramLong);
/*      */   public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels_buffer_offset) {
/* 1341 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1342 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer;
/* 1343 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1344 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1345 */     nglMultiTexSubImage3DEXTBO(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
/* 1350 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1351 */     long function_pointer = caps.EXT_direct_state_access_glCopyMultiTexSubImage3DEXT_pointer;
/* 1352 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1353 */     nglCopyMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglCopyMultiTexSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
/*      */   
/*      */   public static void glEnableClientStateIndexedEXT(int array, int index) {
/* 1358 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1359 */     long function_pointer = caps.EXT_direct_state_access_glEnableClientStateIndexedEXT_pointer;
/* 1360 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1361 */     nglEnableClientStateIndexedEXT(array, index, function_pointer);
/*      */   }
/*      */   private static native void nglEnableClientStateIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDisableClientStateIndexedEXT(int array, int index) {
/* 1366 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1367 */     long function_pointer = caps.EXT_direct_state_access_glDisableClientStateIndexedEXT_pointer;
/* 1368 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1369 */     nglDisableClientStateIndexedEXT(array, index, function_pointer);
/*      */   }
/*      */   private static native void nglDisableClientStateIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glEnableClientStateiEXT(int array, int index) {
/* 1374 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1375 */     long function_pointer = caps.EXT_direct_state_access_glEnableClientStateiEXT_pointer;
/* 1376 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1377 */     nglEnableClientStateiEXT(array, index, function_pointer);
/*      */   }
/*      */   private static native void nglEnableClientStateiEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDisableClientStateiEXT(int array, int index) {
/* 1382 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1383 */     long function_pointer = caps.EXT_direct_state_access_glDisableClientStateiEXT_pointer;
/* 1384 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1385 */     nglDisableClientStateiEXT(array, index, function_pointer);
/*      */   }
/*      */   private static native void nglDisableClientStateiEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glGetFloatIndexedEXT(int pname, int index, FloatBuffer params) {
/* 1390 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1391 */     long function_pointer = caps.EXT_direct_state_access_glGetFloatIndexedvEXT_pointer;
/* 1392 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1393 */     BufferChecks.checkBuffer(params, 16);
/* 1394 */     nglGetFloatIndexedvEXT(pname, index, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetFloatIndexedvEXT(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static float glGetFloatIndexedEXT(int pname, int index) {
/* 1400 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1401 */     long function_pointer = caps.EXT_direct_state_access_glGetFloatIndexedvEXT_pointer;
/* 1402 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1403 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1404 */     nglGetFloatIndexedvEXT(pname, index, params, params.position(), function_pointer);
/* 1405 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetDoubleIndexedEXT(int pname, int index, DoubleBuffer params) {
/* 1409 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1410 */     long function_pointer = caps.EXT_direct_state_access_glGetDoubleIndexedvEXT_pointer;
/* 1411 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1412 */     BufferChecks.checkBuffer(params, 16);
/* 1413 */     nglGetDoubleIndexedvEXT(pname, index, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetDoubleIndexedvEXT(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static double glGetDoubleIndexedEXT(int pname, int index) {
/* 1419 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1420 */     long function_pointer = caps.EXT_direct_state_access_glGetDoubleIndexedvEXT_pointer;
/* 1421 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1422 */     DoubleBuffer params = APIUtils.getBufferDouble();
/* 1423 */     nglGetDoubleIndexedvEXT(pname, index, params, params.position(), function_pointer);
/* 1424 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static ByteBuffer glGetPointerIndexedEXT(int pname, int index, long result_size) {
/* 1428 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1429 */     long function_pointer = caps.EXT_direct_state_access_glGetPointerIndexedvEXT_pointer;
/* 1430 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1431 */     ByteBuffer __result = nglGetPointerIndexedvEXT(pname, index, result_size, function_pointer);
/* 1432 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglGetPointerIndexedvEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetFloatEXT(int pname, int index, FloatBuffer params) {
/* 1437 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1438 */     long function_pointer = caps.EXT_direct_state_access_glGetFloati_vEXT_pointer;
/* 1439 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1440 */     BufferChecks.checkBuffer(params, 16);
/* 1441 */     nglGetFloati_vEXT(pname, index, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetFloati_vEXT(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static float glGetFloatEXT(int pname, int index) {
/* 1447 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1448 */     long function_pointer = caps.EXT_direct_state_access_glGetFloati_vEXT_pointer;
/* 1449 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1450 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1451 */     nglGetFloati_vEXT(pname, index, params, params.position(), function_pointer);
/* 1452 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetDoubleEXT(int pname, int index, DoubleBuffer params) {
/* 1456 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1457 */     long function_pointer = caps.EXT_direct_state_access_glGetDoublei_vEXT_pointer;
/* 1458 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1459 */     BufferChecks.checkBuffer(params, 16);
/* 1460 */     nglGetDoublei_vEXT(pname, index, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetDoublei_vEXT(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static double glGetDoubleEXT(int pname, int index) {
/* 1466 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1467 */     long function_pointer = caps.EXT_direct_state_access_glGetDoublei_vEXT_pointer;
/* 1468 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1469 */     DoubleBuffer params = APIUtils.getBufferDouble();
/* 1470 */     nglGetDoublei_vEXT(pname, index, params, params.position(), function_pointer);
/* 1471 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static ByteBuffer glGetPointerEXT(int pname, int index, long result_size) {
/* 1475 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1476 */     long function_pointer = caps.EXT_direct_state_access_glGetPointeri_vEXT_pointer;
/* 1477 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1478 */     ByteBuffer __result = nglGetPointeri_vEXT(pname, index, result_size, function_pointer);
/* 1479 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglGetPointeri_vEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glEnableIndexedEXT(int cap, int index) {
/* 1484 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1485 */     long function_pointer = caps.EXT_direct_state_access_glEnableIndexedEXT_pointer;
/* 1486 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1487 */     nglEnableIndexedEXT(cap, index, function_pointer);
/*      */   }
/*      */   private static native void nglEnableIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDisableIndexedEXT(int cap, int index) {
/* 1492 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1493 */     long function_pointer = caps.EXT_direct_state_access_glDisableIndexedEXT_pointer;
/* 1494 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1495 */     nglDisableIndexedEXT(cap, index, function_pointer);
/*      */   }
/*      */   private static native void nglDisableIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static boolean glIsEnabledIndexedEXT(int cap, int index) {
/* 1500 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1501 */     long function_pointer = caps.EXT_direct_state_access_glIsEnabledIndexedEXT_pointer;
/* 1502 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1503 */     boolean __result = nglIsEnabledIndexedEXT(cap, index, function_pointer);
/* 1504 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsEnabledIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glGetIntegerIndexedEXT(int pname, int index, IntBuffer params) {
/* 1509 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1510 */     long function_pointer = caps.EXT_direct_state_access_glGetIntegerIndexedvEXT_pointer;
/* 1511 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1512 */     BufferChecks.checkBuffer(params, 16);
/* 1513 */     nglGetIntegerIndexedvEXT(pname, index, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetIntegerIndexedvEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetIntegerIndexedEXT(int pname, int index) {
/* 1519 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1520 */     long function_pointer = caps.EXT_direct_state_access_glGetIntegerIndexedvEXT_pointer;
/* 1521 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1522 */     IntBuffer params = APIUtils.getBufferInt();
/* 1523 */     nglGetIntegerIndexedvEXT(pname, index, params, params.position(), function_pointer);
/* 1524 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetBooleanIndexedEXT(int pname, int index, ByteBuffer params) {
/* 1528 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1529 */     long function_pointer = caps.EXT_direct_state_access_glGetBooleanIndexedvEXT_pointer;
/* 1530 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1531 */     BufferChecks.checkBuffer(params, 16);
/* 1532 */     nglGetBooleanIndexedvEXT(pname, index, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetBooleanIndexedvEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static boolean glGetBooleanIndexedEXT(int pname, int index) {
/* 1538 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1539 */     long function_pointer = caps.EXT_direct_state_access_glGetBooleanIndexedvEXT_pointer;
/* 1540 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1541 */     ByteBuffer params = APIUtils.getBufferByte(1);
/* 1542 */     nglGetBooleanIndexedvEXT(pname, index, params, params.position(), function_pointer);
/* 1543 */     return (params.get(0) == 1);
/*      */   }
/*      */   
/*      */   public static void glNamedProgramStringEXT(int program, int target, int format, ByteBuffer string) {
/* 1547 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1548 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramStringEXT_pointer;
/* 1549 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1550 */     BufferChecks.checkDirect(string);
/* 1551 */     nglNamedProgramStringEXT(program, target, format, string.remaining(), string, string.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglNamedProgramStringEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glNamedProgramStringEXT(int program, int target, int format, CharSequence string) {
/* 1557 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1558 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramStringEXT_pointer;
/* 1559 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1560 */     nglNamedProgramStringEXT(program, target, format, string.length(), APIUtils.getBuffer(string), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w) {
/* 1564 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1565 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameter4dEXT_pointer;
/* 1566 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1567 */     nglNamedProgramLocalParameter4dEXT(program, target, index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameter4dEXT(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameter4EXT(int program, int target, int index, DoubleBuffer params) {
/* 1572 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1573 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameter4dvEXT_pointer;
/* 1574 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1575 */     BufferChecks.checkBuffer(params, 4);
/* 1576 */     nglNamedProgramLocalParameter4dvEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameter4dvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w) {
/* 1581 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1582 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameter4fEXT_pointer;
/* 1583 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1584 */     nglNamedProgramLocalParameter4fEXT(program, target, index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameter4fEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameter4EXT(int program, int target, int index, FloatBuffer params) {
/* 1589 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1590 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameter4fvEXT_pointer;
/* 1591 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1592 */     BufferChecks.checkBuffer(params, 4);
/* 1593 */     nglNamedProgramLocalParameter4fvEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameter4fvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetNamedProgramLocalParameterEXT(int program, int target, int index, DoubleBuffer params) {
/* 1598 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1599 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramLocalParameterdvEXT_pointer;
/* 1600 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1601 */     BufferChecks.checkBuffer(params, 4);
/* 1602 */     nglGetNamedProgramLocalParameterdvEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetNamedProgramLocalParameterdvEXT(int paramInt1, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetNamedProgramLocalParameterEXT(int program, int target, int index, FloatBuffer params) {
/* 1607 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1608 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramLocalParameterfvEXT_pointer;
/* 1609 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1610 */     BufferChecks.checkBuffer(params, 4);
/* 1611 */     nglGetNamedProgramLocalParameterfvEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetNamedProgramLocalParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetNamedProgramEXT(int program, int target, int pname, IntBuffer params) {
/* 1616 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1617 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramivEXT_pointer;
/* 1618 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1619 */     BufferChecks.checkBuffer(params, 4);
/* 1620 */     nglGetNamedProgramivEXT(program, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetNamedProgramivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetNamedProgramEXT(int program, int target, int pname) {
/* 1626 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1627 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramivEXT_pointer;
/* 1628 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1629 */     IntBuffer params = APIUtils.getBufferInt();
/* 1630 */     nglGetNamedProgramivEXT(program, target, pname, params, params.position(), function_pointer);
/* 1631 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetNamedProgramStringEXT(int program, int target, int pname, ByteBuffer string) {
/* 1635 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1636 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramStringEXT_pointer;
/* 1637 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1638 */     BufferChecks.checkDirect(string);
/* 1639 */     nglGetNamedProgramStringEXT(program, target, pname, string, string.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetNamedProgramStringEXT(int paramInt1, int paramInt2, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static String glGetNamedProgramStringEXT(int program, int target, int pname) {
/* 1645 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1646 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramStringEXT_pointer;
/* 1647 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1648 */     int programLength = glGetNamedProgramEXT(program, target, 34343);
/* 1649 */     ByteBuffer paramString = APIUtils.getBufferByte(programLength);
/* 1650 */     nglGetNamedProgramStringEXT(program, target, pname, paramString, paramString.position(), function_pointer);
/* 1651 */     paramString.limit(programLength);
/* 1652 */     return APIUtils.getString(paramString);
/*      */   }
/*      */   
/*      */   public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
/* 1656 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1657 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureImage3DEXT_pointer;
/* 1658 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1659 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1660 */     BufferChecks.checkDirect(data);
/* 1661 */     nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, ByteBuffer paramByteBuffer, int paramInt10, long paramLong);
/*      */   public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data_buffer_offset) {
/* 1665 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1666 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureImage3DEXT_pointer;
/* 1667 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1668 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1669 */     nglCompressedTextureImage3DEXTBO(texture, target, level, internalformat, width, height, depth, border, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
/* 1674 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1675 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureImage2DEXT_pointer;
/* 1676 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1677 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1678 */     BufferChecks.checkDirect(data);
/* 1679 */     nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ByteBuffer paramByteBuffer, int paramInt9, long paramLong);
/*      */   public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data_buffer_offset) {
/* 1683 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1684 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureImage2DEXT_pointer;
/* 1685 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1686 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1687 */     nglCompressedTextureImage2DEXTBO(texture, target, level, internalformat, width, height, border, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, ByteBuffer data) {
/* 1692 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1693 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureImage1DEXT_pointer;
/* 1694 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1695 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1696 */     BufferChecks.checkDirect(data);
/* 1697 */     nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, ByteBuffer paramByteBuffer, int paramInt8, long paramLong);
/*      */   public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data_buffer_offset) {
/* 1701 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1702 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureImage1DEXT_pointer;
/* 1703 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1704 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1705 */     nglCompressedTextureImage1DEXTBO(texture, target, level, internalformat, width, border, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
/* 1710 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1711 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureSubImage3DEXT_pointer;
/* 1712 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1713 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1714 */     BufferChecks.checkDirect(data);
/* 1715 */     nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, ByteBuffer paramByteBuffer, int paramInt12, long paramLong);
/*      */   public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data_buffer_offset) {
/* 1719 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1720 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureSubImage3DEXT_pointer;
/* 1721 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1722 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1723 */     nglCompressedTextureSubImage3DEXTBO(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
/* 1728 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1729 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureSubImage2DEXT_pointer;
/* 1730 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1731 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1732 */     BufferChecks.checkDirect(data);
/* 1733 */     nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, ByteBuffer paramByteBuffer, int paramInt10, long paramLong);
/*      */   public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data_buffer_offset) {
/* 1737 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1738 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureSubImage2DEXT_pointer;
/* 1739 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1740 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1741 */     nglCompressedTextureSubImage2DEXTBO(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, ByteBuffer data) {
/* 1746 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1747 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureSubImage1DEXT_pointer;
/* 1748 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1749 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1750 */     BufferChecks.checkDirect(data);
/* 1751 */     nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, ByteBuffer paramByteBuffer, int paramInt8, long paramLong);
/*      */   public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data_buffer_offset) {
/* 1755 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1756 */     long function_pointer = caps.EXT_direct_state_access_glCompressedTextureSubImage1DEXT_pointer;
/* 1757 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1758 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1759 */     nglCompressedTextureSubImage1DEXTBO(texture, target, level, xoffset, width, format, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedTextureSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetCompressedTextureImageEXT(int texture, int target, int level, ByteBuffer img) {
/* 1764 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1765 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTextureImageEXT_pointer;
/* 1766 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1767 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1768 */     BufferChecks.checkDirect(img);
/* 1769 */     nglGetCompressedTextureImageEXT(texture, target, level, img, img.position(), function_pointer);
/*      */   }
/*      */   public static void glGetCompressedTextureImageEXT(int texture, int target, int level, IntBuffer img) {
/* 1772 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1773 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTextureImageEXT_pointer;
/* 1774 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1775 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1776 */     BufferChecks.checkDirect(img);
/* 1777 */     nglGetCompressedTextureImageEXT(texture, target, level, img, img.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetCompressedTextureImageEXT(int texture, int target, int level, ShortBuffer img) {
/* 1780 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1781 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTextureImageEXT_pointer;
/* 1782 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1783 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1784 */     BufferChecks.checkDirect(img);
/* 1785 */     nglGetCompressedTextureImageEXT(texture, target, level, img, img.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetCompressedTextureImageEXT(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glGetCompressedTextureImageEXT(int texture, int target, int level, long img_buffer_offset) {
/* 1789 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1790 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTextureImageEXT_pointer;
/* 1791 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1792 */     GLChecks.ensurePackPBOenabled(caps);
/* 1793 */     nglGetCompressedTextureImageEXTBO(texture, target, level, img_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetCompressedTextureImageEXTBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
/* 1798 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1799 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexImage3DEXT_pointer;
/* 1800 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1801 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1802 */     BufferChecks.checkDirect(data);
/* 1803 */     nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, ByteBuffer paramByteBuffer, int paramInt10, long paramLong);
/*      */   public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data_buffer_offset) {
/* 1807 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1808 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexImage3DEXT_pointer;
/* 1809 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1810 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1811 */     nglCompressedMultiTexImage3DEXTBO(texunit, target, level, internalformat, width, height, depth, border, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
/* 1816 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1817 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexImage2DEXT_pointer;
/* 1818 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1819 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1820 */     BufferChecks.checkDirect(data);
/* 1821 */     nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ByteBuffer paramByteBuffer, int paramInt9, long paramLong);
/*      */   public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data_buffer_offset) {
/* 1825 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1826 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexImage2DEXT_pointer;
/* 1827 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1828 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1829 */     nglCompressedMultiTexImage2DEXTBO(texunit, target, level, internalformat, width, height, border, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, ByteBuffer data) {
/* 1834 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1835 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexImage1DEXT_pointer;
/* 1836 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1837 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1838 */     BufferChecks.checkDirect(data);
/* 1839 */     nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, ByteBuffer paramByteBuffer, int paramInt8, long paramLong);
/*      */   public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data_buffer_offset) {
/* 1843 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1844 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexImage1DEXT_pointer;
/* 1845 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1846 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1847 */     nglCompressedMultiTexImage1DEXTBO(texunit, target, level, internalformat, width, border, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
/* 1852 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1853 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexSubImage3DEXT_pointer;
/* 1854 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1855 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1856 */     BufferChecks.checkDirect(data);
/* 1857 */     nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, ByteBuffer paramByteBuffer, int paramInt12, long paramLong);
/*      */   public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data_buffer_offset) {
/* 1861 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1862 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexSubImage3DEXT_pointer;
/* 1863 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1864 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1865 */     nglCompressedMultiTexSubImage3DEXTBO(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
/* 1870 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1871 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexSubImage2DEXT_pointer;
/* 1872 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1873 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1874 */     BufferChecks.checkDirect(data);
/* 1875 */     nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, ByteBuffer paramByteBuffer, int paramInt10, long paramLong);
/*      */   public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data_buffer_offset) {
/* 1879 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1880 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexSubImage2DEXT_pointer;
/* 1881 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1882 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1883 */     nglCompressedMultiTexSubImage2DEXTBO(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, ByteBuffer data) {
/* 1888 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1889 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexSubImage1DEXT_pointer;
/* 1890 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1891 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1892 */     BufferChecks.checkDirect(data);
/* 1893 */     nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, ByteBuffer paramByteBuffer, int paramInt8, long paramLong);
/*      */   public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data_buffer_offset) {
/* 1897 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1898 */     long function_pointer = caps.EXT_direct_state_access_glCompressedMultiTexSubImage1DEXT_pointer;
/* 1899 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1900 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1901 */     nglCompressedMultiTexSubImage1DEXTBO(texunit, target, level, xoffset, width, format, imageSize, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglCompressedMultiTexSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, ByteBuffer img) {
/* 1906 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1907 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedMultiTexImageEXT_pointer;
/* 1908 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1909 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1910 */     BufferChecks.checkDirect(img);
/* 1911 */     nglGetCompressedMultiTexImageEXT(texunit, target, level, img, img.position(), function_pointer);
/*      */   }
/*      */   public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, IntBuffer img) {
/* 1914 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1915 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedMultiTexImageEXT_pointer;
/* 1916 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1917 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1918 */     BufferChecks.checkDirect(img);
/* 1919 */     nglGetCompressedMultiTexImageEXT(texunit, target, level, img, img.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, ShortBuffer img) {
/* 1922 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1923 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedMultiTexImageEXT_pointer;
/* 1924 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1925 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1926 */     BufferChecks.checkDirect(img);
/* 1927 */     nglGetCompressedMultiTexImageEXT(texunit, target, level, img, img.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetCompressedMultiTexImageEXT(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img_buffer_offset) {
/* 1931 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1932 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedMultiTexImageEXT_pointer;
/* 1933 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1934 */     GLChecks.ensurePackPBOenabled(caps);
/* 1935 */     nglGetCompressedMultiTexImageEXTBO(texunit, target, level, img_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetCompressedMultiTexImageEXTBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetCompressedTexImage(int target, int lod, ByteBuffer img) {
/* 1940 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1941 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTexImage_pointer;
/* 1942 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1943 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1944 */     BufferChecks.checkDirect(img);
/* 1945 */     nglGetCompressedTexImage(target, lod, img, img.position(), function_pointer);
/*      */   }
/*      */   public static void glGetCompressedTexImage(int target, int lod, IntBuffer img) {
/* 1948 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1949 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTexImage_pointer;
/* 1950 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1951 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1952 */     BufferChecks.checkDirect(img);
/* 1953 */     nglGetCompressedTexImage(target, lod, img, img.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetCompressedTexImage(int target, int lod, ShortBuffer img) {
/* 1956 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1957 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTexImage_pointer;
/* 1958 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1959 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1960 */     BufferChecks.checkDirect(img);
/* 1961 */     nglGetCompressedTexImage(target, lod, img, img.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetCompressedTexImage(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*      */   public static void glGetCompressedTexImage(int target, int lod, long img_buffer_offset) {
/* 1965 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1966 */     long function_pointer = caps.EXT_direct_state_access_glGetCompressedTexImage_pointer;
/* 1967 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1968 */     GLChecks.ensurePackPBOenabled(caps);
/* 1969 */     nglGetCompressedTexImageBO(target, lod, img_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetCompressedTexImageBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glMatrixLoadTransposeEXT(int matrixMode, FloatBuffer m) {
/* 1974 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1975 */     long function_pointer = caps.EXT_direct_state_access_glMatrixLoadTransposefEXT_pointer;
/* 1976 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1977 */     BufferChecks.checkBuffer(m, 16);
/* 1978 */     nglMatrixLoadTransposefEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixLoadTransposefEXT(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glMatrixLoadTransposeEXT(int matrixMode, DoubleBuffer m) {
/* 1983 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1984 */     long function_pointer = caps.EXT_direct_state_access_glMatrixLoadTransposedEXT_pointer;
/* 1985 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1986 */     BufferChecks.checkBuffer(m, 16);
/* 1987 */     nglMatrixLoadTransposedEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixLoadTransposedEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glMatrixMultTransposeEXT(int matrixMode, FloatBuffer m) {
/* 1992 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1993 */     long function_pointer = caps.EXT_direct_state_access_glMatrixMultTransposefEXT_pointer;
/* 1994 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1995 */     BufferChecks.checkBuffer(m, 16);
/* 1996 */     nglMatrixMultTransposefEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixMultTransposefEXT(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glMatrixMultTransposeEXT(int matrixMode, DoubleBuffer m) {
/* 2001 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2002 */     long function_pointer = caps.EXT_direct_state_access_glMatrixMultTransposedEXT_pointer;
/* 2003 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2004 */     BufferChecks.checkBuffer(m, 16);
/* 2005 */     nglMatrixMultTransposedEXT(matrixMode, m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMatrixMultTransposedEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glNamedBufferDataEXT(int buffer, long size, int usage) {
/* 2010 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2011 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferDataEXT_pointer;
/* 2012 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2013 */     nglNamedBufferDataEXT(buffer, size, null, 0, usage, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferDataEXT(int buffer, ByteBuffer data, int usage) {
/* 2016 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2017 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferDataEXT_pointer;
/* 2018 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2019 */     BufferChecks.checkDirect(data);
/* 2020 */     nglNamedBufferDataEXT(buffer, data.remaining(), data, data.position(), usage, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferDataEXT(int buffer, DoubleBuffer data, int usage) {
/* 2023 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2024 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferDataEXT_pointer;
/* 2025 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2026 */     BufferChecks.checkDirect(data);
/* 2027 */     nglNamedBufferDataEXT(buffer, (data.remaining() << 3), data, data.position() << 3, usage, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferDataEXT(int buffer, FloatBuffer data, int usage) {
/* 2030 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2031 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferDataEXT_pointer;
/* 2032 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2033 */     BufferChecks.checkDirect(data);
/* 2034 */     nglNamedBufferDataEXT(buffer, (data.remaining() << 2), data, data.position() << 2, usage, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferDataEXT(int buffer, IntBuffer data, int usage) {
/* 2037 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2038 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferDataEXT_pointer;
/* 2039 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2040 */     BufferChecks.checkDirect(data);
/* 2041 */     nglNamedBufferDataEXT(buffer, (data.remaining() << 2), data, data.position() << 2, usage, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferDataEXT(int buffer, ShortBuffer data, int usage) {
/* 2044 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2045 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferDataEXT_pointer;
/* 2046 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2047 */     BufferChecks.checkDirect(data);
/* 2048 */     nglNamedBufferDataEXT(buffer, (data.remaining() << 1), data, data.position() << 1, usage, function_pointer);
/*      */   }
/*      */   private static native void nglNamedBufferDataEXT(int paramInt1, long paramLong1, Buffer paramBuffer, int paramInt2, int paramInt3, long paramLong2);
/*      */   
/*      */   public static void glNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) {
/* 2053 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2054 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferSubDataEXT_pointer;
/* 2055 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2056 */     BufferChecks.checkDirect(data);
/* 2057 */     nglNamedBufferSubDataEXT(buffer, offset, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   public static void glNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) {
/* 2060 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2061 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferSubDataEXT_pointer;
/* 2062 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2063 */     BufferChecks.checkDirect(data);
/* 2064 */     nglNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 3), data, data.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) {
/* 2067 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2068 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferSubDataEXT_pointer;
/* 2069 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2070 */     BufferChecks.checkDirect(data);
/* 2071 */     nglNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) {
/* 2074 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2075 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferSubDataEXT_pointer;
/* 2076 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2077 */     BufferChecks.checkDirect(data);
/* 2078 */     nglNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) {
/* 2081 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2082 */     long function_pointer = caps.EXT_direct_state_access_glNamedBufferSubDataEXT_pointer;
/* 2083 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2084 */     BufferChecks.checkDirect(data);
/* 2085 */     nglNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 1), data, data.position() << 1, function_pointer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nglNamedBufferSubDataEXT(int paramInt1, long paramLong1, long paramLong2, Buffer paramBuffer, int paramInt2, long paramLong3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, ByteBuffer old_buffer) {
/* 2111 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2112 */     long function_pointer = caps.EXT_direct_state_access_glMapNamedBufferEXT_pointer;
/* 2113 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2114 */     if (old_buffer != null)
/* 2115 */       BufferChecks.checkDirect(old_buffer); 
/* 2116 */     ByteBuffer __result = nglMapNamedBufferEXT(buffer, access, GLChecks.getNamedBufferObjectSize(caps, buffer), old_buffer, function_pointer);
/* 2117 */     return __result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, long length, ByteBuffer old_buffer) {
/* 2141 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2142 */     long function_pointer = caps.EXT_direct_state_access_glMapNamedBufferEXT_pointer;
/* 2143 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2144 */     if (old_buffer != null)
/* 2145 */       BufferChecks.checkDirect(old_buffer); 
/* 2146 */     ByteBuffer __result = nglMapNamedBufferEXT(buffer, access, length, old_buffer, function_pointer);
/* 2147 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglMapNamedBufferEXT(int paramInt1, int paramInt2, long paramLong1, ByteBuffer paramByteBuffer, long paramLong2);
/*      */   
/*      */   public static boolean glUnmapNamedBufferEXT(int buffer) {
/* 2152 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2153 */     long function_pointer = caps.EXT_direct_state_access_glUnmapNamedBufferEXT_pointer;
/* 2154 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2155 */     boolean __result = nglUnmapNamedBufferEXT(buffer, function_pointer);
/* 2156 */     return __result;
/*      */   }
/*      */   private static native boolean nglUnmapNamedBufferEXT(int paramInt, long paramLong);
/*      */   
/*      */   public static void glGetNamedBufferParameterEXT(int buffer, int pname, IntBuffer params) {
/* 2161 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2162 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferParameterivEXT_pointer;
/* 2163 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2164 */     BufferChecks.checkBuffer(params, 4);
/* 2165 */     nglGetNamedBufferParameterivEXT(buffer, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetNamedBufferParameterivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetNamedBufferParameterEXT(int buffer, int pname) {
/* 2171 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2172 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferParameterivEXT_pointer;
/* 2173 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2174 */     IntBuffer params = APIUtils.getBufferInt();
/* 2175 */     nglGetNamedBufferParameterivEXT(buffer, pname, params, params.position(), function_pointer);
/* 2176 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static ByteBuffer glGetNamedBufferPointerEXT(int buffer, int pname) {
/* 2180 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2181 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferPointervEXT_pointer;
/* 2182 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2183 */     ByteBuffer __result = nglGetNamedBufferPointervEXT(buffer, pname, GLChecks.getNamedBufferObjectSize(caps, buffer), function_pointer);
/* 2184 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglGetNamedBufferPointervEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) {
/* 2189 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2190 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferSubDataEXT_pointer;
/* 2191 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2192 */     BufferChecks.checkDirect(data);
/* 2193 */     nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining(), data, data.position(), function_pointer);
/*      */   }
/*      */   public static void glGetNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) {
/* 2196 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2197 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferSubDataEXT_pointer;
/* 2198 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2199 */     BufferChecks.checkDirect(data);
/* 2200 */     nglGetNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 3), data, data.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) {
/* 2203 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2204 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferSubDataEXT_pointer;
/* 2205 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2206 */     BufferChecks.checkDirect(data);
/* 2207 */     nglGetNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) {
/* 2210 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2211 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferSubDataEXT_pointer;
/* 2212 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2213 */     BufferChecks.checkDirect(data);
/* 2214 */     nglGetNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) {
/* 2217 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2218 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedBufferSubDataEXT_pointer;
/* 2219 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2220 */     BufferChecks.checkDirect(data);
/* 2221 */     nglGetNamedBufferSubDataEXT(buffer, offset, (data.remaining() << 1), data, data.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetNamedBufferSubDataEXT(int paramInt1, long paramLong1, long paramLong2, Buffer paramBuffer, int paramInt2, long paramLong3);
/*      */   
/*      */   public static void glProgramUniform1fEXT(int program, int location, float v0) {
/* 2226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2227 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform1fEXT_pointer;
/* 2228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2229 */     nglProgramUniform1fEXT(program, location, v0, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform1fEXT(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glProgramUniform2fEXT(int program, int location, float v0, float v1) {
/* 2234 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2235 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform2fEXT_pointer;
/* 2236 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2237 */     nglProgramUniform2fEXT(program, location, v0, v1, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform2fEXT(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
/* 2242 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2243 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform3fEXT_pointer;
/* 2244 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2245 */     nglProgramUniform3fEXT(program, location, v0, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform3fEXT(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
/* 2250 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2251 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform4fEXT_pointer;
/* 2252 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2253 */     nglProgramUniform4fEXT(program, location, v0, v1, v2, v3, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform4fEXT(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform1iEXT(int program, int location, int v0) {
/* 2258 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2259 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform1iEXT_pointer;
/* 2260 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2261 */     nglProgramUniform1iEXT(program, location, v0, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform1iEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glProgramUniform2iEXT(int program, int location, int v0, int v1) {
/* 2266 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2267 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform2iEXT_pointer;
/* 2268 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2269 */     nglProgramUniform2iEXT(program, location, v0, v1, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform2iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
/* 2274 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2275 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform3iEXT_pointer;
/* 2276 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2277 */     nglProgramUniform3iEXT(program, location, v0, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform3iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
/* 2282 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2283 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform4iEXT_pointer;
/* 2284 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2285 */     nglProgramUniform4iEXT(program, location, v0, v1, v2, v3, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform4iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glProgramUniform1EXT(int program, int location, FloatBuffer value) {
/* 2290 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2291 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform1fvEXT_pointer;
/* 2292 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2293 */     BufferChecks.checkDirect(value);
/* 2294 */     nglProgramUniform1fvEXT(program, location, value.remaining(), value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform1fvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform2EXT(int program, int location, FloatBuffer value) {
/* 2299 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2300 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform2fvEXT_pointer;
/* 2301 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2302 */     BufferChecks.checkDirect(value);
/* 2303 */     nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform2fvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform3EXT(int program, int location, FloatBuffer value) {
/* 2308 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2309 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform3fvEXT_pointer;
/* 2310 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2311 */     BufferChecks.checkDirect(value);
/* 2312 */     nglProgramUniform3fvEXT(program, location, value.remaining() / 3, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform3fvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform4EXT(int program, int location, FloatBuffer value) {
/* 2317 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2318 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform4fvEXT_pointer;
/* 2319 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2320 */     BufferChecks.checkDirect(value);
/* 2321 */     nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform4fvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform1EXT(int program, int location, IntBuffer value) {
/* 2326 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2327 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform1ivEXT_pointer;
/* 2328 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2329 */     BufferChecks.checkDirect(value);
/* 2330 */     nglProgramUniform1ivEXT(program, location, value.remaining(), value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform1ivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform2EXT(int program, int location, IntBuffer value) {
/* 2335 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2336 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform2ivEXT_pointer;
/* 2337 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2338 */     BufferChecks.checkDirect(value);
/* 2339 */     nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform2ivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform3EXT(int program, int location, IntBuffer value) {
/* 2344 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2345 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform3ivEXT_pointer;
/* 2346 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2347 */     BufferChecks.checkDirect(value);
/* 2348 */     nglProgramUniform3ivEXT(program, location, value.remaining() / 3, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform3ivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform4EXT(int program, int location, IntBuffer value) {
/* 2353 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2354 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform4ivEXT_pointer;
/* 2355 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2356 */     BufferChecks.checkDirect(value);
/* 2357 */     nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform4ivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix2EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2362 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2363 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix2fvEXT_pointer;
/* 2364 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2365 */     BufferChecks.checkDirect(value);
/* 2366 */     nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix2fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix3EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2371 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2372 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix3fvEXT_pointer;
/* 2373 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2374 */     BufferChecks.checkDirect(value);
/* 2375 */     nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix3fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix4EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2380 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2381 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix4fvEXT_pointer;
/* 2382 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2383 */     BufferChecks.checkDirect(value);
/* 2384 */     nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix4fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix2x3EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2389 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2390 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix2x3fvEXT_pointer;
/* 2391 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2392 */     BufferChecks.checkDirect(value);
/* 2393 */     nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix2x3fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix3x2EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2398 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2399 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix3x2fvEXT_pointer;
/* 2400 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2401 */     BufferChecks.checkDirect(value);
/* 2402 */     nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix3x2fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix2x4EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2407 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2408 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix2x4fvEXT_pointer;
/* 2409 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2410 */     BufferChecks.checkDirect(value);
/* 2411 */     nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix2x4fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix4x2EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2416 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2417 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix4x2fvEXT_pointer;
/* 2418 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2419 */     BufferChecks.checkDirect(value);
/* 2420 */     nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix4x2fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix3x4EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2425 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2426 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix3x4fvEXT_pointer;
/* 2427 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2428 */     BufferChecks.checkDirect(value);
/* 2429 */     nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix3x4fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniformMatrix4x3EXT(int program, int location, boolean transpose, FloatBuffer value) {
/* 2434 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2435 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniformMatrix4x3fvEXT_pointer;
/* 2436 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2437 */     BufferChecks.checkDirect(value);
/* 2438 */     nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniformMatrix4x3fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTextureBufferEXT(int texture, int target, int internalformat, int buffer) {
/* 2443 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2444 */     long function_pointer = caps.EXT_direct_state_access_glTextureBufferEXT_pointer;
/* 2445 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2446 */     nglTextureBufferEXT(texture, target, internalformat, buffer, function_pointer);
/*      */   }
/*      */   private static native void nglTextureBufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer) {
/* 2451 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2452 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexBufferEXT_pointer;
/* 2453 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2454 */     nglMultiTexBufferEXT(texunit, target, internalformat, buffer, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexBufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTextureParameterIEXT(int texture, int target, int pname, IntBuffer params) {
/* 2459 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2460 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameterIivEXT_pointer;
/* 2461 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2462 */     BufferChecks.checkBuffer(params, 4);
/* 2463 */     nglTextureParameterIivEXT(texture, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglTextureParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTextureParameterIEXT(int texture, int target, int pname, int param) {
/* 2469 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2470 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameterIivEXT_pointer;
/* 2471 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2472 */     nglTextureParameterIivEXT(texture, target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glTextureParameterIuEXT(int texture, int target, int pname, IntBuffer params) {
/* 2476 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2477 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameterIuivEXT_pointer;
/* 2478 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2479 */     BufferChecks.checkBuffer(params, 4);
/* 2480 */     nglTextureParameterIuivEXT(texture, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglTextureParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTextureParameterIuEXT(int texture, int target, int pname, int param) {
/* 2486 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2487 */     long function_pointer = caps.EXT_direct_state_access_glTextureParameterIuivEXT_pointer;
/* 2488 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2489 */     nglTextureParameterIuivEXT(texture, target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGetTextureParameterIEXT(int texture, int target, int pname, IntBuffer params) {
/* 2493 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2494 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterIivEXT_pointer;
/* 2495 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2496 */     BufferChecks.checkBuffer(params, 4);
/* 2497 */     nglGetTextureParameterIivEXT(texture, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTextureParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetTextureParameterIiEXT(int texture, int target, int pname) {
/* 2503 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2504 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterIivEXT_pointer;
/* 2505 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2506 */     IntBuffer params = APIUtils.getBufferInt();
/* 2507 */     nglGetTextureParameterIivEXT(texture, target, pname, params, params.position(), function_pointer);
/* 2508 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTextureParameterIuEXT(int texture, int target, int pname, IntBuffer params) {
/* 2512 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2513 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterIuivEXT_pointer;
/* 2514 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2515 */     BufferChecks.checkBuffer(params, 4);
/* 2516 */     nglGetTextureParameterIuivEXT(texture, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTextureParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetTextureParameterIuiEXT(int texture, int target, int pname) {
/* 2522 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2523 */     long function_pointer = caps.EXT_direct_state_access_glGetTextureParameterIuivEXT_pointer;
/* 2524 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2525 */     IntBuffer params = APIUtils.getBufferInt();
/* 2526 */     nglGetTextureParameterIuivEXT(texture, target, pname, params, params.position(), function_pointer);
/* 2527 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glMultiTexParameterIEXT(int texunit, int target, int pname, IntBuffer params) {
/* 2531 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2532 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameterIivEXT_pointer;
/* 2533 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2534 */     BufferChecks.checkBuffer(params, 4);
/* 2535 */     nglMultiTexParameterIivEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglMultiTexParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexParameterIEXT(int texunit, int target, int pname, int param) {
/* 2541 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2542 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameterIivEXT_pointer;
/* 2543 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2544 */     nglMultiTexParameterIivEXT(texunit, target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glMultiTexParameterIuEXT(int texunit, int target, int pname, IntBuffer params) {
/* 2548 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2549 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameterIuivEXT_pointer;
/* 2550 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2551 */     BufferChecks.checkBuffer(params, 4);
/* 2552 */     nglMultiTexParameterIuivEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglMultiTexParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMultiTexParameterIuEXT(int texunit, int target, int pname, int param) {
/* 2558 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2559 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexParameterIuivEXT_pointer;
/* 2560 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2561 */     nglMultiTexParameterIuivEXT(texunit, target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGetMultiTexParameterIEXT(int texunit, int target, int pname, IntBuffer params) {
/* 2565 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2566 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterIivEXT_pointer;
/* 2567 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2568 */     BufferChecks.checkBuffer(params, 4);
/* 2569 */     nglGetMultiTexParameterIivEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetMultiTexParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetMultiTexParameterIiEXT(int texunit, int target, int pname) {
/* 2575 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2576 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterIivEXT_pointer;
/* 2577 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2578 */     IntBuffer params = APIUtils.getBufferInt();
/* 2579 */     nglGetMultiTexParameterIivEXT(texunit, target, pname, params, params.position(), function_pointer);
/* 2580 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetMultiTexParameterIuEXT(int texunit, int target, int pname, IntBuffer params) {
/* 2584 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2585 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterIuivEXT_pointer;
/* 2586 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2587 */     BufferChecks.checkBuffer(params, 4);
/* 2588 */     nglGetMultiTexParameterIuivEXT(texunit, target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetMultiTexParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetMultiTexParameterIuiEXT(int texunit, int target, int pname) {
/* 2594 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2595 */     long function_pointer = caps.EXT_direct_state_access_glGetMultiTexParameterIuivEXT_pointer;
/* 2596 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2597 */     IntBuffer params = APIUtils.getBufferInt();
/* 2598 */     nglGetMultiTexParameterIuivEXT(texunit, target, pname, params, params.position(), function_pointer);
/* 2599 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glProgramUniform1uiEXT(int program, int location, int v0) {
/* 2603 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2604 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform1uiEXT_pointer;
/* 2605 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2606 */     nglProgramUniform1uiEXT(program, location, v0, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform1uiEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glProgramUniform2uiEXT(int program, int location, int v0, int v1) {
/* 2611 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2612 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform2uiEXT_pointer;
/* 2613 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2614 */     nglProgramUniform2uiEXT(program, location, v0, v1, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform2uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
/* 2619 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2620 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform3uiEXT_pointer;
/* 2621 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2622 */     nglProgramUniform3uiEXT(program, location, v0, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform3uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
/* 2627 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2628 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform4uiEXT_pointer;
/* 2629 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2630 */     nglProgramUniform4uiEXT(program, location, v0, v1, v2, v3, function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glProgramUniform1uEXT(int program, int location, IntBuffer value) {
/* 2635 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2636 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform1uivEXT_pointer;
/* 2637 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2638 */     BufferChecks.checkDirect(value);
/* 2639 */     nglProgramUniform1uivEXT(program, location, value.remaining(), value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform1uivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform2uEXT(int program, int location, IntBuffer value) {
/* 2644 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2645 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform2uivEXT_pointer;
/* 2646 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2647 */     BufferChecks.checkDirect(value);
/* 2648 */     nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform2uivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform3uEXT(int program, int location, IntBuffer value) {
/* 2653 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2654 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform3uivEXT_pointer;
/* 2655 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2656 */     BufferChecks.checkDirect(value);
/* 2657 */     nglProgramUniform3uivEXT(program, location, value.remaining() / 3, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform3uivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glProgramUniform4uEXT(int program, int location, IntBuffer value) {
/* 2662 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2663 */     long function_pointer = caps.EXT_direct_state_access_glProgramUniform4uivEXT_pointer;
/* 2664 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2665 */     BufferChecks.checkDirect(value);
/* 2666 */     nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglProgramUniform4uivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameters4EXT(int program, int target, int index, FloatBuffer params) {
/* 2671 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2672 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameters4fvEXT_pointer;
/* 2673 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2674 */     BufferChecks.checkDirect(params);
/* 2675 */     nglNamedProgramLocalParameters4fvEXT(program, target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameters4fvEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w) {
/* 2680 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2681 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameterI4iEXT_pointer;
/* 2682 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2683 */     nglNamedProgramLocalParameterI4iEXT(program, target, index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameterI4iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameterI4EXT(int program, int target, int index, IntBuffer params) {
/* 2688 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2689 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameterI4ivEXT_pointer;
/* 2690 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2691 */     BufferChecks.checkBuffer(params, 4);
/* 2692 */     nglNamedProgramLocalParameterI4ivEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameterI4ivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParametersI4EXT(int program, int target, int index, IntBuffer params) {
/* 2697 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2698 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParametersI4ivEXT_pointer;
/* 2699 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2700 */     BufferChecks.checkDirect(params);
/* 2701 */     nglNamedProgramLocalParametersI4ivEXT(program, target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParametersI4ivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w) {
/* 2706 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2707 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameterI4uiEXT_pointer;
/* 2708 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2709 */     nglNamedProgramLocalParameterI4uiEXT(program, target, index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameterI4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParameterI4uEXT(int program, int target, int index, IntBuffer params) {
/* 2714 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2715 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParameterI4uivEXT_pointer;
/* 2716 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2717 */     BufferChecks.checkBuffer(params, 4);
/* 2718 */     nglNamedProgramLocalParameterI4uivEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParameterI4uivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glNamedProgramLocalParametersI4uEXT(int program, int target, int index, IntBuffer params) {
/* 2723 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2724 */     long function_pointer = caps.EXT_direct_state_access_glNamedProgramLocalParametersI4uivEXT_pointer;
/* 2725 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2726 */     BufferChecks.checkDirect(params);
/* 2727 */     nglNamedProgramLocalParametersI4uivEXT(program, target, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglNamedProgramLocalParametersI4uivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glGetNamedProgramLocalParameterIEXT(int program, int target, int index, IntBuffer params) {
/* 2732 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2733 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramLocalParameterIivEXT_pointer;
/* 2734 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2735 */     BufferChecks.checkBuffer(params, 4);
/* 2736 */     nglGetNamedProgramLocalParameterIivEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetNamedProgramLocalParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetNamedProgramLocalParameterIuEXT(int program, int target, int index, IntBuffer params) {
/* 2741 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2742 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedProgramLocalParameterIuivEXT_pointer;
/* 2743 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2744 */     BufferChecks.checkBuffer(params, 4);
/* 2745 */     nglGetNamedProgramLocalParameterIuivEXT(program, target, index, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetNamedProgramLocalParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height) {
/* 2750 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2751 */     long function_pointer = caps.EXT_direct_state_access_glNamedRenderbufferStorageEXT_pointer;
/* 2752 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2753 */     nglNamedRenderbufferStorageEXT(renderbuffer, internalformat, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglNamedRenderbufferStorageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetNamedRenderbufferParameterEXT(int renderbuffer, int pname, IntBuffer params) {
/* 2758 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2759 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedRenderbufferParameterivEXT_pointer;
/* 2760 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2761 */     BufferChecks.checkBuffer(params, 4);
/* 2762 */     nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetNamedRenderbufferParameterivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetNamedRenderbufferParameterEXT(int renderbuffer, int pname) {
/* 2768 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2769 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedRenderbufferParameterivEXT_pointer;
/* 2770 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2771 */     IntBuffer params = APIUtils.getBufferInt();
/* 2772 */     nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, params, params.position(), function_pointer);
/* 2773 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height) {
/* 2777 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2778 */     long function_pointer = caps.EXT_direct_state_access_glNamedRenderbufferStorageMultisampleEXT_pointer;
/* 2779 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2780 */     nglNamedRenderbufferStorageMultisampleEXT(renderbuffer, samples, internalformat, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglNamedRenderbufferStorageMultisampleEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
/* 2785 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2786 */     long function_pointer = caps.EXT_direct_state_access_glNamedRenderbufferStorageMultisampleCoverageEXT_pointer;
/* 2787 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2788 */     nglNamedRenderbufferStorageMultisampleCoverageEXT(renderbuffer, coverageSamples, colorSamples, internalformat, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglNamedRenderbufferStorageMultisampleCoverageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*      */   
/*      */   public static int glCheckNamedFramebufferStatusEXT(int framebuffer, int target) {
/* 2793 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2794 */     long function_pointer = caps.EXT_direct_state_access_glCheckNamedFramebufferStatusEXT_pointer;
/* 2795 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2796 */     int __result = nglCheckNamedFramebufferStatusEXT(framebuffer, target, function_pointer);
/* 2797 */     return __result;
/*      */   }
/*      */   private static native int nglCheckNamedFramebufferStatusEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
/* 2802 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2803 */     long function_pointer = caps.EXT_direct_state_access_glNamedFramebufferTexture1DEXT_pointer;
/* 2804 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2805 */     nglNamedFramebufferTexture1DEXT(framebuffer, attachment, textarget, texture, level, function_pointer);
/*      */   }
/*      */   private static native void nglNamedFramebufferTexture1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
/* 2810 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2811 */     long function_pointer = caps.EXT_direct_state_access_glNamedFramebufferTexture2DEXT_pointer;
/* 2812 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2813 */     nglNamedFramebufferTexture2DEXT(framebuffer, attachment, textarget, texture, level, function_pointer);
/*      */   }
/*      */   private static native void nglNamedFramebufferTexture2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset) {
/* 2818 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2819 */     long function_pointer = caps.EXT_direct_state_access_glNamedFramebufferTexture3DEXT_pointer;
/* 2820 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2821 */     nglNamedFramebufferTexture3DEXT(framebuffer, attachment, textarget, texture, level, zoffset, function_pointer);
/*      */   }
/*      */   private static native void nglNamedFramebufferTexture3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
/* 2826 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2827 */     long function_pointer = caps.EXT_direct_state_access_glNamedFramebufferRenderbufferEXT_pointer;
/* 2828 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2829 */     nglNamedFramebufferRenderbufferEXT(framebuffer, attachment, renderbuffertarget, renderbuffer, function_pointer);
/*      */   }
/*      */   private static native void nglNamedFramebufferRenderbufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetNamedFramebufferAttachmentParameterEXT(int framebuffer, int attachment, int pname, IntBuffer params) {
/* 2834 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2835 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedFramebufferAttachmentParameterivEXT_pointer;
/* 2836 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2837 */     BufferChecks.checkBuffer(params, 4);
/* 2838 */     nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetNamedFramebufferAttachmentParameterivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetNamedFramebufferAttachmentParameterEXT(int framebuffer, int attachment, int pname) {
/* 2844 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2845 */     long function_pointer = caps.EXT_direct_state_access_glGetNamedFramebufferAttachmentParameterivEXT_pointer;
/* 2846 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2847 */     IntBuffer params = APIUtils.getBufferInt();
/* 2848 */     nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, params, params.position(), function_pointer);
/* 2849 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGenerateTextureMipmapEXT(int texture, int target) {
/* 2853 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2854 */     long function_pointer = caps.EXT_direct_state_access_glGenerateTextureMipmapEXT_pointer;
/* 2855 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2856 */     nglGenerateTextureMipmapEXT(texture, target, function_pointer);
/*      */   }
/*      */   private static native void nglGenerateTextureMipmapEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glGenerateMultiTexMipmapEXT(int texunit, int target) {
/* 2861 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2862 */     long function_pointer = caps.EXT_direct_state_access_glGenerateMultiTexMipmapEXT_pointer;
/* 2863 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2864 */     nglGenerateMultiTexMipmapEXT(texunit, target, function_pointer);
/*      */   }
/*      */   private static native void nglGenerateMultiTexMipmapEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glFramebufferDrawBufferEXT(int framebuffer, int mode) {
/* 2869 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2870 */     long function_pointer = caps.EXT_direct_state_access_glFramebufferDrawBufferEXT_pointer;
/* 2871 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2872 */     nglFramebufferDrawBufferEXT(framebuffer, mode, function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferDrawBufferEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glFramebufferDrawBuffersEXT(int framebuffer, IntBuffer bufs) {
/* 2877 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2878 */     long function_pointer = caps.EXT_direct_state_access_glFramebufferDrawBuffersEXT_pointer;
/* 2879 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2880 */     BufferChecks.checkDirect(bufs);
/* 2881 */     nglFramebufferDrawBuffersEXT(framebuffer, bufs.remaining(), bufs, bufs.position(), function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferDrawBuffersEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glFramebufferReadBufferEXT(int framebuffer, int mode) {
/* 2886 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2887 */     long function_pointer = caps.EXT_direct_state_access_glFramebufferReadBufferEXT_pointer;
/* 2888 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2889 */     nglFramebufferReadBufferEXT(framebuffer, mode, function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferReadBufferEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glGetFramebufferParameterEXT(int framebuffer, int pname, IntBuffer param) {
/* 2894 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2895 */     long function_pointer = caps.EXT_direct_state_access_glGetFramebufferParameterivEXT_pointer;
/* 2896 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2897 */     BufferChecks.checkBuffer(param, 4);
/* 2898 */     nglGetFramebufferParameterivEXT(framebuffer, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetFramebufferParameterivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetFramebufferParameterEXT(int framebuffer, int pname) {
/* 2904 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2905 */     long function_pointer = caps.EXT_direct_state_access_glGetFramebufferParameterivEXT_pointer;
/* 2906 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2907 */     IntBuffer param = APIUtils.getBufferInt();
/* 2908 */     nglGetFramebufferParameterivEXT(framebuffer, pname, param, param.position(), function_pointer);
/* 2909 */     return param.get(0);
/*      */   }
/*      */   
/*      */   public static void glNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readoffset, long writeoffset, long size) {
/* 2913 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2914 */     long function_pointer = caps.EXT_direct_state_access_glNamedCopyBufferSubDataEXT_pointer;
/* 2915 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2916 */     nglNamedCopyBufferSubDataEXT(readBuffer, writeBuffer, readoffset, writeoffset, size, function_pointer);
/*      */   }
/*      */   private static native void nglNamedCopyBufferSubDataEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */   
/*      */   public static void glNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level) {
/* 2921 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2922 */     long function_pointer = caps.EXT_direct_state_access_glNamedFramebufferTextureEXT_pointer;
/* 2923 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2924 */     nglNamedFramebufferTextureEXT(framebuffer, attachment, texture, level, function_pointer);
/*      */   }
/*      */   private static native void nglNamedFramebufferTextureEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer) {
/* 2929 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2930 */     long function_pointer = caps.EXT_direct_state_access_glNamedFramebufferTextureLayerEXT_pointer;
/* 2931 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2932 */     nglNamedFramebufferTextureLayerEXT(framebuffer, attachment, texture, level, layer, function_pointer);
/*      */   }
/*      */   private static native void nglNamedFramebufferTextureLayerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face) {
/* 2937 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2938 */     long function_pointer = caps.EXT_direct_state_access_glNamedFramebufferTextureFaceEXT_pointer;
/* 2939 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2940 */     nglNamedFramebufferTextureFaceEXT(framebuffer, attachment, texture, level, face, function_pointer);
/*      */   }
/*      */   private static native void nglNamedFramebufferTextureFaceEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glTextureRenderbufferEXT(int texture, int target, int renderbuffer) {
/* 2945 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2946 */     long function_pointer = caps.EXT_direct_state_access_glTextureRenderbufferEXT_pointer;
/* 2947 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2948 */     nglTextureRenderbufferEXT(texture, target, renderbuffer, function_pointer);
/*      */   }
/*      */   private static native void nglTextureRenderbufferEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer) {
/* 2953 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2954 */     long function_pointer = caps.EXT_direct_state_access_glMultiTexRenderbufferEXT_pointer;
/* 2955 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2956 */     nglMultiTexRenderbufferEXT(texunit, target, renderbuffer, function_pointer);
/*      */   }
/*      */   private static native void nglMultiTexRenderbufferEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
/* 2961 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2962 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayVertexOffsetEXT_pointer;
/* 2963 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2964 */     nglVertexArrayVertexOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayVertexOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
/* 2969 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2970 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayColorOffsetEXT_pointer;
/* 2971 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2972 */     nglVertexArrayColorOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayColorOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset) {
/* 2977 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2978 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayEdgeFlagOffsetEXT_pointer;
/* 2979 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2980 */     nglVertexArrayEdgeFlagOffsetEXT(vaobj, buffer, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayEdgeFlagOffsetEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
/* 2985 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2986 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayIndexOffsetEXT_pointer;
/* 2987 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2988 */     nglVertexArrayIndexOffsetEXT(vaobj, buffer, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayIndexOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
/* 2993 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2994 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayNormalOffsetEXT_pointer;
/* 2995 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2996 */     nglVertexArrayNormalOffsetEXT(vaobj, buffer, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayNormalOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
/* 3001 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3002 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayTexCoordOffsetEXT_pointer;
/* 3003 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3004 */     nglVertexArrayTexCoordOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayTexCoordOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset) {
/* 3009 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3010 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayMultiTexCoordOffsetEXT_pointer;
/* 3011 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3012 */     nglVertexArrayMultiTexCoordOffsetEXT(vaobj, buffer, texunit, size, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayMultiTexCoordOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
/* 3017 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3018 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayFogCoordOffsetEXT_pointer;
/* 3019 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3020 */     nglVertexArrayFogCoordOffsetEXT(vaobj, buffer, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayFogCoordOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
/* 3025 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3026 */     long function_pointer = caps.EXT_direct_state_access_glVertexArraySecondaryColorOffsetEXT_pointer;
/* 3027 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3028 */     nglVertexArraySecondaryColorOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArraySecondaryColorOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset) {
/* 3033 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3034 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayVertexAttribOffsetEXT_pointer;
/* 3035 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3036 */     nglVertexArrayVertexAttribOffsetEXT(vaobj, buffer, index, size, type, normalized, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayVertexAttribOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
/* 3041 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3042 */     long function_pointer = caps.EXT_direct_state_access_glVertexArrayVertexAttribIOffsetEXT_pointer;
/* 3043 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3044 */     nglVertexArrayVertexAttribIOffsetEXT(vaobj, buffer, index, size, type, stride, offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexArrayVertexAttribIOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glEnableVertexArrayEXT(int vaobj, int array) {
/* 3049 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3050 */     long function_pointer = caps.EXT_direct_state_access_glEnableVertexArrayEXT_pointer;
/* 3051 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3052 */     nglEnableVertexArrayEXT(vaobj, array, function_pointer);
/*      */   }
/*      */   private static native void nglEnableVertexArrayEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDisableVertexArrayEXT(int vaobj, int array) {
/* 3057 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3058 */     long function_pointer = caps.EXT_direct_state_access_glDisableVertexArrayEXT_pointer;
/* 3059 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3060 */     nglDisableVertexArrayEXT(vaobj, array, function_pointer);
/*      */   }
/*      */   private static native void nglDisableVertexArrayEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glEnableVertexArrayAttribEXT(int vaobj, int index) {
/* 3065 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3066 */     long function_pointer = caps.EXT_direct_state_access_glEnableVertexArrayAttribEXT_pointer;
/* 3067 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3068 */     nglEnableVertexArrayAttribEXT(vaobj, index, function_pointer);
/*      */   }
/*      */   private static native void nglEnableVertexArrayAttribEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDisableVertexArrayAttribEXT(int vaobj, int index) {
/* 3073 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3074 */     long function_pointer = caps.EXT_direct_state_access_glDisableVertexArrayAttribEXT_pointer;
/* 3075 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3076 */     nglDisableVertexArrayAttribEXT(vaobj, index, function_pointer);
/*      */   }
/*      */   private static native void nglDisableVertexArrayAttribEXT(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glGetVertexArrayIntegerEXT(int vaobj, int pname, IntBuffer param) {
/* 3081 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3082 */     long function_pointer = caps.EXT_direct_state_access_glGetVertexArrayIntegervEXT_pointer;
/* 3083 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3084 */     BufferChecks.checkBuffer(param, 16);
/* 3085 */     nglGetVertexArrayIntegervEXT(vaobj, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetVertexArrayIntegervEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetVertexArrayIntegerEXT(int vaobj, int pname) {
/* 3091 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3092 */     long function_pointer = caps.EXT_direct_state_access_glGetVertexArrayIntegervEXT_pointer;
/* 3093 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3094 */     IntBuffer param = APIUtils.getBufferInt();
/* 3095 */     nglGetVertexArrayIntegervEXT(vaobj, pname, param, param.position(), function_pointer);
/* 3096 */     return param.get(0);
/*      */   }
/*      */   
/*      */   public static ByteBuffer glGetVertexArrayPointerEXT(int vaobj, int pname, long result_size) {
/* 3100 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3101 */     long function_pointer = caps.EXT_direct_state_access_glGetVertexArrayPointervEXT_pointer;
/* 3102 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3103 */     ByteBuffer __result = nglGetVertexArrayPointervEXT(vaobj, pname, result_size, function_pointer);
/* 3104 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglGetVertexArrayPointervEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetVertexArrayIntegerEXT(int vaobj, int index, int pname, IntBuffer param) {
/* 3109 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3110 */     long function_pointer = caps.EXT_direct_state_access_glGetVertexArrayIntegeri_vEXT_pointer;
/* 3111 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3112 */     BufferChecks.checkBuffer(param, 16);
/* 3113 */     nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetVertexArrayIntegeri_vEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetVertexArrayIntegeriEXT(int vaobj, int index, int pname) {
/* 3119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3120 */     long function_pointer = caps.EXT_direct_state_access_glGetVertexArrayIntegeri_vEXT_pointer;
/* 3121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3122 */     IntBuffer param = APIUtils.getBufferInt();
/* 3123 */     nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, param, param.position(), function_pointer);
/* 3124 */     return param.get(0);
/*      */   }
/*      */   
/*      */   public static ByteBuffer glGetVertexArrayPointeri_EXT(int vaobj, int index, int pname, long result_size) {
/* 3128 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3129 */     long function_pointer = caps.EXT_direct_state_access_glGetVertexArrayPointeri_vEXT_pointer;
/* 3130 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3131 */     ByteBuffer __result = nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, result_size, function_pointer);
/* 3132 */     return __result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native ByteBuffer nglGetVertexArrayPointeri_vEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access, ByteBuffer old_buffer) {
/* 3149 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3150 */     long function_pointer = caps.EXT_direct_state_access_glMapNamedBufferRangeEXT_pointer;
/* 3151 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3152 */     if (old_buffer != null)
/* 3153 */       BufferChecks.checkDirect(old_buffer); 
/* 3154 */     ByteBuffer __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access, old_buffer, function_pointer);
/* 3155 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglMapNamedBufferRangeEXT(int paramInt1, long paramLong1, long paramLong2, int paramInt2, ByteBuffer paramByteBuffer, long paramLong3);
/*      */   
/*      */   public static void glFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length) {
/* 3160 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3161 */     long function_pointer = caps.EXT_direct_state_access_glFlushMappedNamedBufferRangeEXT_pointer;
/* 3162 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3163 */     nglFlushMappedNamedBufferRangeEXT(buffer, offset, length, function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglFlushMappedNamedBufferRangeEXT(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTDirectStateAccess.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */