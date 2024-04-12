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
/*    */ 
/*    */ class RawHIDInfo
/*    */   extends RawDeviceInfo
/*    */ {
/*    */   private final RawDevice device;
/*    */   private final int vendor_id;
/*    */   private final int product_id;
/*    */   private final int version;
/*    */   private final int page;
/*    */   private final int usage;
/*    */   
/*    */   public RawHIDInfo(RawDevice device, int vendor_id, int product_id, int version, int page, int usage) {
/* 57 */     this.device = device;
/* 58 */     this.vendor_id = vendor_id;
/* 59 */     this.product_id = product_id;
/* 60 */     this.version = version;
/* 61 */     this.page = page;
/* 62 */     this.usage = usage;
/*    */   }
/*    */   
/*    */   public final int getUsage() {
/* 66 */     return this.usage;
/*    */   }
/*    */   
/*    */   public final int getUsagePage() {
/* 70 */     return this.page;
/*    */   }
/*    */   
/*    */   public final long getHandle() {
/* 74 */     return this.device.getHandle();
/*    */   }
/*    */   
/*    */   public final Controller createControllerFromDevice(RawDevice device, SetupAPIDevice setupapi_device) throws IOException {
/* 78 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\RawHIDInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */