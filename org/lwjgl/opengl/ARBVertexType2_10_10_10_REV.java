/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.IntBuffer;
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
/*     */ public final class ARBVertexType2_10_10_10_REV
/*     */ {
/*     */   public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 33640;
/*     */   public static final int GL_INT_2_10_10_10_REV = 36255;
/*     */   
/*     */   private static native void nglVertexP2ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP2ui(int type, int value) {
/*  24 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  25 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexP2ui_pointer;
/*  26 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  27 */     nglVertexP2ui(type, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP3ui(int type, int value) {
/*  32 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  33 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexP3ui_pointer;
/*  34 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  35 */     nglVertexP3ui(type, value, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glVertexP4ui(int type, int value) {
/*  40 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  41 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexP4ui_pointer;
/*  42 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  43 */     nglVertexP4ui(type, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexP4ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP2u(int type, IntBuffer value) {
/*  48 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  49 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexP2uiv_pointer;
/*  50 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  51 */     BufferChecks.checkBuffer(value, 2);
/*  52 */     nglVertexP2uiv(type, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexP2uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP3u(int type, IntBuffer value) {
/*  57 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  58 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexP3uiv_pointer;
/*  59 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  60 */     BufferChecks.checkBuffer(value, 3);
/*  61 */     nglVertexP3uiv(type, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexP4u(int type, IntBuffer value) {
/*  66 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  67 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexP4uiv_pointer;
/*  68 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  69 */     BufferChecks.checkBuffer(value, 4);
/*  70 */     nglVertexP4uiv(type, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexP4uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP1ui(int type, int coords) {
/*  75 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  76 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP1ui_pointer;
/*  77 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  78 */     nglTexCoordP1ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP1ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP2ui(int type, int coords) {
/*  83 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  84 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP2ui_pointer;
/*  85 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  86 */     nglTexCoordP2ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP2ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP3ui(int type, int coords) {
/*  91 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  92 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP3ui_pointer;
/*  93 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  94 */     nglTexCoordP3ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP4ui(int type, int coords) {
/*  99 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 100 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP4ui_pointer;
/* 101 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 102 */     nglTexCoordP4ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP4ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP1u(int type, IntBuffer coords) {
/* 107 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 108 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP1uiv_pointer;
/* 109 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 110 */     BufferChecks.checkBuffer(coords, 1);
/* 111 */     nglTexCoordP1uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP1uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP2u(int type, IntBuffer coords) {
/* 116 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 117 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP2uiv_pointer;
/* 118 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 119 */     BufferChecks.checkBuffer(coords, 2);
/* 120 */     nglTexCoordP2uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP2uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP3u(int type, IntBuffer coords) {
/* 125 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 126 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP3uiv_pointer;
/* 127 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 128 */     BufferChecks.checkBuffer(coords, 3);
/* 129 */     nglTexCoordP3uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glTexCoordP4u(int type, IntBuffer coords) {
/* 134 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 135 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glTexCoordP4uiv_pointer;
/* 136 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 137 */     BufferChecks.checkBuffer(coords, 4);
/* 138 */     nglTexCoordP4uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglTexCoordP4uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
/* 143 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 144 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP1ui_pointer;
/* 145 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 146 */     nglMultiTexCoordP1ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP1ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
/* 151 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 152 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP2ui_pointer;
/* 153 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 154 */     nglMultiTexCoordP2ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP2ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
/* 159 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 160 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP3ui_pointer;
/* 161 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 162 */     nglMultiTexCoordP3ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP3ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
/* 167 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 168 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP4ui_pointer;
/* 169 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 170 */     nglMultiTexCoordP4ui(texture, type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP4ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP1u(int texture, int type, IntBuffer coords) {
/* 175 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 176 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP1uiv_pointer;
/* 177 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 178 */     BufferChecks.checkBuffer(coords, 1);
/* 179 */     nglMultiTexCoordP1uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP1uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP2u(int texture, int type, IntBuffer coords) {
/* 184 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 185 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP2uiv_pointer;
/* 186 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 187 */     BufferChecks.checkBuffer(coords, 2);
/* 188 */     nglMultiTexCoordP2uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP2uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP3u(int texture, int type, IntBuffer coords) {
/* 193 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 194 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP3uiv_pointer;
/* 195 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 196 */     BufferChecks.checkBuffer(coords, 3);
/* 197 */     nglMultiTexCoordP3uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP3uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoordP4u(int texture, int type, IntBuffer coords) {
/* 202 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 203 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP4uiv_pointer;
/* 204 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 205 */     BufferChecks.checkBuffer(coords, 4);
/* 206 */     nglMultiTexCoordP4uiv(texture, type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoordP4uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glNormalP3ui(int type, int coords) {
/* 211 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 212 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glNormalP3ui_pointer;
/* 213 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 214 */     nglNormalP3ui(type, coords, function_pointer);
/*     */   }
/*     */   private static native void nglNormalP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glNormalP3u(int type, IntBuffer coords) {
/* 219 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 220 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glNormalP3uiv_pointer;
/* 221 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 222 */     BufferChecks.checkBuffer(coords, 3);
/* 223 */     nglNormalP3uiv(type, coords, coords.position(), function_pointer);
/*     */   }
/*     */   private static native void nglNormalP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP3ui(int type, int color) {
/* 228 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 229 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glColorP3ui_pointer;
/* 230 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 231 */     nglColorP3ui(type, color, function_pointer);
/*     */   }
/*     */   private static native void nglColorP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP4ui(int type, int color) {
/* 236 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 237 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glColorP4ui_pointer;
/* 238 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 239 */     nglColorP4ui(type, color, function_pointer);
/*     */   }
/*     */   private static native void nglColorP4ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP3u(int type, IntBuffer color) {
/* 244 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 245 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glColorP3uiv_pointer;
/* 246 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 247 */     BufferChecks.checkBuffer(color, 3);
/* 248 */     nglColorP3uiv(type, color, color.position(), function_pointer);
/*     */   }
/*     */   private static native void nglColorP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glColorP4u(int type, IntBuffer color) {
/* 253 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 254 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glColorP4uiv_pointer;
/* 255 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 256 */     BufferChecks.checkBuffer(color, 4);
/* 257 */     nglColorP4uiv(type, color, color.position(), function_pointer);
/*     */   }
/*     */   private static native void nglColorP4uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glSecondaryColorP3ui(int type, int color) {
/* 262 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 263 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glSecondaryColorP3ui_pointer;
/* 264 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 265 */     nglSecondaryColorP3ui(type, color, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColorP3ui(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glSecondaryColorP3u(int type, IntBuffer color) {
/* 270 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 271 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glSecondaryColorP3uiv_pointer;
/* 272 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 273 */     BufferChecks.checkBuffer(color, 3);
/* 274 */     nglSecondaryColorP3uiv(type, color, color.position(), function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColorP3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
/* 279 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 280 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP1ui_pointer;
/* 281 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 282 */     nglVertexAttribP1ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP1ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
/* 287 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 288 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP2ui_pointer;
/* 289 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 290 */     nglVertexAttribP2ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP2ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
/* 295 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 296 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP3ui_pointer;
/* 297 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 298 */     nglVertexAttribP3ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP3ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
/* 303 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 304 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP4ui_pointer;
/* 305 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 306 */     nglVertexAttribP4ui(index, type, normalized, value, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP4ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP1u(int index, int type, boolean normalized, IntBuffer value) {
/* 311 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 312 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP1uiv_pointer;
/* 313 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 314 */     BufferChecks.checkBuffer(value, 1);
/* 315 */     nglVertexAttribP1uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP1uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP2u(int index, int type, boolean normalized, IntBuffer value) {
/* 320 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 321 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP2uiv_pointer;
/* 322 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 323 */     BufferChecks.checkBuffer(value, 2);
/* 324 */     nglVertexAttribP2uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP2uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP3u(int index, int type, boolean normalized, IntBuffer value) {
/* 329 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 330 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP3uiv_pointer;
/* 331 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 332 */     BufferChecks.checkBuffer(value, 3);
/* 333 */     nglVertexAttribP3uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribP3uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribP4u(int index, int type, boolean normalized, IntBuffer value) {
/* 338 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 339 */     long function_pointer = caps.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP4uiv_pointer;
/* 340 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 341 */     BufferChecks.checkBuffer(value, 4);
/* 342 */     nglVertexAttribP4uiv(index, type, normalized, value, value.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexAttribP4uiv(int paramInt1, int paramInt2, boolean paramBoolean, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBVertexType2_10_10_10_REV.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */