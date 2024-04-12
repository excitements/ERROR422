/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ATIVertexStreams
/*     */ {
/*     */   public static final int GL_MAX_VERTEX_STREAMS_ATI = 34667;
/*     */   public static final int GL_VERTEX_SOURCE_ATI = 34668;
/*     */   public static final int GL_VERTEX_STREAM0_ATI = 34669;
/*     */   public static final int GL_VERTEX_STREAM1_ATI = 34670;
/*     */   public static final int GL_VERTEX_STREAM2_ATI = 34671;
/*     */   public static final int GL_VERTEX_STREAM3_ATI = 34672;
/*     */   public static final int GL_VERTEX_STREAM4_ATI = 34673;
/*     */   public static final int GL_VERTEX_STREAM5_ATI = 34674;
/*     */   public static final int GL_VERTEX_STREAM6_ATI = 34675;
/*     */   public static final int GL_VERTEX_STREAM7_ATI = 34676;
/*     */   
/*     */   private static native void nglVertexStream2fATI(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glVertexStream2fATI(int stream, float x, float y) {
/*  26 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  27 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream2fATI_pointer;
/*  28 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  29 */     nglVertexStream2fATI(stream, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream2dATI(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glVertexStream2dATI(int stream, double x, double y) {
/*  34 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  35 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream2dATI_pointer;
/*  36 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  37 */     nglVertexStream2dATI(stream, x, y, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glVertexStream2iATI(int stream, int x, int y) {
/*  42 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  43 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream2iATI_pointer;
/*  44 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  45 */     nglVertexStream2iATI(stream, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream2iATI(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexStream2sATI(int stream, short x, short y) {
/*  50 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  51 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream2sATI_pointer;
/*  52 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  53 */     nglVertexStream2sATI(stream, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream2sATI(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glVertexStream3fATI(int stream, float x, float y, float z) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream3fATI_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     nglVertexStream3fATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream3fATI(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glVertexStream3dATI(int stream, double x, double y, double z) {
/*  66 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  67 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream3dATI_pointer;
/*  68 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  69 */     nglVertexStream3dATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream3dATI(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glVertexStream3iATI(int stream, int x, int y, int z) {
/*  74 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  75 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream3iATI_pointer;
/*  76 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  77 */     nglVertexStream3iATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream3iATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glVertexStream3sATI(int stream, short x, short y, short z) {
/*  82 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  83 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream3sATI_pointer;
/*  84 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  85 */     nglVertexStream3sATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream3sATI(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glVertexStream4fATI(int stream, float x, float y, float z, float w) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream4fATI_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     nglVertexStream4fATI(stream, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream4fATI(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glVertexStream4dATI(int stream, double x, double y, double z, double w) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream4dATI_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     nglVertexStream4dATI(stream, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream4dATI(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glVertexStream4iATI(int stream, int x, int y, int z, int w) {
/* 106 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 107 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream4iATI_pointer;
/* 108 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 109 */     nglVertexStream4iATI(stream, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream4iATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glVertexStream4sATI(int stream, short x, short y, short z, short w) {
/* 114 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 115 */     long function_pointer = caps.ATI_vertex_streams_glVertexStream4sATI_pointer;
/* 116 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 117 */     nglVertexStream4sATI(stream, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexStream4sATI(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glNormalStream3bATI(int stream, byte x, byte y, byte z) {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.ATI_vertex_streams_glNormalStream3bATI_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     nglNormalStream3bATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglNormalStream3bATI(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*     */   
/*     */   public static void glNormalStream3fATI(int stream, float x, float y, float z) {
/* 130 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 131 */     long function_pointer = caps.ATI_vertex_streams_glNormalStream3fATI_pointer;
/* 132 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 133 */     nglNormalStream3fATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglNormalStream3fATI(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glNormalStream3dATI(int stream, double x, double y, double z) {
/* 138 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 139 */     long function_pointer = caps.ATI_vertex_streams_glNormalStream3dATI_pointer;
/* 140 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 141 */     nglNormalStream3dATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglNormalStream3dATI(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glNormalStream3iATI(int stream, int x, int y, int z) {
/* 146 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 147 */     long function_pointer = caps.ATI_vertex_streams_glNormalStream3iATI_pointer;
/* 148 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 149 */     nglNormalStream3iATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglNormalStream3iATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glNormalStream3sATI(int stream, short x, short y, short z) {
/* 154 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 155 */     long function_pointer = caps.ATI_vertex_streams_glNormalStream3sATI_pointer;
/* 156 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 157 */     nglNormalStream3sATI(stream, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglNormalStream3sATI(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glClientActiveVertexStreamATI(int stream) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.ATI_vertex_streams_glClientActiveVertexStreamATI_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     nglClientActiveVertexStreamATI(stream, function_pointer);
/*     */   }
/*     */   private static native void nglClientActiveVertexStreamATI(int paramInt, long paramLong);
/*     */   
/*     */   public static void glVertexBlendEnvfATI(int pname, float param) {
/* 170 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 171 */     long function_pointer = caps.ATI_vertex_streams_glVertexBlendEnvfATI_pointer;
/* 172 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 173 */     nglVertexBlendEnvfATI(pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglVertexBlendEnvfATI(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glVertexBlendEnviATI(int pname, int param) {
/* 178 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 179 */     long function_pointer = caps.ATI_vertex_streams_glVertexBlendEnviATI_pointer;
/* 180 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 181 */     nglVertexBlendEnviATI(pname, param, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexBlendEnviATI(int paramInt1, int paramInt2, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIVertexStreams.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */