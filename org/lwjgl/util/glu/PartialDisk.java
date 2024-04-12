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
/*     */ 
/*     */ 
/*     */ public class PartialDisk
/*     */   extends Quadric
/*     */ {
/*     */   private static final int CACHE_SIZE = 240;
/*     */   
/*     */   public void draw(float innerRadius, float outerRadius, int slices, int loops, float startAngle, float sweepAngle) {
/*     */     int j, slices2, finish;
/*  87 */     float[] sinCache = new float[240];
/*  88 */     float[] cosCache = new float[240];
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     float texLow = 0.0F, texHigh = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     if (slices >= 240)
/*  99 */       slices = 239; 
/* 100 */     if (slices < 2 || loops < 1 || outerRadius <= 0.0F || innerRadius < 0.0F || innerRadius > outerRadius) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       System.err.println("PartialDisk: GLU_INVALID_VALUE");
/*     */       
/*     */       return;
/*     */     } 
/* 110 */     if (sweepAngle < -360.0F)
/* 111 */       sweepAngle = 360.0F; 
/* 112 */     if (sweepAngle > 360.0F)
/* 113 */       sweepAngle = 360.0F; 
/* 114 */     if (sweepAngle < 0.0F) {
/* 115 */       startAngle += sweepAngle;
/* 116 */       sweepAngle = -sweepAngle;
/*     */     } 
/*     */     
/* 119 */     if (sweepAngle == 360.0F) {
/* 120 */       slices2 = slices;
/*     */     } else {
/* 122 */       slices2 = slices + 1;
/*     */     } 
/*     */ 
/*     */     
/* 126 */     float deltaRadius = outerRadius - innerRadius;
/*     */ 
/*     */ 
/*     */     
/* 130 */     float angleOffset = startAngle / 180.0F * 3.1415927F; int i;
/* 131 */     for (i = 0; i <= slices; i++) {
/* 132 */       float angle = angleOffset + 3.1415927F * sweepAngle / 180.0F * i / slices;
/* 133 */       sinCache[i] = sin(angle);
/* 134 */       cosCache[i] = cos(angle);
/*     */     } 
/*     */     
/* 137 */     if (sweepAngle == 360.0F) {
/* 138 */       sinCache[slices] = sinCache[0];
/* 139 */       cosCache[slices] = cosCache[0];
/*     */     } 
/*     */     
/* 142 */     switch (this.normals) {
/*     */       case 100000:
/*     */       case 100001:
/* 145 */         if (this.orientation == 100020) {
/* 146 */           GL11.glNormal3f(0.0F, 0.0F, 1.0F); break;
/*     */         } 
/* 148 */         GL11.glNormal3f(0.0F, 0.0F, -1.0F);
/*     */         break;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     switch (this.drawStyle) {
/*     */       case 100012:
/* 158 */         if (innerRadius == 0.0F) {
/* 159 */           finish = loops - 1;
/*     */           
/* 161 */           GL11.glBegin(6);
/* 162 */           if (this.textureFlag) {
/* 163 */             GL11.glTexCoord2f(0.5F, 0.5F);
/*     */           }
/* 165 */           GL11.glVertex3f(0.0F, 0.0F, 0.0F);
/* 166 */           float radiusLow = outerRadius - deltaRadius * (loops - 1) / loops;
/* 167 */           if (this.textureFlag) {
/* 168 */             texLow = radiusLow / outerRadius / 2.0F;
/*     */           }
/*     */           
/* 171 */           if (this.orientation == 100020) {
/* 172 */             for (i = slices; i >= 0; i--) {
/* 173 */               if (this.textureFlag) {
/* 174 */                 GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */               }
/*     */ 
/*     */               
/* 178 */               GL11.glVertex3f(radiusLow * sinCache[i], radiusLow * cosCache[i], 0.0F);
/*     */             } 
/*     */           } else {
/* 181 */             for (i = 0; i <= slices; i++) {
/* 182 */               if (this.textureFlag) {
/* 183 */                 GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */               }
/*     */ 
/*     */               
/* 187 */               GL11.glVertex3f(radiusLow * sinCache[i], radiusLow * cosCache[i], 0.0F);
/*     */             } 
/*     */           } 
/* 190 */           GL11.glEnd();
/*     */         } else {
/* 192 */           finish = loops;
/*     */         } 
/* 194 */         for (j = 0; j < finish; j++) {
/* 195 */           float radiusLow = outerRadius - deltaRadius * j / loops;
/* 196 */           float radiusHigh = outerRadius - deltaRadius * (j + 1) / loops;
/* 197 */           if (this.textureFlag) {
/* 198 */             texLow = radiusLow / outerRadius / 2.0F;
/* 199 */             texHigh = radiusHigh / outerRadius / 2.0F;
/*     */           } 
/*     */           
/* 202 */           GL11.glBegin(8);
/* 203 */           for (i = 0; i <= slices; i++) {
/* 204 */             if (this.orientation == 100020) {
/* 205 */               if (this.textureFlag) {
/* 206 */                 GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */               }
/*     */ 
/*     */               
/* 210 */               GL11.glVertex3f(radiusLow * sinCache[i], radiusLow * cosCache[i], 0.0F);
/*     */               
/* 212 */               if (this.textureFlag) {
/* 213 */                 GL11.glTexCoord2f(texHigh * sinCache[i] + 0.5F, texHigh * cosCache[i] + 0.5F);
/*     */               }
/*     */ 
/*     */               
/* 217 */               GL11.glVertex3f(radiusHigh * sinCache[i], radiusHigh * cosCache[i], 0.0F);
/*     */             
/*     */             }
/*     */             else {
/*     */               
/* 222 */               if (this.textureFlag) {
/* 223 */                 GL11.glTexCoord2f(texHigh * sinCache[i] + 0.5F, texHigh * cosCache[i] + 0.5F);
/*     */               }
/*     */ 
/*     */               
/* 227 */               GL11.glVertex3f(radiusHigh * sinCache[i], radiusHigh * cosCache[i], 0.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 232 */               if (this.textureFlag) {
/* 233 */                 GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */               }
/*     */ 
/*     */               
/* 237 */               GL11.glVertex3f(radiusLow * sinCache[i], radiusLow * cosCache[i], 0.0F);
/*     */             } 
/*     */           } 
/* 240 */           GL11.glEnd();
/*     */         } 
/*     */         break;
/*     */       case 100010:
/* 244 */         GL11.glBegin(0);
/* 245 */         for (i = 0; i < slices2; i++) {
/* 246 */           float sintemp = sinCache[i];
/* 247 */           float costemp = cosCache[i];
/* 248 */           for (j = 0; j <= loops; j++) {
/* 249 */             float f = outerRadius - deltaRadius * j / loops;
/*     */             
/* 251 */             if (this.textureFlag) {
/* 252 */               texLow = f / outerRadius / 2.0F;
/*     */               
/* 254 */               GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */             } 
/*     */ 
/*     */             
/* 258 */             GL11.glVertex3f(f * sintemp, f * costemp, 0.0F);
/*     */           } 
/*     */         } 
/* 261 */         GL11.glEnd();
/*     */         break;
/*     */       case 100011:
/* 264 */         if (innerRadius == outerRadius) {
/* 265 */           GL11.glBegin(3);
/*     */           
/* 267 */           for (i = 0; i <= slices; i++) {
/* 268 */             if (this.textureFlag) {
/* 269 */               GL11.glTexCoord2f(sinCache[i] / 2.0F + 0.5F, cosCache[i] / 2.0F + 0.5F);
/*     */             }
/* 271 */             GL11.glVertex3f(innerRadius * sinCache[i], innerRadius * cosCache[i], 0.0F);
/*     */           } 
/* 273 */           GL11.glEnd();
/*     */           break;
/*     */         } 
/* 276 */         for (j = 0; j <= loops; j++) {
/* 277 */           float radiusLow = outerRadius - deltaRadius * j / loops;
/* 278 */           if (this.textureFlag) {
/* 279 */             texLow = radiusLow / outerRadius / 2.0F;
/*     */           }
/*     */           
/* 282 */           GL11.glBegin(3);
/* 283 */           for (i = 0; i <= slices; i++) {
/* 284 */             if (this.textureFlag) {
/* 285 */               GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */             }
/*     */ 
/*     */             
/* 289 */             GL11.glVertex3f(radiusLow * sinCache[i], radiusLow * cosCache[i], 0.0F);
/*     */           } 
/* 291 */           GL11.glEnd();
/*     */         } 
/* 293 */         for (i = 0; i < slices2; i++) {
/* 294 */           float sintemp = sinCache[i];
/* 295 */           float costemp = cosCache[i];
/* 296 */           GL11.glBegin(3);
/* 297 */           for (j = 0; j <= loops; j++) {
/* 298 */             float radiusLow = outerRadius - deltaRadius * j / loops;
/* 299 */             if (this.textureFlag) {
/* 300 */               texLow = radiusLow / outerRadius / 2.0F;
/*     */             }
/*     */             
/* 303 */             if (this.textureFlag) {
/* 304 */               GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */             }
/*     */ 
/*     */             
/* 308 */             GL11.glVertex3f(radiusLow * sintemp, radiusLow * costemp, 0.0F);
/*     */           } 
/* 310 */           GL11.glEnd();
/*     */         } 
/*     */         break;
/*     */       case 100013:
/* 314 */         if (sweepAngle < 360.0F) {
/* 315 */           for (i = 0; i <= slices; i += slices) {
/* 316 */             float f1 = sinCache[i];
/* 317 */             float f2 = cosCache[i];
/* 318 */             GL11.glBegin(3);
/* 319 */             for (j = 0; j <= loops; j++) {
/* 320 */               float radiusLow = outerRadius - deltaRadius * j / loops;
/*     */               
/* 322 */               if (this.textureFlag) {
/* 323 */                 texLow = radiusLow / outerRadius / 2.0F;
/* 324 */                 GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */               } 
/*     */ 
/*     */               
/* 328 */               GL11.glVertex3f(radiusLow * f1, radiusLow * f2, 0.0F);
/*     */             } 
/* 330 */             GL11.glEnd();
/*     */           } 
/*     */         }
/* 333 */         for (j = 0; j <= loops; j += loops) {
/* 334 */           float radiusLow = outerRadius - deltaRadius * j / loops;
/* 335 */           if (this.textureFlag) {
/* 336 */             texLow = radiusLow / outerRadius / 2.0F;
/*     */           }
/*     */           
/* 339 */           GL11.glBegin(3);
/* 340 */           for (i = 0; i <= slices; i++) {
/* 341 */             if (this.textureFlag) {
/* 342 */               GL11.glTexCoord2f(texLow * sinCache[i] + 0.5F, texLow * cosCache[i] + 0.5F);
/*     */             }
/*     */ 
/*     */             
/* 346 */             GL11.glVertex3f(radiusLow * sinCache[i], radiusLow * cosCache[i], 0.0F);
/*     */           } 
/* 348 */           GL11.glEnd();
/* 349 */           if (innerRadius == outerRadius)
/*     */             break; 
/*     */         } 
/*     */         break;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\PartialDisk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */