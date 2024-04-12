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
/*    */ final class LinuxAbstractController
/*    */   extends AbstractController
/*    */ {
/*    */   private final Controller.PortType port;
/*    */   private final LinuxEventDevice device;
/*    */   private final Controller.Type type;
/*    */   
/*    */   protected LinuxAbstractController(LinuxEventDevice device, Component[] components, Controller[] children, Rumbler[] rumblers, Controller.Type type) throws IOException {
/* 53 */     super(device.getName(), components, children, rumblers);
/* 54 */     this.device = device;
/* 55 */     this.port = device.getPortType();
/* 56 */     this.type = type;
/*    */   }
/*    */   
/*    */   public final Controller.PortType getPortType() {
/* 60 */     return this.port;
/*    */   }
/*    */   
/*    */   public final void pollDevice() throws IOException {
/* 64 */     this.device.pollKeyStates();
/*    */   }
/*    */   
/*    */   protected final boolean getNextDeviceEvent(Event event) throws IOException {
/* 68 */     return LinuxControllers.getNextDeviceEvent(event, this.device);
/*    */   }
/*    */   
/*    */   public Controller.Type getType() {
/* 72 */     return this.type;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxAbstractController.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */