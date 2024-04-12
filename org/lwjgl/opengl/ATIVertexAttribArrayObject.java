/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ATIVertexAttribArrayObject
/*    */ {
/*    */   private static native void nglVertexAttribArrayObjectATI(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*    */   
/*    */   public static void glVertexAttribArrayObjectATI(int index, int size, int type, boolean normalized, int stride, int buffer, int offset) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.ATI_vertex_attrib_array_object_glVertexAttribArrayObjectATI_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     nglVertexAttribArrayObjectATI(index, size, type, normalized, stride, buffer, offset, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetVertexAttribArrayObjectATI(int index, int pname, FloatBuffer params) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.ATI_vertex_attrib_array_object_glGetVertexAttribArrayObjectfvATI_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     BufferChecks.checkBuffer(params, 4);
/* 28 */     nglGetVertexAttribArrayObjectfvATI(index, pname, params, params.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetVertexAttribArrayObjectATI(int index, int pname, IntBuffer params) {
/* 33 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 34 */     long function_pointer = caps.ATI_vertex_attrib_array_object_glGetVertexAttribArrayObjectivATI_pointer;
/* 35 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 36 */     BufferChecks.checkBuffer(params, 4);
/* 37 */     nglGetVertexAttribArrayObjectivATI(index, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetVertexAttribArrayObjectfvATI(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   private static native void nglGetVertexAttribArrayObjectivATI(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIVertexAttribArrayObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */