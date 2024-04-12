/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import org.lwjgl.LWJGLException;
/*    */ import org.lwjgl.Sys;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class WindowsRegistry
/*    */ {
/*    */   static final int HKEY_CLASSES_ROOT = 1;
/*    */   static final int HKEY_CURRENT_USER = 2;
/*    */   static final int HKEY_LOCAL_MACHINE = 3;
/*    */   static final int HKEY_USERS = 4;
/*    */   
/*    */   static {
/* 49 */     Sys.initialize();
/*    */   }
/*    */ 
/*    */   
/*    */   private static native String nQueryRegistrationKey(int paramInt, String paramString1, String paramString2) throws LWJGLException;
/*    */   
/*    */   static String queryRegistrationKey(int root_key, String subkey, String value) throws LWJGLException {
/* 56 */     switch (root_key) {
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       case 1:
/*    */       case 2:
/*    */       case 3:
/*    */       case 4:
/* 65 */         return nQueryRegistrationKey(root_key, subkey, value);
/*    */     } 
/*    */     throw new IllegalArgumentException("Invalid enum: " + root_key);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsRegistry.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */