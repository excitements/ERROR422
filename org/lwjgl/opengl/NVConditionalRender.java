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
/*    */ public final class NVConditionalRender
/*    */ {
/*    */   public static final int GL_QUERY_WAIT_NV = 36371;
/*    */   public static final int GL_QUERY_NO_WAIT_NV = 36372;
/*    */   public static final int GL_QUERY_BY_REGION_WAIT_NV = 36373;
/*    */   public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 36374;
/*    */   
/*    */   public static void glBeginConditionalRenderNV(int id, int mode) {
/* 23 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 24 */     long function_pointer = caps.NV_conditional_render_glBeginConditionalRenderNV_pointer;
/* 25 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 26 */     nglBeginConditionalRenderNV(id, mode, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glEndConditionalRenderNV() {
/* 31 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 32 */     long function_pointer = caps.NV_conditional_render_glEndConditionalRenderNV_pointer;
/* 33 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 34 */     nglEndConditionalRenderNV(function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBeginConditionalRenderNV(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   private static native void nglEndConditionalRenderNV(long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVConditionalRender.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */