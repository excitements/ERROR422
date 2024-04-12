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
/*    */ 
/*    */ public final class ARBCopyBuffer
/*    */ {
/*    */   public static final int GL_COPY_READ_BUFFER = 36662;
/*    */   public static final int GL_COPY_WRITE_BUFFER = 36663;
/*    */   
/*    */   public static void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
/* 25 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 26 */     long function_pointer = caps.ARB_copy_buffer_glCopyBufferSubData_pointer;
/* 27 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 28 */     nglCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglCopyBufferSubData(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBCopyBuffer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */