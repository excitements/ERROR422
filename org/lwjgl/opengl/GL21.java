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
/*     */ public final class GL21
/*     */ {
/*     */   public static final int GL_FLOAT_MAT2x3 = 35685;
/*     */   public static final int GL_FLOAT_MAT2x4 = 35686;
/*     */   public static final int GL_FLOAT_MAT3x2 = 35687;
/*     */   public static final int GL_FLOAT_MAT3x4 = 35688;
/*     */   public static final int GL_FLOAT_MAT4x2 = 35689;
/*     */   public static final int GL_FLOAT_MAT4x3 = 35690;
/*     */   public static final int GL_PIXEL_PACK_BUFFER = 35051;
/*     */   public static final int GL_PIXEL_UNPACK_BUFFER = 35052;
/*     */   public static final int GL_PIXEL_PACK_BUFFER_BINDING = 35053;
/*     */   public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 35055;
/*     */   public static final int GL_SRGB = 35904;
/*     */   public static final int GL_SRGB8 = 35905;
/*     */   public static final int GL_SRGB_ALPHA = 35906;
/*     */   public static final int GL_SRGB8_ALPHA8 = 35907;
/*     */   public static final int GL_SLUMINANCE_ALPHA = 35908;
/*     */   public static final int GL_SLUMINANCE8_ALPHA8 = 35909;
/*     */   public static final int GL_SLUMINANCE = 35910;
/*     */   public static final int GL_SLUMINANCE8 = 35911;
/*     */   public static final int GL_COMPRESSED_SRGB = 35912;
/*     */   public static final int GL_COMPRESSED_SRGB_ALPHA = 35913;
/*     */   public static final int GL_COMPRESSED_SLUMINANCE = 35914;
/*     */   public static final int GL_COMPRESSED_SLUMINANCE_ALPHA = 35915;
/*     */   public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 33887;
/*     */   
/*     */   private static native void nglUniformMatrix2x3fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2x3(int location, boolean transpose, FloatBuffer matrices) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.GL21_glUniformMatrix2x3fv_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     BufferChecks.checkDirect(matrices);
/*  62 */     nglUniformMatrix2x3fv(location, matrices.remaining() / 6, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3x2fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3x2(int location, boolean transpose, FloatBuffer matrices) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.GL21_glUniformMatrix3x2fv_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     BufferChecks.checkDirect(matrices);
/*  71 */     nglUniformMatrix3x2fv(location, matrices.remaining() / 6, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x4(int location, boolean transpose, FloatBuffer matrices) {
/*  76 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  77 */     long function_pointer = caps.GL21_glUniformMatrix2x4fv_pointer;
/*  78 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  79 */     BufferChecks.checkDirect(matrices);
/*  80 */     nglUniformMatrix2x4fv(location, matrices.remaining() >> 3, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2x4fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4x2(int location, boolean transpose, FloatBuffer matrices) {
/*  85 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  86 */     long function_pointer = caps.GL21_glUniformMatrix4x2fv_pointer;
/*  87 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  88 */     BufferChecks.checkDirect(matrices);
/*  89 */     nglUniformMatrix4x2fv(location, matrices.remaining() >> 3, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4x2fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3x4(int location, boolean transpose, FloatBuffer matrices) {
/*  94 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  95 */     long function_pointer = caps.GL21_glUniformMatrix3x4fv_pointer;
/*  96 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  97 */     BufferChecks.checkDirect(matrices);
/*  98 */     nglUniformMatrix3x4fv(location, matrices.remaining() / 12, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3x4fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4x3(int location, boolean transpose, FloatBuffer matrices) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.GL21_glUniformMatrix4x3fv_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     BufferChecks.checkDirect(matrices);
/* 107 */     nglUniformMatrix4x3fv(location, matrices.remaining() / 12, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglUniformMatrix4x3fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL21.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */