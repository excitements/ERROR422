/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
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
/*     */ public final class EXTTransformFeedback
/*     */ {
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 35982;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 35972;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT = 35973;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 35983;
/*     */   public static final int GL_INTERLEAVED_ATTRIBS_EXT = 35980;
/*     */   public static final int GL_SEPARATE_ATTRIBS_EXT = 35981;
/*     */   public static final int GL_PRIMITIVES_GENERATED_EXT = 35975;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 35976;
/*     */   public static final int GL_RASTERIZER_DISCARD_EXT = 35977;
/*     */   public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 35978;
/*     */   public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT = 35979;
/*     */   public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT = 35968;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_EXT = 35971;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT = 35967;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 35958;
/*     */   
/*     */   private static native void nglBindBufferRangeEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glBindBufferRangeEXT(int target, int index, int buffer, long offset, long size) {
/*  65 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  66 */     long function_pointer = caps.EXT_transform_feedback_glBindBufferRangeEXT_pointer;
/*  67 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  68 */     nglBindBufferRangeEXT(target, index, buffer, offset, size, function_pointer);
/*     */   }
/*     */   private static native void nglBindBufferOffsetEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glBindBufferOffsetEXT(int target, int index, int buffer, long offset) {
/*  73 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  74 */     long function_pointer = caps.EXT_transform_feedback_glBindBufferOffsetEXT_pointer;
/*  75 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  76 */     nglBindBufferOffsetEXT(target, index, buffer, offset, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBindBufferBaseEXT(int target, int index, int buffer) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.EXT_transform_feedback_glBindBufferBaseEXT_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     nglBindBufferBaseEXT(target, index, buffer, function_pointer);
/*     */   }
/*     */   private static native void nglBindBufferBaseEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glBeginTransformFeedbackEXT(int primitiveMode) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.EXT_transform_feedback_glBeginTransformFeedbackEXT_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     nglBeginTransformFeedbackEXT(primitiveMode, function_pointer);
/*     */   }
/*     */   private static native void nglBeginTransformFeedbackEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static void glEndTransformFeedbackEXT() {
/*  97 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  98 */     long function_pointer = caps.EXT_transform_feedback_glEndTransformFeedbackEXT_pointer;
/*  99 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 100 */     nglEndTransformFeedbackEXT(function_pointer);
/*     */   }
/*     */   private static native void nglEndTransformFeedbackEXT(long paramLong);
/*     */   
/*     */   public static void glTransformFeedbackVaryingsEXT(int program, int count, ByteBuffer varyings, int bufferMode) {
/* 105 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 106 */     long function_pointer = caps.EXT_transform_feedback_glTransformFeedbackVaryingsEXT_pointer;
/* 107 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 108 */     BufferChecks.checkDirect(varyings);
/* 109 */     BufferChecks.checkNullTerminated(varyings, count);
/* 110 */     nglTransformFeedbackVaryingsEXT(program, count, varyings, varyings.position(), bufferMode, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglTransformFeedbackVaryingsEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glTransformFeedbackVaryingsEXT(int program, CharSequence[] varyings, int bufferMode) {
/* 116 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 117 */     long function_pointer = caps.EXT_transform_feedback_glTransformFeedbackVaryingsEXT_pointer;
/* 118 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 119 */     nglTransformFeedbackVaryingsEXT(program, varyings.length, APIUtils.getBufferNT(varyings), 0, bufferMode, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGetTransformFeedbackVaryingEXT(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
/* 123 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 124 */     long function_pointer = caps.EXT_transform_feedback_glGetTransformFeedbackVaryingEXT_pointer;
/* 125 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 126 */     if (length != null)
/* 127 */       BufferChecks.checkBuffer(length, 1); 
/* 128 */     BufferChecks.checkBuffer(size, 1);
/* 129 */     BufferChecks.checkBuffer(type, 1);
/* 130 */     BufferChecks.checkDirect(name);
/* 131 */     nglGetTransformFeedbackVaryingEXT(program, index, name.remaining(), length, (length != null) ? length.position() : 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetTransformFeedbackVaryingEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, IntBuffer paramIntBuffer3, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*     */   
/*     */   public static String glGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
/* 137 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 138 */     long function_pointer = caps.EXT_transform_feedback_glGetTransformFeedbackVaryingEXT_pointer;
/* 139 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 140 */     BufferChecks.checkBuffer(size, 1);
/* 141 */     BufferChecks.checkBuffer(type, 1);
/* 142 */     IntBuffer name_length = APIUtils.getLengths();
/* 143 */     ByteBuffer name = APIUtils.getBufferByte(bufSize);
/* 144 */     nglGetTransformFeedbackVaryingEXT(program, index, bufSize, name_length, 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/* 145 */     name.limit(name_length.get(0));
/* 146 */     return APIUtils.getString(name);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTTransformFeedback.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */