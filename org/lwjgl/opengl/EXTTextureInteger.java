/*     */ package org.lwjgl.opengl;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class EXTTextureInteger
/*     */ {
/*     */   public static final int GL_RGBA_INTEGER_MODE_EXT = 36254;
/*     */   public static final int GL_RGBA32UI_EXT = 36208;
/*     */   public static final int GL_RGB32UI_EXT = 36209;
/*     */   public static final int GL_ALPHA32UI_EXT = 36210;
/*     */   public static final int GL_INTENSITY32UI_EXT = 36211;
/*     */   public static final int GL_LUMINANCE32UI_EXT = 36212;
/*     */   public static final int GL_LUMINANCE_ALPHA32UI_EXT = 36213;
/*     */   public static final int GL_RGBA16UI_EXT = 36214;
/*     */   public static final int GL_RGB16UI_EXT = 36215;
/*     */   public static final int GL_ALPHA16UI_EXT = 36216;
/*     */   public static final int GL_INTENSITY16UI_EXT = 36217;
/*     */   public static final int GL_LUMINANCE16UI_EXT = 36218;
/*     */   public static final int GL_LUMINANCE_ALPHA16UI_EXT = 36219;
/*     */   public static final int GL_RGBA8UI_EXT = 36220;
/*     */   public static final int GL_RGB8UI_EXT = 36221;
/*     */   public static final int GL_ALPHA8UI_EXT = 36222;
/*     */   public static final int GL_INTENSITY8UI_EXT = 36223;
/*     */   public static final int GL_LUMINANCE8UI_EXT = 36224;
/*     */   public static final int GL_LUMINANCE_ALPHA8UI_EXT = 36225;
/*     */   public static final int GL_RGBA32I_EXT = 36226;
/*     */   public static final int GL_RGB32I_EXT = 36227;
/*     */   public static final int GL_ALPHA32I_EXT = 36228;
/*     */   public static final int GL_INTENSITY32I_EXT = 36229;
/*     */   public static final int GL_LUMINANCE32I_EXT = 36230;
/*     */   public static final int GL_LUMINANCE_ALPHA32I_EXT = 36231;
/*     */   public static final int GL_RGBA16I_EXT = 36232;
/*     */   public static final int GL_RGB16I_EXT = 36233;
/*     */   public static final int GL_ALPHA16I_EXT = 36234;
/*     */   public static final int GL_INTENSITY16I_EXT = 36235;
/*     */   public static final int GL_LUMINANCE16I_EXT = 36236;
/*     */   public static final int GL_LUMINANCE_ALPHA16I_EXT = 36237;
/*     */   public static final int GL_RGBA8I_EXT = 36238;
/*     */   public static final int GL_RGB8I_EXT = 36239;
/*     */   public static final int GL_ALPHA8I_EXT = 36240;
/*     */   public static final int GL_INTENSITY8I_EXT = 36241;
/*     */   public static final int GL_LUMINANCE8I_EXT = 36242;
/*     */   public static final int GL_LUMINANCE_ALPHA8I_EXT = 36243;
/*     */   public static final int GL_RED_INTEGER_EXT = 36244;
/*     */   public static final int GL_GREEN_INTEGER_EXT = 36245;
/*     */   public static final int GL_BLUE_INTEGER_EXT = 36246;
/*     */   public static final int GL_ALPHA_INTEGER_EXT = 36247;
/*     */   public static final int GL_RGB_INTEGER_EXT = 36248;
/*     */   public static final int GL_RGBA_INTEGER_EXT = 36249;
/*     */   public static final int GL_BGR_INTEGER_EXT = 36250;
/*     */   public static final int GL_BGRA_INTEGER_EXT = 36251;
/*     */   public static final int GL_LUMINANCE_INTEGER_EXT = 36252;
/*     */   public static final int GL_LUMINANCE_ALPHA_INTEGER_EXT = 36253;
/*     */   
/*     */   private static native void nglClearColorIiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glClearColorIiEXT(int r, int g, int b, int a) {
/*  76 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  77 */     long function_pointer = caps.EXT_texture_integer_glClearColorIiEXT_pointer;
/*  78 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  79 */     nglClearColorIiEXT(r, g, b, a, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glClearColorIuiEXT(int r, int g, int b, int a) {
/*  84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  85 */     long function_pointer = caps.EXT_texture_integer_glClearColorIuiEXT_pointer;
/*  86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  87 */     nglClearColorIuiEXT(r, g, b, a, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glTexParameterIEXT(int target, int pname, IntBuffer params) {
/*  92 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  93 */     long function_pointer = caps.EXT_texture_integer_glTexParameterIivEXT_pointer;
/*  94 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  95 */     BufferChecks.checkBuffer(params, 4);
/*  96 */     nglTexParameterIivEXT(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglClearColorIuiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   private static native void nglTexParameterIivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glTexParameterIiEXT(int target, int pname, int param) {
/* 102 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 103 */     long function_pointer = caps.EXT_texture_integer_glTexParameterIivEXT_pointer;
/* 104 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 105 */     nglTexParameterIivEXT(target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glTexParameterIuEXT(int target, int pname, IntBuffer params) {
/* 109 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 110 */     long function_pointer = caps.EXT_texture_integer_glTexParameterIuivEXT_pointer;
/* 111 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 112 */     BufferChecks.checkBuffer(params, 4);
/* 113 */     nglTexParameterIuivEXT(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglTexParameterIuivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glTexParameterIuiEXT(int target, int pname, int param) {
/* 119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 120 */     long function_pointer = caps.EXT_texture_integer_glTexParameterIuivEXT_pointer;
/* 121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 122 */     nglTexParameterIuivEXT(target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGetTexParameterIEXT(int target, int pname, IntBuffer params) {
/* 126 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 127 */     long function_pointer = caps.EXT_texture_integer_glGetTexParameterIivEXT_pointer;
/* 128 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 129 */     BufferChecks.checkBuffer(params, 4);
/* 130 */     nglGetTexParameterIivEXT(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetTexParameterIivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetTexParameterIiEXT(int target, int pname) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.EXT_texture_integer_glGetTexParameterIivEXT_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     IntBuffer params = APIUtils.getBufferInt();
/* 140 */     nglGetTexParameterIivEXT(target, pname, params, params.position(), function_pointer);
/* 141 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetTexParameterIuEXT(int target, int pname, IntBuffer params) {
/* 145 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 146 */     long function_pointer = caps.EXT_texture_integer_glGetTexParameterIuivEXT_pointer;
/* 147 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 148 */     BufferChecks.checkBuffer(params, 4);
/* 149 */     nglGetTexParameterIuivEXT(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetTexParameterIuivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetTexParameterIuiEXT(int target, int pname) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.EXT_texture_integer_glGetTexParameterIuivEXT_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     IntBuffer params = APIUtils.getBufferInt();
/* 159 */     nglGetTexParameterIuivEXT(target, pname, params, params.position(), function_pointer);
/* 160 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTTextureInteger.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */