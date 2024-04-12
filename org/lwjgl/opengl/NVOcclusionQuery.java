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
/*     */ public final class NVOcclusionQuery
/*     */ {
/*     */   public static final int GL_OCCLUSION_TEST_HP = 33125;
/*     */   public static final int GL_OCCLUSION_TEST_RESULT_HP = 33126;
/*     */   public static final int GL_PIXEL_COUNTER_BITS_NV = 34916;
/*     */   public static final int GL_CURRENT_OCCLUSION_QUERY_ID_NV = 34917;
/*     */   public static final int GL_PIXEL_COUNT_NV = 34918;
/*     */   public static final int GL_PIXEL_COUNT_AVAILABLE_NV = 34919;
/*     */   
/*     */   public static void glGenOcclusionQueriesNV(IntBuffer piIDs) {
/*  22 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  23 */     long function_pointer = caps.NV_occlusion_query_glGenOcclusionQueriesNV_pointer;
/*  24 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  25 */     BufferChecks.checkDirect(piIDs);
/*  26 */     nglGenOcclusionQueriesNV(piIDs.remaining(), piIDs, piIDs.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenOcclusionQueriesNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenOcclusionQueriesNV() {
/*  32 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  33 */     long function_pointer = caps.NV_occlusion_query_glGenOcclusionQueriesNV_pointer;
/*  34 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  35 */     IntBuffer piIDs = APIUtils.getBufferInt();
/*  36 */     nglGenOcclusionQueriesNV(1, piIDs, piIDs.position(), function_pointer);
/*  37 */     return piIDs.get(0);
/*     */   }
/*     */   
/*     */   public static void glDeleteOcclusionQueriesNV(IntBuffer piIDs) {
/*  41 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  42 */     long function_pointer = caps.NV_occlusion_query_glDeleteOcclusionQueriesNV_pointer;
/*  43 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  44 */     BufferChecks.checkDirect(piIDs);
/*  45 */     nglDeleteOcclusionQueriesNV(piIDs.remaining(), piIDs, piIDs.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteOcclusionQueriesNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteOcclusionQueriesNV(int piID) {
/*  51 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  52 */     long function_pointer = caps.NV_occlusion_query_glDeleteOcclusionQueriesNV_pointer;
/*  53 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  54 */     nglDeleteOcclusionQueriesNV(1, APIUtils.getBufferInt().put(0, piID), 0, function_pointer);
/*     */   }
/*     */   private static native boolean nglIsOcclusionQueryNV(int paramInt, long paramLong);
/*     */   public static boolean glIsOcclusionQueryNV(int id) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.NV_occlusion_query_glIsOcclusionQueryNV_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     boolean __result = nglIsOcclusionQueryNV(id, function_pointer);
/*  62 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBeginOcclusionQueryNV(int id) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.NV_occlusion_query_glBeginOcclusionQueryNV_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     nglBeginOcclusionQueryNV(id, function_pointer);
/*     */   }
/*     */   private static native void nglBeginOcclusionQueryNV(int paramInt, long paramLong);
/*     */   
/*     */   public static void glEndOcclusionQueryNV() {
/*  75 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  76 */     long function_pointer = caps.NV_occlusion_query_glEndOcclusionQueryNV_pointer;
/*  77 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  78 */     nglEndOcclusionQueryNV(function_pointer);
/*     */   }
/*     */   private static native void nglEndOcclusionQueryNV(long paramLong);
/*     */   
/*     */   public static void glGetOcclusionQueryuNV(int id, int pname, IntBuffer params) {
/*  83 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  84 */     long function_pointer = caps.NV_occlusion_query_glGetOcclusionQueryuivNV_pointer;
/*  85 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  86 */     BufferChecks.checkBuffer(params, 1);
/*  87 */     nglGetOcclusionQueryuivNV(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetOcclusionQueryuivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetOcclusionQueryuiNV(int id, int pname) {
/*  93 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  94 */     long function_pointer = caps.NV_occlusion_query_glGetOcclusionQueryuivNV_pointer;
/*  95 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  96 */     IntBuffer params = APIUtils.getBufferInt();
/*  97 */     nglGetOcclusionQueryuivNV(id, pname, params, params.position(), function_pointer);
/*  98 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetOcclusionQueryNV(int id, int pname, IntBuffer params) {
/* 102 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 103 */     long function_pointer = caps.NV_occlusion_query_glGetOcclusionQueryivNV_pointer;
/* 104 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 105 */     BufferChecks.checkBuffer(params, 1);
/* 106 */     nglGetOcclusionQueryivNV(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetOcclusionQueryivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetOcclusionQueryiNV(int id, int pname) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.NV_occlusion_query_glGetOcclusionQueryivNV_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     IntBuffer params = APIUtils.getBufferInt();
/* 116 */     nglGetOcclusionQueryivNV(id, pname, params, params.position(), function_pointer);
/* 117 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVOcclusionQuery.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */