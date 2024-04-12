/*     */ package org.lwjgl.util.glu.tessellation;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Render
/*     */ {
/*     */   private static final boolean USE_OPTIMIZED_CODE_PATH = false;
/*  96 */   private static final RenderFan renderFan = new RenderFan();
/*  97 */   private static final RenderStrip renderStrip = new RenderStrip();
/*  98 */   private static final RenderTriangle renderTriangle = new RenderTriangle();
/*     */   private static final int SIGN_INCONSISTENT = 2;
/*     */   static final boolean $assertionsDisabled;
/*     */   
/*     */   private static class FaceCount { long size;
/*     */     GLUhalfEdge eStart;
/*     */     Render.renderCallBack render;
/*     */     
/*     */     public FaceCount() {}
/*     */     
/*     */     public FaceCount(long size, GLUhalfEdge eStart, Render.renderCallBack render) {
/* 109 */       this.size = size;
/* 110 */       this.eStart = eStart;
/* 111 */       this.render = render;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void __gl_renderMesh(GLUtessellatorImpl tess, GLUmesh mesh) {
/* 136 */     tess.lonelyTriList = null;
/*     */     GLUface f;
/* 138 */     for (f = mesh.fHead.next; f != mesh.fHead; f = f.next) {
/* 139 */       f.marked = false;
/*     */     }
/* 141 */     for (f = mesh.fHead.next; f != mesh.fHead; f = f.next) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 147 */       if (f.inside && !f.marked) {
/* 148 */         RenderMaximumFaceGroup(tess, f);
/* 149 */         assert f.marked;
/*     */       } 
/*     */     } 
/* 152 */     if (tess.lonelyTriList != null) {
/* 153 */       RenderLonelyTriangles(tess, tess.lonelyTriList);
/* 154 */       tess.lonelyTriList = null;
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
/*     */   static void RenderMaximumFaceGroup(GLUtessellatorImpl tess, GLUface fOrig) {
/* 167 */     GLUhalfEdge e = fOrig.anEdge;
/* 168 */     FaceCount max = new FaceCount();
/* 169 */     FaceCount newFace = new FaceCount();
/*     */     
/* 171 */     max.size = 1L;
/* 172 */     max.eStart = e;
/* 173 */     max.render = renderTriangle;
/*     */     
/* 175 */     if (!tess.flagBoundary) {
/* 176 */       newFace = MaximumFan(e);
/* 177 */       if (newFace.size > max.size) {
/* 178 */         max = newFace;
/*     */       }
/* 180 */       newFace = MaximumFan(e.Lnext);
/* 181 */       if (newFace.size > max.size) {
/* 182 */         max = newFace;
/*     */       }
/* 184 */       newFace = MaximumFan(e.Onext.Sym);
/* 185 */       if (newFace.size > max.size) {
/* 186 */         max = newFace;
/*     */       }
/*     */       
/* 189 */       newFace = MaximumStrip(e);
/* 190 */       if (newFace.size > max.size) {
/* 191 */         max = newFace;
/*     */       }
/* 193 */       newFace = MaximumStrip(e.Lnext);
/* 194 */       if (newFace.size > max.size) {
/* 195 */         max = newFace;
/*     */       }
/* 197 */       newFace = MaximumStrip(e.Onext.Sym);
/* 198 */       if (newFace.size > max.size) {
/* 199 */         max = newFace;
/*     */       }
/*     */     } 
/* 202 */     max.render.render(tess, max.eStart, max.size);
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
/*     */   private static boolean Marked(GLUface f) {
/* 214 */     return (!f.inside || f.marked);
/*     */   }
/*     */   
/*     */   private static GLUface AddToTrail(GLUface f, GLUface t) {
/* 218 */     f.trail = t;
/* 219 */     f.marked = true;
/* 220 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void FreeTrail(GLUface t) {
/* 225 */     while (t != null) {
/* 226 */       t.marked = false;
/* 227 */       t = t.trail;
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
/*     */   static FaceCount MaximumFan(GLUhalfEdge eOrig) {
/* 239 */     FaceCount newFace = new FaceCount(0L, null, renderFan);
/* 240 */     GLUface trail = null;
/*     */     
/*     */     GLUhalfEdge e;
/* 243 */     for (e = eOrig; !Marked(e.Lface); e = e.Onext) {
/* 244 */       trail = AddToTrail(e.Lface, trail);
/* 245 */       newFace.size++;
/*     */     } 
/* 247 */     for (e = eOrig; !Marked(e.Sym.Lface); e = e.Sym.Lnext) {
/* 248 */       trail = AddToTrail(e.Sym.Lface, trail);
/* 249 */       newFace.size++;
/*     */     } 
/* 251 */     newFace.eStart = e;
/*     */     
/* 253 */     FreeTrail(trail);
/* 254 */     return newFace;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean IsEven(long n) {
/* 259 */     return ((n & 0x1L) == 0L);
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
/*     */   static FaceCount MaximumStrip(GLUhalfEdge eOrig) {
/* 273 */     FaceCount newFace = new FaceCount(0L, null, renderStrip);
/* 274 */     long headSize = 0L, tailSize = 0L;
/* 275 */     GLUface trail = null;
/*     */     
/*     */     GLUhalfEdge e;
/* 278 */     for (e = eOrig; !Marked(e.Lface); tailSize++, e = e.Onext) {
/* 279 */       trail = AddToTrail(e.Lface, trail);
/* 280 */       tailSize++;
/* 281 */       e = e.Lnext.Sym;
/* 282 */       if (Marked(e.Lface))
/* 283 */         break;  trail = AddToTrail(e.Lface, trail);
/*     */     } 
/* 285 */     GLUhalfEdge eTail = e;
/*     */     
/* 287 */     for (e = eOrig; !Marked(e.Sym.Lface); headSize++, e = e.Sym.Onext.Sym) {
/* 288 */       trail = AddToTrail(e.Sym.Lface, trail);
/* 289 */       headSize++;
/* 290 */       e = e.Sym.Lnext;
/* 291 */       if (Marked(e.Sym.Lface))
/* 292 */         break;  trail = AddToTrail(e.Sym.Lface, trail);
/*     */     } 
/* 294 */     GLUhalfEdge eHead = e;
/*     */     
/* 296 */     newFace.size = tailSize + headSize;
/* 297 */     if (IsEven(tailSize)) {
/* 298 */       newFace.eStart = eTail.Sym;
/* 299 */     } else if (IsEven(headSize)) {
/* 300 */       newFace.eStart = eHead;
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 305 */       newFace.size--;
/* 306 */       newFace.eStart = eHead.Onext;
/*     */     } 
/*     */     
/* 309 */     FreeTrail(trail);
/* 310 */     return newFace;
/*     */   }
/*     */   
/*     */   private static interface renderCallBack {
/*     */     void render(GLUtessellatorImpl param1GLUtessellatorImpl, GLUhalfEdge param1GLUhalfEdge, long param1Long); }
/*     */   
/*     */   private static class RenderTriangle implements renderCallBack {
/*     */     public void render(GLUtessellatorImpl tess, GLUhalfEdge e, long size) {
/* 318 */       assert size == 1L;
/* 319 */       tess.lonelyTriList = Render.AddToTrail(e.Lface, tess.lonelyTriList);
/*     */     }
/*     */ 
/*     */     
/*     */     static final boolean $assertionsDisabled;
/*     */ 
/*     */     
/*     */     private RenderTriangle() {}
/*     */   }
/*     */   
/*     */   static void RenderLonelyTriangles(GLUtessellatorImpl tess, GLUface f) {
/* 330 */     int edgeState = -1;
/*     */     
/* 332 */     tess.callBeginOrBeginData(4);
/*     */     
/* 334 */     while (f != null) {
/*     */ 
/*     */       
/* 337 */       GLUhalfEdge e = f.anEdge;
/*     */       while (true)
/* 339 */       { if (tess.flagBoundary) {
/*     */ 
/*     */ 
/*     */           
/* 343 */           int newState = !e.Sym.Lface.inside ? 1 : 0;
/* 344 */           if (edgeState != newState) {
/* 345 */             edgeState = newState;
/* 346 */             tess.callEdgeFlagOrEdgeFlagData((edgeState != 0));
/*     */           } 
/*     */         } 
/* 349 */         tess.callVertexOrVertexData(e.Org.data);
/*     */         
/* 351 */         e = e.Lnext;
/* 352 */         if (e == f.anEdge)
/*     */           f = f.trail;  } 
/* 354 */     }  tess.callEndOrEndData();
/*     */   }
/*     */   
/*     */   private static class RenderFan implements renderCallBack {
/*     */     static final boolean $assertionsDisabled;
/*     */     
/*     */     private RenderFan() {}
/*     */     
/*     */     public void render(GLUtessellatorImpl tess, GLUhalfEdge e, long size) {
/* 363 */       tess.callBeginOrBeginData(6);
/* 364 */       tess.callVertexOrVertexData(e.Org.data);
/* 365 */       tess.callVertexOrVertexData(e.Sym.Org.data);
/*     */       
/* 367 */       while (!Render.Marked(e.Lface)) {
/* 368 */         e.Lface.marked = true;
/* 369 */         size--;
/* 370 */         e = e.Onext;
/* 371 */         tess.callVertexOrVertexData(e.Sym.Org.data);
/*     */       } 
/*     */       
/* 374 */       assert size == 0L;
/* 375 */       tess.callEndOrEndData();
/*     */     }
/*     */   }
/*     */   
/*     */   private static class RenderStrip implements renderCallBack {
/*     */     static final boolean $assertionsDisabled;
/*     */     
/*     */     private RenderStrip() {}
/*     */     
/*     */     public void render(GLUtessellatorImpl tess, GLUhalfEdge e, long size) {
/* 385 */       tess.callBeginOrBeginData(5);
/* 386 */       tess.callVertexOrVertexData(e.Org.data);
/* 387 */       tess.callVertexOrVertexData(e.Sym.Org.data);
/*     */       
/* 389 */       while (!Render.Marked(e.Lface)) {
/* 390 */         e.Lface.marked = true;
/* 391 */         size--;
/* 392 */         e = e.Lnext.Sym;
/* 393 */         tess.callVertexOrVertexData(e.Org.data);
/* 394 */         if (Render.Marked(e.Lface))
/*     */           break; 
/* 396 */         e.Lface.marked = true;
/* 397 */         size--;
/* 398 */         e = e.Onext;
/* 399 */         tess.callVertexOrVertexData(e.Sym.Org.data);
/*     */       } 
/*     */       
/* 402 */       assert size == 0L;
/* 403 */       tess.callEndOrEndData();
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
/*     */   public static void __gl_renderBoundary(GLUtessellatorImpl tess, GLUmesh mesh) {
/* 417 */     for (GLUface f = mesh.fHead.next; f != mesh.fHead; f = f.next) {
/* 418 */       if (f.inside) {
/* 419 */         tess.callBeginOrBeginData(2);
/* 420 */         GLUhalfEdge e = f.anEdge;
/*     */         while (true) {
/* 422 */           tess.callVertexOrVertexData(e.Org.data);
/* 423 */           e = e.Lnext;
/* 424 */           if (e == f.anEdge) {
/* 425 */             tess.callEndOrEndData();
/*     */             break;
/*     */           } 
/*     */         } 
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
/*     */   static int ComputeNormal(GLUtessellatorImpl tess, double[] norm, boolean check) {
/* 444 */     CachedVertex[] v = tess.cache;
/*     */     
/* 446 */     int vn = tess.cacheCount;
/*     */ 
/*     */ 
/*     */     
/* 450 */     double[] n = new double[3];
/* 451 */     int sign = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 466 */     if (!check) {
/* 467 */       norm[2] = 0.0D; norm[1] = 0.0D; norm[0] = 0.0D;
/*     */     } 
/*     */     
/* 470 */     int vc = 1;
/* 471 */     double xc = (v[vc]).coords[0] - (v[0]).coords[0];
/* 472 */     double yc = (v[vc]).coords[1] - (v[0]).coords[1];
/* 473 */     double zc = (v[vc]).coords[2] - (v[0]).coords[2];
/* 474 */     while (++vc < vn) {
/* 475 */       double xp = xc;
/* 476 */       double yp = yc;
/* 477 */       double zp = zc;
/* 478 */       xc = (v[vc]).coords[0] - (v[0]).coords[0];
/* 479 */       yc = (v[vc]).coords[1] - (v[0]).coords[1];
/* 480 */       zc = (v[vc]).coords[2] - (v[0]).coords[2];
/*     */ 
/*     */       
/* 483 */       n[0] = yp * zc - zp * yc;
/* 484 */       n[1] = zp * xc - xp * zc;
/* 485 */       n[2] = xp * yc - yp * xc;
/*     */       
/* 487 */       double dot = n[0] * norm[0] + n[1] * norm[1] + n[2] * norm[2];
/* 488 */       if (!check) {
/*     */ 
/*     */ 
/*     */         
/* 492 */         if (dot >= 0.0D) {
/* 493 */           norm[0] = norm[0] + n[0];
/* 494 */           norm[1] = norm[1] + n[1];
/* 495 */           norm[2] = norm[2] + n[2]; continue;
/*     */         } 
/* 497 */         norm[0] = norm[0] - n[0];
/* 498 */         norm[1] = norm[1] - n[1];
/* 499 */         norm[2] = norm[2] - n[2]; continue;
/*     */       } 
/* 501 */       if (dot != 0.0D) {
/*     */         
/* 503 */         if (dot > 0.0D) {
/* 504 */           if (sign < 0) return 2; 
/* 505 */           sign = 1; continue;
/*     */         } 
/* 507 */         if (sign > 0) return 2; 
/* 508 */         sign = -1;
/*     */       } 
/*     */     } 
/*     */     
/* 512 */     return sign;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean __gl_renderCache(GLUtessellatorImpl tess) {
/* 523 */     CachedVertex[] v = tess.cache;
/*     */     
/* 525 */     int vn = tess.cacheCount;
/*     */ 
/*     */     
/* 528 */     double[] norm = new double[3];
/*     */ 
/*     */     
/* 531 */     if (tess.cacheCount < 3)
/*     */     {
/* 533 */       return true;
/*     */     }
/*     */     
/* 536 */     norm[0] = tess.normal[0];
/* 537 */     norm[1] = tess.normal[1];
/* 538 */     norm[2] = tess.normal[2];
/* 539 */     if (norm[0] == 0.0D && norm[1] == 0.0D && norm[2] == 0.0D) {
/* 540 */       ComputeNormal(tess, norm, false);
/*     */     }
/*     */     
/* 543 */     int sign = ComputeNormal(tess, norm, true);
/* 544 */     if (sign == 2)
/*     */     {
/* 546 */       return false;
/*     */     }
/* 548 */     if (sign == 0)
/*     */     {
/* 550 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 554 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\tessellation\Render.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */