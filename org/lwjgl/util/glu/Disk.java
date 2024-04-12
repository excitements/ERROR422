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
/*     */ public class Disk
/*     */   extends Quadric
/*     */ {
/*     */   public void draw(float innerRadius, float outerRadius, int slices, int loops) {
/*     */     float dtc;
/*     */     int l, s;
/*     */     float a;
/*     */     int i;
/*     */     float r1;
/*     */     int j;
/*  75 */     if (this.normals != 100002) {
/*  76 */       if (this.orientation == 100020) {
/*  77 */         GL11.glNormal3f(0.0F, 0.0F, 1.0F);
/*     */       } else {
/*     */         
/*  80 */         GL11.glNormal3f(0.0F, 0.0F, -1.0F);
/*     */       } 
/*     */     }
/*     */     
/*  84 */     float da = 6.2831855F / slices;
/*  85 */     float dr = (outerRadius - innerRadius) / loops;
/*     */     
/*  87 */     switch (this.drawStyle) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 100012:
/*  94 */         dtc = 2.0F * outerRadius;
/*     */         
/*  96 */         r1 = innerRadius;
/*     */         
/*  98 */         for (j = 0; j < loops; j++) {
/*  99 */           float r2 = r1 + dr;
/* 100 */           if (this.orientation == 100020) {
/*     */             
/* 102 */             GL11.glBegin(8);
/* 103 */             for (int k = 0; k <= slices; k++) {
/*     */               float f1;
/* 105 */               if (k == slices) {
/* 106 */                 f1 = 0.0F;
/*     */               } else {
/* 108 */                 f1 = k * da;
/* 109 */               }  float sa = sin(f1);
/* 110 */               float ca = cos(f1);
/* 111 */               TXTR_COORD(0.5F + sa * r2 / dtc, 0.5F + ca * r2 / dtc);
/* 112 */               GL11.glVertex2f(r2 * sa, r2 * ca);
/* 113 */               TXTR_COORD(0.5F + sa * r1 / dtc, 0.5F + ca * r1 / dtc);
/* 114 */               GL11.glVertex2f(r1 * sa, r1 * ca);
/*     */             } 
/* 116 */             GL11.glEnd();
/*     */           }
/*     */           else {
/*     */             
/* 120 */             GL11.glBegin(8);
/* 121 */             for (int k = slices; k >= 0; k--) {
/*     */               float f1;
/* 123 */               if (k == slices) {
/* 124 */                 f1 = 0.0F;
/*     */               } else {
/* 126 */                 f1 = k * da;
/* 127 */               }  float sa = sin(f1);
/* 128 */               float ca = cos(f1);
/* 129 */               TXTR_COORD(0.5F - sa * r2 / dtc, 0.5F + ca * r2 / dtc);
/* 130 */               GL11.glVertex2f(r2 * sa, r2 * ca);
/* 131 */               TXTR_COORD(0.5F - sa * r1 / dtc, 0.5F + ca * r1 / dtc);
/* 132 */               GL11.glVertex2f(r1 * sa, r1 * ca);
/*     */             } 
/* 134 */             GL11.glEnd();
/*     */           } 
/* 136 */           r1 = r2;
/*     */         } 
/*     */         return;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 100011:
/* 144 */         for (l = 0; l <= loops; l++) {
/* 145 */           float r = innerRadius + l * dr;
/* 146 */           GL11.glBegin(2);
/* 147 */           for (int k = 0; k < slices; k++) {
/* 148 */             float f = k * da;
/* 149 */             GL11.glVertex2f(r * sin(f), r * cos(f));
/*     */           } 
/* 151 */           GL11.glEnd();
/*     */         } 
/*     */         
/* 154 */         for (i = 0; i < slices; i++) {
/* 155 */           float f1 = i * da;
/* 156 */           float x = sin(f1);
/* 157 */           float y = cos(f1);
/* 158 */           GL11.glBegin(3);
/* 159 */           for (l = 0; l <= loops; l++) {
/* 160 */             float r = innerRadius + l * dr;
/* 161 */             GL11.glVertex2f(r * x, r * y);
/*     */           } 
/* 163 */           GL11.glEnd();
/*     */         } 
/*     */         return;
/*     */ 
/*     */ 
/*     */       
/*     */       case 100010:
/* 170 */         GL11.glBegin(0);
/* 171 */         for (s = 0; s < slices; s++) {
/* 172 */           float f1 = s * da;
/* 173 */           float x = sin(f1);
/* 174 */           float y = cos(f1);
/*     */           
/* 176 */           for (j = 0; j <= loops; j++) {
/* 177 */             float r = innerRadius * j * dr;
/* 178 */             GL11.glVertex2f(r * x, r * y);
/*     */           } 
/*     */         } 
/* 181 */         GL11.glEnd();
/*     */         return;
/*     */ 
/*     */       
/*     */       case 100013:
/* 186 */         if (innerRadius != 0.0D) {
/*     */           
/* 188 */           GL11.glBegin(2); float f;
/* 189 */           for (f = 0.0F; f < 6.2831854820251465D; f += da) {
/* 190 */             float x = innerRadius * sin(f);
/* 191 */             float y = innerRadius * cos(f);
/* 192 */             GL11.glVertex2f(x, y);
/*     */           } 
/* 194 */           GL11.glEnd();
/*     */         } 
/*     */ 
/*     */         
/* 198 */         GL11.glBegin(2);
/* 199 */         for (a = 0.0F; a < 6.2831855F; a += da) {
/* 200 */           float x = outerRadius * sin(a);
/* 201 */           float y = outerRadius * cos(a);
/* 202 */           GL11.glVertex2f(x, y);
/*     */         } 
/* 204 */         GL11.glEnd();
/*     */         return;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\Disk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */