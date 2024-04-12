/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTGpuProgramParameters
/*    */ {
/*    */   public static void glProgramEnvParameters4EXT(int target, int index, int count, FloatBuffer params) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.EXT_gpu_program_parameters_glProgramEnvParameters4fvEXT_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     BufferChecks.checkBuffer(params, count << 2);
/* 20 */     nglProgramEnvParameters4fvEXT(target, index, count, params, params.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glProgramLocalParameters4EXT(int target, int index, int count, FloatBuffer params) {
/* 25 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 26 */     long function_pointer = caps.EXT_gpu_program_parameters_glProgramLocalParameters4fvEXT_pointer;
/* 27 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 28 */     BufferChecks.checkBuffer(params, count << 2);
/* 29 */     nglProgramLocalParameters4fvEXT(target, index, count, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglProgramEnvParameters4fvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*    */   
/*    */   private static native void nglProgramLocalParameters4fvEXT(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTGpuProgramParameters.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */