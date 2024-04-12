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
/*     */ public final class ARBShaderObjects
/*     */ {
/*     */   public static final int GL_PROGRAM_OBJECT_ARB = 35648;
/*     */   public static final int GL_OBJECT_TYPE_ARB = 35662;
/*     */   public static final int GL_OBJECT_SUBTYPE_ARB = 35663;
/*     */   public static final int GL_OBJECT_DELETE_STATUS_ARB = 35712;
/*     */   public static final int GL_OBJECT_COMPILE_STATUS_ARB = 35713;
/*     */   public static final int GL_OBJECT_LINK_STATUS_ARB = 35714;
/*     */   public static final int GL_OBJECT_VALIDATE_STATUS_ARB = 35715;
/*     */   public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = 35716;
/*     */   public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = 35717;
/*     */   public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 35718;
/*     */   public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 35719;
/*     */   public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 35720;
/*     */   public static final int GL_SHADER_OBJECT_ARB = 35656;
/*     */   public static final int GL_FLOAT = 5126;
/*     */   public static final int GL_FLOAT_VEC2_ARB = 35664;
/*     */   public static final int GL_FLOAT_VEC3_ARB = 35665;
/*     */   public static final int GL_FLOAT_VEC4_ARB = 35666;
/*     */   public static final int GL_INT = 5124;
/*     */   public static final int GL_INT_VEC2_ARB = 35667;
/*     */   public static final int GL_INT_VEC3_ARB = 35668;
/*     */   public static final int GL_INT_VEC4_ARB = 35669;
/*     */   public static final int GL_BOOL_ARB = 35670;
/*     */   public static final int GL_BOOL_VEC2_ARB = 35671;
/*     */   public static final int GL_BOOL_VEC3_ARB = 35672;
/*     */   public static final int GL_BOOL_VEC4_ARB = 35673;
/*     */   public static final int GL_FLOAT_MAT2_ARB = 35674;
/*     */   public static final int GL_FLOAT_MAT3_ARB = 35675;
/*     */   public static final int GL_FLOAT_MAT4_ARB = 35676;
/*     */   public static final int GL_SAMPLER_1D_ARB = 35677;
/*     */   public static final int GL_SAMPLER_2D_ARB = 35678;
/*     */   public static final int GL_SAMPLER_3D_ARB = 35679;
/*     */   public static final int GL_SAMPLER_CUBE_ARB = 35680;
/*     */   public static final int GL_SAMPLER_1D_SHADOW_ARB = 35681;
/*     */   public static final int GL_SAMPLER_2D_SHADOW_ARB = 35682;
/*     */   public static final int GL_SAMPLER_2D_RECT_ARB = 35683;
/*     */   public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 35684;
/*     */   
/*     */   private static native void nglDeleteObjectARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glDeleteObjectARB(int obj) {
/*  64 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  65 */     long function_pointer = caps.ARB_shader_objects_glDeleteObjectARB_pointer;
/*  66 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  67 */     nglDeleteObjectARB(obj, function_pointer);
/*     */   }
/*     */   private static native int nglGetHandleARB(int paramInt, long paramLong);
/*     */   
/*     */   public static int glGetHandleARB(int pname) {
/*  72 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  73 */     long function_pointer = caps.ARB_shader_objects_glGetHandleARB_pointer;
/*  74 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  75 */     int __result = nglGetHandleARB(pname, function_pointer);
/*  76 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDetachObjectARB(int containerObj, int attachedObj) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.ARB_shader_objects_glDetachObjectARB_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     nglDetachObjectARB(containerObj, attachedObj, function_pointer);
/*     */   }
/*     */   private static native void nglDetachObjectARB(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glCreateShaderObjectARB(int shaderType) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.ARB_shader_objects_glCreateShaderObjectARB_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     int __result = nglCreateShaderObjectARB(shaderType, function_pointer);
/*  93 */     return __result;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static native int nglCreateShaderObjectARB(int paramInt, long paramLong);
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glShaderSourceARB(int shader, ByteBuffer string) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.ARB_shader_objects_glShaderSourceARB_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     BufferChecks.checkDirect(string);
/* 107 */     nglShaderSourceARB(shader, 1, string, string.position(), string.remaining(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglShaderSourceARB(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glShaderSourceARB(int shader, CharSequence string) {
/* 113 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 114 */     long function_pointer = caps.ARB_shader_objects_glShaderSourceARB_pointer;
/* 115 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 116 */     nglShaderSourceARB(shader, 1, APIUtils.getBuffer(string), 0, string.length(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glShaderSourceARB(int shader, CharSequence[] strings) {
/* 121 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 122 */     long function_pointer = caps.ARB_shader_objects_glShaderSourceARB_pointer;
/* 123 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 124 */     nglShaderSourceARB3(shader, strings.length, APIUtils.getBuffer(strings), 0, APIUtils.getLengths(strings), 0, function_pointer);
/*     */   }
/*     */   private static native void nglShaderSourceARB3(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glCompileShaderARB(int shaderObj) {
/* 129 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 130 */     long function_pointer = caps.ARB_shader_objects_glCompileShaderARB_pointer;
/* 131 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 132 */     nglCompileShaderARB(shaderObj, function_pointer);
/*     */   }
/*     */   private static native void nglCompileShaderARB(int paramInt, long paramLong);
/*     */   
/*     */   public static int glCreateProgramObjectARB() {
/* 137 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 138 */     long function_pointer = caps.ARB_shader_objects_glCreateProgramObjectARB_pointer;
/* 139 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 140 */     int __result = nglCreateProgramObjectARB(function_pointer);
/* 141 */     return __result;
/*     */   }
/*     */   private static native int nglCreateProgramObjectARB(long paramLong);
/*     */   
/*     */   public static void glAttachObjectARB(int containerObj, int obj) {
/* 146 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 147 */     long function_pointer = caps.ARB_shader_objects_glAttachObjectARB_pointer;
/* 148 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 149 */     nglAttachObjectARB(containerObj, obj, function_pointer);
/*     */   }
/*     */   private static native void nglAttachObjectARB(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glLinkProgramARB(int programObj) {
/* 154 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 155 */     long function_pointer = caps.ARB_shader_objects_glLinkProgramARB_pointer;
/* 156 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 157 */     nglLinkProgramARB(programObj, function_pointer);
/*     */   }
/*     */   private static native void nglLinkProgramARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glUseProgramObjectARB(int programObj) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.ARB_shader_objects_glUseProgramObjectARB_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     nglUseProgramObjectARB(programObj, function_pointer);
/*     */   }
/*     */   private static native void nglUseProgramObjectARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glValidateProgramARB(int programObj) {
/* 170 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 171 */     long function_pointer = caps.ARB_shader_objects_glValidateProgramARB_pointer;
/* 172 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 173 */     nglValidateProgramARB(programObj, function_pointer);
/*     */   }
/*     */   private static native void nglValidateProgramARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glUniform1fARB(int location, float v0) {
/* 178 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 179 */     long function_pointer = caps.ARB_shader_objects_glUniform1fARB_pointer;
/* 180 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 181 */     nglUniform1fARB(location, v0, function_pointer);
/*     */   }
/*     */   private static native void nglUniform1fARB(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glUniform2fARB(int location, float v0, float v1) {
/* 186 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 187 */     long function_pointer = caps.ARB_shader_objects_glUniform2fARB_pointer;
/* 188 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 189 */     nglUniform2fARB(location, v0, v1, function_pointer);
/*     */   }
/*     */   private static native void nglUniform2fARB(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glUniform3fARB(int location, float v0, float v1, float v2) {
/* 194 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 195 */     long function_pointer = caps.ARB_shader_objects_glUniform3fARB_pointer;
/* 196 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 197 */     nglUniform3fARB(location, v0, v1, v2, function_pointer);
/*     */   }
/*     */   private static native void nglUniform3fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glUniform4fARB(int location, float v0, float v1, float v2, float v3) {
/* 202 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 203 */     long function_pointer = caps.ARB_shader_objects_glUniform4fARB_pointer;
/* 204 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 205 */     nglUniform4fARB(location, v0, v1, v2, v3, function_pointer);
/*     */   }
/*     */   private static native void nglUniform4fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glUniform1iARB(int location, int v0) {
/* 210 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 211 */     long function_pointer = caps.ARB_shader_objects_glUniform1iARB_pointer;
/* 212 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 213 */     nglUniform1iARB(location, v0, function_pointer);
/*     */   }
/*     */   private static native void nglUniform1iARB(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glUniform2iARB(int location, int v0, int v1) {
/* 218 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 219 */     long function_pointer = caps.ARB_shader_objects_glUniform2iARB_pointer;
/* 220 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 221 */     nglUniform2iARB(location, v0, v1, function_pointer);
/*     */   }
/*     */   private static native void nglUniform2iARB(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3iARB(int location, int v0, int v1, int v2) {
/* 226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 227 */     long function_pointer = caps.ARB_shader_objects_glUniform3iARB_pointer;
/* 228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 229 */     nglUniform3iARB(location, v0, v1, v2, function_pointer);
/*     */   }
/*     */   private static native void nglUniform3iARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glUniform4iARB(int location, int v0, int v1, int v2, int v3) {
/* 234 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 235 */     long function_pointer = caps.ARB_shader_objects_glUniform4iARB_pointer;
/* 236 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 237 */     nglUniform4iARB(location, v0, v1, v2, v3, function_pointer);
/*     */   }
/*     */   private static native void nglUniform4iARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glUniform1ARB(int location, FloatBuffer values) {
/* 242 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 243 */     long function_pointer = caps.ARB_shader_objects_glUniform1fvARB_pointer;
/* 244 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 245 */     BufferChecks.checkDirect(values);
/* 246 */     nglUniform1fvARB(location, values.remaining(), values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform1fvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform2ARB(int location, FloatBuffer values) {
/* 251 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 252 */     long function_pointer = caps.ARB_shader_objects_glUniform2fvARB_pointer;
/* 253 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 254 */     BufferChecks.checkDirect(values);
/* 255 */     nglUniform2fvARB(location, values.remaining() >> 1, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform2fvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3ARB(int location, FloatBuffer values) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.ARB_shader_objects_glUniform3fvARB_pointer;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     BufferChecks.checkDirect(values);
/* 264 */     nglUniform3fvARB(location, values.remaining() / 3, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform3fvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform4ARB(int location, FloatBuffer values) {
/* 269 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 270 */     long function_pointer = caps.ARB_shader_objects_glUniform4fvARB_pointer;
/* 271 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 272 */     BufferChecks.checkDirect(values);
/* 273 */     nglUniform4fvARB(location, values.remaining() >> 2, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform4fvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform1ARB(int location, IntBuffer values) {
/* 278 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 279 */     long function_pointer = caps.ARB_shader_objects_glUniform1ivARB_pointer;
/* 280 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 281 */     BufferChecks.checkDirect(values);
/* 282 */     nglUniform1ivARB(location, values.remaining(), values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform1ivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform2ARB(int location, IntBuffer values) {
/* 287 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 288 */     long function_pointer = caps.ARB_shader_objects_glUniform2ivARB_pointer;
/* 289 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 290 */     BufferChecks.checkDirect(values);
/* 291 */     nglUniform2ivARB(location, values.remaining() >> 1, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform2ivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform3ARB(int location, IntBuffer values) {
/* 296 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 297 */     long function_pointer = caps.ARB_shader_objects_glUniform3ivARB_pointer;
/* 298 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 299 */     BufferChecks.checkDirect(values);
/* 300 */     nglUniform3ivARB(location, values.remaining() / 3, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform3ivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniform4ARB(int location, IntBuffer values) {
/* 305 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 306 */     long function_pointer = caps.ARB_shader_objects_glUniform4ivARB_pointer;
/* 307 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 308 */     BufferChecks.checkDirect(values);
/* 309 */     nglUniform4ivARB(location, values.remaining() >> 2, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniform4ivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix2ARB(int location, boolean transpose, FloatBuffer matrices) {
/* 314 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 315 */     long function_pointer = caps.ARB_shader_objects_glUniformMatrix2fvARB_pointer;
/* 316 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 317 */     BufferChecks.checkDirect(matrices);
/* 318 */     nglUniformMatrix2fvARB(location, matrices.remaining() >> 2, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix2fvARB(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix3ARB(int location, boolean transpose, FloatBuffer matrices) {
/* 323 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 324 */     long function_pointer = caps.ARB_shader_objects_glUniformMatrix3fvARB_pointer;
/* 325 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 326 */     BufferChecks.checkDirect(matrices);
/* 327 */     nglUniformMatrix3fvARB(location, matrices.remaining() / 9, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix3fvARB(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glUniformMatrix4ARB(int location, boolean transpose, FloatBuffer matrices) {
/* 332 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 333 */     long function_pointer = caps.ARB_shader_objects_glUniformMatrix4fvARB_pointer;
/* 334 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 335 */     BufferChecks.checkDirect(matrices);
/* 336 */     nglUniformMatrix4fvARB(location, matrices.remaining() >> 4, transpose, matrices, matrices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformMatrix4fvARB(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetObjectParameterARB(int obj, int pname, FloatBuffer params) {
/* 341 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 342 */     long function_pointer = caps.ARB_shader_objects_glGetObjectParameterfvARB_pointer;
/* 343 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 344 */     BufferChecks.checkDirect(params);
/* 345 */     nglGetObjectParameterfvARB(obj, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetObjectParameterfvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static float glGetObjectParameterfARB(int obj, int pname) {
/* 351 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 352 */     long function_pointer = caps.ARB_shader_objects_glGetObjectParameterfvARB_pointer;
/* 353 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 354 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 355 */     nglGetObjectParameterfvARB(obj, pname, params, params.position(), function_pointer);
/* 356 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetObjectParameterARB(int obj, int pname, IntBuffer params) {
/* 360 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 361 */     long function_pointer = caps.ARB_shader_objects_glGetObjectParameterivARB_pointer;
/* 362 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 363 */     BufferChecks.checkDirect(params);
/* 364 */     nglGetObjectParameterivARB(obj, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetObjectParameterivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetObjectParameteriARB(int obj, int pname) {
/* 370 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 371 */     long function_pointer = caps.ARB_shader_objects_glGetObjectParameterivARB_pointer;
/* 372 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 373 */     IntBuffer params = APIUtils.getBufferInt();
/* 374 */     nglGetObjectParameterivARB(obj, pname, params, params.position(), function_pointer);
/* 375 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetInfoLogARB(int obj, IntBuffer length, ByteBuffer infoLog) {
/* 379 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 380 */     long function_pointer = caps.ARB_shader_objects_glGetInfoLogARB_pointer;
/* 381 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 382 */     if (length != null)
/* 383 */       BufferChecks.checkBuffer(length, 1); 
/* 384 */     BufferChecks.checkDirect(infoLog);
/* 385 */     nglGetInfoLogARB(obj, infoLog.remaining(), length, (length != null) ? length.position() : 0, infoLog, infoLog.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetInfoLogARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static String glGetInfoLogARB(int obj, int maxLength) {
/* 391 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 392 */     long function_pointer = caps.ARB_shader_objects_glGetInfoLogARB_pointer;
/* 393 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 394 */     IntBuffer infoLog_length = APIUtils.getLengths();
/* 395 */     ByteBuffer infoLog = APIUtils.getBufferByte(maxLength);
/* 396 */     nglGetInfoLogARB(obj, maxLength, infoLog_length, 0, infoLog, infoLog.position(), function_pointer);
/* 397 */     infoLog.limit(infoLog_length.get(0));
/* 398 */     return APIUtils.getString(infoLog);
/*     */   }
/*     */   
/*     */   public static void glGetAttachedObjectsARB(int containerObj, IntBuffer count, IntBuffer obj) {
/* 402 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 403 */     long function_pointer = caps.ARB_shader_objects_glGetAttachedObjectsARB_pointer;
/* 404 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 405 */     if (count != null)
/* 406 */       BufferChecks.checkBuffer(count, 1); 
/* 407 */     BufferChecks.checkDirect(obj);
/* 408 */     nglGetAttachedObjectsARB(containerObj, obj.remaining(), count, (count != null) ? count.position() : 0, obj, obj.position(), function_pointer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static native void nglGetAttachedObjectsARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, int paramInt3, IntBuffer paramIntBuffer2, int paramInt4, long paramLong);
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetUniformLocationARB(int programObj, ByteBuffer name) {
/* 418 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 419 */     long function_pointer = caps.ARB_shader_objects_glGetUniformLocationARB_pointer;
/* 420 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 421 */     BufferChecks.checkDirect(name);
/* 422 */     BufferChecks.checkNullTerminated(name);
/* 423 */     int __result = nglGetUniformLocationARB(programObj, name, name.position(), function_pointer);
/* 424 */     return __result;
/*     */   }
/*     */   
/*     */   private static native int nglGetUniformLocationARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGetUniformLocationARB(int programObj, CharSequence name) {
/* 430 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 431 */     long function_pointer = caps.ARB_shader_objects_glGetUniformLocationARB_pointer;
/* 432 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 433 */     int __result = nglGetUniformLocationARB(programObj, APIUtils.getBufferNT(name), 0, function_pointer);
/* 434 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGetActiveUniformARB(int programObj, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
/* 438 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 439 */     long function_pointer = caps.ARB_shader_objects_glGetActiveUniformARB_pointer;
/* 440 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 441 */     if (length != null)
/* 442 */       BufferChecks.checkBuffer(length, 1); 
/* 443 */     BufferChecks.checkBuffer(size, 1);
/* 444 */     BufferChecks.checkBuffer(type, 1);
/* 445 */     BufferChecks.checkDirect(name);
/* 446 */     nglGetActiveUniformARB(programObj, index, name.remaining(), length, (length != null) ? length.position() : 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   private static native void nglGetActiveUniformARB(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, IntBuffer paramIntBuffer3, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*     */ 
/*     */   
/*     */   public static String glGetActiveUniformARB(int programObj, int index, int maxLength, IntBuffer sizeType) {
/* 454 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 455 */     long function_pointer = caps.ARB_shader_objects_glGetActiveUniformARB_pointer;
/* 456 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 457 */     BufferChecks.checkBuffer(sizeType, 2);
/* 458 */     IntBuffer name_length = APIUtils.getLengths();
/* 459 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/* 460 */     nglGetActiveUniformARB(programObj, index, maxLength, name_length, 0, sizeType, sizeType.position(), sizeType, sizeType.position() + 1, name, name.position(), function_pointer);
/* 461 */     name.limit(name_length.get(0));
/* 462 */     return APIUtils.getString(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetActiveUniformARB(int programObj, int index, int maxLength) {
/* 469 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 470 */     long function_pointer = caps.ARB_shader_objects_glGetActiveUniformARB_pointer;
/* 471 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 472 */     IntBuffer name_length = APIUtils.getLengths();
/* 473 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/* 474 */     nglGetActiveUniformARB(programObj, index, maxLength, name_length, 0, APIUtils.getBufferInt(), 0, APIUtils.getBufferInt(), 1, name, name.position(), function_pointer);
/* 475 */     name.limit(name_length.get(0));
/* 476 */     return APIUtils.getString(name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetActiveUniformSizeARB(int programObj, int index) {
/* 483 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 484 */     long function_pointer = caps.ARB_shader_objects_glGetActiveUniformARB_pointer;
/* 485 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 486 */     IntBuffer size = APIUtils.getBufferInt();
/* 487 */     nglGetActiveUniformARB(programObj, index, 0, null, 0, size, size.position(), size, 1, APIUtils.getBufferByte(0), 0, function_pointer);
/* 488 */     return size.get(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetActiveUniformTypeARB(int programObj, int index) {
/* 495 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 496 */     long function_pointer = caps.ARB_shader_objects_glGetActiveUniformARB_pointer;
/* 497 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 498 */     IntBuffer type = APIUtils.getBufferInt();
/* 499 */     nglGetActiveUniformARB(programObj, index, 0, null, 0, type, 1, type, type.position(), APIUtils.getBufferByte(0), 0, function_pointer);
/* 500 */     return type.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetUniformARB(int programObj, int location, FloatBuffer params) {
/* 504 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 505 */     long function_pointer = caps.ARB_shader_objects_glGetUniformfvARB_pointer;
/* 506 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 507 */     BufferChecks.checkDirect(params);
/* 508 */     nglGetUniformfvARB(programObj, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformfvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformARB(int programObj, int location, IntBuffer params) {
/* 513 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 514 */     long function_pointer = caps.ARB_shader_objects_glGetUniformivARB_pointer;
/* 515 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 516 */     BufferChecks.checkDirect(params);
/* 517 */     nglGetUniformivARB(programObj, location, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetUniformivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetShaderSourceARB(int obj, IntBuffer length, ByteBuffer source) {
/* 522 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 523 */     long function_pointer = caps.ARB_shader_objects_glGetShaderSourceARB_pointer;
/* 524 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 525 */     if (length != null)
/* 526 */       BufferChecks.checkBuffer(length, 1); 
/* 527 */     BufferChecks.checkDirect(source);
/* 528 */     nglGetShaderSourceARB(obj, source.remaining(), length, (length != null) ? length.position() : 0, source, source.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetShaderSourceARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static String glGetShaderSourceARB(int obj, int maxLength) {
/* 534 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 535 */     long function_pointer = caps.ARB_shader_objects_glGetShaderSourceARB_pointer;
/* 536 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 537 */     IntBuffer source_length = APIUtils.getLengths();
/* 538 */     ByteBuffer source = APIUtils.getBufferByte(maxLength);
/* 539 */     nglGetShaderSourceARB(obj, maxLength, source_length, 0, source, source.position(), function_pointer);
/* 540 */     source.limit(source_length.get(0));
/* 541 */     return APIUtils.getString(source);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBShaderObjects.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */