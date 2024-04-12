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
/*    */ final class DummyWindow
/*    */ {
/* 52 */   private final long hwnd_address = createWindow();
/*    */   
/*    */   private static final native long createWindow() throws IOException;
/*    */   
/*    */   public final void destroy() throws IOException {
/* 57 */     nDestroy(this.hwnd_address);
/*    */   }
/*    */ 
/*    */   
/*    */   public final long getHwnd() {
/* 62 */     return this.hwnd_address;
/*    */   }
/*    */   
/*    */   private static final native void nDestroy(long paramLong) throws IOException;
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\DummyWindow.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */