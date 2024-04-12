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
/*    */ public final class ARBBlendFuncExtended
/*    */ {
/*    */   public static final int GL_SRC1_COLOR = 35065;
/*    */   public static final int GL_SRC1_ALPHA = 34185;
/*    */   public static final int GL_ONE_MINUS_SRC1_COLOR = 35066;
/*    */   public static final int GL_ONE_MINUS_SRC1_ALPHA = 35067;
/*    */   public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 35068;
/*    */   
/*    */   public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name) {
/* 30 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 31 */     long function_pointer = caps.ARB_blend_func_extended_glBindFragDataLocationIndexed_pointer;
/* 32 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 33 */     BufferChecks.checkDirect(name);
/* 34 */     BufferChecks.checkNullTerminated(name);
/* 35 */     nglBindFragDataLocationIndexed(program, colorNumber, index, name, name.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBindFragDataLocationIndexed(int paramInt1, int paramInt2, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*    */   
/*    */   public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
/* 41 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 42 */     long function_pointer = caps.ARB_blend_func_extended_glBindFragDataLocationIndexed_pointer;
/* 43 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 44 */     nglBindFragDataLocationIndexed(program, colorNumber, index, APIUtils.getBufferNT(name), 0, function_pointer);
/*    */   }
/*    */   
/*    */   public static int glGetFragDataIndex(int program, ByteBuffer name) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.ARB_blend_func_extended_glGetFragDataIndex_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     BufferChecks.checkDirect(name);
/* 52 */     BufferChecks.checkNullTerminated(name);
/* 53 */     int __result = nglGetFragDataIndex(program, name, name.position(), function_pointer);
/* 54 */     return __result;
/*    */   }
/*    */   
/*    */   private static native int nglGetFragDataIndex(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static int glGetFragDataIndex(int program, CharSequence name) {
/* 60 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 61 */     long function_pointer = caps.ARB_blend_func_extended_glGetFragDataIndex_pointer;
/* 62 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 63 */     int __result = nglGetFragDataIndex(program, APIUtils.getBufferNT(name), 0, function_pointer);
/* 64 */     return __result;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBBlendFuncExtended.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */