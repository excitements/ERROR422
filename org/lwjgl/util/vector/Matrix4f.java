/*     */ package org.lwjgl.util.vector;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.nio.FloatBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Matrix4f
/*     */   extends Matrix
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   public float m00;
/*     */   public float m01;
/*     */   public float m02;
/*     */   public float m03;
/*     */   public float m10;
/*     */   public float m11;
/*     */   public float m12;
/*     */   public float m13;
/*     */   public float m20;
/*     */   public float m21;
/*     */   public float m22;
/*     */   public float m23;
/*     */   public float m30;
/*     */   public float m31;
/*     */   public float m32;
/*     */   public float m33;
/*     */   
/*     */   public Matrix4f() {
/*  52 */     setIdentity();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  59 */     StringBuffer buf = new StringBuffer();
/*  60 */     buf.append(this.m00).append(' ').append(this.m10).append(' ').append(this.m20).append(' ').append(this.m30).append('\n');
/*  61 */     buf.append(this.m01).append(' ').append(this.m11).append(' ').append(this.m21).append(' ').append(this.m31).append('\n');
/*  62 */     buf.append(this.m02).append(' ').append(this.m12).append(' ').append(this.m22).append(' ').append(this.m32).append('\n');
/*  63 */     buf.append(this.m03).append(' ').append(this.m13).append(' ').append(this.m23).append(' ').append(this.m33).append('\n');
/*  64 */     return buf.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix setIdentity() {
/*  72 */     return setIdentity(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f setIdentity(Matrix4f m) {
/*  81 */     m.m00 = 1.0F;
/*  82 */     m.m01 = 0.0F;
/*  83 */     m.m02 = 0.0F;
/*  84 */     m.m03 = 0.0F;
/*  85 */     m.m10 = 0.0F;
/*  86 */     m.m11 = 1.0F;
/*  87 */     m.m12 = 0.0F;
/*  88 */     m.m13 = 0.0F;
/*  89 */     m.m20 = 0.0F;
/*  90 */     m.m21 = 0.0F;
/*  91 */     m.m22 = 1.0F;
/*  92 */     m.m23 = 0.0F;
/*  93 */     m.m30 = 0.0F;
/*  94 */     m.m31 = 0.0F;
/*  95 */     m.m32 = 0.0F;
/*  96 */     m.m33 = 1.0F;
/*     */     
/*  98 */     return m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix setZero() {
/* 106 */     return setZero(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f setZero(Matrix4f m) {
/* 115 */     m.m00 = 0.0F;
/* 116 */     m.m01 = 0.0F;
/* 117 */     m.m02 = 0.0F;
/* 118 */     m.m03 = 0.0F;
/* 119 */     m.m10 = 0.0F;
/* 120 */     m.m11 = 0.0F;
/* 121 */     m.m12 = 0.0F;
/* 122 */     m.m13 = 0.0F;
/* 123 */     m.m20 = 0.0F;
/* 124 */     m.m21 = 0.0F;
/* 125 */     m.m22 = 0.0F;
/* 126 */     m.m23 = 0.0F;
/* 127 */     m.m30 = 0.0F;
/* 128 */     m.m31 = 0.0F;
/* 129 */     m.m32 = 0.0F;
/* 130 */     m.m33 = 0.0F;
/*     */     
/* 132 */     return m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f load(Matrix4f src) {
/* 141 */     return load(src, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f load(Matrix4f src, Matrix4f dest) {
/* 151 */     if (dest == null)
/* 152 */       dest = new Matrix4f(); 
/* 153 */     dest.m00 = src.m00;
/* 154 */     dest.m01 = src.m01;
/* 155 */     dest.m02 = src.m02;
/* 156 */     dest.m03 = src.m03;
/* 157 */     dest.m10 = src.m10;
/* 158 */     dest.m11 = src.m11;
/* 159 */     dest.m12 = src.m12;
/* 160 */     dest.m13 = src.m13;
/* 161 */     dest.m20 = src.m20;
/* 162 */     dest.m21 = src.m21;
/* 163 */     dest.m22 = src.m22;
/* 164 */     dest.m23 = src.m23;
/* 165 */     dest.m30 = src.m30;
/* 166 */     dest.m31 = src.m31;
/* 167 */     dest.m32 = src.m32;
/* 168 */     dest.m33 = src.m33;
/*     */     
/* 170 */     return dest;
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
/*     */   public Matrix load(FloatBuffer buf) {
/* 182 */     this.m00 = buf.get();
/* 183 */     this.m01 = buf.get();
/* 184 */     this.m02 = buf.get();
/* 185 */     this.m03 = buf.get();
/* 186 */     this.m10 = buf.get();
/* 187 */     this.m11 = buf.get();
/* 188 */     this.m12 = buf.get();
/* 189 */     this.m13 = buf.get();
/* 190 */     this.m20 = buf.get();
/* 191 */     this.m21 = buf.get();
/* 192 */     this.m22 = buf.get();
/* 193 */     this.m23 = buf.get();
/* 194 */     this.m30 = buf.get();
/* 195 */     this.m31 = buf.get();
/* 196 */     this.m32 = buf.get();
/* 197 */     this.m33 = buf.get();
/*     */     
/* 199 */     return this;
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
/*     */   public Matrix loadTranspose(FloatBuffer buf) {
/* 211 */     this.m00 = buf.get();
/* 212 */     this.m10 = buf.get();
/* 213 */     this.m20 = buf.get();
/* 214 */     this.m30 = buf.get();
/* 215 */     this.m01 = buf.get();
/* 216 */     this.m11 = buf.get();
/* 217 */     this.m21 = buf.get();
/* 218 */     this.m31 = buf.get();
/* 219 */     this.m02 = buf.get();
/* 220 */     this.m12 = buf.get();
/* 221 */     this.m22 = buf.get();
/* 222 */     this.m32 = buf.get();
/* 223 */     this.m03 = buf.get();
/* 224 */     this.m13 = buf.get();
/* 225 */     this.m23 = buf.get();
/* 226 */     this.m33 = buf.get();
/*     */     
/* 228 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix store(FloatBuffer buf) {
/* 237 */     buf.put(this.m00);
/* 238 */     buf.put(this.m01);
/* 239 */     buf.put(this.m02);
/* 240 */     buf.put(this.m03);
/* 241 */     buf.put(this.m10);
/* 242 */     buf.put(this.m11);
/* 243 */     buf.put(this.m12);
/* 244 */     buf.put(this.m13);
/* 245 */     buf.put(this.m20);
/* 246 */     buf.put(this.m21);
/* 247 */     buf.put(this.m22);
/* 248 */     buf.put(this.m23);
/* 249 */     buf.put(this.m30);
/* 250 */     buf.put(this.m31);
/* 251 */     buf.put(this.m32);
/* 252 */     buf.put(this.m33);
/* 253 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix storeTranspose(FloatBuffer buf) {
/* 262 */     buf.put(this.m00);
/* 263 */     buf.put(this.m10);
/* 264 */     buf.put(this.m20);
/* 265 */     buf.put(this.m30);
/* 266 */     buf.put(this.m01);
/* 267 */     buf.put(this.m11);
/* 268 */     buf.put(this.m21);
/* 269 */     buf.put(this.m31);
/* 270 */     buf.put(this.m02);
/* 271 */     buf.put(this.m12);
/* 272 */     buf.put(this.m22);
/* 273 */     buf.put(this.m32);
/* 274 */     buf.put(this.m03);
/* 275 */     buf.put(this.m13);
/* 276 */     buf.put(this.m23);
/* 277 */     buf.put(this.m33);
/* 278 */     return this;
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
/*     */   public static Matrix4f add(Matrix4f left, Matrix4f right, Matrix4f dest) {
/* 290 */     if (dest == null) {
/* 291 */       dest = new Matrix4f();
/*     */     }
/* 293 */     left.m00 += right.m00;
/* 294 */     left.m01 += right.m01;
/* 295 */     left.m02 += right.m02;
/* 296 */     left.m03 += right.m03;
/* 297 */     left.m10 += right.m10;
/* 298 */     left.m11 += right.m11;
/* 299 */     left.m12 += right.m12;
/* 300 */     left.m13 += right.m13;
/* 301 */     left.m20 += right.m20;
/* 302 */     left.m21 += right.m21;
/* 303 */     left.m22 += right.m22;
/* 304 */     left.m23 += right.m23;
/* 305 */     left.m30 += right.m30;
/* 306 */     left.m31 += right.m31;
/* 307 */     left.m32 += right.m32;
/* 308 */     left.m33 += right.m33;
/*     */     
/* 310 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f sub(Matrix4f left, Matrix4f right, Matrix4f dest) {
/* 321 */     if (dest == null) {
/* 322 */       dest = new Matrix4f();
/*     */     }
/* 324 */     left.m00 -= right.m00;
/* 325 */     left.m01 -= right.m01;
/* 326 */     left.m02 -= right.m02;
/* 327 */     left.m03 -= right.m03;
/* 328 */     left.m10 -= right.m10;
/* 329 */     left.m11 -= right.m11;
/* 330 */     left.m12 -= right.m12;
/* 331 */     left.m13 -= right.m13;
/* 332 */     left.m20 -= right.m20;
/* 333 */     left.m21 -= right.m21;
/* 334 */     left.m22 -= right.m22;
/* 335 */     left.m23 -= right.m23;
/* 336 */     left.m30 -= right.m30;
/* 337 */     left.m31 -= right.m31;
/* 338 */     left.m32 -= right.m32;
/* 339 */     left.m33 -= right.m33;
/*     */     
/* 341 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f mul(Matrix4f left, Matrix4f right, Matrix4f dest) {
/* 352 */     if (dest == null) {
/* 353 */       dest = new Matrix4f();
/*     */     }
/* 355 */     float m00 = left.m00 * right.m00 + left.m10 * right.m01 + left.m20 * right.m02 + left.m30 * right.m03;
/* 356 */     float m01 = left.m01 * right.m00 + left.m11 * right.m01 + left.m21 * right.m02 + left.m31 * right.m03;
/* 357 */     float m02 = left.m02 * right.m00 + left.m12 * right.m01 + left.m22 * right.m02 + left.m32 * right.m03;
/* 358 */     float m03 = left.m03 * right.m00 + left.m13 * right.m01 + left.m23 * right.m02 + left.m33 * right.m03;
/* 359 */     float m10 = left.m00 * right.m10 + left.m10 * right.m11 + left.m20 * right.m12 + left.m30 * right.m13;
/* 360 */     float m11 = left.m01 * right.m10 + left.m11 * right.m11 + left.m21 * right.m12 + left.m31 * right.m13;
/* 361 */     float m12 = left.m02 * right.m10 + left.m12 * right.m11 + left.m22 * right.m12 + left.m32 * right.m13;
/* 362 */     float m13 = left.m03 * right.m10 + left.m13 * right.m11 + left.m23 * right.m12 + left.m33 * right.m13;
/* 363 */     float m20 = left.m00 * right.m20 + left.m10 * right.m21 + left.m20 * right.m22 + left.m30 * right.m23;
/* 364 */     float m21 = left.m01 * right.m20 + left.m11 * right.m21 + left.m21 * right.m22 + left.m31 * right.m23;
/* 365 */     float m22 = left.m02 * right.m20 + left.m12 * right.m21 + left.m22 * right.m22 + left.m32 * right.m23;
/* 366 */     float m23 = left.m03 * right.m20 + left.m13 * right.m21 + left.m23 * right.m22 + left.m33 * right.m23;
/* 367 */     float m30 = left.m00 * right.m30 + left.m10 * right.m31 + left.m20 * right.m32 + left.m30 * right.m33;
/* 368 */     float m31 = left.m01 * right.m30 + left.m11 * right.m31 + left.m21 * right.m32 + left.m31 * right.m33;
/* 369 */     float m32 = left.m02 * right.m30 + left.m12 * right.m31 + left.m22 * right.m32 + left.m32 * right.m33;
/* 370 */     float m33 = left.m03 * right.m30 + left.m13 * right.m31 + left.m23 * right.m32 + left.m33 * right.m33;
/*     */     
/* 372 */     dest.m00 = m00;
/* 373 */     dest.m01 = m01;
/* 374 */     dest.m02 = m02;
/* 375 */     dest.m03 = m03;
/* 376 */     dest.m10 = m10;
/* 377 */     dest.m11 = m11;
/* 378 */     dest.m12 = m12;
/* 379 */     dest.m13 = m13;
/* 380 */     dest.m20 = m20;
/* 381 */     dest.m21 = m21;
/* 382 */     dest.m22 = m22;
/* 383 */     dest.m23 = m23;
/* 384 */     dest.m30 = m30;
/* 385 */     dest.m31 = m31;
/* 386 */     dest.m32 = m32;
/* 387 */     dest.m33 = m33;
/*     */     
/* 389 */     return dest;
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
/*     */   public static Vector4f transform(Matrix4f left, Vector4f right, Vector4f dest) {
/* 401 */     if (dest == null) {
/* 402 */       dest = new Vector4f();
/*     */     }
/* 404 */     float x = left.m00 * right.x + left.m10 * right.y + left.m20 * right.z + left.m30 * right.w;
/* 405 */     float y = left.m01 * right.x + left.m11 * right.y + left.m21 * right.z + left.m31 * right.w;
/* 406 */     float z = left.m02 * right.x + left.m12 * right.y + left.m22 * right.z + left.m32 * right.w;
/* 407 */     float w = left.m03 * right.x + left.m13 * right.y + left.m23 * right.z + left.m33 * right.w;
/*     */     
/* 409 */     dest.x = x;
/* 410 */     dest.y = y;
/* 411 */     dest.z = z;
/* 412 */     dest.w = w;
/*     */     
/* 414 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix transpose() {
/* 422 */     return transpose(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f translate(Vector2f vec) {
/* 431 */     return translate(vec, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f translate(Vector3f vec) {
/* 440 */     return translate(vec, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f scale(Vector3f vec) {
/* 449 */     return scale(vec, this, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f scale(Vector3f vec, Matrix4f src, Matrix4f dest) {
/* 460 */     if (dest == null)
/* 461 */       dest = new Matrix4f(); 
/* 462 */     src.m00 *= vec.x;
/* 463 */     src.m01 *= vec.x;
/* 464 */     src.m02 *= vec.x;
/* 465 */     src.m03 *= vec.x;
/* 466 */     src.m10 *= vec.y;
/* 467 */     src.m11 *= vec.y;
/* 468 */     src.m12 *= vec.y;
/* 469 */     src.m13 *= vec.y;
/* 470 */     src.m20 *= vec.z;
/* 471 */     src.m21 *= vec.z;
/* 472 */     src.m22 *= vec.z;
/* 473 */     src.m23 *= vec.z;
/* 474 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f rotate(float angle, Vector3f axis) {
/* 484 */     return rotate(angle, axis, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f rotate(float angle, Vector3f axis, Matrix4f dest) {
/* 495 */     return rotate(angle, axis, this, dest);
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
/*     */   public static Matrix4f rotate(float angle, Vector3f axis, Matrix4f src, Matrix4f dest) {
/* 508 */     if (dest == null)
/* 509 */       dest = new Matrix4f(); 
/* 510 */     float c = (float)Math.cos(angle);
/* 511 */     float s = (float)Math.sin(angle);
/* 512 */     float oneminusc = 1.0F - c;
/* 513 */     float xy = axis.x * axis.y;
/* 514 */     float yz = axis.y * axis.z;
/* 515 */     float xz = axis.x * axis.z;
/* 516 */     float xs = axis.x * s;
/* 517 */     float ys = axis.y * s;
/* 518 */     float zs = axis.z * s;
/*     */     
/* 520 */     float f00 = axis.x * axis.x * oneminusc + c;
/* 521 */     float f01 = xy * oneminusc + zs;
/* 522 */     float f02 = xz * oneminusc - ys;
/*     */     
/* 524 */     float f10 = xy * oneminusc - zs;
/* 525 */     float f11 = axis.y * axis.y * oneminusc + c;
/* 526 */     float f12 = yz * oneminusc + xs;
/*     */     
/* 528 */     float f20 = xz * oneminusc + ys;
/* 529 */     float f21 = yz * oneminusc - xs;
/* 530 */     float f22 = axis.z * axis.z * oneminusc + c;
/*     */     
/* 532 */     float t00 = src.m00 * f00 + src.m10 * f01 + src.m20 * f02;
/* 533 */     float t01 = src.m01 * f00 + src.m11 * f01 + src.m21 * f02;
/* 534 */     float t02 = src.m02 * f00 + src.m12 * f01 + src.m22 * f02;
/* 535 */     float t03 = src.m03 * f00 + src.m13 * f01 + src.m23 * f02;
/* 536 */     float t10 = src.m00 * f10 + src.m10 * f11 + src.m20 * f12;
/* 537 */     float t11 = src.m01 * f10 + src.m11 * f11 + src.m21 * f12;
/* 538 */     float t12 = src.m02 * f10 + src.m12 * f11 + src.m22 * f12;
/* 539 */     float t13 = src.m03 * f10 + src.m13 * f11 + src.m23 * f12;
/* 540 */     dest.m20 = src.m00 * f20 + src.m10 * f21 + src.m20 * f22;
/* 541 */     dest.m21 = src.m01 * f20 + src.m11 * f21 + src.m21 * f22;
/* 542 */     dest.m22 = src.m02 * f20 + src.m12 * f21 + src.m22 * f22;
/* 543 */     dest.m23 = src.m03 * f20 + src.m13 * f21 + src.m23 * f22;
/* 544 */     dest.m00 = t00;
/* 545 */     dest.m01 = t01;
/* 546 */     dest.m02 = t02;
/* 547 */     dest.m03 = t03;
/* 548 */     dest.m10 = t10;
/* 549 */     dest.m11 = t11;
/* 550 */     dest.m12 = t12;
/* 551 */     dest.m13 = t13;
/* 552 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f translate(Vector3f vec, Matrix4f dest) {
/* 562 */     return translate(vec, this, dest);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f translate(Vector3f vec, Matrix4f src, Matrix4f dest) {
/* 573 */     if (dest == null) {
/* 574 */       dest = new Matrix4f();
/*     */     }
/* 576 */     dest.m30 += src.m00 * vec.x + src.m10 * vec.y + src.m20 * vec.z;
/* 577 */     dest.m31 += src.m01 * vec.x + src.m11 * vec.y + src.m21 * vec.z;
/* 578 */     dest.m32 += src.m02 * vec.x + src.m12 * vec.y + src.m22 * vec.z;
/* 579 */     dest.m33 += src.m03 * vec.x + src.m13 * vec.y + src.m23 * vec.z;
/*     */     
/* 581 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f translate(Vector2f vec, Matrix4f dest) {
/* 591 */     return translate(vec, this, dest);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f translate(Vector2f vec, Matrix4f src, Matrix4f dest) {
/* 602 */     if (dest == null) {
/* 603 */       dest = new Matrix4f();
/*     */     }
/* 605 */     dest.m30 += src.m00 * vec.x + src.m10 * vec.y;
/* 606 */     dest.m31 += src.m01 * vec.x + src.m11 * vec.y;
/* 607 */     dest.m32 += src.m02 * vec.x + src.m12 * vec.y;
/* 608 */     dest.m33 += src.m03 * vec.x + src.m13 * vec.y;
/*     */     
/* 610 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f transpose(Matrix4f dest) {
/* 619 */     return transpose(this, dest);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f transpose(Matrix4f src, Matrix4f dest) {
/* 629 */     if (dest == null)
/* 630 */       dest = new Matrix4f(); 
/* 631 */     float m00 = src.m00;
/* 632 */     float m01 = src.m10;
/* 633 */     float m02 = src.m20;
/* 634 */     float m03 = src.m30;
/* 635 */     float m10 = src.m01;
/* 636 */     float m11 = src.m11;
/* 637 */     float m12 = src.m21;
/* 638 */     float m13 = src.m31;
/* 639 */     float m20 = src.m02;
/* 640 */     float m21 = src.m12;
/* 641 */     float m22 = src.m22;
/* 642 */     float m23 = src.m32;
/* 643 */     float m30 = src.m03;
/* 644 */     float m31 = src.m13;
/* 645 */     float m32 = src.m23;
/* 646 */     float m33 = src.m33;
/*     */     
/* 648 */     dest.m00 = m00;
/* 649 */     dest.m01 = m01;
/* 650 */     dest.m02 = m02;
/* 651 */     dest.m03 = m03;
/* 652 */     dest.m10 = m10;
/* 653 */     dest.m11 = m11;
/* 654 */     dest.m12 = m12;
/* 655 */     dest.m13 = m13;
/* 656 */     dest.m20 = m20;
/* 657 */     dest.m21 = m21;
/* 658 */     dest.m22 = m22;
/* 659 */     dest.m23 = m23;
/* 660 */     dest.m30 = m30;
/* 661 */     dest.m31 = m31;
/* 662 */     dest.m32 = m32;
/* 663 */     dest.m33 = m33;
/*     */     
/* 665 */     return dest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float determinant() {
/* 672 */     float f = this.m00 * (this.m11 * this.m22 * this.m33 + this.m12 * this.m23 * this.m31 + this.m13 * this.m21 * this.m32 - this.m13 * this.m22 * this.m31 - this.m11 * this.m23 * this.m32 - this.m12 * this.m21 * this.m33);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 678 */     f -= this.m01 * (this.m10 * this.m22 * this.m33 + this.m12 * this.m23 * this.m30 + this.m13 * this.m20 * this.m32 - this.m13 * this.m22 * this.m30 - this.m10 * this.m23 * this.m32 - this.m12 * this.m20 * this.m33);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 683 */     f += this.m02 * (this.m10 * this.m21 * this.m33 + this.m11 * this.m23 * this.m30 + this.m13 * this.m20 * this.m31 - this.m13 * this.m21 * this.m30 - this.m10 * this.m23 * this.m31 - this.m11 * this.m20 * this.m33);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 688 */     f -= this.m03 * (this.m10 * this.m21 * this.m32 + this.m11 * this.m22 * this.m30 + this.m12 * this.m20 * this.m31 - this.m12 * this.m21 * this.m30 - this.m10 * this.m22 * this.m31 - this.m11 * this.m20 * this.m32);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 693 */     return f;
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
/*     */   private static float determinant3x3(float t00, float t01, float t02, float t10, float t11, float t12, float t20, float t21, float t22) {
/* 705 */     return t00 * (t11 * t22 - t12 * t21) + t01 * (t12 * t20 - t10 * t22) + t02 * (t10 * t21 - t11 * t20);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix invert() {
/* 715 */     return invert(this, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f invert(Matrix4f src, Matrix4f dest) {
/* 725 */     float determinant = src.determinant();
/*     */     
/* 727 */     if (determinant != 0.0F) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 734 */       if (dest == null)
/* 735 */         dest = new Matrix4f(); 
/* 736 */       float determinant_inv = 1.0F / determinant;
/*     */ 
/*     */       
/* 739 */       float t00 = determinant3x3(src.m11, src.m12, src.m13, src.m21, src.m22, src.m23, src.m31, src.m32, src.m33);
/* 740 */       float t01 = -determinant3x3(src.m10, src.m12, src.m13, src.m20, src.m22, src.m23, src.m30, src.m32, src.m33);
/* 741 */       float t02 = determinant3x3(src.m10, src.m11, src.m13, src.m20, src.m21, src.m23, src.m30, src.m31, src.m33);
/* 742 */       float t03 = -determinant3x3(src.m10, src.m11, src.m12, src.m20, src.m21, src.m22, src.m30, src.m31, src.m32);
/*     */       
/* 744 */       float t10 = -determinant3x3(src.m01, src.m02, src.m03, src.m21, src.m22, src.m23, src.m31, src.m32, src.m33);
/* 745 */       float t11 = determinant3x3(src.m00, src.m02, src.m03, src.m20, src.m22, src.m23, src.m30, src.m32, src.m33);
/* 746 */       float t12 = -determinant3x3(src.m00, src.m01, src.m03, src.m20, src.m21, src.m23, src.m30, src.m31, src.m33);
/* 747 */       float t13 = determinant3x3(src.m00, src.m01, src.m02, src.m20, src.m21, src.m22, src.m30, src.m31, src.m32);
/*     */       
/* 749 */       float t20 = determinant3x3(src.m01, src.m02, src.m03, src.m11, src.m12, src.m13, src.m31, src.m32, src.m33);
/* 750 */       float t21 = -determinant3x3(src.m00, src.m02, src.m03, src.m10, src.m12, src.m13, src.m30, src.m32, src.m33);
/* 751 */       float t22 = determinant3x3(src.m00, src.m01, src.m03, src.m10, src.m11, src.m13, src.m30, src.m31, src.m33);
/* 752 */       float t23 = -determinant3x3(src.m00, src.m01, src.m02, src.m10, src.m11, src.m12, src.m30, src.m31, src.m32);
/*     */       
/* 754 */       float t30 = -determinant3x3(src.m01, src.m02, src.m03, src.m11, src.m12, src.m13, src.m21, src.m22, src.m23);
/* 755 */       float t31 = determinant3x3(src.m00, src.m02, src.m03, src.m10, src.m12, src.m13, src.m20, src.m22, src.m23);
/* 756 */       float t32 = -determinant3x3(src.m00, src.m01, src.m03, src.m10, src.m11, src.m13, src.m20, src.m21, src.m23);
/* 757 */       float t33 = determinant3x3(src.m00, src.m01, src.m02, src.m10, src.m11, src.m12, src.m20, src.m21, src.m22);
/*     */ 
/*     */       
/* 760 */       dest.m00 = t00 * determinant_inv;
/* 761 */       dest.m11 = t11 * determinant_inv;
/* 762 */       dest.m22 = t22 * determinant_inv;
/* 763 */       dest.m33 = t33 * determinant_inv;
/* 764 */       dest.m01 = t10 * determinant_inv;
/* 765 */       dest.m10 = t01 * determinant_inv;
/* 766 */       dest.m20 = t02 * determinant_inv;
/* 767 */       dest.m02 = t20 * determinant_inv;
/* 768 */       dest.m12 = t21 * determinant_inv;
/* 769 */       dest.m21 = t12 * determinant_inv;
/* 770 */       dest.m03 = t30 * determinant_inv;
/* 771 */       dest.m30 = t03 * determinant_inv;
/* 772 */       dest.m13 = t31 * determinant_inv;
/* 773 */       dest.m31 = t13 * determinant_inv;
/* 774 */       dest.m32 = t23 * determinant_inv;
/* 775 */       dest.m23 = t32 * determinant_inv;
/* 776 */       return dest;
/*     */     } 
/* 778 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix negate() {
/* 786 */     return negate(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Matrix4f negate(Matrix4f dest) {
/* 795 */     return negate(this, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Matrix4f negate(Matrix4f src, Matrix4f dest) {
/* 805 */     if (dest == null) {
/* 806 */       dest = new Matrix4f();
/*     */     }
/* 808 */     dest.m00 = -src.m00;
/* 809 */     dest.m01 = -src.m01;
/* 810 */     dest.m02 = -src.m02;
/* 811 */     dest.m03 = -src.m03;
/* 812 */     dest.m10 = -src.m10;
/* 813 */     dest.m11 = -src.m11;
/* 814 */     dest.m12 = -src.m12;
/* 815 */     dest.m13 = -src.m13;
/* 816 */     dest.m20 = -src.m20;
/* 817 */     dest.m21 = -src.m21;
/* 818 */     dest.m22 = -src.m22;
/* 819 */     dest.m23 = -src.m23;
/* 820 */     dest.m30 = -src.m30;
/* 821 */     dest.m31 = -src.m31;
/* 822 */     dest.m32 = -src.m32;
/* 823 */     dest.m33 = -src.m33;
/*     */     
/* 825 */     return dest;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\vector\Matrix4f.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */