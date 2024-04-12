/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.awt.GraphicsConfiguration;
/*    */ import java.awt.GraphicsDevice;
/*    */ import java.awt.Toolkit;
/*    */ import java.security.AccessController;
/*    */ import java.security.PrivilegedAction;
/*    */ import org.lwjgl.LWJGLException;
/*    */ import org.lwjgl.LWJGLUtil;
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
/*    */ 
/*    */ 
/*    */ final class WindowsCanvasImplementation
/*    */   implements AWTCanvasImplementation
/*    */ {
/*    */   static {
/* 53 */     Toolkit.getDefaultToolkit();
/* 54 */     AccessController.doPrivileged(new PrivilegedAction() {
/*    */           public Object run() {
/*    */             try {
/* 57 */               System.loadLibrary("jawt");
/* 58 */             } catch (UnsatisfiedLinkError e) {
/*    */ 
/*    */ 
/*    */               
/* 62 */               LWJGLUtil.log("Failed to load jawt: " + e.getMessage());
/*    */             } 
/* 64 */             return null;
/*    */           }
/*    */         });
/*    */   }
/*    */   
/*    */   public PeerInfo createPeerInfo(Canvas component, PixelFormat pixel_format) throws LWJGLException {
/* 70 */     return new WindowsAWTGLCanvasPeerInfo(component, pixel_format);
/*    */   }
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
/*    */   public GraphicsConfiguration findConfiguration(GraphicsDevice device, PixelFormat pixel_format) throws LWJGLException {
/* 83 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\WindowsCanvasImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */