/*     */ package org.lwjgl;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedActionException;
/*     */ import java.security.PrivilegedExceptionAction;
/*     */ import org.lwjgl.opengl.Display;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class WindowsSysImplementation
/*     */   extends DefaultSysImplementation
/*     */ {
/*     */   private static final int JNI_VERSION = 22;
/*     */   static Class class$org$lwjgl$opengl$Display;
/*     */   
/*     */   static {
/*  51 */     Sys.initialize();
/*     */   }
/*     */   
/*     */   public int getRequiredJNIVersion() {
/*  55 */     return 22;
/*     */   }
/*     */   
/*     */   public long getTimerResolution() {
/*  59 */     return 1000L;
/*     */   }
/*     */   
/*     */   public long getTime() {
/*  63 */     return nGetTime();
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean has64Bit() {
/*  68 */     return true;
/*     */   }
/*     */   
/*     */   private static long getHwnd() {
/*  72 */     if (!Display.isCreated()) {
/*  73 */       return 0L;
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/*  78 */       Long hwnd_obj = AccessController.<Long>doPrivileged(new PrivilegedExceptionAction() {
/*     */             public Object run() throws Exception {
/*  80 */               Method getImplementation_method = ((WindowsSysImplementation.class$org$lwjgl$opengl$Display == null) ? (WindowsSysImplementation.class$org$lwjgl$opengl$Display = WindowsSysImplementation.class$("org.lwjgl.opengl.Display")) : WindowsSysImplementation.class$org$lwjgl$opengl$Display).getDeclaredMethod("getImplementation", null);
/*  81 */               getImplementation_method.setAccessible(true);
/*  82 */               Object display_impl = getImplementation_method.invoke(null, null);
/*  83 */               Class WindowsDisplay_class = Class.forName("org.lwjgl.opengl.WindowsDisplay");
/*  84 */               Method getHwnd_method = WindowsDisplay_class.getDeclaredMethod("getHwnd", null);
/*  85 */               getHwnd_method.setAccessible(true);
/*  86 */               Long hwnd = (Long)getHwnd_method.invoke(display_impl, null);
/*  87 */               return hwnd;
/*     */             }
/*     */           });
/*  90 */       return hwnd_obj.longValue();
/*  91 */     } catch (PrivilegedActionException e) {
/*  92 */       throw new Error(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void alert(String title, String message) {
/*  97 */     if (!Display.isCreated()) {
/*  98 */       initCommonControls();
/*     */     }
/* 100 */     nAlert(getHwnd(), title, message);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean openURL(String url) {
/*     */     try {
/* 107 */       LWJGLUtil.execPrivileged(new String[] { "rundll32", "url.dll,FileProtocolHandler", url });
/* 108 */       return true;
/* 109 */     } catch (Exception e) {
/* 110 */       LWJGLUtil.log("Failed to open url (" + url + "): " + e.getMessage());
/* 111 */       return false;
/*     */     } 
/*     */   } static Class class$(String x0) { try { return Class.forName(x0); }
/*     */     catch (ClassNotFoundException x1)
/*     */     { throw (new NoClassDefFoundError()).initCause(x1); }
/* 116 */      } public String getClipboard() { return nGetClipboard(); }
/*     */ 
/*     */   
/*     */   private static native long nGetTime();
/*     */   
/*     */   private static native void nAlert(long paramLong, String paramString1, String paramString2);
/*     */   
/*     */   private static native void initCommonControls();
/*     */   
/*     */   private static native String nGetClipboard();
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\WindowsSysImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */