/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.lang.reflect.Method;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedExceptionAction;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class LinuxCanvasImplementation
/*     */   implements AWTCanvasImplementation
/*     */ {
/*     */   static int getScreenFromDevice(final GraphicsDevice device) throws LWJGLException {
/*     */     try {
/*  53 */       Method getScreen_method = AccessController.<Method>doPrivileged(new PrivilegedExceptionAction() {
/*     */             public Object run() throws Exception {
/*  55 */               return device.getClass().getMethod("getScreen", null);
/*     */             } private final GraphicsDevice val$device;
/*     */           });
/*  58 */       Integer screen = (Integer)getScreen_method.invoke(device, null);
/*  59 */       return screen.intValue();
/*  60 */     } catch (Exception e) {
/*  61 */       throw new LWJGLException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int getVisualIDFromConfiguration(final GraphicsConfiguration configuration) throws LWJGLException {
/*     */     try {
/*  67 */       Method getVisual_method = AccessController.<Method>doPrivileged(new PrivilegedExceptionAction() { private final GraphicsConfiguration val$configuration;
/*     */             public Object run() throws Exception {
/*  69 */               return configuration.getClass().getMethod("getVisual", null);
/*     */             } }
/*     */         );
/*  72 */       Integer visual = (Integer)getVisual_method.invoke(configuration, null);
/*  73 */       return visual.intValue();
/*  74 */     } catch (Exception e) {
/*  75 */       throw new LWJGLException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public PeerInfo createPeerInfo(Canvas component, PixelFormat pixel_format) throws LWJGLException {
/*  80 */     return new LinuxAWTGLCanvasPeerInfo(component);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GraphicsConfiguration findConfiguration(GraphicsDevice device, PixelFormat pixel_format) throws LWJGLException {
/*     */     try {
/*  90 */       int screen = getScreenFromDevice(device);
/*  91 */       int visual_id_matching_format = findVisualIDFromFormat(screen, pixel_format);
/*  92 */       GraphicsConfiguration[] configurations = device.getConfigurations();
/*  93 */       for (int i = 0; i < configurations.length; i++) {
/*  94 */         int visual_id = getVisualIDFromConfiguration(configurations[i]);
/*  95 */         if (visual_id == visual_id_matching_format)
/*  96 */           return configurations[i]; 
/*     */       } 
/*  98 */     } catch (LWJGLException e) {
/*  99 */       LWJGLUtil.log("Got exception while trying to determine configuration: " + e);
/*     */     } 
/* 101 */     return null;
/*     */   }
/*     */   
/*     */   private static int findVisualIDFromFormat(int screen, PixelFormat pixel_format) throws LWJGLException {
/*     */     try {
/* 106 */       LinuxDisplay.lockAWT();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     finally {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 119 */       LinuxDisplay.unlockAWT();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static native int nFindVisualIDFromFormat(long paramLong, int paramInt, PixelFormat paramPixelFormat) throws LWJGLException;
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxCanvasImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */