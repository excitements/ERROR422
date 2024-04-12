/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class LinuxCombinedController
/*    */   extends AbstractController {
/*    */   private LinuxAbstractController eventController;
/*    */   private LinuxJoystickAbstractController joystickController;
/*    */   
/*    */   LinuxCombinedController(LinuxAbstractController eventController, LinuxJoystickAbstractController joystickController) {
/* 11 */     super(eventController.getName(), joystickController.getComponents(), eventController.getControllers(), eventController.getRumblers());
/* 12 */     this.eventController = eventController;
/* 13 */     this.joystickController = joystickController;
/*    */   }
/*    */   
/*    */   protected boolean getNextDeviceEvent(Event event) throws IOException {
/* 17 */     return this.joystickController.getNextDeviceEvent(event);
/*    */   }
/*    */   
/*    */   public final Controller.PortType getPortType() {
/* 21 */     return this.eventController.getPortType();
/*    */   }
/*    */   
/*    */   public final void pollDevice() throws IOException {
/* 25 */     this.eventController.pollDevice();
/* 26 */     this.joystickController.pollDevice();
/*    */   }
/*    */   
/*    */   public Controller.Type getType() {
/* 30 */     return this.eventController.getType();
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxCombinedController.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */