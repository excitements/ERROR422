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
/*    */ final class LinuxKeyboard
/*    */   extends Keyboard
/*    */ {
/*    */   private final Controller.PortType port;
/*    */   private final LinuxEventDevice device;
/*    */   
/*    */   protected LinuxKeyboard(LinuxEventDevice device, Component[] components, Controller[] children, Rumbler[] rumblers) throws IOException {
/* 52 */     super(device.getName(), components, children, rumblers);
/* 53 */     this.device = device;
/* 54 */     this.port = device.getPortType();
/*    */   }
/*    */   
/*    */   public final Controller.PortType getPortType() {
/* 58 */     return this.port;
/*    */   }
/*    */   
/*    */   protected final boolean getNextDeviceEvent(Event event) throws IOException {
/* 62 */     return LinuxControllers.getNextDeviceEvent(event, this.device);
/*    */   }
/*    */   
/*    */   public final void pollDevice() throws IOException {
/* 66 */     this.device.pollKeyStates();
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxKeyboard.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */