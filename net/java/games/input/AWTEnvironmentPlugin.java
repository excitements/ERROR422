/*    */ package net.java.games.input;
/*    */ 
/*    */ import net.java.games.util.plugins.Plugin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AWTEnvironmentPlugin
/*    */   extends ControllerEnvironment
/*    */   implements Plugin
/*    */ {
/* 41 */   private final Controller[] controllers = new Controller[] { new AWTKeyboard(), new AWTMouse() };
/*    */ 
/*    */   
/*    */   public Controller[] getControllers() {
/* 45 */     return this.controllers;
/*    */   }
/*    */   
/*    */   public boolean isSupported() {
/* 49 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\AWTEnvironmentPlugin.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */