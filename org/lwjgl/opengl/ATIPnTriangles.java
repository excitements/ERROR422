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
/*    */ public final class ATIPnTriangles
/*    */ {
/*    */   public static final int GL_PN_TRIANGLES_ATI = 34800;
/*    */   public static final int GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 34801;
/*    */   public static final int GL_PN_TRIANGLES_POINT_MODE_ATI = 34802;
/*    */   public static final int GL_PN_TRIANGLES_NORMAL_MODE_ATI = 34803;
/*    */   public static final int GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI = 34804;
/*    */   public static final int GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI = 34805;
/*    */   public static final int GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI = 34806;
/*    */   public static final int GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI = 34807;
/*    */   public static final int GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI = 34808;
/*    */   
/*    */   public static void glPNTrianglesfATI(int pname, float param) {
/* 25 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 26 */     long function_pointer = caps.ATI_pn_triangles_glPNTrianglesfATI_pointer;
/* 27 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 28 */     nglPNTrianglesfATI(pname, param, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glPNTrianglesiATI(int pname, int param) {
/* 33 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 34 */     long function_pointer = caps.ATI_pn_triangles_glPNTrianglesiATI_pointer;
/* 35 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 36 */     nglPNTrianglesiATI(pname, param, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglPNTrianglesfATI(int paramInt, float paramFloat, long paramLong);
/*    */   
/*    */   private static native void nglPNTrianglesiATI(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIPnTriangles.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */