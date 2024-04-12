/*     */ package net.java.games.input;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.java.games.util.plugins.Plugin;
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
/*     */ public final class DirectInputEnvironmentPlugin
/*     */   extends ControllerEnvironment
/*     */   implements Plugin
/*     */ {
/*     */   private static boolean supported = false;
/*     */   private final Controller[] controllers;
/*     */   
/*     */   static void loadLibrary(final String lib_name) {
/*  67 */     AccessController.doPrivileged(new PrivilegedAction() { private final String val$lib_name;
/*     */           
/*     */           public final Object run() {
/*     */             try {
/*  71 */               String lib_path = System.getProperty("net.java.games.input.librarypath");
/*  72 */               if (lib_path != null)
/*  73 */               { System.load(lib_path + File.separator + System.mapLibraryName(lib_name)); }
/*     */               else
/*  75 */               { System.loadLibrary(lib_name); } 
/*  76 */             } catch (UnsatisfiedLinkError e) {
/*  77 */               e.printStackTrace();
/*  78 */               DirectInputEnvironmentPlugin.supported = false;
/*     */             } 
/*  80 */             return null;
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   static String getPrivilegedProperty(final String property) {
/*  86 */     return AccessController.<String>doPrivileged(new PrivilegedAction() { private final String val$property;
/*     */           public Object run() {
/*  88 */             return System.getProperty(property);
/*     */           } }
/*     */       );
/*     */   }
/*     */ 
/*     */   
/*     */   static String getPrivilegedProperty(final String property, final String default_value) {
/*  95 */     return AccessController.<String>doPrivileged(new PrivilegedAction() { private final String val$property;
/*     */           public Object run() {
/*  97 */             return System.getProperty(property, default_value);
/*     */           }
/*     */           private final String val$default_value; }
/*     */       );
/*     */   }
/*     */   static {
/* 103 */     String osName = getPrivilegedProperty("os.name", "").trim();
/* 104 */     if (osName.startsWith("Windows")) {
/* 105 */       supported = true;
/* 106 */       if ("x86".equals(getPrivilegedProperty("os.arch"))) {
/* 107 */         loadLibrary("jinput-dx8");
/*     */       } else {
/* 109 */         loadLibrary("jinput-dx8_64");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/* 115 */   private final List active_devices = new ArrayList();
/*     */   
/*     */   private final DummyWindow window;
/*     */   
/*     */   public DirectInputEnvironmentPlugin() {
/* 120 */     DummyWindow window = null;
/* 121 */     Controller[] controllers = new Controller[0];
/* 122 */     if (isSupported()) {
/*     */       try {
/* 124 */         window = new DummyWindow();
/*     */         try {
/* 126 */           controllers = enumControllers(window);
/* 127 */         } catch (IOException e) {
/* 128 */           window.destroy();
/* 129 */           throw e;
/*     */         } 
/* 131 */       } catch (IOException e) {
/* 132 */         logln("Failed to enumerate devices: " + e.getMessage());
/*     */       } 
/* 134 */       this.window = window;
/* 135 */       this.controllers = controllers;
/* 136 */       AccessController.doPrivileged(new PrivilegedAction() { private final DirectInputEnvironmentPlugin this$0;
/*     */             
/*     */             public final Object run() {
/* 139 */               Runtime.getRuntime().addShutdownHook(new DirectInputEnvironmentPlugin.ShutdownHook());
/* 140 */               return null;
/*     */             } }
/*     */         );
/*     */     }
/*     */     else {
/*     */       
/* 146 */       this.window = null;
/* 147 */       this.controllers = controllers;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final Controller[] getControllers() {
/* 152 */     return this.controllers;
/*     */   }
/*     */   
/*     */   private final Component[] createComponents(IDirectInputDevice device, boolean map_mouse_buttons) {
/* 156 */     List device_objects = device.getObjects();
/* 157 */     List controller_components = new ArrayList();
/* 158 */     for (int i = 0; i < device_objects.size(); i++) {
/* 159 */       DIDeviceObject device_object = device_objects.get(i);
/* 160 */       Component.Identifier identifier = device_object.getIdentifier();
/* 161 */       if (identifier != null) {
/*     */         
/* 163 */         if (map_mouse_buttons && identifier instanceof Component.Identifier.Button) {
/* 164 */           identifier = DIIdentifierMap.mapMouseButtonIdentifier((Component.Identifier.Button)identifier);
/*     */         }
/* 166 */         DIComponent component = new DIComponent(identifier, device_object);
/* 167 */         controller_components.add(component);
/* 168 */         device.registerComponent(device_object, component);
/*     */       } 
/* 170 */     }  Component[] components = new Component[controller_components.size()];
/* 171 */     controller_components.toArray(components);
/* 172 */     return components;
/*     */   }
/*     */   
/*     */   private final Mouse createMouseFromDevice(IDirectInputDevice device) {
/* 176 */     Component[] components = createComponents(device, true);
/* 177 */     Mouse mouse = new DIMouse(device, components, new Controller[0], device.getRumblers());
/* 178 */     if (mouse.getX() != null && mouse.getY() != null && mouse.getPrimaryButton() != null) {
/* 179 */       return mouse;
/*     */     }
/* 181 */     return null;
/*     */   }
/*     */   
/*     */   private final AbstractController createControllerFromDevice(IDirectInputDevice device, Controller.Type type) {
/* 185 */     Component[] components = createComponents(device, false);
/* 186 */     AbstractController controller = new DIAbstractController(device, components, new Controller[0], device.getRumblers(), type);
/* 187 */     return controller;
/*     */   }
/*     */   
/*     */   private final Keyboard createKeyboardFromDevice(IDirectInputDevice device) {
/* 191 */     Component[] components = createComponents(device, false);
/* 192 */     return new DIKeyboard(device, components, new Controller[0], device.getRumblers());
/*     */   }
/*     */   
/*     */   private final Controller createControllerFromDevice(IDirectInputDevice device) {
/* 196 */     switch (device.getType()) {
/*     */       case 18:
/* 198 */         return createMouseFromDevice(device);
/*     */       case 19:
/* 200 */         return createKeyboardFromDevice(device);
/*     */       case 21:
/* 202 */         return createControllerFromDevice(device, Controller.Type.GAMEPAD);
/*     */       case 22:
/* 204 */         return createControllerFromDevice(device, Controller.Type.WHEEL);
/*     */ 
/*     */       
/*     */       case 20:
/*     */       case 23:
/*     */       case 24:
/* 210 */         return createControllerFromDevice(device, Controller.Type.STICK);
/*     */     } 
/* 212 */     return createControllerFromDevice(device, Controller.Type.UNKNOWN);
/*     */   }
/*     */ 
/*     */   
/*     */   private final Controller[] enumControllers(DummyWindow window) throws IOException {
/* 217 */     List controllers = new ArrayList();
/* 218 */     IDirectInput dinput = new IDirectInput(window);
/*     */     
/* 220 */     try { List devices = dinput.getDevices();
/* 221 */       for (int i = 0; i < devices.size(); i++) {
/* 222 */         IDirectInputDevice device = devices.get(i);
/* 223 */         Controller controller = createControllerFromDevice(device);
/* 224 */         if (controller != null) {
/* 225 */           controllers.add(controller);
/* 226 */           this.active_devices.add(device);
/*     */         } else {
/* 228 */           device.release();
/*     */         } 
/*     */       }  }
/* 231 */     finally { dinput.release(); }
/*     */     
/* 233 */     Controller[] controllers_array = new Controller[controllers.size()];
/* 234 */     controllers.toArray(controllers_array);
/* 235 */     return controllers_array;
/*     */   }
/*     */   private final class ShutdownHook extends Thread { private final DirectInputEnvironmentPlugin this$0;
/*     */     private ShutdownHook() {}
/*     */     
/*     */     public final void run() {
/* 241 */       for (int i = 0; i < DirectInputEnvironmentPlugin.this.active_devices.size(); i++) {
/* 242 */         IDirectInputDevice device = DirectInputEnvironmentPlugin.this.active_devices.get(i);
/* 243 */         device.release();
/*     */       } 
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSupported() {
/* 252 */     return supported;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\DirectInputEnvironmentPlugin.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */