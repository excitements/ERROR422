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
/*    */ public final class EXTMultiDrawArrays
/*    */ {
/*    */   public static void glMultiDrawArraysEXT(int mode, IntBuffer piFirst, IntBuffer piCount) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.EXT_multi_draw_arrays_glMultiDrawArraysEXT_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     BufferChecks.checkDirect(piFirst);
/* 20 */     BufferChecks.checkBuffer(piCount, piFirst.remaining());
/* 21 */     nglMultiDrawArraysEXT(mode, piFirst, piFirst.position(), piCount, piCount.position(), piFirst.remaining(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglMultiDrawArraysEXT(int paramInt1, IntBuffer paramIntBuffer1, int paramInt2, IntBuffer paramIntBuffer2, int paramInt3, int paramInt4, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTMultiDrawArrays.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */