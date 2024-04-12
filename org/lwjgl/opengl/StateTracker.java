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
/*    */ 
/*    */ 
/*    */ final class StateTracker
/*    */ {
/*    */   private ReferencesStack references_stack;
/* 41 */   private final StateStack attrib_stack = new StateStack(0);
/*    */   
/*    */   private boolean insideBeginEnd;
/*    */   
/*    */   void init() {
/* 46 */     this.references_stack = new ReferencesStack();
/*    */   }
/*    */   
/*    */   static void setBeginEnd(ContextCapabilities caps, boolean inside) {
/* 50 */     caps.tracker.insideBeginEnd = inside;
/*    */   }
/*    */   
/*    */   boolean isBeginEnd() {
/* 54 */     return this.insideBeginEnd;
/*    */   }
/*    */   
/*    */   static void popAttrib(ContextCapabilities caps) {
/* 58 */     caps.tracker.doPopAttrib();
/*    */   }
/*    */   
/*    */   private void doPopAttrib() {
/* 62 */     this.references_stack.popState(this.attrib_stack.popState());
/*    */   }
/*    */   
/*    */   static void pushAttrib(ContextCapabilities caps, int mask) {
/* 66 */     caps.tracker.doPushAttrib(mask);
/*    */   }
/*    */   
/*    */   private void doPushAttrib(int mask) {
/* 70 */     this.attrib_stack.pushState(mask);
/* 71 */     this.references_stack.pushState();
/*    */   }
/*    */   
/*    */   static ReferencesStack getReferencesStack(ContextCapabilities caps) {
/* 75 */     return caps.tracker.references_stack;
/*    */   }
/*    */   
/*    */   static void bindBuffer(ContextCapabilities caps, int target, int buffer) {
/* 79 */     ReferencesStack references_stack = getReferencesStack(caps);
/* 80 */     switch (target) {
/*    */       case 34963:
/* 82 */         (references_stack.getReferences()).elementArrayBuffer = buffer;
/*    */         break;
/*    */       case 34962:
/* 85 */         (references_stack.getReferences()).arrayBuffer = buffer;
/*    */         break;
/*    */       case 35051:
/* 88 */         (references_stack.getReferences()).pixelPackBuffer = buffer;
/*    */         break;
/*    */       case 35052:
/* 91 */         (references_stack.getReferences()).pixelUnpackBuffer = buffer;
/*    */         break;
/*    */       case 36671:
/* 94 */         (references_stack.getReferences()).indirectBuffer = buffer;
/*    */         break;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\StateTracker.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */