/*     */ package net.java.games.input;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ControllerEnvironment
/*     */ {
/*     */   static void logln(String msg) {
/*  73 */     log(msg + "\n");
/*     */   }
/*     */   
/*     */   static void log(String msg) {
/*  77 */     System.out.print(msg);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   private static ControllerEnvironment defaultEnvironment = new DefaultControllerEnvironment();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   protected final ArrayList controllerListeners = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static final boolean $assertionsDisabled;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addControllerListener(ControllerListener l) {
/* 107 */     assert l != null;
/* 108 */     this.controllerListeners.add(l);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeControllerListener(ControllerListener l) {
/* 122 */     assert l != null;
/* 123 */     this.controllerListeners.remove(l);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireControllerAdded(Controller c) {
/* 131 */     ControllerEvent ev = new ControllerEvent(c);
/* 132 */     Iterator it = this.controllerListeners.iterator();
/* 133 */     while (it.hasNext()) {
/* 134 */       ((ControllerListener)it.next()).controllerAdded(ev);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireControllerRemoved(Controller c) {
/* 143 */     ControllerEvent ev = new ControllerEvent(c);
/* 144 */     Iterator it = this.controllerListeners.iterator();
/* 145 */     while (it.hasNext()) {
/* 146 */       ((ControllerListener)it.next()).controllerRemoved(ev);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ControllerEnvironment getDefaultEnvironment() {
/* 155 */     return defaultEnvironment;
/*     */   }
/*     */   
/*     */   public abstract Controller[] getControllers();
/*     */   
/*     */   public abstract boolean isSupported();
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\ControllerEnvironment.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */