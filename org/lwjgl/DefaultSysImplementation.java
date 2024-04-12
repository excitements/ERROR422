/*    */ package org.lwjgl;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class DefaultSysImplementation
/*    */   implements SysImplementation
/*    */ {
/*    */   public native int getJNIVersion();
/*    */   
/*    */   public native void setDebug(boolean paramBoolean);
/*    */   
/*    */   public long getTimerResolution() {
/* 46 */     return 1000L;
/*    */   }
/*    */   
/*    */   public boolean has64Bit() {
/* 50 */     return false;
/*    */   }
/*    */   
/*    */   public abstract long getTime();
/*    */   
/*    */   public abstract void alert(String paramString1, String paramString2);
/*    */   
/*    */   public abstract String getClipboard();
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\DefaultSysImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */