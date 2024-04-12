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
/*    */ public final class ATIDrawBuffers
/*    */ {
/*    */   public static final int GL_MAX_DRAW_BUFFERS_ATI = 34852;
/*    */   public static final int GL_DRAW_BUFFER0_ATI = 34853;
/*    */   public static final int GL_DRAW_BUFFER1_ATI = 34854;
/*    */   public static final int GL_DRAW_BUFFER2_ATI = 34855;
/*    */   public static final int GL_DRAW_BUFFER3_ATI = 34856;
/*    */   public static final int GL_DRAW_BUFFER4_ATI = 34857;
/*    */   public static final int GL_DRAW_BUFFER5_ATI = 34858;
/*    */   public static final int GL_DRAW_BUFFER6_ATI = 34859;
/*    */   public static final int GL_DRAW_BUFFER7_ATI = 34860;
/*    */   public static final int GL_DRAW_BUFFER8_ATI = 34861;
/*    */   public static final int GL_DRAW_BUFFER9_ATI = 34862;
/*    */   public static final int GL_DRAW_BUFFER10_ATI = 34863;
/*    */   public static final int GL_DRAW_BUFFER11_ATI = 34864;
/*    */   public static final int GL_DRAW_BUFFER12_ATI = 34865;
/*    */   public static final int GL_DRAW_BUFFER13_ATI = 34866;
/*    */   public static final int GL_DRAW_BUFFER14_ATI = 34867;
/*    */   public static final int GL_DRAW_BUFFER15_ATI = 34868;
/*    */   
/*    */   public static void glDrawBuffersATI(IntBuffer buffers) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.ATI_draw_buffers_glDrawBuffersATI_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     BufferChecks.checkDirect(buffers);
/* 41 */     nglDrawBuffersATI(buffers.remaining(), buffers, buffers.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawBuffersATI(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDrawBuffersATI(int buffer) {
/* 47 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 48 */     long function_pointer = caps.ATI_draw_buffers_glDrawBuffersATI_pointer;
/* 49 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 50 */     nglDrawBuffersATI(1, APIUtils.getBufferInt().put(0, buffer), 0, function_pointer);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIDrawBuffers.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */