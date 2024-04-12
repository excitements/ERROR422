/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.Arrays;
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
/*     */ class BaseReferences
/*     */ {
/*     */   int elementArrayBuffer;
/*     */   int arrayBuffer;
/*     */   Buffer[] glVertexAttribPointer_buffer;
/*     */   Buffer[] glTexCoordPointer_buffer;
/*     */   int glClientActiveTexture;
/*     */   int pixelPackBuffer;
/*     */   int pixelUnpackBuffer;
/*     */   int indirectBuffer;
/*     */   
/*     */   BaseReferences(ContextCapabilities caps) {
/*     */     int max_vertex_attribs, max_texture_units;
/*  52 */     IntBuffer temp = caps.scratch_int_buffer;
/*     */ 
/*     */     
/*  55 */     if (caps.OpenGL20 || caps.GL_ARB_vertex_shader) {
/*  56 */       GL11.glGetInteger(34921, temp);
/*  57 */       max_vertex_attribs = temp.get(0);
/*     */     } else {
/*  59 */       max_vertex_attribs = 0;
/*  60 */     }  this.glVertexAttribPointer_buffer = new Buffer[max_vertex_attribs];
/*     */ 
/*     */     
/*  63 */     if (caps.OpenGL20) {
/*  64 */       GL11.glGetInteger(34930, temp);
/*  65 */       max_texture_units = temp.get(0);
/*  66 */     } else if (caps.OpenGL13 || caps.GL_ARB_multitexture) {
/*  67 */       GL11.glGetInteger(34018, temp);
/*  68 */       max_texture_units = temp.get(0);
/*     */     } else {
/*  70 */       max_texture_units = 1;
/*  71 */     }  this.glTexCoordPointer_buffer = new Buffer[max_texture_units];
/*     */   }
/*     */   
/*     */   void clear() {
/*  75 */     this.elementArrayBuffer = 0;
/*  76 */     this.arrayBuffer = 0;
/*  77 */     this.glClientActiveTexture = 0;
/*  78 */     Arrays.fill((Object[])this.glVertexAttribPointer_buffer, (Object)null);
/*  79 */     Arrays.fill((Object[])this.glTexCoordPointer_buffer, (Object)null);
/*     */     
/*  81 */     this.pixelPackBuffer = 0;
/*  82 */     this.pixelUnpackBuffer = 0;
/*     */     
/*  84 */     this.indirectBuffer = 0;
/*     */   }
/*     */   
/*     */   void copy(BaseReferences references, int mask) {
/*  88 */     if ((mask & 0x2) != 0) {
/*  89 */       this.elementArrayBuffer = references.elementArrayBuffer;
/*  90 */       this.arrayBuffer = references.arrayBuffer;
/*  91 */       this.glClientActiveTexture = references.glClientActiveTexture;
/*  92 */       System.arraycopy(references.glVertexAttribPointer_buffer, 0, this.glVertexAttribPointer_buffer, 0, this.glVertexAttribPointer_buffer.length);
/*  93 */       System.arraycopy(references.glTexCoordPointer_buffer, 0, this.glTexCoordPointer_buffer, 0, this.glTexCoordPointer_buffer.length);
/*     */       
/*  95 */       this.indirectBuffer = references.indirectBuffer;
/*     */     } 
/*     */     
/*  98 */     if ((mask & 0x1) != 0) {
/*  99 */       this.pixelPackBuffer = references.pixelPackBuffer;
/* 100 */       this.pixelUnpackBuffer = references.pixelUnpackBuffer;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\BaseReferences.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */