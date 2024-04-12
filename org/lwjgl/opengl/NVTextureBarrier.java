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
/*    */ public final class NVTextureBarrier
/*    */ {
/*    */   public static void glTextureBarrierNV() {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.NV_texture_barrier_glTextureBarrierNV_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     nglTextureBarrierNV(function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglTextureBarrierNV(long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVTextureBarrier.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */