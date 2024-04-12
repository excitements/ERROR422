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
/*    */ 
/*    */ 
/*    */ public final class EXTStencilClearTag
/*    */ {
/*    */   public static final int GL_STENCIL_TAG_BITS_EXT = 35058;
/*    */   public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = 35059;
/*    */   
/*    */   public static void glStencilClearTagEXT(int stencilTagBits, int stencilClearTag) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.EXT_stencil_clear_tag_glStencilClearTagEXT_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglStencilClearTagEXT(stencilTagBits, stencilClearTag, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglStencilClearTagEXT(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTStencilClearTag.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */