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
/*    */ class ReferencesStack
/*    */ {
/*    */   private References[] references_stack;
/*    */   private int stack_pos;
/*    */   
/*    */   public References getReferences() {
/* 39 */     return this.references_stack[this.stack_pos];
/*    */   }
/*    */   
/*    */   public void pushState() {
/* 43 */     int pos = ++this.stack_pos;
/* 44 */     if (pos == this.references_stack.length) {
/* 45 */       growStack();
/*    */     }
/* 47 */     this.references_stack[pos].copy(this.references_stack[pos - 1], -1);
/*    */   }
/*    */   
/*    */   public References popState(int mask) {
/* 51 */     References result = this.references_stack[this.stack_pos--];
/*    */     
/* 53 */     this.references_stack[this.stack_pos].copy(result, mask ^ 0xFFFFFFFF);
/* 54 */     result.clear();
/*    */     
/* 56 */     return result;
/*    */   }
/*    */   
/*    */   private void growStack() {
/* 60 */     References[] new_references_stack = new References[this.references_stack.length + 1];
/* 61 */     System.arraycopy(this.references_stack, 0, new_references_stack, 0, this.references_stack.length);
/* 62 */     this.references_stack = new_references_stack;
/* 63 */     this.references_stack[this.references_stack.length - 1] = new References(GLContext.getCapabilities());
/*    */   }
/*    */   
/*    */   ReferencesStack() {
/* 67 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 68 */     this.references_stack = new References[1];
/* 69 */     this.stack_pos = 0;
/* 70 */     for (int i = 0; i < this.references_stack.length; i++)
/* 71 */       this.references_stack[i] = new References(caps); 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ReferencesStack.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */