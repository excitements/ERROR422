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
/*    */ public final class NVTransformFeedback2
/*    */ {
/*    */   public static final int GL_TRANSFORM_FEEDBACK_NV = 36386;
/*    */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 36387;
/*    */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 36388;
/*    */   public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 36389;
/*    */   
/*    */   public static void glBindTransformFeedbackNV(int target, int id) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.NV_transform_feedback2_glBindTransformFeedbackNV_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglBindTransformFeedbackNV(target, id, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glDeleteTransformFeedbacksNV(IntBuffer ids) {
/* 35 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 36 */     long function_pointer = caps.NV_transform_feedback2_glDeleteTransformFeedbacksNV_pointer;
/* 37 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 38 */     BufferChecks.checkDirect(ids);
/* 39 */     nglDeleteTransformFeedbacksNV(ids.remaining(), ids, ids.position(), function_pointer);
/*    */   }
/*    */   private static native void nglBindTransformFeedbackNV(int paramInt1, int paramInt2, long paramLong);
/*    */   private static native void nglDeleteTransformFeedbacksNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDeleteTransformFeedbacksNV(int id) {
/* 45 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 46 */     long function_pointer = caps.NV_transform_feedback2_glDeleteTransformFeedbacksNV_pointer;
/* 47 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 48 */     nglDeleteTransformFeedbacksNV(1, APIUtils.getBufferInt().put(0, id), 0, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glGenTransformFeedbacksNV(IntBuffer ids) {
/* 52 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 53 */     long function_pointer = caps.NV_transform_feedback2_glGenTransformFeedbacksNV_pointer;
/* 54 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 55 */     BufferChecks.checkDirect(ids);
/* 56 */     nglGenTransformFeedbacksNV(ids.remaining(), ids, ids.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGenTransformFeedbacksNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static int glGenTransformFeedbacksNV() {
/* 62 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 63 */     long function_pointer = caps.NV_transform_feedback2_glGenTransformFeedbacksNV_pointer;
/* 64 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 65 */     IntBuffer ids = APIUtils.getBufferInt();
/* 66 */     nglGenTransformFeedbacksNV(1, ids, ids.position(), function_pointer);
/* 67 */     return ids.get(0);
/*    */   }
/*    */   
/*    */   public static boolean glIsTransformFeedbackNV(int id) {
/* 71 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 72 */     long function_pointer = caps.NV_transform_feedback2_glIsTransformFeedbackNV_pointer;
/* 73 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 74 */     boolean __result = nglIsTransformFeedbackNV(id, function_pointer);
/* 75 */     return __result;
/*    */   }
/*    */   private static native boolean nglIsTransformFeedbackNV(int paramInt, long paramLong);
/*    */   
/*    */   public static void glPauseTransformFeedbackNV() {
/* 80 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 81 */     long function_pointer = caps.NV_transform_feedback2_glPauseTransformFeedbackNV_pointer;
/* 82 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 83 */     nglPauseTransformFeedbackNV(function_pointer);
/*    */   }
/*    */   private static native void nglPauseTransformFeedbackNV(long paramLong);
/*    */   
/*    */   public static void glResumeTransformFeedbackNV() {
/* 88 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 89 */     long function_pointer = caps.NV_transform_feedback2_glResumeTransformFeedbackNV_pointer;
/* 90 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 91 */     nglResumeTransformFeedbackNV(function_pointer);
/*    */   }
/*    */   private static native void nglResumeTransformFeedbackNV(long paramLong);
/*    */   
/*    */   public static void glDrawTransformFeedbackNV(int mode, int id) {
/* 96 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 97 */     long function_pointer = caps.NV_transform_feedback2_glDrawTransformFeedbackNV_pointer;
/* 98 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 99 */     nglDrawTransformFeedbackNV(mode, id, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawTransformFeedbackNV(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVTransformFeedback2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */