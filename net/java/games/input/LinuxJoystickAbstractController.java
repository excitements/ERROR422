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
/*    */ final class LinuxJoystickAbstractController
/*    */   extends AbstractController
/*    */ {
/*    */   private final LinuxJoystickDevice device;
/*    */   
/*    */   protected LinuxJoystickAbstractController(LinuxJoystickDevice device, Component[] components, Controller[] children, Rumbler[] rumblers) {
/* 51 */     super(device.getName(), components, children, rumblers);
/* 52 */     this.device = device;
/*    */   }
/*    */   
/*    */   protected final void setDeviceEventQueueSize(int size) throws IOException {
/* 56 */     this.device.setBufferSize(size);
/*    */   }
/*    */   
/*    */   public final void pollDevice() throws IOException {
/* 60 */     this.device.poll();
/*    */   }
/*    */   
/*    */   protected final boolean getNextDeviceEvent(Event event) throws IOException {
/* 64 */     return this.device.getNextEvent(event);
/*    */   }
/*    */   
/*    */   public Controller.Type getType() {
/* 68 */     return Controller.Type.STICK;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxJoystickAbstractController.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */