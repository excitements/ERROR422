/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
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
/*     */ public class NVProgram
/*     */ {
/*     */   public static final int GL_PROGRAM_TARGET_NV = 34374;
/*     */   public static final int GL_PROGRAM_LENGTH_NV = 34343;
/*     */   public static final int GL_PROGRAM_RESIDENT_NV = 34375;
/*     */   public static final int GL_PROGRAM_STRING_NV = 34344;
/*     */   public static final int GL_PROGRAM_ERROR_POSITION_NV = 34379;
/*     */   public static final int GL_PROGRAM_ERROR_STRING_NV = 34932;
/*     */   
/*     */   public static void glLoadProgramNV(int target, int programID, ByteBuffer string) {
/*  32 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  33 */     long function_pointer = caps.NV_program_glLoadProgramNV_pointer;
/*  34 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  35 */     BufferChecks.checkDirect(string);
/*  36 */     nglLoadProgramNV(target, programID, string.remaining(), string, string.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglLoadProgramNV(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glLoadProgramNV(int target, int programID, CharSequence string) {
/*  42 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  43 */     long function_pointer = caps.NV_program_glLoadProgramNV_pointer;
/*  44 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  45 */     nglLoadProgramNV(target, programID, string.length(), APIUtils.getBuffer(string), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glBindProgramNV(int target, int programID) {
/*  49 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  50 */     long function_pointer = caps.NV_program_glBindProgramNV_pointer;
/*  51 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  52 */     nglBindProgramNV(target, programID, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDeleteProgramsNV(IntBuffer programs) {
/*  57 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  58 */     long function_pointer = caps.NV_program_glDeleteProgramsNV_pointer;
/*  59 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  60 */     BufferChecks.checkDirect(programs);
/*  61 */     nglDeleteProgramsNV(programs.remaining(), programs, programs.position(), function_pointer);
/*     */   }
/*     */   private static native void nglBindProgramNV(int paramInt1, int paramInt2, long paramLong);
/*     */   private static native void nglDeleteProgramsNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteProgramsNV(int program) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.NV_program_glDeleteProgramsNV_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     nglDeleteProgramsNV(1, APIUtils.getBufferInt().put(0, program), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenProgramsNV(IntBuffer programs) {
/*  74 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  75 */     long function_pointer = caps.NV_program_glGenProgramsNV_pointer;
/*  76 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  77 */     BufferChecks.checkDirect(programs);
/*  78 */     nglGenProgramsNV(programs.remaining(), programs, programs.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenProgramsNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenProgramsNV() {
/*  84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  85 */     long function_pointer = caps.NV_program_glGenProgramsNV_pointer;
/*  86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  87 */     IntBuffer programs = APIUtils.getBufferInt();
/*  88 */     nglGenProgramsNV(1, programs, programs.position(), function_pointer);
/*  89 */     return programs.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetProgramNV(int programID, int parameterName, IntBuffer params) {
/*  93 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  94 */     long function_pointer = caps.NV_program_glGetProgramivNV_pointer;
/*  95 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  96 */     BufferChecks.checkDirect(params);
/*  97 */     nglGetProgramivNV(programID, parameterName, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetProgramivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetProgramNV(int programID, int parameterName) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.NV_program_glGetProgramivNV_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     IntBuffer params = APIUtils.getBufferInt();
/* 107 */     nglGetProgramivNV(programID, parameterName, params, params.position(), function_pointer);
/* 108 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetProgramStringNV(int programID, int parameterName, ByteBuffer paramString) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.NV_program_glGetProgramStringNV_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     BufferChecks.checkDirect(paramString);
/* 116 */     nglGetProgramStringNV(programID, parameterName, paramString, paramString.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetProgramStringNV(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static String glGetProgramStringNV(int programID, int parameterName) {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.NV_program_glGetProgramStringNV_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     int programLength = glGetProgramNV(programID, 34343);
/* 126 */     ByteBuffer paramString = APIUtils.getBufferByte(programLength);
/* 127 */     nglGetProgramStringNV(programID, parameterName, paramString, paramString.position(), function_pointer);
/* 128 */     paramString.limit(programLength);
/* 129 */     return APIUtils.getString(paramString);
/*     */   }
/*     */   
/*     */   public static boolean glIsProgramNV(int programID) {
/* 133 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 134 */     long function_pointer = caps.NV_program_glIsProgramNV_pointer;
/* 135 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 136 */     boolean __result = nglIsProgramNV(programID, function_pointer);
/* 137 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsProgramNV(int paramInt, long paramLong);
/*     */   
/*     */   public static boolean glAreProgramsResidentNV(IntBuffer programIDs, ByteBuffer programResidences) {
/* 142 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 143 */     long function_pointer = caps.NV_program_glAreProgramsResidentNV_pointer;
/* 144 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 145 */     BufferChecks.checkDirect(programIDs);
/* 146 */     BufferChecks.checkBuffer(programResidences, programIDs.remaining());
/* 147 */     boolean __result = nglAreProgramsResidentNV(programIDs.remaining(), programIDs, programIDs.position(), programResidences, programResidences.position(), function_pointer);
/* 148 */     return __result;
/*     */   }
/*     */   private static native boolean nglAreProgramsResidentNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glRequestResidentProgramsNV(IntBuffer programIDs) {
/* 153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 154 */     long function_pointer = caps.NV_program_glRequestResidentProgramsNV_pointer;
/* 155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 156 */     BufferChecks.checkDirect(programIDs);
/* 157 */     nglRequestResidentProgramsNV(programIDs.remaining(), programIDs, programIDs.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglRequestResidentProgramsNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glRequestResidentProgramsNV(int programID) {
/* 163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 164 */     long function_pointer = caps.NV_program_glRequestResidentProgramsNV_pointer;
/* 165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 166 */     nglRequestResidentProgramsNV(1, APIUtils.getBufferInt().put(0, programID), 0, function_pointer);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVProgram.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */