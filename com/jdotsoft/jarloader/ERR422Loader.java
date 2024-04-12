/*    */ package com.jdotsoft.jarloader;
/*    */ 
/*    */ public class ERR422Loader {
/*    */   public static void main(String[] args) {
/*  5 */     JarClassLoader err422 = new JarClassLoader();
/*    */     try {
/*  7 */       err422.invokeMain("net.minecraft.client.Minecraft", args);
/*  8 */     } catch (Throwable e) {
/*    */       
/* 10 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\com\jdotsoft\jarloader\ERR422Loader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */