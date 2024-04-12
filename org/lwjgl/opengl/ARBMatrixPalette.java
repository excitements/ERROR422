/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import java.nio.ShortBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ARBMatrixPalette
/*    */ {
/*    */   public static final int GL_MATRIX_PALETTE_ARB = 34880;
/*    */   public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 34881;
/*    */   public static final int GL_MAX_PALETTE_MATRICES_ARB = 34882;
/*    */   public static final int GL_CURRENT_PALETTE_MATRIX_ARB = 34883;
/*    */   public static final int GL_MATRIX_INDEX_ARRAY_ARB = 34884;
/*    */   public static final int GL_CURRENT_MATRIX_INDEX_ARB = 34885;
/*    */   public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 34886;
/*    */   public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 34887;
/*    */   public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 34888;
/*    */   public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 34889;
/*    */   
/*    */   public static void glCurrentPaletteMatrixARB(int index) {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.ARB_matrix_palette_glCurrentPaletteMatrixARB_pointer;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     nglCurrentPaletteMatrixARB(index, function_pointer);
/*    */   }
/*    */   private static native void nglCurrentPaletteMatrixARB(int paramInt, long paramLong);
/*    */   
/*    */   public static void glMatrixIndexPointerARB(int size, int stride, ByteBuffer pPointer) {
/* 34 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 35 */     long function_pointer = caps.ARB_matrix_palette_glMatrixIndexPointerARB_pointer;
/* 36 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 37 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 38 */     BufferChecks.checkDirect(pPointer);
/* 39 */     (GLChecks.getReferences(caps)).ARB_matrix_palette_glMatrixIndexPointerARB_pPointer = pPointer;
/* 40 */     nglMatrixIndexPointerARB(size, 5121, stride, pPointer, pPointer.position(), function_pointer);
/*    */   }
/*    */   public static void glMatrixIndexPointerARB(int size, int stride, IntBuffer pPointer) {
/* 43 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 44 */     long function_pointer = caps.ARB_matrix_palette_glMatrixIndexPointerARB_pointer;
/* 45 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 46 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 47 */     BufferChecks.checkDirect(pPointer);
/* 48 */     (GLChecks.getReferences(caps)).ARB_matrix_palette_glMatrixIndexPointerARB_pPointer = pPointer;
/* 49 */     nglMatrixIndexPointerARB(size, 5125, stride, pPointer, pPointer.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glMatrixIndexPointerARB(int size, int stride, ShortBuffer pPointer) {
/* 52 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 53 */     long function_pointer = caps.ARB_matrix_palette_glMatrixIndexPointerARB_pointer;
/* 54 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 55 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 56 */     BufferChecks.checkDirect(pPointer);
/* 57 */     (GLChecks.getReferences(caps)).ARB_matrix_palette_glMatrixIndexPointerARB_pPointer = pPointer;
/* 58 */     nglMatrixIndexPointerARB(size, 5123, stride, pPointer, pPointer.position() << 1, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glMatrixIndexPointerARB(int size, int type, int stride, long pPointer_buffer_offset) {
/* 62 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 63 */     long function_pointer = caps.ARB_matrix_palette_glMatrixIndexPointerARB_pointer;
/* 64 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 65 */     GLChecks.ensureArrayVBOenabled(caps);
/* 66 */     nglMatrixIndexPointerARBBO(size, type, stride, pPointer_buffer_offset, function_pointer);
/*    */   }
/*    */   private static native void nglMatrixIndexPointerARB(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*    */   private static native void nglMatrixIndexPointerARBBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*    */   public static void glMatrixIndexuARB(ByteBuffer pIndices) {
/* 71 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 72 */     long function_pointer = caps.ARB_matrix_palette_glMatrixIndexubvARB_pointer;
/* 73 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 74 */     BufferChecks.checkDirect(pIndices);
/* 75 */     nglMatrixIndexubvARB(pIndices.remaining(), pIndices, pIndices.position(), function_pointer);
/*    */   }
/*    */   private static native void nglMatrixIndexubvARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glMatrixIndexuARB(ShortBuffer pIndices) {
/* 80 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 81 */     long function_pointer = caps.ARB_matrix_palette_glMatrixIndexusvARB_pointer;
/* 82 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 83 */     BufferChecks.checkDirect(pIndices);
/* 84 */     nglMatrixIndexusvARB(pIndices.remaining(), pIndices, pIndices.position(), function_pointer);
/*    */   }
/*    */   private static native void nglMatrixIndexusvARB(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glMatrixIndexuARB(IntBuffer pIndices) {
/* 89 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 90 */     long function_pointer = caps.ARB_matrix_palette_glMatrixIndexuivARB_pointer;
/* 91 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 92 */     BufferChecks.checkDirect(pIndices);
/* 93 */     nglMatrixIndexuivARB(pIndices.remaining(), pIndices, pIndices.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglMatrixIndexuivARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBMatrixPalette.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */