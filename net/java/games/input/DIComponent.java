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
/*    */ final class DIComponent
/*    */   extends AbstractComponent
/*    */ {
/*    */   private final DIDeviceObject object;
/*    */   
/*    */   public DIComponent(Component.Identifier identifier, DIDeviceObject object) {
/* 51 */     super(object.getName(), identifier);
/* 52 */     this.object = object;
/*    */   }
/*    */   
/*    */   public final boolean isRelative() {
/* 56 */     return this.object.isRelative();
/*    */   }
/*    */   
/*    */   public final boolean isAnalog() {
/* 60 */     return this.object.isAnalog();
/*    */   }
/*    */   
/*    */   public final float getDeadZone() {
/* 64 */     return this.object.getDeadzone();
/*    */   }
/*    */   
/*    */   public final DIDeviceObject getDeviceObject() {
/* 68 */     return this.object;
/*    */   }
/*    */   
/*    */   protected final float poll() throws IOException {
/* 72 */     return DIControllers.poll(this, this.object);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\DIComponent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */