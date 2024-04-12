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
/*     */ public final class NVVertexBufferUnifiedMemory
/*     */ {
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 36638;
/*     */   public static final int GL_ELEMENT_ARRAY_UNIFIED_NV = 36639;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 36640;
/*     */   public static final int GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 36645;
/*     */   public static final int GL_VERTEX_ARRAY_ADDRESS_NV = 36641;
/*     */   public static final int GL_NORMAL_ARRAY_ADDRESS_NV = 36642;
/*     */   public static final int GL_COLOR_ARRAY_ADDRESS_NV = 36643;
/*     */   public static final int GL_INDEX_ARRAY_ADDRESS_NV = 36644;
/*     */   public static final int GL_EDGE_FLAG_ARRAY_ADDRESS_NV = 36646;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 36647;
/*     */   public static final int GL_FOG_COORD_ARRAY_ADDRESS_NV = 36648;
/*     */   public static final int GL_ELEMENT_ARRAY_ADDRESS_NV = 36649;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 36650;
/*     */   public static final int GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 36655;
/*     */   public static final int GL_VERTEX_ARRAY_LENGTH_NV = 36651;
/*     */   public static final int GL_NORMAL_ARRAY_LENGTH_NV = 36652;
/*     */   public static final int GL_COLOR_ARRAY_LENGTH_NV = 36653;
/*     */   public static final int GL_INDEX_ARRAY_LENGTH_NV = 36654;
/*     */   public static final int GL_EDGE_FLAG_ARRAY_LENGTH_NV = 36656;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 36657;
/*     */   public static final int GL_FOG_COORD_ARRAY_LENGTH_NV = 36658;
/*     */   public static final int GL_ELEMENT_ARRAY_LENGTH_NV = 36659;
/*     */   
/*     */   private static native void nglBufferAddressRangeNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   public static void glBufferAddressRangeNV(int pname, int index, long address, long length) {
/*  56 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  57 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glBufferAddressRangeNV_pointer;
/*  58 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  59 */     nglBufferAddressRangeNV(pname, index, address, length, function_pointer);
/*     */   }
/*     */   private static native void nglVertexFormatNV(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexFormatNV(int size, int type, int stride) {
/*  64 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  65 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glVertexFormatNV_pointer;
/*  66 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  67 */     nglVertexFormatNV(size, type, stride, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glNormalFormatNV(int type, int stride) {
/*  72 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  73 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glNormalFormatNV_pointer;
/*  74 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  75 */     nglNormalFormatNV(type, stride, function_pointer);
/*     */   }
/*     */   private static native void nglNormalFormatNV(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorFormatNV(int size, int type, int stride) {
/*  80 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  81 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glColorFormatNV_pointer;
/*  82 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  83 */     nglColorFormatNV(size, type, stride, function_pointer);
/*     */   }
/*     */   private static native void nglColorFormatNV(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glIndexFormatNV(int type, int stride) {
/*  88 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  89 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glIndexFormatNV_pointer;
/*  90 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  91 */     nglIndexFormatNV(type, stride, function_pointer);
/*     */   }
/*     */   private static native void nglIndexFormatNV(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordFormatNV(int size, int type, int stride) {
/*  96 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  97 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glTexCoordFormatNV_pointer;
/*  98 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  99 */     nglTexCoordFormatNV(size, type, stride, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordFormatNV(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glEdgeFlagFormatNV(int stride) {
/* 104 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 105 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glEdgeFlagFormatNV_pointer;
/* 106 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 107 */     nglEdgeFlagFormatNV(stride, function_pointer);
/*     */   }
/*     */   private static native void nglEdgeFlagFormatNV(int paramInt, long paramLong);
/*     */   
/*     */   public static void glSecondaryColorFormatNV(int size, int type, int stride) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glSecondaryColorFormatNV_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     nglSecondaryColorFormatNV(size, type, stride, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColorFormatNV(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glFogCoordFormatNV(int type, int stride) {
/* 120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 121 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glFogCoordFormatNV_pointer;
/* 122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 123 */     nglFogCoordFormatNV(type, stride, function_pointer);
/*     */   }
/*     */   private static native void nglFogCoordFormatNV(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribFormatNV(int index, int size, int type, boolean normalized, int stride) {
/* 128 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 129 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glVertexAttribFormatNV_pointer;
/* 130 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 131 */     nglVertexAttribFormatNV(index, size, type, normalized, stride, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribFormatNV(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribIFormatNV(int index, int size, int type, int stride) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glVertexAttribIFormatNV_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     nglVertexAttribIFormatNV(index, size, type, stride, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribIFormatNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetIntegeruNV(int value, int index, LongBuffer result) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glGetIntegerui64i_vNV_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     BufferChecks.checkBuffer(result, 1);
/* 148 */     nglGetIntegerui64i_vNV(value, index, result, result.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetIntegerui64i_vNV(int paramInt1, int paramInt2, LongBuffer paramLongBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static long glGetIntegeruNV(int value, int index) {
/* 154 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 155 */     long function_pointer = caps.NV_vertex_buffer_unified_memory_glGetIntegerui64i_vNV_pointer;
/* 156 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 157 */     LongBuffer result = APIUtils.getBufferLong();
/* 158 */     nglGetIntegerui64i_vNV(value, index, result, result.position(), function_pointer);
/* 159 */     return result.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVVertexBufferUnifiedMemory.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */