/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.DoubleBuffer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NVFragmentProgram
/*    */   extends NVProgram
/*    */ {
/*    */   public static final int GL_FRAGMENT_PROGRAM_NV = 34928;
/*    */   public static final int GL_MAX_TEXTURE_COORDS_NV = 34929;
/*    */   public static final int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 34930;
/*    */   public static final int GL_FRAGMENT_PROGRAM_BINDING_NV = 34931;
/*    */   public static final int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 34920;
/*    */   
/*    */   private static native void nglProgramNamedParameter4fNV(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*    */   
/*    */   public static void glProgramNamedParameter4fNV(int id, ByteBuffer name, float x, float y, float z, float w) {
/* 33 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 34 */     long function_pointer = caps.NV_fragment_program_glProgramNamedParameter4fNV_pointer;
/* 35 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 36 */     BufferChecks.checkDirect(name);
/* 37 */     nglProgramNamedParameter4fNV(id, name.remaining(), name, name.position(), x, y, z, w, function_pointer);
/*    */   }
/*    */   private static native void nglProgramNamedParameter4dNV(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*    */   
/*    */   public static void glProgramNamedParameter4dNV(int id, ByteBuffer name, double x, double y, double z, double w) {
/* 42 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 43 */     long function_pointer = caps.NV_fragment_program_glProgramNamedParameter4dNV_pointer;
/* 44 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 45 */     BufferChecks.checkDirect(name);
/* 46 */     nglProgramNamedParameter4dNV(id, name.remaining(), name, name.position(), x, y, z, w, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetProgramNamedParameterNV(int id, ByteBuffer name, FloatBuffer params) {
/* 51 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 52 */     long function_pointer = caps.NV_fragment_program_glGetProgramNamedParameterfvNV_pointer;
/* 53 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 54 */     BufferChecks.checkDirect(name);
/* 55 */     BufferChecks.checkBuffer(params, 4);
/* 56 */     nglGetProgramNamedParameterfvNV(id, name.remaining(), name, name.position(), params, params.position(), function_pointer);
/*    */   }
/*    */   private static native void nglGetProgramNamedParameterfvNV(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*    */   
/*    */   public static void glGetProgramNamedParameterNV(int id, ByteBuffer name, DoubleBuffer params) {
/* 61 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 62 */     long function_pointer = caps.NV_fragment_program_glGetProgramNamedParameterdvNV_pointer;
/* 63 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 64 */     BufferChecks.checkDirect(name);
/* 65 */     BufferChecks.checkBuffer(params, 4);
/* 66 */     nglGetProgramNamedParameterdvNV(id, name.remaining(), name, name.position(), params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetProgramNamedParameterdvNV(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVFragmentProgram.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */