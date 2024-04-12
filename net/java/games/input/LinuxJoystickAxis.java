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
/*    */ class LinuxJoystickAxis
/*    */   extends AbstractComponent
/*    */ {
/*    */   private float value;
/*    */   private boolean analog;
/*    */   
/*    */   public LinuxJoystickAxis(Component.Identifier.Axis axis_id) {
/* 52 */     this(axis_id, true);
/*    */   }
/*    */   
/*    */   public LinuxJoystickAxis(Component.Identifier.Axis axis_id, boolean analog) {
/* 56 */     super(axis_id.getName(), axis_id);
/* 57 */     this.analog = analog;
/*    */   }
/*    */   
/*    */   public final boolean isRelative() {
/* 61 */     return false;
/*    */   }
/*    */   
/*    */   public final boolean isAnalog() {
/* 65 */     return this.analog;
/*    */   }
/*    */   
/*    */   final void setValue(float value) {
/* 69 */     this.value = value;
/* 70 */     resetHasPolled();
/*    */   }
/*    */   
/*    */   protected final float poll() throws IOException {
/* 74 */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxJoystickAxis.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */