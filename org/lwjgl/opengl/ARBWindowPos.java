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
/*    */ public final class ARBWindowPos
/*    */ {
/*    */   private static native void nglWindowPos2fARB(float paramFloat1, float paramFloat2, long paramLong);
/*    */   
/*    */   public static void glWindowPos2fARB(float x, float y) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.ARB_window_pos_glWindowPos2fARB_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     nglWindowPos2fARB(x, y, function_pointer);
/*    */   }
/*    */   private static native void nglWindowPos2dARB(double paramDouble1, double paramDouble2, long paramLong);
/*    */   
/*    */   public static void glWindowPos2dARB(double x, double y) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.ARB_window_pos_glWindowPos2dARB_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     nglWindowPos2dARB(x, y, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glWindowPos2iARB(int x, int y) {
/* 32 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 33 */     long function_pointer = caps.ARB_window_pos_glWindowPos2iARB_pointer;
/* 34 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 35 */     nglWindowPos2iARB(x, y, function_pointer);
/*    */   }
/*    */   private static native void nglWindowPos2iARB(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glWindowPos2sARB(short x, short y) {
/* 40 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 41 */     long function_pointer = caps.ARB_window_pos_glWindowPos2sARB_pointer;
/* 42 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 43 */     nglWindowPos2sARB(x, y, function_pointer);
/*    */   }
/*    */   private static native void nglWindowPos2sARB(short paramShort1, short paramShort2, long paramLong);
/*    */   
/*    */   public static void glWindowPos3fARB(float x, float y, float z) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.ARB_window_pos_glWindowPos3fARB_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     nglWindowPos3fARB(x, y, z, function_pointer);
/*    */   }
/*    */   private static native void nglWindowPos3fARB(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*    */   
/*    */   public static void glWindowPos3dARB(double x, double y, double z) {
/* 56 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 57 */     long function_pointer = caps.ARB_window_pos_glWindowPos3dARB_pointer;
/* 58 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 59 */     nglWindowPos3dARB(x, y, z, function_pointer);
/*    */   }
/*    */   private static native void nglWindowPos3dARB(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*    */   
/*    */   public static void glWindowPos3iARB(int x, int y, int z) {
/* 64 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 65 */     long function_pointer = caps.ARB_window_pos_glWindowPos3iARB_pointer;
/* 66 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 67 */     nglWindowPos3iARB(x, y, z, function_pointer);
/*    */   }
/*    */   private static native void nglWindowPos3iARB(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glWindowPos3sARB(short x, short y, short z) {
/* 72 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 73 */     long function_pointer = caps.ARB_window_pos_glWindowPos3sARB_pointer;
/* 74 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 75 */     nglWindowPos3sARB(x, y, z, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglWindowPos3sARB(short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBWindowPos.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */