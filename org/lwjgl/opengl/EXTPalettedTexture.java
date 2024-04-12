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
/*     */ public final class EXTPalettedTexture
/*     */ {
/*     */   public static final int GL_COLOR_INDEX1_EXT = 32994;
/*     */   public static final int GL_COLOR_INDEX2_EXT = 32995;
/*     */   public static final int GL_COLOR_INDEX4_EXT = 32996;
/*     */   public static final int GL_COLOR_INDEX8_EXT = 32997;
/*     */   public static final int GL_COLOR_INDEX12_EXT = 32998;
/*     */   public static final int GL_COLOR_INDEX16_EXT = 32999;
/*     */   public static final int GL_COLOR_TABLE_FORMAT_EXT = 32984;
/*     */   public static final int GL_COLOR_TABLE_WIDTH_EXT = 32985;
/*     */   public static final int GL_COLOR_TABLE_RED_SIZE_EXT = 32986;
/*     */   public static final int GL_COLOR_TABLE_GREEN_SIZE_EXT = 32987;
/*     */   public static final int GL_COLOR_TABLE_BLUE_SIZE_EXT = 32988;
/*     */   public static final int GL_COLOR_TABLE_ALPHA_SIZE_EXT = 32989;
/*     */   public static final int GL_COLOR_TABLE_LUMINANCE_SIZE_EXT = 32990;
/*     */   public static final int GL_COLOR_TABLE_INTENSITY_SIZE_EXT = 32991;
/*     */   public static final int GL_TEXTURE_INDEX_SIZE_EXT = 33005;
/*     */   
/*     */   public static void glColorTableEXT(int target, int internalFormat, int width, int format, int type, ByteBuffer data) {
/*  42 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  43 */     long function_pointer = caps.EXT_paletted_texture_glColorTableEXT_pointer;
/*  44 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  45 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, width, 1, 1));
/*  46 */     nglColorTableEXT(target, internalFormat, width, format, type, data, data.position(), function_pointer);
/*     */   }
/*     */   public static void glColorTableEXT(int target, int internalFormat, int width, int format, int type, DoubleBuffer data) {
/*  49 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  50 */     long function_pointer = caps.EXT_paletted_texture_glColorTableEXT_pointer;
/*  51 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  52 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, width, 1, 1));
/*  53 */     nglColorTableEXT(target, internalFormat, width, format, type, data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glColorTableEXT(int target, int internalFormat, int width, int format, int type, FloatBuffer data) {
/*  56 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  57 */     long function_pointer = caps.EXT_paletted_texture_glColorTableEXT_pointer;
/*  58 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  59 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, width, 1, 1));
/*  60 */     nglColorTableEXT(target, internalFormat, width, format, type, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glColorTableEXT(int target, int internalFormat, int width, int format, int type, IntBuffer data) {
/*  63 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  64 */     long function_pointer = caps.EXT_paletted_texture_glColorTableEXT_pointer;
/*  65 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  66 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, width, 1, 1));
/*  67 */     nglColorTableEXT(target, internalFormat, width, format, type, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glColorTableEXT(int target, int internalFormat, int width, int format, int type, ShortBuffer data) {
/*  70 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  71 */     long function_pointer = caps.EXT_paletted_texture_glColorTableEXT_pointer;
/*  72 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  73 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, width, 1, 1));
/*  74 */     nglColorTableEXT(target, internalFormat, width, format, type, data, data.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglColorTableEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glColorSubTableEXT(int target, int start, int count, int format, int type, ByteBuffer data) {
/*  79 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  80 */     long function_pointer = caps.EXT_paletted_texture_glColorSubTableEXT_pointer;
/*  81 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  82 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, count, 1, 1));
/*  83 */     nglColorSubTableEXT(target, start, count, format, type, data, data.position(), function_pointer);
/*     */   }
/*     */   public static void glColorSubTableEXT(int target, int start, int count, int format, int type, DoubleBuffer data) {
/*  86 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  87 */     long function_pointer = caps.EXT_paletted_texture_glColorSubTableEXT_pointer;
/*  88 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  89 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, count, 1, 1));
/*  90 */     nglColorSubTableEXT(target, start, count, format, type, data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glColorSubTableEXT(int target, int start, int count, int format, int type, FloatBuffer data) {
/*  93 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  94 */     long function_pointer = caps.EXT_paletted_texture_glColorSubTableEXT_pointer;
/*  95 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  96 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, count, 1, 1));
/*  97 */     nglColorSubTableEXT(target, start, count, format, type, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glColorSubTableEXT(int target, int start, int count, int format, int type, IntBuffer data) {
/* 100 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 101 */     long function_pointer = caps.EXT_paletted_texture_glColorSubTableEXT_pointer;
/* 102 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 103 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, count, 1, 1));
/* 104 */     nglColorSubTableEXT(target, start, count, format, type, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glColorSubTableEXT(int target, int start, int count, int format, int type, ShortBuffer data) {
/* 107 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 108 */     long function_pointer = caps.EXT_paletted_texture_glColorSubTableEXT_pointer;
/* 109 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 110 */     BufferChecks.checkBuffer(data, GLChecks.calculateImageStorage(data, format, type, count, 1, 1));
/* 111 */     nglColorSubTableEXT(target, start, count, format, type, data, data.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglColorSubTableEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glGetColorTableEXT(int target, int format, int type, ByteBuffer data) {
/* 116 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 117 */     long function_pointer = caps.EXT_paletted_texture_glGetColorTableEXT_pointer;
/* 118 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 119 */     BufferChecks.checkDirect(data);
/* 120 */     nglGetColorTableEXT(target, format, type, data, data.position(), function_pointer);
/*     */   }
/*     */   public static void glGetColorTableEXT(int target, int format, int type, DoubleBuffer data) {
/* 123 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 124 */     long function_pointer = caps.EXT_paletted_texture_glGetColorTableEXT_pointer;
/* 125 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 126 */     BufferChecks.checkDirect(data);
/* 127 */     nglGetColorTableEXT(target, format, type, data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glGetColorTableEXT(int target, int format, int type, FloatBuffer data) {
/* 130 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 131 */     long function_pointer = caps.EXT_paletted_texture_glGetColorTableEXT_pointer;
/* 132 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 133 */     BufferChecks.checkDirect(data);
/* 134 */     nglGetColorTableEXT(target, format, type, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glGetColorTableEXT(int target, int format, int type, IntBuffer data) {
/* 137 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 138 */     long function_pointer = caps.EXT_paletted_texture_glGetColorTableEXT_pointer;
/* 139 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 140 */     BufferChecks.checkDirect(data);
/* 141 */     nglGetColorTableEXT(target, format, type, data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glGetColorTableEXT(int target, int format, int type, ShortBuffer data) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.EXT_paletted_texture_glGetColorTableEXT_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     BufferChecks.checkDirect(data);
/* 148 */     nglGetColorTableEXT(target, format, type, data, data.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglGetColorTableEXT(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetColorTableParameterEXT(int target, int pname, IntBuffer params) {
/* 153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 154 */     long function_pointer = caps.EXT_paletted_texture_glGetColorTableParameterivEXT_pointer;
/* 155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 156 */     BufferChecks.checkBuffer(params, 4);
/* 157 */     nglGetColorTableParameterivEXT(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetColorTableParameterivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetColorTableParameterEXT(int target, int pname, FloatBuffer params) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.EXT_paletted_texture_glGetColorTableParameterfvEXT_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     BufferChecks.checkBuffer(params, 4);
/* 166 */     nglGetColorTableParameterfvEXT(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetColorTableParameterfvEXT(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTPalettedTexture.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */