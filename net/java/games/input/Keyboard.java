/*    */ package net.java.games.input;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Keyboard
/*    */   extends AbstractController
/*    */ {
/*    */   protected Keyboard(String name, Component[] keys, Controller[] children, Rumbler[] rumblers) {
/* 53 */     super(name, keys, children, rumblers);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Controller.Type getType() {
/* 60 */     return Controller.Type.KEYBOARD;
/*    */   }
/*    */   
/*    */   public final boolean isKeyDown(Component.Identifier.Key key_id) {
/* 64 */     Component key = getComponent(key_id);
/* 65 */     if (key == null)
/* 66 */       return false; 
/* 67 */     return (key.getPollData() != 0.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\Keyboard.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */