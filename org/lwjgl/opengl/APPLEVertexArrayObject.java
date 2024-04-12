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
/*    */ public final class APPLEVertexArrayObject
/*    */ {
/*    */   public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 34229;
/*    */   
/*    */   public static void glBindVertexArrayAPPLE(int array) {
/* 21 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 22 */     long function_pointer = caps.APPLE_vertex_array_object_glBindVertexArrayAPPLE_pointer;
/* 23 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 24 */     nglBindVertexArrayAPPLE(array, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glDeleteVertexArraysAPPLE(IntBuffer arrays) {
/* 29 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 30 */     long function_pointer = caps.APPLE_vertex_array_object_glDeleteVertexArraysAPPLE_pointer;
/* 31 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 32 */     BufferChecks.checkDirect(arrays);
/* 33 */     nglDeleteVertexArraysAPPLE(arrays.remaining(), arrays, arrays.position(), function_pointer);
/*    */   }
/*    */   private static native void nglBindVertexArrayAPPLE(int paramInt, long paramLong);
/*    */   private static native void nglDeleteVertexArraysAPPLE(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDeleteVertexArraysAPPLE(int array) {
/* 39 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 40 */     long function_pointer = caps.APPLE_vertex_array_object_glDeleteVertexArraysAPPLE_pointer;
/* 41 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 42 */     nglDeleteVertexArraysAPPLE(1, APIUtils.getBufferInt().put(0, array), 0, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glGenVertexArraysAPPLE(IntBuffer arrays) {
/* 46 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 47 */     long function_pointer = caps.APPLE_vertex_array_object_glGenVertexArraysAPPLE_pointer;
/* 48 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 49 */     BufferChecks.checkDirect(arrays);
/* 50 */     nglGenVertexArraysAPPLE(arrays.remaining(), arrays, arrays.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGenVertexArraysAPPLE(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static int glGenVertexArraysAPPLE() {
/* 56 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 57 */     long function_pointer = caps.APPLE_vertex_array_object_glGenVertexArraysAPPLE_pointer;
/* 58 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 59 */     IntBuffer arrays = APIUtils.getBufferInt();
/* 60 */     nglGenVertexArraysAPPLE(1, arrays, arrays.position(), function_pointer);
/* 61 */     return arrays.get(0);
/*    */   }
/*    */   
/*    */   public static boolean glIsVertexArrayAPPLE(int array) {
/* 65 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 66 */     long function_pointer = caps.APPLE_vertex_array_object_glIsVertexArrayAPPLE_pointer;
/* 67 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 68 */     boolean __result = nglIsVertexArrayAPPLE(array, function_pointer);
/* 69 */     return __result;
/*    */   }
/*    */   
/*    */   private static native boolean nglIsVertexArrayAPPLE(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLEVertexArrayObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */