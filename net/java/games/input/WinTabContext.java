/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WinTabContext
/*    */ {
/*    */   private DummyWindow window;
/*    */   private long hCTX;
/*    */   private Controller[] controllers;
/*    */   
/*    */   public WinTabContext(DummyWindow window) {
/* 38 */     this.window = window;
/*    */   }
/*    */   
/*    */   public Controller[] getControllers() {
/* 42 */     if (this.hCTX == 0L) {
/* 43 */       throw new IllegalStateException("Context must be open before getting the controllers");
/*    */     }
/* 45 */     return this.controllers;
/*    */   }
/*    */   
/*    */   public synchronized void open() {
/* 49 */     this.hCTX = nOpen(this.window.getHwnd());
/* 50 */     List devices = new ArrayList();
/*    */     
/* 52 */     int numSupportedDevices = nGetNumberOfSupportedDevices();
/* 53 */     for (int i = 0; i < numSupportedDevices; i++) {
/* 54 */       WinTabDevice newDevice = WinTabDevice.createDevice(this, i);
/* 55 */       if (newDevice != null) {
/* 56 */         devices.add(newDevice);
/*    */       }
/*    */     } 
/*    */     
/* 60 */     this.controllers = devices.<Controller>toArray(new Controller[0]);
/*    */   }
/*    */   
/*    */   public synchronized void close() {
/* 64 */     nClose(this.hCTX);
/*    */   }
/*    */   
/*    */   public synchronized void processEvents() {
/* 68 */     WinTabPacket[] packets = nGetPackets(this.hCTX);
/* 69 */     for (int i = 0; i < packets.length; i++)
/*    */     {
/*    */ 
/*    */ 
/*    */       
/* 74 */       ((WinTabDevice)getControllers()[0]).processPacket(packets[i]);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final native int nGetNumberOfSupportedDevices();
/*    */   
/*    */   private static final native long nOpen(long paramLong);
/*    */   
/*    */   private static final native void nClose(long paramLong);
/*    */   
/*    */   private static final native WinTabPacket[] nGetPackets(long paramLong);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\WinTabContext.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */