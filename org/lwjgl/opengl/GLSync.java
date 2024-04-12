/*    */ package org.lwjgl.opengl;
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
/*    */ public final class GLSync
/*    */   implements PointerWrapper
/*    */ {
/*    */   private final long sync;
/*    */   
/*    */   GLSync(long sync) {
/* 42 */     this.sync = sync;
/*    */   }
/*    */   
/*    */   public long getPointer() {
/* 46 */     return this.sync;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GLSync.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */