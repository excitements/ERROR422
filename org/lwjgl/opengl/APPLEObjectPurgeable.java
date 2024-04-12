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
/*    */ public final class APPLEObjectPurgeable
/*    */ {
/*    */   public static final int GL_RELEASED_APPLE = 35353;
/*    */   public static final int GL_VOLATILE_APPLE = 35354;
/*    */   public static final int GL_RETAINED_APPLE = 35355;
/*    */   public static final int GL_UNDEFINED_APPLE = 35356;
/*    */   public static final int GL_PURGEABLE_APPLE = 35357;
/*    */   public static final int GL_BUFFER_OBJECT_APPLE = 34227;
/*    */   
/*    */   private static native int nglObjectPurgeableAPPLE(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static int glObjectPurgeableAPPLE(int objectType, int name, int option) {
/* 37 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 38 */     long function_pointer = caps.APPLE_object_purgeable_glObjectPurgeableAPPLE_pointer;
/* 39 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 40 */     int __result = nglObjectPurgeableAPPLE(objectType, name, option, function_pointer);
/* 41 */     return __result;
/*    */   }
/*    */ 
/*    */   
/*    */   public static int glObjectUnpurgeableAPPLE(int objectType, int name, int option) {
/* 46 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 47 */     long function_pointer = caps.APPLE_object_purgeable_glObjectUnpurgeableAPPLE_pointer;
/* 48 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 49 */     int __result = nglObjectUnpurgeableAPPLE(objectType, name, option, function_pointer);
/* 50 */     return __result;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetObjectParameterAPPLE(int objectType, int name, int pname, IntBuffer params) {
/* 55 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 56 */     long function_pointer = caps.APPLE_object_purgeable_glGetObjectParameterivAPPLE_pointer;
/* 57 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 58 */     BufferChecks.checkBuffer(params, 1);
/* 59 */     nglGetObjectParameterivAPPLE(objectType, name, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   private static native int nglObjectUnpurgeableAPPLE(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   private static native void nglGetObjectParameterivAPPLE(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*    */   
/*    */   public static int glGetObjectParameterAPPLE(int objectType, int name, int pname) {
/* 65 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 66 */     long function_pointer = caps.APPLE_object_purgeable_glGetObjectParameterivAPPLE_pointer;
/* 67 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 68 */     IntBuffer params = APIUtils.getBufferInt();
/* 69 */     nglGetObjectParameterivAPPLE(objectType, name, pname, params, params.position(), function_pointer);
/* 70 */     return params.get(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLEObjectPurgeable.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */