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
/*    */ public final class NVGeometryProgram4
/*    */ {
/*    */   public static final int GL_GEOMETRY_PROGRAM_NV = 35878;
/*    */   public static final int GL_MAX_PROGRAM_OUTPUT_VERTICES_NV = 35879;
/*    */   public static final int GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV = 35880;
/*    */   
/*    */   private static native void nglProgramVertexLimitNV(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glProgramVertexLimitNV(int target, int limit) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.NV_geometry_program4_glProgramVertexLimitNV_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglProgramVertexLimitNV(target, limit, function_pointer);
/*    */   }
/*    */   private static native void nglFramebufferTextureEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */   
/*    */   public static void glFramebufferTextureEXT(int target, int attachment, int texture, int level) {
/* 35 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 36 */     long function_pointer = caps.NV_geometry_program4_glFramebufferTextureEXT_pointer;
/* 37 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 38 */     nglFramebufferTextureEXT(target, attachment, texture, level, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFramebufferTextureLayerEXT(int target, int attachment, int texture, int level, int layer) {
/* 43 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 44 */     long function_pointer = caps.NV_geometry_program4_glFramebufferTextureLayerEXT_pointer;
/* 45 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 46 */     nglFramebufferTextureLayerEXT(target, attachment, texture, level, layer, function_pointer);
/*    */   }
/*    */   private static native void nglFramebufferTextureLayerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glFramebufferTextureFaceEXT(int target, int attachment, int texture, int level, int face) {
/* 51 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 52 */     long function_pointer = caps.NV_geometry_program4_glFramebufferTextureFaceEXT_pointer;
/* 53 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 54 */     nglFramebufferTextureFaceEXT(target, attachment, texture, level, face, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglFramebufferTextureFaceEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVGeometryProgram4.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */