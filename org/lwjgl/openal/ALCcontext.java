/*     */ package org.lwjgl.openal;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ALCcontext
/*     */ {
/*     */   final long context;
/*     */   private boolean valid = false;
/*     */   
/*     */   ALCcontext(long context) {
/*  66 */     this.context = context;
/*  67 */     this.valid = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object context) {
/*  74 */     if (context instanceof ALCcontext) {
/*  75 */       return (((ALCcontext)context).context == this.context);
/*     */     }
/*  77 */     return super.equals(context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static IntBuffer createAttributeList(int contextFrequency, int contextRefresh, int contextSynchronized) {
/*  88 */     IntBuffer attribList = BufferUtils.createIntBuffer(7);
/*     */     
/*  90 */     attribList.put(4103);
/*  91 */     attribList.put(contextFrequency);
/*  92 */     attribList.put(4104);
/*  93 */     attribList.put(contextRefresh);
/*  94 */     attribList.put(4105);
/*  95 */     attribList.put(contextSynchronized);
/*  96 */     attribList.put(0);
/*     */     
/*  98 */     return attribList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void setInvalid() {
/* 106 */     this.valid = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValid() {
/* 113 */     return this.valid;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\ALCcontext.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */