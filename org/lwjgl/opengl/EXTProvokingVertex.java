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
/*    */ public final class EXTProvokingVertex
/*    */ {
/*    */   public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 36429;
/*    */   public static final int GL_LAST_VERTEX_CONVENTION_EXT = 36430;
/*    */   public static final int GL_PROVOKING_VERTEX_EXT = 36431;
/*    */   public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 36428;
/*    */   
/*    */   public static void glProvokingVertexEXT(int mode) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.EXT_provoking_vertex_glProvokingVertexEXT_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglProvokingVertexEXT(mode, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglProvokingVertexEXT(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTProvokingVertex.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */