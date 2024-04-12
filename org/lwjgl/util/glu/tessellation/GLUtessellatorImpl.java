/*     */ package org.lwjgl.util.glu.tessellation;
/*     */ 
/*     */ import org.lwjgl.util.glu.GLUtessellator;
/*     */ import org.lwjgl.util.glu.GLUtessellatorCallback;
/*     */ import org.lwjgl.util.glu.GLUtessellatorCallbackAdapter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GLUtessellatorImpl
/*     */   implements GLUtessellator
/*     */ {
/*     */   public static final int TESS_MAX_CACHE = 100;
/*     */   private int state;
/*     */   private GLUhalfEdge lastEdge;
/*     */   GLUmesh mesh;
/* 103 */   double[] normal = new double[3];
/* 104 */   double[] sUnit = new double[3];
/* 105 */   double[] tUnit = new double[3];
/*     */ 
/*     */   
/*     */   private double relTolerance;
/*     */   
/*     */   int windingRule;
/*     */   
/*     */   boolean fatalError;
/*     */   
/*     */   Dict dict;
/*     */   
/*     */   PriorityQ pq;
/*     */   
/*     */   GLUvertex event;
/*     */   
/*     */   boolean flagBoundary;
/*     */   
/*     */   boolean boundaryOnly;
/*     */   
/*     */   GLUface lonelyTriList;
/*     */   
/*     */   private boolean flushCacheOnNextVertex;
/*     */   
/*     */   int cacheCount;
/*     */   
/* 130 */   CachedVertex[] cache = new CachedVertex[100];
/*     */   
/*     */   private Object polygonData;
/*     */   
/*     */   private GLUtessellatorCallback callBegin;
/*     */   
/*     */   private GLUtessellatorCallback callEdgeFlag;
/*     */   
/*     */   private GLUtessellatorCallback callVertex;
/*     */   
/*     */   private GLUtessellatorCallback callEnd;
/*     */   
/*     */   private GLUtessellatorCallback callError;
/*     */   
/*     */   private GLUtessellatorCallback callCombine;
/*     */   
/*     */   private GLUtessellatorCallback callBeginData;
/*     */   private GLUtessellatorCallback callEdgeFlagData;
/*     */   private GLUtessellatorCallback callVertexData;
/*     */   private GLUtessellatorCallback callEndData;
/*     */   private GLUtessellatorCallback callErrorData;
/*     */   private GLUtessellatorCallback callCombineData;
/*     */   private static final double GLU_TESS_DEFAULT_TOLERANCE = 0.0D;
/* 153 */   private static GLUtessellatorCallback NULL_CB = (GLUtessellatorCallback)new GLUtessellatorCallbackAdapter();
/*     */   
/*     */   static final boolean $assertionsDisabled;
/*     */ 
/*     */   
/*     */   public GLUtessellatorImpl() {
/* 159 */     this.state = 0;
/*     */     
/* 161 */     this.normal[0] = 0.0D;
/* 162 */     this.normal[1] = 0.0D;
/* 163 */     this.normal[2] = 0.0D;
/*     */     
/* 165 */     this.relTolerance = 0.0D;
/* 166 */     this.windingRule = 100130;
/* 167 */     this.flagBoundary = false;
/* 168 */     this.boundaryOnly = false;
/*     */     
/* 170 */     this.callBegin = NULL_CB;
/* 171 */     this.callEdgeFlag = NULL_CB;
/* 172 */     this.callVertex = NULL_CB;
/* 173 */     this.callEnd = NULL_CB;
/* 174 */     this.callError = NULL_CB;
/* 175 */     this.callCombine = NULL_CB;
/*     */ 
/*     */     
/* 178 */     this.callBeginData = NULL_CB;
/* 179 */     this.callEdgeFlagData = NULL_CB;
/* 180 */     this.callVertexData = NULL_CB;
/* 181 */     this.callEndData = NULL_CB;
/* 182 */     this.callErrorData = NULL_CB;
/* 183 */     this.callCombineData = NULL_CB;
/*     */     
/* 185 */     this.polygonData = null;
/*     */     
/* 187 */     for (int i = 0; i < this.cache.length; i++) {
/* 188 */       this.cache[i] = new CachedVertex();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static GLUtessellator gluNewTess() {
/* 194 */     return new GLUtessellatorImpl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void makeDormant() {
/* 201 */     if (this.mesh != null) {
/* 202 */       Mesh.__gl_meshDeleteMesh(this.mesh);
/*     */     }
/* 204 */     this.state = 0;
/* 205 */     this.lastEdge = null;
/* 206 */     this.mesh = null;
/*     */   }
/*     */   
/*     */   private void requireState(int newState) {
/* 210 */     if (this.state != newState) gotoState(newState); 
/*     */   }
/*     */   
/*     */   private void gotoState(int newState) {
/* 214 */     while (this.state != newState) {
/*     */ 
/*     */ 
/*     */       
/* 218 */       if (this.state < newState) {
/* 219 */         if (this.state == 0) {
/* 220 */           callErrorOrErrorData(100151);
/* 221 */           gluTessBeginPolygon(null); continue;
/* 222 */         }  if (this.state == 1) {
/* 223 */           callErrorOrErrorData(100152);
/* 224 */           gluTessBeginContour();
/*     */         }  continue;
/*     */       } 
/* 227 */       if (this.state == 2) {
/* 228 */         callErrorOrErrorData(100154);
/* 229 */         gluTessEndContour(); continue;
/* 230 */       }  if (this.state == 1) {
/* 231 */         callErrorOrErrorData(100153);
/*     */         
/* 233 */         makeDormant();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void gluDeleteTess() {
/* 240 */     requireState(0);
/*     */   }
/*     */   public void gluTessProperty(int which, double value) {
/*     */     int windingRule;
/* 244 */     switch (which) {
/*     */       case 100142:
/* 246 */         if (value < 0.0D || value > 1.0D)
/* 247 */           break;  this.relTolerance = value;
/*     */         return;
/*     */       
/*     */       case 100140:
/* 251 */         windingRule = (int)value;
/* 252 */         if (windingRule != value)
/*     */           break; 
/* 254 */         switch (windingRule) {
/*     */           case 100130:
/*     */           case 100131:
/*     */           case 100132:
/*     */           case 100133:
/*     */           case 100134:
/* 260 */             this.windingRule = windingRule;
/*     */             return;
/*     */         } 
/*     */       
/*     */       
/*     */       
/*     */       case 100141:
/* 267 */         this.boundaryOnly = (value != 0.0D);
/*     */         return;
/*     */       
/*     */       default:
/* 271 */         callErrorOrErrorData(100900);
/*     */         return;
/*     */     } 
/* 274 */     callErrorOrErrorData(100901);
/*     */   }
/*     */ 
/*     */   
/*     */   public void gluGetTessProperty(int which, double[] value, int value_offset) {
/* 279 */     switch (which) {
/*     */       
/*     */       case 100142:
/* 282 */         assert 0.0D <= this.relTolerance && this.relTolerance <= 1.0D;
/* 283 */         value[value_offset] = this.relTolerance;
/*     */         return;
/*     */       case 100140:
/* 286 */         assert this.windingRule == 100130 || this.windingRule == 100131 || this.windingRule == 100132 || this.windingRule == 100133 || this.windingRule == 100134;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 291 */         value[value_offset] = this.windingRule;
/*     */         return;
/*     */       case 100141:
/* 294 */         assert this.boundaryOnly == true || !this.boundaryOnly;
/* 295 */         value[value_offset] = this.boundaryOnly ? 1.0D : 0.0D;
/*     */         return;
/*     */     } 
/* 298 */     value[value_offset] = 0.0D;
/* 299 */     callErrorOrErrorData(100900);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void gluTessNormal(double x, double y, double z) {
/* 305 */     this.normal[0] = x;
/* 306 */     this.normal[1] = y;
/* 307 */     this.normal[2] = z;
/*     */   }
/*     */   
/*     */   public void gluTessCallback(int which, GLUtessellatorCallback aCallback) {
/* 311 */     switch (which) {
/*     */       case 100100:
/* 313 */         this.callBegin = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100106:
/* 316 */         this.callBeginData = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100104:
/* 319 */         this.callEdgeFlag = (aCallback == null) ? NULL_CB : aCallback;
/*     */ 
/*     */ 
/*     */         
/* 323 */         this.flagBoundary = (aCallback != null);
/*     */         return;
/*     */       case 100110:
/* 326 */         this.callEdgeFlagData = this.callBegin = (aCallback == null) ? NULL_CB : aCallback;
/*     */ 
/*     */ 
/*     */         
/* 330 */         this.flagBoundary = (aCallback != null);
/*     */         return;
/*     */       case 100101:
/* 333 */         this.callVertex = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100107:
/* 336 */         this.callVertexData = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100102:
/* 339 */         this.callEnd = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100108:
/* 342 */         this.callEndData = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100103:
/* 345 */         this.callError = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100109:
/* 348 */         this.callErrorData = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100105:
/* 351 */         this.callCombine = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */       case 100111:
/* 354 */         this.callCombineData = (aCallback == null) ? NULL_CB : aCallback;
/*     */         return;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 360 */     callErrorOrErrorData(100900);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean addVertex(double[] coords, Object vertexData) {
/* 368 */     GLUhalfEdge e = this.lastEdge;
/* 369 */     if (e == null) {
/*     */ 
/*     */       
/* 372 */       e = Mesh.__gl_meshMakeEdge(this.mesh);
/* 373 */       if (e == null) return false; 
/* 374 */       if (!Mesh.__gl_meshSplice(e, e.Sym)) return false;
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 379 */       if (Mesh.__gl_meshSplitEdge(e) == null) return false; 
/* 380 */       e = e.Lnext;
/*     */     } 
/*     */ 
/*     */     
/* 384 */     e.Org.data = vertexData;
/* 385 */     e.Org.coords[0] = coords[0];
/* 386 */     e.Org.coords[1] = coords[1];
/* 387 */     e.Org.coords[2] = coords[2];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 394 */     e.winding = 1;
/* 395 */     e.Sym.winding = -1;
/*     */     
/* 397 */     this.lastEdge = e;
/*     */     
/* 399 */     return true;
/*     */   }
/*     */   
/*     */   private void cacheVertex(double[] coords, Object vertexData) {
/* 403 */     if (this.cache[this.cacheCount] == null) {
/* 404 */       this.cache[this.cacheCount] = new CachedVertex();
/*     */     }
/*     */     
/* 407 */     CachedVertex v = this.cache[this.cacheCount];
/*     */     
/* 409 */     v.data = vertexData;
/* 410 */     v.coords[0] = coords[0];
/* 411 */     v.coords[1] = coords[1];
/* 412 */     v.coords[2] = coords[2];
/* 413 */     this.cacheCount++;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean flushCache() {
/* 418 */     CachedVertex[] v = this.cache;
/*     */     
/* 420 */     this.mesh = Mesh.__gl_meshNewMesh();
/* 421 */     if (this.mesh == null) return false;
/*     */     
/* 423 */     for (int i = 0; i < this.cacheCount; i++) {
/* 424 */       CachedVertex vertex = v[i];
/* 425 */       if (!addVertex(vertex.coords, vertex.data)) return false; 
/*     */     } 
/* 427 */     this.cacheCount = 0;
/* 428 */     this.flushCacheOnNextVertex = false;
/*     */     
/* 430 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void gluTessVertex(double[] coords, int coords_offset, Object vertexData) {
/* 435 */     boolean tooLarge = false;
/*     */     
/* 437 */     double[] clamped = new double[3];
/*     */     
/* 439 */     requireState(2);
/*     */     
/* 441 */     if (this.flushCacheOnNextVertex) {
/* 442 */       if (!flushCache()) {
/* 443 */         callErrorOrErrorData(100902);
/*     */         return;
/*     */       } 
/* 446 */       this.lastEdge = null;
/*     */     } 
/* 448 */     for (int i = 0; i < 3; i++) {
/* 449 */       double x = coords[i + coords_offset];
/* 450 */       if (x < -1.0E150D) {
/* 451 */         x = -1.0E150D;
/* 452 */         tooLarge = true;
/*     */       } 
/* 454 */       if (x > 1.0E150D) {
/* 455 */         x = 1.0E150D;
/* 456 */         tooLarge = true;
/*     */       } 
/* 458 */       clamped[i] = x;
/*     */     } 
/* 460 */     if (tooLarge) {
/* 461 */       callErrorOrErrorData(100155);
/*     */     }
/*     */     
/* 464 */     if (this.mesh == null) {
/* 465 */       if (this.cacheCount < 100) {
/* 466 */         cacheVertex(clamped, vertexData);
/*     */         return;
/*     */       } 
/* 469 */       if (!flushCache()) {
/* 470 */         callErrorOrErrorData(100902);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 475 */     if (!addVertex(clamped, vertexData)) {
/* 476 */       callErrorOrErrorData(100902);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void gluTessBeginPolygon(Object data) {
/* 482 */     requireState(0);
/*     */     
/* 484 */     this.state = 1;
/* 485 */     this.cacheCount = 0;
/* 486 */     this.flushCacheOnNextVertex = false;
/* 487 */     this.mesh = null;
/*     */     
/* 489 */     this.polygonData = data;
/*     */   }
/*     */ 
/*     */   
/*     */   public void gluTessBeginContour() {
/* 494 */     requireState(1);
/*     */     
/* 496 */     this.state = 2;
/* 497 */     this.lastEdge = null;
/* 498 */     if (this.cacheCount > 0)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 503 */       this.flushCacheOnNextVertex = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void gluTessEndContour() {
/* 509 */     requireState(2);
/* 510 */     this.state = 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void gluTessEndPolygon() {
/*     */     try {
/* 517 */       requireState(1);
/* 518 */       this.state = 0;
/*     */       
/* 520 */       if (this.mesh == null) {
/* 521 */         if (!this.flagBoundary)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 528 */           if (Render.__gl_renderCache(this)) {
/* 529 */             this.polygonData = null;
/*     */             return;
/*     */           } 
/*     */         }
/* 533 */         if (!flushCache()) throw new RuntimeException();
/*     */       
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 539 */       Normal.__gl_projectPolygon(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 547 */       if (!Sweep.__gl_computeInterior(this)) {
/* 548 */         throw new RuntimeException();
/*     */       }
/*     */       
/* 551 */       GLUmesh mesh = this.mesh;
/* 552 */       if (!this.fatalError) {
/* 553 */         boolean rc = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 559 */         if (this.boundaryOnly) {
/* 560 */           rc = TessMono.__gl_meshSetWindingNumber(mesh, 1, true);
/*     */         } else {
/* 562 */           rc = TessMono.__gl_meshTessellateInterior(mesh);
/*     */         } 
/* 564 */         if (!rc) throw new RuntimeException();
/*     */         
/* 566 */         Mesh.__gl_meshCheckMesh(mesh);
/*     */         
/* 568 */         if (this.callBegin != NULL_CB || this.callEnd != NULL_CB || this.callVertex != NULL_CB || this.callEdgeFlag != NULL_CB || this.callBeginData != NULL_CB || this.callEndData != NULL_CB || this.callVertexData != NULL_CB || this.callEdgeFlagData != NULL_CB)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 574 */           if (this.boundaryOnly) {
/* 575 */             Render.__gl_renderBoundary(this, mesh);
/*     */           } else {
/* 577 */             Render.__gl_renderMesh(this, mesh);
/*     */           } 
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 595 */       Mesh.__gl_meshDeleteMesh(mesh);
/* 596 */       this.polygonData = null;
/* 597 */       mesh = null;
/* 598 */     } catch (Exception e) {
/* 599 */       e.printStackTrace();
/* 600 */       callErrorOrErrorData(100902);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void gluBeginPolygon() {
/* 609 */     gluTessBeginPolygon(null);
/* 610 */     gluTessBeginContour();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void gluNextContour(int type) {
/* 616 */     gluTessEndContour();
/* 617 */     gluTessBeginContour();
/*     */   }
/*     */ 
/*     */   
/*     */   public void gluEndPolygon() {
/* 622 */     gluTessEndContour();
/* 623 */     gluTessEndPolygon();
/*     */   }
/*     */   
/*     */   void callBeginOrBeginData(int a) {
/* 627 */     if (this.callBeginData != NULL_CB) {
/* 628 */       this.callBeginData.beginData(a, this.polygonData);
/*     */     } else {
/* 630 */       this.callBegin.begin(a);
/*     */     } 
/*     */   }
/*     */   void callVertexOrVertexData(Object a) {
/* 634 */     if (this.callVertexData != NULL_CB) {
/* 635 */       this.callVertexData.vertexData(a, this.polygonData);
/*     */     } else {
/* 637 */       this.callVertex.vertex(a);
/*     */     } 
/*     */   }
/*     */   void callEdgeFlagOrEdgeFlagData(boolean a) {
/* 641 */     if (this.callEdgeFlagData != NULL_CB) {
/* 642 */       this.callEdgeFlagData.edgeFlagData(a, this.polygonData);
/*     */     } else {
/* 644 */       this.callEdgeFlag.edgeFlag(a);
/*     */     } 
/*     */   }
/*     */   void callEndOrEndData() {
/* 648 */     if (this.callEndData != NULL_CB) {
/* 649 */       this.callEndData.endData(this.polygonData);
/*     */     } else {
/* 651 */       this.callEnd.end();
/*     */     } 
/*     */   }
/*     */   void callCombineOrCombineData(double[] coords, Object[] vertexData, float[] weights, Object[] outData) {
/* 655 */     if (this.callCombineData != NULL_CB) {
/* 656 */       this.callCombineData.combineData(coords, vertexData, weights, outData, this.polygonData);
/*     */     } else {
/* 658 */       this.callCombine.combine(coords, vertexData, weights, outData);
/*     */     } 
/*     */   }
/*     */   void callErrorOrErrorData(int a) {
/* 662 */     if (this.callErrorData != NULL_CB) {
/* 663 */       this.callErrorData.errorData(a, this.polygonData);
/*     */     } else {
/* 665 */       this.callError.error(a);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\tessellation\GLUtessellatorImpl.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */