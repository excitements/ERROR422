/*     */ package net.java.games.input;
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
/*     */ public interface Controller
/*     */ {
/*     */   Controller[] getControllers();
/*     */   
/*     */   Type getType();
/*     */   
/*     */   Component[] getComponents();
/*     */   
/*     */   Component getComponent(Component.Identifier paramIdentifier);
/*     */   
/*     */   Rumbler[] getRumblers();
/*     */   
/*     */   boolean poll();
/*     */   
/*     */   void setEventQueueSize(int paramInt);
/*     */   
/*     */   EventQueue getEventQueue();
/*     */   
/*     */   PortType getPortType();
/*     */   
/*     */   int getPortNumber();
/*     */   
/*     */   String getName();
/*     */   
/*     */   public static class Type
/*     */   {
/*     */     private final String name;
/*     */     
/*     */     protected Type(String name) {
/* 132 */       this.name = name;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 139 */       return this.name;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     public static final Type UNKNOWN = new Type("Unknown");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     public static final Type MOUSE = new Type("Mouse");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     public static final Type KEYBOARD = new Type("Keyboard");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     public static final Type FINGERSTICK = new Type("Fingerstick");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 166 */     public static final Type GAMEPAD = new Type("Gamepad");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     public static final Type HEADTRACKER = new Type("Headtracker");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     public static final Type RUDDER = new Type("Rudder");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     public static final Type STICK = new Type("Stick");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 187 */     public static final Type TRACKBALL = new Type("Trackball");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     public static final Type TRACKPAD = new Type("Trackpad");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 200 */     public static final Type WHEEL = new Type("Wheel");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class PortType
/*     */   {
/*     */     private final String name;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected PortType(String name) {
/* 217 */       this.name = name;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 224 */       return this.name;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 230 */     public static final PortType UNKNOWN = new PortType("Unknown");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 235 */     public static final PortType USB = new PortType("USB port");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     public static final PortType GAME = new PortType("Game port");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     public static final PortType NETWORK = new PortType("Network port");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 250 */     public static final PortType SERIAL = new PortType("Serial port");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 255 */     public static final PortType I8042 = new PortType("i8042 (PS/2)");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 260 */     public static final PortType PARALLEL = new PortType("Parallel port");
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\Controller.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */