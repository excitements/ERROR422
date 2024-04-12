/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.DoubleBuffer;
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
/*     */ public final class EXTVertexAttrib64bit
/*     */ {
/*     */   public static final int GL_DOUBLE_VEC2_EXT = 36860;
/*     */   public static final int GL_DOUBLE_VEC3_EXT = 36861;
/*     */   public static final int GL_DOUBLE_VEC4_EXT = 36862;
/*     */   public static final int GL_DOUBLE_MAT2_EXT = 36678;
/*     */   public static final int GL_DOUBLE_MAT3_EXT = 36679;
/*     */   public static final int GL_DOUBLE_MAT4_EXT = 36680;
/*     */   public static final int GL_DOUBLE_MAT2x3_EXT = 36681;
/*     */   public static final int GL_DOUBLE_MAT2x4_EXT = 36682;
/*     */   public static final int GL_DOUBLE_MAT3x2_EXT = 36683;
/*     */   public static final int GL_DOUBLE_MAT3x4_EXT = 36684;
/*     */   public static final int GL_DOUBLE_MAT4x2_EXT = 36685;
/*     */   public static final int GL_DOUBLE_MAT4x3_EXT = 36686;
/*     */   
/*     */   public static void glVertexAttribL1dEXT(int index, double x) {
/*  31 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  32 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL1dEXT_pointer;
/*  33 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  34 */     nglVertexAttribL1dEXT(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL1dEXT(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL2dEXT(int index, double x, double y) {
/*  39 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  40 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL2dEXT_pointer;
/*  41 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  42 */     nglVertexAttribL2dEXT(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL2dEXT(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL3dEXT(int index, double x, double y, double z) {
/*  47 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  48 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL3dEXT_pointer;
/*  49 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  50 */     nglVertexAttribL3dEXT(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL3dEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL4dEXT(int index, double x, double y, double z, double w) {
/*  55 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  56 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL4dEXT_pointer;
/*  57 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  58 */     nglVertexAttribL4dEXT(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL4dEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL1EXT(int index, DoubleBuffer v) {
/*  63 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  64 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL1dvEXT_pointer;
/*  65 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  66 */     BufferChecks.checkBuffer(v, 1);
/*  67 */     nglVertexAttribL1dvEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL1dvEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL2EXT(int index, DoubleBuffer v) {
/*  72 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  73 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL2dvEXT_pointer;
/*  74 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  75 */     BufferChecks.checkBuffer(v, 2);
/*  76 */     nglVertexAttribL2dvEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL2dvEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL3EXT(int index, DoubleBuffer v) {
/*  81 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  82 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL3dvEXT_pointer;
/*  83 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  84 */     BufferChecks.checkBuffer(v, 3);
/*  85 */     nglVertexAttribL3dvEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL3dvEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribL4EXT(int index, DoubleBuffer v) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribL4dvEXT_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     BufferChecks.checkBuffer(v, 4);
/*  94 */     nglVertexAttribL4dvEXT(index, v, v.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribL4dvEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribLPointerEXT(int index, int size, int stride, DoubleBuffer pointer) {
/*  99 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 100 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribLPointerEXT_pointer;
/* 101 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 102 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 103 */     BufferChecks.checkDirect(pointer);
/* 104 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = pointer;
/* 105 */     nglVertexAttribLPointerEXT(index, size, 5130, stride, pointer, pointer.position() << 3, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glVertexAttribLPointerEXT(int index, int size, int stride, long pointer_buffer_offset) {
/* 109 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 110 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexAttribLPointerEXT_pointer;
/* 111 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 112 */     GLChecks.ensureArrayVBOenabled(caps);
/* 113 */     nglVertexAttribLPointerEXTBO(index, size, 5130, stride, pointer_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribLPointerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*     */   private static native void nglVertexAttribLPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*     */   public static void glGetVertexAttribLEXT(int index, int pname, DoubleBuffer params) {
/* 118 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 119 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glGetVertexAttribLdvEXT_pointer;
/* 120 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 121 */     BufferChecks.checkBuffer(params, 4);
/* 122 */     nglGetVertexAttribLdvEXT(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribLdvEXT(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
/* 127 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 128 */     long function_pointer = caps.EXT_vertex_attrib_64bit_glVertexArrayVertexAttribLOffsetEXT_pointer;
/* 129 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 130 */     nglVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, offset, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexArrayVertexAttribLOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTVertexAttrib64bit.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */