/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.FloatBuffer;
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
/*     */ public final class ARBTextureMultisample
/*     */ {
/*     */   public static final int GL_SAMPLE_POSITION = 36432;
/*     */   public static final int GL_SAMPLE_MASK = 36433;
/*     */   public static final int GL_SAMPLE_MASK_VALUE = 36434;
/*     */   public static final int GL_TEXTURE_2D_MULTISAMPLE = 37120;
/*     */   public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 37121;
/*     */   public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 37122;
/*     */   public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 37123;
/*     */   public static final int GL_MAX_SAMPLE_MASK_WORDS = 36441;
/*     */   public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 37134;
/*     */   public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 37135;
/*     */   public static final int GL_MAX_INTEGER_SAMPLES = 37136;
/*     */   public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 37124;
/*     */   public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 37125;
/*     */   public static final int GL_TEXTURE_SAMPLES = 37126;
/*     */   public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 37127;
/*     */   public static final int GL_SAMPLER_2D_MULTISAMPLE = 37128;
/*     */   public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 37129;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 37130;
/*     */   public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 37131;
/*     */   public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37132;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37133;
/*     */   
/*     */   private static native void nglTexImage2DMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, long paramLong);
/*     */   
/*     */   public static void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
/*  73 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  74 */     long function_pointer = caps.ARB_texture_multisample_glTexImage2DMultisample_pointer;
/*  75 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  76 */     nglTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations, function_pointer);
/*     */   }
/*     */   private static native void nglTexImage3DMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, long paramLong);
/*     */   
/*     */   public static void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.ARB_texture_multisample_glTexImage3DMultisample_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     nglTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glGetMultisample(int pname, int index, FloatBuffer val) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.ARB_texture_multisample_glGetMultisamplefv_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     BufferChecks.checkBuffer(val, 2);
/*  93 */     nglGetMultisamplefv(pname, index, val, val.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetMultisamplefv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSampleMaski(int index, int mask) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.ARB_texture_multisample_glSampleMaski_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     nglSampleMaski(index, mask, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglSampleMaski(int paramInt1, int paramInt2, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBTextureMultisample.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */