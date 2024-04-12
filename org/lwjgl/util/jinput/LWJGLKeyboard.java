/*     */ package org.lwjgl.util.jinput;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.java.games.input.AbstractComponent;
/*     */ import net.java.games.input.Component;
/*     */ import net.java.games.input.Event;
/*     */ import net.java.games.input.Keyboard;
/*     */ import org.lwjgl.input.Keyboard;
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
/*     */ final class LWJGLKeyboard
/*     */   extends Keyboard
/*     */ {
/*     */   protected LWJGLKeyboard() {
/*  53 */     super("LWJGLKeyboard", createComponents(), new net.java.games.input.Controller[0], new net.java.games.input.Rumbler[0]);
/*     */   }
/*     */   
/*     */   private static final Component[] createComponents() {
/*  57 */     List components = new ArrayList();
/*  58 */     Field[] vkey_fields = Keyboard.class.getFields();
/*  59 */     for (int i = 0; i < vkey_fields.length; i++) {
/*  60 */       Field vkey_field = vkey_fields[i];
/*     */       try {
/*  62 */         if (Modifier.isStatic(vkey_field.getModifiers()) && vkey_field.getType() == int.class && vkey_field.getName().startsWith("KEY_")) {
/*     */           
/*  64 */           int vkey_code = vkey_field.getInt(null);
/*  65 */           Component.Identifier.Key key_id = KeyMap.map(vkey_code);
/*  66 */           if (key_id != Component.Identifier.Key.UNKNOWN)
/*  67 */             components.add(new Key(key_id, vkey_code)); 
/*     */         } 
/*  69 */       } catch (IllegalAccessException e) {
/*  70 */         throw new RuntimeException(e);
/*     */       } 
/*     */     } 
/*  73 */     return components.<Component>toArray(new Component[0]);
/*     */   }
/*     */   
/*     */   public final synchronized void pollDevice() throws IOException {
/*  77 */     if (!Keyboard.isCreated())
/*     */       return; 
/*  79 */     Keyboard.poll();
/*  80 */     Component[] components = getComponents();
/*  81 */     for (int i = 0; i < components.length; i++) {
/*  82 */       Key key = (Key)components[i];
/*  83 */       key.update();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected final synchronized boolean getNextDeviceEvent(Event event) throws IOException {
/*  88 */     if (!Keyboard.isCreated())
/*  89 */       return false; 
/*  90 */     if (!Keyboard.next())
/*  91 */       return false; 
/*  92 */     int lwjgl_key = Keyboard.getEventKey();
/*  93 */     if (lwjgl_key == 0)
/*  94 */       return false; 
/*  95 */     Component.Identifier.Key key_id = KeyMap.map(lwjgl_key);
/*  96 */     if (key_id == null)
/*  97 */       return false; 
/*  98 */     Component key = getComponent((Component.Identifier)key_id);
/*  99 */     if (key == null)
/* 100 */       return false; 
/* 101 */     float value = Keyboard.getEventKeyState() ? 1.0F : 0.0F;
/* 102 */     event.set(key, value, Keyboard.getEventNanoseconds());
/* 103 */     return true;
/*     */   }
/*     */   
/*     */   private static final class Key
/*     */     extends AbstractComponent {
/*     */     private final int lwjgl_key;
/*     */     private float value;
/*     */     
/*     */     public Key(Component.Identifier.Key key_id, int lwjgl_key) {
/* 112 */       super(key_id.getName(), (Component.Identifier)key_id);
/* 113 */       this.lwjgl_key = lwjgl_key;
/*     */     }
/*     */     
/*     */     public final void update() {
/* 117 */       this.value = Keyboard.isKeyDown(this.lwjgl_key) ? 1.0F : 0.0F;
/*     */     }
/*     */     
/*     */     protected final float poll() {
/* 121 */       return this.value;
/*     */     }
/*     */     
/*     */     public final boolean isRelative() {
/* 125 */       return false;
/*     */     }
/*     */     
/*     */     public final boolean isAnalog() {
/* 129 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\jinput\LWJGLKeyboard.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */