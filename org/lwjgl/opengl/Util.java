/*    */ package org.lwjgl.opengl;
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
/*    */ 
/*    */ public final class Util
/*    */ {
/*    */   public static void checkGLError() throws OpenGLException {
/* 54 */     int err = GL11.glGetError();
/* 55 */     if (err != 0) {
/* 56 */       throw new OpenGLException(err);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String translateGLErrorString(int error_code) {
/* 64 */     switch (error_code) {
/*    */       case 0:
/* 66 */         return "No error";
/*    */       case 1280:
/* 68 */         return "Invalid enum";
/*    */       case 1281:
/* 70 */         return "Invalid value";
/*    */       case 1282:
/* 72 */         return "Invalid operation";
/*    */       case 1283:
/* 74 */         return "Stack overflow";
/*    */       case 1284:
/* 76 */         return "Stack underflow";
/*    */       case 1285:
/* 78 */         return "Out of memory";
/*    */       case 32817:
/* 80 */         return "Table too large";
/*    */       case 1286:
/* 82 */         return "Invalid framebuffer operation";
/*    */     } 
/* 84 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\Util.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */