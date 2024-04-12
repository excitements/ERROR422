/*     */ package net.java.games.input;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.java.games.util.plugins.Plugin;
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
/*     */ public class WinTabEnvironmentPlugin
/*     */   extends ControllerEnvironment
/*     */   implements Plugin
/*     */ {
/*     */   private static boolean supported = false;
/*     */   private final Controller[] controllers;
/*     */   
/*     */   static void loadLibrary(final String lib_name) {
/*  47 */     AccessController.doPrivileged(new PrivilegedAction() { private final String val$lib_name;
/*     */           
/*     */           public final Object run() {
/*     */             try {
/*  51 */               String lib_path = System.getProperty("net.java.games.input.librarypath");
/*  52 */               if (lib_path != null)
/*  53 */               { System.load(lib_path + File.separator + System.mapLibraryName(lib_name)); }
/*     */               else
/*  55 */               { System.loadLibrary(lib_name); } 
/*  56 */             } catch (UnsatisfiedLinkError e) {
/*  57 */               e.printStackTrace();
/*  58 */               WinTabEnvironmentPlugin.supported = false;
/*     */             } 
/*  60 */             return null;
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   static String getPrivilegedProperty(final String property) {
/*  66 */     return AccessController.<String>doPrivileged(new PrivilegedAction() { private final String val$property;
/*     */           public Object run() {
/*  68 */             return System.getProperty(property);
/*     */           } }
/*     */       );
/*     */   }
/*     */ 
/*     */   
/*     */   static String getPrivilegedProperty(final String property, final String default_value) {
/*  75 */     return AccessController.<String>doPrivileged(new PrivilegedAction() { private final String val$property;
/*     */           public Object run() {
/*  77 */             return System.getProperty(property, default_value);
/*     */           }
/*     */           private final String val$default_value; }
/*     */       );
/*     */   }
/*     */   static {
/*  83 */     String osName = getPrivilegedProperty("os.name", "").trim();
/*  84 */     if (osName.startsWith("Windows")) {
/*  85 */       supported = true;
/*  86 */       loadLibrary("jinput-wintab");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*  91 */   private final List active_devices = new ArrayList();
/*     */   
/*     */   private final WinTabContext winTabContext;
/*     */   
/*     */   public WinTabEnvironmentPlugin() {
/*  96 */     if (isSupported()) {
/*  97 */       DummyWindow window = null;
/*  98 */       WinTabContext winTabContext = null;
/*  99 */       Controller[] controllers = new Controller[0];
/*     */       try {
/* 101 */         window = new DummyWindow();
/* 102 */         winTabContext = new WinTabContext(window);
/*     */         try {
/* 104 */           winTabContext.open();
/* 105 */           controllers = winTabContext.getControllers();
/* 106 */         } catch (Exception e) {
/* 107 */           window.destroy();
/* 108 */           throw e;
/*     */         } 
/* 110 */       } catch (Exception e) {
/* 111 */         logln("Failed to enumerate devices: " + e.getMessage());
/* 112 */         e.printStackTrace();
/*     */       } 
/* 114 */       this.controllers = controllers;
/* 115 */       this.winTabContext = winTabContext;
/* 116 */       AccessController.doPrivileged(new PrivilegedAction() { private final WinTabEnvironmentPlugin this$0;
/*     */             
/*     */             public final Object run() {
/* 119 */               Runtime.getRuntime().addShutdownHook(new WinTabEnvironmentPlugin.ShutdownHook());
/* 120 */               return null;
/*     */             } }
/*     */         );
/*     */     } else {
/* 124 */       this.winTabContext = null;
/* 125 */       this.controllers = new Controller[0];
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isSupported() {
/* 130 */     return supported;
/*     */   }
/*     */   
/*     */   public Controller[] getControllers() {
/* 134 */     return this.controllers;
/*     */   }
/*     */   private final class ShutdownHook extends Thread { private final WinTabEnvironmentPlugin this$0;
/*     */     private ShutdownHook() {}
/*     */     
/*     */     public final void run() {
/* 140 */       for (int i = 0; i < WinTabEnvironmentPlugin.this.active_devices.size(); i++);
/*     */ 
/*     */ 
/*     */       
/* 144 */       WinTabEnvironmentPlugin.this.winTabContext.close();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\WinTabEnvironmentPlugin.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */