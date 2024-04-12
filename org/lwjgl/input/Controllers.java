/*     */ package org.lwjgl.input;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import net.java.games.input.Controller;
/*     */ import net.java.games.input.ControllerEnvironment;
/*     */ import org.lwjgl.LWJGLException;
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
/*     */ public class Controllers
/*     */ {
/*  47 */   private static ArrayList controllers = new ArrayList();
/*     */ 
/*     */   
/*     */   private static int controllerCount;
/*     */   
/*  52 */   private static ArrayList events = new ArrayList();
/*     */ 
/*     */ 
/*     */   
/*     */   private static ControllerEvent event;
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean created;
/*     */ 
/*     */ 
/*     */   
/*     */   public static void create() throws LWJGLException {
/*  65 */     if (created) {
/*     */       return;
/*     */     }
/*     */     try {
/*  69 */       ControllerEnvironment env = ControllerEnvironment.getDefaultEnvironment();
/*     */       
/*  71 */       Controller[] found = env.getControllers();
/*  72 */       ArrayList lollers = new ArrayList();
/*  73 */       for (int i = 0; i < found.length; i++) {
/*  74 */         Controller c = found[i];
/*     */         
/*  76 */         if (!c.getType().equals(Controller.Type.KEYBOARD) && !c.getType().equals(Controller.Type.MOUSE))
/*     */         {
/*  78 */           lollers.add(c);
/*     */         }
/*     */       } 
/*     */       
/*  82 */       int length = lollers.size();
/*     */       
/*  84 */       for (int j = 0; j < length; j++) {
/*  85 */         Controller c = lollers.get(j);
/*     */         
/*  87 */         createController(c);
/*     */       } 
/*     */       
/*  90 */       created = true;
/*  91 */     } catch (Throwable e) {
/*  92 */       throw new LWJGLException("Failed to initialise controllers", e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void createController(Controller c) {
/* 102 */     Controller[] sub = c.getControllers();
/* 103 */     if (sub.length == 0) {
/* 104 */       JInputController controller = new JInputController(controllerCount, c);
/*     */       
/* 106 */       controllers.add(controller);
/* 107 */       controllerCount++;
/*     */     } else {
/* 109 */       for (int i = 0; i < sub.length; i++) {
/* 110 */         createController(sub[i]);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Controller getController(int index) {
/* 122 */     return controllers.get(index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getControllerCount() {
/* 131 */     return controllers.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void poll() {
/* 139 */     for (int i = 0; i < controllers.size(); i++) {
/* 140 */       getController(i).poll();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void clearEvents() {
/* 148 */     events.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean next() {
/* 157 */     if (events.size() == 0) {
/* 158 */       event = null;
/* 159 */       return false;
/*     */     } 
/*     */     
/* 162 */     event = events.remove(0);
/*     */     
/* 164 */     return (event != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isCreated() {
/* 171 */     return created;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void destroy() {}
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
/*     */   public static Controller getEventSource() {
/* 202 */     return event.getSource();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventControlIndex() {
/* 211 */     return event.getControlIndex();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEventButton() {
/* 220 */     return event.isButton();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEventAxis() {
/* 229 */     return event.isAxis();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEventXAxis() {
/* 238 */     return event.isXAxis();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEventYAxis() {
/* 247 */     return event.isYAxis();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEventPovX() {
/* 256 */     return event.isPovX();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEventPovY() {
/* 265 */     return event.isPovY();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getEventNanoseconds() {
/* 274 */     return event.getTimeStamp();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void addEvent(ControllerEvent event) {
/* 283 */     if (event != null)
/* 284 */       events.add(event); 
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\input\Controllers.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */