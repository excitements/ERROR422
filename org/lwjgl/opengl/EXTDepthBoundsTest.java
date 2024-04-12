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
/*    */ public final class EXTDepthBoundsTest
/*    */ {
/*    */   public static final int GL_DEPTH_BOUNDS_TEST_EXT = 34960;
/*    */   public static final int GL_DEPTH_BOUNDS_EXT = 34961;
/*    */   
/*    */   public static void glDepthBoundsEXT(double zmin, double zmax) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.EXT_depth_bounds_test_glDepthBoundsEXT_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglDepthBoundsEXT(zmin, zmax, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDepthBoundsEXT(double paramDouble1, double paramDouble2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTDepthBoundsTest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */