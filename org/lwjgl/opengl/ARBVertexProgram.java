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
/*     */ public final class ARBVertexProgram
/*     */   extends ARBProgram
/*     */ {
/*     */   public static final int GL_VERTEX_PROGRAM_ARB = 34336;
/*     */   public static final int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 34370;
/*     */   public static final int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = 34371;
/*     */   public static final int GL_COLOR_SUM_ARB = 33880;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = 34338;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = 34339;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = 34340;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = 34341;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 34922;
/*     */   public static final int GL_CURRENT_VERTEX_ATTRIB_ARB = 34342;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 34373;
/*     */   public static final int GL_PROGRAM_ADDRESS_REGISTERS_ARB = 34992;
/*     */   public static final int GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB = 34993;
/*     */   public static final int GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 34994;
/*     */   public static final int GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 34995;
/*     */   public static final int GL_MAX_VERTEX_ATTRIBS_ARB = 34921;
/*     */   
/*     */   public static void glVertexAttrib1sARB(int index, short x) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib1sARB_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     nglVertexAttrib1sARB(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1sARB(int paramInt, short paramShort, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib1fARB(int index, float x) {
/*  66 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  67 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib1fARB_pointer;
/*  68 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  69 */     nglVertexAttrib1fARB(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1fARB(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib1dARB(int index, double x) {
/*  74 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  75 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib1dARB_pointer;
/*  76 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  77 */     nglVertexAttrib1dARB(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1dARB(int paramInt, double paramDouble, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2sARB(int index, short x, short y) {
/*  82 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  83 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib2sARB_pointer;
/*  84 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  85 */     nglVertexAttrib2sARB(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2sARB(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2fARB(int index, float x, float y) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib2fARB_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     nglVertexAttrib2fARB(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2fARB(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2dARB(int index, double x, double y) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib2dARB_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     nglVertexAttrib2dARB(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2dARB(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3sARB(int index, short x, short y, short z) {
/* 106 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 107 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib3sARB_pointer;
/* 108 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 109 */     nglVertexAttrib3sARB(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3sARB(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3fARB(int index, float x, float y, float z) {
/* 114 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 115 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib3fARB_pointer;
/* 116 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 117 */     nglVertexAttrib3fARB(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3dARB(int index, double x, double y, double z) {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib3dARB_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     nglVertexAttrib3dARB(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3dARB(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4sARB(int index, short x, short y, short z, short w) {
/* 130 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 131 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib4sARB_pointer;
/* 132 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 133 */     nglVertexAttrib4sARB(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4sARB(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4fARB(int index, float x, float y, float z, float w) {
/* 138 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 139 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib4fARB_pointer;
/* 140 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 141 */     nglVertexAttrib4fARB(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4fARB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4dARB(int index, double x, double y, double z, double w) {
/* 146 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 147 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib4dARB_pointer;
/* 148 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 149 */     nglVertexAttrib4dARB(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4dARB(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
/* 154 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 155 */     long function_pointer = caps.ARB_vertex_program_glVertexAttrib4NubARB_pointer;
/* 156 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 157 */     nglVertexAttrib4NubARB(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4NubARB(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, DoubleBuffer buffer) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.ARB_vertex_program_glVertexAttribPointerARB_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 166 */     BufferChecks.checkDirect(buffer);
/* 167 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 168 */     nglVertexAttribPointerARB(index, size, 5130, normalized, stride, buffer, buffer.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, FloatBuffer buffer) {
/* 171 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 172 */     long function_pointer = caps.ARB_vertex_program_glVertexAttribPointerARB_pointer;
/* 173 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 174 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 175 */     BufferChecks.checkDirect(buffer);
/* 176 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 177 */     nglVertexAttribPointerARB(index, size, 5126, normalized, stride, buffer, buffer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer buffer) {
/* 180 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 181 */     long function_pointer = caps.ARB_vertex_program_glVertexAttribPointerARB_pointer;
/* 182 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 183 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 184 */     BufferChecks.checkDirect(buffer);
/* 185 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 186 */     nglVertexAttribPointerARB(index, size, unsigned ? 5121 : 5120, normalized, stride, buffer, buffer.position(), function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, IntBuffer buffer) {
/* 189 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 190 */     long function_pointer = caps.ARB_vertex_program_glVertexAttribPointerARB_pointer;
/* 191 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 192 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 193 */     BufferChecks.checkDirect(buffer);
/* 194 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 195 */     nglVertexAttribPointerARB(index, size, unsigned ? 5125 : 5124, normalized, stride, buffer, buffer.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer buffer) {
/* 198 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 199 */     long function_pointer = caps.ARB_vertex_program_glVertexAttribPointerARB_pointer;
/* 200 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 201 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 202 */     BufferChecks.checkDirect(buffer);
/* 203 */     (GLChecks.getReferences(caps)).glVertexAttribPointer_buffer[index] = buffer;
/* 204 */     nglVertexAttribPointerARB(index, size, unsigned ? 5123 : 5122, normalized, stride, buffer, buffer.position() << 1, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long buffer_buffer_offset) {
/* 208 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 209 */     long function_pointer = caps.ARB_vertex_program_glVertexAttribPointerARB_pointer;
/* 210 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 211 */     GLChecks.ensureArrayVBOenabled(caps);
/* 212 */     nglVertexAttribPointerARBBO(index, size, type, normalized, stride, buffer_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribPointerARB(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*     */   private static native void nglVertexAttribPointerARBBO(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, long paramLong1, long paramLong2);
/*     */   public static void glEnableVertexAttribArrayARB(int index) {
/* 217 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 218 */     long function_pointer = caps.ARB_vertex_program_glEnableVertexAttribArrayARB_pointer;
/* 219 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 220 */     nglEnableVertexAttribArrayARB(index, function_pointer);
/*     */   }
/*     */   private static native void nglEnableVertexAttribArrayARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glDisableVertexAttribArrayARB(int index) {
/* 225 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 226 */     long function_pointer = caps.ARB_vertex_program_glDisableVertexAttribArrayARB_pointer;
/* 227 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 228 */     nglDisableVertexAttribArrayARB(index, function_pointer);
/*     */   }
/*     */   private static native void nglDisableVertexAttribArrayARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribARB(int index, int pname, FloatBuffer params) {
/* 233 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 234 */     long function_pointer = caps.ARB_vertex_program_glGetVertexAttribfvARB_pointer;
/* 235 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 236 */     BufferChecks.checkBuffer(params, 4);
/* 237 */     nglGetVertexAttribfvARB(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribfvARB(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribARB(int index, int pname, DoubleBuffer params) {
/* 242 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 243 */     long function_pointer = caps.ARB_vertex_program_glGetVertexAttribdvARB_pointer;
/* 244 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 245 */     BufferChecks.checkBuffer(params, 4);
/* 246 */     nglGetVertexAttribdvARB(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribdvARB(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVertexAttribARB(int index, int pname, IntBuffer params) {
/* 251 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 252 */     long function_pointer = caps.ARB_vertex_program_glGetVertexAttribivARB_pointer;
/* 253 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 254 */     BufferChecks.checkBuffer(params, 4);
/* 255 */     nglGetVertexAttribivARB(index, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVertexAttribivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static ByteBuffer glGetVertexAttribPointerARB(int index, int pname, long result_size) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.ARB_vertex_program_glGetVertexAttribPointervARB_pointer;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     ByteBuffer __result = nglGetVertexAttribPointervARB(index, pname, result_size, function_pointer);
/* 264 */     return __result;
/*     */   }
/*     */   
/*     */   private static native ByteBuffer nglGetVertexAttribPointervARB(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBVertexProgram.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */