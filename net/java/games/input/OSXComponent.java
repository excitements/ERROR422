/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class OSXComponent
/*    */   extends AbstractComponent
/*    */ {
/*    */   private final OSXHIDElement element;
/*    */   
/*    */   public OSXComponent(Component.Identifier id, OSXHIDElement element) {
/* 51 */     super(id.getName(), id);
/* 52 */     this.element = element;
/*    */   }
/*    */   
/*    */   public final boolean isRelative() {
/* 56 */     return this.element.isRelative();
/*    */   }
/*    */   
/*    */   public boolean isAnalog() {
/* 60 */     return this.element.isAnalog();
/*    */   }
/*    */   
/*    */   public final OSXHIDElement getElement() {
/* 64 */     return this.element;
/*    */   }
/*    */   
/*    */   protected float poll() throws IOException {
/* 68 */     return OSXControllers.poll(this.element);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\OSXComponent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */