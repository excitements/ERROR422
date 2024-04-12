/*    */ package org.lwjgl.openal;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Util
/*    */ {
/*    */   public static void checkALCError(ALCdevice device) {
/* 53 */     int err = ALC10.alcGetError(device);
/* 54 */     if (err != 0) {
/* 55 */       throw new OpenALException(ALC10.alcGetString(AL.getDevice(), err));
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void checkALError() {
/* 62 */     int err = AL10.alGetError();
/* 63 */     if (err != 0) {
/* 64 */       throw new OpenALException(err);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void checkALCValidDevice(ALCdevice device) {
/* 72 */     if (!device.isValid()) {
/* 73 */       throw new OpenALException("Invalid device: " + device);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void checkALCValidContext(ALCcontext context) {
/* 82 */     if (!context.isValid())
/* 83 */       throw new OpenALException("Invalid context: " + context); 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\Util.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */