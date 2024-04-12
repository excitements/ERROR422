/*    */ package net.java.games.input;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class LinuxDeviceThread
/*    */   extends Thread
/*    */ {
/* 43 */   private final List tasks = new ArrayList();
/*    */   
/*    */   public LinuxDeviceThread() {
/* 46 */     setDaemon(true);
/* 47 */     start();
/*    */   }
/*    */   
/*    */   public final synchronized void run() {
/*    */     while (true) {
/* 52 */       while (!this.tasks.isEmpty()) {
/* 53 */         LinuxDeviceTask task = this.tasks.remove(0);
/* 54 */         task.doExecute();
/* 55 */         synchronized (task) {
/* 56 */           task.notify();
/*    */         } 
/*    */       } 
/*    */       try {
/* 60 */         wait();
/* 61 */       } catch (InterruptedException e) {}
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final Object execute(LinuxDeviceTask task) throws IOException {
/* 69 */     synchronized (this) {
/* 70 */       this.tasks.add(task);
/* 71 */       notify();
/*    */     } 
/* 73 */     synchronized (task) {
/* 74 */       while (task.getState() == 1) {
/*    */         try {
/* 76 */           task.wait();
/* 77 */         } catch (InterruptedException e) {}
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 82 */     switch (task.getState()) {
/*    */       case 2:
/* 84 */         return task.getResult();
/*    */       case 3:
/* 86 */         throw task.getException();
/*    */     } 
/* 88 */     throw new RuntimeException("Invalid task state: " + task.getState());
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxDeviceThread.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */