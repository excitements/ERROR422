/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class APPLEVertexArrayRange
/*    */ {
/*    */   public static final int GL_VERTEX_ARRAY_RANGE_APPLE = 34077;
/*    */   public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE = 34078;
/*    */   public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_APPLE = 34080;
/*    */   public static final int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = 34081;
/*    */   public static final int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = 34079;
/*    */   public static final int GL_STORAGE_CACHED_APPLE = 34238;
/*    */   public static final int GL_STORAGE_SHARED_APPLE = 34239;
/*    */   public static final int GL_DRAW_PIXELS_APPLE = 35338;
/*    */   public static final int GL_FENCE_APPLE = 35339;
/*    */   
/*    */   private static native void nglVertexArrayRangeAPPLE(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glVertexArrayRangeAPPLE(ByteBuffer pointer) {
/* 46 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 47 */     long function_pointer = caps.APPLE_vertex_array_range_glVertexArrayRangeAPPLE_pointer;
/* 48 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 49 */     BufferChecks.checkDirect(pointer);
/* 50 */     nglVertexArrayRangeAPPLE(pointer.remaining(), pointer, pointer.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFlushVertexArrayRangeAPPLE(ByteBuffer pointer) {
/* 55 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 56 */     long function_pointer = caps.APPLE_vertex_array_range_glFlushVertexArrayRangeAPPLE_pointer;
/* 57 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 58 */     BufferChecks.checkDirect(pointer);
/* 59 */     nglFlushVertexArrayRangeAPPLE(pointer.remaining(), pointer, pointer.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glVertexArrayParameteriAPPLE(int pname, int param) {
/* 64 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 65 */     long function_pointer = caps.APPLE_vertex_array_range_glVertexArrayParameteriAPPLE_pointer;
/* 66 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 67 */     nglVertexArrayParameteriAPPLE(pname, param, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglFlushVertexArrayRangeAPPLE(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   private static native void nglVertexArrayParameteriAPPLE(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLEVertexArrayRange.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */