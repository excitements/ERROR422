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
/*    */ final class DIMouse
/*    */   extends Mouse
/*    */ {
/*    */   private final IDirectInputDevice device;
/*    */   
/*    */   protected DIMouse(IDirectInputDevice device, Component[] components, Controller[] children, Rumbler[] rumblers) {
/* 51 */     super(device.getProductName(), components, children, rumblers);
/* 52 */     this.device = device;
/*    */   }
/*    */   
/*    */   public final void pollDevice() throws IOException {
/* 56 */     this.device.pollAll();
/*    */   }
/*    */   
/*    */   protected final boolean getNextDeviceEvent(Event event) throws IOException {
/* 60 */     return DIControllers.getNextDeviceEvent(event, this.device);
/*    */   }
/*    */   
/*    */   protected final void setDeviceEventQueueSize(int size) throws IOException {
/* 64 */     this.device.setBufferSize(size);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\DIMouse.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */