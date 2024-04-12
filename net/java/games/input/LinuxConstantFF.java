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
/*    */ final class LinuxConstantFF
/*    */   extends LinuxForceFeedbackEffect
/*    */ {
/*    */   public LinuxConstantFF(LinuxEventDevice device) throws IOException {
/* 35 */     super(device);
/*    */   }
/*    */   
/*    */   protected final int upload(int id, float intensity) throws IOException {
/* 39 */     int scaled_intensity = Math.round(intensity * 32767.0F);
/* 40 */     return getDevice().uploadConstantEffect(id, 0, 0, 0, 0, 0, scaled_intensity, 0, 0, 0, 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxConstantFF.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */