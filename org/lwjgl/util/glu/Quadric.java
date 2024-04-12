/*     */ package org.lwjgl.util.glu;
/*     */ 
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class Quadric
/*     */ {
/*  56 */   protected int drawStyle = 100012;
/*  57 */   protected int orientation = 100020;
/*     */   protected boolean textureFlag = false;
/*  59 */   protected int normals = 100000;
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
/*     */   protected void normal3f(float x, float y, float z) {
/*  72 */     float mag = (float)Math.sqrt((x * x + y * y + z * z));
/*  73 */     if (mag > 1.0E-5F) {
/*  74 */       x /= mag;
/*  75 */       y /= mag;
/*  76 */       z /= mag;
/*     */     } 
/*  78 */     GL11.glNormal3f(x, y, z);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDrawStyle(int drawStyle) {
/* 100 */     this.drawStyle = drawStyle;
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
/*     */ 
/*     */   
/*     */   public void setNormals(int normals) {
/* 117 */     this.normals = normals;
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
/*     */ 
/*     */   
/*     */   public void setOrientation(int orientation) {
/* 134 */     this.orientation = orientation;
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
/*     */   public void setTextureFlag(boolean textureFlag) {
/* 149 */     this.textureFlag = textureFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDrawStyle() {
/* 158 */     return this.drawStyle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNormals() {
/* 166 */     return this.normals;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrientation() {
/* 174 */     return this.orientation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getTextureFlag() {
/* 182 */     return this.textureFlag;
/*     */   }
/*     */   
/*     */   protected void TXTR_COORD(float x, float y) {
/* 186 */     if (this.textureFlag) GL11.glTexCoord2f(x, y);
/*     */   
/*     */   }
/*     */   
/*     */   protected float sin(float r) {
/* 191 */     return (float)Math.sin(r);
/*     */   }
/*     */   
/*     */   protected float cos(float r) {
/* 195 */     return (float)Math.cos(r);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\Quadric.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */