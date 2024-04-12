/*     */ package org.lwjgl.opengl;
/*     */ 
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
/*     */ public final class NVVertexAttribInteger64bit
/*     */ {
/*     */   public static final int GL_INT64_NV = 5134;
/*     */   public static final int GL_UNSIGNED_INT64_NV = 5135;
/*     */   
/*     */   private static native void nglVertexAttribL1i64NV(int paramInt, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glVertexAttribL1i64NV(int index, long x) {
/*  22 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  23 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL1i64NV_pointer;
/*  24 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  25 */     nglVertexAttribL1i64NV(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL2i64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glVertexAttribL2i64NV(int index, long x, long y) {
/*  30 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  31 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL2i64NV_pointer;
/*  32 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  33 */     nglVertexAttribL2i64NV(index, x, y, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glVertexAttribL3i64NV(int index, long x, long y, long z) {
/*  38 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  39 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL3i64NV_pointer;
/*  40 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  41 */     nglVertexAttribL3i64NV(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL3i64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glVertexAttribL4i64NV(int index, long x, long y, long z, long w) {
/*  46 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  47 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL4i64NV_pointer;
/*  48 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  49 */     nglVertexAttribL4i64NV(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL4i64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   public static void glVertexAttribL1NV(int index, LongBuffer v) {
/*  54 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  55 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL1i64vNV_pointer;
/*  56 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  57 */     BufferChecks.checkBuffer(v, 1);
/*  58 */     nglVertexAttribL1i64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL1i64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL2NV(int index, LongBuffer v) {
/*  63 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  64 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL2i64vNV_pointer;
/*  65 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  66 */     BufferChecks.checkBuffer(v, 2);
/*  67 */     nglVertexAttribL2i64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL2i64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL3NV(int index, LongBuffer v) {
/*  72 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  73 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL3i64vNV_pointer;
/*  74 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  75 */     BufferChecks.checkBuffer(v, 3);
/*  76 */     nglVertexAttribL3i64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL3i64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL4NV(int index, LongBuffer v) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL4i64vNV_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     BufferChecks.checkBuffer(v, 4);
/*  85 */     nglVertexAttribL4i64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL4i64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL1ui64NV(int index, long x) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL1ui64NV_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     nglVertexAttribL1ui64NV(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL1ui64NV(int paramInt, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glVertexAttribL2ui64NV(int index, long x, long y) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL2ui64NV_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     nglVertexAttribL2ui64NV(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL2ui64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glVertexAttribL3ui64NV(int index, long x, long y, long z) {
/* 106 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 107 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL3ui64NV_pointer;
/* 108 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 109 */     nglVertexAttribL3ui64NV(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL3ui64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*     */   
/*     */   public static void glVertexAttribL4ui64NV(int index, long x, long y, long z, long w) {
/* 114 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 115 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL4ui64NV_pointer;
/* 116 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 117 */     nglVertexAttribL4ui64NV(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL4ui64NV(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
/*     */   
/*     */   public static void glVertexAttribL1uNV(int index, LongBuffer v) {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL1ui64vNV_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     BufferChecks.checkBuffer(v, 1);
/* 126 */     nglVertexAttribL1ui64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL1ui64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL2uNV(int index, LongBuffer v) {
/* 131 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 132 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL2ui64vNV_pointer;
/* 133 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 134 */     BufferChecks.checkBuffer(v, 2);
/* 135 */     nglVertexAttribL2ui64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL2ui64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL3uNV(int index, LongBuffer v) {
/* 140 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 141 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL3ui64vNV_pointer;
/* 142 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 143 */     BufferChecks.checkBuffer(v, 3);
/* 144 */     nglVertexAttribL3ui64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL3ui64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL4uNV(int index, LongBuffer v) {
/* 149 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 150 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribL4ui64vNV_pointer;
/* 151 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 152 */     BufferChecks.checkBuffer(v, 4);
/* 153 */     nglVertexAttribL4ui64vNV(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL4ui64vNV(int paramInt1, LongBuffer paramLongBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribLNV(int index, int pname, LongBuffer params) {
/* 158 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 159 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glGetVertexAttribLi64vNV_pointer;
/* 160 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 161 */     BufferChecks.checkBuffer(params, 4);
/* 162 */     nglGetVertexAttribLi64vNV(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribLi64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribLuNV(int index, int pname, LongBuffer params) {
/* 167 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 168 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glGetVertexAttribLui64vNV_pointer;
/* 169 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 170 */     BufferChecks.checkBuffer(params, 4);
/* 171 */     nglGetVertexAttribLui64vNV(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribLui64vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribLFormatNV(int index, int size, int type, int stride) {
/* 176 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 177 */     long function_pointer = caps.NV_vertex_attrib_integer_64bit_glVertexAttribLFormatNV_pointer;
/* 178 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 179 */     nglVertexAttribLFormatNV(index, size, type, stride, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexAttribLFormatNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVVertexAttribInteger64bit.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */