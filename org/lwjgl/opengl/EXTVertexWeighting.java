/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTVertexWeighting
/*    */ {
/*    */   public static final int GL_MODELVIEW0_STACK_DEPTH_EXT = 2979;
/*    */   public static final int GL_MODELVIEW1_STACK_DEPTH_EXT = 34050;
/*    */   public static final int GL_MODELVIEW0_MATRIX_EXT = 2982;
/*    */   public static final int GL_MODELVIEW1_MATRIX_EXT = 34054;
/*    */   public static final int GL_VERTEX_WEIGHTING_EXT = 34057;
/*    */   public static final int GL_MODELVIEW0_EXT = 5888;
/*    */   public static final int GL_MODELVIEW1_EXT = 34058;
/*    */   public static final int GL_CURRENT_VERTEX_WEIGHT_EXT = 34059;
/*    */   public static final int GL_VERTEX_WEIGHT_ARRAY_EXT = 34060;
/*    */   public static final int GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT = 34061;
/*    */   public static final int GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT = 34062;
/*    */   public static final int GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT = 34063;
/*    */   public static final int GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT = 34064;
/*    */   
/*    */   public static void glVertexWeightfEXT(float weight) {
/* 29 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 30 */     long function_pointer = caps.EXT_vertex_weighting_glVertexWeightfEXT_pointer;
/* 31 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 32 */     nglVertexWeightfEXT(weight, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glVertexWeightPointerEXT(int size, int stride, FloatBuffer pPointer) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.EXT_vertex_weighting_glVertexWeightPointerEXT_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 41 */     BufferChecks.checkDirect(pPointer);
/* 42 */     (GLChecks.getReferences(caps)).EXT_vertex_weighting_glVertexWeightPointerEXT_pPointer = pPointer;
/* 43 */     nglVertexWeightPointerEXT(size, 5126, stride, pPointer, pPointer.position() << 2, function_pointer);
/*    */   }
/*    */   private static native void nglVertexWeightfEXT(float paramFloat, long paramLong);
/*    */   public static void glVertexWeightPointerEXT(int size, int type, int stride, long pPointer_buffer_offset) {
/* 47 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 48 */     long function_pointer = caps.EXT_vertex_weighting_glVertexWeightPointerEXT_pointer;
/* 49 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 50 */     GLChecks.ensureArrayVBOenabled(caps);
/* 51 */     nglVertexWeightPointerEXTBO(size, type, stride, pPointer_buffer_offset, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglVertexWeightPointerEXT(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*    */   
/*    */   private static native void nglVertexWeightPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTVertexWeighting.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */