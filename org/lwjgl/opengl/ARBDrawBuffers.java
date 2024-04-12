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
/*    */ public final class ARBDrawBuffers
/*    */ {
/*    */   public static final int GL_MAX_DRAW_BUFFERS_ARB = 34852;
/*    */   public static final int GL_DRAW_BUFFER0_ARB = 34853;
/*    */   public static final int GL_DRAW_BUFFER1_ARB = 34854;
/*    */   public static final int GL_DRAW_BUFFER2_ARB = 34855;
/*    */   public static final int GL_DRAW_BUFFER3_ARB = 34856;
/*    */   public static final int GL_DRAW_BUFFER4_ARB = 34857;
/*    */   public static final int GL_DRAW_BUFFER5_ARB = 34858;
/*    */   public static final int GL_DRAW_BUFFER6_ARB = 34859;
/*    */   public static final int GL_DRAW_BUFFER7_ARB = 34860;
/*    */   public static final int GL_DRAW_BUFFER8_ARB = 34861;
/*    */   public static final int GL_DRAW_BUFFER9_ARB = 34862;
/*    */   public static final int GL_DRAW_BUFFER10_ARB = 34863;
/*    */   public static final int GL_DRAW_BUFFER11_ARB = 34864;
/*    */   public static final int GL_DRAW_BUFFER12_ARB = 34865;
/*    */   public static final int GL_DRAW_BUFFER13_ARB = 34866;
/*    */   public static final int GL_DRAW_BUFFER14_ARB = 34867;
/*    */   public static final int GL_DRAW_BUFFER15_ARB = 34868;
/*    */   
/*    */   public static void glDrawBuffersARB(IntBuffer buffers) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.ARB_draw_buffers_glDrawBuffersARB_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     BufferChecks.checkDirect(buffers);
/* 41 */     nglDrawBuffersARB(buffers.remaining(), buffers, buffers.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawBuffersARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDrawBuffersARB(int buffer) {
/* 47 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 48 */     long function_pointer = caps.ARB_draw_buffers_glDrawBuffersARB_pointer;
/* 49 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 50 */     nglDrawBuffersARB(1, APIUtils.getBufferInt().put(0, buffer), 0, function_pointer);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBDrawBuffers.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */