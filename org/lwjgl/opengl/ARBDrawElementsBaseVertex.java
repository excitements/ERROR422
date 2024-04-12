/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.ShortBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ARBDrawElementsBaseVertex
/*     */ {
/*     */   public static void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
/*  16 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  17 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsBaseVertex_pointer;
/*  18 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  19 */     GLChecks.ensureElementVBOdisabled(caps);
/*  20 */     BufferChecks.checkDirect(indices);
/*  21 */     nglDrawElementsBaseVertex(mode, indices.remaining(), 5121, indices, indices.position(), basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
/*  24 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  25 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsBaseVertex_pointer;
/*  26 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  27 */     GLChecks.ensureElementVBOdisabled(caps);
/*  28 */     BufferChecks.checkDirect(indices);
/*  29 */     nglDrawElementsBaseVertex(mode, indices.remaining(), 5125, indices, indices.position() << 2, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
/*  32 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  33 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsBaseVertex_pointer;
/*  34 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  35 */     GLChecks.ensureElementVBOdisabled(caps);
/*  36 */     BufferChecks.checkDirect(indices);
/*  37 */     nglDrawElementsBaseVertex(mode, indices.remaining(), 5123, indices, indices.position() << 1, basevertex, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDrawElementsBaseVertex(int mode, int count, int type, long indices_buffer_offset, int basevertex) {
/*  41 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  42 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsBaseVertex_pointer;
/*  43 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  44 */     GLChecks.ensureElementVBOenabled(caps);
/*  45 */     nglDrawElementsBaseVertexBO(mode, count, type, indices_buffer_offset, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsBaseVertex(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, int paramInt5, long paramLong);
/*     */   private static native void nglDrawElementsBaseVertexBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2);
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
/*  50 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  51 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawRangeElementsBaseVertex_pointer;
/*  52 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  53 */     GLChecks.ensureElementVBOdisabled(caps);
/*  54 */     BufferChecks.checkDirect(indices);
/*  55 */     nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), 5121, indices, indices.position(), basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawRangeElementsBaseVertex_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     GLChecks.ensureElementVBOdisabled(caps);
/*  62 */     BufferChecks.checkDirect(indices);
/*  63 */     nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), 5125, indices, indices.position() << 2, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
/*  66 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  67 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawRangeElementsBaseVertex_pointer;
/*  68 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  69 */     GLChecks.ensureElementVBOdisabled(caps);
/*  70 */     BufferChecks.checkDirect(indices);
/*  71 */     nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), 5123, indices, indices.position() << 1, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawRangeElementsBaseVertex(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, int paramInt7, long paramLong);
/*     */   public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices_buffer_offset, int basevertex) {
/*  75 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  76 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawRangeElementsBaseVertex_pointer;
/*  77 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  78 */     GLChecks.ensureElementVBOenabled(caps);
/*  79 */     nglDrawRangeElementsBaseVertexBO(mode, start, end, count, type, indices_buffer_offset, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawRangeElementsBaseVertexBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, int paramInt6, long paramLong2);
/*     */   
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
/*  84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  85 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsInstancedBaseVertex_pointer;
/*  86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  87 */     GLChecks.ensureElementVBOdisabled(caps);
/*  88 */     BufferChecks.checkDirect(indices);
/*  89 */     nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), 5121, indices, indices.position(), primcount, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
/*  92 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  93 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsInstancedBaseVertex_pointer;
/*  94 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  95 */     GLChecks.ensureElementVBOdisabled(caps);
/*  96 */     BufferChecks.checkDirect(indices);
/*  97 */     nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), 5125, indices, indices.position() << 2, primcount, basevertex, function_pointer);
/*     */   }
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
/* 100 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 101 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsInstancedBaseVertex_pointer;
/* 102 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 103 */     GLChecks.ensureElementVBOdisabled(caps);
/* 104 */     BufferChecks.checkDirect(indices);
/* 105 */     nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), 5123, indices, indices.position() << 1, primcount, basevertex, function_pointer);
/*     */   }
/*     */   private static native void nglDrawElementsInstancedBaseVertex(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices_buffer_offset, int primcount, int basevertex) {
/* 109 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 110 */     long function_pointer = caps.ARB_draw_elements_base_vertex_glDrawElementsInstancedBaseVertex_pointer;
/* 111 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 112 */     GLChecks.ensureElementVBOenabled(caps);
/* 113 */     nglDrawElementsInstancedBaseVertexBO(mode, count, type, indices_buffer_offset, primcount, basevertex, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDrawElementsInstancedBaseVertexBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, int paramInt5, long paramLong2);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBDrawElementsBaseVertex.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */