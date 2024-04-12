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
/*    */ public final class ARBDrawBuffersBlend
/*    */ {
/*    */   private static native void nglBlendEquationiARB(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glBlendEquationiARB(int buf, int mode) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.ARB_draw_buffers_blend_glBlendEquationiARB_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     nglBlendEquationiARB(buf, mode, function_pointer);
/*    */   }
/*    */   private static native void nglBlendEquationSeparateiARB(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glBlendEquationSeparateiARB(int buf, int modeRGB, int modeAlpha) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.ARB_draw_buffers_blend_glBlendEquationSeparateiARB_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     nglBlendEquationSeparateiARB(buf, modeRGB, modeAlpha, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glBlendFunciARB(int buf, int src, int dst) {
/* 32 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 33 */     long function_pointer = caps.ARB_draw_buffers_blend_glBlendFunciARB_pointer;
/* 34 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 35 */     nglBlendFunciARB(buf, src, dst, function_pointer);
/*    */   }
/*    */   private static native void nglBlendFunciARB(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glBlendFuncSeparateiARB(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
/* 40 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 41 */     long function_pointer = caps.ARB_draw_buffers_blend_glBlendFuncSeparateiARB_pointer;
/* 42 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 43 */     nglBlendFuncSeparateiARB(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBlendFuncSeparateiARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBDrawBuffersBlend.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */