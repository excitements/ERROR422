/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
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
/*     */ public final class ARBShadingLanguageInclude
/*     */ {
/*     */   public static final int GL_SHADER_INCLUDE_ARB = 36270;
/*     */   public static final int GL_NAMED_STRING_LENGTH_ARB = 36329;
/*     */   public static final int GL_NAMED_STRING_TYPE_ARB = 36330;
/*     */   
/*     */   public static void glNamedStringARB(int type, ByteBuffer name, ByteBuffer string) {
/*  25 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  26 */     long function_pointer = caps.ARB_shading_language_include_glNamedStringARB_pointer;
/*  27 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  28 */     BufferChecks.checkDirect(name);
/*  29 */     BufferChecks.checkDirect(string);
/*  30 */     nglNamedStringARB(type, name.remaining(), name, name.position(), string.remaining(), string, string.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglNamedStringARB(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer1, int paramInt3, int paramInt4, ByteBuffer paramByteBuffer2, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glNamedStringARB(int type, CharSequence name, CharSequence string) {
/*  36 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  37 */     long function_pointer = caps.ARB_shading_language_include_glNamedStringARB_pointer;
/*  38 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  39 */     nglNamedStringARB(type, name.length(), APIUtils.getBuffer(name), 0, string.length(), APIUtils.getBuffer(string, name.length()), name.length(), function_pointer);
/*     */   }
/*     */   
/*     */   public static void glDeleteNamedStringARB(ByteBuffer name) {
/*  43 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  44 */     long function_pointer = caps.ARB_shading_language_include_glDeleteNamedStringARB_pointer;
/*  45 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  46 */     BufferChecks.checkDirect(name);
/*  47 */     nglDeleteNamedStringARB(name.remaining(), name, name.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeleteNamedStringARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeleteNamedStringARB(CharSequence name) {
/*  53 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  54 */     long function_pointer = caps.ARB_shading_language_include_glDeleteNamedStringARB_pointer;
/*  55 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  56 */     nglDeleteNamedStringARB(name.length(), APIUtils.getBuffer(name), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glCompileShaderIncludeARB(int shader, int count, ByteBuffer path) {
/*  60 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  61 */     long function_pointer = caps.ARB_shading_language_include_glCompileShaderIncludeARB_pointer;
/*  62 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  63 */     BufferChecks.checkDirect(path);
/*  64 */     BufferChecks.checkNullTerminated(path, count);
/*  65 */     nglCompileShaderIncludeARB(shader, count, path, path.position(), null, 0, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglCompileShaderIncludeARB(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glCompileShaderIncludeARB(int shader, CharSequence[] path) {
/*  71 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  72 */     long function_pointer = caps.ARB_shading_language_include_glCompileShaderIncludeARB_pointer;
/*  73 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  74 */     nglCompileShaderIncludeARB2(shader, path.length, APIUtils.getBuffer(path), 0, APIUtils.getLengths(path), 0, function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean glIsNamedStringARB(ByteBuffer name) {
/*  79 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  80 */     long function_pointer = caps.ARB_shading_language_include_glIsNamedStringARB_pointer;
/*  81 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  82 */     BufferChecks.checkDirect(name);
/*  83 */     boolean __result = nglIsNamedStringARB(name.remaining(), name, name.position(), function_pointer);
/*  84 */     return __result;
/*     */   }
/*     */   private static native void nglCompileShaderIncludeARB2(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   private static native boolean nglIsNamedStringARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static boolean glIsNamedStringARB(CharSequence name) {
/*  90 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  91 */     long function_pointer = caps.ARB_shading_language_include_glIsNamedStringARB_pointer;
/*  92 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  93 */     boolean __result = nglIsNamedStringARB(name.length(), APIUtils.getBuffer(name), 0, function_pointer);
/*  94 */     return __result;
/*     */   }
/*     */   
/*     */   public static void glGetNamedStringARB(ByteBuffer name, IntBuffer stringlen, ByteBuffer string) {
/*  98 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  99 */     long function_pointer = caps.ARB_shading_language_include_glGetNamedStringARB_pointer;
/* 100 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 101 */     BufferChecks.checkDirect(name);
/* 102 */     if (stringlen != null)
/* 103 */       BufferChecks.checkBuffer(stringlen, 1); 
/* 104 */     BufferChecks.checkDirect(string);
/* 105 */     nglGetNamedStringARB(name.remaining(), name, name.position(), string.remaining(), stringlen, (stringlen != null) ? stringlen.position() : 0, string, string.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetNamedStringARB(int paramInt1, ByteBuffer paramByteBuffer1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, ByteBuffer paramByteBuffer2, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glGetNamedStringARB(CharSequence name, IntBuffer stringlen, ByteBuffer string) {
/* 111 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 112 */     long function_pointer = caps.ARB_shading_language_include_glGetNamedStringARB_pointer;
/* 113 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 114 */     if (stringlen != null)
/* 115 */       BufferChecks.checkBuffer(stringlen, 1); 
/* 116 */     BufferChecks.checkDirect(string);
/* 117 */     nglGetNamedStringARB(name.length(), APIUtils.getBuffer(name), 0, string.remaining(), stringlen, (stringlen != null) ? stringlen.position() : 0, string, string.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static String glGetNamedStringARB(CharSequence name, int bufSize) {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.ARB_shading_language_include_glGetNamedStringARB_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     IntBuffer string_length = APIUtils.getLengths();
/* 126 */     ByteBuffer string = APIUtils.getBufferByte(bufSize + name.length());
/* 127 */     nglGetNamedStringARB(name.length(), APIUtils.getBuffer(name), 0, bufSize, string_length, 0, string, string.position(), function_pointer);
/* 128 */     string.limit(name.length() + string_length.get(0));
/* 129 */     return APIUtils.getString(string);
/*     */   }
/*     */   
/*     */   public static void glGetNamedStringARB(ByteBuffer name, int pname, IntBuffer params) {
/* 133 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 134 */     long function_pointer = caps.ARB_shading_language_include_glGetNamedStringivARB_pointer;
/* 135 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 136 */     BufferChecks.checkDirect(name);
/* 137 */     BufferChecks.checkBuffer(params, 1);
/* 138 */     nglGetNamedStringivARB(name.remaining(), name, name.position(), pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetNamedStringivARB(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetNamedStringiARB(CharSequence name, int pname, IntBuffer params) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.ARB_shading_language_include_glGetNamedStringivARB_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     BufferChecks.checkBuffer(params, 1);
/* 148 */     nglGetNamedStringivARB(name.length(), APIUtils.getBuffer(name), 0, pname, params, params.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int glGetNamedStringiARB(CharSequence name, int pname) {
/* 153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 154 */     long function_pointer = caps.ARB_shading_language_include_glGetNamedStringivARB_pointer;
/* 155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 156 */     IntBuffer params = APIUtils.getBufferInt();
/* 157 */     nglGetNamedStringivARB(name.length(), APIUtils.getBuffer(name), 0, pname, params, params.position(), function_pointer);
/* 158 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBShadingLanguageInclude.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */