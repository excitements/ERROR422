/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class OSXHIDDeviceIterator
/*    */ {
/* 52 */   private final long iterator_address = nCreateIterator();
/*    */   
/*    */   private static final native long nCreateIterator();
/*    */   
/*    */   public final void close() {
/* 57 */     nReleaseIterator(this.iterator_address);
/*    */   }
/*    */ 
/*    */   
/*    */   public final OSXHIDDevice next() throws IOException {
/* 62 */     return nNext(this.iterator_address);
/*    */   }
/*    */   
/*    */   private static final native void nReleaseIterator(long paramLong);
/*    */   
/*    */   private static final native OSXHIDDevice nNext(long paramLong) throws IOException;
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\OSXHIDDeviceIterator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */