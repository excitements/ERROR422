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
/*    */ public final class ARBProvokingVertex
/*    */ {
/*    */   public static final int GL_FIRST_VERTEX_CONVENTION = 36429;
/*    */   public static final int GL_LAST_VERTEX_CONVENTION = 36430;
/*    */   public static final int GL_PROVOKING_VERTEX = 36431;
/*    */   public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 36428;
/*    */   
/*    */   public static void glProvokingVertex(int mode) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.ARB_provoking_vertex_glProvokingVertex_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglProvokingVertex(mode, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglProvokingVertex(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBProvokingVertex.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */