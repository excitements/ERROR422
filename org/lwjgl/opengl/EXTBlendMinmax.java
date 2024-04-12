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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTBlendMinmax
/*    */ {
/*    */   public static final int GL_FUNC_ADD_EXT = 32774;
/*    */   public static final int GL_MIN_EXT = 32775;
/*    */   public static final int GL_MAX_EXT = 32776;
/*    */   public static final int GL_BLEND_EQUATION_EXT = 32777;
/*    */   
/*    */   public static void glBlendEquationEXT(int mode) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.EXT_blend_minmax_glBlendEquationEXT_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglBlendEquationEXT(mode, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBlendEquationEXT(int paramInt, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTBlendMinmax.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */