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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Cylinder
/*     */   extends Quadric
/*     */ {
/*     */   public void draw(float baseRadius, float topRadius, float height, int slices, int stacks) {
/*     */     float nsign;
/*  83 */     if (this.orientation == 100021) {
/*  84 */       nsign = -1.0F;
/*     */     } else {
/*  86 */       nsign = 1.0F;
/*     */     } 
/*     */     
/*  89 */     float da = 6.2831855F / slices;
/*  90 */     float dr = (topRadius - baseRadius) / stacks;
/*  91 */     float dz = height / stacks;
/*  92 */     float nz = (baseRadius - topRadius) / height;
/*     */ 
/*     */     
/*  95 */     if (this.drawStyle == 100010) {
/*  96 */       GL11.glBegin(0);
/*  97 */       for (int i = 0; i < slices; i++) {
/*  98 */         float x = cos(i * da);
/*  99 */         float y = sin(i * da);
/* 100 */         normal3f(x * nsign, y * nsign, nz * nsign);
/*     */         
/* 102 */         float z = 0.0F;
/* 103 */         float r = baseRadius;
/* 104 */         for (int j = 0; j <= stacks; j++) {
/* 105 */           GL11.glVertex3f(x * r, y * r, z);
/* 106 */           z += dz;
/* 107 */           r += dr;
/*     */         } 
/*     */       } 
/* 110 */       GL11.glEnd();
/* 111 */     } else if (this.drawStyle == 100011 || this.drawStyle == 100013) {
/*     */       
/* 113 */       if (this.drawStyle == 100011) {
/* 114 */         float z = 0.0F;
/* 115 */         float r = baseRadius;
/* 116 */         for (int j = 0; j <= stacks; j++) {
/* 117 */           GL11.glBegin(2);
/* 118 */           for (int k = 0; k < slices; k++) {
/* 119 */             float x = cos(k * da);
/* 120 */             float y = sin(k * da);
/* 121 */             normal3f(x * nsign, y * nsign, nz * nsign);
/* 122 */             GL11.glVertex3f(x * r, y * r, z);
/*     */           } 
/* 124 */           GL11.glEnd();
/* 125 */           z += dz;
/* 126 */           r += dr;
/*     */         }
/*     */       
/*     */       }
/* 130 */       else if (baseRadius != 0.0D) {
/* 131 */         GL11.glBegin(2); int j;
/* 132 */         for (j = 0; j < slices; j++) {
/* 133 */           float x = cos(j * da);
/* 134 */           float y = sin(j * da);
/* 135 */           normal3f(x * nsign, y * nsign, nz * nsign);
/* 136 */           GL11.glVertex3f(x * baseRadius, y * baseRadius, 0.0F);
/*     */         } 
/* 138 */         GL11.glEnd();
/* 139 */         GL11.glBegin(2);
/* 140 */         for (j = 0; j < slices; j++) {
/* 141 */           float x = cos(j * da);
/* 142 */           float y = sin(j * da);
/* 143 */           normal3f(x * nsign, y * nsign, nz * nsign);
/* 144 */           GL11.glVertex3f(x * topRadius, y * topRadius, height);
/*     */         } 
/* 146 */         GL11.glEnd();
/*     */       } 
/*     */ 
/*     */       
/* 150 */       GL11.glBegin(1);
/* 151 */       for (int i = 0; i < slices; i++) {
/* 152 */         float x = cos(i * da);
/* 153 */         float y = sin(i * da);
/* 154 */         normal3f(x * nsign, y * nsign, nz * nsign);
/* 155 */         GL11.glVertex3f(x * baseRadius, y * baseRadius, 0.0F);
/* 156 */         GL11.glVertex3f(x * topRadius, y * topRadius, height);
/*     */       } 
/* 158 */       GL11.glEnd();
/* 159 */     } else if (this.drawStyle == 100012) {
/* 160 */       float ds = 1.0F / slices;
/* 161 */       float dt = 1.0F / stacks;
/* 162 */       float t = 0.0F;
/* 163 */       float z = 0.0F;
/* 164 */       float r = baseRadius;
/* 165 */       for (int j = 0; j < stacks; j++) {
/* 166 */         float s = 0.0F;
/* 167 */         GL11.glBegin(8);
/* 168 */         for (int i = 0; i <= slices; i++) {
/* 169 */           float x, y; if (i == slices) {
/* 170 */             x = sin(0.0F);
/* 171 */             y = cos(0.0F);
/*     */           } else {
/* 173 */             x = sin(i * da);
/* 174 */             y = cos(i * da);
/*     */           } 
/* 176 */           if (nsign == 1.0F) {
/* 177 */             normal3f(x * nsign, y * nsign, nz * nsign);
/* 178 */             TXTR_COORD(s, t);
/* 179 */             GL11.glVertex3f(x * r, y * r, z);
/* 180 */             normal3f(x * nsign, y * nsign, nz * nsign);
/* 181 */             TXTR_COORD(s, t + dt);
/* 182 */             GL11.glVertex3f(x * (r + dr), y * (r + dr), z + dz);
/*     */           } else {
/* 184 */             normal3f(x * nsign, y * nsign, nz * nsign);
/* 185 */             TXTR_COORD(s, t);
/* 186 */             GL11.glVertex3f(x * r, y * r, z);
/* 187 */             normal3f(x * nsign, y * nsign, nz * nsign);
/* 188 */             TXTR_COORD(s, t + dt);
/* 189 */             GL11.glVertex3f(x * (r + dr), y * (r + dr), z + dz);
/*     */           } 
/* 191 */           s += ds;
/*     */         } 
/* 193 */         GL11.glEnd();
/* 194 */         r += dr;
/* 195 */         t += dt;
/* 196 */         z += dz;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\Cylinder.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */