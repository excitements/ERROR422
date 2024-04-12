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
/*     */ public final class ARBShaderSubroutine
/*     */ {
/*     */   public static final int GL_ACTIVE_SUBROUTINES = 36325;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 36326;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 36423;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 36424;
/*     */   public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 36425;
/*     */   public static final int GL_MAX_SUBROUTINES = 36327;
/*     */   public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 36328;
/*     */   public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 36426;
/*     */   public static final int GL_COMPATIBLE_SUBROUTINES = 36427;
/*     */   public static final int GL_UNIFORM_SIZE = 35384;
/*     */   public static final int GL_UNIFORM_NAME_LENGTH = 35385;
/*     */   
/*     */   private static native int nglGetSubroutineUniformLocation(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
/*  37 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  38 */     long function_pointer = caps.ARB_shader_subroutine_glGetSubroutineUniformLocation_pointer;
/*  39 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  40 */     BufferChecks.checkDirect(name);
/*  41 */     BufferChecks.checkNullTerminated(name);
/*  42 */     int __result = nglGetSubroutineUniformLocation(program, shadertype, name, name.position(), function_pointer);
/*  43 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
/*  48 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  49 */     long function_pointer = caps.ARB_shader_subroutine_glGetSubroutineIndex_pointer;
/*  50 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  51 */     BufferChecks.checkDirect(name);
/*  52 */     BufferChecks.checkNullTerminated(name);
/*  53 */     int __result = nglGetSubroutineIndex(program, shadertype, name, name.position(), function_pointer);
/*  54 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname, IntBuffer values) {
/*  59 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  60 */     long function_pointer = caps.ARB_shader_subroutine_glGetActiveSubroutineUniformiv_pointer;
/*  61 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  62 */     BufferChecks.checkBuffer(values, 1);
/*  63 */     nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values, values.position(), function_pointer);
/*     */   }
/*     */   private static native int nglGetSubroutineIndex(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   private static native void nglGetActiveSubroutineUniformiv(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static int glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname) {
/*  69 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  70 */     long function_pointer = caps.ARB_shader_subroutine_glGetActiveSubroutineUniformiv_pointer;
/*  71 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  72 */     IntBuffer values = APIUtils.getBufferInt();
/*  73 */     nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values, values.position(), function_pointer);
/*  74 */     return values.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
/*  78 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  79 */     long function_pointer = caps.ARB_shader_subroutine_glGetActiveSubroutineUniformName_pointer;
/*  80 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  81 */     if (length != null)
/*  82 */       BufferChecks.checkBuffer(length, 1); 
/*  83 */     BufferChecks.checkDirect(name);
/*  84 */     nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), length, (length != null) ? length.position() : 0, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveSubroutineUniformName(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, ByteBuffer paramByteBuffer, int paramInt6, long paramLong);
/*     */   
/*     */   public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.ARB_shader_subroutine_glGetActiveSubroutineUniformName_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     IntBuffer name_length = APIUtils.getLengths();
/*  94 */     ByteBuffer name = APIUtils.getBufferByte(bufsize);
/*  95 */     nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, name_length, 0, name, name.position(), function_pointer);
/*  96 */     name.limit(name_length.get(0));
/*  97 */     return APIUtils.getString(name);
/*     */   }
/*     */   
/*     */   public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
/* 101 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 102 */     long function_pointer = caps.ARB_shader_subroutine_glGetActiveSubroutineName_pointer;
/* 103 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 104 */     if (length != null)
/* 105 */       BufferChecks.checkBuffer(length, 1); 
/* 106 */     BufferChecks.checkDirect(name);
/* 107 */     nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), length, (length != null) ? length.position() : 0, name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetActiveSubroutineName(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, ByteBuffer paramByteBuffer, int paramInt6, long paramLong);
/*     */   
/*     */   public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
/* 113 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 114 */     long function_pointer = caps.ARB_shader_subroutine_glGetActiveSubroutineName_pointer;
/* 115 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 116 */     IntBuffer name_length = APIUtils.getLengths();
/* 117 */     ByteBuffer name = APIUtils.getBufferByte(bufsize);
/* 118 */     nglGetActiveSubroutineName(program, shadertype, index, bufsize, name_length, 0, name, name.position(), function_pointer);
/* 119 */     name.limit(name_length.get(0));
/* 120 */     return APIUtils.getString(name);
/*     */   }
/*     */   
/*     */   public static void glUniformSubroutinesu(int shadertype, IntBuffer indices) {
/* 124 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 125 */     long function_pointer = caps.ARB_shader_subroutine_glUniformSubroutinesuiv_pointer;
/* 126 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 127 */     BufferChecks.checkDirect(indices);
/* 128 */     nglUniformSubroutinesuiv(shadertype, indices.remaining(), indices, indices.position(), function_pointer);
/*     */   }
/*     */   private static native void nglUniformSubroutinesuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetUniformSubroutineu(int shadertype, int location, IntBuffer params) {
/* 133 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 134 */     long function_pointer = caps.ARB_shader_subroutine_glGetUniformSubroutineuiv_pointer;
/* 135 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 136 */     BufferChecks.checkBuffer(params, 1);
/* 137 */     nglGetUniformSubroutineuiv(shadertype, location, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetUniformSubroutineuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetUniformSubroutineu(int shadertype, int location) {
/* 143 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 144 */     long function_pointer = caps.ARB_shader_subroutine_glGetUniformSubroutineuiv_pointer;
/* 145 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 146 */     IntBuffer params = APIUtils.getBufferInt();
/* 147 */     nglGetUniformSubroutineuiv(shadertype, location, params, params.position(), function_pointer);
/* 148 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetProgramStage(int program, int shadertype, int pname, IntBuffer values) {
/* 152 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 153 */     long function_pointer = caps.ARB_shader_subroutine_glGetProgramStageiv_pointer;
/* 154 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 155 */     BufferChecks.checkBuffer(values, 1);
/* 156 */     nglGetProgramStageiv(program, shadertype, pname, values, values.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetProgramStageiv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetProgramStage(int program, int shadertype, int pname) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.ARB_shader_subroutine_glGetProgramStageiv_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     IntBuffer values = APIUtils.getBufferInt();
/* 166 */     nglGetProgramStageiv(program, shadertype, pname, values, values.position(), function_pointer);
/* 167 */     return values.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBShaderSubroutine.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */