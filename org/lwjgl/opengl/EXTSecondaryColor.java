/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.DoubleBuffer;
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ public final class EXTSecondaryColor
/*    */ {
/*    */   public static final int GL_COLOR_SUM_EXT = 33880;
/*    */   public static final int GL_CURRENT_SECONDARY_COLOR_EXT = 33881;
/*    */   public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 33882;
/*    */   public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 33883;
/*    */   public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 33884;
/*    */   public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 33885;
/*    */   public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 33886;
/*    */   
/*    */   private static native void nglSecondaryColor3bEXT(byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*    */   
/*    */   public static void glSecondaryColor3bEXT(byte red, byte green, byte blue) {
/* 23 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 24 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColor3bEXT_pointer;
/* 25 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 26 */     nglSecondaryColor3bEXT(red, green, blue, function_pointer);
/*    */   }
/*    */   private static native void nglSecondaryColor3fEXT(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*    */   
/*    */   public static void glSecondaryColor3fEXT(float red, float green, float blue) {
/* 31 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 32 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColor3fEXT_pointer;
/* 33 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 34 */     nglSecondaryColor3fEXT(red, green, blue, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glSecondaryColor3dEXT(double red, double green, double blue) {
/* 39 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 40 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColor3dEXT_pointer;
/* 41 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 42 */     nglSecondaryColor3dEXT(red, green, blue, function_pointer);
/*    */   }
/*    */   private static native void nglSecondaryColor3dEXT(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*    */   
/*    */   public static void glSecondaryColor3ubEXT(byte red, byte green, byte blue) {
/* 47 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 48 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColor3ubEXT_pointer;
/* 49 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 50 */     nglSecondaryColor3ubEXT(red, green, blue, function_pointer);
/*    */   }
/*    */   private static native void nglSecondaryColor3ubEXT(byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*    */   
/*    */   public static void glSecondaryColorPointerEXT(int size, int stride, DoubleBuffer pPointer) {
/* 55 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 56 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColorPointerEXT_pointer;
/* 57 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 58 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 59 */     BufferChecks.checkDirect(pPointer);
/* 60 */     (GLChecks.getReferences(caps)).EXT_secondary_color_glSecondaryColorPointerEXT_pPointer = pPointer;
/* 61 */     nglSecondaryColorPointerEXT(size, 5130, stride, pPointer, pPointer.position() << 3, function_pointer);
/*    */   }
/*    */   public static void glSecondaryColorPointerEXT(int size, int stride, FloatBuffer pPointer) {
/* 64 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 65 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColorPointerEXT_pointer;
/* 66 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 67 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 68 */     BufferChecks.checkDirect(pPointer);
/* 69 */     (GLChecks.getReferences(caps)).EXT_secondary_color_glSecondaryColorPointerEXT_pPointer = pPointer;
/* 70 */     nglSecondaryColorPointerEXT(size, 5126, stride, pPointer, pPointer.position() << 2, function_pointer);
/*    */   }
/*    */   public static void glSecondaryColorPointerEXT(int size, boolean unsigned, int stride, ByteBuffer pPointer) {
/* 73 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 74 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColorPointerEXT_pointer;
/* 75 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 76 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 77 */     BufferChecks.checkDirect(pPointer);
/* 78 */     (GLChecks.getReferences(caps)).EXT_secondary_color_glSecondaryColorPointerEXT_pPointer = pPointer;
/* 79 */     nglSecondaryColorPointerEXT(size, unsigned ? 5121 : 5120, stride, pPointer, pPointer.position(), function_pointer);
/*    */   }
/*    */   
/*    */   public static void glSecondaryColorPointerEXT(int size, int type, int stride, long pPointer_buffer_offset) {
/* 83 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 84 */     long function_pointer = caps.EXT_secondary_color_glSecondaryColorPointerEXT_pointer;
/* 85 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 86 */     GLChecks.ensureArrayVBOenabled(caps);
/* 87 */     nglSecondaryColorPointerEXTBO(size, type, stride, pPointer_buffer_offset, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglSecondaryColorPointerEXT(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*    */   
/*    */   private static native void nglSecondaryColorPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTSecondaryColor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */