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
/*    */ public final class APPLEFlushBufferRange
/*    */ {
/*    */   public static final int GL_BUFFER_SERIALIZED_MODIFY_APPLE = 35346;
/*    */   public static final int GL_BUFFER_FLUSHING_UNMAP_APPLE = 35347;
/*    */   
/*    */   public static void glBufferParameteriAPPLE(int target, int pname, int param) {
/* 22 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 23 */     long function_pointer = caps.APPLE_flush_buffer_range_glBufferParameteriAPPLE_pointer;
/* 24 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 25 */     nglBufferParameteriAPPLE(target, pname, param, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFlushMappedBufferRangeAPPLE(int target, long offset, long size) {
/* 30 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 31 */     long function_pointer = caps.APPLE_flush_buffer_range_glFlushMappedBufferRangeAPPLE_pointer;
/* 32 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 33 */     nglFlushMappedBufferRangeAPPLE(target, offset, size, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBufferParameteriAPPLE(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   private static native void nglFlushMappedBufferRangeAPPLE(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLEFlushBufferRange.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */