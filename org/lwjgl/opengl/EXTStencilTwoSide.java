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
/*    */ public final class EXTStencilTwoSide
/*    */ {
/*    */   public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = 35088;
/*    */   public static final int GL_ACTIVE_STENCIL_FACE_EXT = 35089;
/*    */   
/*    */   public static void glActiveStencilFaceEXT(int face) {
/* 18 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 19 */     long function_pointer = caps.EXT_stencil_two_side_glActiveStencilFaceEXT_pointer;
/* 20 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 21 */     nglActiveStencilFaceEXT(face, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglActiveStencilFaceEXT(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTStencilTwoSide.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */