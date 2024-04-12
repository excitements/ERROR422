/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.Buffer;
/*    */ import java.nio.DoubleBuffer;
/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EXTFogCoord
/*    */ {
/*    */   public static final int GL_FOG_COORDINATE_SOURCE_EXT = 33872;
/*    */   public static final int GL_FOG_COORDINATE_EXT = 33873;
/*    */   public static final int GL_FRAGMENT_DEPTH_EXT = 33874;
/*    */   public static final int GL_CURRENT_FOG_COORDINATE_EXT = 33875;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 33876;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 33877;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 33878;
/*    */   public static final int GL_FOG_COORDINATE_ARRAY_EXT = 33879;
/*    */   
/*    */   private static native void nglFogCoordfEXT(float paramFloat, long paramLong);
/*    */   
/*    */   public static void glFogCoordfEXT(float coord) {
/* 24 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 25 */     long function_pointer = caps.EXT_fog_coord_glFogCoordfEXT_pointer;
/* 26 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 27 */     nglFogCoordfEXT(coord, function_pointer);
/*    */   }
/*    */   private static native void nglFogCoorddEXT(double paramDouble, long paramLong);
/*    */   
/*    */   public static void glFogCoorddEXT(double coord) {
/* 32 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 33 */     long function_pointer = caps.EXT_fog_coord_glFogCoorddEXT_pointer;
/* 34 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 35 */     nglFogCoorddEXT(coord, function_pointer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void glFogCoordPointerEXT(int stride, DoubleBuffer data) {
/* 40 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 41 */     long function_pointer = caps.EXT_fog_coord_glFogCoordPointerEXT_pointer;
/* 42 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 43 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 44 */     BufferChecks.checkDirect(data);
/* 45 */     (GLChecks.getReferences(caps)).EXT_fog_coord_glFogCoordPointerEXT_data = data;
/* 46 */     nglFogCoordPointerEXT(5130, stride, data, data.position() << 3, function_pointer);
/*    */   }
/*    */   public static void glFogCoordPointerEXT(int stride, FloatBuffer data) {
/* 49 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 50 */     long function_pointer = caps.EXT_fog_coord_glFogCoordPointerEXT_pointer;
/* 51 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 52 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 53 */     BufferChecks.checkDirect(data);
/* 54 */     (GLChecks.getReferences(caps)).EXT_fog_coord_glFogCoordPointerEXT_data = data;
/* 55 */     nglFogCoordPointerEXT(5126, stride, data, data.position() << 2, function_pointer);
/*    */   }
/*    */   
/*    */   public static void glFogCoordPointerEXT(int type, int stride, long data_buffer_offset) {
/* 59 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 60 */     long function_pointer = caps.EXT_fog_coord_glFogCoordPointerEXT_pointer;
/* 61 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 62 */     GLChecks.ensureArrayVBOenabled(caps);
/* 63 */     nglFogCoordPointerEXTBO(type, stride, data_buffer_offset, function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglFogCoordPointerEXT(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*    */   
/*    */   private static native void nglFogCoordPointerEXTBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTFogCoord.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */