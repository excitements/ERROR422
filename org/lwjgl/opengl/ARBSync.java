/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.LongBuffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ARBSync
/*     */ {
/*     */   public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 37137;
/*     */   public static final int GL_OBJECT_TYPE = 37138;
/*     */   public static final int GL_SYNC_CONDITION = 37139;
/*     */   public static final int GL_SYNC_STATUS = 37140;
/*     */   public static final int GL_SYNC_FLAGS = 37141;
/*     */   public static final int GL_SYNC_FENCE = 37142;
/*     */   public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 37143;
/*     */   public static final int GL_UNSIGNALED = 37144;
/*     */   public static final int GL_SIGNALED = 37145;
/*     */   public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 1;
/*     */   public static final long GL_TIMEOUT_IGNORED = -1L;
/*     */   public static final int GL_ALREADY_SIGNALED = 37146;
/*     */   public static final int GL_TIMEOUT_EXPIRED = 37147;
/*     */   public static final int GL_CONDITION_SATISFIED = 37148;
/*     */   public static final int GL_WAIT_FAILED = 37149;
/*     */   
/*     */   private static native long nglFenceSync(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static GLSync glFenceSync(int condition, int flags) {
/*  55 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  56 */     long function_pointer = caps.ARB_sync_glFenceSync_pointer;
/*  57 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  58 */     GLSync __result = new GLSync(nglFenceSync(condition, flags, function_pointer));
/*  59 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsSync(long paramLong1, long paramLong2);
/*     */   
/*     */   public static boolean glIsSync(GLSync sync) {
/*  64 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  65 */     long function_pointer = caps.ARB_sync_glIsSync_pointer;
/*  66 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  67 */     boolean __result = nglIsSync(sync.getPointer(), function_pointer);
/*  68 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDeleteSync(GLSync sync) {
/*  73 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  74 */     long function_pointer = caps.ARB_sync_glDeleteSync_pointer;
/*  75 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  76 */     nglDeleteSync(sync.getPointer(), function_pointer);
/*     */   }
/*     */   private static native void nglDeleteSync(long paramLong1, long paramLong2);
/*     */   
/*     */   public static int glClientWaitSync(GLSync sync, int flags, long timeout) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.ARB_sync_glClientWaitSync_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     int __result = nglClientWaitSync(sync.getPointer(), flags, timeout, function_pointer);
/*  85 */     return __result;
/*     */   }
/*     */   private static native int nglClientWaitSync(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glWaitSync(GLSync sync, int flags, long timeout) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.ARB_sync_glWaitSync_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     nglWaitSync(sync.getPointer(), flags, timeout, function_pointer);
/*     */   }
/*     */   private static native void nglWaitSync(long paramLong1, int paramInt, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glGetInteger(int pname, LongBuffer params) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.ARB_sync_glGetInteger64v_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     BufferChecks.checkBuffer(params, 1);
/* 102 */     nglGetInteger64v(pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetInteger64v(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static long glGetInteger(int pname) {
/* 108 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 109 */     long function_pointer = caps.ARB_sync_glGetInteger64v_pointer;
/* 110 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 111 */     LongBuffer params = APIUtils.getBufferLong();
/* 112 */     nglGetInteger64v(pname, params, params.position(), function_pointer);
/* 113 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetSync(GLSync sync, int pname, IntBuffer length, IntBuffer values) {
/* 117 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 118 */     long function_pointer = caps.ARB_sync_glGetSynciv_pointer;
/* 119 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 120 */     if (length != null)
/* 121 */       BufferChecks.checkBuffer(length, 1); 
/* 122 */     BufferChecks.checkDirect(values);
/* 123 */     nglGetSynciv(sync.getPointer(), pname, values.remaining(), length, (length != null) ? length.position() : 0, values, values.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetSynciv(long paramLong1, int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, int paramInt3, IntBuffer paramIntBuffer2, int paramInt4, long paramLong2);
/*     */   
/*     */   public static int glGetSync(GLSync sync, int pname) {
/* 129 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 130 */     long function_pointer = caps.ARB_sync_glGetSynciv_pointer;
/* 131 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 132 */     IntBuffer values = APIUtils.getBufferInt();
/* 133 */     nglGetSynciv(sync.getPointer(), pname, 1, null, 0, values, values.position(), function_pointer);
/* 134 */     return values.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBSync.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */