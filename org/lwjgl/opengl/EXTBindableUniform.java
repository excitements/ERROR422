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
/*    */ public final class EXTBindableUniform
/*    */ {
/*    */   public static final int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = 36322;
/*    */   public static final int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 36323;
/*    */   public static final int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 36324;
/*    */   public static final int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = 36333;
/*    */   public static final int GL_UNIFORM_BUFFER_BINDING_EXT = 36335;
/*    */   public static final int GL_UNIFORM_BUFFER_EXT = 36334;
/*    */   
/*    */   private static native void nglUniformBufferEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glUniformBufferEXT(int program, int location, int buffer) {
/* 31 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 32 */     long function_pointer = caps.EXT_bindable_uniform_glUniformBufferEXT_pointer;
/* 33 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 34 */     nglUniformBufferEXT(program, location, buffer, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glGetUniformBufferSizeEXT(int program, int location) {
/* 39 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 40 */     long function_pointer = caps.EXT_bindable_uniform_glGetUniformBufferSizeEXT_pointer;
/* 41 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 42 */     int __result = nglGetUniformBufferSizeEXT(program, location, function_pointer);
/* 43 */     return __result;
/*    */   }
/*    */ 
/*    */   
/*    */   public static long glGetUniformOffsetEXT(int program, int location) {
/* 48 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 49 */     long function_pointer = caps.EXT_bindable_uniform_glGetUniformOffsetEXT_pointer;
/* 50 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 51 */     long __result = nglGetUniformOffsetEXT(program, location, function_pointer);
/* 52 */     return __result;
/*    */   }
/*    */   
/*    */   private static native int nglGetUniformBufferSizeEXT(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   private static native long nglGetUniformOffsetEXT(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTBindableUniform.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */