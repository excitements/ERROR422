/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import java.nio.ByteBuffer;
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
/*    */ 
/*    */ 
/*    */ public final class APPLETextureRange
/*    */ {
/*    */   public static final int GL_TEXTURE_STORAGE_HINT_APPLE = 34236;
/*    */   public static final int GL_STORAGE_PRIVATE_APPLE = 34237;
/*    */   public static final int GL_STORAGE_CACHED_APPLE = 34238;
/*    */   public static final int GL_STORAGE_SHARED_APPLE = 34239;
/*    */   public static final int GL_TEXTURE_RANGE_LENGTH_APPLE = 34231;
/*    */   public static final int GL_TEXTURE_RANGE_POINTER_APPLE = 34232;
/*    */   
/*    */   public static void glTextureRangeAPPLE(int target, ByteBuffer pointer) {
/* 38 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 39 */     long function_pointer = caps.APPLE_texture_range_glTextureRangeAPPLE_pointer;
/* 40 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 41 */     BufferChecks.checkDirect(pointer);
/* 42 */     nglTextureRangeAPPLE(target, pointer.remaining(), pointer, pointer.position(), function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static Buffer glGetTexParameterPointervAPPLE(int target, int pname, long result_size) {
/* 47 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 48 */     long function_pointer = caps.APPLE_texture_range_glGetTexParameterPointervAPPLE_pointer;
/* 49 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 50 */     Buffer __result = nglGetTexParameterPointervAPPLE(target, pname, result_size, function_pointer);
/* 51 */     return __result;
/*    */   }
/*    */   
/*    */   private static native void nglTextureRangeAPPLE(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   private static native Buffer nglGetTexParameterPointervAPPLE(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLETextureRange.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */