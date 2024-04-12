/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.awt.event.ComponentListener;
/*     */ import java.awt.event.HierarchyEvent;
/*     */ import java.awt.event.HierarchyListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class MacOSXCanvasListener
/*     */   implements ComponentListener, HierarchyListener
/*     */ {
/*     */   private final Canvas canvas;
/*     */   private int width;
/*     */   private int height;
/*     */   private boolean context_update;
/*     */   
/*     */   MacOSXCanvasListener(Canvas canvas) {
/*  52 */     this.canvas = canvas;
/*  53 */     canvas.addComponentListener(this);
/*  54 */     canvas.addHierarchyListener(this);
/*  55 */     setUpdate();
/*     */   }
/*     */ 
/*     */   
/*     */   public void disableListeners() {
/*  60 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*  62 */             MacOSXCanvasListener.this.canvas.removeComponentListener(MacOSXCanvasListener.this);
/*  63 */             MacOSXCanvasListener.this.canvas.removeHierarchyListener(MacOSXCanvasListener.this);
/*     */           }
/*     */           private final MacOSXCanvasListener this$0;
/*     */         });
/*     */   }
/*     */   public boolean syncShouldUpdateContext() {
/*     */     boolean should_update;
/*  70 */     synchronized (this) {
/*  71 */       should_update = this.context_update;
/*  72 */       this.context_update = false;
/*     */     } 
/*  74 */     return should_update;
/*     */   }
/*     */   
/*     */   private synchronized void setUpdate() {
/*  78 */     synchronized (this) {
/*  79 */       this.width = this.canvas.getWidth();
/*  80 */       this.height = this.canvas.getHeight();
/*  81 */       this.context_update = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public int syncGetWidth() {
/*  86 */     synchronized (this) {
/*  87 */       return this.width;
/*     */     } 
/*     */   }
/*     */   
/*     */   public int syncGetHeight() {
/*  92 */     synchronized (this) {
/*  93 */       return this.height;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void componentShown(ComponentEvent e) {}
/*     */ 
/*     */   
/*     */   public void componentHidden(ComponentEvent e) {}
/*     */   
/*     */   public void componentResized(ComponentEvent e) {
/* 104 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void componentMoved(ComponentEvent e) {
/* 108 */     setUpdate();
/*     */   }
/*     */   
/*     */   public void hierarchyChanged(HierarchyEvent e) {
/* 112 */     setUpdate();
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXCanvasListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */