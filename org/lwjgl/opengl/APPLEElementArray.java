/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import java.nio.ByteBuffer;
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
/*    */ 
/*    */ public final class APPLEElementArray
/*    */ {
/*    */   public static final int GL_ELEMENT_ARRAY_APPLE = 34664;
/*    */   public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 34665;
/*    */   public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 34666;
/*    */   
/*    */   public static void glElementPointerAPPLE(ByteBuffer pointer) {
/* 30 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 31 */     long function_pointer = caps.APPLE_element_array_glElementPointerAPPLE_pointer;
/* 32 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 33 */     BufferChecks.checkDirect(pointer);
/* 34 */     nglElementPointerAPPLE(5121, pointer, pointer.position(), function_pointer);
/*    */   }
/*    */   public static void glElementPointerAPPLE(IntBuffer pointer) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.APPLE_element_array_glElementPointerAPPLE_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     BufferChecks.checkDirect(pointer);
/* 41 */     nglElementPointerAPPLE(5125, pointer, pointer.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glElementPointerAPPLE(ShortBuffer pointer) {
/* 44 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 45 */     long function_pointer = caps.APPLE_element_array_glElementPointerAPPLE_pointer;
/* 46 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 47 */     BufferChecks.checkDirect(pointer);
/* 48 */     nglElementPointerAPPLE(5123, pointer, pointer.position() << 1, function_pointer);
/*    */   }
/*    */   private static native void nglElementPointerAPPLE(int paramInt1, Buffer paramBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDrawElementArrayAPPLE(int mode, int first, int count) {
/* 53 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 54 */     long function_pointer = caps.APPLE_element_array_glDrawElementArrayAPPLE_pointer;
/* 55 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 56 */     nglDrawElementArrayAPPLE(mode, first, count, function_pointer);
/*    */   }
/*    */   private static native void nglDrawElementArrayAPPLE(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glDrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
/* 61 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 62 */     long function_pointer = caps.APPLE_element_array_glDrawRangeElementArrayAPPLE_pointer;
/* 63 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 64 */     nglDrawRangeElementArrayAPPLE(mode, start, end, first, count, function_pointer);
/*    */   }
/*    */   private static native void nglDrawRangeElementArrayAPPLE(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*    */   
/*    */   public static void glMultiDrawElementArrayAPPLE(int mode, IntBuffer first, IntBuffer count) {
/* 69 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 70 */     long function_pointer = caps.APPLE_element_array_glMultiDrawElementArrayAPPLE_pointer;
/* 71 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 72 */     BufferChecks.checkDirect(first);
/* 73 */     BufferChecks.checkBuffer(count, first.remaining());
/* 74 */     nglMultiDrawElementArrayAPPLE(mode, first, first.position(), count, count.position(), first.remaining(), function_pointer);
/*    */   }
/*    */   private static native void nglMultiDrawElementArrayAPPLE(int paramInt1, IntBuffer paramIntBuffer1, int paramInt2, IntBuffer paramIntBuffer2, int paramInt3, int paramInt4, long paramLong);
/*    */   
/*    */   public static void glMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, IntBuffer first, IntBuffer count) {
/* 79 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 80 */     long function_pointer = caps.APPLE_element_array_glMultiDrawRangeElementArrayAPPLE_pointer;
/* 81 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 82 */     BufferChecks.checkDirect(first);
/* 83 */     BufferChecks.checkBuffer(count, first.remaining());
/* 84 */     nglMultiDrawRangeElementArrayAPPLE(mode, start, end, first, first.position(), count, count.position(), first.remaining(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglMultiDrawRangeElementArrayAPPLE(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, int paramInt6, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLEElementArray.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */