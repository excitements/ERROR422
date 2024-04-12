/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ARBMultitexture
/*     */ {
/*     */   public static final int GL_TEXTURE0_ARB = 33984;
/*     */   public static final int GL_TEXTURE1_ARB = 33985;
/*     */   public static final int GL_TEXTURE2_ARB = 33986;
/*     */   public static final int GL_TEXTURE3_ARB = 33987;
/*     */   public static final int GL_TEXTURE4_ARB = 33988;
/*     */   public static final int GL_TEXTURE5_ARB = 33989;
/*     */   public static final int GL_TEXTURE6_ARB = 33990;
/*     */   public static final int GL_TEXTURE7_ARB = 33991;
/*     */   public static final int GL_TEXTURE8_ARB = 33992;
/*     */   public static final int GL_TEXTURE9_ARB = 33993;
/*     */   public static final int GL_TEXTURE10_ARB = 33994;
/*     */   public static final int GL_TEXTURE11_ARB = 33995;
/*     */   public static final int GL_TEXTURE12_ARB = 33996;
/*     */   public static final int GL_TEXTURE13_ARB = 33997;
/*     */   public static final int GL_TEXTURE14_ARB = 33998;
/*     */   public static final int GL_TEXTURE15_ARB = 33999;
/*     */   public static final int GL_TEXTURE16_ARB = 34000;
/*     */   public static final int GL_TEXTURE17_ARB = 34001;
/*     */   public static final int GL_TEXTURE18_ARB = 34002;
/*     */   public static final int GL_TEXTURE19_ARB = 34003;
/*     */   public static final int GL_TEXTURE20_ARB = 34004;
/*     */   public static final int GL_TEXTURE21_ARB = 34005;
/*     */   public static final int GL_TEXTURE22_ARB = 34006;
/*     */   public static final int GL_TEXTURE23_ARB = 34007;
/*     */   public static final int GL_TEXTURE24_ARB = 34008;
/*     */   public static final int GL_TEXTURE25_ARB = 34009;
/*     */   public static final int GL_TEXTURE26_ARB = 34010;
/*     */   public static final int GL_TEXTURE27_ARB = 34011;
/*     */   public static final int GL_TEXTURE28_ARB = 34012;
/*     */   public static final int GL_TEXTURE29_ARB = 34013;
/*     */   public static final int GL_TEXTURE30_ARB = 34014;
/*     */   public static final int GL_TEXTURE31_ARB = 34015;
/*     */   public static final int GL_ACTIVE_TEXTURE_ARB = 34016;
/*     */   public static final int GL_CLIENT_ACTIVE_TEXTURE_ARB = 34017;
/*     */   public static final int GL_MAX_TEXTURE_UNITS_ARB = 34018;
/*     */   
/*     */   private static native void nglClientActiveTextureARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glClientActiveTextureARB(int texture) {
/*  51 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  52 */     long function_pointer = caps.ARB_multitexture_glClientActiveTextureARB_pointer;
/*  53 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  54 */     nglClientActiveTextureARB(texture, function_pointer);
/*     */   }
/*     */   private static native void nglActiveTextureARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glActiveTextureARB(int texture) {
/*  59 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  60 */     long function_pointer = caps.ARB_multitexture_glActiveTextureARB_pointer;
/*  61 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  62 */     nglActiveTextureARB(texture, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glMultiTexCoord1fARB(int target, float s) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord1fARB_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     nglMultiTexCoord1fARB(target, s, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord1fARB(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord1dARB(int target, double s) {
/*  75 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  76 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord1dARB_pointer;
/*  77 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  78 */     nglMultiTexCoord1dARB(target, s, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord1dARB(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord1iARB(int target, int s) {
/*  83 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  84 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord1iARB_pointer;
/*  85 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  86 */     nglMultiTexCoord1iARB(target, s, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord1iARB(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord1sARB(int target, short s) {
/*  91 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  92 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord1sARB_pointer;
/*  93 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  94 */     nglMultiTexCoord1sARB(target, s, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord1sARB(int paramInt, short paramShort, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord2fARB(int target, float s, float t) {
/*  99 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 100 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord2fARB_pointer;
/* 101 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 102 */     nglMultiTexCoord2fARB(target, s, t, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord2fARB(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord2dARB(int target, double s, double t) {
/* 107 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 108 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord2dARB_pointer;
/* 109 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 110 */     nglMultiTexCoord2dARB(target, s, t, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord2dARB(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord2iARB(int target, int s, int t) {
/* 115 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 116 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord2iARB_pointer;
/* 117 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 118 */     nglMultiTexCoord2iARB(target, s, t, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord2iARB(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord2sARB(int target, short s, short t) {
/* 123 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 124 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord2sARB_pointer;
/* 125 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 126 */     nglMultiTexCoord2sARB(target, s, t, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord2sARB(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord3fARB(int target, float s, float t, float r) {
/* 131 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 132 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord3fARB_pointer;
/* 133 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 134 */     nglMultiTexCoord3fARB(target, s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord3fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord3dARB(int target, double s, double t, double r) {
/* 139 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 140 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord3dARB_pointer;
/* 141 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 142 */     nglMultiTexCoord3dARB(target, s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord3dARB(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord3iARB(int target, int s, int t, int r) {
/* 147 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 148 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord3iARB_pointer;
/* 149 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 150 */     nglMultiTexCoord3iARB(target, s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord3iARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord3sARB(int target, short s, short t, short r) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord3sARB_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     nglMultiTexCoord3sARB(target, s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord3sARB(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord4fARB(int target, float s, float t, float r, float q) {
/* 163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 164 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord4fARB_pointer;
/* 165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 166 */     nglMultiTexCoord4fARB(target, s, t, r, q, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord4fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord4dARB(int target, double s, double t, double r, double q) {
/* 171 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 172 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord4dARB_pointer;
/* 173 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 174 */     nglMultiTexCoord4dARB(target, s, t, r, q, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord4dARB(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord4iARB(int target, int s, int t, int r, int q) {
/* 179 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 180 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord4iARB_pointer;
/* 181 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 182 */     nglMultiTexCoord4iARB(target, s, t, r, q, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord4iARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord4sARB(int target, short s, short t, short r, short q) {
/* 187 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 188 */     long function_pointer = caps.ARB_multitexture_glMultiTexCoord4sARB_pointer;
/* 189 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 190 */     nglMultiTexCoord4sARB(target, s, t, r, q, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglMultiTexCoord4sARB(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBMultitexture.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */