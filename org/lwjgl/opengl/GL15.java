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
/*     */ public final class GL15
/*     */ {
/*     */   public static final int GL_ARRAY_BUFFER = 34962;
/*     */   public static final int GL_ELEMENT_ARRAY_BUFFER = 34963;
/*     */   public static final int GL_ARRAY_BUFFER_BINDING = 34964;
/*     */   public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;
/*     */   public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = 34966;
/*     */   public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = 34967;
/*     */   public static final int GL_COLOR_ARRAY_BUFFER_BINDING = 34968;
/*     */   public static final int GL_INDEX_ARRAY_BUFFER_BINDING = 34969;
/*     */   public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 34970;
/*     */   public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 34971;
/*     */   public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 34972;
/*     */   public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 34973;
/*     */   public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = 34974;
/*     */   public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;
/*     */   public static final int GL_STREAM_DRAW = 35040;
/*     */   public static final int GL_STREAM_READ = 35041;
/*     */   public static final int GL_STREAM_COPY = 35042;
/*     */   public static final int GL_STATIC_DRAW = 35044;
/*     */   public static final int GL_STATIC_READ = 35045;
/*     */   public static final int GL_STATIC_COPY = 35046;
/*     */   public static final int GL_DYNAMIC_DRAW = 35048;
/*     */   public static final int GL_DYNAMIC_READ = 35049;
/*     */   public static final int GL_DYNAMIC_COPY = 35050;
/*     */   public static final int GL_READ_ONLY = 35000;
/*     */   public static final int GL_WRITE_ONLY = 35001;
/*     */   public static final int GL_READ_WRITE = 35002;
/*     */   public static final int GL_BUFFER_SIZE = 34660;
/*     */   public static final int GL_BUFFER_USAGE = 34661;
/*     */   public static final int GL_BUFFER_ACCESS = 35003;
/*     */   public static final int GL_BUFFER_MAPPED = 35004;
/*     */   public static final int GL_BUFFER_MAP_POINTER = 35005;
/*     */   public static final int FOG_COORD_SRC = 33872;
/*     */   public static final int GL_FOG_COORD = 33873;
/*     */   public static final int GL_CURRENT_FOG_COORD = 33875;
/*     */   public static final int GL_FOG_COORD_ARRAY_TYPE = 33876;
/*     */   public static final int GL_FOG_COORD_ARRAY_STRIDE = 33877;
/*     */   public static final int GL_FOG_COORD_ARRAY_POINTER = 33878;
/*     */   public static final int GL_FOG_COORD_ARRAY = 33879;
/*     */   public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = 34973;
/*     */   public static final int GL_SRC0_RGB = 34176;
/*     */   public static final int GL_SRC1_RGB = 34177;
/*     */   public static final int GL_SRC2_RGB = 34178;
/*     */   public static final int GL_SRC0_ALPHA = 34184;
/*     */   public static final int GL_SRC1_ALPHA = 34185;
/*     */   public static final int GL_SRC2_ALPHA = 34186;
/*     */   public static final int GL_SAMPLES_PASSED = 35092;
/*     */   public static final int GL_QUERY_COUNTER_BITS = 34916;
/*     */   public static final int GL_CURRENT_QUERY = 34917;
/*     */   public static final int GL_QUERY_RESULT = 34918;
/*     */   public static final int GL_QUERY_RESULT_AVAILABLE = 34919;
/*     */   
/*     */   public static void glBindBuffer(int target, int buffer) {
/*  77 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  78 */     long function_pointer = caps.GL15_glBindBuffer_pointer;
/*  79 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  80 */     StateTracker.bindBuffer(caps, target, buffer);
/*  81 */     nglBindBuffer(target, buffer, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffers(IntBuffer buffers) {
/*  86 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  87 */     long function_pointer = caps.GL15_glDeleteBuffers_pointer;
/*  88 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  89 */     BufferChecks.checkDirect(buffers);
/*  90 */     nglDeleteBuffers(buffers.remaining(), buffers, buffers.position(), function_pointer);
/*     */   }
/*     */   private static native void nglBindBuffer(int paramInt1, int paramInt2, long paramLong);
/*     */   private static native void nglDeleteBuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteBuffers(int buffer) {
/*  96 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  97 */     long function_pointer = caps.GL15_glDeleteBuffers_pointer;
/*  98 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  99 */     nglDeleteBuffers(1, APIUtils.getBufferInt().put(0, buffer), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenBuffers(IntBuffer buffers) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.GL15_glGenBuffers_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     BufferChecks.checkDirect(buffers);
/* 107 */     nglGenBuffers(buffers.remaining(), buffers, buffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenBuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenBuffers() {
/* 113 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 114 */     long function_pointer = caps.GL15_glGenBuffers_pointer;
/* 115 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 116 */     IntBuffer buffers = APIUtils.getBufferInt();
/* 117 */     nglGenBuffers(1, buffers, buffers.position(), function_pointer);
/* 118 */     return buffers.get(0);
/*     */   }
/*     */   
/*     */   public static boolean glIsBuffer(int buffer) {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.GL15_glIsBuffer_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     boolean __result = nglIsBuffer(buffer, function_pointer);
/* 126 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsBuffer(int paramInt, long paramLong);
/*     */   
/*     */   public static void glBufferData(int target, long size, int usage) {
/* 131 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 132 */     long function_pointer = caps.GL15_glBufferData_pointer;
/* 133 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 134 */     nglBufferData(target, size, null, 0, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferData(int target, ByteBuffer data, int usage) {
/* 137 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 138 */     long function_pointer = caps.GL15_glBufferData_pointer;
/* 139 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 140 */     BufferChecks.checkDirect(data);
/* 141 */     nglBufferData(target, data.remaining(), data, data.position(), usage, function_pointer);
/*     */   }
/*     */   public static void glBufferData(int target, DoubleBuffer data, int usage) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.GL15_glBufferData_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     BufferChecks.checkDirect(data);
/* 148 */     nglBufferData(target, (data.remaining() << 3), data, data.position() << 3, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferData(int target, FloatBuffer data, int usage) {
/* 151 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 152 */     long function_pointer = caps.GL15_glBufferData_pointer;
/* 153 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 154 */     BufferChecks.checkDirect(data);
/* 155 */     nglBufferData(target, (data.remaining() << 2), data, data.position() << 2, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferData(int target, IntBuffer data, int usage) {
/* 158 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 159 */     long function_pointer = caps.GL15_glBufferData_pointer;
/* 160 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 161 */     BufferChecks.checkDirect(data);
/* 162 */     nglBufferData(target, (data.remaining() << 2), data, data.position() << 2, usage, function_pointer);
/*     */   }
/*     */   public static void glBufferData(int target, ShortBuffer data, int usage) {
/* 165 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 166 */     long function_pointer = caps.GL15_glBufferData_pointer;
/* 167 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 168 */     BufferChecks.checkDirect(data);
/* 169 */     nglBufferData(target, (data.remaining() << 1), data, data.position() << 1, usage, function_pointer);
/*     */   }
/*     */   private static native void nglBufferData(int paramInt1, long paramLong1, Buffer paramBuffer, int paramInt2, int paramInt3, long paramLong2);
/*     */   
/*     */   public static void glBufferSubData(int target, long offset, ByteBuffer data) {
/* 174 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 175 */     long function_pointer = caps.GL15_glBufferSubData_pointer;
/* 176 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 177 */     BufferChecks.checkDirect(data);
/* 178 */     nglBufferSubData(target, offset, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   public static void glBufferSubData(int target, long offset, DoubleBuffer data) {
/* 181 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 182 */     long function_pointer = caps.GL15_glBufferSubData_pointer;
/* 183 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 184 */     BufferChecks.checkDirect(data);
/* 185 */     nglBufferSubData(target, offset, (data.remaining() << 3), data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glBufferSubData(int target, long offset, FloatBuffer data) {
/* 188 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 189 */     long function_pointer = caps.GL15_glBufferSubData_pointer;
/* 190 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 191 */     BufferChecks.checkDirect(data);
/* 192 */     nglBufferSubData(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glBufferSubData(int target, long offset, IntBuffer data) {
/* 195 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 196 */     long function_pointer = caps.GL15_glBufferSubData_pointer;
/* 197 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 198 */     BufferChecks.checkDirect(data);
/* 199 */     nglBufferSubData(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glBufferSubData(int target, long offset, ShortBuffer data) {
/* 202 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 203 */     long function_pointer = caps.GL15_glBufferSubData_pointer;
/* 204 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 205 */     BufferChecks.checkDirect(data);
/* 206 */     nglBufferSubData(target, offset, (data.remaining() << 1), data, data.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglBufferSubData(int paramInt1, long paramLong1, long paramLong2, Buffer paramBuffer, int paramInt2, long paramLong3);
/*     */   
/*     */   public static void glGetBufferSubData(int target, long offset, ByteBuffer data) {
/* 211 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 212 */     long function_pointer = caps.GL15_glGetBufferSubData_pointer;
/* 213 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 214 */     BufferChecks.checkDirect(data);
/* 215 */     nglGetBufferSubData(target, offset, data.remaining(), data, data.position(), function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
/* 218 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 219 */     long function_pointer = caps.GL15_glGetBufferSubData_pointer;
/* 220 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 221 */     BufferChecks.checkDirect(data);
/* 222 */     nglGetBufferSubData(target, offset, (data.remaining() << 3), data, data.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubData(int target, long offset, FloatBuffer data) {
/* 225 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 226 */     long function_pointer = caps.GL15_glGetBufferSubData_pointer;
/* 227 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 228 */     BufferChecks.checkDirect(data);
/* 229 */     nglGetBufferSubData(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubData(int target, long offset, IntBuffer data) {
/* 232 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 233 */     long function_pointer = caps.GL15_glGetBufferSubData_pointer;
/* 234 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 235 */     BufferChecks.checkDirect(data);
/* 236 */     nglGetBufferSubData(target, offset, (data.remaining() << 2), data, data.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glGetBufferSubData(int target, long offset, ShortBuffer data) {
/* 239 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 240 */     long function_pointer = caps.GL15_glGetBufferSubData_pointer;
/* 241 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 242 */     BufferChecks.checkDirect(data);
/* 243 */     nglGetBufferSubData(target, offset, (data.remaining() << 1), data, data.position() << 1, function_pointer);
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
/*     */   private static native void nglGetBufferSubData(int paramInt1, long paramLong1, long paramLong2, Buffer paramBuffer, int paramInt2, long paramLong3);
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
/*     */   public static ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
/* 268 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 269 */     long function_pointer = caps.GL15_glMapBuffer_pointer;
/* 270 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 271 */     if (old_buffer != null)
/* 272 */       BufferChecks.checkDirect(old_buffer); 
/* 273 */     ByteBuffer __result = nglMapBuffer(target, access, GLChecks.getBufferObjectSize(caps, target), old_buffer, function_pointer);
/* 274 */     return __result;
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
/*     */   public static ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
/* 297 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 298 */     long function_pointer = caps.GL15_glMapBuffer_pointer;
/* 299 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 300 */     if (old_buffer != null)
/* 301 */       BufferChecks.checkDirect(old_buffer); 
/* 302 */     ByteBuffer __result = nglMapBuffer(target, access, length, old_buffer, function_pointer);
/* 303 */     return __result;
/*     */   }
/*     */   private static native ByteBuffer nglMapBuffer(int paramInt1, int paramInt2, long paramLong1, ByteBuffer paramByteBuffer, long paramLong2);
/*     */   
/*     */   public static boolean glUnmapBuffer(int target) {
/* 308 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 309 */     long function_pointer = caps.GL15_glUnmapBuffer_pointer;
/* 310 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 311 */     boolean __result = nglUnmapBuffer(target, function_pointer);
/* 312 */     return __result;
/*     */   }
/*     */   private static native boolean nglUnmapBuffer(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetBufferParameter(int target, int pname, IntBuffer params) {
/* 317 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 318 */     long function_pointer = caps.GL15_glGetBufferParameteriv_pointer;
/* 319 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 320 */     BufferChecks.checkBuffer(params, 4);
/* 321 */     nglGetBufferParameteriv(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetBufferParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetBufferParameter(int target, int pname) {
/* 327 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 328 */     long function_pointer = caps.GL15_glGetBufferParameteriv_pointer;
/* 329 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 330 */     IntBuffer params = APIUtils.getBufferInt();
/* 331 */     nglGetBufferParameteriv(target, pname, params, params.position(), function_pointer);
/* 332 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static ByteBuffer glGetBufferPointer(int target, int pname) {
/* 336 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 337 */     long function_pointer = caps.GL15_glGetBufferPointerv_pointer;
/* 338 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 339 */     ByteBuffer __result = nglGetBufferPointerv(target, pname, GLChecks.getBufferObjectSize(caps, target), function_pointer);
/* 340 */     return __result;
/*     */   }
/*     */   private static native ByteBuffer nglGetBufferPointerv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glGenQueries(IntBuffer ids) {
/* 345 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 346 */     long function_pointer = caps.GL15_glGenQueries_pointer;
/* 347 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 348 */     BufferChecks.checkDirect(ids);
/* 349 */     nglGenQueries(ids.remaining(), ids, ids.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenQueries(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenQueries() {
/* 355 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 356 */     long function_pointer = caps.GL15_glGenQueries_pointer;
/* 357 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 358 */     IntBuffer ids = APIUtils.getBufferInt();
/* 359 */     nglGenQueries(1, ids, ids.position(), function_pointer);
/* 360 */     return ids.get(0);
/*     */   }
/*     */   
/*     */   public static void glDeleteQueries(IntBuffer ids) {
/* 364 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 365 */     long function_pointer = caps.GL15_glDeleteQueries_pointer;
/* 366 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 367 */     BufferChecks.checkDirect(ids);
/* 368 */     nglDeleteQueries(ids.remaining(), ids, ids.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteQueries(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteQueries(int id) {
/* 374 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 375 */     long function_pointer = caps.GL15_glDeleteQueries_pointer;
/* 376 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 377 */     nglDeleteQueries(1, APIUtils.getBufferInt().put(0, id), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static boolean glIsQuery(int id) {
/* 381 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 382 */     long function_pointer = caps.GL15_glIsQuery_pointer;
/* 383 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 384 */     boolean __result = nglIsQuery(id, function_pointer);
/* 385 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsQuery(int paramInt, long paramLong);
/*     */   
/*     */   public static void glBeginQuery(int target, int id) {
/* 390 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 391 */     long function_pointer = caps.GL15_glBeginQuery_pointer;
/* 392 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 393 */     nglBeginQuery(target, id, function_pointer);
/*     */   }
/*     */   private static native void nglBeginQuery(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glEndQuery(int target) {
/* 398 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 399 */     long function_pointer = caps.GL15_glEndQuery_pointer;
/* 400 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 401 */     nglEndQuery(target, function_pointer);
/*     */   }
/*     */   private static native void nglEndQuery(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetQuery(int target, int pname, IntBuffer params) {
/* 406 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 407 */     long function_pointer = caps.GL15_glGetQueryiv_pointer;
/* 408 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 409 */     BufferChecks.checkBuffer(params, 1);
/* 410 */     nglGetQueryiv(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetQuery(int target, int pname) {
/* 416 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 417 */     long function_pointer = caps.GL15_glGetQueryiv_pointer;
/* 418 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 419 */     IntBuffer params = APIUtils.getBufferInt();
/* 420 */     nglGetQueryiv(target, pname, params, params.position(), function_pointer);
/* 421 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetQueryObject(int id, int pname, IntBuffer params) {
/* 425 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 426 */     long function_pointer = caps.GL15_glGetQueryObjectiv_pointer;
/* 427 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 428 */     BufferChecks.checkBuffer(params, 1);
/* 429 */     nglGetQueryObjectiv(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryObjectiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetQueryObjecti(int id, int pname) {
/* 435 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 436 */     long function_pointer = caps.GL15_glGetQueryObjectiv_pointer;
/* 437 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 438 */     IntBuffer params = APIUtils.getBufferInt();
/* 439 */     nglGetQueryObjectiv(id, pname, params, params.position(), function_pointer);
/* 440 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetQueryObjectu(int id, int pname, IntBuffer params) {
/* 444 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 445 */     long function_pointer = caps.GL15_glGetQueryObjectuiv_pointer;
/* 446 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 447 */     BufferChecks.checkBuffer(params, 1);
/* 448 */     nglGetQueryObjectuiv(id, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetQueryObjectuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetQueryObjectui(int id, int pname) {
/* 454 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 455 */     long function_pointer = caps.GL15_glGetQueryObjectuiv_pointer;
/* 456 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 457 */     IntBuffer params = APIUtils.getBufferInt();
/* 458 */     nglGetQueryObjectuiv(id, pname, params, params.position(), function_pointer);
/* 459 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL15.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */