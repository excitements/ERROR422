/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.DoubleBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.ShortBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ public final class ARBVertexBlend
/*     */ {
/*     */   public static final int GL_MAX_VERTEX_UNITS_ARB = 34468;
/*     */   public static final int GL_ACTIVE_VERTEX_UNITS_ARB = 34469;
/*     */   public static final int GL_WEIGHT_SUM_UNITY_ARB = 34470;
/*     */   public static final int GL_VERTEX_BLEND_ARB = 34471;
/*     */   public static final int GL_CURRENT_WEIGHT_ARB = 34472;
/*     */   public static final int GL_WEIGHT_ARRAY_TYPE_ARB = 34473;
/*     */   public static final int GL_WEIGHT_ARRAY_STRIDE_ARB = 34474;
/*     */   public static final int GL_WEIGHT_ARRAY_SIZE_ARB = 34475;
/*     */   public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 34476;
/*     */   public static final int GL_WEIGHT_ARRAY_ARB = 34477;
/*     */   public static final int GL_MODELVIEW0_ARB = 5888;
/*     */   public static final int GL_MODELVIEW1_ARB = 34058;
/*     */   public static final int GL_MODELVIEW2_ARB = 34594;
/*     */   public static final int GL_MODELVIEW3_ARB = 34595;
/*     */   public static final int GL_MODELVIEW4_ARB = 34596;
/*     */   public static final int GL_MODELVIEW5_ARB = 34597;
/*     */   public static final int GL_MODELVIEW6_ARB = 34598;
/*     */   public static final int GL_MODELVIEW7_ARB = 34599;
/*     */   public static final int GL_MODELVIEW8_ARB = 34600;
/*     */   public static final int GL_MODELVIEW9_ARB = 34601;
/*     */   public static final int GL_MODELVIEW10_ARB = 34602;
/*     */   public static final int GL_MODELVIEW11_ARB = 34603;
/*     */   public static final int GL_MODELVIEW12_ARB = 34604;
/*     */   public static final int GL_MODELVIEW13_ARB = 34605;
/*     */   public static final int GL_MODELVIEW14_ARB = 34606;
/*     */   public static final int GL_MODELVIEW15_ARB = 34607;
/*     */   public static final int GL_MODELVIEW16_ARB = 34608;
/*     */   public static final int GL_MODELVIEW17_ARB = 34609;
/*     */   public static final int GL_MODELVIEW18_ARB = 34610;
/*     */   public static final int GL_MODELVIEW19_ARB = 34611;
/*     */   public static final int GL_MODELVIEW20_ARB = 34612;
/*     */   public static final int GL_MODELVIEW21_ARB = 34613;
/*     */   public static final int GL_MODELVIEW22_ARB = 34614;
/*     */   public static final int GL_MODELVIEW23_ARB = 34615;
/*     */   public static final int GL_MODELVIEW24_ARB = 34616;
/*     */   public static final int GL_MODELVIEW25_ARB = 34617;
/*     */   public static final int GL_MODELVIEW26_ARB = 34618;
/*     */   public static final int GL_MODELVIEW27_ARB = 34619;
/*     */   public static final int GL_MODELVIEW28_ARB = 34620;
/*     */   public static final int GL_MODELVIEW29_ARB = 34621;
/*     */   public static final int GL_MODELVIEW30_ARB = 34622;
/*     */   public static final int GL_MODELVIEW31_ARB = 34623;
/*     */   
/*     */   public static void glWeightARB(ByteBuffer pWeights) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.ARB_vertex_blend_glWeightbvARB_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     BufferChecks.checkDirect(pWeights);
/*  62 */     nglWeightbvARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightbvARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightARB(ShortBuffer pWeights) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.ARB_vertex_blend_glWeightsvARB_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     BufferChecks.checkDirect(pWeights);
/*  71 */     nglWeightsvARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightsvARB(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightARB(IntBuffer pWeights) {
/*  76 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  77 */     long function_pointer = caps.ARB_vertex_blend_glWeightivARB_pointer;
/*  78 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  79 */     BufferChecks.checkDirect(pWeights);
/*  80 */     nglWeightivARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightivARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightARB(FloatBuffer pWeights) {
/*  85 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  86 */     long function_pointer = caps.ARB_vertex_blend_glWeightfvARB_pointer;
/*  87 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  88 */     BufferChecks.checkDirect(pWeights);
/*  89 */     nglWeightfvARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightfvARB(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightARB(DoubleBuffer pWeights) {
/*  94 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  95 */     long function_pointer = caps.ARB_vertex_blend_glWeightdvARB_pointer;
/*  96 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  97 */     BufferChecks.checkDirect(pWeights);
/*  98 */     nglWeightdvARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightdvARB(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightuARB(ByteBuffer pWeights) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.ARB_vertex_blend_glWeightubvARB_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     BufferChecks.checkDirect(pWeights);
/* 107 */     nglWeightubvARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightubvARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightuARB(ShortBuffer pWeights) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.ARB_vertex_blend_glWeightusvARB_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     BufferChecks.checkDirect(pWeights);
/* 116 */     nglWeightusvARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightusvARB(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightuARB(IntBuffer pWeights) {
/* 121 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 122 */     long function_pointer = caps.ARB_vertex_blend_glWeightuivARB_pointer;
/* 123 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 124 */     BufferChecks.checkDirect(pWeights);
/* 125 */     nglWeightuivARB(pWeights.remaining(), pWeights, pWeights.position(), function_pointer);
/*     */   }
/*     */   private static native void nglWeightuivARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glWeightPointerARB(int size, int stride, DoubleBuffer pPointer) {
/* 130 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 131 */     long function_pointer = caps.ARB_vertex_blend_glWeightPointerARB_pointer;
/* 132 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 133 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 134 */     BufferChecks.checkDirect(pPointer);
/* 135 */     (GLChecks.getReferences(caps)).ARB_vertex_blend_glWeightPointerARB_pPointer = pPointer;
/* 136 */     nglWeightPointerARB(size, 5130, stride, pPointer, pPointer.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glWeightPointerARB(int size, int stride, FloatBuffer pPointer) {
/* 139 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 140 */     long function_pointer = caps.ARB_vertex_blend_glWeightPointerARB_pointer;
/* 141 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 142 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 143 */     BufferChecks.checkDirect(pPointer);
/* 144 */     (GLChecks.getReferences(caps)).ARB_vertex_blend_glWeightPointerARB_pPointer = pPointer;
/* 145 */     nglWeightPointerARB(size, 5126, stride, pPointer, pPointer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glWeightPointerARB(int size, boolean unsigned, int stride, ByteBuffer pPointer) {
/* 148 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 149 */     long function_pointer = caps.ARB_vertex_blend_glWeightPointerARB_pointer;
/* 150 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 151 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 152 */     BufferChecks.checkDirect(pPointer);
/* 153 */     (GLChecks.getReferences(caps)).ARB_vertex_blend_glWeightPointerARB_pPointer = pPointer;
/* 154 */     nglWeightPointerARB(size, unsigned ? 5121 : 5120, stride, pPointer, pPointer.position(), function_pointer);
/*     */   }
/*     */   public static void glWeightPointerARB(int size, boolean unsigned, int stride, IntBuffer pPointer) {
/* 157 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 158 */     long function_pointer = caps.ARB_vertex_blend_glWeightPointerARB_pointer;
/* 159 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 160 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 161 */     BufferChecks.checkDirect(pPointer);
/* 162 */     (GLChecks.getReferences(caps)).ARB_vertex_blend_glWeightPointerARB_pPointer = pPointer;
/* 163 */     nglWeightPointerARB(size, unsigned ? 5125 : 5124, stride, pPointer, pPointer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glWeightPointerARB(int size, boolean unsigned, int stride, ShortBuffer pPointer) {
/* 166 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 167 */     long function_pointer = caps.ARB_vertex_blend_glWeightPointerARB_pointer;
/* 168 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 169 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 170 */     BufferChecks.checkDirect(pPointer);
/* 171 */     (GLChecks.getReferences(caps)).ARB_vertex_blend_glWeightPointerARB_pPointer = pPointer;
/* 172 */     nglWeightPointerARB(size, unsigned ? 5123 : 5122, stride, pPointer, pPointer.position() << 1, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glWeightPointerARB(int size, int type, int stride, long pPointer_buffer_offset) {
/* 176 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 177 */     long function_pointer = caps.ARB_vertex_blend_glWeightPointerARB_pointer;
/* 178 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 179 */     GLChecks.ensureArrayVBOenabled(caps);
/* 180 */     nglWeightPointerARBBO(size, type, stride, pPointer_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglWeightPointerARB(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*     */   private static native void nglWeightPointerARBBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*     */   public static void glVertexBlendARB(int count) {
/* 185 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 186 */     long function_pointer = caps.ARB_vertex_blend_glVertexBlendARB_pointer;
/* 187 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 188 */     nglVertexBlendARB(count, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexBlendARB(int paramInt, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBVertexBlend.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */