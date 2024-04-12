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
/*     */ public class Sphere
/*     */   extends Quadric
/*     */ {
/*     */   public void draw(float radius, int slices, int stacks) {
/*     */     float nsign;
/*  78 */     boolean normals = (this.normals != 100002);
/*     */     
/*  80 */     if (this.orientation == 100021) {
/*  81 */       nsign = -1.0F;
/*     */     } else {
/*  83 */       nsign = 1.0F;
/*     */     } 
/*     */     
/*  86 */     float drho = 3.1415927F / stacks;
/*  87 */     float dtheta = 6.2831855F / slices;
/*     */     
/*  89 */     if (this.drawStyle == 100012) {
/*  90 */       int imin, imax; if (!this.textureFlag) {
/*     */         
/*  92 */         GL11.glBegin(6);
/*  93 */         GL11.glNormal3f(0.0F, 0.0F, 1.0F);
/*  94 */         GL11.glVertex3f(0.0F, 0.0F, nsign * radius);
/*  95 */         for (int j = 0; j <= slices; j++) {
/*  96 */           float theta = (j == slices) ? 0.0F : (j * dtheta);
/*  97 */           float x = -sin(theta) * sin(drho);
/*  98 */           float y = cos(theta) * sin(drho);
/*  99 */           float z = nsign * cos(drho);
/* 100 */           if (normals) {
/* 101 */             GL11.glNormal3f(x * nsign, y * nsign, z * nsign);
/*     */           }
/* 103 */           GL11.glVertex3f(x * radius, y * radius, z * radius);
/*     */         } 
/* 105 */         GL11.glEnd();
/*     */       } 
/*     */       
/* 108 */       float ds = 1.0F / slices;
/* 109 */       float dt = 1.0F / stacks;
/* 110 */       float t = 1.0F;
/* 111 */       if (this.textureFlag) {
/* 112 */         imin = 0;
/* 113 */         imax = stacks;
/*     */       } else {
/* 115 */         imin = 1;
/* 116 */         imax = stacks - 1;
/*     */       } 
/*     */ 
/*     */       
/* 120 */       for (int i = imin; i < imax; i++) {
/* 121 */         float rho = i * drho;
/* 122 */         GL11.glBegin(8);
/* 123 */         float s = 0.0F;
/* 124 */         for (int j = 0; j <= slices; j++) {
/* 125 */           float theta = (j == slices) ? 0.0F : (j * dtheta);
/* 126 */           float x = -sin(theta) * sin(rho);
/* 127 */           float y = cos(theta) * sin(rho);
/* 128 */           float z = nsign * cos(rho);
/* 129 */           if (normals) {
/* 130 */             GL11.glNormal3f(x * nsign, y * nsign, z * nsign);
/*     */           }
/* 132 */           TXTR_COORD(s, t);
/* 133 */           GL11.glVertex3f(x * radius, y * radius, z * radius);
/* 134 */           x = -sin(theta) * sin(rho + drho);
/* 135 */           y = cos(theta) * sin(rho + drho);
/* 136 */           z = nsign * cos(rho + drho);
/* 137 */           if (normals) {
/* 138 */             GL11.glNormal3f(x * nsign, y * nsign, z * nsign);
/*     */           }
/* 140 */           TXTR_COORD(s, t - dt);
/* 141 */           s += ds;
/* 142 */           GL11.glVertex3f(x * radius, y * radius, z * radius);
/*     */         } 
/* 144 */         GL11.glEnd();
/* 145 */         t -= dt;
/*     */       } 
/*     */       
/* 148 */       if (!this.textureFlag) {
/*     */         
/* 150 */         GL11.glBegin(6);
/* 151 */         GL11.glNormal3f(0.0F, 0.0F, -1.0F);
/* 152 */         GL11.glVertex3f(0.0F, 0.0F, -radius * nsign);
/* 153 */         float rho = 3.1415927F - drho;
/* 154 */         float s = 1.0F;
/* 155 */         for (int j = slices; j >= 0; j--) {
/* 156 */           float theta = (j == slices) ? 0.0F : (j * dtheta);
/* 157 */           float x = -sin(theta) * sin(rho);
/* 158 */           float y = cos(theta) * sin(rho);
/* 159 */           float z = nsign * cos(rho);
/* 160 */           if (normals)
/* 161 */             GL11.glNormal3f(x * nsign, y * nsign, z * nsign); 
/* 162 */           s -= ds;
/* 163 */           GL11.glVertex3f(x * radius, y * radius, z * radius);
/*     */         } 
/* 165 */         GL11.glEnd();
/*     */       } 
/* 167 */     } else if (this.drawStyle == 100011 || this.drawStyle == 100013) {
/*     */ 
/*     */ 
/*     */       
/* 171 */       int i = 1;
/* 172 */       for (; i < stacks; 
/* 173 */         i++) {
/* 174 */         float rho = i * drho;
/* 175 */         GL11.glBegin(2);
/* 176 */         for (int k = 0; k < slices; k++) {
/* 177 */           float theta = k * dtheta;
/* 178 */           float x = cos(theta) * sin(rho);
/* 179 */           float y = sin(theta) * sin(rho);
/* 180 */           float z = cos(rho);
/* 181 */           if (normals)
/* 182 */             GL11.glNormal3f(x * nsign, y * nsign, z * nsign); 
/* 183 */           GL11.glVertex3f(x * radius, y * radius, z * radius);
/*     */         } 
/* 185 */         GL11.glEnd();
/*     */       } 
/*     */       
/* 188 */       for (int j = 0; j < slices; j++) {
/* 189 */         float theta = j * dtheta;
/* 190 */         GL11.glBegin(3);
/* 191 */         for (i = 0; i <= stacks; i++) {
/* 192 */           float rho = i * drho;
/* 193 */           float x = cos(theta) * sin(rho);
/* 194 */           float y = sin(theta) * sin(rho);
/* 195 */           float z = cos(rho);
/* 196 */           if (normals)
/* 197 */             GL11.glNormal3f(x * nsign, y * nsign, z * nsign); 
/* 198 */           GL11.glVertex3f(x * radius, y * radius, z * radius);
/*     */         } 
/* 200 */         GL11.glEnd();
/*     */       } 
/* 202 */     } else if (this.drawStyle == 100010) {
/*     */       
/* 204 */       GL11.glBegin(0);
/* 205 */       if (normals)
/* 206 */         GL11.glNormal3f(0.0F, 0.0F, nsign); 
/* 207 */       GL11.glVertex3f(0.0F, 0.0F, radius);
/* 208 */       if (normals)
/* 209 */         GL11.glNormal3f(0.0F, 0.0F, -nsign); 
/* 210 */       GL11.glVertex3f(0.0F, 0.0F, -radius);
/*     */ 
/*     */       
/* 213 */       for (int i = 1; i < stacks - 1; i++) {
/* 214 */         float rho = i * drho;
/* 215 */         for (int j = 0; j < slices; j++) {
/* 216 */           float theta = j * dtheta;
/* 217 */           float x = cos(theta) * sin(rho);
/* 218 */           float y = sin(theta) * sin(rho);
/* 219 */           float z = cos(rho);
/* 220 */           if (normals)
/* 221 */             GL11.glNormal3f(x * nsign, y * nsign, z * nsign); 
/* 222 */           GL11.glVertex3f(x * radius, y * radius, z * radius);
/*     */         } 
/*     */       } 
/* 225 */       GL11.glEnd();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\Sphere.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */