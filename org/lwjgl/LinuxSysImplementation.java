/*    */ package org.lwjgl;
/*    */ 
/*    */ import java.awt.Toolkit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class LinuxSysImplementation
/*    */   extends J2SESysImplementation
/*    */ {
/*    */   private static final int JNI_VERSION = 18;
/*    */   
/*    */   static {
/* 45 */     Toolkit.getDefaultToolkit();
/*    */   }
/*    */   
/*    */   public int getRequiredJNIVersion() {
/* 49 */     return 18;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean openURL(String url) {
/* 56 */     String[] browsers = { "xdg-open", "firefox", "mozilla", "opera", "konqueror", "nautilus", "galeon", "netscape" };
/*    */     
/* 58 */     for (int i = 0; i < browsers.length; i++) {
/* 59 */       String browser = browsers[i];
/*    */       try {
/* 61 */         LWJGLUtil.execPrivileged(new String[] { browser, url });
/* 62 */         return true;
/* 63 */       } catch (Exception e) {
/*    */         
/* 65 */         e.printStackTrace(System.err);
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 70 */     return false;
/*    */   }
/*    */   
/*    */   public boolean has64Bit() {
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\LinuxSysImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */