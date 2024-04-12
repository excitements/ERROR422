/*     */ package org.lwjgl.openal;
/*     */ 
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ import org.lwjgl.Sys;
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
/*     */ public final class AL
/*     */ {
/*     */   protected static ALCdevice device;
/*     */   protected static ALCcontext context;
/*     */   private static boolean created;
/*     */   
/*     */   static {
/*  59 */     Sys.initialize();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isCreated() {
/*  89 */     return created;
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
/*     */   public static void create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized) throws LWJGLException {
/* 104 */     create(deviceArguments, contextFrequency, contextRefresh, contextSynchronized, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized, boolean openDevice) throws LWJGLException {
/*     */     String libname, library_names[];
/* 114 */     if (created) {
/* 115 */       throw new IllegalStateException("Only one OpenAL context may be instantiated at any one time.");
/*     */     }
/*     */     
/* 118 */     switch (LWJGLUtil.getPlatform()) {
/*     */       case 3:
/* 120 */         libname = "OpenAL32";
/* 121 */         library_names = new String[] { "OpenAL64.dll", "OpenAL32.dll" };
/*     */         break;
/*     */       case 1:
/* 124 */         libname = "openal";
/* 125 */         library_names = new String[] { "libopenal64.so", "libopenal.so", "libopenal.so.0" };
/*     */         break;
/*     */       case 2:
/* 128 */         libname = "openal";
/* 129 */         library_names = new String[] { "openal.dylib" };
/*     */         break;
/*     */       default:
/* 132 */         throw new LWJGLException("Unknown platform: " + LWJGLUtil.getPlatform());
/*     */     } 
/* 134 */     String[] oalPaths = LWJGLUtil.getLibraryPaths(libname, library_names, AL.class.getClassLoader());
/* 135 */     LWJGLUtil.log("Found " + oalPaths.length + " OpenAL paths");
/* 136 */     for (int i = 0; i < oalPaths.length; i++) {
/*     */       try {
/* 138 */         nCreate(oalPaths[i]);
/* 139 */         created = true;
/* 140 */         init(deviceArguments, contextFrequency, contextRefresh, contextSynchronized, openDevice);
/*     */         break;
/* 142 */       } catch (LWJGLException e) {
/* 143 */         LWJGLUtil.log("Failed to load " + oalPaths[i] + ": " + e.getMessage());
/*     */       } 
/*     */     } 
/* 146 */     if (!created && LWJGLUtil.getPlatform() == 2) {
/*     */       
/* 148 */       nCreateDefault();
/* 149 */       created = true;
/* 150 */       init(deviceArguments, contextFrequency, contextRefresh, contextSynchronized, openDevice);
/*     */     } 
/* 152 */     if (!created)
/* 153 */       throw new LWJGLException("Could not locate OpenAL library."); 
/*     */   }
/*     */   
/*     */   private static void init(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized, boolean openDevice) throws LWJGLException {
/*     */     try {
/* 158 */       AL10.initNativeStubs();
/* 159 */       ALC10.initNativeStubs();
/*     */       
/* 161 */       if (openDevice) {
/* 162 */         device = ALC10.alcOpenDevice(deviceArguments);
/* 163 */         if (device == null) {
/* 164 */           throw new LWJGLException("Could not open ALC device");
/*     */         }
/* 166 */         if (contextFrequency == -1) {
/* 167 */           context = ALC10.alcCreateContext(device, null);
/*     */         } else {
/* 169 */           context = ALC10.alcCreateContext(device, ALCcontext.createAttributeList(contextFrequency, contextRefresh, contextSynchronized ? 1 : 0));
/*     */         } 
/*     */ 
/*     */         
/* 173 */         ALC10.alcMakeContextCurrent(context);
/*     */       } 
/* 175 */     } catch (LWJGLException e) {
/* 176 */       destroy();
/* 177 */       throw e;
/*     */     } 
/*     */     
/* 180 */     ALC11.initialize();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void create() throws LWJGLException {
/* 191 */     create(null, 44100, 60, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void destroy() {
/* 198 */     if (context != null) {
/* 199 */       ALC10.alcMakeContextCurrent(null);
/* 200 */       ALC10.alcDestroyContext(context);
/* 201 */       context = null;
/*     */     } 
/* 203 */     if (device != null) {
/* 204 */       boolean result = ALC10.alcCloseDevice(device);
/* 205 */       device = null;
/*     */     } 
/* 207 */     resetNativeStubs(AL10.class);
/* 208 */     resetNativeStubs(ALC10.class);
/* 209 */     resetNativeStubs(ALC11.class);
/*     */     
/* 211 */     if (created)
/* 212 */       nDestroy(); 
/* 213 */     created = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ALCcontext getContext() {
/* 222 */     return context;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ALCdevice getDevice() {
/* 229 */     return device;
/*     */   }
/*     */   
/*     */   private static native void nCreate(String paramString) throws LWJGLException;
/*     */   
/*     */   private static native void nCreateDefault() throws LWJGLException;
/*     */   
/*     */   private static native void nDestroy();
/*     */   
/*     */   private static native void resetNativeStubs(Class paramClass);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\AL.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */