/*    */ package org.lwjgl.opengl;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NVPrimitiveRestart
/*    */ {
/*    */   public static final int GL_PRIMITIVE_RESTART_NV = 34136;
/*    */   public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 34137;
/*    */   
/*    */   public static void glPrimitiveRestartNV() {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.NV_primitive_restart_glPrimitiveRestartNV_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     nglPrimitiveRestartNV(function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glPrimitiveRestartIndexNV(int index) {
/* 36 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 37 */     long function_pointer = caps.NV_primitive_restart_glPrimitiveRestartIndexNV_pointer;
/* 38 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 39 */     nglPrimitiveRestartIndexNV(index, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglPrimitiveRestartNV(long paramLong);
/*    */   
/*    */   private static native void nglPrimitiveRestartIndexNV(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVPrimitiveRestart.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */