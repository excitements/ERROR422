/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
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
/*     */ public final class GL31
/*     */ {
/*     */   public static final int GL_RED_SNORM = 36752;
/*     */   public static final int GL_RG_SNORM = 36753;
/*     */   public static final int GL_RGB_SNORM = 36754;
/*     */   public static final int GL_RGBA_SNORM = 36755;
/*     */   public static final int GL_R8_SNORM = 36756;
/*     */   public static final int GL_RG8_SNORM = 36757;
/*     */   public static final int GL_RGB8_SNORM = 36758;
/*     */   public static final int GL_RGBA8_SNORM = 36759;
/*     */   public static final int GL_R16_SNORM = 36760;
/*     */   public static final int GL_RG16_SNORM = 36761;
/*     */   public static final int GL_RGB16_SNORM = 36762;
/*     */   public static final int GL_RGBA16_SNORM = 36763;
/*     */   public static final int GL_SIGNED_NORMALIZED = 36764;
/*     */   public static final int GL_COPY_READ_BUFFER = 36662;
/*     */   public static final int GL_COPY_WRITE_BUFFER = 36663;
/*     */   public static final int GL_PRIMITIVE_RESTART = 36765;
/*     */   public static final int GL_PRIMITIVE_RESTART_INDEX = 36766;
/*     */   public static final int GL_TEXTURE_BUFFER = 35882;
/*     */   public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 35883;
/*     */   public static final int GL_TEXTURE_BINDING_BUFFER = 35884;
/*     */   public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 35885;
/*     */   public static final int GL_TEXTURE_BUFFER_FORMAT = 35886;
/*     */   public static final int GL_TEXTURE_RECTANGLE = 34037;
/*     */   public static final int GL_TEXTURE_BINDING_RECTANGLE = 34038;
/*     */   public static final int GL_PROXY_TEXTURE_RECTANGLE = 34039;
/*     */   public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 34040;
/*     */   public static final int GL_SAMPLER_2D_RECT = 35683;
/*     */   public static final int GL_SAMPLER_2D_RECT_SHADOW = 35684;
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
/*     */   public static void glDrawArraysInstanced(int mode, int first, int count, int primcount) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.GL31_glDrawArraysInstanced_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     nglDrawArraysInstanced(mode, first, count, primcount, function_pointer);
/*     */   }
/*     */   private static native void nglDrawArraysInstanced(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glDrawElementsInstanced(int mode, ByteBuffer indices, int primcount) {
/* 163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 164 */     long function_pointer = caps.GL31_glDrawElementsInstanced_pointer;
/* 165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 166 */     GLChecks.ensureElementVBOdisabled(caps);
/* 167 */     BufferChecks.checkDirect(indices);
/* 168 */     nglDrawElementsInstanced(mode, indices.remaining(), 5121, indices, indices.position(), primcount, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstanced(int mode, IntBuffer indices, int primcount) {
/* 171 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 172 */     long function_pointer = caps.GL31_glDrawElementsInstanced_pointer;
/* 173 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 174 */     GLChecks.ensureElementVBOdisabled(caps);
/* 175 */     BufferChecks.checkDirect(indices);
/* 176 */     nglDrawElementsInstanced(mode, indices.remaining(), 5125, indices, indices.position() << 2, primcount, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstanced(int mode, ShortBuffer indices, int primcount) {
/* 179 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 180 */     long function_pointer = caps.GL31_glDrawElementsInstanced_pointer;
/* 181 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 182 */     GLChecks.ensureElementVBOdisabled(caps);
/* 183 */     BufferChecks.checkDirect(indices);
/* 184 */     nglDrawElementsInstanced(mode, indices.remaining(), 5123, indices, indices.position() << 1, primcount, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDrawElementsInstanced(int mode, int count, int type, long indices_buffer_offset, int primcount) {
/* 188 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 189 */     long function_pointer = caps.GL31_glDrawElementsInstanced_pointer;
/* 190 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 191 */     GLChecks.ensureElementVBOenabled(caps);
/* 192 */     nglDrawElementsInstancedBO(mode, count, type, indices_buffer_offset, primcount, function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsInstanced(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, int paramInt5, long paramLong);
/*     */   private static native void nglDrawElementsInstancedBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2);
/*     */   public static void glCopyBufferSubData(int readtarget, int writetarget, long readoffset, long writeoffset, long size) {
/* 197 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 198 */     long function_pointer = caps.GL31_glCopyBufferSubData_pointer;
/* 199 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 200 */     nglCopyBufferSubData(readtarget, writetarget, readoffset, writeoffset, size, function_pointer);
/*     */   }
/*     */   private static native void nglCopyBufferSubData(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glPrimitiveRestartIndex(int index) {
/* 205 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 206 */     long function_pointer = caps.GL31_glPrimitiveRestartIndex_pointer;
/* 207 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 208 */     nglPrimitiveRestartIndex(index, function_pointer);
/*     */   }
/*     */   private static native void nglPrimitiveRestartIndex(int paramInt, long paramLong);
/*     */   
/*     */   public static void glTexBuffer(int target, int internalformat, int buffer) {
/* 213 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 214 */     long function_pointer = caps.GL31_glTexBuffer_pointer;
/* 215 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 216 */     nglTexBuffer(target, internalformat, buffer, function_pointer);
/*     */   }
/*     */   private static native void nglTexBuffer(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformIndices(int program, ByteBuffer uniformNames, IntBuffer uniformIndices) {
/* 221 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 222 */     long function_pointer = caps.GL31_glGetUniformIndices_pointer;
/* 223 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 224 */     BufferChecks.checkDirect(uniformNames);
/* 225 */     BufferChecks.checkNullTerminated(uniformNames, uniformIndices.remaining());
/* 226 */     BufferChecks.checkDirect(uniformIndices);
/* 227 */     nglGetUniformIndices(program, uniformIndices.remaining(), uniformNames, uniformNames.position(), uniformIndices, uniformIndices.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetUniformIndices(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
/* 233 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 234 */     long function_pointer = caps.GL31_glGetUniformIndices_pointer;
/* 235 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 236 */     BufferChecks.checkBuffer(uniformIndices, uniformNames.length);
/* 237 */     nglGetUniformIndices(program, uniformNames.length, APIUtils.getBufferNT(uniformNames), 0, uniformIndices, uniformIndices.position(), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniforms(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
/* 241 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 242 */     long function_pointer = caps.GL31_glGetActiveUniformsiv_pointer;
/* 243 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 244 */     BufferChecks.checkDirect(uniformIndices);
/* 245 */     BufferChecks.checkBuffer(params, uniformIndices.remaining());
/* 246 */     nglGetActiveUniformsiv(program, uniformIndices.remaining(), uniformIndices, uniformIndices.position(), pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformsiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, int paramInt3, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, long paramLong);
/*     */   
/*     */   public static int glGetActiveUniforms(int program, int uniformIndex, int pname) {
/* 252 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 253 */     long function_pointer = caps.GL31_glGetActiveUniformsiv_pointer;
/* 254 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 255 */     IntBuffer params = APIUtils.getBufferInt();
/* 256 */     nglGetActiveUniformsiv(program, 1, params.put(1, uniformIndex), 1, pname, params, params.position(), function_pointer);
/* 257 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName) {
/* 261 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 262 */     long function_pointer = caps.GL31_glGetActiveUniformName_pointer;
/* 263 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 264 */     if (length != null)
/* 265 */       BufferChecks.checkBuffer(length, 1); 
/* 266 */     BufferChecks.checkDirect(uniformName);
/* 267 */     nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), length, (length != null) ? length.position() : 0, uniformName, uniformName.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformName(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, ByteBuffer paramByteBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
/* 273 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 274 */     long function_pointer = caps.GL31_glGetActiveUniformName_pointer;
/* 275 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 276 */     IntBuffer uniformName_length = APIUtils.getLengths();
/* 277 */     ByteBuffer uniformName = APIUtils.getBufferByte(bufSize);
/* 278 */     nglGetActiveUniformName(program, uniformIndex, bufSize, uniformName_length, 0, uniformName, uniformName.position(), function_pointer);
/* 279 */     uniformName.limit(uniformName_length.get(0));
/* 280 */     return APIUtils.getString(uniformName);
/*     */   }
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
/* 284 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 285 */     long function_pointer = caps.GL31_glGetUniformBlockIndex_pointer;
/* 286 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 287 */     BufferChecks.checkDirect(uniformBlockName);
/* 288 */     BufferChecks.checkNullTerminated(uniformBlockName);
/* 289 */     int __result = nglGetUniformBlockIndex(program, uniformBlockName, uniformBlockName.position(), function_pointer);
/* 290 */     return __result;
/*     */   }
/*     */   
/*     */   private static native int nglGetUniformBlockIndex(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
/* 296 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 297 */     long function_pointer = caps.GL31_glGetUniformBlockIndex_pointer;
/* 298 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 299 */     int __result = nglGetUniformBlockIndex(program, APIUtils.getBufferNT(uniformBlockName), 0, function_pointer);
/* 300 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformBlock(int program, int uniformBlockIndex, int pname, IntBuffer params) {
/* 304 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 305 */     long function_pointer = caps.GL31_glGetActiveUniformBlockiv_pointer;
/* 306 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 307 */     BufferChecks.checkBuffer(params, 16);
/* 308 */     nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformBlockiv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetActiveUniformBlock(int program, int uniformBlockIndex, int pname) {
/* 314 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 315 */     long function_pointer = caps.GL31_glGetActiveUniformBlockiv_pointer;
/* 316 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 317 */     IntBuffer params = APIUtils.getBufferInt();
/* 318 */     nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, params.position(), function_pointer);
/* 319 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
/* 323 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 324 */     long function_pointer = caps.GL31_glGetActiveUniformBlockName_pointer;
/* 325 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 326 */     if (length != null)
/* 327 */       BufferChecks.checkBuffer(length, 1); 
/* 328 */     BufferChecks.checkDirect(uniformBlockName);
/* 329 */     nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), length, (length != null) ? length.position() : 0, uniformBlockName, uniformBlockName.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveUniformBlockName(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, ByteBuffer paramByteBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
/* 335 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 336 */     long function_pointer = caps.GL31_glGetActiveUniformBlockName_pointer;
/* 337 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 338 */     IntBuffer uniformBlockName_length = APIUtils.getLengths();
/* 339 */     ByteBuffer uniformBlockName = APIUtils.getBufferByte(bufSize);
/* 340 */     nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, uniformBlockName_length, 0, uniformBlockName, uniformBlockName.position(), function_pointer);
/* 341 */     uniformBlockName.limit(uniformBlockName_length.get(0));
/* 342 */     return APIUtils.getString(uniformBlockName);
/*     */   }
/*     */   
/*     */   public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
/* 346 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 347 */     long function_pointer = caps.GL31_glUniformBlockBinding_pointer;
/* 348 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 349 */     nglUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglUniformBlockBinding(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL31.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */