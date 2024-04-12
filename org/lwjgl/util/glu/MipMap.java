/*     */ package org.lwjgl.util.glu;
/*     */ 
/*     */ import java.nio.ByteBuffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MipMap
/*     */   extends Util
/*     */ {
/*     */   public static int gluBuild2DMipmaps(int target, int components, int width, int height, int format, int type, ByteBuffer data) {
/*     */     ByteBuffer image;
/*  63 */     if (width < 1 || height < 1) return 100901;
/*     */     
/*  65 */     int bpp = bytesPerPixel(format, type);
/*  66 */     if (bpp == 0) {
/*  67 */       return 100900;
/*     */     }
/*  69 */     int maxSize = glGetIntegerv(3379);
/*     */     
/*  71 */     int w = nearestPower(width);
/*  72 */     if (w > maxSize) {
/*  73 */       w = maxSize;
/*     */     }
/*  75 */     int h = nearestPower(height);
/*  76 */     if (h > maxSize) {
/*  77 */       h = maxSize;
/*     */     }
/*     */     
/*  80 */     PixelStoreState pss = new PixelStoreState();
/*     */ 
/*     */     
/*  83 */     GL11.glPixelStorei(3330, 0);
/*  84 */     GL11.glPixelStorei(3333, 1);
/*  85 */     GL11.glPixelStorei(3331, 0);
/*  86 */     GL11.glPixelStorei(3332, 0);
/*     */ 
/*     */     
/*  89 */     int retVal = 0;
/*  90 */     boolean done = false;
/*     */     
/*  92 */     if (w != width || h != height) {
/*     */       
/*  94 */       image = BufferUtils.createByteBuffer((w + 4) * h * bpp);
/*  95 */       int error = gluScaleImage(format, width, height, type, data, w, h, type, image);
/*  96 */       if (error != 0) {
/*  97 */         retVal = error;
/*  98 */         done = true;
/*     */       } 
/*     */ 
/*     */       
/* 102 */       GL11.glPixelStorei(3314, 0);
/* 103 */       GL11.glPixelStorei(3317, 1);
/* 104 */       GL11.glPixelStorei(3315, 0);
/* 105 */       GL11.glPixelStorei(3316, 0);
/*     */     } else {
/* 107 */       image = data;
/*     */     } 
/*     */     
/* 110 */     ByteBuffer bufferA = null;
/* 111 */     ByteBuffer bufferB = null;
/*     */     
/* 113 */     int level = 0;
/* 114 */     while (!done) {
/* 115 */       ByteBuffer newImage; if (image != data) {
/*     */         
/* 117 */         GL11.glPixelStorei(3314, 0);
/* 118 */         GL11.glPixelStorei(3317, 1);
/* 119 */         GL11.glPixelStorei(3315, 0);
/* 120 */         GL11.glPixelStorei(3316, 0);
/*     */       } 
/*     */       
/* 123 */       GL11.glTexImage2D(target, level, components, w, h, 0, format, type, image);
/*     */       
/* 125 */       if (w == 1 && h == 1) {
/*     */         break;
/*     */       }
/* 128 */       int newW = (w < 2) ? 1 : (w >> 1);
/* 129 */       int newH = (h < 2) ? 1 : (h >> 1);
/*     */ 
/*     */ 
/*     */       
/* 133 */       if (bufferA == null) {
/* 134 */         newImage = bufferA = BufferUtils.createByteBuffer((newW + 4) * newH * bpp);
/* 135 */       } else if (bufferB == null) {
/* 136 */         newImage = bufferB = BufferUtils.createByteBuffer((newW + 4) * newH * bpp);
/*     */       } else {
/* 138 */         newImage = bufferB;
/*     */       } 
/* 140 */       int error = gluScaleImage(format, w, h, type, image, newW, newH, type, newImage);
/* 141 */       if (error != 0) {
/* 142 */         retVal = error;
/* 143 */         done = true;
/*     */       } 
/*     */       
/* 146 */       image = newImage;
/* 147 */       if (bufferB != null) {
/* 148 */         bufferB = bufferA;
/*     */       }
/* 150 */       w = newW;
/* 151 */       h = newH;
/* 152 */       level++;
/*     */     } 
/*     */ 
/*     */     
/* 156 */     pss.save();
/*     */     
/* 158 */     return retVal;
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
/*     */   public static int gluScaleImage(int format, int widthIn, int heightIn, int typein, ByteBuffer dataIn, int widthOut, int heightOut, int typeOut, ByteBuffer dataOut) {
/* 178 */     int i, k, sizein, sizeout, rowstride, rowlen, components = compPerPix(format);
/* 179 */     if (components == -1) {
/* 180 */       return 100900;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 189 */     float[] tempIn = new float[widthIn * heightIn * components];
/* 190 */     float[] tempOut = new float[widthOut * heightOut * components];
/*     */ 
/*     */     
/* 193 */     switch (typein) {
/*     */       case 5121:
/* 195 */         sizein = 1;
/*     */         break;
/*     */       case 5126:
/* 198 */         sizein = 4;
/*     */         break;
/*     */       default:
/* 201 */         return 1280;
/*     */     } 
/*     */ 
/*     */     
/* 205 */     switch (typeOut) {
/*     */       case 5121:
/* 207 */         sizeout = 1;
/*     */         break;
/*     */       case 5126:
/* 210 */         sizeout = 4;
/*     */         break;
/*     */       default:
/* 213 */         return 1280;
/*     */     } 
/*     */ 
/*     */     
/* 217 */     PixelStoreState pss = new PixelStoreState();
/*     */ 
/*     */     
/* 220 */     if (pss.unpackRowLength > 0) {
/* 221 */       rowlen = pss.unpackRowLength;
/*     */     } else {
/* 223 */       rowlen = widthIn;
/*     */     } 
/* 225 */     if (sizein >= pss.unpackAlignment) {
/* 226 */       rowstride = components * rowlen;
/*     */     } else {
/* 228 */       rowstride = pss.unpackAlignment / sizein * ceil(components * rowlen * sizein, pss.unpackAlignment);
/*     */     } 
/* 230 */     switch (typein) {
/*     */       case 5121:
/* 232 */         k = 0;
/* 233 */         dataIn.rewind();
/* 234 */         for (i = 0; i < heightIn; i++) {
/* 235 */           int ubptr = i * rowstride + pss.unpackSkipRows * rowstride + pss.unpackSkipPixels * components;
/* 236 */           for (int j = 0; j < widthIn * components; j++) {
/* 237 */             tempIn[k++] = (dataIn.get(ubptr++) & 0xFF);
/*     */           }
/*     */         } 
/*     */         break;
/*     */       case 5126:
/* 242 */         k = 0;
/* 243 */         dataIn.rewind();
/* 244 */         for (i = 0; i < heightIn; i++) {
/*     */           
/* 246 */           int fptr = 4 * (i * rowstride + pss.unpackSkipRows * rowstride + pss.unpackSkipPixels * components);
/* 247 */           for (byte b = 0; b < widthIn * components; b++) {
/*     */             
/* 249 */             tempIn[k++] = dataIn.getFloat(fptr);
/* 250 */             fptr += 4;
/*     */           } 
/*     */         } 
/*     */         break;
/*     */       default:
/* 255 */         return 100900;
/*     */     } 
/*     */ 
/*     */     
/* 259 */     float sx = widthIn / widthOut;
/* 260 */     float sy = heightIn / heightOut;
/*     */     
/* 262 */     float[] c = new float[components];
/*     */ 
/*     */     
/* 265 */     for (int iy = 0; iy < heightOut; iy++) {
/* 266 */       for (int ix = 0; ix < widthOut; ix++) {
/* 267 */         int x0 = (int)(ix * sx);
/* 268 */         int x1 = (int)((ix + 1) * sx);
/* 269 */         int y0 = (int)(iy * sy);
/* 270 */         int y1 = (int)((iy + 1) * sy);
/*     */         
/* 272 */         int readPix = 0;
/*     */ 
/*     */         
/* 275 */         for (int ic = 0; ic < components; ic++) {
/* 276 */           c[ic] = 0.0F;
/*     */         }
/*     */ 
/*     */         
/* 280 */         for (int ix0 = x0; ix0 < x1; ix0++) {
/* 281 */           for (int iy0 = y0; iy0 < y1; iy0++) {
/*     */             
/* 283 */             int src = (iy0 * widthIn + ix0) * components;
/*     */             
/* 285 */             for (int j = 0; j < components; j++) {
/* 286 */               c[j] = c[j] + tempIn[src + j];
/*     */             }
/*     */             
/* 289 */             readPix++;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 294 */         int dst = (iy * widthOut + ix) * components;
/*     */         
/* 296 */         if (readPix == 0) {
/*     */           
/* 298 */           int src = (y0 * widthIn + x0) * components;
/* 299 */           for (int j = 0; j < components; j++) {
/* 300 */             tempOut[dst++] = tempIn[src + j];
/*     */           }
/*     */         } else {
/*     */           
/* 304 */           for (k = 0; k < components; k++) {
/* 305 */             tempOut[dst++] = c[k] / readPix;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 313 */     if (pss.packRowLength > 0) {
/* 314 */       rowlen = pss.packRowLength;
/*     */     } else {
/* 316 */       rowlen = widthOut;
/*     */     } 
/* 318 */     if (sizeout >= pss.packAlignment) {
/* 319 */       rowstride = components * rowlen;
/*     */     } else {
/* 321 */       rowstride = pss.packAlignment / sizeout * ceil(components * rowlen * sizeout, pss.packAlignment);
/*     */     } 
/* 323 */     switch (typeOut) {
/*     */       case 5121:
/* 325 */         k = 0;
/* 326 */         for (i = 0; i < heightOut; i++) {
/* 327 */           int ubptr = i * rowstride + pss.packSkipRows * rowstride + pss.packSkipPixels * components;
/*     */           
/* 329 */           for (byte b = 0; b < widthOut * components; b++) {
/* 330 */             dataOut.put(ubptr++, (byte)(int)tempOut[k++]);
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 349 */         return 0;case 5126: k = 0; for (i = 0; i < heightOut; i++) { int fptr = 4 * (i * rowstride + pss.unpackSkipRows * rowstride + pss.unpackSkipPixels * components); for (byte b = 0; b < widthOut * components; b++) { dataOut.putFloat(fptr, tempOut[k++]); fptr += 4; }  }  return 0;
/*     */     } 
/*     */     return 100900;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\MipMap.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */