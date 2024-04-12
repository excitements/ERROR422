/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.LongBuffer;
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
/*    */ public final class ARBTimerQuery
/*    */ {
/*    */   public static final int GL_TIME_ELAPSED = 35007;
/*    */   public static final int GL_TIMESTAMP = 36392;
/*    */   
/*    */   public static void glQueryCounter(int id, int target) {
/* 27 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 28 */     long function_pointer = caps.ARB_timer_query_glQueryCounter_pointer;
/* 29 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 30 */     nglQueryCounter(id, target, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glGetQueryObject(int id, int pname, LongBuffer params) {
/* 35 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 36 */     long function_pointer = caps.ARB_timer_query_glGetQueryObjecti64v_pointer;
/* 37 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 38 */     BufferChecks.checkBuffer(params, 1);
/* 39 */     nglGetQueryObjecti64v(id, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   private static native void nglQueryCounter(int paramInt1, int paramInt2, long paramLong);
/*    */   private static native void nglGetQueryObjecti64v(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   public static long glGetQueryObject(int id, int pname) {
/* 45 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 46 */     long function_pointer = caps.ARB_timer_query_glGetQueryObjecti64v_pointer;
/* 47 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 48 */     LongBuffer params = APIUtils.getBufferLong();
/* 49 */     nglGetQueryObjecti64v(id, pname, params, params.position(), function_pointer);
/* 50 */     return params.get(0);
/*    */   }
/*    */   
/*    */   public static void glGetQueryObjectu(int id, int pname, LongBuffer params) {
/* 54 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 55 */     long function_pointer = caps.ARB_timer_query_glGetQueryObjectui64v_pointer;
/* 56 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 57 */     BufferChecks.checkBuffer(params, 1);
/* 58 */     nglGetQueryObjectui64v(id, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetQueryObjectui64v(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   public static long glGetQueryObjectu(int id, int pname) {
/* 64 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 65 */     long function_pointer = caps.ARB_timer_query_glGetQueryObjectui64v_pointer;
/* 66 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 67 */     LongBuffer params = APIUtils.getBufferLong();
/* 68 */     nglGetQueryObjectui64v(id, pname, params, params.position(), function_pointer);
/* 69 */     return params.get(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBTimerQuery.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */