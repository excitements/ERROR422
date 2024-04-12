/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.IllegalComponentStateException;
/*     */ import java.awt.MouseInfo;
/*     */ import java.awt.Point;
/*     */ import java.awt.PointerInfo;
/*     */ import java.awt.Robot;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.nio.IntBuffer;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedActionException;
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
/*     */ final class AWTUtil
/*     */ {
/*     */   public static boolean hasWheel() {
/*  60 */     return true;
/*     */   }
/*     */   
/*     */   public static int getButtonCount() {
/*  64 */     return 3;
/*     */   }
/*     */   
/*     */   public static int getNativeCursorCapabilities() {
/*  68 */     if (LWJGLUtil.getPlatform() != 2 || LWJGLUtil.isMacOSXEqualsOrBetterThan(10, 4)) {
/*  69 */       int cursor_colors = Toolkit.getDefaultToolkit().getMaximumCursorColors();
/*  70 */       boolean supported = (cursor_colors >= 32767 && getMaxCursorSize() > 0);
/*  71 */       int caps = supported ? 3 : 4;
/*  72 */       return caps;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Robot createRobot(final Component component) {
/*     */     try {
/*  90 */       Robot robot = AccessController.<Robot>doPrivileged(new PrivilegedExceptionAction() {
/*     */             public Object run() throws Exception {
/*  92 */               return new Robot(component.getGraphicsConfiguration().getDevice());
/*     */             } private final Component val$component;
/*     */           });
/*  95 */       return robot;
/*  96 */     } catch (PrivilegedActionException e) {
/*  97 */       LWJGLUtil.log("Got exception while creating robot: " + e.getCause());
/*  98 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int transformY(Component component, int y) {
/* 103 */     return component.getHeight() - 1 - y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Point getPointerLocation(Component component) {
/*     */     try {
/* 113 */       GraphicsConfiguration config = component.getGraphicsConfiguration();
/* 114 */       if (config != null) {
/* 115 */         PointerInfo pointer_info = AccessController.<PointerInfo>doPrivileged(new PrivilegedExceptionAction() {
/*     */               public Object run() throws Exception {
/* 117 */                 return MouseInfo.getPointerInfo();
/*     */               }
/*     */             });
/* 120 */         GraphicsDevice device = pointer_info.getDevice();
/* 121 */         if (device == config.getDevice()) {
/* 122 */           return pointer_info.getLocation();
/*     */         }
/* 124 */         return null;
/*     */       } 
/* 126 */     } catch (PrivilegedActionException e) {
/* 127 */       LWJGLUtil.log("Failed to query pointer location: " + e.getCause());
/*     */     } 
/* 129 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Point getCursorPosition(Component component) {
/*     */     try {
/* 138 */       Point pointer_location = getPointerLocation(component);
/* 139 */       if (pointer_location != null) {
/* 140 */         Point location = component.getLocationOnScreen();
/* 141 */         pointer_location.translate(-location.x, -location.y);
/* 142 */         pointer_location.move(pointer_location.x, transformY(component, pointer_location.y));
/* 143 */         return pointer_location;
/*     */       } 
/* 145 */     } catch (IllegalComponentStateException e) {
/* 146 */       LWJGLUtil.log("Failed to set cursor position: " + e);
/* 147 */     } catch (NoClassDefFoundError e) {
/* 148 */       LWJGLUtil.log("Failed to query cursor position: " + e);
/*     */     } 
/* 150 */     return null;
/*     */   }
/*     */   
/*     */   public static void setCursorPosition(Component component, Robot robot, int x, int y) {
/* 154 */     if (robot != null) {
/*     */       try {
/* 156 */         Point location = component.getLocationOnScreen();
/* 157 */         int transformed_x = location.x + x;
/* 158 */         int transformed_y = location.y + transformY(component, y);
/* 159 */         robot.mouseMove(transformed_x, transformed_y);
/* 160 */       } catch (IllegalComponentStateException e) {
/* 161 */         LWJGLUtil.log("Failed to set cursor position: " + e);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static int getMinCursorSize() {
/* 167 */     Dimension min_size = Toolkit.getDefaultToolkit().getBestCursorSize(0, 0);
/* 168 */     return Math.max(min_size.width, min_size.height);
/*     */   }
/*     */   
/*     */   public static int getMaxCursorSize() {
/* 172 */     Dimension max_size = Toolkit.getDefaultToolkit().getBestCursorSize(10000, 10000);
/* 173 */     return Math.min(max_size.width, max_size.height);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Cursor createCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/* 178 */     BufferedImage cursor_image = new BufferedImage(width, height, 2);
/* 179 */     int[] pixels = new int[images.remaining()];
/* 180 */     int old_position = images.position();
/* 181 */     images.get(pixels);
/* 182 */     images.position(old_position);
/* 183 */     cursor_image.setRGB(0, 0, width, height, pixels, 0, width);
/* 184 */     return Toolkit.getDefaultToolkit().createCustomCursor(cursor_image, new Point(xHotspot, yHotspot), "LWJGL Custom cursor");
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\AWTUtil.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */