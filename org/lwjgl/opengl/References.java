/*    */ package org.lwjgl.opengl;class References extends BaseReferences { Buffer ARB_matrix_palette_glMatrixIndexPointerARB_pPointer; Buffer ARB_vertex_blend_glWeightPointerARB_pPointer; Buffer EXT_fog_coord_glFogCoordPointerEXT_data; Buffer EXT_gpu_shader4_glVertexAttribIPointerEXT_buffer;
/*    */   Buffer EXT_secondary_color_glSecondaryColorPointerEXT_pPointer;
/*    */   Buffer EXT_vertex_shader_glVariantPointerEXT_pAddr;
/*    */   Buffer EXT_vertex_weighting_glVertexWeightPointerEXT_pPointer;
/*    */   
/*    */   References(ContextCapabilities caps) {
/*  7 */     super(caps);
/*    */   }
/*    */ 
/*    */   
/*    */   Buffer GL11_glColorPointer_pointer;
/*    */   
/*    */   Buffer GL11_glEdgeFlagPointer_pointer;
/*    */   
/*    */   Buffer GL11_glNormalPointer_pointer;
/*    */   
/*    */   Buffer GL11_glVertexPointer_pointer;
/*    */   
/*    */   Buffer GL14_glFogCoordPointer_data;
/*    */   
/*    */   Buffer GL30_glVertexAttribIPointer_buffer;
/*    */   
/*    */   void copy(References references, int mask) {
/* 24 */     copy(references, mask);
/* 25 */     if ((mask & 0x2) != 0) {
/* 26 */       this.ARB_matrix_palette_glMatrixIndexPointerARB_pPointer = references.ARB_matrix_palette_glMatrixIndexPointerARB_pPointer;
/* 27 */       this.ARB_vertex_blend_glWeightPointerARB_pPointer = references.ARB_vertex_blend_glWeightPointerARB_pPointer;
/* 28 */       this.EXT_fog_coord_glFogCoordPointerEXT_data = references.EXT_fog_coord_glFogCoordPointerEXT_data;
/* 29 */       this.EXT_gpu_shader4_glVertexAttribIPointerEXT_buffer = references.EXT_gpu_shader4_glVertexAttribIPointerEXT_buffer;
/* 30 */       this.EXT_secondary_color_glSecondaryColorPointerEXT_pPointer = references.EXT_secondary_color_glSecondaryColorPointerEXT_pPointer;
/* 31 */       this.EXT_vertex_shader_glVariantPointerEXT_pAddr = references.EXT_vertex_shader_glVariantPointerEXT_pAddr;
/* 32 */       this.EXT_vertex_weighting_glVertexWeightPointerEXT_pPointer = references.EXT_vertex_weighting_glVertexWeightPointerEXT_pPointer;
/* 33 */       this.GL11_glColorPointer_pointer = references.GL11_glColorPointer_pointer;
/* 34 */       this.GL11_glEdgeFlagPointer_pointer = references.GL11_glEdgeFlagPointer_pointer;
/* 35 */       this.GL11_glNormalPointer_pointer = references.GL11_glNormalPointer_pointer;
/* 36 */       this.GL11_glVertexPointer_pointer = references.GL11_glVertexPointer_pointer;
/* 37 */       this.GL14_glFogCoordPointer_data = references.GL14_glFogCoordPointer_data;
/* 38 */       this.GL30_glVertexAttribIPointer_buffer = references.GL30_glVertexAttribIPointer_buffer;
/*    */     } 
/*    */   }
/*    */   void clear() {
/* 42 */     super.clear();
/* 43 */     this.ARB_matrix_palette_glMatrixIndexPointerARB_pPointer = null;
/* 44 */     this.ARB_vertex_blend_glWeightPointerARB_pPointer = null;
/* 45 */     this.EXT_fog_coord_glFogCoordPointerEXT_data = null;
/* 46 */     this.EXT_gpu_shader4_glVertexAttribIPointerEXT_buffer = null;
/* 47 */     this.EXT_secondary_color_glSecondaryColorPointerEXT_pPointer = null;
/* 48 */     this.EXT_vertex_shader_glVariantPointerEXT_pAddr = null;
/* 49 */     this.EXT_vertex_weighting_glVertexWeightPointerEXT_pPointer = null;
/* 50 */     this.GL11_glColorPointer_pointer = null;
/* 51 */     this.GL11_glEdgeFlagPointer_pointer = null;
/* 52 */     this.GL11_glNormalPointer_pointer = null;
/* 53 */     this.GL11_glVertexPointer_pointer = null;
/* 54 */     this.GL14_glFogCoordPointer_data = null;
/* 55 */     this.GL30_glVertexAttribIPointer_buffer = null;
/*    */   } }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\References.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */