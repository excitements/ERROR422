/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ATIEnvmapBumpmap
/*    */ {
/*    */   public static final int GL_BUMP_ROT_MATRIX_ATI = 34677;
/*    */   public static final int GL_BUMP_ROT_MATRIX_SIZE_ATI = 34678;
/*    */   public static final int GL_BUMP_NUM_TEX_UNITS_ATI = 34679;
/*    */   public static final int GL_BUMP_TEX_UNITS_ATI = 34680;
/*    */   public static final int GL_DUDV_ATI = 34681;
/*    */   public static final int GL_DU8DV8_ATI = 34682;
/*    */   public static final int GL_BUMP_ENVMAP_ATI = 34683;
/*    */   public static final int GL_BUMP_TARGET_ATI = 34684;
/*    */   
/*    */   private static native void nglTexBumpParameterfvATI(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glTexBumpParameterATI(int pname, FloatBuffer param) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.ATI_envmap_bumpmap_glTexBumpParameterfvATI_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     BufferChecks.checkBuffer(param, 4);
/* 28 */     nglTexBumpParameterfvATI(pname, param, param.position(), function_pointer);
/*    */   }
/*    */   private static native void nglTexBumpParameterivATI(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glTexBumpParameterATI(int pname, IntBuffer param) {
/* 33 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 34 */     long function_pointer = caps.ATI_envmap_bumpmap_glTexBumpParameterivATI_pointer;
/* 35 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 36 */     BufferChecks.checkBuffer(param, 4);
/* 37 */     nglTexBumpParameterivATI(pname, param, param.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetTexBumpParameterATI(int pname, FloatBuffer param) {
/* 42 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 43 */     long function_pointer = caps.ATI_envmap_bumpmap_glGetTexBumpParameterfvATI_pointer;
/* 44 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 45 */     BufferChecks.checkBuffer(param, 4);
/* 46 */     nglGetTexBumpParameterfvATI(pname, param, param.position(), function_pointer);
/*    */   }
/*    */   private static native void nglGetTexBumpParameterfvATI(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glGetTexBumpParameterATI(int pname, IntBuffer param) {
/* 51 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 52 */     long function_pointer = caps.ATI_envmap_bumpmap_glGetTexBumpParameterivATI_pointer;
/* 53 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 54 */     BufferChecks.checkBuffer(param, 4);
/* 55 */     nglGetTexBumpParameterivATI(pname, param, param.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetTexBumpParameterivATI(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIEnvmapBumpmap.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */