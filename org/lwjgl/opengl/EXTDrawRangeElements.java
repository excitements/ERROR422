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
/*    */ public final class EXTDrawRangeElements
/*    */ {
/*    */   public static final int GL_MAX_ELEMENTS_VERTICES_EXT = 33000;
/*    */   public static final int GL_MAX_ELEMENTS_INDICES_EXT = 33001;
/*    */   
/*    */   public static void glDrawRangeElementsEXT(int mode, int start, int end, ByteBuffer pIndices) {
/* 18 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 19 */     long function_pointer = caps.EXT_draw_range_elements_glDrawRangeElementsEXT_pointer;
/* 20 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 21 */     GLChecks.ensureElementVBOdisabled(caps);
/* 22 */     BufferChecks.checkDirect(pIndices);
/* 23 */     nglDrawRangeElementsEXT(mode, start, end, pIndices.remaining(), 5121, pIndices, pIndices.position(), function_pointer);
/*    */   }
/*    */   public static void glDrawRangeElementsEXT(int mode, int start, int end, IntBuffer pIndices) {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.EXT_draw_range_elements_glDrawRangeElementsEXT_pointer;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     GLChecks.ensureElementVBOdisabled(caps);
/* 30 */     BufferChecks.checkDirect(pIndices);
/* 31 */     nglDrawRangeElementsEXT(mode, start, end, pIndices.remaining(), 5125, pIndices, pIndices.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glDrawRangeElementsEXT(int mode, int start, int end, ShortBuffer pIndices) {
/* 34 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 35 */     long function_pointer = caps.EXT_draw_range_elements_glDrawRangeElementsEXT_pointer;
/* 36 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 37 */     GLChecks.ensureElementVBOdisabled(caps);
/* 38 */     BufferChecks.checkDirect(pIndices);
/* 39 */     nglDrawRangeElementsEXT(mode, start, end, pIndices.remaining(), 5123, pIndices, pIndices.position() << 1, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glDrawRangeElementsEXT(int mode, int start, int end, int count, int type, long pIndices_buffer_offset) {
/* 43 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 44 */     long function_pointer = caps.EXT_draw_range_elements_glDrawRangeElementsEXT_pointer;
/* 45 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 46 */     GLChecks.ensureElementVBOenabled(caps);
/* 47 */     nglDrawRangeElementsEXTBO(mode, start, end, count, type, pIndices_buffer_offset, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawRangeElementsEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*    */   
/*    */   private static native void nglDrawRangeElementsEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTDrawRangeElements.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */