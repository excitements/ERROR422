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
/*    */ final class LinuxControllers
/*    */ {
/* 48 */   private static final LinuxEvent linux_event = new LinuxEvent();
/*    */ 
/*    */   
/*    */   public static final synchronized boolean getNextDeviceEvent(Event event, LinuxEventDevice device) throws IOException {
/* 52 */     while (device.getNextEvent(linux_event)) {
/* 53 */       LinuxAxisDescriptor descriptor = linux_event.getDescriptor();
/* 54 */       LinuxComponent component = device.mapDescriptor(descriptor);
/* 55 */       if (component != null) {
/* 56 */         float value = component.convertValue(linux_event.getValue(), descriptor);
/* 57 */         event.set(component, value, linux_event.getNanos());
/* 58 */         return true;
/*    */       } 
/*    */     } 
/* 61 */     return false;
/*    */   }
/*    */   
/* 64 */   private static final LinuxAbsInfo abs_info = new LinuxAbsInfo();
/*    */   public static final synchronized float poll(LinuxEventComponent event_component) throws IOException {
/*    */     int native_code;
/*    */     float state;
/* 68 */     int native_type = event_component.getDescriptor().getType();
/* 69 */     switch (native_type) {
/*    */       case 1:
/* 71 */         native_code = event_component.getDescriptor().getCode();
/* 72 */         state = event_component.getDevice().isKeySet(native_code) ? 1.0F : 0.0F;
/* 73 */         return state;
/*    */       case 3:
/* 75 */         event_component.getAbsInfo(abs_info);
/* 76 */         return abs_info.getValue();
/*    */     } 
/* 78 */     throw new RuntimeException("Unkown native_type: " + native_type);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxControllers.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */