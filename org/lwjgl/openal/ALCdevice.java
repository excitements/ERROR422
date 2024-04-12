/*     */ package org.lwjgl.openal;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ALCdevice
/*     */ {
/*     */   final long device;
/*     */   private boolean valid = false;
/*  60 */   private HashMap contexts = new HashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   ALCdevice(long device) {
/*  68 */     this.device = device;
/*  69 */     this.valid = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object device) {
/*  76 */     if (device instanceof ALCdevice) {
/*  77 */       return (((ALCdevice)device).device == this.device);
/*     */     }
/*  79 */     return super.equals(device);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void addContext(ALCcontext context) {
/*  88 */     synchronized (this.contexts) {
/*  89 */       this.contexts.put(new Long(context.context), context);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void removeContext(ALCcontext context) {
/*  99 */     synchronized (this.contexts) {
/* 100 */       this.contexts.remove(new Long(context.context));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void setInvalid() {
/* 108 */     this.valid = false;
/* 109 */     synchronized (this.contexts) {
/* 110 */       for (Iterator i = this.contexts.values().iterator(); i.hasNext(); ) {
/* 111 */         ALCcontext context = i.next();
/* 112 */         context.setInvalid();
/*     */       } 
/*     */     } 
/* 115 */     this.contexts.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValid() {
/* 122 */     return this.valid;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\ALCdevice.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */