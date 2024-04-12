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
/*     */ public final class ATIVertexArrayObject
/*     */ {
/*     */   public static final int GL_STATIC_ATI = 34656;
/*     */   public static final int GL_DYNAMIC_ATI = 34657;
/*     */   public static final int GL_PRESERVE_ATI = 34658;
/*     */   public static final int GL_DISCARD_ATI = 34659;
/*     */   public static final int GL_OBJECT_BUFFER_SIZE_ATI = 34660;
/*     */   public static final int GL_OBJECT_BUFFER_USAGE_ATI = 34661;
/*     */   public static final int GL_ARRAY_OBJECT_BUFFER_ATI = 34662;
/*     */   public static final int GL_ARRAY_OBJECT_OFFSET_ATI = 34663;
/*     */   
/*     */   public static int glNewObjectBufferATI(int size, int usage) {
/*  24 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  25 */     long function_pointer = caps.ATI_vertex_array_object_glNewObjectBufferATI_pointer;
/*  26 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  27 */     int __result = nglNewObjectBufferATI(size, null, 0, usage, function_pointer);
/*  28 */     return __result;
/*     */   }
/*     */   public static int glNewObjectBufferATI(ByteBuffer pPointer, int usage) {
/*  31 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  32 */     long function_pointer = caps.ATI_vertex_array_object_glNewObjectBufferATI_pointer;
/*  33 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  34 */     BufferChecks.checkDirect(pPointer);
/*  35 */     int __result = nglNewObjectBufferATI(pPointer.remaining(), pPointer, pPointer.position(), usage, function_pointer);
/*  36 */     return __result;
/*     */   }
/*     */   public static int glNewObjectBufferATI(DoubleBuffer pPointer, int usage) {
/*  39 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  40 */     long function_pointer = caps.ATI_vertex_array_object_glNewObjectBufferATI_pointer;
/*  41 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  42 */     BufferChecks.checkDirect(pPointer);
/*  43 */     int __result = nglNewObjectBufferATI(pPointer.remaining() << 3, pPointer, pPointer.position() << 3, usage, function_pointer);
/*  44 */     return __result;
/*     */   }
/*     */   public static int glNewObjectBufferATI(FloatBuffer pPointer, int usage) {
/*  47 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  48 */     long function_pointer = caps.ATI_vertex_array_object_glNewObjectBufferATI_pointer;
/*  49 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  50 */     BufferChecks.checkDirect(pPointer);
/*  51 */     int __result = nglNewObjectBufferATI(pPointer.remaining() << 2, pPointer, pPointer.position() << 2, usage, function_pointer);
/*  52 */     return __result;
/*     */   }
/*     */   public static int glNewObjectBufferATI(IntBuffer pPointer, int usage) {
/*  55 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  56 */     long function_pointer = caps.ATI_vertex_array_object_glNewObjectBufferATI_pointer;
/*  57 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  58 */     BufferChecks.checkDirect(pPointer);
/*  59 */     int __result = nglNewObjectBufferATI(pPointer.remaining() << 2, pPointer, pPointer.position() << 2, usage, function_pointer);
/*  60 */     return __result;
/*     */   }
/*     */   public static int glNewObjectBufferATI(ShortBuffer pPointer, int usage) {
/*  63 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  64 */     long function_pointer = caps.ATI_vertex_array_object_glNewObjectBufferATI_pointer;
/*  65 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  66 */     BufferChecks.checkDirect(pPointer);
/*  67 */     int __result = nglNewObjectBufferATI(pPointer.remaining() << 1, pPointer, pPointer.position() << 1, usage, function_pointer);
/*  68 */     return __result;
/*     */   }
/*     */   private static native int nglNewObjectBufferATI(int paramInt1, Buffer paramBuffer, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static boolean glIsObjectBufferATI(int buffer) {
/*  73 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  74 */     long function_pointer = caps.ATI_vertex_array_object_glIsObjectBufferATI_pointer;
/*  75 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  76 */     boolean __result = nglIsObjectBufferATI(buffer, function_pointer);
/*  77 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsObjectBufferATI(int paramInt, long paramLong);
/*     */   
/*     */   public static void glUpdateObjectBufferATI(int buffer, int offset, ByteBuffer pPointer, int preserve) {
/*  82 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  83 */     long function_pointer = caps.ATI_vertex_array_object_glUpdateObjectBufferATI_pointer;
/*  84 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  85 */     BufferChecks.checkDirect(pPointer);
/*  86 */     nglUpdateObjectBufferATI(buffer, offset, pPointer.remaining(), pPointer, pPointer.position(), preserve, function_pointer);
/*     */   }
/*     */   public static void glUpdateObjectBufferATI(int buffer, int offset, DoubleBuffer pPointer, int preserve) {
/*  89 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  90 */     long function_pointer = caps.ATI_vertex_array_object_glUpdateObjectBufferATI_pointer;
/*  91 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  92 */     BufferChecks.checkDirect(pPointer);
/*  93 */     nglUpdateObjectBufferATI(buffer, offset, pPointer.remaining() << 3, pPointer, pPointer.position() << 3, preserve, function_pointer);
/*     */   }
/*     */   public static void glUpdateObjectBufferATI(int buffer, int offset, FloatBuffer pPointer, int preserve) {
/*  96 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  97 */     long function_pointer = caps.ATI_vertex_array_object_glUpdateObjectBufferATI_pointer;
/*  98 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  99 */     BufferChecks.checkDirect(pPointer);
/* 100 */     nglUpdateObjectBufferATI(buffer, offset, pPointer.remaining() << 2, pPointer, pPointer.position() << 2, preserve, function_pointer);
/*     */   }
/*     */   public static void glUpdateObjectBufferATI(int buffer, int offset, IntBuffer pPointer, int preserve) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.ATI_vertex_array_object_glUpdateObjectBufferATI_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     BufferChecks.checkDirect(pPointer);
/* 107 */     nglUpdateObjectBufferATI(buffer, offset, pPointer.remaining() << 2, pPointer, pPointer.position() << 2, preserve, function_pointer);
/*     */   }
/*     */   public static void glUpdateObjectBufferATI(int buffer, int offset, ShortBuffer pPointer, int preserve) {
/* 110 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 111 */     long function_pointer = caps.ATI_vertex_array_object_glUpdateObjectBufferATI_pointer;
/* 112 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 113 */     BufferChecks.checkDirect(pPointer);
/* 114 */     nglUpdateObjectBufferATI(buffer, offset, pPointer.remaining() << 1, pPointer, pPointer.position() << 1, preserve, function_pointer);
/*     */   }
/*     */   private static native void nglUpdateObjectBufferATI(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glGetObjectBufferATI(int buffer, int pname, FloatBuffer params) {
/* 119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 120 */     long function_pointer = caps.ATI_vertex_array_object_glGetObjectBufferfvATI_pointer;
/* 121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 122 */     BufferChecks.checkDirect(params);
/* 123 */     nglGetObjectBufferfvATI(buffer, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetObjectBufferfvATI(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetObjectBufferATI(int buffer, int pname, IntBuffer params) {
/* 128 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 129 */     long function_pointer = caps.ATI_vertex_array_object_glGetObjectBufferivATI_pointer;
/* 130 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 131 */     BufferChecks.checkDirect(params);
/* 132 */     nglGetObjectBufferivATI(buffer, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetObjectBufferivATI(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glFreeObjectBufferATI(int buffer) {
/* 137 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 138 */     long function_pointer = caps.ATI_vertex_array_object_glFreeObjectBufferATI_pointer;
/* 139 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 140 */     nglFreeObjectBufferATI(buffer, function_pointer);
/*     */   }
/*     */   private static native void nglFreeObjectBufferATI(int paramInt, long paramLong);
/*     */   
/*     */   public static void glArrayObjectATI(int array, int size, int type, int stride, int buffer, int offset) {
/* 145 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 146 */     long function_pointer = caps.ATI_vertex_array_object_glArrayObjectATI_pointer;
/* 147 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 148 */     nglArrayObjectATI(array, size, type, stride, buffer, offset, function_pointer);
/*     */   }
/*     */   private static native void nglArrayObjectATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glGetArrayObjectATI(int array, int pname, FloatBuffer params) {
/* 153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 154 */     long function_pointer = caps.ATI_vertex_array_object_glGetArrayObjectfvATI_pointer;
/* 155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 156 */     BufferChecks.checkBuffer(params, 4);
/* 157 */     nglGetArrayObjectfvATI(array, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetArrayObjectfvATI(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetArrayObjectATI(int array, int pname, IntBuffer params) {
/* 162 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 163 */     long function_pointer = caps.ATI_vertex_array_object_glGetArrayObjectivATI_pointer;
/* 164 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 165 */     BufferChecks.checkBuffer(params, 4);
/* 166 */     nglGetArrayObjectivATI(array, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetArrayObjectivATI(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVariantArrayObjectATI(int id, int type, int stride, int buffer, int offset) {
/* 171 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 172 */     long function_pointer = caps.ATI_vertex_array_object_glVariantArrayObjectATI_pointer;
/* 173 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 174 */     nglVariantArrayObjectATI(id, type, stride, buffer, offset, function_pointer);
/*     */   }
/*     */   private static native void nglVariantArrayObjectATI(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glGetVariantArrayObjectATI(int id, int pname, FloatBuffer params) {
/* 179 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 180 */     long function_pointer = caps.ATI_vertex_array_object_glGetVariantArrayObjectfvATI_pointer;
/* 181 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 182 */     BufferChecks.checkBuffer(params, 4);
/* 183 */     nglGetVariantArrayObjectfvATI(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVariantArrayObjectfvATI(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVariantArrayObjectATI(int id, int pname, IntBuffer params) {
/* 188 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 189 */     long function_pointer = caps.ATI_vertex_array_object_glGetVariantArrayObjectivATI_pointer;
/* 190 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 191 */     BufferChecks.checkBuffer(params, 4);
/* 192 */     nglGetVariantArrayObjectivATI(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetVariantArrayObjectivATI(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ATIVertexArrayObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */