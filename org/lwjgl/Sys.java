/*     */ package org.lwjgl;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.security.PrivilegedExceptionAction;
/*     */ import org.lwjgl.input.Mouse;
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
/*     */ public final class Sys
/*     */ {
/*     */   private static final String JNI_LIBRARY_NAME = "lwjgl";
/*     */   private static final String VERSION = "2.4.2";
/*     */   
/*     */   private static void doLoadLibrary(final String lib_name) {
/*  65 */     AccessController.doPrivileged(new PrivilegedAction() { private final String val$lib_name;
/*     */           public Object run() {
/*  67 */             String library_path = System.getProperty("org.lwjgl.librarypath");
/*  68 */             if (library_path != null) {
/*  69 */               System.load(library_path + File.separator + System.mapLibraryName(lib_name));
/*     */             } else {
/*     */               
/*  72 */               System.loadLibrary(lib_name);
/*     */             } 
/*  74 */             return null;
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   private static void loadLibrary(String lib_name) {
/*     */     try {
/*  81 */       doLoadLibrary(lib_name);
/*  82 */     } catch (UnsatisfiedLinkError e) {
/*  83 */       if (implementation.has64Bit()) {
/*     */         try {
/*  85 */           doLoadLibrary(lib_name + "64");
/*     */           return;
/*  87 */         } catch (UnsatisfiedLinkError e2) {
/*  88 */           LWJGLUtil.log("Failed to load 64 bit library: " + e2.getMessage());
/*     */         } 
/*     */       }
/*     */       
/*  92 */       throw e;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*  97 */   private static final SysImplementation implementation = createImplementation(); private static final String POSTFIX64BIT = "64"; static {
/*  98 */     loadLibrary("lwjgl");
/*     */     
/* 100 */     int native_jni_version = implementation.getJNIVersion();
/* 101 */     int required_version = implementation.getRequiredJNIVersion();
/* 102 */     if (native_jni_version != required_version) {
/* 103 */       throw new LinkageError("Version mismatch: jar version is '" + required_version + "', native libary version is '" + native_jni_version + "'");
/*     */     }
/* 105 */     implementation.setDebug(LWJGLUtil.DEBUG);
/*     */   }
/*     */   static Class class$java$lang$String; static Class class$java$net$URL;
/*     */   private static SysImplementation createImplementation() {
/* 109 */     switch (LWJGLUtil.getPlatform()) {
/*     */       case 1:
/* 111 */         return new LinuxSysImplementation();
/*     */       case 3:
/* 113 */         return new WindowsSysImplementation();
/*     */       case 2:
/* 115 */         return new MacOSXSysImplementation();
/*     */     } 
/* 117 */     throw new IllegalStateException("Unsupported platform");
/*     */   }
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
/*     */   public static String getVersion() {
/* 131 */     return "2.4.2";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void initialize() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getTimerResolution() {
/* 147 */     return implementation.getTimerResolution();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getTime() {
/* 158 */     return implementation.getTime() & Long.MAX_VALUE;
/*     */   }
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
/*     */   public static void alert(String title, String message) {
/* 180 */     boolean grabbed = Mouse.isGrabbed();
/* 181 */     if (grabbed) {
/* 182 */       Mouse.setGrabbed(false);
/*     */     }
/* 184 */     if (title == null)
/* 185 */       title = ""; 
/* 186 */     if (message == null)
/* 187 */       message = ""; 
/* 188 */     implementation.alert(title, message);
/* 189 */     if (grabbed) {
/* 190 */       Mouse.setGrabbed(true);
/*     */     }
/*     */   }
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
/*     */   public static boolean openURL(String url) {
/*     */     try {
/* 211 */       final Class serviceManagerClass = Class.forName("javax.jnlp.ServiceManager");
/* 212 */       Method lookupMethod = AccessController.<Method>doPrivileged(new PrivilegedExceptionAction() { private final Class val$serviceManagerClass;
/*     */             public Object run() throws Exception {
/* 214 */               return serviceManagerClass.getMethod("lookup", new Class[] { (Sys.class$java$lang$String == null) ? (Sys.class$java$lang$String = Sys.class$("java.lang.String")) : Sys.class$java$lang$String });
/*     */             } }
/*     */         );
/* 217 */       Object basicService = lookupMethod.invoke(serviceManagerClass, new Object[] { "javax.jnlp.BasicService" });
/* 218 */       final Class basicServiceClass = Class.forName("javax.jnlp.BasicService");
/* 219 */       Method showDocumentMethod = AccessController.<Method>doPrivileged(new PrivilegedExceptionAction() { private final Class val$basicServiceClass;
/*     */             public Object run() throws Exception {
/* 221 */               return basicServiceClass.getMethod("showDocument", new Class[] { (Sys.class$java$net$URL == null) ? (Sys.class$java$net$URL = Sys.class$("java.net.URL")) : Sys.class$java$net$URL });
/*     */             } }
/*     */         );
/*     */       try {
/* 225 */         Boolean ret = (Boolean)showDocumentMethod.invoke(basicService, new Object[] { new URL(url) });
/* 226 */         return ret.booleanValue();
/* 227 */       } catch (MalformedURLException e) {
/* 228 */         e.printStackTrace(System.err);
/* 229 */         return false;
/*     */       } 
/* 231 */     } catch (Exception ue) {
/* 232 */       return implementation.openURL(url);
/*     */     } 
/*     */   }
/*     */   
/*     */   static Class class$(String x0) {
/*     */     try {
/*     */       return Class.forName(x0);
/*     */     } catch (ClassNotFoundException x1) {
/*     */       throw (new NoClassDefFoundError()).initCause(x1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String getClipboard() {
/* 245 */     return implementation.getClipboard();
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\Sys.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */