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
/*    */ public final class AMDDrawBuffersBlend
/*    */ {
/*    */   private static native void nglBlendFuncIndexedAMD(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glBlendFuncIndexedAMD(int buf, int src, int dst) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.AMD_draw_buffers_blend_glBlendFuncIndexedAMD_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     nglBlendFuncIndexedAMD(buf, src, dst, function_pointer);
/*    */   }
/*    */   private static native void nglBlendFuncSeparateIndexedAMD(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glBlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.AMD_draw_buffers_blend_glBlendFuncSeparateIndexedAMD_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     nglBlendFuncSeparateIndexedAMD(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glBlendEquationIndexedAMD(int buf, int mode) {
/* 32 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 33 */     long function_pointer = caps.AMD_draw_buffers_blend_glBlendEquationIndexedAMD_pointer;
/* 34 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 35 */     nglBlendEquationIndexedAMD(buf, mode, function_pointer);
/*    */   }
/*    */   private static native void nglBlendEquationIndexedAMD(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glBlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha) {
/* 40 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 41 */     long function_pointer = caps.AMD_draw_buffers_blend_glBlendEquationSeparateIndexedAMD_pointer;
/* 42 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 43 */     nglBlendEquationSeparateIndexedAMD(buf, modeRGB, modeAlpha, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBlendEquationSeparateIndexedAMD(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\AMDDrawBuffersBlend.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */