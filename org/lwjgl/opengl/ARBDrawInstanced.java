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
/*    */ public final class ARBDrawInstanced
/*    */ {
/*    */   private static native void nglDrawArraysInstancedARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*    */   
/*    */   public static void glDrawArraysInstancedARB(int mode, int first, int count, int primcount) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.ARB_draw_instanced_glDrawArraysInstancedARB_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     nglDrawArraysInstancedARB(mode, first, count, primcount, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glDrawElementsInstancedARB(int mode, ByteBuffer indices, int primcount) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.ARB_draw_instanced_glDrawElementsInstancedARB_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     GLChecks.ensureElementVBOdisabled(caps);
/* 28 */     BufferChecks.checkDirect(indices);
/* 29 */     nglDrawElementsInstancedARB(mode, indices.remaining(), 5121, indices, indices.position(), primcount, function_pointer);
/*    */   }
/*    */   public static void glDrawElementsInstancedARB(int mode, IntBuffer indices, int primcount) {
/* 32 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 33 */     long function_pointer = caps.ARB_draw_instanced_glDrawElementsInstancedARB_pointer;
/* 34 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 35 */     GLChecks.ensureElementVBOdisabled(caps);
/* 36 */     BufferChecks.checkDirect(indices);
/* 37 */     nglDrawElementsInstancedARB(mode, indices.remaining(), 5125, indices, indices.position() << 2, primcount, function_pointer);
/*    */   }
/*    */   public static void glDrawElementsInstancedARB(int mode, ShortBuffer indices, int primcount) {
/* 40 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 41 */     long function_pointer = caps.ARB_draw_instanced_glDrawElementsInstancedARB_pointer;
/* 42 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 43 */     GLChecks.ensureElementVBOdisabled(caps);
/* 44 */     BufferChecks.checkDirect(indices);
/* 45 */     nglDrawElementsInstancedARB(mode, indices.remaining(), 5123, indices, indices.position() << 1, primcount, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glDrawElementsInstancedARB(int mode, int count, int type, long indices_buffer_offset, int primcount) {
/* 49 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 50 */     long function_pointer = caps.ARB_draw_instanced_glDrawElementsInstancedARB_pointer;
/* 51 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 52 */     GLChecks.ensureElementVBOenabled(caps);
/* 53 */     nglDrawElementsInstancedARBBO(mode, count, type, indices_buffer_offset, primcount, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawElementsInstancedARB(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, int paramInt5, long paramLong);
/*    */   
/*    */   private static native void nglDrawElementsInstancedARBBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBDrawInstanced.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */