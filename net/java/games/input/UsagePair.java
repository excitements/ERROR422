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
/*    */ class UsagePair
/*    */ {
/*    */   private final UsagePage usage_page;
/*    */   private final Usage usage;
/*    */   
/*    */   public UsagePair(UsagePage usage_page, Usage usage) {
/* 50 */     this.usage_page = usage_page;
/* 51 */     this.usage = usage;
/*    */   }
/*    */   
/*    */   public final UsagePage getUsagePage() {
/* 55 */     return this.usage_page;
/*    */   }
/*    */   
/*    */   public final Usage getUsage() {
/* 59 */     return this.usage;
/*    */   }
/*    */   
/*    */   public final int hashCode() {
/* 63 */     return this.usage.hashCode() ^ this.usage_page.hashCode();
/*    */   }
/*    */   
/*    */   public final boolean equals(Object other) {
/* 67 */     if (!(other instanceof UsagePair))
/* 68 */       return false; 
/* 69 */     UsagePair other_pair = (UsagePair)other;
/* 70 */     return (other_pair.usage.equals(this.usage) && other_pair.usage_page.equals(this.usage_page));
/*    */   }
/*    */   
/*    */   public final String toString() {
/* 74 */     return "UsagePair: (page = " + this.usage_page + ", usage = " + this.usage + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\UsagePair.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */