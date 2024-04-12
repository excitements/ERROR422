/*     */ package net.java.games.util.plugins;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.net.URLClassLoader;
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
/*     */ public class PluginLoader
/*     */   extends URLClassLoader
/*     */ {
/*     */   static final boolean DEBUG = false;
/*     */   File parentDir;
/*     */   boolean localDLLs = true;
/*     */   
/*     */   public PluginLoader(File jf) throws MalformedURLException {
/*  84 */     super(new URL[] { jf.toURL() }, Thread.currentThread().getContextClassLoader());
/*     */     
/*  86 */     this.parentDir = jf.getParentFile();
/*  87 */     if (System.getProperty("net.java.games.util.plugins.nolocalnative") != null)
/*     */     {
/*  89 */       this.localDLLs = false;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String findLibrary(String libname) {
/* 114 */     if (this.localDLLs) {
/* 115 */       String libpath = this.parentDir.getPath() + File.separator + System.mapLibraryName(libname);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 120 */       return libpath;
/*     */     } 
/* 122 */     return super.findLibrary(libname);
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
/*     */   public boolean attemptPluginDefine(Class pc) {
/* 141 */     return (!pc.isInterface() && classImplementsPlugin(pc));
/*     */   }
/*     */   
/*     */   private boolean classImplementsPlugin(Class testClass) {
/* 145 */     if (testClass == null) return false;
/*     */ 
/*     */ 
/*     */     
/* 149 */     Class[] implementedInterfaces = testClass.getInterfaces(); int i;
/* 150 */     for (i = 0; i < implementedInterfaces.length; i++) {
/*     */ 
/*     */ 
/*     */       
/* 154 */       if (implementedInterfaces[i] == Plugin.class)
/*     */       {
/*     */ 
/*     */         
/* 158 */         return true;
/*     */       }
/*     */     } 
/* 161 */     for (i = 0; i < implementedInterfaces.length; i++) {
/* 162 */       if (classImplementsPlugin(implementedInterfaces[i])) {
/* 163 */         return true;
/*     */       }
/*     */     } 
/* 166 */     return classImplementsPlugin(testClass.getSuperclass());
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\game\\util\plugins\PluginLoader.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */