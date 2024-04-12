/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.IntBuffer;
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
/*    */ public final class ARBDrawIndirect
/*    */ {
/*    */   public static final int GL_DRAW_INDIRECT_BUFFER = 36671;
/*    */   public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 36675;
/*    */   
/*    */   private static native void nglDrawArraysIndirect(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDrawArraysIndirect(int mode, IntBuffer indirect) {
/* 29 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 30 */     long function_pointer = caps.ARB_draw_indirect_glDrawArraysIndirect_pointer;
/* 31 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 32 */     GLChecks.ensureIndirectBOdisabled(caps);
/* 33 */     BufferChecks.checkBuffer(indirect, 4);
/* 34 */     BufferChecks.checkNullTerminated(indirect);
/* 35 */     nglDrawArraysIndirect(mode, indirect, indirect.position(), function_pointer);
/*    */   }
/*    */   
/*    */   public static void glDrawArraysIndirect(int mode, long indirect_buffer_offset) {
/* 39 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 40 */     long function_pointer = caps.ARB_draw_indirect_glDrawArraysIndirect_pointer;
/* 41 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 42 */     GLChecks.ensureIndirectBOenabled(caps);
/* 43 */     nglDrawArraysIndirectBO(mode, indirect_buffer_offset, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.ARB_draw_indirect_glDrawElementsIndirect_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     GLChecks.ensureIndirectBOdisabled(caps);
/* 52 */     BufferChecks.checkBuffer(indirect, 5);
/* 53 */     BufferChecks.checkNullTerminated(indirect);
/* 54 */     nglDrawElementsIndirect(mode, type, indirect, indirect.position(), function_pointer);
/*    */   }
/*    */   private static native void nglDrawArraysIndirectBO(int paramInt, long paramLong1, long paramLong2);
/*    */   public static void glDrawElementsIndirect(int mode, int type, long indirect_buffer_offset) {
/* 58 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 59 */     long function_pointer = caps.ARB_draw_indirect_glDrawElementsIndirect_pointer;
/* 60 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 61 */     GLChecks.ensureIndirectBOenabled(caps);
/* 62 */     nglDrawElementsIndirectBO(mode, type, indirect_buffer_offset, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawElementsIndirect(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   private static native void nglDrawElementsIndirectBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBDrawIndirect.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */