/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class APPLEFence
/*     */ {
/*     */   public static final int GL_DRAW_PIXELS_APPLE = 35338;
/*     */   public static final int GL_FENCE_APPLE = 35339;
/*     */   
/*     */   public static void glGenFencesAPPLE(IntBuffer fences) {
/*  21 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  22 */     long function_pointer = caps.APPLE_fence_glGenFencesAPPLE_pointer;
/*  23 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  24 */     BufferChecks.checkDirect(fences);
/*  25 */     nglGenFencesAPPLE(fences.remaining(), fences, fences.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenFencesAPPLE(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenFencesAPPLE() {
/*  31 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  32 */     long function_pointer = caps.APPLE_fence_glGenFencesAPPLE_pointer;
/*  33 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  34 */     IntBuffer fences = APIUtils.getBufferInt();
/*  35 */     nglGenFencesAPPLE(1, fences, fences.position(), function_pointer);
/*  36 */     return fences.get(0);
/*     */   }
/*     */   
/*     */   public static void glDeleteFencesAPPLE(IntBuffer fences) {
/*  40 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  41 */     long function_pointer = caps.APPLE_fence_glDeleteFencesAPPLE_pointer;
/*  42 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  43 */     BufferChecks.checkDirect(fences);
/*  44 */     nglDeleteFencesAPPLE(fences.remaining(), fences, fences.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteFencesAPPLE(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteFencesAPPLE(int fence) {
/*  50 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  51 */     long function_pointer = caps.APPLE_fence_glDeleteFencesAPPLE_pointer;
/*  52 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  53 */     nglDeleteFencesAPPLE(1, APIUtils.getBufferInt().put(0, fence), 0, function_pointer);
/*     */   }
/*     */   private static native void nglSetFenceAPPLE(int paramInt, long paramLong);
/*     */   public static void glSetFenceAPPLE(int fence) {
/*  57 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  58 */     long function_pointer = caps.APPLE_fence_glSetFenceAPPLE_pointer;
/*  59 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  60 */     nglSetFenceAPPLE(fence, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean glIsFenceAPPLE(int fence) {
/*  65 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  66 */     long function_pointer = caps.APPLE_fence_glIsFenceAPPLE_pointer;
/*  67 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  68 */     boolean __result = nglIsFenceAPPLE(fence, function_pointer);
/*  69 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsFenceAPPLE(int paramInt, long paramLong);
/*     */   
/*     */   public static boolean glTestFenceAPPLE(int fence) {
/*  74 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  75 */     long function_pointer = caps.APPLE_fence_glTestFenceAPPLE_pointer;
/*  76 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  77 */     boolean __result = nglTestFenceAPPLE(fence, function_pointer);
/*  78 */     return __result;
/*     */   }
/*     */   private static native boolean nglTestFenceAPPLE(int paramInt, long paramLong);
/*     */   
/*     */   public static void glFinishFenceAPPLE(int fence) {
/*  83 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  84 */     long function_pointer = caps.APPLE_fence_glFinishFenceAPPLE_pointer;
/*  85 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  86 */     nglFinishFenceAPPLE(fence, function_pointer);
/*     */   }
/*     */   private static native void nglFinishFenceAPPLE(int paramInt, long paramLong);
/*     */   
/*     */   public static boolean glTestObjectAPPLE(int object, int name) {
/*  91 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  92 */     long function_pointer = caps.APPLE_fence_glTestObjectAPPLE_pointer;
/*  93 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  94 */     boolean __result = nglTestObjectAPPLE(object, name, function_pointer);
/*  95 */     return __result;
/*     */   }
/*     */   private static native boolean nglTestObjectAPPLE(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glFinishObjectAPPLE(int object, int name) {
/* 100 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 101 */     long function_pointer = caps.APPLE_fence_glFinishObjectAPPLE_pointer;
/* 102 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 103 */     nglFinishObjectAPPLE(object, name, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglFinishObjectAPPLE(int paramInt1, int paramInt2, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APPLEFence.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */