/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.awt.Canvas;
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
/*    */ final class MacOSXAWTGLCanvasPeerInfo
/*    */   extends MacOSXCanvasPeerInfo
/*    */ {
/*    */   private final Canvas component;
/*    */   
/*    */   MacOSXAWTGLCanvasPeerInfo(Canvas component, PixelFormat pixel_format, boolean support_pbuffer) throws LWJGLException {
/* 48 */     super(pixel_format, support_pbuffer);
/* 49 */     this.component = component;
/*    */   }
/*    */   
/*    */   protected void doLockAndInitHandle() throws LWJGLException {
/* 53 */     initHandle(this.component);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXAWTGLCanvasPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */