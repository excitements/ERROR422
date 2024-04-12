/*    */ package org.lwjgl.opengl;
/*    */ 
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
/*    */ public final class ARBInstancedArrays
/*    */ {
/*    */   public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB = 35070;
/*    */   
/*    */   public static void glVertexAttribDivisorARB(int index, int divisor) {
/* 21 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 22 */     long function_pointer = caps.ARB_instanced_arrays_glVertexAttribDivisorARB_pointer;
/* 23 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 24 */     nglVertexAttribDivisorARB(index, divisor, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglVertexAttribDivisorARB(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBInstancedArrays.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */