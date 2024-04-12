/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.DoubleBuffer;
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
/*     */ public class ARBProgram
/*     */ {
/*     */   public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 34933;
/*     */   public static final int GL_PROGRAM_LENGTH_ARB = 34343;
/*     */   public static final int GL_PROGRAM_FORMAT_ARB = 34934;
/*     */   public static final int GL_PROGRAM_BINDING_ARB = 34423;
/*     */   public static final int GL_PROGRAM_INSTRUCTIONS_ARB = 34976;
/*     */   public static final int GL_MAX_PROGRAM_INSTRUCTIONS_ARB = 34977;
/*     */   public static final int GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 34978;
/*     */   public static final int GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 34979;
/*     */   public static final int GL_PROGRAM_TEMPORARIES_ARB = 34980;
/*     */   public static final int GL_MAX_PROGRAM_TEMPORARIES_ARB = 34981;
/*     */   public static final int GL_PROGRAM_NATIVE_TEMPORARIES_ARB = 34982;
/*     */   public static final int GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB = 34983;
/*     */   public static final int GL_PROGRAM_PARAMETERS_ARB = 34984;
/*     */   public static final int GL_MAX_PROGRAM_PARAMETERS_ARB = 34985;
/*     */   public static final int GL_PROGRAM_NATIVE_PARAMETERS_ARB = 34986;
/*     */   public static final int GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB = 34987;
/*     */   public static final int GL_PROGRAM_ATTRIBS_ARB = 34988;
/*     */   public static final int GL_MAX_PROGRAM_ATTRIBS_ARB = 34989;
/*     */   public static final int GL_PROGRAM_NATIVE_ATTRIBS_ARB = 34990;
/*     */   public static final int GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB = 34991;
/*     */   public static final int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = 34996;
/*     */   public static final int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = 34997;
/*     */   public static final int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = 34998;
/*     */   public static final int GL_PROGRAM_STRING_ARB = 34344;
/*     */   public static final int GL_PROGRAM_ERROR_POSITION_ARB = 34379;
/*     */   public static final int GL_CURRENT_MATRIX_ARB = 34369;
/*     */   public static final int GL_TRANSPOSE_CURRENT_MATRIX_ARB = 34999;
/*     */   public static final int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = 34368;
/*     */   public static final int GL_MAX_PROGRAM_MATRICES_ARB = 34351;
/*     */   public static final int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 34350;
/*     */   public static final int GL_PROGRAM_ERROR_STRING_ARB = 34932;
/*     */   public static final int GL_MATRIX0_ARB = 35008;
/*     */   public static final int GL_MATRIX1_ARB = 35009;
/*     */   public static final int GL_MATRIX2_ARB = 35010;
/*     */   public static final int GL_MATRIX3_ARB = 35011;
/*     */   public static final int GL_MATRIX4_ARB = 35012;
/*     */   public static final int GL_MATRIX5_ARB = 35013;
/*     */   public static final int GL_MATRIX6_ARB = 35014;
/*     */   public static final int GL_MATRIX7_ARB = 35015;
/*     */   public static final int GL_MATRIX8_ARB = 35016;
/*     */   public static final int GL_MATRIX9_ARB = 35017;
/*     */   public static final int GL_MATRIX10_ARB = 35018;
/*     */   public static final int GL_MATRIX11_ARB = 35019;
/*     */   public static final int GL_MATRIX12_ARB = 35020;
/*     */   public static final int GL_MATRIX13_ARB = 35021;
/*     */   public static final int GL_MATRIX14_ARB = 35022;
/*     */   public static final int GL_MATRIX15_ARB = 35023;
/*     */   public static final int GL_MATRIX16_ARB = 35024;
/*     */   public static final int GL_MATRIX17_ARB = 35025;
/*     */   public static final int GL_MATRIX18_ARB = 35026;
/*     */   public static final int GL_MATRIX19_ARB = 35027;
/*     */   public static final int GL_MATRIX20_ARB = 35028;
/*     */   public static final int GL_MATRIX21_ARB = 35029;
/*     */   public static final int GL_MATRIX22_ARB = 35030;
/*     */   public static final int GL_MATRIX23_ARB = 35031;
/*     */   public static final int GL_MATRIX24_ARB = 35032;
/*     */   public static final int GL_MATRIX25_ARB = 35033;
/*     */   public static final int GL_MATRIX26_ARB = 35034;
/*     */   public static final int GL_MATRIX27_ARB = 35035;
/*     */   public static final int GL_MATRIX28_ARB = 35036;
/*     */   public static final int GL_MATRIX29_ARB = 35037;
/*     */   public static final int GL_MATRIX30_ARB = 35038;
/*     */   public static final int GL_MATRIX31_ARB = 35039;
/*     */   
/*     */   public static void glProgramStringARB(int target, int format, ByteBuffer string) {
/*  95 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  96 */     long function_pointer = caps.ARB_program_glProgramStringARB_pointer;
/*  97 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  98 */     BufferChecks.checkDirect(string);
/*  99 */     nglProgramStringARB(target, format, string.remaining(), string, string.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglProgramStringARB(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glProgramStringARB(int target, int format, CharSequence string) {
/* 105 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 106 */     long function_pointer = caps.ARB_program_glProgramStringARB_pointer;
/* 107 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 108 */     nglProgramStringARB(target, format, string.length(), APIUtils.getBuffer(string), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glBindProgramARB(int target, int program) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.ARB_program_glBindProgramARB_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     nglBindProgramARB(target, program, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDeleteProgramsARB(IntBuffer programs) {
/* 120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 121 */     long function_pointer = caps.ARB_program_glDeleteProgramsARB_pointer;
/* 122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 123 */     BufferChecks.checkDirect(programs);
/* 124 */     nglDeleteProgramsARB(programs.remaining(), programs, programs.position(), function_pointer);
/*     */   }
/*     */   private static native void nglBindProgramARB(int paramInt1, int paramInt2, long paramLong);
/*     */   private static native void nglDeleteProgramsARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteProgramsARB(int program) {
/* 130 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 131 */     long function_pointer = caps.ARB_program_glDeleteProgramsARB_pointer;
/* 132 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 133 */     nglDeleteProgramsARB(1, APIUtils.getBufferInt().put(0, program), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenProgramsARB(IntBuffer programs) {
/* 137 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 138 */     long function_pointer = caps.ARB_program_glGenProgramsARB_pointer;
/* 139 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 140 */     BufferChecks.checkDirect(programs);
/* 141 */     nglGenProgramsARB(programs.remaining(), programs, programs.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenProgramsARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenProgramsARB() {
/* 147 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 148 */     long function_pointer = caps.ARB_program_glGenProgramsARB_pointer;
/* 149 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 150 */     IntBuffer programs = APIUtils.getBufferInt();
/* 151 */     nglGenProgramsARB(1, programs, programs.position(), function_pointer);
/* 152 */     return programs.get(0);
/*     */   }
/*     */   
/*     */   public static void glProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w) {
/* 156 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 157 */     long function_pointer = caps.ARB_program_glProgramEnvParameter4fARB_pointer;
/* 158 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 159 */     nglProgramEnvParameter4fARB(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameter4fARB(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w) {
/* 164 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 165 */     long function_pointer = caps.ARB_program_glProgramEnvParameter4dARB_pointer;
/* 166 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 167 */     nglProgramEnvParameter4dARB(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameter4dARB(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParameter4ARB(int target, int index, FloatBuffer params) {
/* 172 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 173 */     long function_pointer = caps.ARB_program_glProgramEnvParameter4fvARB_pointer;
/* 174 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 175 */     BufferChecks.checkBuffer(params, 4);
/* 176 */     nglProgramEnvParameter4fvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameter4fvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramEnvParameter4ARB(int target, int index, DoubleBuffer params) {
/* 181 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 182 */     long function_pointer = caps.ARB_program_glProgramEnvParameter4dvARB_pointer;
/* 183 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 184 */     BufferChecks.checkBuffer(params, 4);
/* 185 */     nglProgramEnvParameter4dvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramEnvParameter4dvARB(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
/* 190 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 191 */     long function_pointer = caps.ARB_program_glProgramLocalParameter4fARB_pointer;
/* 192 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 193 */     nglProgramLocalParameter4fARB(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParameter4fARB(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w) {
/* 198 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 199 */     long function_pointer = caps.ARB_program_glProgramLocalParameter4dARB_pointer;
/* 200 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 201 */     nglProgramLocalParameter4dARB(target, index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParameter4dARB(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameter4ARB(int target, int index, FloatBuffer params) {
/* 206 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 207 */     long function_pointer = caps.ARB_program_glProgramLocalParameter4fvARB_pointer;
/* 208 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 209 */     BufferChecks.checkBuffer(params, 4);
/* 210 */     nglProgramLocalParameter4fvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParameter4fvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glProgramLocalParameter4ARB(int target, int index, DoubleBuffer params) {
/* 215 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 216 */     long function_pointer = caps.ARB_program_glProgramLocalParameter4dvARB_pointer;
/* 217 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 218 */     BufferChecks.checkBuffer(params, 4);
/* 219 */     nglProgramLocalParameter4dvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglProgramLocalParameter4dvARB(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramEnvParameterARB(int target, int index, FloatBuffer params) {
/* 224 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 225 */     long function_pointer = caps.ARB_program_glGetProgramEnvParameterfvARB_pointer;
/* 226 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 227 */     BufferChecks.checkBuffer(params, 4);
/* 228 */     nglGetProgramEnvParameterfvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramEnvParameterfvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramEnvParameterARB(int target, int index, DoubleBuffer params) {
/* 233 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 234 */     long function_pointer = caps.ARB_program_glGetProgramEnvParameterdvARB_pointer;
/* 235 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 236 */     BufferChecks.checkBuffer(params, 4);
/* 237 */     nglGetProgramEnvParameterdvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramEnvParameterdvARB(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramLocalParameterARB(int target, int index, FloatBuffer params) {
/* 242 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 243 */     long function_pointer = caps.ARB_program_glGetProgramLocalParameterfvARB_pointer;
/* 244 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 245 */     BufferChecks.checkBuffer(params, 4);
/* 246 */     nglGetProgramLocalParameterfvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramLocalParameterfvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramLocalParameterARB(int target, int index, DoubleBuffer params) {
/* 251 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 252 */     long function_pointer = caps.ARB_program_glGetProgramLocalParameterdvARB_pointer;
/* 253 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 254 */     BufferChecks.checkBuffer(params, 4);
/* 255 */     nglGetProgramLocalParameterdvARB(target, index, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetProgramLocalParameterdvARB(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetProgramARB(int target, int parameterName, IntBuffer params) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.ARB_program_glGetProgramivARB_pointer;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     BufferChecks.checkBuffer(params, 4);
/* 264 */     nglGetProgramivARB(target, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetProgramivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetProgramARB(int target, int parameterName) {
/* 270 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 271 */     long function_pointer = caps.ARB_program_glGetProgramivARB_pointer;
/* 272 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 273 */     IntBuffer params = APIUtils.getBufferInt();
/* 274 */     nglGetProgramivARB(target, parameterName, params, params.position(), function_pointer);
/* 275 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetProgramStringARB(int target, int parameterName, ByteBuffer paramString) {
/* 279 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 280 */     long function_pointer = caps.ARB_program_glGetProgramStringARB_pointer;
/* 281 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 282 */     BufferChecks.checkDirect(paramString);
/* 283 */     nglGetProgramStringARB(target, parameterName, paramString, paramString.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetProgramStringARB(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static String glGetProgramStringARB(int target, int parameterName) {
/* 289 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 290 */     long function_pointer = caps.ARB_program_glGetProgramStringARB_pointer;
/* 291 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 292 */     int programLength = glGetProgramARB(target, 34343);
/* 293 */     ByteBuffer paramString = APIUtils.getBufferByte(programLength);
/* 294 */     nglGetProgramStringARB(target, parameterName, paramString, paramString.position(), function_pointer);
/* 295 */     paramString.limit(programLength);
/* 296 */     return APIUtils.getString(paramString);
/*     */   }
/*     */   
/*     */   public static boolean glIsProgramARB(int program) {
/* 300 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 301 */     long function_pointer = caps.ARB_program_glIsProgramARB_pointer;
/* 302 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 303 */     boolean __result = nglIsProgramARB(program, function_pointer);
/* 304 */     return __result;
/*     */   }
/*     */   
/*     */   private static native boolean nglIsProgramARB(int paramInt, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBProgram.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */