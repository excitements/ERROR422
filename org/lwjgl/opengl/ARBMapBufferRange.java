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
/*    */ public final class ARBMapBufferRange
/*    */ {
/*    */   public static final int GL_MAP_READ_BIT = 1;
/*    */   public static final int GL_MAP_WRITE_BIT = 2;
/*    */   public static final int GL_MAP_INVALIDATE_RANGE_BIT = 4;
/*    */   public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 8;
/*    */   public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 16;
/*    */   public static final int GL_MAP_UNSYNCHRONIZED_BIT = 32;
/*    */   
/*    */   public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.ARB_map_buffer_range_glMapBufferRange_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     if (old_buffer != null)
/* 41 */       BufferChecks.checkDirect(old_buffer); 
/* 42 */     ByteBuffer __result = nglMapBufferRange(target, offset, length, access, old_buffer, function_pointer);
/* 43 */     return __result;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFlushMappedBufferRange(int target, long offset, long length) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.ARB_map_buffer_range_glFlushMappedBufferRange_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     nglFlushMappedBufferRange(target, offset, length, function_pointer);
/*    */   }
/*    */   
/*    */   private static native ByteBuffer nglMapBufferRange(int paramInt1, long paramLong1, long paramLong2, int paramInt2, ByteBuffer paramByteBuffer, long paramLong3);
/*    */   
/*    */   private static native void nglFlushMappedBufferRange(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBMapBufferRange.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */