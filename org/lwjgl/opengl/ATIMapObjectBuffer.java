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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ATIMapObjectBuffer
/*    */ {
/*    */   public static ByteBuffer glMapObjectBufferATI(int buffer, ByteBuffer old_buffer) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.ATI_map_object_buffer_glMapObjectBufferATI_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     if (old_buffer != null)
/* 41 */       BufferChecks.checkDirect(old_buffer); 
/* 42 */     ByteBuffer __result = nglMapObjectBufferATI(buffer, GLChecks.getBufferObjectSizeATI(caps, buffer), old_buffer, function_pointer);
/* 43 */     return __result;
/*    */   }
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
/*    */   public static ByteBuffer glMapObjectBufferATI(int buffer, long length, ByteBuffer old_buffer) {
/* 67 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 68 */     long function_pointer = caps.ATI_map_object_buffer_glMapObjectBufferATI_pointer;
/* 69 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 70 */     if (old_buffer != null)
/* 71 */       BufferChecks.checkDirect(old_buffer); 
/* 72 */     ByteBuffer __result = nglMapObjectBufferATI(buffer, length, old_buffer, function_pointer);
/* 73 */     return __result;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glUnmapObjectBufferATI(int buffer) {
/* 78 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 79 */     long function_pointer = caps.ATI_map_object_buffer_glUnmapObjectBufferATI_pointer;
/* 80 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 81 */     nglUnmapObjectBufferATI(buffer, function_pointer);
/*    */   }
/*    */   
/*    */   private static native ByteBuffer nglMapObjectBufferATI(int paramInt, long paramLong1, ByteBuffer paramByteBuffer, long paramLong2);
/*    */   
/*    */   private static native void nglUnmapObjectBufferATI(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIMapObjectBuffer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */