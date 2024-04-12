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
/*    */ public final class EXTCompiledVertexArray
/*    */ {
/*    */   public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 33192;
/*    */   public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 33193;
/*    */   
/*    */   public static void glLockArraysEXT(int first, int count) {
/* 18 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 19 */     long function_pointer = caps.EXT_compiled_vertex_array_glLockArraysEXT_pointer;
/* 20 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 21 */     nglLockArraysEXT(first, count, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glUnlockArraysEXT() {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.EXT_compiled_vertex_array_glUnlockArraysEXT_pointer;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     nglUnlockArraysEXT(function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglLockArraysEXT(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   private static native void nglUnlockArraysEXT(long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTCompiledVertexArray.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */