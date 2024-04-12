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
/*    */ public final class ATIElementArray
/*    */ {
/*    */   public static final int GL_ELEMENT_ARRAY_ATI = 34664;
/*    */   public static final int GL_ELEMENT_ARRAY_TYPE_ATI = 34665;
/*    */   public static final int GL_ELEMENT_ARRAY_POINTER_ATI = 34666;
/*    */   
/*    */   public static void glElementPointerATI(ByteBuffer pPointer) {
/* 19 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 20 */     long function_pointer = caps.ATI_element_array_glElementPointerATI_pointer;
/* 21 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 22 */     BufferChecks.checkDirect(pPointer);
/* 23 */     nglElementPointerATI(5121, pPointer, pPointer.position(), function_pointer);
/*    */   }
/*    */   public static void glElementPointerATI(IntBuffer pPointer) {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.ATI_element_array_glElementPointerATI_pointer;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     BufferChecks.checkDirect(pPointer);
/* 30 */     nglElementPointerATI(5125, pPointer, pPointer.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glElementPointerATI(ShortBuffer pPointer) {
/* 33 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 34 */     long function_pointer = caps.ATI_element_array_glElementPointerATI_pointer;
/* 35 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 36 */     BufferChecks.checkDirect(pPointer);
/* 37 */     nglElementPointerATI(5123, pPointer, pPointer.position() << 1, function_pointer);
/*    */   }
/*    */   private static native void nglElementPointerATI(int paramInt1, Buffer paramBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDrawElementArrayATI(int mode, int count) {
/* 42 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 43 */     long function_pointer = caps.ATI_element_array_glDrawElementArrayATI_pointer;
/* 44 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 45 */     nglDrawElementArrayATI(mode, count, function_pointer);
/*    */   }
/*    */   private static native void nglDrawElementArrayATI(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDrawRangeElementArrayATI(int mode, int start, int end, int count) {
/* 50 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 51 */     long function_pointer = caps.ATI_element_array_glDrawRangeElementArrayATI_pointer;
/* 52 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 53 */     nglDrawRangeElementArrayATI(mode, start, end, count, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawRangeElementArrayATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIElementArray.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */