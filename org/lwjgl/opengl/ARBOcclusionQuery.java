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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ARBOcclusionQuery
/*     */ {
/*     */   public static final int GL_SAMPLES_PASSED_ARB = 35092;
/*     */   public static final int GL_QUERY_COUNTER_BITS_ARB = 34916;
/*     */   public static final int GL_CURRENT_QUERY_ARB = 34917;
/*     */   public static final int GL_QUERY_RESULT_ARB = 34918;
/*     */   public static final int GL_QUERY_RESULT_AVAILABLE_ARB = 34919;
/*     */   
/*     */   public static void glGenQueriesARB(IntBuffer ids) {
/*  32 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  33 */     long function_pointer = caps.ARB_occlusion_query_glGenQueriesARB_pointer;
/*  34 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  35 */     BufferChecks.checkDirect(ids);
/*  36 */     nglGenQueriesARB(ids.remaining(), ids, ids.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenQueriesARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenQueriesARB() {
/*  42 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  43 */     long function_pointer = caps.ARB_occlusion_query_glGenQueriesARB_pointer;
/*  44 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  45 */     IntBuffer ids = APIUtils.getBufferInt();
/*  46 */     nglGenQueriesARB(1, ids, ids.position(), function_pointer);
/*  47 */     return ids.get(0);
/*     */   }
/*     */   
/*     */   public static void glDeleteQueriesARB(IntBuffer ids) {
/*  51 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  52 */     long function_pointer = caps.ARB_occlusion_query_glDeleteQueriesARB_pointer;
/*  53 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  54 */     BufferChecks.checkDirect(ids);
/*  55 */     nglDeleteQueriesARB(ids.remaining(), ids, ids.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteQueriesARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteQueriesARB(int id) {
/*  61 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  62 */     long function_pointer = caps.ARB_occlusion_query_glDeleteQueriesARB_pointer;
/*  63 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  64 */     nglDeleteQueriesARB(1, APIUtils.getBufferInt().put(0, id), 0, function_pointer);
/*     */   }
/*     */   private static native boolean nglIsQueryARB(int paramInt, long paramLong);
/*     */   public static boolean glIsQueryARB(int id) {
/*  68 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  69 */     long function_pointer = caps.ARB_occlusion_query_glIsQueryARB_pointer;
/*  70 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  71 */     boolean __result = nglIsQueryARB(id, function_pointer);
/*  72 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBeginQueryARB(int target, int id) {
/*  77 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  78 */     long function_pointer = caps.ARB_occlusion_query_glBeginQueryARB_pointer;
/*  79 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  80 */     nglBeginQueryARB(target, id, function_pointer);
/*     */   }
/*     */   private static native void nglBeginQueryARB(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glEndQueryARB(int target) {
/*  85 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  86 */     long function_pointer = caps.ARB_occlusion_query_glEndQueryARB_pointer;
/*  87 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  88 */     nglEndQueryARB(target, function_pointer);
/*     */   }
/*     */   private static native void nglEndQueryARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetQueryARB(int target, int pname, IntBuffer params) {
/*  93 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  94 */     long function_pointer = caps.ARB_occlusion_query_glGetQueryivARB_pointer;
/*  95 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  96 */     BufferChecks.checkBuffer(params, 1);
/*  97 */     nglGetQueryivARB(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetQueryARB(int target, int pname) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.ARB_occlusion_query_glGetQueryivARB_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     IntBuffer params = APIUtils.getBufferInt();
/* 107 */     nglGetQueryivARB(target, pname, params, params.position(), function_pointer);
/* 108 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetQueryObjectARB(int id, int pname, IntBuffer params) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.ARB_occlusion_query_glGetQueryObjectivARB_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     BufferChecks.checkBuffer(params, 1);
/* 116 */     nglGetQueryObjectivARB(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryObjectivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetQueryObjectiARB(int id, int pname) {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.ARB_occlusion_query_glGetQueryObjectivARB_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     IntBuffer params = APIUtils.getBufferInt();
/* 126 */     nglGetQueryObjectivARB(id, pname, params, params.position(), function_pointer);
/* 127 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetQueryObjectuARB(int id, int pname, IntBuffer params) {
/* 131 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 132 */     long function_pointer = caps.ARB_occlusion_query_glGetQueryObjectuivARB_pointer;
/* 133 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 134 */     BufferChecks.checkBuffer(params, 1);
/* 135 */     nglGetQueryObjectuivARB(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryObjectuivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetQueryObjectuiARB(int id, int pname) {
/* 141 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 142 */     long function_pointer = caps.ARB_occlusion_query_glGetQueryObjectuivARB_pointer;
/* 143 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 144 */     IntBuffer params = APIUtils.getBufferInt();
/* 145 */     nglGetQueryObjectuivARB(id, pname, params, params.position(), function_pointer);
/* 146 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBOcclusionQuery.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */