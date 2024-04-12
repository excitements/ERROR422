/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.DoubleBuffer;
/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import java.nio.ShortBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ public final class NVVertexArrayRange
/*    */ {
/*    */   public static final int GL_VERTEX_ARRAY_RANGE_NV = 34077;
/*    */   public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 34078;
/*    */   public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = 34079;
/*    */   public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 34080;
/*    */   public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 34081;
/*    */   
/*    */   public static void glVertexArrayRangeNV(ByteBuffer pPointer) {
/* 21 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 22 */     long function_pointer = caps.NV_vertex_array_range_glVertexArrayRangeNV_pointer;
/* 23 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 24 */     BufferChecks.checkDirect(pPointer);
/* 25 */     nglVertexArrayRangeNV(pPointer.remaining(), pPointer, pPointer.position(), function_pointer);
/*    */   }
/*    */   public static void glVertexArrayRangeNV(DoubleBuffer pPointer) {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.NV_vertex_array_range_glVertexArrayRangeNV_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     BufferChecks.checkDirect(pPointer);
/* 32 */     nglVertexArrayRangeNV(pPointer.remaining() << 3, pPointer, pPointer.position() << 3, function_pointer);
/*    */   }
/*    */   public static void glVertexArrayRangeNV(FloatBuffer pPointer) {
/* 35 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 36 */     long function_pointer = caps.NV_vertex_array_range_glVertexArrayRangeNV_pointer;
/* 37 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 38 */     BufferChecks.checkDirect(pPointer);
/* 39 */     nglVertexArrayRangeNV(pPointer.remaining() << 2, pPointer, pPointer.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glVertexArrayRangeNV(IntBuffer pPointer) {
/* 42 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 43 */     long function_pointer = caps.NV_vertex_array_range_glVertexArrayRangeNV_pointer;
/* 44 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 45 */     BufferChecks.checkDirect(pPointer);
/* 46 */     nglVertexArrayRangeNV(pPointer.remaining() << 2, pPointer, pPointer.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glVertexArrayRangeNV(ShortBuffer pPointer) {
/* 49 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 50 */     long function_pointer = caps.NV_vertex_array_range_glVertexArrayRangeNV_pointer;
/* 51 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 52 */     BufferChecks.checkDirect(pPointer);
/* 53 */     nglVertexArrayRangeNV(pPointer.remaining() << 1, pPointer, pPointer.position() << 1, function_pointer);
/*    */   }
/*    */   private static native void nglVertexArrayRangeNV(int paramInt1, Buffer paramBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glFlushVertexArrayRangeNV() {
/* 58 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 59 */     long function_pointer = caps.NV_vertex_array_range_glFlushVertexArrayRangeNV_pointer;
/* 60 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 61 */     nglFlushVertexArrayRangeNV(function_pointer);
/*    */   }
/*    */   private static native void nglFlushVertexArrayRangeNV(long paramLong);
/*    */   
/*    */   public static ByteBuffer glAllocateMemoryNV(int size, float readFrequency, float writeFrequency, float priority) {
/* 66 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 67 */     long function_pointer = caps.NV_vertex_array_range_glAllocateMemoryNV_pointer;
/* 68 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 69 */     ByteBuffer __result = nglAllocateMemoryNV(size, readFrequency, writeFrequency, priority, size, function_pointer);
/* 70 */     return __result;
/*    */   }
/*    */   private static native ByteBuffer nglAllocateMemoryNV(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong1, long paramLong2);
/*    */   
/*    */   public static void glFreeMemoryNV(ByteBuffer pointer) {
/* 75 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 76 */     long function_pointer = caps.NV_vertex_array_range_glFreeMemoryNV_pointer;
/* 77 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 78 */     BufferChecks.checkDirect(pointer);
/* 79 */     nglFreeMemoryNV(pointer, pointer.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglFreeMemoryNV(Buffer paramBuffer, int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVVertexArrayRange.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */