/*      */ package org.lwjgl.opengl;
/*      */ 
/*      */ import java.nio.Buffer;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.DoubleBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import java.nio.ShortBuffer;
/*      */ import org.lwjgl.BufferChecks;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class GL20
/*      */ {
/*      */   public static final int GL_SHADING_LANGUAGE_VERSION = 35724;
/*      */   public static final int GL_CURRENT_PROGRAM = 35725;
/*      */   public static final int GL_SHADER_TYPE = 35663;
/*      */   public static final int GL_DELETE_STATUS = 35712;
/*      */   public static final int GL_COMPILE_STATUS = 35713;
/*      */   public static final int GL_LINK_STATUS = 35714;
/*      */   public static final int GL_VALIDATE_STATUS = 35715;
/*      */   public static final int GL_INFO_LOG_LENGTH = 35716;
/*      */   public static final int GL_ATTACHED_SHADERS = 35717;
/*      */   public static final int GL_ACTIVE_UNIFORMS = 35718;
/*      */   public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;
/*      */   public static final int GL_ACTIVE_ATTRIBUTES = 35721;
/*      */   public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;
/*      */   public static final int GL_SHADER_SOURCE_LENGTH = 35720;
/*      */   public static final int GL_SHADER_OBJECT = 35656;
/*      */   public static final int GL_FLOAT_VEC2 = 35664;
/*      */   public static final int GL_FLOAT_VEC3 = 35665;
/*      */   public static final int GL_FLOAT_VEC4 = 35666;
/*      */   public static final int GL_INT_VEC2 = 35667;
/*      */   public static final int GL_INT_VEC3 = 35668;
/*      */   public static final int GL_INT_VEC4 = 35669;
/*      */   public static final int GL_BOOL = 35670;
/*      */   public static final int GL_BOOL_VEC2 = 35671;
/*      */   public static final int GL_BOOL_VEC3 = 35672;
/*      */   public static final int GL_BOOL_VEC4 = 35673;
/*      */   public static final int GL_FLOAT_MAT2 = 35674;
/*      */   public static final int GL_FLOAT_MAT3 = 35675;
/*      */   public static final int GL_FLOAT_MAT4 = 35676;
/*      */   public static final int GL_SAMPLER_1D = 35677;
/*      */   public static final int GL_SAMPLER_2D = 35678;
/*      */   public static final int GL_SAMPLER_3D = 35679;
/*      */   public static final int GL_SAMPLER_CUBE = 35680;
/*      */   public static final int GL_SAMPLER_1D_SHADOW = 35681;
/*      */   public static final int GL_SAMPLER_2D_SHADOW = 35682;
/*      */   public static final int GL_VERTEX_SHADER = 35633;
/*      */   public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 35658;
/*      */   public static final int GL_MAX_VARYING_FLOATS = 35659;
/*      */   public static final int GL_MAX_VERTEX_ATTRIBS = 34921;
/*      */   public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 34930;
/*      */   public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;
/*      */   public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;
/*      */   public static final int GL_MAX_TEXTURE_COORDS = 34929;
/*      */   public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 34370;
/*      */   public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 34371;
/*      */   public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;
/*      */   public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;
/*      */   public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;
/*      */   public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;
/*      */   public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;
/*      */   public static final int GL_CURRENT_VERTEX_ATTRIB = 34342;
/*      */   public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;
/*      */   public static final int GL_FRAGMENT_SHADER = 35632;
/*      */   public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 35657;
/*      */   public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 35723;
/*      */   public static final int GL_MAX_DRAW_BUFFERS = 34852;
/*      */   public static final int GL_DRAW_BUFFER0 = 34853;
/*      */   public static final int GL_DRAW_BUFFER1 = 34854;
/*      */   public static final int GL_DRAW_BUFFER2 = 34855;
/*      */   public static final int GL_DRAW_BUFFER3 = 34856;
/*      */   public static final int GL_DRAW_BUFFER4 = 34857;
/*      */   public static final int GL_DRAW_BUFFER5 = 34858;
/*      */   public static final int GL_DRAW_BUFFER6 = 34859;
/*      */   public static final int GL_DRAW_BUFFER7 = 34860;
/*      */   public static final int GL_DRAW_BUFFER8 = 34861;
/*      */   public static final int GL_DRAW_BUFFER9 = 34862;
/*      */   public static final int GL_DRAW_BUFFER10 = 34863;
/*      */   public static final int GL_DRAW_BUFFER11 = 34864;
/*      */   public static final int GL_DRAW_BUFFER12 = 34865;
/*      */   public static final int GL_DRAW_BUFFER13 = 34866;
/*      */   public static final int GL_DRAW_BUFFER14 = 34867;
/*      */   public static final int GL_DRAW_BUFFER15 = 34868;
/*      */   public static final int GL_POINT_SPRITE = 34913;
/*      */   public static final int GL_COORD_REPLACE = 34914;
/*      */   public static final int GL_POINT_SPRITE_COORD_ORIGIN = 36000;
/*      */   public static final int GL_LOWER_LEFT = 36001;
/*      */   public static final int GL_UPPER_LEFT = 36002;
/*      */   public static final int GL_STENCIL_BACK_FUNC = 34816;
/*      */   public static final int GL_STENCIL_BACK_FAIL = 34817;
/*      */   public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;
/*      */   public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;
/*      */   public static final int GL_STENCIL_BACK_REF = 36003;
/*      */   public static final int GL_STENCIL_BACK_VALUE_MASK = 36004;
/*      */   public static final int GL_STENCIL_BACK_WRITEMASK = 36005;
/*      */   public static final int GL_BLEND_EQUATION_RGB = 32777;
/*      */   public static final int GL_BLEND_EQUATION_ALPHA = 34877;
/*      */   
/*      */   public static void glShaderSource(int shader, ByteBuffer string) {
/*  176 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  177 */     long function_pointer = caps.GL20_glShaderSource_pointer;
/*  178 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  179 */     BufferChecks.checkDirect(string);
/*  180 */     nglShaderSource(shader, 1, string, string.position(), string.remaining(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglShaderSource(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glShaderSource(int shader, CharSequence string) {
/*  186 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  187 */     long function_pointer = caps.GL20_glShaderSource_pointer;
/*  188 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  189 */     nglShaderSource(shader, 1, APIUtils.getBuffer(string), 0, string.length(), function_pointer);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void glShaderSource(int shader, CharSequence[] strings) {
/*  194 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  195 */     long function_pointer = caps.GL20_glShaderSource_pointer;
/*  196 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  197 */     nglShaderSource3(shader, strings.length, APIUtils.getBuffer(strings), 0, APIUtils.getLengths(strings), 0, function_pointer);
/*      */   }
/*      */   private static native void nglShaderSource3(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glCreateShader(int type) {
/*  202 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  203 */     long function_pointer = caps.GL20_glCreateShader_pointer;
/*  204 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  205 */     int __result = nglCreateShader(type, function_pointer);
/*  206 */     return __result;
/*      */   }
/*      */   private static native int nglCreateShader(int paramInt, long paramLong);
/*      */   
/*      */   public static boolean glIsShader(int shader) {
/*  211 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  212 */     long function_pointer = caps.GL20_glIsShader_pointer;
/*  213 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  214 */     boolean __result = nglIsShader(shader, function_pointer);
/*  215 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsShader(int paramInt, long paramLong);
/*      */   
/*      */   public static void glCompileShader(int shader) {
/*  220 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  221 */     long function_pointer = caps.GL20_glCompileShader_pointer;
/*  222 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  223 */     nglCompileShader(shader, function_pointer);
/*      */   }
/*      */   private static native void nglCompileShader(int paramInt, long paramLong);
/*      */   
/*      */   public static void glDeleteShader(int shader) {
/*  228 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  229 */     long function_pointer = caps.GL20_glDeleteShader_pointer;
/*  230 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  231 */     nglDeleteShader(shader, function_pointer);
/*      */   }
/*      */   private static native void nglDeleteShader(int paramInt, long paramLong);
/*      */   
/*      */   public static int glCreateProgram() {
/*  236 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  237 */     long function_pointer = caps.GL20_glCreateProgram_pointer;
/*  238 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  239 */     int __result = nglCreateProgram(function_pointer);
/*  240 */     return __result;
/*      */   }
/*      */   private static native int nglCreateProgram(long paramLong);
/*      */   
/*      */   public static boolean glIsProgram(int program) {
/*  245 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  246 */     long function_pointer = caps.GL20_glIsProgram_pointer;
/*  247 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  248 */     boolean __result = nglIsProgram(program, function_pointer);
/*  249 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsProgram(int paramInt, long paramLong);
/*      */   
/*      */   public static void glAttachShader(int program, int shader) {
/*  254 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  255 */     long function_pointer = caps.GL20_glAttachShader_pointer;
/*  256 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  257 */     nglAttachShader(program, shader, function_pointer);
/*      */   }
/*      */   private static native void nglAttachShader(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDetachShader(int program, int shader) {
/*  262 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  263 */     long function_pointer = caps.GL20_glDetachShader_pointer;
/*  264 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  265 */     nglDetachShader(program, shader, function_pointer);
/*      */   }
/*      */   private static native void nglDetachShader(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glLinkProgram(int program) {
/*  270 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  271 */     long function_pointer = caps.GL20_glLinkProgram_pointer;
/*  272 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  273 */     nglLinkProgram(program, function_pointer);
/*      */   }
/*      */   private static native void nglLinkProgram(int paramInt, long paramLong);
/*      */   
/*      */   public static void glUseProgram(int program) {
/*  278 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  279 */     long function_pointer = caps.GL20_glUseProgram_pointer;
/*  280 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  281 */     nglUseProgram(program, function_pointer);
/*      */   }
/*      */   private static native void nglUseProgram(int paramInt, long paramLong);
/*      */   
/*      */   public static void glValidateProgram(int program) {
/*  286 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  287 */     long function_pointer = caps.GL20_glValidateProgram_pointer;
/*  288 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  289 */     nglValidateProgram(program, function_pointer);
/*      */   }
/*      */   private static native void nglValidateProgram(int paramInt, long paramLong);
/*      */   
/*      */   public static void glDeleteProgram(int program) {
/*  294 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  295 */     long function_pointer = caps.GL20_glDeleteProgram_pointer;
/*  296 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  297 */     nglDeleteProgram(program, function_pointer);
/*      */   }
/*      */   private static native void nglDeleteProgram(int paramInt, long paramLong);
/*      */   
/*      */   public static void glUniform1f(int location, float v0) {
/*  302 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  303 */     long function_pointer = caps.GL20_glUniform1f_pointer;
/*  304 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  305 */     nglUniform1f(location, v0, function_pointer);
/*      */   }
/*      */   private static native void nglUniform1f(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glUniform2f(int location, float v0, float v1) {
/*  310 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  311 */     long function_pointer = caps.GL20_glUniform2f_pointer;
/*  312 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  313 */     nglUniform2f(location, v0, v1, function_pointer);
/*      */   }
/*      */   private static native void nglUniform2f(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glUniform3f(int location, float v0, float v1, float v2) {
/*  318 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  319 */     long function_pointer = caps.GL20_glUniform3f_pointer;
/*  320 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  321 */     nglUniform3f(location, v0, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglUniform3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
/*  326 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  327 */     long function_pointer = caps.GL20_glUniform4f_pointer;
/*  328 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  329 */     nglUniform4f(location, v0, v1, v2, v3, function_pointer);
/*      */   }
/*      */   private static native void nglUniform4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glUniform1i(int location, int v0) {
/*  334 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  335 */     long function_pointer = caps.GL20_glUniform1i_pointer;
/*  336 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  337 */     nglUniform1i(location, v0, function_pointer);
/*      */   }
/*      */   private static native void nglUniform1i(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glUniform2i(int location, int v0, int v1) {
/*  342 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  343 */     long function_pointer = caps.GL20_glUniform2i_pointer;
/*  344 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  345 */     nglUniform2i(location, v0, v1, function_pointer);
/*      */   }
/*      */   private static native void nglUniform2i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform3i(int location, int v0, int v1, int v2) {
/*  350 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  351 */     long function_pointer = caps.GL20_glUniform3i_pointer;
/*  352 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  353 */     nglUniform3i(location, v0, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglUniform3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
/*  358 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  359 */     long function_pointer = caps.GL20_glUniform4i_pointer;
/*  360 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  361 */     nglUniform4i(location, v0, v1, v2, v3, function_pointer);
/*      */   }
/*      */   private static native void nglUniform4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glUniform1(int location, FloatBuffer values) {
/*  366 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  367 */     long function_pointer = caps.GL20_glUniform1fv_pointer;
/*  368 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  369 */     BufferChecks.checkDirect(values);
/*  370 */     nglUniform1fv(location, values.remaining(), values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform1fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform2(int location, FloatBuffer values) {
/*  375 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  376 */     long function_pointer = caps.GL20_glUniform2fv_pointer;
/*  377 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  378 */     BufferChecks.checkDirect(values);
/*  379 */     nglUniform2fv(location, values.remaining() >> 1, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform2fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform3(int location, FloatBuffer values) {
/*  384 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  385 */     long function_pointer = caps.GL20_glUniform3fv_pointer;
/*  386 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  387 */     BufferChecks.checkDirect(values);
/*  388 */     nglUniform3fv(location, values.remaining() / 3, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform3fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform4(int location, FloatBuffer values) {
/*  393 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  394 */     long function_pointer = caps.GL20_glUniform4fv_pointer;
/*  395 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  396 */     BufferChecks.checkDirect(values);
/*  397 */     nglUniform4fv(location, values.remaining() >> 2, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform4fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform1(int location, IntBuffer values) {
/*  402 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  403 */     long function_pointer = caps.GL20_glUniform1iv_pointer;
/*  404 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  405 */     BufferChecks.checkDirect(values);
/*  406 */     nglUniform1iv(location, values.remaining(), values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform1iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform2(int location, IntBuffer values) {
/*  411 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  412 */     long function_pointer = caps.GL20_glUniform2iv_pointer;
/*  413 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  414 */     BufferChecks.checkDirect(values);
/*  415 */     nglUniform2iv(location, values.remaining() >> 1, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform2iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform3(int location, IntBuffer values) {
/*  420 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  421 */     long function_pointer = caps.GL20_glUniform3iv_pointer;
/*  422 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  423 */     BufferChecks.checkDirect(values);
/*  424 */     nglUniform3iv(location, values.remaining() / 3, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform3iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform4(int location, IntBuffer values) {
/*  429 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  430 */     long function_pointer = caps.GL20_glUniform4iv_pointer;
/*  431 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  432 */     BufferChecks.checkDirect(values);
/*  433 */     nglUniform4iv(location, values.remaining() >> 2, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform4iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniformMatrix2(int location, boolean transpose, FloatBuffer matrices) {
/*  438 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  439 */     long function_pointer = caps.GL20_glUniformMatrix2fv_pointer;
/*  440 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  441 */     BufferChecks.checkDirect(matrices);
/*  442 */     nglUniformMatrix2fv(location, matrices.remaining() >> 2, transpose, matrices, matrices.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniformMatrix2fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniformMatrix3(int location, boolean transpose, FloatBuffer matrices) {
/*  447 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  448 */     long function_pointer = caps.GL20_glUniformMatrix3fv_pointer;
/*  449 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  450 */     BufferChecks.checkDirect(matrices);
/*  451 */     nglUniformMatrix3fv(location, matrices.remaining() / 9, transpose, matrices, matrices.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniformMatrix3fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniformMatrix4(int location, boolean transpose, FloatBuffer matrices) {
/*  456 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  457 */     long function_pointer = caps.GL20_glUniformMatrix4fv_pointer;
/*  458 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  459 */     BufferChecks.checkDirect(matrices);
/*  460 */     nglUniformMatrix4fv(location, matrices.remaining() >> 4, transpose, matrices, matrices.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniformMatrix4fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetShader(int shader, int pname, IntBuffer params) {
/*  465 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  466 */     long function_pointer = caps.GL20_glGetShaderiv_pointer;
/*  467 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  468 */     BufferChecks.checkDirect(params);
/*  469 */     nglGetShaderiv(shader, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetShaderiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetShader(int shader, int pname) {
/*  475 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  476 */     long function_pointer = caps.GL20_glGetShaderiv_pointer;
/*  477 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  478 */     IntBuffer params = APIUtils.getBufferInt();
/*  479 */     nglGetShaderiv(shader, pname, params, params.position(), function_pointer);
/*  480 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetProgram(int program, int pname, IntBuffer params) {
/*  484 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  485 */     long function_pointer = caps.GL20_glGetProgramiv_pointer;
/*  486 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  487 */     BufferChecks.checkDirect(params);
/*  488 */     nglGetProgramiv(program, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetProgramiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetProgram(int program, int pname) {
/*  494 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  495 */     long function_pointer = caps.GL20_glGetProgramiv_pointer;
/*  496 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  497 */     IntBuffer params = APIUtils.getBufferInt();
/*  498 */     nglGetProgramiv(program, pname, params, params.position(), function_pointer);
/*  499 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
/*  503 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  504 */     long function_pointer = caps.GL20_glGetShaderInfoLog_pointer;
/*  505 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  506 */     if (length != null)
/*  507 */       BufferChecks.checkBuffer(length, 1); 
/*  508 */     BufferChecks.checkDirect(infoLog);
/*  509 */     nglGetShaderInfoLog(shader, infoLog.remaining(), length, (length != null) ? length.position() : 0, infoLog, infoLog.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetShaderInfoLog(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static String glGetShaderInfoLog(int shader, int maxLength) {
/*  515 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  516 */     long function_pointer = caps.GL20_glGetShaderInfoLog_pointer;
/*  517 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  518 */     IntBuffer infoLog_length = APIUtils.getLengths();
/*  519 */     ByteBuffer infoLog = APIUtils.getBufferByte(maxLength);
/*  520 */     nglGetShaderInfoLog(shader, maxLength, infoLog_length, 0, infoLog, infoLog.position(), function_pointer);
/*  521 */     infoLog.limit(infoLog_length.get(0));
/*  522 */     return APIUtils.getString(infoLog);
/*      */   }
/*      */   
/*      */   public static void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
/*  526 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  527 */     long function_pointer = caps.GL20_glGetProgramInfoLog_pointer;
/*  528 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  529 */     if (length != null)
/*  530 */       BufferChecks.checkBuffer(length, 1); 
/*  531 */     BufferChecks.checkDirect(infoLog);
/*  532 */     nglGetProgramInfoLog(program, infoLog.remaining(), length, (length != null) ? length.position() : 0, infoLog, infoLog.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetProgramInfoLog(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static String glGetProgramInfoLog(int program, int maxLength) {
/*  538 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  539 */     long function_pointer = caps.GL20_glGetProgramInfoLog_pointer;
/*  540 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  541 */     IntBuffer infoLog_length = APIUtils.getLengths();
/*  542 */     ByteBuffer infoLog = APIUtils.getBufferByte(maxLength);
/*  543 */     nglGetProgramInfoLog(program, maxLength, infoLog_length, 0, infoLog, infoLog.position(), function_pointer);
/*  544 */     infoLog.limit(infoLog_length.get(0));
/*  545 */     return APIUtils.getString(infoLog);
/*      */   }
/*      */   
/*      */   public static void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
/*  549 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  550 */     long function_pointer = caps.GL20_glGetAttachedShaders_pointer;
/*  551 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  552 */     if (count != null)
/*  553 */       BufferChecks.checkBuffer(count, 1); 
/*  554 */     BufferChecks.checkDirect(shaders);
/*  555 */     nglGetAttachedShaders(program, shaders.remaining(), count, (count != null) ? count.position() : 0, shaders, shaders.position(), function_pointer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nglGetAttachedShaders(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, int paramInt3, IntBuffer paramIntBuffer2, int paramInt4, long paramLong);
/*      */ 
/*      */ 
/*      */   
/*      */   public static int glGetUniformLocation(int program, ByteBuffer name) {
/*  566 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  567 */     long function_pointer = caps.GL20_glGetUniformLocation_pointer;
/*  568 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  569 */     BufferChecks.checkBuffer(name, 1);
/*  570 */     BufferChecks.checkNullTerminated(name);
/*  571 */     int __result = nglGetUniformLocation(program, name, name.position(), function_pointer);
/*  572 */     return __result;
/*      */   }
/*      */   
/*      */   private static native int nglGetUniformLocation(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGetUniformLocation(int program, CharSequence name) {
/*  578 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  579 */     long function_pointer = caps.GL20_glGetUniformLocation_pointer;
/*  580 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  581 */     int __result = nglGetUniformLocation(program, APIUtils.getBufferNT(name), 0, function_pointer);
/*  582 */     return __result;
/*      */   }
/*      */   
/*      */   public static void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
/*  586 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  587 */     long function_pointer = caps.GL20_glGetActiveUniform_pointer;
/*  588 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  589 */     if (length != null)
/*  590 */       BufferChecks.checkBuffer(length, 1); 
/*  591 */     BufferChecks.checkBuffer(size, 1);
/*  592 */     BufferChecks.checkBuffer(type, 1);
/*  593 */     BufferChecks.checkDirect(name);
/*  594 */     nglGetActiveUniform(program, index, name.remaining(), length, (length != null) ? length.position() : 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/*      */   }
/*      */ 
/*      */   
/*      */   private static native void nglGetActiveUniform(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, IntBuffer paramIntBuffer3, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*      */ 
/*      */   
/*      */   public static String glGetActiveUniform(int program, int index, int maxLength, IntBuffer sizeType) {
/*  602 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  603 */     long function_pointer = caps.GL20_glGetActiveUniform_pointer;
/*  604 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  605 */     BufferChecks.checkBuffer(sizeType, 2);
/*  606 */     IntBuffer name_length = APIUtils.getLengths();
/*  607 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/*  608 */     nglGetActiveUniform(program, index, maxLength, name_length, 0, sizeType, sizeType.position(), sizeType, sizeType.position() + 1, name, name.position(), function_pointer);
/*  609 */     name.limit(name_length.get(0));
/*  610 */     return APIUtils.getString(name);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String glGetActiveUniform(int program, int index, int maxLength) {
/*  617 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  618 */     long function_pointer = caps.GL20_glGetActiveUniform_pointer;
/*  619 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  620 */     IntBuffer name_length = APIUtils.getLengths();
/*  621 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/*  622 */     nglGetActiveUniform(program, index, maxLength, name_length, 0, APIUtils.getBufferInt(), 0, APIUtils.getBufferInt(), 1, name, name.position(), function_pointer);
/*  623 */     name.limit(name_length.get(0));
/*  624 */     return APIUtils.getString(name);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int glGetActiveUniformSize(int program, int index) {
/*  631 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  632 */     long function_pointer = caps.GL20_glGetActiveUniform_pointer;
/*  633 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  634 */     IntBuffer size = APIUtils.getBufferInt();
/*  635 */     nglGetActiveUniform(program, index, 0, null, 0, size, size.position(), size, 1, APIUtils.getBufferByte(0), 0, function_pointer);
/*  636 */     return size.get(0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int glGetActiveUniformType(int program, int index) {
/*  643 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  644 */     long function_pointer = caps.GL20_glGetActiveUniform_pointer;
/*  645 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  646 */     IntBuffer type = APIUtils.getBufferInt();
/*  647 */     nglGetActiveUniform(program, index, 0, null, 0, type, 1, type, type.position(), APIUtils.getBufferByte(0), 0, function_pointer);
/*  648 */     return type.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetUniform(int program, int location, FloatBuffer params) {
/*  652 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  653 */     long function_pointer = caps.GL20_glGetUniformfv_pointer;
/*  654 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  655 */     BufferChecks.checkDirect(params);
/*  656 */     nglGetUniformfv(program, location, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetUniformfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetUniform(int program, int location, IntBuffer params) {
/*  661 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  662 */     long function_pointer = caps.GL20_glGetUniformiv_pointer;
/*  663 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  664 */     BufferChecks.checkDirect(params);
/*  665 */     nglGetUniformiv(program, location, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetUniformiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
/*  670 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  671 */     long function_pointer = caps.GL20_glGetShaderSource_pointer;
/*  672 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  673 */     if (length != null)
/*  674 */       BufferChecks.checkBuffer(length, 1); 
/*  675 */     BufferChecks.checkDirect(source);
/*  676 */     nglGetShaderSource(shader, source.remaining(), length, (length != null) ? length.position() : 0, source, source.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetShaderSource(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static String glGetShaderSource(int shader, int maxLength) {
/*  682 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  683 */     long function_pointer = caps.GL20_glGetShaderSource_pointer;
/*  684 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  685 */     IntBuffer source_length = APIUtils.getLengths();
/*  686 */     ByteBuffer source = APIUtils.getBufferByte(maxLength);
/*  687 */     nglGetShaderSource(shader, maxLength, source_length, 0, source, source.position(), function_pointer);
/*  688 */     source.limit(source_length.get(0));
/*  689 */     return APIUtils.getString(source);
/*      */   }
/*      */   
/*      */   public static void glVertexAttrib1s(int index, short x) {
/*  693 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  694 */     long function_pointer = caps.GL20_glVertexAttrib1s_pointer;
/*  695 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  696 */     nglVertexAttrib1s(index, x, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib1s(int paramInt, short paramShort, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib1f(int index, float x) {
/*  701 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  702 */     long function_pointer = caps.GL20_glVertexAttrib1f_pointer;
/*  703 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  704 */     nglVertexAttrib1f(index, x, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib1f(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib1d(int index, double x) {
/*  709 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  710 */     long function_pointer = caps.GL20_glVertexAttrib1d_pointer;
/*  711 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  712 */     nglVertexAttrib1d(index, x, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib1d(int paramInt, double paramDouble, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib2s(int index, short x, short y) {
/*  717 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  718 */     long function_pointer = caps.GL20_glVertexAttrib2s_pointer;
/*  719 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  720 */     nglVertexAttrib2s(index, x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib2s(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib2f(int index, float x, float y) {
/*  725 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  726 */     long function_pointer = caps.GL20_glVertexAttrib2f_pointer;
/*  727 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  728 */     nglVertexAttrib2f(index, x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib2f(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib2d(int index, double x, double y) {
/*  733 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  734 */     long function_pointer = caps.GL20_glVertexAttrib2d_pointer;
/*  735 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  736 */     nglVertexAttrib2d(index, x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib2d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib3s(int index, short x, short y, short z) {
/*  741 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  742 */     long function_pointer = caps.GL20_glVertexAttrib3s_pointer;
/*  743 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  744 */     nglVertexAttrib3s(index, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib3s(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib3f(int index, float x, float y, float z) {
/*  749 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  750 */     long function_pointer = caps.GL20_glVertexAttrib3f_pointer;
/*  751 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  752 */     nglVertexAttrib3f(index, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib3d(int index, double x, double y, double z) {
/*  757 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  758 */     long function_pointer = caps.GL20_glVertexAttrib3d_pointer;
/*  759 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  760 */     nglVertexAttrib3d(index, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib3d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib4s(int index, short x, short y, short z, short w) {
/*  765 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  766 */     long function_pointer = caps.GL20_glVertexAttrib4s_pointer;
/*  767 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  768 */     nglVertexAttrib4s(index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib4s(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib4f(int index, float x, float y, float z, float w) {
/*  773 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  774 */     long function_pointer = caps.GL20_glVertexAttrib4f_pointer;
/*  775 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  776 */     nglVertexAttrib4f(index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib4d(int index, double x, double y, double z, double w) {
/*  781 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  782 */     long function_pointer = caps.GL20_glVertexAttrib4d_pointer;
/*  783 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  784 */     nglVertexAttrib4d(index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib4d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
/*  789 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  790 */     long function_pointer = caps.GL20_glVertexAttrib4Nub_pointer;
/*  791 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  792 */     nglVertexAttrib4Nub(index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttrib4Nub(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
/*      */   
/*      */   public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, DoubleBuffer buffer) {
/*  797 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  798 */     long function_pointer = caps.GL20_glVertexAttribPointer_pointer;
/*  799 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  800 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  801 */     BufferChecks.checkDirect(buffer);
/*  802 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/*  803 */     nglVertexAttribPointer(index, size, 5130, normalized, stride, buffer, buffer.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, FloatBuffer buffer) {
/*  806 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  807 */     long function_pointer = caps.GL20_glVertexAttribPointer_pointer;
/*  808 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  809 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  810 */     BufferChecks.checkDirect(buffer);
/*  811 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/*  812 */     nglVertexAttribPointer(index, size, 5126, normalized, stride, buffer, buffer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer buffer) {
/*  815 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  816 */     long function_pointer = caps.GL20_glVertexAttribPointer_pointer;
/*  817 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  818 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  819 */     BufferChecks.checkDirect(buffer);
/*  820 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/*  821 */     nglVertexAttribPointer(index, size, unsigned ? 5121 : 5120, normalized, stride, buffer, buffer.position(), function_pointer);
/*      */   }
/*      */   public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, IntBuffer buffer) {
/*  824 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  825 */     long function_pointer = caps.GL20_glVertexAttribPointer_pointer;
/*  826 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  827 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  828 */     BufferChecks.checkDirect(buffer);
/*  829 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/*  830 */     nglVertexAttribPointer(index, size, unsigned ? 5125 : 5124, normalized, stride, buffer, buffer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer buffer) {
/*  833 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  834 */     long function_pointer = caps.GL20_glVertexAttribPointer_pointer;
/*  835 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  836 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  837 */     BufferChecks.checkDirect(buffer);
/*  838 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/*  839 */     nglVertexAttribPointer(index, size, unsigned ? 5123 : 5122, normalized, stride, buffer, buffer.position() << 1, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long buffer_buffer_offset) {
/*  843 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  844 */     long function_pointer = caps.GL20_glVertexAttribPointer_pointer;
/*  845 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  846 */     GLChecks.ensureArrayVBOenabled(caps);
/*  847 */     nglVertexAttribPointerBO(index, size, type, normalized, stride, buffer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*      */   private static native void nglVertexAttribPointerBO(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, long paramLong1, long paramLong2);
/*      */   public static void glEnableVertexAttribArray(int index) {
/*  852 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  853 */     long function_pointer = caps.GL20_glEnableVertexAttribArray_pointer;
/*  854 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  855 */     nglEnableVertexAttribArray(index, function_pointer);
/*      */   }
/*      */   private static native void nglEnableVertexAttribArray(int paramInt, long paramLong);
/*      */   
/*      */   public static void glDisableVertexAttribArray(int index) {
/*  860 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  861 */     long function_pointer = caps.GL20_glDisableVertexAttribArray_pointer;
/*  862 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  863 */     nglDisableVertexAttribArray(index, function_pointer);
/*      */   }
/*      */   private static native void nglDisableVertexAttribArray(int paramInt, long paramLong);
/*      */   
/*      */   public static void glGetVertexAttrib(int index, int pname, FloatBuffer params) {
/*  868 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  869 */     long function_pointer = caps.GL20_glGetVertexAttribfv_pointer;
/*  870 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  871 */     BufferChecks.checkBuffer(params, 4);
/*  872 */     nglGetVertexAttribfv(index, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetVertexAttribfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetVertexAttrib(int index, int pname, DoubleBuffer params) {
/*  877 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  878 */     long function_pointer = caps.GL20_glGetVertexAttribdv_pointer;
/*  879 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  880 */     BufferChecks.checkBuffer(params, 4);
/*  881 */     nglGetVertexAttribdv(index, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetVertexAttribdv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetVertexAttrib(int index, int pname, IntBuffer params) {
/*  886 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  887 */     long function_pointer = caps.GL20_glGetVertexAttribiv_pointer;
/*  888 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  889 */     BufferChecks.checkBuffer(params, 4);
/*  890 */     nglGetVertexAttribiv(index, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetVertexAttribiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static ByteBuffer glGetVertexAttribPointer(int index, int pname, long result_size) {
/*  895 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  896 */     long function_pointer = caps.GL20_glGetVertexAttribPointerv_pointer;
/*  897 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  898 */     ByteBuffer __result = nglGetVertexAttribPointerv(index, pname, result_size, function_pointer);
/*  899 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglGetVertexAttribPointerv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glBindAttribLocation(int program, int index, ByteBuffer name) {
/*  904 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  905 */     long function_pointer = caps.GL20_glBindAttribLocation_pointer;
/*  906 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  907 */     BufferChecks.checkDirect(name);
/*  908 */     BufferChecks.checkNullTerminated(name);
/*  909 */     nglBindAttribLocation(program, index, name, name.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglBindAttribLocation(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glBindAttribLocation(int program, int index, CharSequence name) {
/*  915 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  916 */     long function_pointer = caps.GL20_glBindAttribLocation_pointer;
/*  917 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  918 */     nglBindAttribLocation(program, index, APIUtils.getBufferNT(name), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
/*  922 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  923 */     long function_pointer = caps.GL20_glGetActiveAttrib_pointer;
/*  924 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  925 */     if (length != null)
/*  926 */       BufferChecks.checkBuffer(length, 1); 
/*  927 */     BufferChecks.checkBuffer(size, 1);
/*  928 */     BufferChecks.checkBuffer(type, 1);
/*  929 */     BufferChecks.checkDirect(name);
/*  930 */     nglGetActiveAttrib(program, index, name.remaining(), length, (length != null) ? length.position() : 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/*      */   }
/*      */ 
/*      */   
/*      */   private static native void nglGetActiveAttrib(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, IntBuffer paramIntBuffer3, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*      */ 
/*      */   
/*      */   public static String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer sizeType) {
/*  938 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  939 */     long function_pointer = caps.GL20_glGetActiveAttrib_pointer;
/*  940 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  941 */     BufferChecks.checkBuffer(sizeType, 2);
/*  942 */     IntBuffer name_length = APIUtils.getLengths();
/*  943 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/*  944 */     nglGetActiveAttrib(program, index, maxLength, name_length, 0, sizeType, sizeType.position(), sizeType, sizeType.position() + 1, name, name.position(), function_pointer);
/*  945 */     name.limit(name_length.get(0));
/*  946 */     return APIUtils.getString(name);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String glGetActiveAttrib(int program, int index, int maxLength) {
/*  953 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  954 */     long function_pointer = caps.GL20_glGetActiveAttrib_pointer;
/*  955 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  956 */     IntBuffer name_length = APIUtils.getLengths();
/*  957 */     ByteBuffer name = APIUtils.getBufferByte(maxLength);
/*  958 */     nglGetActiveAttrib(program, index, maxLength, name_length, 0, APIUtils.getBufferInt(), 0, APIUtils.getBufferInt(), 1, name, name.position(), function_pointer);
/*  959 */     name.limit(name_length.get(0));
/*  960 */     return APIUtils.getString(name);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int glGetActiveAttribSize(int program, int index) {
/*  967 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  968 */     long function_pointer = caps.GL20_glGetActiveAttrib_pointer;
/*  969 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  970 */     IntBuffer size = APIUtils.getBufferInt();
/*  971 */     nglGetActiveAttrib(program, index, 0, null, 0, size, size.position(), size, 1, APIUtils.getBufferByte(0), 0, function_pointer);
/*  972 */     return size.get(0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int glGetActiveAttribType(int program, int index) {
/*  979 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  980 */     long function_pointer = caps.GL20_glGetActiveAttrib_pointer;
/*  981 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  982 */     IntBuffer type = APIUtils.getBufferInt();
/*  983 */     nglGetActiveAttrib(program, index, 0, null, 0, type, 1, type, type.position(), APIUtils.getBufferByte(0), 0, function_pointer);
/*  984 */     return type.get(0);
/*      */   }
/*      */   
/*      */   public static int glGetAttribLocation(int program, ByteBuffer name) {
/*  988 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  989 */     long function_pointer = caps.GL20_glGetAttribLocation_pointer;
/*  990 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  991 */     BufferChecks.checkDirect(name);
/*  992 */     BufferChecks.checkNullTerminated(name);
/*  993 */     int __result = nglGetAttribLocation(program, name, name.position(), function_pointer);
/*  994 */     return __result;
/*      */   }
/*      */   
/*      */   private static native int nglGetAttribLocation(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGetAttribLocation(int program, CharSequence name) {
/* 1000 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1001 */     long function_pointer = caps.GL20_glGetAttribLocation_pointer;
/* 1002 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1003 */     int __result = nglGetAttribLocation(program, APIUtils.getBufferNT(name), 0, function_pointer);
/* 1004 */     return __result;
/*      */   }
/*      */   
/*      */   public static void glDrawBuffers(IntBuffer buffers) {
/* 1008 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1009 */     long function_pointer = caps.GL20_glDrawBuffers_pointer;
/* 1010 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1011 */     BufferChecks.checkDirect(buffers);
/* 1012 */     nglDrawBuffers(buffers.remaining(), buffers, buffers.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglDrawBuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDrawBuffers(int buffer) {
/* 1018 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1019 */     long function_pointer = caps.GL20_glDrawBuffers_pointer;
/* 1020 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1021 */     nglDrawBuffers(1, APIUtils.getBufferInt().put(0, buffer), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
/* 1025 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1026 */     long function_pointer = caps.GL20_glStencilOpSeparate_pointer;
/* 1027 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1028 */     nglStencilOpSeparate(face, sfail, dpfail, dppass, function_pointer);
/*      */   }
/*      */   private static native void nglStencilOpSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
/* 1033 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1034 */     long function_pointer = caps.GL20_glStencilFuncSeparate_pointer;
/* 1035 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1036 */     nglStencilFuncSeparate(face, func, ref, mask, function_pointer);
/*      */   }
/*      */   private static native void nglStencilFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glStencilMaskSeparate(int face, int mask) {
/* 1041 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1042 */     long function_pointer = caps.GL20_glStencilMaskSeparate_pointer;
/* 1043 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1044 */     nglStencilMaskSeparate(face, mask, function_pointer);
/*      */   }
/*      */   private static native void nglStencilMaskSeparate(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
/* 1049 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1050 */     long function_pointer = caps.GL20_glBlendEquationSeparate_pointer;
/* 1051 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1052 */     nglBlendEquationSeparate(modeRGB, modeAlpha, function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglBlendEquationSeparate(int paramInt1, int paramInt2, long paramLong);
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL20.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */