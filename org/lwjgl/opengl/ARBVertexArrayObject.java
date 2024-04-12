/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.IntBuffer;
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
/*    */ public final class ARBVertexArrayObject
/*    */ {
/*    */   public static final int GL_VERTEX_ARRAY_BINDING = 34229;
/*    */   
/*    */   public static void glBindVertexArray(int array) {
/* 21 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 22 */     long function_pointer = caps.ARB_vertex_array_object_glBindVertexArray_pointer;
/* 23 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 24 */     nglBindVertexArray(array, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glDeleteVertexArrays(IntBuffer arrays) {
/* 29 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 30 */     long function_pointer = caps.ARB_vertex_array_object_glDeleteVertexArrays_pointer;
/* 31 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 32 */     BufferChecks.checkDirect(arrays);
/* 33 */     nglDeleteVertexArrays(arrays.remaining(), arrays, arrays.position(), function_pointer);
/*    */   }
/*    */   private static native void nglBindVertexArray(int paramInt, long paramLong);
/*    */   private static native void nglDeleteVertexArrays(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDeleteVertexArrays(int array) {
/* 39 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 40 */     long function_pointer = caps.ARB_vertex_array_object_glDeleteVertexArrays_pointer;
/* 41 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 42 */     nglDeleteVertexArrays(1, APIUtils.getBufferInt().put(0, array), 0, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glGenVertexArrays(IntBuffer arrays) {
/* 46 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 47 */     long function_pointer = caps.ARB_vertex_array_object_glGenVertexArrays_pointer;
/* 48 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 49 */     BufferChecks.checkDirect(arrays);
/* 50 */     nglGenVertexArrays(arrays.remaining(), arrays, arrays.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGenVertexArrays(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static int glGenVertexArrays() {
/* 56 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 57 */     long function_pointer = caps.ARB_vertex_array_object_glGenVertexArrays_pointer;
/* 58 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 59 */     IntBuffer arrays = APIUtils.getBufferInt();
/* 60 */     nglGenVertexArrays(1, arrays, arrays.position(), function_pointer);
/* 61 */     return arrays.get(0);
/*    */   }
/*    */   
/*    */   public static boolean glIsVertexArray(int array) {
/* 65 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 66 */     long function_pointer = caps.ARB_vertex_array_object_glIsVertexArray_pointer;
/* 67 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 68 */     boolean __result = nglIsVertexArray(array, function_pointer);
/* 69 */     return __result;
/*    */   }
/*    */   
/*    */   private static native boolean nglIsVertexArray(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBVertexArrayObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */