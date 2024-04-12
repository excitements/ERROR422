/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTDrawBuffers2
/*    */ {
/*    */   public static void glColorMaskIndexedEXT(int buf, boolean r, boolean g, boolean b, boolean a) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.EXT_draw_buffers2_glColorMaskIndexedEXT_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     nglColorMaskIndexedEXT(buf, r, g, b, a, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetBooleanIndexedEXT(int value, int index, ByteBuffer data) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.EXT_draw_buffers2_glGetBooleanIndexedvEXT_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     BufferChecks.checkBuffer(data, 4);
/* 28 */     nglGetBooleanIndexedvEXT(value, index, data, data.position(), function_pointer);
/*    */   }
/*    */   private static native void nglColorMaskIndexedEXT(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong);
/*    */   private static native void nglGetBooleanIndexedvEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   public static boolean glGetBooleanIndexedEXT(int value, int index) {
/* 34 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 35 */     long function_pointer = caps.EXT_draw_buffers2_glGetBooleanIndexedvEXT_pointer;
/* 36 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 37 */     ByteBuffer data = APIUtils.getBufferByte(1);
/* 38 */     nglGetBooleanIndexedvEXT(value, index, data, data.position(), function_pointer);
/* 39 */     return (data.get(0) == 1);
/*    */   }
/*    */   
/*    */   public static void glGetIntegerIndexedEXT(int value, int index, IntBuffer data) {
/* 43 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 44 */     long function_pointer = caps.EXT_draw_buffers2_glGetIntegerIndexedvEXT_pointer;
/* 45 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 46 */     BufferChecks.checkBuffer(data, 4);
/* 47 */     nglGetIntegerIndexedvEXT(value, index, data, data.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetIntegerIndexedvEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   public static int glGetIntegerIndexedEXT(int value, int index) {
/* 53 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 54 */     long function_pointer = caps.EXT_draw_buffers2_glGetIntegerIndexedvEXT_pointer;
/* 55 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 56 */     IntBuffer data = APIUtils.getBufferInt();
/* 57 */     nglGetIntegerIndexedvEXT(value, index, data, data.position(), function_pointer);
/* 58 */     return data.get(0);
/*    */   }
/*    */   
/*    */   public static void glEnableIndexedEXT(int target, int index) {
/* 62 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 63 */     long function_pointer = caps.EXT_draw_buffers2_glEnableIndexedEXT_pointer;
/* 64 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 65 */     nglEnableIndexedEXT(target, index, function_pointer);
/*    */   }
/*    */   private static native void nglEnableIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDisableIndexedEXT(int target, int index) {
/* 70 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 71 */     long function_pointer = caps.EXT_draw_buffers2_glDisableIndexedEXT_pointer;
/* 72 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 73 */     nglDisableIndexedEXT(target, index, function_pointer);
/*    */   }
/*    */   private static native void nglDisableIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static boolean glIsEnabledIndexedEXT(int target, int index) {
/* 78 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 79 */     long function_pointer = caps.EXT_draw_buffers2_glIsEnabledIndexedEXT_pointer;
/* 80 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 81 */     boolean __result = nglIsEnabledIndexedEXT(target, index, function_pointer);
/* 82 */     return __result;
/*    */   }
/*    */   
/*    */   private static native boolean nglIsEnabledIndexedEXT(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTDrawBuffers2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */