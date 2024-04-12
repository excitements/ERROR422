/*     */ package org.lwjgl.util.glu;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
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
/*     */ public class Util
/*     */ {
/*  53 */   private static IntBuffer scratch = BufferUtils.createIntBuffer(16);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static int ceil(int a, int b) {
/*  64 */     return (a % b == 0) ? (a / b) : (a / b + 1);
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
/*     */   protected static float[] normalize(float[] v) {
/*  77 */     float r = (float)Math.sqrt((v[0] * v[0] + v[1] * v[1] + v[2] * v[2]));
/*  78 */     if (r == 0.0D) {
/*  79 */       return v;
/*     */     }
/*  81 */     r = 1.0F / r;
/*     */     
/*  83 */     v[0] = v[0] * r;
/*  84 */     v[1] = v[1] * r;
/*  85 */     v[2] = v[2] * r;
/*     */     
/*  87 */     return v;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void cross(float[] v1, float[] v2, float[] result) {
/*  98 */     result[0] = v1[1] * v2[2] - v1[2] * v2[1];
/*  99 */     result[1] = v1[2] * v2[0] - v1[0] * v2[2];
/* 100 */     result[2] = v1[0] * v2[1] - v1[1] * v2[0];
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
/*     */   protected static int compPerPix(int format) {
/* 112 */     switch (format) {
/*     */       case 6400:
/*     */       case 6401:
/*     */       case 6402:
/*     */       case 6403:
/*     */       case 6404:
/*     */       case 6405:
/*     */       case 6406:
/*     */       case 6409:
/* 121 */         return 1;
/*     */       case 6410:
/* 123 */         return 2;
/*     */       case 6407:
/*     */       case 32992:
/* 126 */         return 3;
/*     */       case 6408:
/*     */       case 32993:
/* 129 */         return 4;
/*     */     } 
/* 131 */     return -1;
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
/*     */   protected static int nearestPower(int value) {
/* 147 */     int i = 1;
/*     */ 
/*     */     
/* 150 */     if (value == 0) {
/* 151 */       return -1;
/*     */     }
/*     */     while (true) {
/* 154 */       if (value == 1)
/* 155 */         return i; 
/* 156 */       if (value == 3) {
/* 157 */         return i << 2;
/*     */       }
/* 159 */       value >>= 1;
/* 160 */       i <<= 1;
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
/*     */   protected static int bytesPerPixel(int format, int type) {
/*     */     int n;
/* 175 */     switch (format) {
/*     */       case 6400:
/*     */       case 6401:
/*     */       case 6402:
/*     */       case 6403:
/*     */       case 6404:
/*     */       case 6405:
/*     */       case 6406:
/*     */       case 6409:
/* 184 */         n = 1;
/*     */         break;
/*     */       case 6410:
/* 187 */         n = 2;
/*     */         break;
/*     */       case 6407:
/*     */       case 32992:
/* 191 */         n = 3;
/*     */         break;
/*     */       case 6408:
/*     */       case 32993:
/* 195 */         n = 4;
/*     */         break;
/*     */       default:
/* 198 */         n = 0;
/*     */         break;
/*     */     } 
/* 201 */     switch (type)
/*     */     { case 5121:
/* 203 */         m = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 230 */         return n * m;case 5120: m = 1; return n * m;case 6656: m = 1; return n * m;case 5123: m = 2; return n * m;case 5122: m = 2; return n * m;case 5125: m = 4; return n * m;case 5124: m = 4; return n * m;case 5126: m = 4; return n * m; }  int m = 0; return n * m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static int glGetIntegerv(int what) {
/* 241 */     scratch.rewind();
/* 242 */     GL11.glGetInteger(what, scratch);
/* 243 */     return scratch.get();
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\Util.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */