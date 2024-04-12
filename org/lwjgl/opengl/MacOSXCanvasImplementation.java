/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.awt.GraphicsConfiguration;
/*    */ import java.awt.GraphicsDevice;
/*    */ import org.lwjgl.LWJGLException;
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
/*    */ final class MacOSXCanvasImplementation
/*    */   implements AWTCanvasImplementation
/*    */ {
/*    */   public PeerInfo createPeerInfo(Canvas component, PixelFormat pixel_format) throws LWJGLException {
/*    */     try {
/* 49 */       return new MacOSXAWTGLCanvasPeerInfo(component, pixel_format, true);
/* 50 */     } catch (LWJGLException e) {
/* 51 */       return new MacOSXAWTGLCanvasPeerInfo(component, pixel_format, false);
/*    */     } 
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
/*    */   public GraphicsConfiguration findConfiguration(GraphicsDevice device, PixelFormat pixel_format) throws LWJGLException {
/* 64 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXCanvasImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */