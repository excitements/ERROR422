/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class MacOSXGLCanvas
/*    */   extends Canvas
/*    */ {
/*    */   private static final long serialVersionUID = 6916664741667434870L;
/*    */   private boolean canvas_painted;
/*    */   private boolean dirty;
/*    */   
/*    */   public void update(Graphics g) {
/* 50 */     paint(g);
/*    */   }
/*    */   
/*    */   public void paint(Graphics g) {
/* 54 */     synchronized (this) {
/* 55 */       this.dirty = true;
/* 56 */       this.canvas_painted = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean syncCanvasPainted() {
/*    */     boolean result;
/* 62 */     synchronized (this) {
/* 63 */       result = this.canvas_painted;
/* 64 */       this.canvas_painted = false;
/*    */     } 
/* 66 */     return result;
/*    */   }
/*    */   
/*    */   public boolean syncIsDirty() {
/*    */     boolean result;
/* 71 */     synchronized (this) {
/* 72 */       result = this.dirty;
/* 73 */       this.dirty = false;
/*    */     } 
/* 75 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXGLCanvas.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */