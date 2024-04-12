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
/*     */ public final class ARBUniformBufferObject
/*     */ {
/*     */   public static final int GL_UNIFORM_BUFFER = 35345;
/*     */   public static final int GL_UNIFORM_BUFFER_BINDING = 35368;
/*     */   public static final int GL_UNIFORM_BUFFER_START = 35369;
/*     */   public static final int GL_UNIFORM_BUFFER_SIZE = 35370;
/*     */   public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371;
/*     */   public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 35372;
/*     */   public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373;
/*     */   public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374;
/*     */   public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375;
/*     */   public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 35376;
/*     */   public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377;
/*     */   public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 35378;
/*     */   public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379;
/*     */   public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380;
/*     */   public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381;
/*     */   public static final int GL_ACTIVE_UNIFORM_BLOCKS = 35382;
/*     */   public static final int GL_UNIFORM_TYPE = 35383;
/*     */   public static final int GL_UNIFORM_SIZE = 35384;
/*     */   public static final int GL_UNIFORM_NAME_LENGTH = 35385;
/*     */   public static final int GL_UNIFORM_BLOCK_INDEX = 35386;
/*     */   public static final int GL_UNIFORM_OFFSET = 35387;
/*     */   public static final int GL_UNIFORM_ARRAY_STRIDE = 35388;
/*     */   public static final int GL_UNIFORM_MATRIX_STRIDE = 35389;
/*     */   public static final int GL_UNIFORM_IS_ROW_MAJOR = 35390;
/*     */   public static final int GL_UNIFORM_BLOCK_BINDING = 35391;
/*     */   public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 35392;
/*     */   public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 35393;
/*     */   public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394;
/*     */   public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 35397;
/*     */   public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398;
/*     */   public static final int GL_INVALID_INDEX = -1;
/*     */   
/*     */   public static void glGetUniformIndices(int program, ByteBuffer uniformNames, IntBuffer uniformIndices) {
/*  77 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  78 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetUniformIndices_pointer;
/*  79 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  80 */     BufferChecks.checkDirect(uniformNames);
/*  81 */     BufferChecks.checkNullTerminated(uniformNames, uniformIndices.remaining());
/*  82 */     BufferChecks.checkDirect(uniformIndices);
/*  83 */     nglGetUniformIndices(program, uniformIndices.remaining(), uniformNames, uniformNames.position(), uniformIndices, uniformIndices.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetUniformIndices(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetUniformIndices_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     BufferChecks.checkBuffer(uniformIndices, uniformNames.length);
/*  93 */     nglGetUniformIndices(program, uniformNames.length, APIUtils.getBufferNT(uniformNames), 0, uniformIndices, uniformIndices.position(), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniforms(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
/*  97 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  98 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformsiv_pointer;
/*  99 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 100 */     BufferChecks.checkDirect(uniformIndices);
/* 101 */     BufferChecks.checkBuffer(params, uniformIndices.remaining());
/* 102 */     nglGetActiveUniformsiv(program, uniformIndices.remaining(), uniformIndices, uniformIndices.position(), pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformsiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, int paramInt3, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, long paramLong);
/*     */   
/*     */   public static int glGetActiveUniforms(int program, int uniformIndex, int pname) {
/* 108 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 109 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformsiv_pointer;
/* 110 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 111 */     IntBuffer params = APIUtils.getBufferInt();
/* 112 */     nglGetActiveUniformsiv(program, 1, params.put(1, uniformIndex), 1, pname, params, params.position(), function_pointer);
/* 113 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName) {
/* 117 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 118 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformName_pointer;
/* 119 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 120 */     if (length != null)
/* 121 */       BufferChecks.checkBuffer(length, 1); 
/* 122 */     BufferChecks.checkDirect(uniformName);
/* 123 */     nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), length, (length != null) ? length.position() : 0, uniformName, uniformName.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformName(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, ByteBuffer paramByteBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
/* 129 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 130 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformName_pointer;
/* 131 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 132 */     IntBuffer uniformName_length = APIUtils.getLengths();
/* 133 */     ByteBuffer uniformName = APIUtils.getBufferByte(bufSize);
/* 134 */     nglGetActiveUniformName(program, uniformIndex, bufSize, uniformName_length, 0, uniformName, uniformName.position(), function_pointer);
/* 135 */     uniformName.limit(uniformName_length.get(0));
/* 136 */     return APIUtils.getString(uniformName);
/*     */   }
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
/* 140 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 141 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetUniformBlockIndex_pointer;
/* 142 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 143 */     BufferChecks.checkDirect(uniformBlockName);
/* 144 */     BufferChecks.checkNullTerminated(uniformBlockName);
/* 145 */     int __result = nglGetUniformBlockIndex(program, uniformBlockName, uniformBlockName.position(), function_pointer);
/* 146 */     return __result;
/*     */   }
/*     */   
/*     */   private static native int nglGetUniformBlockIndex(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
/* 152 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 153 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetUniformBlockIndex_pointer;
/* 154 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 155 */     int __result = nglGetUniformBlockIndex(program, APIUtils.getBufferNT(uniformBlockName), 0, function_pointer);
/* 156 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformBlock(int program, int uniformBlockIndex, int pname, IntBuffer params) {
/* 160 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 161 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformBlockiv_pointer;
/* 162 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 163 */     BufferChecks.checkBuffer(params, 16);
/* 164 */     nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformBlockiv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetActiveUniformBlock(int program, int uniformBlockIndex, int pname) {
/* 170 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 171 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformBlockiv_pointer;
/* 172 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 173 */     IntBuffer params = APIUtils.getBufferInt();
/* 174 */     nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, params.position(), function_pointer);
/* 175 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
/* 179 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 180 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformBlockName_pointer;
/* 181 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 182 */     if (length != null)
/* 183 */       BufferChecks.checkBuffer(length, 1); 
/* 184 */     BufferChecks.checkDirect(uniformBlockName);
/* 185 */     nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), length, (length != null) ? length.position() : 0, uniformBlockName, uniformBlockName.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformBlockName(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, ByteBuffer paramByteBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
/* 191 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 192 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetActiveUniformBlockName_pointer;
/* 193 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 194 */     IntBuffer uniformBlockName_length = APIUtils.getLengths();
/* 195 */     ByteBuffer uniformBlockName = APIUtils.getBufferByte(bufSize);
/* 196 */     nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, uniformBlockName_length, 0, uniformBlockName, uniformBlockName.position(), function_pointer);
/* 197 */     uniformBlockName.limit(uniformBlockName_length.get(0));
/* 198 */     return APIUtils.getString(uniformBlockName);
/*     */   }
/*     */   private static native void nglBindBufferRange(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
/*     */   public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
/* 202 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 203 */     long function_pointer = caps.ARB_uniform_buffer_object_glBindBufferRange_pointer;
/* 204 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 205 */     nglBindBufferRange(target, index, buffer, offset, size, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBindBufferBase(int target, int index, int buffer) {
/* 210 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 211 */     long function_pointer = caps.ARB_uniform_buffer_object_glBindBufferBase_pointer;
/* 212 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 213 */     nglBindBufferBase(target, index, buffer, function_pointer);
/*     */   }
/*     */   private static native void nglBindBufferBase(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetInteger(int value, int index, IntBuffer data) {
/* 218 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 219 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetIntegeri_v_pointer;
/* 220 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 221 */     BufferChecks.checkBuffer(data, 4);
/* 222 */     nglGetIntegeri_v(value, index, data, data.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetIntegeri_v(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetInteger(int value, int index) {
/* 228 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 229 */     long function_pointer = caps.ARB_uniform_buffer_object_glGetIntegeri_v_pointer;
/* 230 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 231 */     IntBuffer data = APIUtils.getBufferInt();
/* 232 */     nglGetIntegeri_v(value, index, data, data.position(), function_pointer);
/* 233 */     return data.get(0);
/*     */   }
/*     */   
/*     */   public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
/* 237 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 238 */     long function_pointer = caps.ARB_uniform_buffer_object_glUniformBlockBinding_pointer;
/* 239 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 240 */     nglUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglUniformBlockBinding(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBUniformBufferObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */