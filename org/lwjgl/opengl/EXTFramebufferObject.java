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
/*     */ public final class EXTFramebufferObject
/*     */ {
/*     */   public static final int GL_FRAMEBUFFER_EXT = 36160;
/*     */   public static final int GL_RENDERBUFFER_EXT = 36161;
/*     */   public static final int GL_STENCIL_INDEX1_EXT = 36166;
/*     */   public static final int GL_STENCIL_INDEX4_EXT = 36167;
/*     */   public static final int GL_STENCIL_INDEX8_EXT = 36168;
/*     */   public static final int GL_STENCIL_INDEX16_EXT = 36169;
/*     */   public static final int GL_RENDERBUFFER_WIDTH_EXT = 36162;
/*     */   public static final int GL_RENDERBUFFER_HEIGHT_EXT = 36163;
/*     */   public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_EXT = 36164;
/*     */   public static final int GL_RENDERBUFFER_RED_SIZE_EXT = 36176;
/*     */   public static final int GL_RENDERBUFFER_GREEN_SIZE_EXT = 36177;
/*     */   public static final int GL_RENDERBUFFER_BLUE_SIZE_EXT = 36178;
/*     */   public static final int GL_RENDERBUFFER_ALPHA_SIZE_EXT = 36179;
/*     */   public static final int GL_RENDERBUFFER_DEPTH_SIZE_EXT = 36180;
/*     */   public static final int GL_RENDERBUFFER_STENCIL_SIZE_EXT = 36181;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT = 36048;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT = 36049;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT = 36050;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = 36051;
/*     */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT = 36052;
/*     */   public static final int GL_COLOR_ATTACHMENT0_EXT = 36064;
/*     */   public static final int GL_COLOR_ATTACHMENT1_EXT = 36065;
/*     */   public static final int GL_COLOR_ATTACHMENT2_EXT = 36066;
/*     */   public static final int GL_COLOR_ATTACHMENT3_EXT = 36067;
/*     */   public static final int GL_COLOR_ATTACHMENT4_EXT = 36068;
/*     */   public static final int GL_COLOR_ATTACHMENT5_EXT = 36069;
/*     */   public static final int GL_COLOR_ATTACHMENT6_EXT = 36070;
/*     */   public static final int GL_COLOR_ATTACHMENT7_EXT = 36071;
/*     */   public static final int GL_COLOR_ATTACHMENT8_EXT = 36072;
/*     */   public static final int GL_COLOR_ATTACHMENT9_EXT = 36073;
/*     */   public static final int GL_COLOR_ATTACHMENT10_EXT = 36074;
/*     */   public static final int GL_COLOR_ATTACHMENT11_EXT = 36075;
/*     */   public static final int GL_COLOR_ATTACHMENT12_EXT = 36076;
/*     */   public static final int GL_COLOR_ATTACHMENT13_EXT = 36077;
/*     */   public static final int GL_COLOR_ATTACHMENT14_EXT = 36078;
/*     */   public static final int GL_COLOR_ATTACHMENT15_EXT = 36079;
/*     */   public static final int GL_DEPTH_ATTACHMENT_EXT = 36096;
/*     */   public static final int GL_STENCIL_ATTACHMENT_EXT = 36128;
/*     */   public static final int GL_FRAMEBUFFER_COMPLETE_EXT = 36053;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT = 36054;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = 36055;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT = 36057;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT = 36058;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT = 36059;
/*     */   public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT = 36060;
/*     */   public static final int GL_FRAMEBUFFER_UNSUPPORTED_EXT = 36061;
/*     */   public static final int GL_FRAMEBUFFER_BINDING_EXT = 36006;
/*     */   public static final int GL_RENDERBUFFER_BINDING_EXT = 36007;
/*     */   public static final int GL_MAX_COLOR_ATTACHMENTS_EXT = 36063;
/*     */   public static final int GL_MAX_RENDERBUFFER_SIZE_EXT = 34024;
/*     */   public static final int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = 1286;
/*     */   
/*     */   private static native boolean nglIsRenderbufferEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static boolean glIsRenderbufferEXT(int renderbuffer) {
/* 102 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 103 */     long function_pointer = caps.EXT_framebuffer_object_glIsRenderbufferEXT_pointer;
/* 104 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 105 */     boolean __result = nglIsRenderbufferEXT(renderbuffer, function_pointer);
/* 106 */     return __result;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glBindRenderbufferEXT(int target, int renderbuffer) {
/* 111 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 112 */     long function_pointer = caps.EXT_framebuffer_object_glBindRenderbufferEXT_pointer;
/* 113 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 114 */     nglBindRenderbufferEXT(target, renderbuffer, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glDeleteRenderbuffersEXT(IntBuffer renderbuffers) {
/* 119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 120 */     long function_pointer = caps.EXT_framebuffer_object_glDeleteRenderbuffersEXT_pointer;
/* 121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 122 */     BufferChecks.checkDirect(renderbuffers);
/* 123 */     nglDeleteRenderbuffersEXT(renderbuffers.remaining(), renderbuffers, renderbuffers.position(), function_pointer);
/*     */   }
/*     */   private static native void nglBindRenderbufferEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   private static native void nglDeleteRenderbuffersEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteRenderbuffersEXT(int renderbuffer) {
/* 129 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 130 */     long function_pointer = caps.EXT_framebuffer_object_glDeleteRenderbuffersEXT_pointer;
/* 131 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 132 */     nglDeleteRenderbuffersEXT(1, APIUtils.getBufferInt().put(0, renderbuffer), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenRenderbuffersEXT(IntBuffer renderbuffers) {
/* 136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 137 */     long function_pointer = caps.EXT_framebuffer_object_glGenRenderbuffersEXT_pointer;
/* 138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 139 */     BufferChecks.checkDirect(renderbuffers);
/* 140 */     nglGenRenderbuffersEXT(renderbuffers.remaining(), renderbuffers, renderbuffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenRenderbuffersEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenRenderbuffersEXT() {
/* 146 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 147 */     long function_pointer = caps.EXT_framebuffer_object_glGenRenderbuffersEXT_pointer;
/* 148 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 149 */     IntBuffer renderbuffers = APIUtils.getBufferInt();
/* 150 */     nglGenRenderbuffersEXT(1, renderbuffers, renderbuffers.position(), function_pointer);
/* 151 */     return renderbuffers.get(0);
/*     */   }
/*     */   
/*     */   public static void glRenderbufferStorageEXT(int target, int internalformat, int width, int height) {
/* 155 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 156 */     long function_pointer = caps.EXT_framebuffer_object_glRenderbufferStorageEXT_pointer;
/* 157 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 158 */     nglRenderbufferStorageEXT(target, internalformat, width, height, function_pointer);
/*     */   }
/*     */   private static native void nglRenderbufferStorageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetRenderbufferParameterEXT(int target, int pname, IntBuffer params) {
/* 163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 164 */     long function_pointer = caps.EXT_framebuffer_object_glGetRenderbufferParameterivEXT_pointer;
/* 165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 166 */     BufferChecks.checkBuffer(params, 4);
/* 167 */     nglGetRenderbufferParameterivEXT(target, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetRenderbufferParameterivEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetRenderbufferParameterEXT(int target, int pname) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.EXT_framebuffer_object_glGetRenderbufferParameterivEXT_pointer;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     IntBuffer params = APIUtils.getBufferInt();
/* 177 */     nglGetRenderbufferParameterivEXT(target, pname, params, params.position(), function_pointer);
/* 178 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static boolean glIsFramebufferEXT(int framebuffer) {
/* 182 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 183 */     long function_pointer = caps.EXT_framebuffer_object_glIsFramebufferEXT_pointer;
/* 184 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 185 */     boolean __result = nglIsFramebufferEXT(framebuffer, function_pointer);
/* 186 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsFramebufferEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static void glBindFramebufferEXT(int target, int framebuffer) {
/* 191 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 192 */     long function_pointer = caps.EXT_framebuffer_object_glBindFramebufferEXT_pointer;
/* 193 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 194 */     nglBindFramebufferEXT(target, framebuffer, function_pointer);
/*     */   }
/*     */   private static native void nglBindFramebufferEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteFramebuffersEXT(IntBuffer framebuffers) {
/* 199 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 200 */     long function_pointer = caps.EXT_framebuffer_object_glDeleteFramebuffersEXT_pointer;
/* 201 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 202 */     BufferChecks.checkDirect(framebuffers);
/* 203 */     nglDeleteFramebuffersEXT(framebuffers.remaining(), framebuffers, framebuffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteFramebuffersEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteFramebuffersEXT(int framebuffer) {
/* 209 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 210 */     long function_pointer = caps.EXT_framebuffer_object_glDeleteFramebuffersEXT_pointer;
/* 211 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 212 */     nglDeleteFramebuffersEXT(1, APIUtils.getBufferInt().put(0, framebuffer), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glGenFramebuffersEXT(IntBuffer framebuffers) {
/* 216 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 217 */     long function_pointer = caps.EXT_framebuffer_object_glGenFramebuffersEXT_pointer;
/* 218 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 219 */     BufferChecks.checkDirect(framebuffers);
/* 220 */     nglGenFramebuffersEXT(framebuffers.remaining(), framebuffers, framebuffers.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenFramebuffersEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenFramebuffersEXT() {
/* 226 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 227 */     long function_pointer = caps.EXT_framebuffer_object_glGenFramebuffersEXT_pointer;
/* 228 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 229 */     IntBuffer framebuffers = APIUtils.getBufferInt();
/* 230 */     nglGenFramebuffersEXT(1, framebuffers, framebuffers.position(), function_pointer);
/* 231 */     return framebuffers.get(0);
/*     */   }
/*     */   
/*     */   public static int glCheckFramebufferStatusEXT(int target) {
/* 235 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 236 */     long function_pointer = caps.EXT_framebuffer_object_glCheckFramebufferStatusEXT_pointer;
/* 237 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 238 */     int __result = nglCheckFramebufferStatusEXT(target, function_pointer);
/* 239 */     return __result;
/*     */   }
/*     */   private static native int nglCheckFramebufferStatusEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static void glFramebufferTexture1DEXT(int target, int attachment, int textarget, int texture, int level) {
/* 244 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 245 */     long function_pointer = caps.EXT_framebuffer_object_glFramebufferTexture1DEXT_pointer;
/* 246 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 247 */     nglFramebufferTexture1DEXT(target, attachment, textarget, texture, level, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTexture1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glFramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {
/* 252 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 253 */     long function_pointer = caps.EXT_framebuffer_object_glFramebufferTexture2DEXT_pointer;
/* 254 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 255 */     nglFramebufferTexture2DEXT(target, attachment, textarget, texture, level, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTexture2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glFramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.EXT_framebuffer_object_glFramebufferTexture3DEXT_pointer;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     nglFramebufferTexture3DEXT(target, attachment, textarget, texture, level, zoffset, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferTexture3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glFramebufferRenderbufferEXT(int target, int attachment, int renderbuffertarget, int renderbuffer) {
/* 268 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 269 */     long function_pointer = caps.EXT_framebuffer_object_glFramebufferRenderbufferEXT_pointer;
/* 270 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 271 */     nglFramebufferRenderbufferEXT(target, attachment, renderbuffertarget, renderbuffer, function_pointer);
/*     */   }
/*     */   private static native void nglFramebufferRenderbufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetFramebufferAttachmentParameterEXT(int target, int attachment, int pname, IntBuffer params) {
/* 276 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 277 */     long function_pointer = caps.EXT_framebuffer_object_glGetFramebufferAttachmentParameterivEXT_pointer;
/* 278 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 279 */     BufferChecks.checkBuffer(params, 4);
/* 280 */     nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetFramebufferAttachmentParameterivEXT(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetFramebufferAttachmentParameterEXT(int target, int attachment, int pname) {
/* 286 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 287 */     long function_pointer = caps.EXT_framebuffer_object_glGetFramebufferAttachmentParameterivEXT_pointer;
/* 288 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 289 */     IntBuffer params = APIUtils.getBufferInt();
/* 290 */     nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, params, params.position(), function_pointer);
/* 291 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGenerateMipmapEXT(int target) {
/* 295 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 296 */     long function_pointer = caps.EXT_framebuffer_object_glGenerateMipmapEXT_pointer;
/* 297 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 298 */     nglGenerateMipmapEXT(target, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenerateMipmapEXT(int paramInt, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTFramebufferObject.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */