/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ abstract class LinuxPeerInfo
/*    */   extends PeerInfo
/*    */ {
/*    */   private static native ByteBuffer createHandle();
/*    */   
/*    */   LinuxPeerInfo() {
/* 44 */     super(createHandle());
/*    */   }
/*    */ 
/*    */   
/*    */   public final long getDisplay() {
/* 49 */     return nGetDisplay(getHandle());
/*    */   }
/*    */ 
/*    */   
/*    */   public final long getDrawable() {
/* 54 */     return nGetDrawable(getHandle());
/*    */   }
/*    */   
/*    */   private static native long nGetDisplay(ByteBuffer paramByteBuffer);
/*    */   
/*    */   private static native long nGetDrawable(ByteBuffer paramByteBuffer);
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxPeerInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */