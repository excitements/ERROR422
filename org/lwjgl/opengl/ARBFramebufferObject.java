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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ARBFramebufferObject
/*     */ {
/*     */   public static final int GL_FRAMEBUFFER = 36160;
/*     */   public static final int GL_READ_FRAMEBUFFER = 36008;
/*     */   public static final int GL_DRAW_FRAMEBUFFER = 36009;
/*     */   public static final int GL_RENDERBUFFER = 36161;
/*     */   public static final int GL_STENCIL_INDEX1 = 36166;
/*     */   public static final int GL_STENCIL_INDEX4 = 36167;
/*     */   public static final int GL_STENCIL_INDEX8 = 36168;
/*     */   public static final int GL_STENCIL_INDEX16 = 36169;
/*     */   public static final int GL_RENDERBUFFER_WIDTH = 36162;
/*     */   public static final int GL_RENDERBUFFER_HEIGHT = 36163;
/*     */   public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;
/*     */   public static final int GL_RENDERBUFFER_RED_SIZE = 36176;
/*     */   public static final int GL_RENDERBUFFER_GREEN_SIZE = 36177;
/*     */   public static final int GL_RENDERBUFFER_BLUE_SIZE = 36178;
/*     */   public static final int GL_RENDERBUFFER_ALPHA_SIZE = 36179;
/*     */   public static final int GL_RENDERBUFFER_DEPTH_SIZE = 36180;
/*     */   public static final int GL_RENDERBUFFER_STENCIL_SIZE = 36181;
/*     */   public static final int GL_RENDERBUFFER_SAMPLES = 36011;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 33296;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 33297;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 33298;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 33299;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 33300;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 33301;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 33302;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 33303;
/*     */   public static final int GL_SRGB = 35904;
/*     */   public static final int GL_UNSIGNED_NORMALIZED = 35863;
/*     */   public static final int GL_FRAMEBUFFER_DEFAULT = 33304;
/*     */   public static final int GL_INDEX = 33314;
/*     */   public static final int GL_COLOR_ATTACHMENT0 = 36064;
/*     */   public static final int GL_COLOR_ATTACHMENT1 = 36065;
/*     */   public static final int GL_COLOR_ATTACHMENT2 = 36066;
/*     */   public static final int GL_COLOR_ATTACHMENT3 = 36067;
/*     */   public static final int GL_COLOR_ATTACHMENT4 = 36068;
/*     */   public static final int GL_COLOR_ATTACHMENT5 = 36069;
/*     */   public static final int GL_COLOR_ATTACHMENT6 = 36070;
/*     */   public static final int GL_COLOR_ATTACHMENT7 = 36071;
/*     */   public static final int GL_COLOR_ATTACHMENT8 = 36072;
/*     */   public static final int GL_COLOR_ATTACHMENT9 = 36073;
/*     */   public static final int GL_COLOR_ATTACHMENT10 = 36074;
/*     */   public static final int GL_COLOR_ATTACHMENT11 = 36075;
/*     */   public static final int GL_COLOR_ATTACHMENT12 = 36076;
/*     */   public static final int GL_COLOR_ATTACHMENT13 = 36077;
/*     */   public static final int GL_COLOR_ATTACHMENT14 = 36078;
/*     */   public static final int GL_COLOR_ATTACHMENT15 = 36079;
/*     */   public static final int GL_DEPTH_ATTACHMENT = 36096;
/*     */   public static final int GL_STENCIL_ATTACHMENT = 36128;
/*     */   public static final int GL_DEPTH_STENCIL_ATTACHMENT = 33306;
/*     */   public static final int GL_MAX_SAMPLES = 36183;
/*     */   public static final int GL_FRAMEBUFFER_COMPLETE = 36053;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
/*     */   public static final int GL_FRAMEBUFFER_UNSUPPORTED = 36061;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 36182;
/*     */   public static final int GL_FRAMEBUFFER_UNDEFINED = 33305;
/*     */   public static final int GL_FRAMEBUFFER_BINDING = 36006;
/*     */   public static final int GL_DRAW_FRAMEBUFFER_BINDING = 36006;
/*     */   public static final int GL_READ_FRAMEBUFFER_BINDING = 36010;
/*     */   public static final int GL_RENDERBUFFER_BINDING = 36007;
/*     */   public static final int GL_MAX_COLOR_ATTACHMENTS = 36063;
/*     */   public static final int GL_MAX_RENDERBUFFER_SIZE = 34024;
/*     */   public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 1286;
/*     */   public static final int GL_DEPTH_STENCIL = 34041;
/*     */   public static final int GL_UNSIGNED_INT_24_8 = 34042;
/*     */   public static final int GL_DEPTH24_STENCIL8 = 35056;
/*     */   public static final int GL_TEXTURE_STENCIL_SIZE = 35057;
/*     */   
/*     */   private static native boolean nglIsRenderbuffer(int paramInt, long paramLong);
/*     */   
/*     */   public static boolean glIsRenderbuffer(int renderbuffer) {
/* 157 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 158 */     long function_pointer = caps.ARB_framebuffer_object_glIsRenderbuffer_pointer;
/* 159 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 160 */     boolean __result = nglIsRenderbuffer(renderbuffer, function_pointer);
/* 161 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBindRenderbuffer(int target, int renderbuffer) {
/* 166 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 167 */     long function_pointer = caps.ARB_framebuffer_object_glBindRenderbuffer_pointer;
/* 168 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 169 */     nglBindRenderbuffer(target, renderbuffer, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDeleteRenderbuffers(IntBuffer renderbuffers) {
/* 174 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 175 */     long function_pointer = caps.ARB_framebuffer_object_glDeleteRenderbuffers_pointer;
/* 176 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 177 */     BufferChecks.checkDirect(renderbuffers);
/* 178 */     nglDeleteRenderbuffers(renderbuffers.remaining(), renderbuffers, renderbuffers.position(), function_pointer);
/*     */   }
/*     */   private static native void nglBindRenderbuffer(int paramInt1, int paramInt2, long paramLong);
/*     */   private static native void nglDeleteRenderbuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteRenderbuffers(int renderbuffer) {
/* 184 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 185 */     long function_pointer = caps.ARB_framebuffer_object_glDeleteRenderbuffers_pointer;
/* 186 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 187 */     nglDeleteRenderbuffers(1, APIUtils.getBufferInt().put(0, renderbuffer), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenRenderbuffers(IntBuffer renderbuffers) {
/* 191 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 192 */     long function_pointer = caps.ARB_framebuffer_object_glGenRenderbuffers_pointer;
/* 193 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 194 */     BufferChecks.checkDirect(renderbuffers);
/* 195 */     nglGenRenderbuffers(renderbuffers.remaining(), renderbuffers, renderbuffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenRenderbuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenRenderbuffers() {
/* 201 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 202 */     long function_pointer = caps.ARB_framebuffer_object_glGenRenderbuffers_pointer;
/* 203 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 204 */     IntBuffer renderbuffers = APIUtils.getBufferInt();
/* 205 */     nglGenRenderbuffers(1, renderbuffers, renderbuffers.position(), function_pointer);
/* 206 */     return renderbuffers.get(0);
/*     */   }
/*     */   
/*     */   public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
/* 210 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 211 */     long function_pointer = caps.ARB_framebuffer_object_glRenderbufferStorage_pointer;
/* 212 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 213 */     nglRenderbufferStorage(target, internalformat, width, height, function_pointer);
/*     */   }
/*     */   private static native void nglRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
/* 218 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 219 */     long function_pointer = caps.ARB_framebuffer_object_glRenderbufferStorageMultisample_pointer;
/* 220 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 221 */     nglRenderbufferStorageMultisample(target, samples, internalformat, width, height, function_pointer);
/*     */   }
/*     */   private static native void nglRenderbufferStorageMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glGetRenderbufferParameter(int target, int pname, IntBuffer params) {
/* 226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 227 */     long function_pointer = caps.ARB_framebuffer_object_glGetRenderbufferParameteriv_pointer;
/* 228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 229 */     BufferChecks.checkBuffer(params, 4);
/* 230 */     nglGetRenderbufferParameteriv(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetRenderbufferParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetRenderbufferParameter(int target, int pname) {
/* 236 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 237 */     long function_pointer = caps.ARB_framebuffer_object_glGetRenderbufferParameteriv_pointer;
/* 238 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 239 */     IntBuffer params = APIUtils.getBufferInt();
/* 240 */     nglGetRenderbufferParameteriv(target, pname, params, params.position(), function_pointer);
/* 241 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static boolean glIsFramebuffer(int framebuffer) {
/* 245 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 246 */     long function_pointer = caps.ARB_framebuffer_object_glIsFramebuffer_pointer;
/* 247 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 248 */     boolean __result = nglIsFramebuffer(framebuffer, function_pointer);
/* 249 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsFramebuffer(int paramInt, long paramLong);
/*     */   
/*     */   public static void glBindFramebuffer(int target, int framebuffer) {
/* 254 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 255 */     long function_pointer = caps.ARB_framebuffer_object_glBindFramebuffer_pointer;
/* 256 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 257 */     nglBindFramebuffer(target, framebuffer, function_pointer);
/*     */   }
/*     */   private static native void nglBindFramebuffer(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteFramebuffers(IntBuffer framebuffers) {
/* 262 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 263 */     long function_pointer = caps.ARB_framebuffer_object_glDeleteFramebuffers_pointer;
/* 264 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 265 */     BufferChecks.checkDirect(framebuffers);
/* 266 */     nglDeleteFramebuffers(framebuffers.remaining(), framebuffers, framebuffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteFramebuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteFramebuffers(int framebuffer) {
/* 272 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 273 */     long function_pointer = caps.ARB_framebuffer_object_glDeleteFramebuffers_pointer;
/* 274 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 275 */     nglDeleteFramebuffers(1, APIUtils.getBufferInt().put(0, framebuffer), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenFramebuffers(IntBuffer framebuffers) {
/* 279 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 280 */     long function_pointer = caps.ARB_framebuffer_object_glGenFramebuffers_pointer;
/* 281 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 282 */     BufferChecks.checkDirect(framebuffers);
/* 283 */     nglGenFramebuffers(framebuffers.remaining(), framebuffers, framebuffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenFramebuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenFramebuffers() {
/* 289 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 290 */     long function_pointer = caps.ARB_framebuffer_object_glGenFramebuffers_pointer;
/* 291 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 292 */     IntBuffer framebuffers = APIUtils.getBufferInt();
/* 293 */     nglGenFramebuffers(1, framebuffers, framebuffers.position(), function_pointer);
/* 294 */     return framebuffers.get(0);
/*     */   }
/*     */   
/*     */   public static int glCheckFramebufferStatus(int target) {
/* 298 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 299 */     long function_pointer = caps.ARB_framebuffer_object_glCheckFramebufferStatus_pointer;
/* 300 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 301 */     int __result = nglCheckFramebufferStatus(target, function_pointer);
/* 302 */     return __result;
/*     */   }
/*     */   private static native int nglCheckFramebufferStatus(int paramInt, long paramLong);
/*     */   
/*     */   public static void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
/* 307 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 308 */     long function_pointer = caps.ARB_framebuffer_object_glFramebufferTexture1D_pointer;
/* 309 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 310 */     nglFramebufferTexture1D(target, attachment, textarget, texture, level, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTexture1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
/* 315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 316 */     long function_pointer = caps.ARB_framebuffer_object_glFramebufferTexture2D_pointer;
/* 317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 318 */     nglFramebufferTexture2D(target, attachment, textarget, texture, level, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer) {
/* 323 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 324 */     long function_pointer = caps.ARB_framebuffer_object_glFramebufferTexture3D_pointer;
/* 325 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 326 */     nglFramebufferTexture3D(target, attachment, textarget, texture, level, layer, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTexture3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
/* 331 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 332 */     long function_pointer = caps.ARB_framebuffer_object_glFramebufferTextureLayer_pointer;
/* 333 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 334 */     nglFramebufferTextureLayer(target, attachment, texture, level, layer, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTextureLayer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
/* 339 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 340 */     long function_pointer = caps.ARB_framebuffer_object_glFramebufferRenderbuffer_pointer;
/* 341 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 342 */     nglFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetFramebufferAttachmentParameter(int target, int attachment, int pname, IntBuffer params) {
/* 347 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 348 */     long function_pointer = caps.ARB_framebuffer_object_glGetFramebufferAttachmentParameteriv_pointer;
/* 349 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 350 */     BufferChecks.checkBuffer(params, 4);
/* 351 */     nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetFramebufferAttachmentParameteriv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetFramebufferAttachmentParameter(int target, int attachment, int pname) {
/* 357 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 358 */     long function_pointer = caps.ARB_framebuffer_object_glGetFramebufferAttachmentParameteriv_pointer;
/* 359 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 360 */     IntBuffer params = APIUtils.getBufferInt();
/* 361 */     nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params, params.position(), function_pointer);
/* 362 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
/* 366 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 367 */     long function_pointer = caps.ARB_framebuffer_object_glBlitFramebuffer_pointer;
/* 368 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 369 */     nglBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, function_pointer);
/*     */   }
/*     */   private static native void nglBlitFramebuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
/*     */   
/*     */   public static void glGenerateMipmap(int target) {
/* 374 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 375 */     long function_pointer = caps.ARB_framebuffer_object_glGenerateMipmap_pointer;
/* 376 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 377 */     nglGenerateMipmap(target, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenerateMipmap(int paramInt, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBFramebufferObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */