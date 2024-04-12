/*    */ package net.java.games.util.plugins.test;
/*    */ 
/*    */ import javax.swing.DefaultListModel;
/*    */ import javax.swing.JList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ListUpdater
/*    */   implements Runnable
/*    */ {
/*    */   Object[] objList;
/*    */   DefaultListModel mdl;
/*    */   
/*    */   public ListUpdater(JList jlist, Object[] list) {
/* 71 */     this.objList = list;
/* 72 */     this.mdl = (DefaultListModel)jlist.getModel();
/*    */   }
/*    */   
/*    */   public void run() {
/* 76 */     this.mdl.clear();
/* 77 */     for (int i = 0; i < this.objList.length; i++)
/* 78 */       this.mdl.addElement(this.objList[i]); 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\game\\util\plugins\test\ListUpdater.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */