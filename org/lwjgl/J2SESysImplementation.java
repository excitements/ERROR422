/*    */ package org.lwjgl;
/*    */ 
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.datatransfer.Clipboard;
/*    */ import java.awt.datatransfer.DataFlavor;
/*    */ import java.awt.datatransfer.Transferable;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.UIManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class J2SESysImplementation
/*    */   extends DefaultSysImplementation
/*    */ {
/*    */   public long getTime() {
/* 47 */     return System.currentTimeMillis();
/*    */   }
/*    */   
/*    */   public void alert(String title, String message) {
/*    */     try {
/* 52 */       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/* 53 */     } catch (Exception e) {
/* 54 */       LWJGLUtil.log("Caught exception while setting LAF: " + e);
/*    */     } 
/* 56 */     JOptionPane.showMessageDialog(null, message, title, 2);
/*    */   }
/*    */   
/*    */   public String getClipboard() {
/*    */     try {
/* 61 */       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
/* 62 */       Transferable transferable = clipboard.getContents(null);
/* 63 */       if (transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
/* 64 */         return (String)transferable.getTransferData(DataFlavor.stringFlavor);
/*    */       }
/* 66 */     } catch (Exception e) {
/* 67 */       LWJGLUtil.log("Exception while getting clipboard: " + e);
/*    */     } 
/* 69 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\J2SESysImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */