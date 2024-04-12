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
/*    */ public final class NVPixelDataRange
/*    */ {
/*    */   public static final int GL_WRITE_PIXEL_DATA_RANGE_NV = 34936;
/*    */   public static final int GL_READ_PIXEL_DATA_RANGE_NV = 34937;
/*    */   public static final int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 34938;
/*    */   public static final int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = 34939;
/*    */   public static final int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 34940;
/*    */   public static final int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = 34941;
/*    */   
/*    */   public static void glPixelDataRangeNV(int target, ByteBuffer data) {
/* 34 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 35 */     long function_pointer = caps.NV_pixel_data_range_glPixelDataRangeNV_pointer;
/* 36 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 37 */     BufferChecks.checkDirect(data);
/* 38 */     nglPixelDataRangeNV(target, data.remaining(), data, data.position(), function_pointer);
/*    */   }
/*    */   public static void glPixelDataRangeNV(int target, DoubleBuffer data) {
/* 41 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 42 */     long function_pointer = caps.NV_pixel_data_range_glPixelDataRangeNV_pointer;
/* 43 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 44 */     BufferChecks.checkDirect(data);
/* 45 */     nglPixelDataRangeNV(target, data.remaining() << 3, data, data.position() << 3, function_pointer);
/*    */   }
/*    */   public static void glPixelDataRangeNV(int target, FloatBuffer data) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.NV_pixel_data_range_glPixelDataRangeNV_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     BufferChecks.checkDirect(data);
/* 52 */     nglPixelDataRangeNV(target, data.remaining() << 2, data, data.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glPixelDataRangeNV(int target, IntBuffer data) {
/* 55 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 56 */     long function_pointer = caps.NV_pixel_data_range_glPixelDataRangeNV_pointer;
/* 57 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 58 */     BufferChecks.checkDirect(data);
/* 59 */     nglPixelDataRangeNV(target, data.remaining() << 2, data, data.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glPixelDataRangeNV(int target, ShortBuffer data) {
/* 62 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 63 */     long function_pointer = caps.NV_pixel_data_range_glPixelDataRangeNV_pointer;
/* 64 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 65 */     BufferChecks.checkDirect(data);
/* 66 */     nglPixelDataRangeNV(target, data.remaining() << 1, data, data.position() << 1, function_pointer);
/*    */   }
/*    */   private static native void nglPixelDataRangeNV(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glFlushPixelDataRangeNV(int target) {
/* 71 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 72 */     long function_pointer = caps.NV_pixel_data_range_glFlushPixelDataRangeNV_pointer;
/* 73 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 74 */     nglFlushPixelDataRangeNV(target, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglFlushPixelDataRangeNV(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVPixelDataRange.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */