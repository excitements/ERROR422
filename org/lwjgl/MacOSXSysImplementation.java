/*    */ package org.lwjgl;
/*    */ 
/*    */ import com.apple.eio.FileManager;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ final class MacOSXSysImplementation
/*    */   extends J2SESysImplementation
/*    */ {
/*    */   private static final int JNI_VERSION = 18;
/*    */   
/*    */   static {
/* 49 */     Toolkit.getDefaultToolkit();
/*    */   }
/*    */   
/*    */   public int getRequiredJNIVersion() {
/* 53 */     return 18;
/*    */   }
/*    */   
/*    */   public boolean openURL(String url) {
/*    */     try {
/* 58 */       FileManager.openURL(url);
/* 59 */       return true;
/* 60 */     } catch (Exception e) {
/* 61 */       LWJGLUtil.log("Exception occurred while trying to invoke browser: " + e);
/* 62 */       return false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\MacOSXSysImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */