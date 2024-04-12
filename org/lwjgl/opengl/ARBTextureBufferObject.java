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
/*    */ 
/*    */ 
/*    */ public final class ARBTextureBufferObject
/*    */ {
/*    */   public static final int GL_TEXTURE_BUFFER_ARB = 35882;
/*    */   public static final int GL_MAX_TEXTURE_BUFFER_SIZE_ARB = 35883;
/*    */   public static final int GL_TEXTURE_BINDING_BUFFER_ARB = 35884;
/*    */   public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 35885;
/*    */   public static final int GL_TEXTURE_BUFFER_FORMAT_ARB = 35886;
/*    */   
/*    */   public static void glTexBufferARB(int target, int internalformat, int buffer) {
/* 32 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 33 */     long function_pointer = caps.ARB_texture_buffer_object_glTexBufferARB_pointer;
/* 34 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 35 */     nglTexBufferARB(target, internalformat, buffer, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglTexBufferARB(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBTextureBufferObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */