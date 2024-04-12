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
/*     */ public final class GL12
/*     */ {
/*     */   public static final int GL_TEXTURE_BINDING_3D = 32874;
/*     */   public static final int GL_PACK_SKIP_IMAGES = 32875;
/*     */   public static final int GL_PACK_IMAGE_HEIGHT = 32876;
/*     */   public static final int GL_UNPACK_SKIP_IMAGES = 32877;
/*     */   public static final int GL_UNPACK_IMAGE_HEIGHT = 32878;
/*     */   public static final int GL_TEXTURE_3D = 32879;
/*     */   public static final int GL_PROXY_TEXTURE_3D = 32880;
/*     */   public static final int GL_TEXTURE_DEPTH = 32881;
/*     */   public static final int GL_TEXTURE_WRAP_R = 32882;
/*     */   public static final int GL_MAX_3D_TEXTURE_SIZE = 32883;
/*     */   public static final int GL_BGR = 32992;
/*     */   public static final int GL_BGRA = 32993;
/*     */   public static final int GL_UNSIGNED_BYTE_3_3_2 = 32818;
/*     */   public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 33634;
/*     */   public static final int GL_UNSIGNED_SHORT_5_6_5 = 33635;
/*     */   public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 33636;
/*     */   public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 32819;
/*     */   public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 33637;
/*     */   public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 32820;
/*     */   public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 33638;
/*     */   public static final int GL_UNSIGNED_INT_8_8_8_8 = 32821;
/*     */   public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 33639;
/*     */   public static final int GL_UNSIGNED_INT_10_10_10_2 = 32822;
/*     */   public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 33640;
/*     */   public static final int GL_RESCALE_NORMAL = 32826;
/*     */   public static final int GL_LIGHT_MODEL_COLOR_CONTROL = 33272;
/*     */   public static final int GL_SINGLE_COLOR = 33273;
/*     */   public static final int GL_SEPARATE_SPECULAR_COLOR = 33274;
/*     */   public static final int GL_CLAMP_TO_EDGE = 33071;
/*     */   public static final int GL_TEXTURE_MIN_LOD = 33082;
/*     */   public static final int GL_TEXTURE_MAX_LOD = 33083;
/*     */   public static final int GL_TEXTURE_BASE_LEVEL = 33084;
/*     */   public static final int GL_TEXTURE_MAX_LEVEL = 33085;
/*     */   public static final int GL_MAX_ELEMENTS_VERTICES = 33000;
/*     */   public static final int GL_MAX_ELEMENTS_INDICES = 33001;
/*     */   public static final int GL_ALIASED_POINT_SIZE_RANGE = 33901;
/*     */   public static final int GL_ALIASED_LINE_WIDTH_RANGE = 33902;
/*     */   public static final int GL_SMOOTH_POINT_SIZE_RANGE = 2834;
/*     */   public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 2835;
/*     */   public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 2850;
/*     */   public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 2851;
/*     */   
/*     */   public static void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
/*  64 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  65 */     long function_pointer = caps.GL12_glDrawRangeElements_pointer;
/*  66 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  67 */     GLChecks.ensureElementVBOdisabled(caps);
/*  68 */     BufferChecks.checkDirect(indices);
/*  69 */     nglDrawRangeElements(mode, start, end, indices.remaining(), 5121, indices, indices.position(), function_pointer);
/*     */   }
/*     */   public static void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
/*  72 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  73 */     long function_pointer = caps.GL12_glDrawRangeElements_pointer;
/*  74 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  75 */     GLChecks.ensureElementVBOdisabled(caps);
/*  76 */     BufferChecks.checkDirect(indices);
/*  77 */     nglDrawRangeElements(mode, start, end, indices.remaining(), 5125, indices, indices.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
/*  80 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  81 */     long function_pointer = caps.GL12_glDrawRangeElements_pointer;
/*  82 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  83 */     GLChecks.ensureElementVBOdisabled(caps);
/*  84 */     BufferChecks.checkDirect(indices);
/*  85 */     nglDrawRangeElements(mode, start, end, indices.remaining(), 5123, indices, indices.position() << 1, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices_buffer_offset) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.GL12_glDrawRangeElements_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     GLChecks.ensureElementVBOenabled(caps);
/*  93 */     nglDrawRangeElementsBO(mode, start, end, count, type, indices_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglDrawRangeElements(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*     */   private static native void nglDrawRangeElementsBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.GL12_glTexImage3D_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 102 */     if (pixels != null)
/* 103 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 104 */     nglTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*     */   }
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
/* 107 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 108 */     long function_pointer = caps.GL12_glTexImage3D_pointer;
/* 109 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 110 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 111 */     if (pixels != null)
/* 112 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 113 */     nglTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*     */   }
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
/* 116 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 117 */     long function_pointer = caps.GL12_glTexImage3D_pointer;
/* 118 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 119 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 120 */     if (pixels != null)
/* 121 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 122 */     nglTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*     */   }
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
/* 125 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 126 */     long function_pointer = caps.GL12_glTexImage3D_pointer;
/* 127 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 128 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 129 */     if (pixels != null)
/* 130 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 131 */     nglTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*     */   }
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
/* 134 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 135 */     long function_pointer = caps.GL12_glTexImage3D_pointer;
/* 136 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 137 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 138 */     if (pixels != null)
/* 139 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth)); 
/* 140 */     nglTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*     */   }
/*     */   private static native void nglTexImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, Buffer paramBuffer, int paramInt10, long paramLong);
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, long pixels_buffer_offset) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.GL12_glTexImage3D_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 148 */     nglTexImage3DBO(target, level, internalFormat, width, height, depth, border, format, type, pixels_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglTexImage3DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
/* 153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 154 */     long function_pointer = caps.GL12_glTexSubImage3D_pointer;
/* 155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 156 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 157 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 158 */     nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position(), function_pointer);
/*     */   }
/*     */   public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
/* 161 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 162 */     long function_pointer = caps.GL12_glTexSubImage3D_pointer;
/* 163 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 164 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 165 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 166 */     nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
/* 169 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 170 */     long function_pointer = caps.GL12_glTexSubImage3D_pointer;
/* 171 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 172 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 173 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 174 */     nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
/* 177 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 178 */     long function_pointer = caps.GL12_glTexSubImage3D_pointer;
/* 179 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 180 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 181 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 182 */     nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
/* 185 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 186 */     long function_pointer = caps.GL12_glTexSubImage3D_pointer;
/* 187 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 188 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 189 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
/* 190 */     nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, pixels.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglTexSubImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, Buffer paramBuffer, int paramInt11, long paramLong);
/*     */   public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels_buffer_offset) {
/* 194 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 195 */     long function_pointer = caps.GL12_glTexSubImage3D_pointer;
/* 196 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 197 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 198 */     nglTexSubImage3DBO(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglTexSubImage3DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
/* 203 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 204 */     long function_pointer = caps.GL12_glCopyTexSubImage3D_pointer;
/* 205 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 206 */     nglCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglCopyTexSubImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL12.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */