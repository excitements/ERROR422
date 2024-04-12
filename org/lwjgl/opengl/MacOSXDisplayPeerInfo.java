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
/*    */ final class MacOSXDisplayPeerInfo
/*    */   extends MacOSXCanvasPeerInfo
/*    */ {
/*    */   private boolean locked = false;
/*    */   
/*    */   MacOSXDisplayPeerInfo(PixelFormat pixel_format, boolean support_pbuffer) throws LWJGLException {
/* 48 */     super(pixel_format, support_pbuffer);
/*    */   }
/*    */   
/*    */   protected void doLockAndInitHandle() throws LWJGLException {
/* 52 */     if (this.locked)
/* 53 */       throw new RuntimeException("Already locked"); 
/* 54 */     Canvas canvas = ((MacOSXDisplay)Display.getImplementation()).getCanvas();
/* 55 */     if (canvas != null) {
/* 56 */       initHandle(canvas);
/* 57 */       this.locked = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void doUnlock() throws LWJGLException {
/* 62 */     if (this.locked) {
/* 63 */       super.doUnlock();
/* 64 */       this.locked = false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\MacOSXDisplayPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */