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
/*    */ public final class EXTTimerQuery
/*    */ {
/*    */   public static final int GL_TIME_ELAPSED_EXT = 35007;
/*    */   
/*    */   public static void glGetQueryObjectEXT(int id, int pname, LongBuffer params) {
/* 21 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 22 */     long function_pointer = caps.EXT_timer_query_glGetQueryObjecti64vEXT_pointer;
/* 23 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 24 */     BufferChecks.checkBuffer(params, 1);
/* 25 */     nglGetQueryObjecti64vEXT(id, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetQueryObjecti64vEXT(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   public static long glGetQueryObjectEXT(int id, int pname) {
/* 31 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 32 */     long function_pointer = caps.EXT_timer_query_glGetQueryObjecti64vEXT_pointer;
/* 33 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 34 */     LongBuffer params = APIUtils.getBufferLong();
/* 35 */     nglGetQueryObjecti64vEXT(id, pname, params, params.position(), function_pointer);
/* 36 */     return params.get(0);
/*    */   }
/*    */   
/*    */   public static void glGetQueryObjectuEXT(int id, int pname, LongBuffer params) {
/* 40 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 41 */     long function_pointer = caps.EXT_timer_query_glGetQueryObjectui64vEXT_pointer;
/* 42 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 43 */     BufferChecks.checkBuffer(params, 1);
/* 44 */     nglGetQueryObjectui64vEXT(id, pname, params, params.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglGetQueryObjectui64vEXT(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   public static long glGetQueryObjectuEXT(int id, int pname) {
/* 50 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 51 */     long function_pointer = caps.EXT_timer_query_glGetQueryObjectui64vEXT_pointer;
/* 52 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 53 */     LongBuffer params = APIUtils.getBufferLong();
/* 54 */     nglGetQueryObjectui64vEXT(id, pname, params, params.position(), function_pointer);
/* 55 */     return params.get(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTTimerQuery.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */