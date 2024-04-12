/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
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
/*     */ class GLChecks
/*     */ {
/*     */   static References getReferences(ContextCapabilities caps) {
/*  59 */     return StateTracker.getReferencesStack(caps).getReferences();
/*     */   }
/*     */   
/*     */   static int getBufferObjectSize(ContextCapabilities caps, int buffer_enum) {
/*  63 */     IntBuffer scratch_buffer = caps.scratch_int_buffer;
/*  64 */     GL15.glGetBufferParameter(buffer_enum, 34660, scratch_buffer);
/*  65 */     return scratch_buffer.get(0);
/*     */   }
/*     */   
/*     */   static int getBufferObjectSizeARB(ContextCapabilities caps, int buffer_enum) {
/*  69 */     IntBuffer scratch_buffer = caps.scratch_int_buffer;
/*  70 */     ARBBufferObject.glGetBufferParameterARB(buffer_enum, 34660, scratch_buffer);
/*  71 */     return scratch_buffer.get(0);
/*     */   }
/*     */   
/*     */   static int getBufferObjectSizeATI(ContextCapabilities caps, int buffer) {
/*  75 */     IntBuffer scratch_buffer = caps.scratch_int_buffer;
/*  76 */     ATIVertexArrayObject.glGetObjectBufferATI(buffer, 34660, scratch_buffer);
/*  77 */     return scratch_buffer.get(0);
/*     */   }
/*     */   
/*     */   static int getNamedBufferObjectSize(ContextCapabilities caps, int buffer) {
/*  81 */     IntBuffer scratch_buffer = caps.scratch_int_buffer;
/*  82 */     EXTDirectStateAccess.glGetNamedBufferParameterEXT(buffer, 34660, scratch_buffer);
/*  83 */     return scratch_buffer.get(0);
/*     */   }
/*     */   
/*     */   private static boolean checkBufferObject(ContextCapabilities caps, int buffer_enum, boolean state) {
/*  87 */     IntBuffer scratch_buffer = caps.scratch_int_buffer;
/*  88 */     GL11.glGetInteger(buffer_enum, scratch_buffer);
/*  89 */     boolean is_enabled = (scratch_buffer.get(0) != 0);
/*  90 */     return (state == is_enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   static void ensureArrayVBOdisabled(ContextCapabilities caps) {
/*  95 */     if ((StateTracker.getReferencesStack(caps).getReferences()).arrayBuffer != 0) {
/*  96 */       throw new OpenGLException("Cannot use Buffers when Array Buffer Object is enabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensureArrayVBOenabled(ContextCapabilities caps) {
/* 101 */     if ((StateTracker.getReferencesStack(caps).getReferences()).arrayBuffer == 0) {
/* 102 */       throw new OpenGLException("Cannot use offsets when Array Buffer Object is disabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensureElementVBOdisabled(ContextCapabilities caps) {
/* 107 */     if ((StateTracker.getReferencesStack(caps).getReferences()).elementArrayBuffer != 0) {
/* 108 */       throw new OpenGLException("Cannot use Buffers when Element Array Buffer Object is enabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensureElementVBOenabled(ContextCapabilities caps) {
/* 113 */     if ((StateTracker.getReferencesStack(caps).getReferences()).elementArrayBuffer == 0) {
/* 114 */       throw new OpenGLException("Cannot use offsets when Element Array Buffer Object is disabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensureIndirectBOdisabled(ContextCapabilities caps) {
/* 119 */     if ((StateTracker.getReferencesStack(caps).getReferences()).indirectBuffer != 0) {
/* 120 */       throw new OpenGLException("Cannot use Buffers when Draw Indirect Object is enabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensureIndirectBOenabled(ContextCapabilities caps) {
/* 125 */     if ((StateTracker.getReferencesStack(caps).getReferences()).indirectBuffer == 0) {
/* 126 */       throw new OpenGLException("Cannot use offsets when Draw Indirect Object is disabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensurePackPBOdisabled(ContextCapabilities caps) {
/* 131 */     if ((StateTracker.getReferencesStack(caps).getReferences()).pixelPackBuffer != 0) {
/* 132 */       throw new OpenGLException("Cannot use Buffers when Pixel Pack Buffer Object is enabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensurePackPBOenabled(ContextCapabilities caps) {
/* 137 */     if ((StateTracker.getReferencesStack(caps).getReferences()).pixelPackBuffer == 0) {
/* 138 */       throw new OpenGLException("Cannot use offsets when Pixel Pack Buffer Object is disabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensureUnpackPBOdisabled(ContextCapabilities caps) {
/* 143 */     if ((StateTracker.getReferencesStack(caps).getReferences()).pixelUnpackBuffer != 0) {
/* 144 */       throw new OpenGLException("Cannot use Buffers when Pixel Unpack Buffer Object is enabled");
/*     */     }
/*     */   }
/*     */   
/*     */   static void ensureUnpackPBOenabled(ContextCapabilities caps) {
/* 149 */     if ((StateTracker.getReferencesStack(caps).getReferences()).pixelUnpackBuffer == 0) {
/* 150 */       throw new OpenGLException("Cannot use offsets when Pixel Unpack Buffer Object is disabled");
/*     */     }
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
/*     */   static int calculateImageStorage(Buffer buffer, int format, int type, int width, int height, int depth) {
/* 165 */     return calculateImageStorage(format, type, width, height, depth) >> BufferUtils.getElementSizeExponent(buffer);
/*     */   }
/*     */   
/*     */   static int calculateTexImage1DStorage(Buffer buffer, int format, int type, int width) {
/* 169 */     return calculateTexImage1DStorage(format, type, width) >> BufferUtils.getElementSizeExponent(buffer);
/*     */   }
/*     */   
/*     */   static int calculateTexImage2DStorage(Buffer buffer, int format, int type, int width, int height) {
/* 173 */     return calculateTexImage2DStorage(format, type, width, height) >> BufferUtils.getElementSizeExponent(buffer);
/*     */   }
/*     */   
/*     */   static int calculateTexImage3DStorage(Buffer buffer, int format, int type, int width, int height, int depth) {
/* 177 */     return calculateTexImage3DStorage(format, type, width, height, depth) >> BufferUtils.getElementSizeExponent(buffer);
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
/*     */   private static int calculateImageStorage(int format, int type, int width, int height, int depth) {
/* 192 */     return calculateBytesPerPixel(format, type) * width * height * depth;
/*     */   }
/*     */   
/*     */   private static int calculateTexImage1DStorage(int format, int type, int width) {
/* 196 */     return calculateBytesPerPixel(format, type) * width;
/*     */   }
/*     */   
/*     */   private static int calculateTexImage2DStorage(int format, int type, int width, int height) {
/* 200 */     return calculateTexImage1DStorage(format, type, width) * height;
/*     */   }
/*     */   
/*     */   private static int calculateTexImage3DStorage(int format, int type, int width, int height, int depth) {
/* 204 */     return calculateTexImage2DStorage(format, type, width, height) * depth;
/*     */   }
/*     */   private static int calculateBytesPerPixel(int format, int type) {
/*     */     int bpe;
/*     */     int epp;
/* 209 */     switch (type) {
/*     */       case 5120:
/*     */       case 5121:
/* 212 */         bpe = 1;
/*     */         break;
/*     */       case 5122:
/*     */       case 5123:
/* 216 */         bpe = 2;
/*     */         break;
/*     */       case 5124:
/*     */       case 5125:
/*     */       case 5126:
/* 221 */         bpe = 4;
/*     */         break;
/*     */       
/*     */       default:
/* 225 */         return 0;
/*     */     } 
/*     */ 
/*     */     
/* 229 */     switch (format) {
/*     */       case 6406:
/*     */       case 6409:
/* 232 */         epp = 1;
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
/* 254 */         return bpe * epp;case 6410: epp = 2; return bpe * epp;case 6407: case 32992: epp = 3; return bpe * epp;case 6408: case 32768: case 32993: epp = 4; return bpe * epp;
/*     */     } 
/*     */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GLChecks.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */