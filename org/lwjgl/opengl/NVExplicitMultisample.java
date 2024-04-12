/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
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
/*     */ public final class NVExplicitMultisample
/*     */ {
/*     */   public static final int GL_SAMPLE_POSITION_NV = 36432;
/*     */   public static final int GL_SAMPLE_MASK_NV = 36433;
/*     */   public static final int GL_SAMPLE_MASK_VALUE_NV = 36434;
/*     */   public static final int GL_TEXTURE_BINDING_RENDERBUFFER_NV = 36435;
/*     */   public static final int GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV = 36436;
/*     */   public static final int GL_MAX_SAMPLE_MASK_WORDS_NV = 36441;
/*     */   public static final int GL_TEXTURE_RENDERBUFFER_NV = 36437;
/*     */   public static final int GL_SAMPLER_RENDERBUFFER_NV = 36438;
/*     */   public static final int GL_INT_SAMPLER_RENDERBUFFER_NV = 36439;
/*     */   public static final int GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV = 36440;
/*     */   
/*     */   public static void glGetBooleanIndexedEXT(int pname, int index, ByteBuffer data) {
/*  48 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  49 */     long function_pointer = caps.NV_explicit_multisample_glGetBooleanIndexedvEXT_pointer;
/*  50 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  51 */     BufferChecks.checkBuffer(data, 16);
/*  52 */     nglGetBooleanIndexedvEXT(pname, index, data, data.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetBooleanIndexedvEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static boolean glGetBooleanIndexedEXT(int pname, int index) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.NV_explicit_multisample_glGetBooleanIndexedvEXT_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     ByteBuffer data = APIUtils.getBufferByte(1);
/*  62 */     nglGetBooleanIndexedvEXT(pname, index, data, data.position(), function_pointer);
/*  63 */     return (data.get(0) == 1);
/*     */   }
/*     */   
/*     */   public static void glGetIntegerIndexedEXT(int pname, int index, IntBuffer data) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.NV_explicit_multisample_glGetIntegerIndexedvEXT_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     BufferChecks.checkBuffer(data, 16);
/*  71 */     nglGetIntegerIndexedvEXT(pname, index, data, data.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetIntegerIndexedvEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetIntegerIndexedEXT(int pname, int index) {
/*  77 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  78 */     long function_pointer = caps.NV_explicit_multisample_glGetIntegerIndexedvEXT_pointer;
/*  79 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  80 */     IntBuffer data = APIUtils.getBufferInt();
/*  81 */     nglGetIntegerIndexedvEXT(pname, index, data, data.position(), function_pointer);
/*  82 */     return data.get(0);
/*     */   }
/*     */   private static native void nglGetMultisamplefvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   public static void glGetMultisampleNV(int pname, int index, FloatBuffer val) {
/*  86 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  87 */     long function_pointer = caps.NV_explicit_multisample_glGetMultisamplefvNV_pointer;
/*  88 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  89 */     BufferChecks.checkBuffer(val, 2);
/*  90 */     nglGetMultisamplefvNV(pname, index, val, val.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glSampleMaskIndexedNV(int index, int mask) {
/*  95 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  96 */     long function_pointer = caps.NV_explicit_multisample_glSampleMaskIndexedNV_pointer;
/*  97 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  98 */     nglSampleMaskIndexedNV(index, mask, function_pointer);
/*     */   }
/*     */   private static native void nglSampleMaskIndexedNV(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexRenderbufferNV(int target, int renderbuffer) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.NV_explicit_multisample_glTexRenderbufferNV_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     nglTexRenderbufferNV(target, renderbuffer, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglTexRenderbufferNV(int paramInt1, int paramInt2, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVExplicitMultisample.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */