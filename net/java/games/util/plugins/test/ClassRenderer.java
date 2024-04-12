/*    */ package net.java.games.util.plugins.test;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JList;
/*    */ import javax.swing.ListCellRenderer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ClassRenderer
/*    */   implements ListCellRenderer
/*    */ {
/* 53 */   JLabel label = new JLabel();
/*    */ 
/*    */   
/*    */   public Component getListCellRendererComponent(JList jList, Object obj, int param, boolean param3, boolean param4) {
/* 57 */     this.label.setText(((Class)obj).getName());
/* 58 */     this.label.setForeground(Color.BLACK);
/* 59 */     this.label.setBackground(Color.WHITE);
/*    */ 
/*    */ 
/*    */     
/* 63 */     return this.label;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\game\\util\plugins\test\ClassRenderer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */