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
/*     */ public class ARBBufferObject
/*     */ {
/*     */   public static final int GL_STREAM_DRAW_ARB = 35040;
/*     */   public static final int GL_STREAM_READ_ARB = 35041;
/*     */   public static final int GL_STREAM_COPY_ARB = 35042;
/*     */   public static final int GL_STATIC_DRAW_ARB = 35044;
/*     */   public static final int GL_STATIC_READ_ARB = 35045;
/*     */   public static final int GL_STATIC_COPY_ARB = 35046;
/*     */   public static final int GL_DYNAMIC_DRAW_ARB = 35048;
/*     */   public static final int GL_DYNAMIC_READ_ARB = 35049;
/*     */   public static final int GL_DYNAMIC_COPY_ARB = 35050;
/*     */   public static final int GL_READ_ONLY_ARB = 35000;
/*     */   public static final int GL_WRITE_ONLY_ARB = 35001;
/*     */   public static final int GL_READ_WRITE_ARB = 35002;
/*     */   public static final int GL_BUFFER_SIZE_ARB = 34660;
/*     */   public static final int GL_BUFFER_USAGE_ARB = 34661;
/*     */   public static final int GL_BUFFER_ACCESS_ARB = 35003;
/*     */   public static final int GL_BUFFER_MAPPED_ARB = 35004;
/*     */   public static final int GL_BUFFER_MAP_POINTER_ARB = 35005;
/*     */   
/*     */   public static void glBindBufferARB(int target, int buffer) {
/*  39 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  40 */     long function_pointer = caps.ARB_buffer_object_glBindBufferARB_pointer;
/*  41 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  42 */     StateTracker.bindBuffer(caps, target, buffer);
/*  43 */     nglBindBufferARB(target, buffer, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffersARB(IntBuffer buffers) {
/*  48 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  49 */     long function_pointer = caps.ARB_buffer_object_glDeleteBuffersARB_pointer;
/*  50 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  51 */     BufferChecks.checkDirect(buffers);
/*  52 */     nglDeleteBuffersARB(buffers.remaining(), buffers, buffers.position(), function_pointer);
/*     */   }
/*     */   private static native void nglBindBufferARB(int paramInt1, int paramInt2, long paramLong);
/*     */   private static native void nglDeleteBuffersARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteBuffersARB(int buffer) {
/*  58 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  59 */     long function_pointer = caps.ARB_buffer_object_glDeleteBuffersARB_pointer;
/*  60 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  61 */     nglDeleteBuffersARB(1, APIUtils.getBufferInt().put(0, buffer), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenBuffersARB(IntBuffer buffers) {
/*  65 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  66 */     long function_pointer = caps.ARB_buffer_object_glGenBuffersARB_pointer;
/*  67 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  68 */     BufferChecks.checkDirect(buffers);
/*  69 */     nglGenBuffersARB(buffers.remaining(), buffers, buffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenBuffersARB(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenBuffersARB() {
/*  75 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  76 */     long function_pointer = caps.ARB_buffer_object_glGenBuffersARB_pointer;
/*  77 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  78 */     IntBuffer buffers = APIUtils.getBufferInt();
/*  79 */     nglGenBuffersARB(1, buffers, buffers.position(), function_pointer);
/*  80 */     return buffers.get(0);
/*     */   }
/*     */   
/*     */   public static boolean glIsBufferARB(int buffer) {
/*  84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  85 */     long function_pointer = caps.ARB_buffer_object_glIsBufferARB_pointer;
/*  86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  87 */     boolean __result = nglIsBufferARB(buffer, function_pointer);
/*  88 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsBufferARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glBufferDataARB(int target, long size, int usage) {
/*  93 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  94 */     long function_pointer = caps.ARB_buffer_object_glBufferDataARB_pointer;
/*  95 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  96 */     nglBufferDataARB(target, size, null, 0, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferDataARB(int target, ByteBuffer data, int usage) {
/*  99 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 100 */     long function_pointer = caps.ARB_buffer_object_glBufferDataARB_pointer;
/* 101 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 102 */     BufferChecks.checkDirect(data);
/* 103 */     nglBufferDataARB(target, data.remaining(), data, data.position(), usage, function_pointer);
/*     */   }
/*     */   public static void glBufferDataARB(int target, DoubleBuffer data, int usage) {
/* 106 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 107 */     long function_pointer = caps.ARB_buffer_object_glBufferDataARB_pointer;
/* 108 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 109 */     BufferChecks.checkDirect(data);
/* 110 */     nglBufferDataARB(target, (data.remaining() << 3), data, data.position() << 3, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferDataARB(int target, FloatBuffer data, int usage) {
/* 113 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 114 */     long function_pointer = caps.ARB_buffer_object_glBufferDataARB_pointer;
/* 115 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 116 */     BufferChecks.checkDirect(data);
/* 117 */     nglBufferDataARB(target, (data.remaining() << 2), data, data.position() << 2, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferDataARB(int target, IntBuffer data, int usage) {
/* 120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 121 */     long function_pointer = caps.ARB_buffer_object_glBufferDataARB_pointer;
/* 122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 123 */     BufferChecks.checkDirect(data);
/* 124 */     nglBufferDataARB(target, (data.remaining() << 2), data, data.position() << 2, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferDataARB(int target, ShortBuffer data, int usage) {
/* 127 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 128 */     long function_pointer = caps.ARB_buffer_object_glBufferDataARB_pointer;
/* 129 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 130 */     BufferChecks.checkDirect(data);
/* 131 */     nglBufferDataARB(target, (data.remaining() << 1), data, data.position() << 1, usage, function_pointer);
/*     */   }
/*     */   private static native void nglBufferDataARB(int paramInt1, long paramLong1, Buffer paramBuffer, int paramInt2, int paramInt3, long paramLong2);
/*     */   
/*     */   public static void glBufferSubDataARB(int target, long offset, ByteBuffer data) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.ARB_buffer_object_glBufferSubDataARB_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     BufferChecks.checkDirect(data);
/* 140 */     nglBufferSubDataARB(target, offset, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   public static void glBufferSubDataARB(int target, long offset, DoubleBuffer data) {
/* 143 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 144 */     long function_pointer = caps.ARB_buffer_object_glBufferSubDataARB_pointer;
/* 145 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 146 */     BufferChecks.checkDirect(data);
/* 147 */     nglBufferSubDataARB(target, offset, (data.remaining() << 3), data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glBufferSubDataARB(int target, long offset, FloatBuffer data) {
/* 150 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 151 */     long function_pointer = caps.ARB_buffer_object_glBufferSubDataARB_pointer;
/* 152 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 153 */     BufferChecks.checkDirect(data);
/* 154 */     nglBufferSubDataARB(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glBufferSubDataARB(int target, long offset, IntBuffer data) {
/* 157 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 158 */     long function_pointer = caps.ARB_buffer_object_glBufferSubDataARB_pointer;
/* 159 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 160 */     BufferChecks.checkDirect(data);
/* 161 */     nglBufferSubDataARB(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glBufferSubDataARB(int target, long offset, ShortBuffer data) {
/* 164 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 165 */     long function_pointer = caps.ARB_buffer_object_glBufferSubDataARB_pointer;
/* 166 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 167 */     BufferChecks.checkDirect(data);
/* 168 */     nglBufferSubDataARB(target, offset, (data.remaining() << 1), data, data.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglBufferSubDataARB(int paramInt1, long paramLong1, long paramLong2, Buffer paramBuffer, int paramInt2, long paramLong3);
/*     */   
/*     */   public static void glGetBufferSubDataARB(int target, long offset, ByteBuffer data) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.ARB_buffer_object_glGetBufferSubDataARB_pointer;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     BufferChecks.checkDirect(data);
/* 177 */     nglGetBufferSubDataARB(target, offset, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubDataARB(int target, long offset, DoubleBuffer data) {
/* 180 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 181 */     long function_pointer = caps.ARB_buffer_object_glGetBufferSubDataARB_pointer;
/* 182 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 183 */     BufferChecks.checkDirect(data);
/* 184 */     nglGetBufferSubDataARB(target, offset, (data.remaining() << 3), data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubDataARB(int target, long offset, FloatBuffer data) {
/* 187 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 188 */     long function_pointer = caps.ARB_buffer_object_glGetBufferSubDataARB_pointer;
/* 189 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 190 */     BufferChecks.checkDirect(data);
/* 191 */     nglGetBufferSubDataARB(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubDataARB(int target, long offset, IntBuffer data) {
/* 194 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 195 */     long function_pointer = caps.ARB_buffer_object_glGetBufferSubDataARB_pointer;
/* 196 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 197 */     BufferChecks.checkDirect(data);
/* 198 */     nglGetBufferSubDataARB(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubDataARB(int target, long offset, ShortBuffer data) {
/* 201 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 202 */     long function_pointer = caps.ARB_buffer_object_glGetBufferSubDataARB_pointer;
/* 203 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 204 */     BufferChecks.checkDirect(data);
/* 205 */     nglGetBufferSubDataARB(target, offset, (data.remaining() << 1), data, data.position() << 1, function_pointer);
/*     */   }
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
/*     */   private static native void nglGetBufferSubDataARB(int paramInt1, long paramLong1, long paramLong2, Buffer paramBuffer, int paramInt2, long paramLong3);
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
/*     */   public static ByteBuffer glMapBufferARB(int target, int access, ByteBuffer old_buffer) {
/* 231 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 232 */     long function_pointer = caps.ARB_buffer_object_glMapBufferARB_pointer;
/* 233 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 234 */     if (old_buffer != null)
/* 235 */       BufferChecks.checkDirect(old_buffer); 
/* 236 */     ByteBuffer __result = nglMapBufferARB(target, access, GLChecks.getBufferObjectSizeARB(caps, target), old_buffer, function_pointer);
/* 237 */     return __result;
/*     */   }
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
/*     */   public static ByteBuffer glMapBufferARB(int target, int access, long length, ByteBuffer old_buffer) {
/* 261 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 262 */     long function_pointer = caps.ARB_buffer_object_glMapBufferARB_pointer;
/* 263 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 264 */     if (old_buffer != null)
/* 265 */       BufferChecks.checkDirect(old_buffer); 
/* 266 */     ByteBuffer __result = nglMapBufferARB(target, access, length, old_buffer, function_pointer);
/* 267 */     return __result;
/*     */   }
/*     */   private static native ByteBuffer nglMapBufferARB(int paramInt1, int paramInt2, long paramLong1, ByteBuffer paramByteBuffer, long paramLong2);
/*     */   
/*     */   public static boolean glUnmapBufferARB(int target) {
/* 272 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 273 */     long function_pointer = caps.ARB_buffer_object_glUnmapBufferARB_pointer;
/* 274 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 275 */     boolean __result = nglUnmapBufferARB(target, function_pointer);
/* 276 */     return __result;
/*     */   }
/*     */   private static native boolean nglUnmapBufferARB(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetBufferParameterARB(int target, int pname, IntBuffer params) {
/* 281 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 282 */     long function_pointer = caps.ARB_buffer_object_glGetBufferParameterivARB_pointer;
/* 283 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 284 */     BufferChecks.checkBuffer(params, 4);
/* 285 */     nglGetBufferParameterivARB(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetBufferParameterivARB(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetBufferParameterARB(int target, int pname) {
/* 291 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 292 */     long function_pointer = caps.ARB_buffer_object_glGetBufferParameterivARB_pointer;
/* 293 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 294 */     IntBuffer params = APIUtils.getBufferInt();
/* 295 */     nglGetBufferParameterivARB(target, pname, params, params.position(), function_pointer);
/* 296 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static ByteBuffer glGetBufferPointerARB(int target, int pname) {
/* 300 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 301 */     long function_pointer = caps.ARB_buffer_object_glGetBufferPointervARB_pointer;
/* 302 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 303 */     ByteBuffer __result = nglGetBufferPointervARB(target, pname, GLChecks.getBufferObjectSizeARB(caps, target), function_pointer);
/* 304 */     return __result;
/*     */   }
/*     */   
/*     */   private static native ByteBuffer nglGetBufferPointervARB(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBBufferObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */