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
/*    */ public final class EXTBlendColor
/*    */ {
/*    */   public static final int GL_CONSTANT_COLOR_EXT = 32769;
/*    */   public static final int GL_ONE_MINUS_CONSTANT_COLOR_EXT = 32770;
/*    */   public static final int GL_CONSTANT_ALPHA_EXT = 32771;
/*    */   public static final int GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 32772;
/*    */   public static final int GL_BLEND_COLOR_EXT = 32773;
/*    */   
/*    */   public static void glBlendColorEXT(float red, float green, float blue, float alpha) {
/* 28 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 29 */     long function_pointer = caps.EXT_blend_color_glBlendColorEXT_pointer;
/* 30 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 31 */     nglBlendColorEXT(red, green, blue, alpha, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglBlendColorEXT(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTBlendColor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */