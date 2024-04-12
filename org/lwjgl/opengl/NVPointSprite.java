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
/*    */ public final class NVPointSprite
/*    */ {
/*    */   public static final int GL_POINT_SPRITE_NV = 34913;
/*    */   public static final int GL_COORD_REPLACE_NV = 34914;
/*    */   public static final int GL_POINT_SPRITE_R_MODE_NV = 34915;
/*    */   
/*    */   public static void glPointParameteriNV(int pname, int param) {
/* 19 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 20 */     long function_pointer = caps.NV_point_sprite_glPointParameteriNV_pointer;
/* 21 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 22 */     nglPointParameteriNV(pname, param, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glPointParameterNV(int pname, IntBuffer params) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.NV_point_sprite_glPointParameterivNV_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     BufferChecks.checkBuffer(params, 4);
/* 31 */     nglPointParameterivNV(pname, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglPointParameteriNV(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   private static native void nglPointParameterivNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVPointSprite.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */