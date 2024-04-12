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
/*    */ final class LinuxRumbleFF
/*    */   extends LinuxForceFeedbackEffect
/*    */ {
/*    */   public LinuxRumbleFF(LinuxEventDevice device) throws IOException {
/* 35 */     super(device);
/*    */   }
/*    */   
/*    */   protected final int upload(int id, float intensity) throws IOException {
/*    */     int weak_magnitude;
/*    */     int strong_magnitude;
/* 41 */     if (intensity > 0.666666F) {
/* 42 */       strong_magnitude = (int)(32768.0F * intensity);
/* 43 */       weak_magnitude = (int)(49152.0F * intensity);
/* 44 */     } else if (intensity > 0.3333333F) {
/* 45 */       strong_magnitude = (int)(32768.0F * intensity);
/* 46 */       weak_magnitude = 0;
/*    */     } else {
/* 48 */       strong_magnitude = 0;
/* 49 */       weak_magnitude = (int)(49152.0F * intensity);
/*    */     } 
/*    */     
/* 52 */     return getDevice().uploadRumbleEffect(id, 0, 0, 0, -1, 0, strong_magnitude, weak_magnitude);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxRumbleFF.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */