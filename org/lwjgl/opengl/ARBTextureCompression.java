/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ARBTextureCompression
/*     */ {
/*     */   public static final int GL_COMPRESSED_ALPHA_ARB = 34025;
/*     */   public static final int GL_COMPRESSED_LUMINANCE_ARB = 34026;
/*     */   public static final int GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 34027;
/*     */   public static final int GL_COMPRESSED_INTENSITY_ARB = 34028;
/*     */   public static final int GL_COMPRESSED_RGB_ARB = 34029;
/*     */   public static final int GL_COMPRESSED_RGBA_ARB = 34030;
/*     */   public static final int GL_TEXTURE_COMPRESSION_HINT_ARB = 34031;
/*     */   public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 34464;
/*     */   public static final int GL_TEXTURE_COMPRESSED_ARB = 34465;
/*     */   public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 34466;
/*     */   public static final int GL_COMPRESSED_TEXTURE_FORMATS_ARB = 34467;
/*     */   
/*     */   private static native void nglCompressedTexImage1DARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*     */   
/*     */   public static void glCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, ByteBuffer pData) {
/*  27 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  28 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexImage1DARB_pointer;
/*  29 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  30 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  31 */     BufferChecks.checkDirect(pData);
/*  32 */     nglCompressedTexImage1DARB(target, level, internalformat, width, border, pData.remaining(), pData, pData.position(), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, long pData_buffer_offset) {
/*  36 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  37 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexImage1DARB_pointer;
/*  38 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  39 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  40 */     nglCompressedTexImage1DARBBO(target, level, internalformat, width, border, imageSize, pData_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage1DARBBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, ByteBuffer pData) {
/*  45 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  46 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexImage2DARB_pointer;
/*  47 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  48 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  49 */     BufferChecks.checkDirect(pData);
/*  50 */     nglCompressedTexImage2DARB(target, level, internalformat, width, height, border, pData.remaining(), pData, pData.position(), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, long pData_buffer_offset) {
/*  54 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  55 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexImage2DARB_pointer;
/*  56 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  57 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  58 */     nglCompressedTexImage2DARBBO(target, level, internalformat, width, height, border, imageSize, pData_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage2DARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, ByteBuffer paramByteBuffer, int paramInt8, long paramLong);
/*     */   private static native void nglCompressedTexImage2DARBBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*     */   public static void glCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer pData) {
/*  63 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  64 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexImage3DARB_pointer;
/*  65 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  66 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  67 */     BufferChecks.checkDirect(pData);
/*  68 */     nglCompressedTexImage3DARB(target, level, internalformat, width, height, depth, border, pData.remaining(), pData, pData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage3DARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ByteBuffer paramByteBuffer, int paramInt9, long paramLong);
/*     */   public static void glCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long pData_buffer_offset) {
/*  72 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  73 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexImage3DARB_pointer;
/*  74 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  75 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  76 */     nglCompressedTexImage3DARBBO(target, level, internalformat, width, height, depth, border, imageSize, pData_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexImage3DARBBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, ByteBuffer pData) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexSubImage1DARB_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  85 */     BufferChecks.checkDirect(pData);
/*  86 */     nglCompressedTexSubImage1DARB(target, level, xoffset, width, format, pData.remaining(), pData, pData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage1DARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*     */   public static void glCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, long pData_buffer_offset) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexSubImage1DARB_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  94 */     nglCompressedTexSubImage1DARBBO(target, level, xoffset, width, format, imageSize, pData_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage1DARBBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer pData) {
/*  99 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 100 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexSubImage2DARB_pointer;
/* 101 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 102 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 103 */     BufferChecks.checkDirect(pData);
/* 104 */     nglCompressedTexSubImage2DARB(target, level, xoffset, yoffset, width, height, format, pData.remaining(), pData, pData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage2DARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ByteBuffer paramByteBuffer, int paramInt9, long paramLong);
/*     */   public static void glCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long pData_buffer_offset) {
/* 108 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 109 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexSubImage2DARB_pointer;
/* 110 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 111 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 112 */     nglCompressedTexSubImage2DARBBO(target, level, xoffset, yoffset, width, height, format, imageSize, pData_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage2DARBBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer pData) {
/* 117 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 118 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexSubImage3DARB_pointer;
/* 119 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 120 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 121 */     BufferChecks.checkDirect(pData);
/* 122 */     nglCompressedTexSubImage3DARB(target, level, xoffset, yoffset, zoffset, width, height, depth, format, pData.remaining(), pData, pData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage3DARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, ByteBuffer paramByteBuffer, int paramInt11, long paramLong);
/*     */   public static void glCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long pData_buffer_offset) {
/* 126 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 127 */     long function_pointer = caps.ARB_texture_compression_glCompressedTexSubImage3DARB_pointer;
/* 128 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 129 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 130 */     nglCompressedTexSubImage3DARBBO(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, pData_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglCompressedTexSubImage3DARBBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glGetCompressedTexImageARB(int target, int lod, ByteBuffer pImg) {
/* 135 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 136 */     long function_pointer = caps.ARB_texture_compression_glGetCompressedTexImageARB_pointer;
/* 137 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 138 */     GLChecks.ensurePackPBOdisabled(caps);
/* 139 */     BufferChecks.checkDirect(pImg);
/* 140 */     nglGetCompressedTexImageARB(target, lod, pImg, pImg.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetCompressedTexImageARB(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   public static void glGetCompressedTexImageARB(int target, int lod, long pImg_buffer_offset) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.ARB_texture_compression_glGetCompressedTexImageARB_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     GLChecks.ensurePackPBOenabled(caps);
/* 148 */     nglGetCompressedTexImageARBBO(target, lod, pImg_buffer_offset, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetCompressedTexImageARBBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBTextureCompression.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */