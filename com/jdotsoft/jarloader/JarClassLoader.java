/*      */ package com.jdotsoft.jarloader;
/*      */ 
/*      */ import java.applet.AppletContext;
/*      */ import java.applet.AppletStub;
/*      */ import java.io.BufferedOutputStream;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.BufferedWriter;
/*      */ import java.io.DataInputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.FileReader;
/*      */ import java.io.FileWriter;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.PrintStream;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.lang.reflect.InvocationTargetException;
/*      */ import java.lang.reflect.Method;
/*      */ import java.lang.reflect.Modifier;
/*      */ import java.net.JarURLConnection;
/*      */ import java.net.MalformedURLException;
/*      */ import java.net.URL;
/*      */ import java.net.URLDecoder;
/*      */ import java.security.CodeSource;
/*      */ import java.security.ProtectionDomain;
/*      */ import java.security.cert.Certificate;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.Enumeration;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.jar.Attributes;
/*      */ import java.util.jar.JarEntry;
/*      */ import java.util.jar.JarFile;
/*      */ import java.util.jar.Manifest;
/*      */ import javax.swing.JApplet;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class JarClassLoader
/*      */   extends ClassLoader
/*      */ {
/*      */   public static final String KEY_LOGGER = "JarClassLoader.logger";
/*      */   public static final String KEY_LOGGER_LEVEL = "JarClassLoader.logger.level";
/*      */   public static final String KEY_LOGGER_AREA = "JarClassLoader.logger.area";
/*      */   public static final String TMP_SUB_DIRECTORY = "JarClassLoader";
/*      */   private File dirTemp;
/*      */   private PrintStream logger;
/*      */   private List<JarFileInfo> lstJarFile;
/*      */   private Set<File> hsDeleteOnExit;
/*      */   private Map<String, Class<?>> hmClass;
/*      */   private LogLevel logLevel;
/*      */   private Set<LogArea> hsLogArea;
/*      */   private boolean bLogConsole;
/*      */   private JApplet applet;
/*      */   static int ______INIT;
/*      */   static int ______SHUTDOWN;
/*      */   static int ______ACCESS;
/*      */   static int ______OVERRIDE;
/*      */   static int ______HELPERS;
/*      */   
/*      */   public enum LogLevel
/*      */   {
/*  214 */     ERROR, WARN, INFO, DEBUG; }
/*      */   
/*  216 */   public enum LogArea { ALL,
/*      */     
/*  218 */     CONFIG,
/*      */     
/*  220 */     JAR,
/*      */     
/*  222 */     CLASS,
/*      */     
/*  224 */     RESOURCE,
/*      */     
/*  226 */     NATIVE; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JarClassLoader() {
/*  258 */     this(ClassLoader.getSystemClassLoader());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JarClassLoader(ClassLoader parent) {
/*  267 */     super(parent);
/*  268 */     initLogger();
/*      */     
/*  270 */     this.hmClass = new HashMap<>();
/*  271 */     this.lstJarFile = new ArrayList<>();
/*  272 */     this.hsDeleteOnExit = new HashSet<>();
/*      */ 
/*      */     
/*  275 */     String sUrlTopJar = null;
/*  276 */     ProtectionDomain pdTop = getClass().getProtectionDomain();
/*  277 */     CodeSource cs = pdTop.getCodeSource();
/*  278 */     URL urlTopJar = cs.getLocation();
/*  279 */     String protocol = urlTopJar.getProtocol();
/*      */ 
/*      */     
/*  282 */     JarFileInfo jarFileInfo = null;
/*  283 */     if ("http".equals(protocol) || "https".equals(protocol)) {
/*      */       
/*      */       try {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  290 */         urlTopJar = new URL("jar:" + urlTopJar + "!/");
/*  291 */         JarURLConnection jarCon = (JarURLConnection)urlTopJar.openConnection();
/*  292 */         JarFile jarFile = jarCon.getJarFile();
/*  293 */         jarFileInfo = new JarFileInfo(jarFile, jarFile.getName(), null, pdTop, null);
/*  294 */         logInfo(LogArea.JAR, "Loading from top JAR: '%s' PROTOCOL: '%s'", new Object[] {
/*  295 */               urlTopJar, protocol });
/*  296 */       } catch (Exception e) {
/*      */         
/*  298 */         logError(LogArea.JAR, "Failure to load HTTP JAR: %s %s", new Object[] { urlTopJar, e.toString() });
/*      */         return;
/*      */       } 
/*      */     }
/*  302 */     if ("file".equals(protocol)) {
/*      */ 
/*      */       
/*      */       try {
/*      */         
/*  307 */         sUrlTopJar = URLDecoder.decode(urlTopJar.getFile(), "UTF-8");
/*  308 */       } catch (UnsupportedEncodingException e) {
/*  309 */         logError(LogArea.JAR, "Failure to decode URL: %s %s", new Object[] { urlTopJar, e.toString() });
/*      */         return;
/*      */       } 
/*  312 */       File fileJar = new File(sUrlTopJar);
/*      */ 
/*      */       
/*  315 */       if (fileJar.isDirectory()) {
/*  316 */         logInfo(LogArea.JAR, "Loading from exploded directory: %s", new Object[] { sUrlTopJar });
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*      */       try {
/*  322 */         jarFileInfo = new JarFileInfo(new JarFile(fileJar), fileJar.getName(), null, pdTop, null);
/*  323 */         logInfo(LogArea.JAR, "Loading from top JAR: '%s' PROTOCOL: '%s'", new Object[] { sUrlTopJar, protocol });
/*  324 */       } catch (IOException e) {
/*  325 */         logError(LogArea.JAR, "Not a JAR: %s %s", new Object[] { sUrlTopJar, e.toString() });
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*      */     
/*      */     try {
/*  332 */       if (jarFileInfo == null) {
/*  333 */         throw new IOException(String.format(
/*  334 */               "Unknown protocol %s", new Object[] { protocol }));
/*      */       }
/*  336 */       loadJar(jarFileInfo);
/*  337 */     } catch (IOException e) {
/*  338 */       logError(LogArea.JAR, "Not valid URL: %s %s", new Object[] { urlTopJar, e.toString() });
/*      */       
/*      */       return;
/*      */     } 
/*  342 */     checkShading();
/*  343 */     Runtime.getRuntime().addShutdownHook(new Thread() {
/*      */           public void run() {
/*  345 */             JarClassLoader.this.shutdown();
/*      */           }
/*      */         });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void initLogger() {
/*  355 */     this.bLogConsole = true;
/*  356 */     this.logger = System.out;
/*  357 */     this.logLevel = LogLevel.ERROR;
/*  358 */     this.hsLogArea = new HashSet<>();
/*  359 */     this.hsLogArea.add(LogArea.CONFIG);
/*      */ 
/*      */     
/*  362 */     String sLogger = System.getProperty("JarClassLoader.logger");
/*  363 */     if (sLogger != null) {
/*      */       try {
/*  365 */         this.logger = new PrintStream(sLogger);
/*  366 */         this.bLogConsole = false;
/*  367 */       } catch (FileNotFoundException e) {
/*  368 */         logError(LogArea.CONFIG, "Cannot create log file %s.", new Object[] { sLogger });
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  373 */     String sLogLevel = System.getProperty("JarClassLoader.logger.level");
/*  374 */     if (sLogLevel != null) {
/*      */       try {
/*  376 */         this.logLevel = LogLevel.valueOf(sLogLevel);
/*  377 */       } catch (Exception e) {
/*  378 */         logError(LogArea.CONFIG, "Not valid parameter in %s=%s", new Object[] { "JarClassLoader.logger.level", sLogLevel });
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  383 */     String sLogArea = System.getProperty("JarClassLoader.logger.area");
/*  384 */     if (sLogArea != null) {
/*  385 */       String[] tokenAll = sLogArea.split(","); try {
/*      */         byte b; int i; String[] arrayOfString;
/*  387 */         for (i = (arrayOfString = tokenAll).length, b = 0; b < i; ) { String t = arrayOfString[b];
/*  388 */           this.hsLogArea.add(LogArea.valueOf(t)); b++; }
/*      */       
/*  390 */       } catch (Exception e) {
/*  391 */         logError(LogArea.CONFIG, "Not valid parameter in %s=%s", new Object[] { "JarClassLoader.logger.area", sLogArea });
/*      */       } 
/*      */     } 
/*  394 */     if (this.hsLogArea.size() == 1 && this.hsLogArea.contains(LogArea.CONFIG)) {
/*  395 */       byte b; int i; LogArea[] arrayOfLogArea; for (i = (arrayOfLogArea = LogArea.values()).length, b = 0; b < i; ) { LogArea la = arrayOfLogArea[b];
/*  396 */         this.hsLogArea.add(la);
/*      */         b++; }
/*      */     
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private File createTempFile(JarEntryInfo inf) throws JarClassLoaderException {
/*  424 */     if (this.dirTemp == null) {
/*  425 */       File dir = new File(System.getProperty("java.io.tmpdir"), "JarClassLoader");
/*  426 */       if (!dir.exists()) {
/*  427 */         dir.mkdir();
/*      */       }
/*  429 */       chmod777(dir);
/*  430 */       if (!dir.exists() || !dir.isDirectory()) {
/*  431 */         throw new JarClassLoaderException(
/*  432 */             "Cannot create temp directory " + dir.getAbsolutePath());
/*      */       }
/*  434 */       this.dirTemp = dir;
/*      */     } 
/*  436 */     File fileTmp = null;
/*      */     try {
/*  438 */       fileTmp = File.createTempFile(String.valueOf(inf.getName()) + ".", null, this.dirTemp);
/*  439 */       fileTmp.deleteOnExit();
/*  440 */       chmod777(fileTmp);
/*  441 */       byte[] a_by = inf.getJarBytes();
/*  442 */       BufferedOutputStream os = new BufferedOutputStream(
/*  443 */           new FileOutputStream(fileTmp));
/*  444 */       os.write(a_by);
/*  445 */       os.close();
/*  446 */       return fileTmp;
/*  447 */     } catch (IOException e) {
/*  448 */       throw new JarClassLoaderException(String.format(
/*  449 */             "Cannot create temp file '%s' for %s", new Object[] { fileTmp, inf.jarEntry }), e);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void loadJar(JarFileInfo jarFileInfo) throws IOException {
/*  460 */     this.lstJarFile.add(jarFileInfo);
/*      */     try {
/*  462 */       Enumeration<JarEntry> en = jarFileInfo.jarFile.entries();
/*  463 */       String EXT_JAR = ".jar";
/*  464 */       while (en.hasMoreElements()) {
/*  465 */         JarEntry je = en.nextElement();
/*  466 */         if (je.isDirectory()) {
/*      */           continue;
/*      */         }
/*  469 */         String s = je.getName().toLowerCase();
/*  470 */         if (s.lastIndexOf(".jar") == s.length() - ".jar".length()) {
/*  471 */           JarEntryInfo inf = new JarEntryInfo(jarFileInfo, je);
/*  472 */           File fileTemp = createTempFile(inf);
/*  473 */           logInfo(LogArea.JAR, "Loading inner JAR %s from temp file %s", new Object[] {
/*  474 */                 inf.jarEntry, getFilename4Log(fileTemp)
/*      */               });
/*  476 */           URL url = fileTemp.toURI().toURL();
/*  477 */           ProtectionDomain pdParent = jarFileInfo.pd;
/*      */           
/*  479 */           CodeSource csParent = pdParent.getCodeSource();
/*  480 */           Certificate[] certParent = csParent.getCertificates();
/*  481 */           CodeSource csChild = (certParent == null) ? new CodeSource(url, csParent.getCodeSigners()) : 
/*  482 */             new CodeSource(url, certParent);
/*  483 */           ProtectionDomain pdChild = new ProtectionDomain(csChild, 
/*  484 */               pdParent.getPermissions(), pdParent.getClassLoader(), pdParent.getPrincipals());
/*  485 */           loadJar(new JarFileInfo(
/*  486 */                 new JarFile(fileTemp), inf.getName(), jarFileInfo, pdChild, fileTemp));
/*      */         } 
/*      */       } 
/*  489 */     } catch (JarClassLoaderException e) {
/*  490 */       throw new RuntimeException(
/*  491 */           "ERROR on loading inner JAR: " + e.getMessageAll());
/*      */     } 
/*      */   }
/*      */   
/*      */   private JarEntryInfo findJarEntry(String sName) {
/*  496 */     for (JarFileInfo jarFileInfo : this.lstJarFile) {
/*  497 */       JarFile jarFile = jarFileInfo.jarFile;
/*  498 */       JarEntry jarEntry = jarFile.getJarEntry(sName);
/*  499 */       if (jarEntry != null) {
/*  500 */         return new JarEntryInfo(jarFileInfo, jarEntry);
/*      */       }
/*      */     } 
/*  503 */     return null;
/*      */   }
/*      */   
/*      */   private List<JarEntryInfo> findJarEntries(String sName) {
/*  507 */     List<JarEntryInfo> lst = new ArrayList<>();
/*  508 */     for (JarFileInfo jarFileInfo : this.lstJarFile) {
/*  509 */       JarFile jarFile = jarFileInfo.jarFile;
/*  510 */       JarEntry jarEntry = jarFile.getJarEntry(sName);
/*  511 */       if (jarEntry != null) {
/*  512 */         lst.add(new JarEntryInfo(jarFileInfo, jarEntry));
/*      */       }
/*      */     } 
/*  515 */     return lst;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private JarEntryInfo findJarNativeEntry(String sLib) {
/*  529 */     String sName = System.mapLibraryName(sLib);
/*  530 */     for (JarFileInfo jarFileInfo : this.lstJarFile) {
/*  531 */       JarFile jarFile = jarFileInfo.jarFile;
/*  532 */       Enumeration<JarEntry> en = jarFile.entries();
/*  533 */       while (en.hasMoreElements()) {
/*  534 */         JarEntry je = en.nextElement();
/*  535 */         if (je.isDirectory()) {
/*      */           continue;
/*      */         }
/*      */         
/*  539 */         String sEntry = je.getName();
/*      */ 
/*      */ 
/*      */         
/*  543 */         String[] token = sEntry.split("/");
/*  544 */         if (token.length > 0 && token[token.length - 1].equals(sName)) {
/*  545 */           logInfo(LogArea.NATIVE, "Loading native library '%s' found as '%s' in JAR %s", new Object[] {
/*  546 */                 sLib, sEntry, jarFileInfo.simpleName });
/*  547 */           return new JarEntryInfo(jarFileInfo, je);
/*      */         } 
/*      */       } 
/*      */     } 
/*  551 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Class<?> findJarClass(String sClassName) throws JarClassLoaderException {
/*  562 */     Class<?> c = this.hmClass.get(sClassName);
/*  563 */     if (c != null) {
/*  564 */       return c;
/*      */     }
/*      */     
/*  567 */     String sName = String.valueOf(sClassName.replace('.', '/')) + ".class";
/*  568 */     JarEntryInfo inf = findJarEntry(sName);
/*  569 */     String jarSimpleName = null;
/*  570 */     if (inf != null) {
/*  571 */       jarSimpleName = inf.jarFileInfo.simpleName;
/*  572 */       definePackage(sClassName, inf);
/*  573 */       byte[] a_by = inf.getJarBytes();
/*      */       try {
/*  575 */         c = defineClass(sClassName, a_by, 0, a_by.length, inf.jarFileInfo.pd);
/*  576 */       } catch (ClassFormatError e) {
/*  577 */         throw new JarClassLoaderException(null, e);
/*      */       } 
/*      */     } 
/*  580 */     if (c == null) {
/*  581 */       throw new JarClassLoaderException(sClassName);
/*      */     }
/*  583 */     this.hmClass.put(sClassName, c);
/*  584 */     logInfo(LogArea.CLASS, "Loaded %s by %s from JAR %s", new Object[] {
/*  585 */           sClassName, getClass().getName(), jarSimpleName });
/*  586 */     return c;
/*      */   }
/*      */   
/*      */   private void checkShading() {
/*  590 */     if (this.logLevel.ordinal() < LogLevel.WARN.ordinal()) {
/*      */       return;
/*      */     }
/*      */     
/*  594 */     Map<String, JarFileInfo> hm = new HashMap<>();
/*  595 */     for (JarFileInfo jarFileInfo : this.lstJarFile) {
/*  596 */       JarFile jarFile = jarFileInfo.jarFile;
/*  597 */       Enumeration<JarEntry> en = jarFile.entries();
/*  598 */       while (en.hasMoreElements()) {
/*  599 */         JarEntry je = en.nextElement();
/*  600 */         if (je.isDirectory()) {
/*      */           continue;
/*      */         }
/*  603 */         String sEntry = je.getName();
/*  604 */         if ("META-INF/MANIFEST.MF".equals(sEntry)) {
/*      */           continue;
/*      */         }
/*  607 */         JarFileInfo jar = hm.get(sEntry);
/*  608 */         if (jar == null) {
/*  609 */           hm.put(sEntry, jarFileInfo); continue;
/*      */         } 
/*  611 */         logWarn(LogArea.JAR, "ENTRY %s IN %s SHADES %s", new Object[] {
/*  612 */               sEntry, jar.simpleName, jarFileInfo.simpleName
/*      */             });
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void shutdown() {
/*  635 */     for (JarFileInfo jarFileInfo : this.lstJarFile) {
/*      */       try {
/*  637 */         jarFileInfo.jarFile.close();
/*  638 */       } catch (IOException iOException) {}
/*      */ 
/*      */       
/*  641 */       File file = jarFileInfo.fileDeleteOnExit;
/*  642 */       if (file != null && !file.delete()) {
/*  643 */         this.hsDeleteOnExit.add(file);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  650 */     File fileCfg = new File(String.valueOf(System.getProperty("user.home")) + 
/*  651 */         File.separator + ".JarClassLoader");
/*  652 */     deleteOldTemp(fileCfg);
/*  653 */     persistNewTemp(fileCfg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void deleteOldTemp(File fileCfg) {
/*  663 */     BufferedReader reader = null;
/*      */     try {
/*  665 */       int count = 0;
/*  666 */       reader = new BufferedReader(new FileReader(fileCfg));
/*      */       String sLine;
/*  668 */       while ((sLine = reader.readLine()) != null) {
/*  669 */         File file = new File(sLine);
/*  670 */         if (!file.exists()) {
/*      */           continue;
/*      */         }
/*  673 */         if (file.delete()) {
/*  674 */           count++;
/*      */           continue;
/*      */         } 
/*  677 */         this.hsDeleteOnExit.add(file);
/*      */       } 
/*      */       
/*  680 */       logDebug(LogArea.CONFIG, "Deleted %d old temp files listed in %s", new Object[] {
/*  681 */             Integer.valueOf(count), fileCfg.getAbsolutePath() });
/*  682 */     } catch (IOException iOException) {
/*      */     
/*      */     } finally {
/*  685 */       if (reader != null) {
/*  686 */         try { reader.close(); } catch (IOException iOException) {}
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void persistNewTemp(File fileCfg) {
/*  699 */     if (this.hsDeleteOnExit.size() == 0) {
/*  700 */       logDebug(LogArea.CONFIG, "No temp file names to persist on exit.", new Object[0]);
/*  701 */       fileCfg.delete();
/*      */       return;
/*      */     } 
/*  704 */     logDebug(LogArea.CONFIG, "Persisting %d temp file names into %s", new Object[] {
/*  705 */           Integer.valueOf(this.hsDeleteOnExit.size()), fileCfg.getAbsolutePath() });
/*  706 */     BufferedWriter writer = null;
/*      */     try {
/*  708 */       writer = new BufferedWriter(new FileWriter(fileCfg));
/*  709 */       for (File file : this.hsDeleteOnExit) {
/*  710 */         if (!file.delete()) {
/*  711 */           String f = file.getCanonicalPath();
/*  712 */           writer.write(f);
/*  713 */           writer.newLine();
/*  714 */           logWarn(LogArea.JAR, "JVM failed to release %s", new Object[] { f });
/*      */         } 
/*      */       } 
/*  717 */     } catch (IOException iOException) {
/*      */     
/*      */     } finally {
/*  720 */       if (writer != null) {
/*  721 */         try { writer.close(); } catch (IOException iOException) {}
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isLaunchedFromJar() {
/*  735 */     return (this.lstJarFile.size() > 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getManifestMainClass() {
/*  745 */     Attributes attr = null;
/*  746 */     if (isLaunchedFromJar()) {
/*      */       
/*      */       try {
/*  749 */         Manifest m = ((JarFileInfo)this.lstJarFile.get(0)).jarFile.getManifest();
/*  750 */         attr = m.getMainAttributes();
/*  751 */       } catch (IOException iOException) {}
/*      */     }
/*      */     
/*  754 */     return (attr == null) ? null : attr.getValue(Attributes.Name.MAIN_CLASS);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void invokeMain(String sClass, String[] args) throws Throwable {
/*  778 */     Class<?> clazz = loadClass(sClass);
/*  779 */     logInfo(LogArea.CONFIG, "Launch: %s.main(); Loader: %s", new Object[] { sClass, clazz.getClassLoader() });
/*  780 */     Method method = clazz.getMethod("main", new Class[] { String[].class });
/*      */     
/*  782 */     boolean bValidModifiers = false;
/*  783 */     boolean bValidVoid = false;
/*      */     
/*  785 */     if (method != null) {
/*  786 */       method.setAccessible(true);
/*  787 */       int nModifiers = method.getModifiers();
/*  788 */       bValidModifiers = (Modifier.isPublic(nModifiers) && 
/*  789 */         Modifier.isStatic(nModifiers));
/*  790 */       Class<?> clazzRet = method.getReturnType();
/*  791 */       bValidVoid = (clazzRet == void.class);
/*      */     } 
/*  793 */     if (method == null || !bValidModifiers || !bValidVoid) {
/*  794 */       throw new NoSuchMethodException(
/*  795 */           "The main() method in class \"" + sClass + "\" not found.");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  801 */       method.invoke(null, new Object[] { args });
/*  802 */     } catch (InvocationTargetException e) {
/*  803 */       throw e.getTargetException();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void initApplet(String sClass, final JApplet appletParent) throws Throwable {
/*  820 */     Class<?> clazz = loadClass(sClass);
/*  821 */     logInfo(LogArea.CONFIG, "initApplet() --> %s.init(); Loader: %s", new Object[] { sClass, clazz.getClassLoader() });
/*  822 */     this.applet = (JApplet)clazz.newInstance();
/*  823 */     this.applet.setStub(new AppletStub()
/*      */         {
/*      */           public boolean isActive() {
/*  826 */             return appletParent.isActive();
/*      */           }
/*      */           
/*      */           public URL getDocumentBase() {
/*  830 */             return appletParent.getDocumentBase();
/*      */           }
/*      */           
/*      */           public URL getCodeBase() {
/*  834 */             return appletParent.getCodeBase();
/*      */           }
/*      */           
/*      */           public String getParameter(String name) {
/*  838 */             return appletParent.getParameter(name);
/*      */           }
/*      */           
/*      */           public AppletContext getAppletContext() {
/*  842 */             return appletParent.getAppletContext();
/*      */           }
/*      */           
/*      */           public void appletResize(int width, int height) {
/*  846 */             appletParent.resize(width, height);
/*      */           }
/*      */         });
/*  849 */     this.applet.init();
/*  850 */     appletParent.setContentPane(this.applet.getContentPane());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void startApplet() {
/*  858 */     checkApplet();
/*  859 */     logInfo(LogArea.CONFIG, "startApplet() --> %s.start()", new Object[] { this.applet.getClass().getName() });
/*  860 */     this.applet.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void stopApplet() {
/*  868 */     checkApplet();
/*  869 */     logInfo(LogArea.CONFIG, "stopApplet() --> %s.stop()", new Object[] { this.applet.getClass().getName() });
/*  870 */     this.applet.stop();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void destroyApplet() {
/*  878 */     checkApplet();
/*  879 */     logInfo(LogArea.CONFIG, "destroyApplet() --> %s.destroy()", new Object[] { this.applet.getClass().getName() });
/*  880 */     this.applet.destroy();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected synchronized Class<?> loadClass(String sClassName, boolean bResolve) throws ClassNotFoundException {
/*  896 */     logDebug(LogArea.CLASS, "LOADING %s (resolve=%b)", new Object[] { sClassName, Boolean.valueOf(bResolve) });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  929 */     Thread.currentThread().setContextClassLoader(this);
/*      */     
/*  931 */     Class<?> c = null;
/*      */     
/*      */     try {
/*  934 */       if (getClass().getName().equals(sClassName)) {
/*  935 */         return JarClassLoader.class;
/*      */       }
/*      */       
/*  938 */       if (isLaunchedFromJar()) {
/*      */         try {
/*  940 */           c = findJarClass(sClassName);
/*  941 */           return c;
/*  942 */         } catch (JarClassLoaderException e) {
/*  943 */           if (e.getCause() == null) {
/*  944 */             logDebug(LogArea.CLASS, "Not found %s in JAR by %s: %s", new Object[] {
/*  945 */                   sClassName, getClass().getName(), e.getMessage() });
/*      */           } else {
/*  947 */             logDebug(LogArea.CLASS, "Error loading %s in JAR by %s: %s", new Object[] {
/*  948 */                   sClassName, getClass().getName(), e.getCause()
/*      */                 });
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */ 
/*      */       
/*  972 */       if (c != null && bResolve) {
/*  973 */         resolveClass(c);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected URL findResource(String sName) {
/*  986 */     logDebug(LogArea.RESOURCE, "findResource: %s", new Object[] { sName });
/*  987 */     if (isLaunchedFromJar()) {
/*  988 */       JarEntryInfo inf = findJarEntry(normalizeResourceName(sName));
/*  989 */       if (inf != null) {
/*  990 */         URL url = inf.getURL();
/*  991 */         logInfo(LogArea.RESOURCE, "found resource: %s", new Object[] { url });
/*  992 */         return url;
/*      */       } 
/*  994 */       logInfo(LogArea.RESOURCE, "not found resource: %s", new Object[] { sName });
/*  995 */       return null;
/*      */     } 
/*  997 */     return super.findResource(sName);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Enumeration<URL> findResources(String sName) throws IOException {
/* 1008 */     logDebug(LogArea.RESOURCE, "getResources: %s", new Object[] { sName });
/* 1009 */     if (isLaunchedFromJar()) {
/* 1010 */       List<JarEntryInfo> lstJarEntry = findJarEntries(normalizeResourceName(sName));
/* 1011 */       List<URL> lstURL = new ArrayList<>();
/* 1012 */       for (JarEntryInfo inf : lstJarEntry) {
/* 1013 */         URL url = inf.getURL();
/* 1014 */         if (url != null) {
/* 1015 */           lstURL.add(url);
/*      */         }
/*      */       } 
/* 1018 */       return Collections.enumeration(lstURL);
/*      */     } 
/* 1020 */     return super.findResources(sName);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String findLibrary(String sLib) {
/* 1030 */     logDebug(LogArea.NATIVE, "findLibrary: %s", new Object[] { sLib });
/* 1031 */     if (isLaunchedFromJar()) {
/* 1032 */       JarEntryInfo inf = findJarNativeEntry(sLib);
/* 1033 */       if (inf != null) {
/*      */         try {
/* 1035 */           File file = createTempFile(inf);
/* 1036 */           logDebug(LogArea.NATIVE, "Loading native library %s from temp file %s", new Object[] {
/* 1037 */                 inf.jarEntry, getFilename4Log(file) });
/* 1038 */           this.hsDeleteOnExit.add(file);
/* 1039 */           return file.getAbsolutePath();
/* 1040 */         } catch (JarClassLoaderException e) {
/* 1041 */           logError(LogArea.NATIVE, "Failure to load native library %s: %s", new Object[] { sLib, e.toString() });
/*      */         } 
/*      */       }
/* 1044 */       return null;
/*      */     } 
/* 1046 */     return super.findLibrary(sLib);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void definePackage(String sClassName, JarEntryInfo inf) throws IllegalArgumentException {
/* 1067 */     int pos = sClassName.lastIndexOf('.');
/* 1068 */     String sPackageName = (pos > 0) ? sClassName.substring(0, pos) : "";
/* 1069 */     if (getPackage(sPackageName) == null) {
/* 1070 */       JarFileInfo jfi = inf.jarFileInfo;
/* 1071 */       definePackage(sPackageName, 
/* 1072 */           jfi.getSpecificationTitle(), jfi.getSpecificationVersion(), 
/* 1073 */           jfi.getSpecificationVendor(), jfi.getImplementationTitle(), 
/* 1074 */           jfi.getImplementationVersion(), jfi.getImplementationVendor(), 
/* 1075 */           jfi.getSealURL());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String normalizeResourceName(String sName) {
/* 1088 */     return sName.replace('\\', '/');
/*      */   }
/*      */   
/*      */   private void chmod777(File file) {
/* 1092 */     file.setReadable(true, false);
/* 1093 */     file.setWritable(true, false);
/* 1094 */     file.setExecutable(true, false);
/*      */   }
/*      */   
/*      */   private String getFilename4Log(File file) {
/* 1098 */     if (this.logger != null) {
/*      */       
/*      */       try {
/* 1101 */         return file.getCanonicalPath();
/* 1102 */       } catch (IOException e) {
/*      */         
/* 1104 */         return file.getAbsolutePath();
/*      */       } 
/*      */     }
/* 1107 */     return null;
/*      */   }
/*      */   
/*      */   private void checkApplet() {
/* 1111 */     if (this.applet == null) {
/* 1112 */       throw new IllegalStateException("Applet is not inited. Please call JarClassLoader.initApplet() first.");
/*      */     }
/*      */   }
/*      */   
/*      */   private void logDebug(LogArea area, String sMsg, Object... obj) {
/* 1117 */     log(LogLevel.DEBUG, area, sMsg, obj);
/*      */   }
/*      */   
/*      */   private void logInfo(LogArea area, String sMsg, Object... obj) {
/* 1121 */     log(LogLevel.INFO, area, sMsg, obj);
/*      */   }
/*      */   
/*      */   private void logWarn(LogArea area, String sMsg, Object... obj) {
/* 1125 */     log(LogLevel.WARN, area, sMsg, obj);
/*      */   }
/*      */   
/*      */   private void logError(LogArea area, String sMsg, Object... obj) {
/* 1129 */     log(LogLevel.ERROR, area, sMsg, obj);
/*      */   }
/*      */   
/*      */   private void log(LogLevel level, LogArea area, String sMsg, Object... obj) {
/* 1133 */     if (level.ordinal() <= this.logLevel.ordinal() && (
/* 1134 */       this.hsLogArea.contains(LogArea.ALL) || this.hsLogArea.contains(area))) {
/* 1135 */       this.logger.printf("JarClassLoader-" + level + ": " + sMsg + "\n", obj);
/*      */     }
/*      */     
/* 1138 */     if (!this.bLogConsole && level == LogLevel.ERROR) {
/* 1139 */       System.out.printf("JarClassLoader-" + level + ": " + sMsg + "\n", obj);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class JarFileInfo
/*      */   {
/*      */     JarFile jarFile;
/*      */ 
/*      */ 
/*      */     
/*      */     String simpleName;
/*      */ 
/*      */ 
/*      */     
/*      */     File fileDeleteOnExit;
/*      */ 
/*      */ 
/*      */     
/*      */     Manifest mf;
/*      */ 
/*      */     
/*      */     ProtectionDomain pd;
/*      */ 
/*      */ 
/*      */     
/*      */     JarFileInfo(JarFile jarFile, String simpleName, JarFileInfo jarFileParent, ProtectionDomain pd, File fileDeleteOnExit) {
/* 1168 */       this.simpleName = String.valueOf((jarFileParent == null) ? "" : (String.valueOf(jarFileParent.simpleName) + "!")) + simpleName;
/* 1169 */       this.jarFile = jarFile;
/* 1170 */       this.pd = pd;
/* 1171 */       this.fileDeleteOnExit = fileDeleteOnExit;
/*      */       try {
/* 1173 */         this.mf = jarFile.getManifest();
/* 1174 */       } catch (IOException iOException) {}
/*      */ 
/*      */       
/* 1177 */       if (this.mf == null)
/* 1178 */         this.mf = new Manifest(); 
/*      */     }
/*      */     
/*      */     String getSpecificationTitle() {
/* 1182 */       return this.mf.getMainAttributes().getValue(Attributes.Name.SPECIFICATION_TITLE);
/*      */     }
/*      */     String getSpecificationVersion() {
/* 1185 */       return this.mf.getMainAttributes().getValue(Attributes.Name.SPECIFICATION_VERSION);
/*      */     }
/*      */     String getSpecificationVendor() {
/* 1188 */       return this.mf.getMainAttributes().getValue(Attributes.Name.SPECIFICATION_VENDOR);
/*      */     }
/*      */     String getImplementationTitle() {
/* 1191 */       return this.mf.getMainAttributes().getValue(Attributes.Name.IMPLEMENTATION_TITLE);
/*      */     }
/*      */     String getImplementationVersion() {
/* 1194 */       return this.mf.getMainAttributes().getValue(Attributes.Name.IMPLEMENTATION_VERSION);
/*      */     }
/*      */     String getImplementationVendor() {
/* 1197 */       return this.mf.getMainAttributes().getValue(Attributes.Name.IMPLEMENTATION_VENDOR);
/*      */     }
/*      */     URL getSealURL() {
/* 1200 */       String seal = this.mf.getMainAttributes().getValue(Attributes.Name.SEALED);
/* 1201 */       if (seal != null) {
/*      */         try {
/* 1203 */           return new URL(seal);
/* 1204 */         } catch (MalformedURLException malformedURLException) {}
/*      */       }
/*      */ 
/*      */       
/* 1208 */       return null;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class JarEntryInfo
/*      */   {
/*      */     JarClassLoader.JarFileInfo jarFileInfo;
/*      */     JarEntry jarEntry;
/*      */     
/*      */     JarEntryInfo(JarClassLoader.JarFileInfo jarFileInfo, JarEntry jarEntry) {
/* 1219 */       this.jarFileInfo = jarFileInfo;
/* 1220 */       this.jarEntry = jarEntry;
/*      */     }
/*      */     URL getURL() {
/*      */       try {
/* 1224 */         return new URL("jar:file:" + this.jarFileInfo.jarFile.getName() + "!/" + this.jarEntry);
/* 1225 */       } catch (MalformedURLException e) {
/* 1226 */         return null;
/*      */       } 
/*      */     }
/*      */     String getName() {
/* 1230 */       return this.jarEntry.getName().replace('/', '_');
/*      */     }
/*      */     
/*      */     public String toString() {
/* 1234 */       return "JAR: " + this.jarFileInfo.jarFile.getName() + " ENTRY: " + this.jarEntry;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     byte[] getJarBytes() throws JarClassLoader.JarClassLoaderException {
/* 1245 */       DataInputStream dis = null;
/* 1246 */       byte[] a_by = null;
/*      */       try {
/* 1248 */         long lSize = this.jarEntry.getSize();
/* 1249 */         if (lSize <= 0L || lSize >= 2147483647L) {
/* 1250 */           throw new JarClassLoader.JarClassLoaderException(
/* 1251 */               "Invalid size " + lSize + " for entry " + this.jarEntry);
/*      */         }
/* 1253 */         a_by = new byte[(int)lSize];
/* 1254 */         InputStream is = this.jarFileInfo.jarFile.getInputStream(this.jarEntry);
/* 1255 */         dis = new DataInputStream(is);
/* 1256 */         dis.readFully(a_by);
/* 1257 */       } catch (IOException e) {
/* 1258 */         throw new JarClassLoader.JarClassLoaderException(null, e);
/*      */       } finally {
/* 1260 */         if (dis != null) {
/*      */           try {
/* 1262 */             dis.close();
/* 1263 */           } catch (IOException iOException) {}
/*      */         }
/*      */       } 
/*      */       
/* 1267 */       return a_by;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class JarClassLoaderException
/*      */     extends Exception
/*      */   {
/*      */     JarClassLoaderException(String sMsg) {
/* 1277 */       super(sMsg);
/*      */     }
/*      */     JarClassLoaderException(String sMsg, Throwable eCause) {
/* 1280 */       super(sMsg, eCause);
/*      */     }
/*      */     String getMessageAll() {
/* 1283 */       StringBuilder sb = new StringBuilder();
/* 1284 */       for (Throwable e = this; e != null; e = e.getCause()) {
/* 1285 */         if (sb.length() > 0) {
/* 1286 */           sb.append(" / ");
/*      */         }
/* 1288 */         String sMsg = e.getMessage();
/* 1289 */         if (sMsg == null || sMsg.length() == 0) {
/* 1290 */           sMsg = e.getClass().getSimpleName();
/*      */         }
/* 1292 */         sb.append(sMsg);
/*      */       } 
/* 1294 */       return sb.toString();
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\com\jdotsoft\jarloader\JarClassLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */