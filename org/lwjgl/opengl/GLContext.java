/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ import java.nio.IntBuffer;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.security.PrivilegedExceptionAction;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.StringTokenizer;
/*     */ import java.util.WeakHashMap;
/*     */ import org.lwjgl.BufferUtils;
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
/*     */ public final class GLContext
/*     */ {
/*  63 */   private static final ThreadLocal current_capabilities = new ThreadLocal();
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
/*  89 */   private static CapabilitiesCacheEntry fast_path_cache = new CapabilitiesCacheEntry();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   private static final ThreadLocal thread_cache_entries = new ThreadLocal();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   private static final Map capability_cache = new WeakHashMap();
/*     */   
/*     */   private static int gl_ref_count;
/*     */   
/*     */   private static boolean did_auto_load;
/*     */   
/*     */   static {
/* 108 */     Sys.initialize();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ContextCapabilities getCapabilities() {
/* 118 */     CapabilitiesCacheEntry recent_cache_entry = fast_path_cache;
/*     */     
/* 120 */     if (recent_cache_entry.owner == Thread.currentThread())
/*     */     {
/*     */ 
/*     */       
/* 124 */       return recent_cache_entry.capabilities;
/*     */     }
/* 126 */     return getThreadLocalCapabilities();
/*     */   }
/*     */   
/*     */   private static ContextCapabilities getThreadLocalCapabilities() {
/* 130 */     return current_capabilities.get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void setCapabilities(ContextCapabilities capabilities) {
/* 140 */     current_capabilities.set(capabilities);
/*     */     
/* 142 */     CapabilitiesCacheEntry thread_cache_entry = thread_cache_entries.get();
/* 143 */     if (thread_cache_entry == null) {
/* 144 */       thread_cache_entry = new CapabilitiesCacheEntry();
/* 145 */       thread_cache_entries.set(thread_cache_entry);
/*     */     } 
/* 147 */     thread_cache_entry.owner = Thread.currentThread();
/* 148 */     thread_cache_entry.capabilities = capabilities;
/*     */     
/* 150 */     fast_path_cache = thread_cache_entry;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static long getPlatformSpecificFunctionAddress(String function_prefix, String[] os_prefixes, String[] os_function_prefixes, String function) {
/* 158 */     String os_name = AccessController.<String>doPrivileged(new PrivilegedAction() {
/*     */           public Object run() {
/* 160 */             return System.getProperty("os.name");
/*     */           }
/*     */         });
/* 163 */     for (int i = 0; i < os_prefixes.length; i++) {
/* 164 */       if (os_name.startsWith(os_prefixes[i])) {
/* 165 */         String platform_function_name = function.replaceFirst(function_prefix, os_function_prefixes[i]);
/* 166 */         long address = getFunctionAddress(platform_function_name);
/* 167 */         return address;
/*     */       } 
/* 169 */     }  return 0L;
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
/*     */   static int getSupportedExtensions(Set supported_extensions) {
/* 185 */     String version = GL11.glGetString(7938);
/* 186 */     if (version == null) {
/* 187 */       throw new IllegalStateException("glGetString(GL_VERSION) returned null - possibly caused by missing current context.");
/*     */     }
/* 189 */     StringTokenizer version_tokenizer = new StringTokenizer(version, ". ");
/* 190 */     String major_string = version_tokenizer.nextToken();
/* 191 */     String minor_string = version_tokenizer.nextToken();
/*     */     
/* 193 */     int majorVersion = 0;
/* 194 */     int minorVersion = 0;
/*     */     try {
/* 196 */       majorVersion = Integer.parseInt(major_string);
/* 197 */       minorVersion = Integer.parseInt(minor_string);
/* 198 */     } catch (NumberFormatException e) {
/* 199 */       LWJGLUtil.log("The major and/or minor OpenGL version is malformed: " + e.getMessage());
/*     */     } 
/*     */ 
/*     */     
/* 203 */     if (4 <= majorVersion) {
/* 204 */       supported_extensions.add("OpenGL40");
/*     */     }
/*     */     
/* 207 */     if (3 < majorVersion || (3 == majorVersion && 3 <= minorVersion))
/* 208 */       supported_extensions.add("OpenGL33"); 
/* 209 */     if (3 < majorVersion || (3 == majorVersion && 2 <= minorVersion))
/* 210 */       supported_extensions.add("OpenGL32"); 
/* 211 */     if (3 < majorVersion || (3 == majorVersion && 1 <= minorVersion))
/* 212 */       supported_extensions.add("OpenGL31"); 
/* 213 */     if (3 <= majorVersion) {
/* 214 */       supported_extensions.add("OpenGL30");
/*     */     }
/*     */     
/* 217 */     if (2 < majorVersion || (2 == majorVersion && 1 <= minorVersion))
/* 218 */       supported_extensions.add("OpenGL21"); 
/* 219 */     if (2 <= majorVersion) {
/* 220 */       supported_extensions.add("OpenGL20");
/*     */     }
/*     */     
/* 223 */     if (1 < majorVersion || 5 <= minorVersion)
/* 224 */       supported_extensions.add("OpenGL15"); 
/* 225 */     if (1 < majorVersion || 4 <= minorVersion)
/* 226 */       supported_extensions.add("OpenGL14"); 
/* 227 */     if (1 < majorVersion || 3 <= minorVersion)
/* 228 */       supported_extensions.add("OpenGL13"); 
/* 229 */     if (1 < majorVersion || 2 <= minorVersion)
/* 230 */       supported_extensions.add("OpenGL12"); 
/* 231 */     if (1 < majorVersion || 1 <= minorVersion) {
/* 232 */       supported_extensions.add("OpenGL11");
/*     */     }
/* 234 */     int profileMask = 0;
/*     */     
/* 236 */     if (majorVersion < 3) {
/*     */       
/* 238 */       String extensions_string = GL11.glGetString(7939);
/* 239 */       if (extensions_string == null) {
/* 240 */         throw new IllegalStateException("glGetString(GL_EXTENSIONS) returned null - is there a context current?");
/*     */       }
/* 242 */       StringTokenizer tokenizer = new StringTokenizer(extensions_string);
/* 243 */       while (tokenizer.hasMoreTokens()) {
/* 244 */         supported_extensions.add(tokenizer.nextToken());
/*     */       }
/*     */     } else {
/* 247 */       IntBuffer buffer = BufferUtils.createIntBuffer(16);
/* 248 */       GL11.glGetInteger(33309, buffer);
/* 249 */       int extensionCount = buffer.get(0);
/*     */       
/* 251 */       for (int i = 0; i < extensionCount; i++) {
/* 252 */         supported_extensions.add(GL30.glGetStringi(7939, i));
/*     */       }
/*     */       
/* 255 */       if (3 < majorVersion || 2 <= minorVersion) {
/* 256 */         Util.checkGLError();
/*     */         
/* 258 */         GL11.glGetInteger(37158, buffer);
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 263 */           Util.checkGLError();
/* 264 */           profileMask = buffer.get(0);
/* 265 */         } catch (OpenGLException e) {
/* 266 */           LWJGLUtil.log("Failed to retrieve CONTEXT_PROFILE_MASK");
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 271 */     return profileMask;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void initNativeStubs(final Class extension_class, Set supported_extensions, String ext_name) {
/* 279 */     resetNativeStubs(extension_class);
/* 280 */     if (supported_extensions.contains(ext_name)) {
/*     */       try {
/* 282 */         AccessController.doPrivileged(new PrivilegedExceptionAction() {
/*     */               public Object run() throws Exception {
/* 284 */                 Method init_stubs_method = extension_class.getDeclaredMethod("initNativeStubs", null);
/* 285 */                 init_stubs_method.invoke(null, null);
/* 286 */                 return null;
/*     */               } private final Class val$extension_class;
/*     */             });
/* 289 */       } catch (Exception e) {
/* 290 */         LWJGLUtil.log("Failed to initialize extension " + extension_class + " - exception: " + e);
/* 291 */         supported_extensions.remove(ext_name);
/*     */       } 
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
/*     */   public static synchronized void useContext(Object context) throws LWJGLException {
/* 311 */     useContext(context, false);
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
/*     */   public static synchronized void useContext(Object context, boolean forwardCompatible) throws LWJGLException {
/* 332 */     if (context == null) {
/* 333 */       ContextCapabilities.unloadAllStubs();
/* 334 */       setCapabilities(null);
/* 335 */       if (did_auto_load)
/* 336 */         unloadOpenGLLibrary(); 
/*     */       return;
/*     */     } 
/* 339 */     if (gl_ref_count == 0) {
/* 340 */       loadOpenGLLibrary();
/* 341 */       did_auto_load = true;
/*     */     } 
/*     */     try {
/* 344 */       ContextCapabilities capabilities = (ContextCapabilities)capability_cache.get(context);
/* 345 */       if (capabilities == null)
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 352 */         new ContextCapabilities(forwardCompatible);
/* 353 */         capability_cache.put(context, getCapabilities()); }
/*     */       else
/* 355 */       { setCapabilities(capabilities); } 
/* 356 */     } catch (LWJGLException e) {
/* 357 */       if (did_auto_load)
/* 358 */         unloadOpenGLLibrary(); 
/* 359 */       throw e;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static synchronized void loadOpenGLLibrary() throws LWJGLException {
/* 365 */     if (gl_ref_count == 0)
/* 366 */       nLoadOpenGLLibrary(); 
/* 367 */     gl_ref_count++;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void unloadOpenGLLibrary() {
/* 374 */     gl_ref_count--;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 379 */     if (gl_ref_count == 0 && LWJGLUtil.getPlatform() != 1)
/* 380 */       nUnloadOpenGLLibrary(); 
/*     */   }
/*     */   
/*     */   static native long getFunctionAddress(String paramString);
/*     */   
/*     */   private static native void nLoadOpenGLLibrary() throws LWJGLException;
/*     */   
/*     */   private static native void nUnloadOpenGLLibrary();
/*     */   
/*     */   static native void resetNativeStubs(Class paramClass);
/*     */   
/*     */   private static final class CapabilitiesCacheEntry {
/*     */     Thread owner;
/*     */     ContextCapabilities capabilities;
/*     */     
/*     */     private CapabilitiesCacheEntry() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GLContext.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */