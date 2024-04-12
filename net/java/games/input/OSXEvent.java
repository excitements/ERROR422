/*    */ package net.java.games.input;
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
/*    */ class OSXEvent
/*    */ {
/*    */   private long type;
/*    */   private long cookie;
/*    */   private int value;
/*    */   private long nanos;
/*    */   
/*    */   public void set(long type, long cookie, int value, long nanos) {
/* 52 */     this.type = type;
/* 53 */     this.cookie = cookie;
/* 54 */     this.value = value;
/* 55 */     this.nanos = nanos;
/*    */   }
/*    */   
/*    */   public long getType() {
/* 59 */     return this.type;
/*    */   }
/*    */   
/*    */   public long getCookie() {
/* 63 */     return this.cookie;
/*    */   }
/*    */   
/*    */   public int getValue() {
/* 67 */     return this.value;
/*    */   }
/*    */   
/*    */   public long getNanos() {
/* 71 */     return this.nanos;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\OSXEvent.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */