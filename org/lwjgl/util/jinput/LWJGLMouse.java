/*     */ package org.lwjgl.util.jinput;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import net.java.games.input.AbstractComponent;
/*     */ import net.java.games.input.Component;
/*     */ import net.java.games.input.Event;
/*     */ import net.java.games.input.Mouse;
/*     */ import org.lwjgl.input.Mouse;
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
/*     */ final class LWJGLMouse
/*     */   extends Mouse
/*     */ {
/*     */   private static final int EVENT_X = 1;
/*     */   private static final int EVENT_Y = 2;
/*     */   private static final int EVENT_WHEEL = 3;
/*     */   private static final int EVENT_BUTTON = 4;
/*     */   private static final int EVENT_DONE = 5;
/*  53 */   private int event_state = 5;
/*     */   
/*     */   protected LWJGLMouse() {
/*  56 */     super("LWJGLMouse", createComponents(), new net.java.games.input.Controller[0], new net.java.games.input.Rumbler[0]);
/*     */   }
/*     */   
/*     */   private static final Component[] createComponents() {
/*  60 */     return new Component[] { (Component)new Axis(Component.Identifier.Axis.X), (Component)new Axis(Component.Identifier.Axis.Y), (Component)new Axis(Component.Identifier.Axis.Z), (Component)new Button(Component.Identifier.Button.LEFT), (Component)new Button(Component.Identifier.Button.MIDDLE), (Component)new Button(Component.Identifier.Button.RIGHT) };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final synchronized void pollDevice() throws IOException {
/*  69 */     if (!Mouse.isCreated())
/*     */       return; 
/*  71 */     Mouse.poll();
/*  72 */     for (int i = 0; i < 3; i++)
/*  73 */       setButtonState(i); 
/*     */   }
/*     */   
/*     */   private final Button map(int lwjgl_button) {
/*  77 */     switch (lwjgl_button) {
/*     */       case 0:
/*  79 */         return (Button)getLeft();
/*     */       case 1:
/*  81 */         return (Button)getRight();
/*     */       case 2:
/*  83 */         return (Button)getMiddle();
/*     */     } 
/*  85 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private final void setButtonState(int lwjgl_button) {
/*  90 */     Button button = map(lwjgl_button);
/*  91 */     if (button != null)
/*  92 */       button.setValue(Mouse.isButtonDown(lwjgl_button) ? 1.0F : 0.0F); 
/*     */   }
/*     */   
/*     */   protected final synchronized boolean getNextDeviceEvent(Event event) throws IOException {
/*  96 */     if (!Mouse.isCreated())
/*  97 */       return false;  while (true) {
/*     */       int dx, dy, dwheel, lwjgl_button;
/*  99 */       long nanos = Mouse.getEventNanoseconds();
/* 100 */       switch (this.event_state) {
/*     */         case 1:
/* 102 */           this.event_state = 2;
/* 103 */           dx = Mouse.getEventDX();
/* 104 */           if (dx != 0) {
/* 105 */             event.set(getX(), dx, nanos);
/* 106 */             return true;
/*     */           } 
/*     */         
/*     */         case 2:
/* 110 */           this.event_state = 3;
/*     */ 
/*     */ 
/*     */           
/* 114 */           dy = -Mouse.getEventDY();
/* 115 */           if (dy != 0) {
/* 116 */             event.set(getY(), dy, nanos);
/* 117 */             return true;
/*     */           } 
/*     */         
/*     */         case 3:
/* 121 */           this.event_state = 4;
/* 122 */           dwheel = Mouse.getEventDWheel();
/* 123 */           if (dwheel != 0) {
/* 124 */             event.set(getWheel(), dwheel, nanos);
/* 125 */             return true;
/*     */           } 
/*     */         
/*     */         case 4:
/* 129 */           this.event_state = 5;
/* 130 */           lwjgl_button = Mouse.getEventButton();
/* 131 */           if (lwjgl_button != -1) {
/* 132 */             Button button = map(lwjgl_button);
/* 133 */             if (button != null) {
/* 134 */               event.set((Component)button, Mouse.getEventButtonState() ? 1.0F : 0.0F, nanos);
/* 135 */               return true;
/*     */             } 
/*     */           } 
/*     */         
/*     */         case 5:
/* 140 */           if (!Mouse.next())
/* 141 */             return false; 
/* 142 */           this.event_state = 1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static final class Axis
/*     */     extends AbstractComponent
/*     */   {
/*     */     public Axis(Component.Identifier.Axis axis_id) {
/* 152 */       super(axis_id.getName(), (Component.Identifier)axis_id);
/*     */     }
/*     */     
/*     */     public final boolean isRelative() {
/* 156 */       return true;
/*     */     }
/*     */     
/*     */     protected final float poll() throws IOException {
/* 160 */       return 0.0F;
/*     */     }
/*     */     
/*     */     public final boolean isAnalog() {
/* 164 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class Button extends AbstractComponent {
/*     */     private float value;
/*     */     
/*     */     public Button(Component.Identifier.Button button_id) {
/* 172 */       super(button_id.getName(), (Component.Identifier)button_id);
/*     */     }
/*     */     
/*     */     protected final void setValue(float value) {
/* 176 */       this.value = value;
/*     */     }
/*     */     
/*     */     protected final float poll() throws IOException {
/* 180 */       return this.value;
/*     */     }
/*     */     
/*     */     public final boolean isRelative() {
/* 184 */       return false;
/*     */     }
/*     */     
/*     */     public final boolean isAnalog() {
/* 188 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\jinput\LWJGLMouse.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */