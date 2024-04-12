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
/*    */ public final class ARBTransformFeedback2
/*    */ {
/*    */   public static final int GL_TRANSFORM_FEEDBACK = 36386;
/*    */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 36387;
/*    */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 36388;
/*    */   public static final int GL_TRANSFORM_FEEDBACK_BINDING = 36389;
/*    */   
/*    */   public static void glBindTransformFeedback(int target, int id) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.ARB_transform_feedback2_glBindTransformFeedback_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglBindTransformFeedback(target, id, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glDeleteTransformFeedbacks(IntBuffer ids) {
/* 35 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 36 */     long function_pointer = caps.ARB_transform_feedback2_glDeleteTransformFeedbacks_pointer;
/* 37 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 38 */     BufferChecks.checkDirect(ids);
/* 39 */     nglDeleteTransformFeedbacks(ids.remaining(), ids, ids.position(), function_pointer);
/*    */   }
/*    */   private static native void nglBindTransformFeedback(int paramInt1, int paramInt2, long paramLong);
/*    */   private static native void nglDeleteTransformFeedbacks(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glDeleteTransformFeedbacks(int id) {
/* 45 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 46 */     long function_pointer = caps.ARB_transform_feedback2_glDeleteTransformFeedbacks_pointer;
/* 47 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 48 */     nglDeleteTransformFeedbacks(1, APIUtils.getBufferInt().put(0, id), 0, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glGenTransformFeedbacks(IntBuffer ids) {
/* 52 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 53 */     long function_pointer = caps.ARB_transform_feedback2_glGenTransformFeedbacks_pointer;
/* 54 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 55 */     BufferChecks.checkDirect(ids);
/* 56 */     nglGenTransformFeedbacks(ids.remaining(), ids, ids.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGenTransformFeedbacks(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static int glGenTransformFeedbacks() {
/* 62 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 63 */     long function_pointer = caps.ARB_transform_feedback2_glGenTransformFeedbacks_pointer;
/* 64 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 65 */     IntBuffer ids = APIUtils.getBufferInt();
/* 66 */     nglGenTransformFeedbacks(1, ids, ids.position(), function_pointer);
/* 67 */     return ids.get(0);
/*    */   }
/*    */   
/*    */   public static boolean glIsTransformFeedback(int id) {
/* 71 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 72 */     long function_pointer = caps.ARB_transform_feedback2_glIsTransformFeedback_pointer;
/* 73 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 74 */     boolean __result = nglIsTransformFeedback(id, function_pointer);
/* 75 */     return __result;
/*    */   }
/*    */   private static native boolean nglIsTransformFeedback(int paramInt, long paramLong);
/*    */   
/*    */   public static void glPauseTransformFeedback() {
/* 80 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 81 */     long function_pointer = caps.ARB_transform_feedback2_glPauseTransformFeedback_pointer;
/* 82 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 83 */     nglPauseTransformFeedback(function_pointer);
/*    */   }
/*    */   private static native void nglPauseTransformFeedback(long paramLong);
/*    */   
/*    */   public static void glResumeTransformFeedback() {
/* 88 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 89 */     long function_pointer = caps.ARB_transform_feedback2_glResumeTransformFeedback_pointer;
/* 90 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 91 */     nglResumeTransformFeedback(function_pointer);
/*    */   }
/*    */   private static native void nglResumeTransformFeedback(long paramLong);
/*    */   
/*    */   public static void glDrawTransformFeedback(int mode, int id) {
/* 96 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 97 */     long function_pointer = caps.ARB_transform_feedback2_glDrawTransformFeedback_pointer;
/* 98 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 99 */     nglDrawTransformFeedback(mode, id, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglDrawTransformFeedback(int paramInt1, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBTransformFeedback2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */