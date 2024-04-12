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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NVTransformFeedback
/*     */ {
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 35982;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 35972;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = 35973;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_RECORD_NV = 35974;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 35983;
/*     */   public static final int GL_INTERLEAVED_ATTRIBS_NV = 35980;
/*     */   public static final int GL_SEPARATE_ATTRIBS_NV = 35981;
/*     */   public static final int GL_PRIMITIVES_GENERATED_NV = 35975;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 35976;
/*     */   public static final int GL_RASTERIZER_DISCARD_NV = 35977;
/*     */   public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 35978;
/*     */   public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = 35979;
/*     */   public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = 35968;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = 35966;
/*     */   public static final int GL_ACTIVE_VARYINGS_NV = 35969;
/*     */   public static final int GL_ACTIVE_VARYING_MAX_LENGTH_NV = 35970;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 35971;
/*     */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 35967;
/*     */   public static final int GL_BACK_PRIMARY_COLOR_NV = 35959;
/*     */   public static final int GL_BACK_SECONDARY_COLOR_NV = 35960;
/*     */   public static final int GL_TEXTURE_COORD_NV = 35961;
/*     */   public static final int GL_CLIP_DISTANCE_NV = 35962;
/*     */   public static final int GL_VERTEX_ID_NV = 35963;
/*     */   public static final int GL_PRIMITIVE_ID_NV = 35964;
/*     */   public static final int GL_GENERIC_ATTRIB_NV = 35965;
/*     */   public static final int GL_LAYER_NV = 36266;
/*     */   
/*     */   private static native void nglBindBufferRangeNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glBindBufferRangeNV(int target, int index, int buffer, long offset, long size) {
/*  84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  85 */     long function_pointer = caps.NV_transform_feedback_glBindBufferRangeNV_pointer;
/*  86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  87 */     nglBindBufferRangeNV(target, index, buffer, offset, size, function_pointer);
/*     */   }
/*     */   private static native void nglBindBufferOffsetNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glBindBufferOffsetNV(int target, int index, int buffer, long offset) {
/*  92 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  93 */     long function_pointer = caps.NV_transform_feedback_glBindBufferOffsetNV_pointer;
/*  94 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  95 */     nglBindBufferOffsetNV(target, index, buffer, offset, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBindBufferBaseNV(int target, int index, int buffer) {
/* 100 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 101 */     long function_pointer = caps.NV_transform_feedback_glBindBufferBaseNV_pointer;
/* 102 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 103 */     nglBindBufferBaseNV(target, index, buffer, function_pointer);
/*     */   }
/*     */   private static native void nglBindBufferBaseNV(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glTransformFeedbackAttribsNV(IntBuffer attribs, int bufferMode) {
/* 108 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 109 */     long function_pointer = caps.NV_transform_feedback_glTransformFeedbackAttribsNV_pointer;
/* 110 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 111 */     BufferChecks.checkDirect(attribs);
/* 112 */     nglTransformFeedbackAttribsNV(attribs.remaining(), attribs, attribs.position(), bufferMode, function_pointer);
/*     */   }
/*     */   private static native void nglTransformFeedbackAttribsNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glTransformFeedbackVaryingsNV(int program, IntBuffer locations, int bufferMode) {
/* 117 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 118 */     long function_pointer = caps.NV_transform_feedback_glTransformFeedbackVaryingsNV_pointer;
/* 119 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 120 */     BufferChecks.checkDirect(locations);
/* 121 */     nglTransformFeedbackVaryingsNV(program, locations.remaining(), locations, locations.position(), bufferMode, function_pointer);
/*     */   }
/*     */   private static native void nglTransformFeedbackVaryingsNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glBeginTransformFeedbackNV(int primitiveMode) {
/* 126 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 127 */     long function_pointer = caps.NV_transform_feedback_glBeginTransformFeedbackNV_pointer;
/* 128 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 129 */     nglBeginTransformFeedbackNV(primitiveMode, function_pointer);
/*     */   }
/*     */   private static native void nglBeginTransformFeedbackNV(int paramInt, long paramLong);
/*     */   
/*     */   public static void glEndTransformFeedbackNV() {
/* 134 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 135 */     long function_pointer = caps.NV_transform_feedback_glEndTransformFeedbackNV_pointer;
/* 136 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 137 */     nglEndTransformFeedbackNV(function_pointer);
/*     */   }
/*     */   private static native void nglEndTransformFeedbackNV(long paramLong);
/*     */   
/*     */   public static int glGetVaryingLocationNV(int program, ByteBuffer name) {
/* 142 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 143 */     long function_pointer = caps.NV_transform_feedback_glGetVaryingLocationNV_pointer;
/* 144 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 145 */     BufferChecks.checkDirect(name);
/* 146 */     BufferChecks.checkNullTerminated(name);
/* 147 */     int __result = nglGetVaryingLocationNV(program, name, name.position(), function_pointer);
/* 148 */     return __result;
/*     */   }
/*     */   
/*     */   private static native int nglGetVaryingLocationNV(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGetVaryingLocationNV(int program, CharSequence name) {
/* 154 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 155 */     long function_pointer = caps.NV_transform_feedback_glGetVaryingLocationNV_pointer;
/* 156 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 157 */     int __result = nglGetVaryingLocationNV(program, APIUtils.getBufferNT(name), 0, function_pointer);
/* 158 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGetActiveVaryingNV(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.NV_transform_feedback_glGetActiveVaryingNV_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     if (length != null)
/* 166 */       BufferChecks.checkBuffer(length, 1); 
/* 167 */     BufferChecks.checkBuffer(size, 1);
/* 168 */     BufferChecks.checkBuffer(type, 1);
/* 169 */     BufferChecks.checkDirect(name);
/* 170 */     nglGetActiveVaryingNV(program, index, name.remaining(), length, (length != null) ? length.position() : 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   private static native void nglGetActiveVaryingNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, IntBuffer paramIntBuffer3, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*     */ 
/*     */   
/*     */   public static String glGetActiveVaryingNV(int program, int index, int bufSize, IntBuffer sizeType) {
/* 178 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 179 */     long function_pointer = caps.NV_transform_feedback_glGetActiveVaryingNV_pointer;
/* 180 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 181 */     BufferChecks.checkBuffer(sizeType, 2);
/* 182 */     IntBuffer name_length = APIUtils.getLengths();
/* 183 */     ByteBuffer name = APIUtils.getBufferByte(bufSize);
/* 184 */     nglGetActiveVaryingNV(program, index, bufSize, name_length, 0, sizeType, sizeType.position(), sizeType, sizeType.position() + 1, name, name.position(), function_pointer);
/* 185 */     name.limit(name_length.get(0));
/* 186 */     return APIUtils.getString(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetActiveVaryingNV(int program, int index, int bufSize) {
/* 193 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 194 */     long function_pointer = caps.NV_transform_feedback_glGetActiveVaryingNV_pointer;
/* 195 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 196 */     IntBuffer name_length = APIUtils.getLengths();
/* 197 */     ByteBuffer name = APIUtils.getBufferByte(bufSize);
/* 198 */     nglGetActiveVaryingNV(program, index, bufSize, name_length, 0, APIUtils.getBufferInt(), 0, APIUtils.getBufferInt(), 1, name, name.position(), function_pointer);
/* 199 */     name.limit(name_length.get(0));
/* 200 */     return APIUtils.getString(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetActiveVaryingSizeNV(int program, int index) {
/* 207 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 208 */     long function_pointer = caps.NV_transform_feedback_glGetActiveVaryingNV_pointer;
/* 209 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 210 */     IntBuffer size = APIUtils.getBufferInt();
/* 211 */     nglGetActiveVaryingNV(program, index, 0, null, 0, size, size.position(), size, 1, APIUtils.getBufferByte(0), 0, function_pointer);
/* 212 */     return size.get(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetActiveVaryingTypeNV(int program, int index) {
/* 219 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 220 */     long function_pointer = caps.NV_transform_feedback_glGetActiveVaryingNV_pointer;
/* 221 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 222 */     IntBuffer type = APIUtils.getBufferInt();
/* 223 */     nglGetActiveVaryingNV(program, index, 0, null, 0, type, 1, type, type.position(), APIUtils.getBufferByte(0), 0, function_pointer);
/* 224 */     return type.get(0);
/*     */   }
/*     */   
/*     */   public static void glActiveVaryingNV(int program, ByteBuffer name) {
/* 228 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 229 */     long function_pointer = caps.NV_transform_feedback_glActiveVaryingNV_pointer;
/* 230 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 231 */     BufferChecks.checkDirect(name);
/* 232 */     BufferChecks.checkNullTerminated(name);
/* 233 */     nglActiveVaryingNV(program, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglActiveVaryingNV(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glActiveVaryingNV(int program, CharSequence name) {
/* 239 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 240 */     long function_pointer = caps.NV_transform_feedback_glActiveVaryingNV_pointer;
/* 241 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 242 */     nglActiveVaryingNV(program, APIUtils.getBufferNT(name), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGetTransformFeedbackVaryingNV(int program, int index, IntBuffer location) {
/* 246 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 247 */     long function_pointer = caps.NV_transform_feedback_glGetTransformFeedbackVaryingNV_pointer;
/* 248 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 249 */     BufferChecks.checkBuffer(location, 1);
/* 250 */     nglGetTransformFeedbackVaryingNV(program, index, location, location.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetTransformFeedbackVaryingNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetTransformFeedbackVaryingNV(int program, int index) {
/* 256 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 257 */     long function_pointer = caps.NV_transform_feedback_glGetTransformFeedbackVaryingNV_pointer;
/* 258 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 259 */     IntBuffer location = APIUtils.getBufferInt();
/* 260 */     nglGetTransformFeedbackVaryingNV(program, index, location, location.position(), function_pointer);
/* 261 */     return location.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVTransformFeedback.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */