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
/*    */ abstract class RawDeviceInfo
/*    */ {
/*    */   public abstract Controller createControllerFromDevice(RawDevice paramRawDevice, SetupAPIDevice paramSetupAPIDevice) throws IOException;
/*    */   
/*    */   public abstract int getUsage();
/*    */   
/*    */   public abstract int getUsagePage();
/*    */   
/*    */   public abstract long getHandle();
/*    */   
/*    */   public final boolean equals(Object other) {
/* 57 */     if (!(other instanceof RawDeviceInfo))
/* 58 */       return false; 
/* 59 */     RawDeviceInfo other_info = (RawDeviceInfo)other;
/* 60 */     return (other_info.getUsage() == getUsage() && other_info.getUsagePage() == getUsagePage());
/*    */   }
/*    */ 
/*    */   
/*    */   public final int hashCode() {
/* 65 */     return getUsage() ^ getUsagePage();
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\RawDeviceInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */