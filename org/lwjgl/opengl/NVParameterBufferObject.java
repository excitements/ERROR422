/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NVParameterBufferObject
/*    */ {
/*    */   public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV = 36256;
/*    */   public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV = 36257;
/*    */   public static final int GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV = 36258;
/*    */   public static final int GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV = 36259;
/*    */   public static final int GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV = 36260;
/*    */   
/*    */   private static native void nglProgramBufferParametersfvNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glProgramBufferParametersNV(int target, int buffer, int index, FloatBuffer params) {
/* 30 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 31 */     long function_pointer = caps.NV_parameter_buffer_object_glProgramBufferParametersfvNV_pointer;
/* 32 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 33 */     BufferChecks.checkDirect(params);
/* 34 */     nglProgramBufferParametersfvNV(target, buffer, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glProgramBufferParametersINV(int target, int buffer, int index, IntBuffer params) {
/* 39 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 40 */     long function_pointer = caps.NV_parameter_buffer_object_glProgramBufferParametersIivNV_pointer;
/* 41 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 42 */     BufferChecks.checkDirect(params);
/* 43 */     nglProgramBufferParametersIivNV(target, buffer, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glProgramBufferParametersIuNV(int target, int buffer, int index, IntBuffer params) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.NV_parameter_buffer_object_glProgramBufferParametersIuivNV_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     BufferChecks.checkDirect(params);
/* 52 */     nglProgramBufferParametersIuivNV(target, buffer, index, params.remaining() >> 2, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglProgramBufferParametersIivNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*    */   
/*    */   private static native void nglProgramBufferParametersIuivNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVParameterBufferObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */