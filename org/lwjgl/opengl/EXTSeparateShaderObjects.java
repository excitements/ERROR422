/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTSeparateShaderObjects
/*    */ {
/*    */   public static final int GL_ACTIVE_PROGRAM_EXT = 35725;
/*    */   
/*    */   private static native void nglUseShaderProgramEXT(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glUseShaderProgramEXT(int type, int program) {
/* 20 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 21 */     long function_pointer = caps.EXT_separate_shader_objects_glUseShaderProgramEXT_pointer;
/* 22 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 23 */     nglUseShaderProgramEXT(type, program, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glActiveProgramEXT(int program) {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.EXT_separate_shader_objects_glActiveProgramEXT_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     nglActiveProgramEXT(program, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glCreateShaderProgramEXT(int type, ByteBuffer string) {
/* 36 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 37 */     long function_pointer = caps.EXT_separate_shader_objects_glCreateShaderProgramEXT_pointer;
/* 38 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 39 */     BufferChecks.checkDirect(string);
/* 40 */     BufferChecks.checkNullTerminated(string);
/* 41 */     int __result = nglCreateShaderProgramEXT(type, string, string.position(), function_pointer);
/* 42 */     return __result;
/*    */   }
/*    */   private static native void nglActiveProgramEXT(int paramInt, long paramLong);
/*    */   private static native int nglCreateShaderProgramEXT(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static int glCreateShaderProgramEXT(int type, CharSequence string) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.EXT_separate_shader_objects_glCreateShaderProgramEXT_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     int __result = nglCreateShaderProgramEXT(type, APIUtils.getBufferNT(string), 0, function_pointer);
/* 52 */     return __result;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTSeparateShaderObjects.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */