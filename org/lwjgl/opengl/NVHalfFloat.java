/*     */ package org.lwjgl.opengl;
/*     */ 
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
/*     */ public final class NVHalfFloat
/*     */ {
/*     */   public static final int GL_HALF_FLOAT_NV = 5131;
/*     */   
/*     */   private static native void nglVertex2hNV(short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glVertex2hNV(short x, short y) {
/*  24 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  25 */     long function_pointer = caps.NV_half_float_glVertex2hNV_pointer;
/*  26 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  27 */     nglVertex2hNV(x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertex3hNV(short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glVertex3hNV(short x, short y, short z) {
/*  32 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  33 */     long function_pointer = caps.NV_half_float_glVertex3hNV_pointer;
/*  34 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  35 */     nglVertex3hNV(x, y, z, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glVertex4hNV(short x, short y, short z, short w) {
/*  40 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  41 */     long function_pointer = caps.NV_half_float_glVertex4hNV_pointer;
/*  42 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  43 */     nglVertex4hNV(x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertex4hNV(short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glNormal3hNV(short nx, short ny, short nz) {
/*  48 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  49 */     long function_pointer = caps.NV_half_float_glNormal3hNV_pointer;
/*  50 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  51 */     nglNormal3hNV(nx, ny, nz, function_pointer);
/*     */   }
/*     */   private static native void nglNormal3hNV(short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glColor3hNV(short red, short green, short blue) {
/*  56 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  57 */     long function_pointer = caps.NV_half_float_glColor3hNV_pointer;
/*  58 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  59 */     nglColor3hNV(red, green, blue, function_pointer);
/*     */   }
/*     */   private static native void nglColor3hNV(short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glColor4hNV(short red, short green, short blue, short alpha) {
/*  64 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  65 */     long function_pointer = caps.NV_half_float_glColor4hNV_pointer;
/*  66 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  67 */     nglColor4hNV(red, green, blue, alpha, function_pointer);
/*     */   }
/*     */   private static native void nglColor4hNV(short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glTexCoord1hNV(short s) {
/*  72 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  73 */     long function_pointer = caps.NV_half_float_glTexCoord1hNV_pointer;
/*  74 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  75 */     nglTexCoord1hNV(s, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoord1hNV(short paramShort, long paramLong);
/*     */   
/*     */   public static void glTexCoord2hNV(short s, short t) {
/*  80 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  81 */     long function_pointer = caps.NV_half_float_glTexCoord2hNV_pointer;
/*  82 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  83 */     nglTexCoord2hNV(s, t, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoord2hNV(short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glTexCoord3hNV(short s, short t, short r) {
/*  88 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  89 */     long function_pointer = caps.NV_half_float_glTexCoord3hNV_pointer;
/*  90 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  91 */     nglTexCoord3hNV(s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoord3hNV(short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glTexCoord4hNV(short s, short t, short r, short q) {
/*  96 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  97 */     long function_pointer = caps.NV_half_float_glTexCoord4hNV_pointer;
/*  98 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  99 */     nglTexCoord4hNV(s, t, r, q, function_pointer);
/*     */   }
/*     */   private static native void nglTexCoord4hNV(short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord1hNV(int target, short s) {
/* 104 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 105 */     long function_pointer = caps.NV_half_float_glMultiTexCoord1hNV_pointer;
/* 106 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 107 */     nglMultiTexCoord1hNV(target, s, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord1hNV(int paramInt, short paramShort, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord2hNV(int target, short s, short t) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.NV_half_float_glMultiTexCoord2hNV_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     nglMultiTexCoord2hNV(target, s, t, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord2hNV(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord3hNV(int target, short s, short t, short r) {
/* 120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 121 */     long function_pointer = caps.NV_half_float_glMultiTexCoord3hNV_pointer;
/* 122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 123 */     nglMultiTexCoord3hNV(target, s, t, r, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord3hNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glMultiTexCoord4hNV(int target, short s, short t, short r, short q) {
/* 128 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 129 */     long function_pointer = caps.NV_half_float_glMultiTexCoord4hNV_pointer;
/* 130 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 131 */     nglMultiTexCoord4hNV(target, s, t, r, q, function_pointer);
/*     */   }
/*     */   private static native void nglMultiTexCoord4hNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glFogCoordhNV(short fog) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.NV_half_float_glFogCoordhNV_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     nglFogCoordhNV(fog, function_pointer);
/*     */   }
/*     */   private static native void nglFogCoordhNV(short paramShort, long paramLong);
/*     */   
/*     */   public static void glSecondaryColor3hNV(short red, short green, short blue) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.NV_half_float_glSecondaryColor3hNV_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     nglSecondaryColor3hNV(red, green, blue, function_pointer);
/*     */   }
/*     */   private static native void nglSecondaryColor3hNV(short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glVertexWeighthNV(short weight) {
/* 152 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 153 */     long function_pointer = caps.NV_half_float_glVertexWeighthNV_pointer;
/* 154 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 155 */     nglVertexWeighthNV(weight, function_pointer);
/*     */   }
/*     */   private static native void nglVertexWeighthNV(short paramShort, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib1hNV(int index, short x) {
/* 160 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 161 */     long function_pointer = caps.NV_half_float_glVertexAttrib1hNV_pointer;
/* 162 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 163 */     nglVertexAttrib1hNV(index, x, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib1hNV(int paramInt, short paramShort, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib2hNV(int index, short x, short y) {
/* 168 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 169 */     long function_pointer = caps.NV_half_float_glVertexAttrib2hNV_pointer;
/* 170 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 171 */     nglVertexAttrib2hNV(index, x, y, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib2hNV(int paramInt, short paramShort1, short paramShort2, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib3hNV(int index, short x, short y, short z) {
/* 176 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 177 */     long function_pointer = caps.NV_half_float_glVertexAttrib3hNV_pointer;
/* 178 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 179 */     nglVertexAttrib3hNV(index, x, y, z, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib3hNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
/*     */   
/*     */   public static void glVertexAttrib4hNV(int index, short x, short y, short z, short w) {
/* 184 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 185 */     long function_pointer = caps.NV_half_float_glVertexAttrib4hNV_pointer;
/* 186 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 187 */     nglVertexAttrib4hNV(index, x, y, z, w, function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttrib4hNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs1NV(int index, ShortBuffer attribs) {
/* 192 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 193 */     long function_pointer = caps.NV_half_float_glVertexAttribs1hvNV_pointer;
/* 194 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 195 */     BufferChecks.checkDirect(attribs);
/* 196 */     nglVertexAttribs1hvNV(index, attribs.remaining(), attribs, attribs.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs1hvNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs2NV(int index, ShortBuffer attribs) {
/* 201 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 202 */     long function_pointer = caps.NV_half_float_glVertexAttribs2hvNV_pointer;
/* 203 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 204 */     BufferChecks.checkDirect(attribs);
/* 205 */     nglVertexAttribs2hvNV(index, attribs.remaining() >> 1, attribs, attribs.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs2hvNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs3NV(int index, ShortBuffer attribs) {
/* 210 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 211 */     long function_pointer = caps.NV_half_float_glVertexAttribs3hvNV_pointer;
/* 212 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 213 */     BufferChecks.checkDirect(attribs);
/* 214 */     nglVertexAttribs3hvNV(index, attribs.remaining() / 3, attribs, attribs.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVertexAttribs3hvNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVertexAttribs4NV(int index, ShortBuffer attribs) {
/* 219 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 220 */     long function_pointer = caps.NV_half_float_glVertexAttribs4hvNV_pointer;
/* 221 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 222 */     BufferChecks.checkDirect(attribs);
/* 223 */     nglVertexAttribs4hvNV(index, attribs.remaining() >> 2, attribs, attribs.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglVertexAttribs4hvNV(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVHalfFloat.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */