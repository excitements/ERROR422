/*     */ package org.lwjgl.util.glu;
/*     */ 
/*     */ import java.nio.FloatBuffer;
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
/*     */ public class Project
/*     */   extends Util
/*     */ {
/*  50 */   private static final float[] IDENTITY_MATRIX = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  57 */   private static final FloatBuffer matrix = BufferUtils.createFloatBuffer(16);
/*  58 */   private static final FloatBuffer finalMatrix = BufferUtils.createFloatBuffer(16);
/*     */   
/*  60 */   private static final FloatBuffer tempMatrix = BufferUtils.createFloatBuffer(16);
/*  61 */   private static final float[] in = new float[4];
/*  62 */   private static final float[] out = new float[4];
/*     */   
/*  64 */   private static final float[] forward = new float[3];
/*  65 */   private static final float[] side = new float[3];
/*  66 */   private static final float[] up = new float[3];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void __gluMakeIdentityf(FloatBuffer m) {
/*  72 */     int oldPos = m.position();
/*  73 */     m.put(IDENTITY_MATRIX);
/*  74 */     m.position(oldPos);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void __gluMultMatrixVecf(FloatBuffer m, float[] in, float[] out) {
/*  85 */     for (int i = 0; i < 4; i++) {
/*  86 */       out[i] = in[0] * m.get(m.position() + 0 + i) + in[1] * m.get(m.position() + 4 + i) + in[2] * m.get(m.position() + 8 + i) + in[3] * m.get(m.position() + 12 + i);
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
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean __gluInvertMatrixf(FloatBuffer src, FloatBuffer inverse) {
/* 104 */     FloatBuffer temp = tempMatrix;
/*     */     
/*     */     int i;
/* 107 */     for (i = 0; i < 16; i++) {
/* 108 */       temp.put(i, src.get(i + src.position()));
/*     */     }
/* 110 */     __gluMakeIdentityf(inverse);
/*     */     
/* 112 */     for (i = 0; i < 4; i++) {
/*     */ 
/*     */ 
/*     */       
/* 116 */       int swap = i; int j;
/* 117 */       for (j = i + 1; j < 4; j++) {
/*     */ 
/*     */ 
/*     */         
/* 121 */         if (Math.abs(temp.get(j * 4 + i)) > Math.abs(temp.get(i * 4 + i))) {
/* 122 */           swap = j;
/*     */         }
/*     */       } 
/*     */       
/* 126 */       if (swap != i)
/*     */       {
/*     */ 
/*     */         
/* 130 */         for (int m = 0; m < 4; m++) {
/* 131 */           float f = temp.get(i * 4 + m);
/* 132 */           temp.put(i * 4 + m, temp.get(swap * 4 + m));
/* 133 */           temp.put(swap * 4 + m, f);
/*     */           
/* 135 */           f = inverse.get(i * 4 + m);
/* 136 */           inverse.put(i * 4 + m, inverse.get(swap * 4 + m));
/*     */           
/* 138 */           inverse.put(swap * 4 + m, f);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 143 */       if (temp.get(i * 4 + i) == 0.0F)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 148 */         return false;
/*     */       }
/*     */       
/* 151 */       float t = temp.get(i * 4 + i); int k;
/* 152 */       for (k = 0; k < 4; k++) {
/* 153 */         temp.put(i * 4 + k, temp.get(i * 4 + k) / t);
/* 154 */         inverse.put(i * 4 + k, inverse.get(i * 4 + k) / t);
/*     */       } 
/* 156 */       for (j = 0; j < 4; j++) {
/* 157 */         if (j != i) {
/* 158 */           t = temp.get(j * 4 + i);
/* 159 */           for (k = 0; k < 4; k++) {
/* 160 */             temp.put(j * 4 + k, temp.get(j * 4 + k) - temp.get(i * 4 + k) * t);
/* 161 */             inverse.put(j * 4 + k, inverse.get(j * 4 + k) - inverse.get(i * 4 + k) * t);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 169 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void __gluMultMatricesf(FloatBuffer a, FloatBuffer b, FloatBuffer r) {
/* 178 */     for (int i = 0; i < 4; i++) {
/* 179 */       for (int j = 0; j < 4; j++) {
/* 180 */         r.put(r.position() + i * 4 + j, a.get(a.position() + i * 4 + 0) * b.get(b.position() + 0 + j) + a.get(a.position() + i * 4 + 1) * b.get(b.position() + 4 + j) + a.get(a.position() + i * 4 + 2) * b.get(b.position() + 8 + j) + a.get(a.position() + i * 4 + 3) * b.get(b.position() + 12 + j));
/*     */       }
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
/*     */   public static void gluPerspective(float fovy, float aspect, float zNear, float zFar) {
/* 196 */     float radians = fovy / 2.0F * 3.1415927F / 180.0F;
/*     */     
/* 198 */     float deltaZ = zFar - zNear;
/* 199 */     float sine = (float)Math.sin(radians);
/*     */     
/* 201 */     if (deltaZ == 0.0F || sine == 0.0F || aspect == 0.0F) {
/*     */       return;
/*     */     }
/*     */     
/* 205 */     float cotangent = (float)Math.cos(radians) / sine;
/*     */     
/* 207 */     __gluMakeIdentityf(matrix);
/*     */     
/* 209 */     matrix.put(0, cotangent / aspect);
/* 210 */     matrix.put(5, cotangent);
/* 211 */     matrix.put(10, -(zFar + zNear) / deltaZ);
/* 212 */     matrix.put(11, -1.0F);
/* 213 */     matrix.put(14, -2.0F * zNear * zFar / deltaZ);
/* 214 */     matrix.put(15, 0.0F);
/*     */     
/* 216 */     GL11.glMultMatrix(matrix);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void gluLookAt(float eyex, float eyey, float eyez, float centerx, float centery, float centerz, float upx, float upy, float upz) {
/* 242 */     float[] forward = Project.forward;
/* 243 */     float[] side = Project.side;
/* 244 */     float[] up = Project.up;
/*     */     
/* 246 */     forward[0] = centerx - eyex;
/* 247 */     forward[1] = centery - eyey;
/* 248 */     forward[2] = centerz - eyez;
/*     */     
/* 250 */     up[0] = upx;
/* 251 */     up[1] = upy;
/* 252 */     up[2] = upz;
/*     */     
/* 254 */     normalize(forward);
/*     */ 
/*     */     
/* 257 */     cross(forward, up, side);
/* 258 */     normalize(side);
/*     */ 
/*     */     
/* 261 */     cross(side, forward, up);
/*     */     
/* 263 */     __gluMakeIdentityf(matrix);
/* 264 */     matrix.put(0, side[0]);
/* 265 */     matrix.put(4, side[1]);
/* 266 */     matrix.put(8, side[2]);
/*     */     
/* 268 */     matrix.put(1, up[0]);
/* 269 */     matrix.put(5, up[1]);
/* 270 */     matrix.put(9, up[2]);
/*     */     
/* 272 */     matrix.put(2, -forward[0]);
/* 273 */     matrix.put(6, -forward[1]);
/* 274 */     matrix.put(10, -forward[2]);
/*     */     
/* 276 */     GL11.glMultMatrix(matrix);
/* 277 */     GL11.glTranslatef(-eyex, -eyey, -eyez);
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
/*     */   
/*     */   public static boolean gluProject(float objx, float objy, float objz, FloatBuffer modelMatrix, FloatBuffer projMatrix, IntBuffer viewport, FloatBuffer win_pos) {
/* 300 */     float[] in = Project.in;
/* 301 */     float[] out = Project.out;
/*     */     
/* 303 */     in[0] = objx;
/* 304 */     in[1] = objy;
/* 305 */     in[2] = objz;
/* 306 */     in[3] = 1.0F;
/*     */     
/* 308 */     __gluMultMatrixVecf(modelMatrix, in, out);
/* 309 */     __gluMultMatrixVecf(projMatrix, out, in);
/*     */     
/* 311 */     if (in[3] == 0.0D) {
/* 312 */       return false;
/*     */     }
/* 314 */     in[3] = 1.0F / in[3] * 0.5F;
/*     */ 
/*     */     
/* 317 */     in[0] = in[0] * in[3] + 0.5F;
/* 318 */     in[1] = in[1] * in[3] + 0.5F;
/* 319 */     in[2] = in[2] * in[3] + 0.5F;
/*     */ 
/*     */     
/* 322 */     win_pos.put(0, in[0] * viewport.get(viewport.position() + 2) + viewport.get(viewport.position() + 0));
/* 323 */     win_pos.put(1, in[1] * viewport.get(viewport.position() + 3) + viewport.get(viewport.position() + 1));
/* 324 */     win_pos.put(2, in[2]);
/*     */     
/* 326 */     return true;
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
/*     */   public static boolean gluUnProject(float winx, float winy, float winz, FloatBuffer modelMatrix, FloatBuffer projMatrix, IntBuffer viewport, FloatBuffer obj_pos) {
/* 348 */     float[] in = Project.in;
/* 349 */     float[] out = Project.out;
/*     */     
/* 351 */     __gluMultMatricesf(modelMatrix, projMatrix, finalMatrix);
/*     */     
/* 353 */     if (!__gluInvertMatrixf(finalMatrix, finalMatrix)) {
/* 354 */       return false;
/*     */     }
/* 356 */     in[0] = winx;
/* 357 */     in[1] = winy;
/* 358 */     in[2] = winz;
/* 359 */     in[3] = 1.0F;
/*     */ 
/*     */     
/* 362 */     in[0] = (in[0] - viewport.get(viewport.position() + 0)) / viewport.get(viewport.position() + 2);
/* 363 */     in[1] = (in[1] - viewport.get(viewport.position() + 1)) / viewport.get(viewport.position() + 3);
/*     */ 
/*     */     
/* 366 */     in[0] = in[0] * 2.0F - 1.0F;
/* 367 */     in[1] = in[1] * 2.0F - 1.0F;
/* 368 */     in[2] = in[2] * 2.0F - 1.0F;
/*     */     
/* 370 */     __gluMultMatrixVecf(finalMatrix, in, out);
/*     */     
/* 372 */     if (out[3] == 0.0D) {
/* 373 */       return false;
/*     */     }
/* 375 */     out[3] = 1.0F / out[3];
/*     */     
/* 377 */     obj_pos.put(obj_pos.position() + 0, out[0] * out[3]);
/* 378 */     obj_pos.put(obj_pos.position() + 1, out[1] * out[3]);
/* 379 */     obj_pos.put(obj_pos.position() + 2, out[2] * out[3]);
/*     */     
/* 381 */     return true;
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
/*     */   public static void gluPickMatrix(float x, float y, float deltaX, float deltaY, IntBuffer viewport) {
/* 399 */     if (deltaX <= 0.0F || deltaY <= 0.0F) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 404 */     GL11.glTranslatef((viewport.get(viewport.position() + 2) - 2.0F * (x - viewport.get(viewport.position() + 0))) / deltaX, (viewport.get(viewport.position() + 3) - 2.0F * (y - viewport.get(viewport.position() + 1))) / deltaY, 0.0F);
/*     */ 
/*     */ 
/*     */     
/* 408 */     GL11.glScalef(viewport.get(viewport.position() + 2) / deltaX, viewport.get(viewport.position() + 3) / deltaY, 1.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\Project.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */