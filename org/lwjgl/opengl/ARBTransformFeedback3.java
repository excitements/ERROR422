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
/*    */ public final class ARBTransformFeedback3
/*    */ {
/*    */   public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 36464;
/*    */   public static final int GL_MAX_VERTEX_STREAMS = 36465;
/*    */   
/*    */   private static native void nglDrawTransformFeedbackStream(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glDrawTransformFeedbackStream(int mode, int id, int stream) {
/* 22 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 23 */     long function_pointer = caps.ARB_transform_feedback3_glDrawTransformFeedbackStream_pointer;
/* 24 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 25 */     nglDrawTransformFeedbackStream(mode, id, stream, function_pointer);
/*    */   }
/*    */   private static native void nglBeginQueryIndexed(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*    */   
/*    */   public static void glBeginQueryIndexed(int target, int index, int id) {
/* 30 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 31 */     long function_pointer = caps.ARB_transform_feedback3_glBeginQueryIndexed_pointer;
/* 32 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 33 */     nglBeginQueryIndexed(target, index, id, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glEndQueryIndexed(int target, int index) {
/* 38 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 39 */     long function_pointer = caps.ARB_transform_feedback3_glEndQueryIndexed_pointer;
/* 40 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 41 */     nglEndQueryIndexed(target, index, function_pointer);
/*    */   }
/*    */   private static native void nglEndQueryIndexed(int paramInt1, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glGetQueryIndexed(int target, int index, int pname, IntBuffer params) {
/* 46 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 47 */     long function_pointer = caps.ARB_transform_feedback3_glGetQueryIndexediv_pointer;
/* 48 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 49 */     BufferChecks.checkBuffer(params, 1);
/* 50 */     nglGetQueryIndexediv(target, index, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetQueryIndexediv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*    */   
/*    */   public static int glGetQueryIndexed(int target, int index, int pname) {
/* 56 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 57 */     long function_pointer = caps.ARB_transform_feedback3_glGetQueryIndexediv_pointer;
/* 58 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 59 */     IntBuffer params = APIUtils.getBufferInt();
/* 60 */     nglGetQueryIndexediv(target, index, pname, params, params.position(), function_pointer);
/* 61 */     return params.get(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBTransformFeedback3.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */