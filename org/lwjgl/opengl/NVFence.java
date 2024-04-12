/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NVFence
/*    */ {
/*    */   public static final int GL_ALL_COMPLETED_NV = 34034;
/*    */   public static final int GL_FENCE_STATUS_NV = 34035;
/*    */   public static final int GL_FENCE_CONDITION_NV = 34036;
/*    */   
/*    */   private static native void nglGenFencesNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glGenFencesNV(IntBuffer piFences) {
/* 19 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 20 */     long function_pointer = caps.NV_fence_glGenFencesNV_pointer;
/* 21 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 22 */     BufferChecks.checkDirect(piFences);
/* 23 */     nglGenFencesNV(piFences.remaining(), piFences, piFences.position(), function_pointer);
/*    */   }
/*    */   private static native void nglDeleteFencesNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDeleteFencesNV(IntBuffer piFences) {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.NV_fence_glDeleteFencesNV_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     BufferChecks.checkDirect(piFences);
/* 32 */     nglDeleteFencesNV(piFences.remaining(), piFences, piFences.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glSetFenceNV(int fence, int condition) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.NV_fence_glSetFenceNV_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     nglSetFenceNV(fence, condition, function_pointer);
/*    */   }
/*    */   private static native void nglSetFenceNV(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static boolean glTestFenceNV(int fence) {
/* 45 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 46 */     long function_pointer = caps.NV_fence_glTestFenceNV_pointer;
/* 47 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 48 */     boolean __result = nglTestFenceNV(fence, function_pointer);
/* 49 */     return __result;
/*    */   }
/*    */   private static native boolean nglTestFenceNV(int paramInt, long paramLong);
/*    */   
/*    */   public static void glFinishFenceNV(int fence) {
/* 54 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 55 */     long function_pointer = caps.NV_fence_glFinishFenceNV_pointer;
/* 56 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 57 */     nglFinishFenceNV(fence, function_pointer);
/*    */   }
/*    */   private static native void nglFinishFenceNV(int paramInt, long paramLong);
/*    */   
/*    */   public static boolean glIsFenceNV(int fence) {
/* 62 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 63 */     long function_pointer = caps.NV_fence_glIsFenceNV_pointer;
/* 64 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 65 */     boolean __result = nglIsFenceNV(fence, function_pointer);
/* 66 */     return __result;
/*    */   }
/*    */   private static native boolean nglIsFenceNV(int paramInt, long paramLong);
/*    */   
/*    */   public static void glGetFenceivNV(int fence, int pname, IntBuffer piParams) {
/* 71 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 72 */     long function_pointer = caps.NV_fence_glGetFenceivNV_pointer;
/* 73 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 74 */     BufferChecks.checkBuffer(piParams, 4);
/* 75 */     nglGetFenceivNV(fence, pname, piParams, piParams.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetFenceivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVFence.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */