/*     */ package net.java.games.input;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.StringTokenizer;
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
/*     */ 
/*     */ public final class OSXEnvironmentPlugin
/*     */   extends ControllerEnvironment
/*     */   implements Plugin
/*     */ {
/*     */   private static boolean supported = false;
/*     */   private final Controller[] controllers;
/*     */   
/*     */   static void loadLibrary(final String lib_name) {
/*  70 */     AccessController.doPrivileged(new PrivilegedAction() { private final String val$lib_name;
/*     */           
/*     */           public final Object run() {
/*     */             try {
/*  74 */               String lib_path = System.getProperty("net.java.games.input.librarypath");
/*  75 */               if (lib_path != null)
/*  76 */               { System.load(lib_path + File.separator + System.mapLibraryName(lib_name)); }
/*     */               else
/*  78 */               { System.loadLibrary(lib_name); } 
/*  79 */             } catch (UnsatisfiedLinkError e) {
/*  80 */               e.printStackTrace();
/*  81 */               OSXEnvironmentPlugin.supported = false;
/*     */             } 
/*  83 */             return null;
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   static String getPrivilegedProperty(final String property) {
/*  89 */     return AccessController.<String>doPrivileged(new PrivilegedAction() { private final String val$property;
/*     */           public Object run() {
/*  91 */             return System.getProperty(property);
/*     */           } }
/*     */       );
/*     */   }
/*     */ 
/*     */   
/*     */   static String getPrivilegedProperty(final String property, final String default_value) {
/*  98 */     return AccessController.<String>doPrivileged(new PrivilegedAction() { private final String val$property;
/*     */           public Object run() {
/* 100 */             return System.getProperty(property, default_value);
/*     */           }
/*     */           private final String val$default_value; }
/*     */       );
/*     */   }
/*     */   static {
/* 106 */     String osName = getPrivilegedProperty("os.name", "").trim();
/* 107 */     if (osName.equals("Mac OS X")) {
/*     */       
/* 109 */       supported = true;
/* 110 */       loadLibrary("jinput-osx");
/*     */     } 
/*     */   }
/*     */   private static final boolean isMacOSXEqualsOrBetterThan(int major_required, int minor_required) {
/*     */     int major, minor;
/* 115 */     String os_version = System.getProperty("os.version");
/* 116 */     StringTokenizer version_tokenizer = new StringTokenizer(os_version, ".");
/*     */ 
/*     */     
/*     */     try {
/* 120 */       String major_str = version_tokenizer.nextToken();
/* 121 */       String minor_str = version_tokenizer.nextToken();
/* 122 */       major = Integer.parseInt(major_str);
/* 123 */       minor = Integer.parseInt(minor_str);
/* 124 */     } catch (Exception e) {
/* 125 */       logln("Exception occurred while trying to determine OS version: " + e);
/*     */       
/* 127 */       return false;
/*     */     } 
/* 129 */     return (major > major_required || (major == major_required && minor >= minor_required));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public OSXEnvironmentPlugin() {
/* 135 */     if (isSupported()) {
/* 136 */       this.controllers = enumerateControllers();
/*     */     } else {
/* 138 */       this.controllers = new Controller[0];
/*     */     } 
/*     */   }
/*     */   
/*     */   public final Controller[] getControllers() {
/* 143 */     return this.controllers;
/*     */   }
/*     */   
/*     */   public boolean isSupported() {
/* 147 */     return supported;
/*     */   }
/*     */   
/*     */   private static final void addElements(OSXHIDQueue queue, List elements, List components, boolean map_mouse_buttons) throws IOException {
/* 151 */     Iterator it = elements.iterator();
/* 152 */     while (it.hasNext()) {
/* 153 */       OSXHIDElement element = it.next();
/* 154 */       Component.Identifier id = element.getIdentifier();
/* 155 */       if (id == null)
/*     */         continue; 
/* 157 */       if (map_mouse_buttons) {
/* 158 */         if (id == Component.Identifier.Button._0) {
/* 159 */           id = Component.Identifier.Button.LEFT;
/* 160 */         } else if (id == Component.Identifier.Button._1) {
/* 161 */           id = Component.Identifier.Button.RIGHT;
/* 162 */         } else if (id == Component.Identifier.Button._2) {
/* 163 */           id = Component.Identifier.Button.MIDDLE;
/*     */         } 
/*     */       }
/* 166 */       OSXComponent component = new OSXComponent(id, element);
/* 167 */       components.add(component);
/* 168 */       queue.addElement(element, component);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final Keyboard createKeyboardFromDevice(OSXHIDDevice device, List elements) throws IOException {
/* 173 */     List components = new ArrayList();
/* 174 */     OSXHIDQueue queue = device.createQueue(32);
/*     */     try {
/* 176 */       addElements(queue, elements, components, false);
/* 177 */     } catch (IOException e) {
/* 178 */       queue.release();
/* 179 */       throw e;
/*     */     } 
/* 181 */     Component[] components_array = new Component[components.size()];
/* 182 */     components.toArray((Object[])components_array);
/* 183 */     Keyboard keyboard = new OSXKeyboard(device, queue, components_array, new Controller[0], new Rumbler[0]);
/* 184 */     return keyboard;
/*     */   }
/*     */   
/*     */   private static final Mouse createMouseFromDevice(OSXHIDDevice device, List elements) throws IOException {
/* 188 */     List components = new ArrayList();
/* 189 */     OSXHIDQueue queue = device.createQueue(32);
/*     */     try {
/* 191 */       addElements(queue, elements, components, true);
/* 192 */     } catch (IOException e) {
/* 193 */       queue.release();
/* 194 */       throw e;
/*     */     } 
/* 196 */     Component[] components_array = new Component[components.size()];
/* 197 */     components.toArray((Object[])components_array);
/* 198 */     Mouse mouse = new OSXMouse(device, queue, components_array, new Controller[0], new Rumbler[0]);
/* 199 */     if (mouse.getPrimaryButton() != null && mouse.getX() != null && mouse.getY() != null) {
/* 200 */       return mouse;
/*     */     }
/* 202 */     queue.release();
/* 203 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final AbstractController createControllerFromDevice(OSXHIDDevice device, List elements, Controller.Type type) throws IOException {
/* 208 */     List components = new ArrayList();
/* 209 */     OSXHIDQueue queue = device.createQueue(32);
/*     */     try {
/* 211 */       addElements(queue, elements, components, false);
/* 212 */     } catch (IOException e) {
/* 213 */       queue.release();
/* 214 */       throw e;
/*     */     } 
/* 216 */     Component[] components_array = new Component[components.size()];
/* 217 */     components.toArray((Object[])components_array);
/* 218 */     AbstractController controller = new OSXAbstractController(device, queue, components_array, new Controller[0], new Rumbler[0], type);
/* 219 */     return controller;
/*     */   }
/*     */   
/*     */   private static final void createControllersFromDevice(OSXHIDDevice device, List controllers) throws IOException {
/* 223 */     UsagePair usage_pair = device.getUsagePair();
/* 224 */     if (usage_pair == null)
/*     */       return; 
/* 226 */     List elements = device.getElements();
/* 227 */     if (usage_pair.getUsagePage() == UsagePage.GENERIC_DESKTOP && (usage_pair.getUsage() == GenericDesktopUsage.MOUSE || usage_pair.getUsage() == GenericDesktopUsage.POINTER)) {
/*     */       
/* 229 */       Controller mouse = createMouseFromDevice(device, elements);
/* 230 */       if (mouse != null)
/* 231 */         controllers.add(mouse); 
/* 232 */     } else if (usage_pair.getUsagePage() == UsagePage.GENERIC_DESKTOP && (usage_pair.getUsage() == GenericDesktopUsage.KEYBOARD || usage_pair.getUsage() == GenericDesktopUsage.KEYPAD)) {
/*     */       
/* 234 */       Controller keyboard = createKeyboardFromDevice(device, elements);
/* 235 */       if (keyboard != null)
/* 236 */         controllers.add(keyboard); 
/* 237 */     } else if (usage_pair.getUsagePage() == UsagePage.GENERIC_DESKTOP && usage_pair.getUsage() == GenericDesktopUsage.JOYSTICK) {
/* 238 */       Controller joystick = createControllerFromDevice(device, elements, Controller.Type.STICK);
/* 239 */       if (joystick != null)
/* 240 */         controllers.add(joystick); 
/* 241 */     } else if (usage_pair.getUsagePage() == UsagePage.GENERIC_DESKTOP && usage_pair.getUsage() == GenericDesktopUsage.GAME_PAD) {
/* 242 */       Controller game_pad = createControllerFromDevice(device, elements, Controller.Type.GAMEPAD);
/* 243 */       if (game_pad != null)
/* 244 */         controllers.add(game_pad); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final Controller[] enumerateControllers() {
/* 249 */     List controllers = new ArrayList();
/*     */     try {
/* 251 */       OSXHIDDeviceIterator it = new OSXHIDDeviceIterator();
/*     */       
/*     */       try {
/*     */         while (true) {
/*     */           try {
/* 256 */             OSXHIDDevice device = it.next();
/* 257 */             if (device == null)
/*     */               break; 
/* 259 */             boolean device_used = false;
/*     */             try {
/* 261 */               int old_size = controllers.size();
/* 262 */               createControllersFromDevice(device, controllers);
/* 263 */               device_used = (old_size != controllers.size());
/* 264 */             } catch (IOException e) {
/* 265 */               logln("Failed to create controllers from device: " + device.getProductName());
/*     */             } 
/* 267 */             if (!device_used)
/* 268 */               device.release(); 
/* 269 */           } catch (IOException e) {
/* 270 */             logln("Failed to enumerate device: " + e.getMessage());
/*     */           } 
/*     */         } 
/*     */       } finally {
/* 274 */         it.close();
/*     */       } 
/* 276 */     } catch (IOException e) {
/* 277 */       log("Failed to enumerate devices: " + e.getMessage());
/* 278 */       return new Controller[0];
/*     */     } 
/* 280 */     Controller[] controllers_array = new Controller[controllers.size()];
/* 281 */     controllers.toArray((Object[])controllers_array);
/* 282 */     return controllers_array;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\OSXEnvironmentPlugin.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */