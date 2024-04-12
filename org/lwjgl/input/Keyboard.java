/*     */ package org.lwjgl.input;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.Sys;
/*     */ import org.lwjgl.opengl.Display;
/*     */ import org.lwjgl.opengl.InputImplementation;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Keyboard
/*     */ {
/*     */   public static final int EVENT_SIZE = 18;
/*     */   public static final int CHAR_NONE = 0;
/*     */   public static final int KEY_NONE = 0;
/*     */   public static final int KEY_ESCAPE = 1;
/*     */   public static final int KEY_1 = 2;
/*     */   public static final int KEY_2 = 3;
/*     */   public static final int KEY_3 = 4;
/*     */   public static final int KEY_4 = 5;
/*     */   public static final int KEY_5 = 6;
/*     */   public static final int KEY_6 = 7;
/*     */   public static final int KEY_7 = 8;
/*     */   public static final int KEY_8 = 9;
/*     */   public static final int KEY_9 = 10;
/*     */   public static final int KEY_0 = 11;
/*     */   public static final int KEY_MINUS = 12;
/*     */   public static final int KEY_EQUALS = 13;
/*     */   public static final int KEY_BACK = 14;
/*     */   public static final int KEY_TAB = 15;
/*     */   public static final int KEY_Q = 16;
/*     */   public static final int KEY_W = 17;
/*     */   public static final int KEY_E = 18;
/*     */   public static final int KEY_R = 19;
/*     */   public static final int KEY_T = 20;
/*     */   public static final int KEY_Y = 21;
/*     */   public static final int KEY_U = 22;
/*     */   public static final int KEY_I = 23;
/*     */   public static final int KEY_O = 24;
/*     */   public static final int KEY_P = 25;
/*     */   public static final int KEY_LBRACKET = 26;
/*     */   public static final int KEY_RBRACKET = 27;
/*     */   public static final int KEY_RETURN = 28;
/*     */   public static final int KEY_LCONTROL = 29;
/*     */   public static final int KEY_A = 30;
/*     */   public static final int KEY_S = 31;
/*     */   public static final int KEY_D = 32;
/*     */   public static final int KEY_F = 33;
/*     */   public static final int KEY_G = 34;
/*     */   public static final int KEY_H = 35;
/*     */   public static final int KEY_J = 36;
/*     */   public static final int KEY_K = 37;
/*     */   public static final int KEY_L = 38;
/*     */   public static final int KEY_SEMICOLON = 39;
/*     */   public static final int KEY_APOSTROPHE = 40;
/*     */   public static final int KEY_GRAVE = 41;
/*     */   public static final int KEY_LSHIFT = 42;
/*     */   public static final int KEY_BACKSLASH = 43;
/*     */   public static final int KEY_Z = 44;
/*     */   public static final int KEY_X = 45;
/*     */   public static final int KEY_C = 46;
/*     */   public static final int KEY_V = 47;
/*     */   public static final int KEY_B = 48;
/*     */   public static final int KEY_N = 49;
/*     */   public static final int KEY_M = 50;
/*     */   public static final int KEY_COMMA = 51;
/*     */   public static final int KEY_PERIOD = 52;
/*     */   public static final int KEY_SLASH = 53;
/*     */   public static final int KEY_RSHIFT = 54;
/*     */   public static final int KEY_MULTIPLY = 55;
/*     */   public static final int KEY_LMENU = 56;
/*     */   public static final int KEY_SPACE = 57;
/*     */   public static final int KEY_CAPITAL = 58;
/*     */   public static final int KEY_F1 = 59;
/*     */   public static final int KEY_F2 = 60;
/*     */   public static final int KEY_F3 = 61;
/*     */   public static final int KEY_F4 = 62;
/*     */   public static final int KEY_F5 = 63;
/*     */   public static final int KEY_F6 = 64;
/*     */   public static final int KEY_F7 = 65;
/*     */   public static final int KEY_F8 = 66;
/*     */   public static final int KEY_F9 = 67;
/*     */   public static final int KEY_F10 = 68;
/*     */   public static final int KEY_NUMLOCK = 69;
/*     */   public static final int KEY_SCROLL = 70;
/*     */   public static final int KEY_NUMPAD7 = 71;
/*     */   public static final int KEY_NUMPAD8 = 72;
/*     */   public static final int KEY_NUMPAD9 = 73;
/*     */   public static final int KEY_SUBTRACT = 74;
/*     */   public static final int KEY_NUMPAD4 = 75;
/*     */   public static final int KEY_NUMPAD5 = 76;
/*     */   public static final int KEY_NUMPAD6 = 77;
/*     */   public static final int KEY_ADD = 78;
/*     */   public static final int KEY_NUMPAD1 = 79;
/*     */   public static final int KEY_NUMPAD2 = 80;
/*     */   public static final int KEY_NUMPAD3 = 81;
/*     */   public static final int KEY_NUMPAD0 = 82;
/*     */   public static final int KEY_DECIMAL = 83;
/*     */   public static final int KEY_F11 = 87;
/*     */   public static final int KEY_F12 = 88;
/*     */   public static final int KEY_F13 = 100;
/*     */   public static final int KEY_F14 = 101;
/*     */   public static final int KEY_F15 = 102;
/*     */   public static final int KEY_KANA = 112;
/*     */   public static final int KEY_CONVERT = 121;
/*     */   public static final int KEY_NOCONVERT = 123;
/*     */   public static final int KEY_YEN = 125;
/*     */   public static final int KEY_NUMPADEQUALS = 141;
/*     */   public static final int KEY_CIRCUMFLEX = 144;
/*     */   public static final int KEY_AT = 145;
/*     */   public static final int KEY_COLON = 146;
/*     */   public static final int KEY_UNDERLINE = 147;
/*     */   public static final int KEY_KANJI = 148;
/*     */   public static final int KEY_STOP = 149;
/*     */   public static final int KEY_AX = 150;
/*     */   public static final int KEY_UNLABELED = 151;
/*     */   public static final int KEY_NUMPADENTER = 156;
/*     */   public static final int KEY_RCONTROL = 157;
/*     */   public static final int KEY_NUMPADCOMMA = 179;
/*     */   public static final int KEY_DIVIDE = 181;
/*     */   public static final int KEY_SYSRQ = 183;
/*     */   public static final int KEY_RMENU = 184;
/*     */   public static final int KEY_PAUSE = 197;
/*     */   public static final int KEY_HOME = 199;
/*     */   public static final int KEY_UP = 200;
/*     */   public static final int KEY_PRIOR = 201;
/*     */   public static final int KEY_LEFT = 203;
/*     */   public static final int KEY_RIGHT = 205;
/*     */   public static final int KEY_END = 207;
/*     */   public static final int KEY_DOWN = 208;
/*     */   public static final int KEY_NEXT = 209;
/*     */   public static final int KEY_INSERT = 210;
/*     */   public static final int KEY_DELETE = 211;
/*     */   public static final int KEY_LMETA = 219;
/*     */   public static final int KEY_LWIN = 219;
/*     */   public static final int KEY_RMETA = 220;
/*     */   public static final int KEY_RWIN = 220;
/*     */   public static final int KEY_APPS = 221;
/*     */   public static final int KEY_POWER = 222;
/*     */   public static final int KEY_SLEEP = 223;
/*     */   public static final int KEYBOARD_SIZE = 256;
/*     */   private static final int BUFFER_SIZE = 50;
/* 219 */   private static final String[] keyName = new String[255];
/* 220 */   private static final Map keyMap = new HashMap(253);
/*     */   
/*     */   private static int counter;
/*     */   
/*     */   static {
/* 225 */     Field[] field = Keyboard.class.getFields();
/*     */     try {
/* 227 */       for (int i = 0; i < field.length; i++) {
/* 228 */         if (Modifier.isStatic(field[i].getModifiers()) && Modifier.isPublic(field[i].getModifiers()) && Modifier.isFinal(field[i].getModifiers()) && field[i].getType().equals(int.class) && field[i].getName().startsWith("KEY_"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 234 */           int key = field[i].getInt(null);
/* 235 */           String name = field[i].getName().substring(4);
/* 236 */           keyName[key] = name;
/* 237 */           keyMap.put(name, new Integer(key));
/* 238 */           counter++;
/*     */         }
/*     */       
/*     */       } 
/* 242 */     } catch (Exception e) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 248 */   private static final int keyCount = counter;
/*     */ 
/*     */   
/*     */   private static boolean created;
/*     */ 
/*     */   
/*     */   private static boolean repeat_enabled;
/*     */ 
/*     */   
/* 257 */   private static final ByteBuffer keyDownBuffer = BufferUtils.createByteBuffer(256);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static ByteBuffer readBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 267 */   private static KeyEvent current_event = new KeyEvent();
/*     */ 
/*     */   
/* 270 */   private static KeyEvent tmp_event = new KeyEvent();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean initialized;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static InputImplementation implementation;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void initialize() {
/* 287 */     if (initialized)
/*     */       return; 
/* 289 */     Sys.initialize();
/* 290 */     initialized = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void create(InputImplementation impl) throws LWJGLException {
/* 300 */     if (created)
/*     */       return; 
/* 302 */     if (!initialized)
/* 303 */       initialize(); 
/* 304 */     implementation = impl;
/* 305 */     implementation.createKeyboard();
/* 306 */     created = true;
/* 307 */     readBuffer = ByteBuffer.allocate(900);
/* 308 */     reset();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void create() throws LWJGLException {
/* 318 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 319 */       if (!Display.isCreated()) throw new IllegalStateException("Display must be created.");
/*     */       
/* 321 */       create(OpenGLPackageAccess.createImplementation());
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void reset() {
/* 326 */     readBuffer.limit(0);
/* 327 */     for (int i = 0; i < keyDownBuffer.remaining(); i++)
/* 328 */       keyDownBuffer.put(i, (byte)0); 
/* 329 */     current_event.reset();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isCreated() {
/* 336 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 337 */       return created;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void destroy() {
/* 345 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 346 */       if (!created)
/*     */         return; 
/* 348 */       created = false;
/* 349 */       implementation.destroyKeyboard();
/* 350 */       reset();
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void poll() {
/* 376 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 377 */       if (!created)
/* 378 */         throw new IllegalStateException("Keyboard must be created before you can poll the device"); 
/* 379 */       implementation.pollKeyboard(keyDownBuffer);
/* 380 */       read();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void read() {
/* 385 */     readBuffer.compact();
/* 386 */     implementation.readKeyboard(readBuffer);
/* 387 */     readBuffer.flip();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isKeyDown(int key) {
/* 396 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 397 */       if (!created)
/* 398 */         throw new IllegalStateException("Keyboard must be created before you can query key state"); 
/* 399 */       return (keyDownBuffer.get(key) != 0);
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized String getKeyName(int key) {
/* 421 */     return keyName[key];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getKeyIndex(String keyName) {
/* 429 */     Integer ret = (Integer)keyMap.get(keyName);
/* 430 */     if (ret == null) {
/* 431 */       return 0;
/*     */     }
/* 433 */     return ret.intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getNumKeyboardEvents() {
/* 441 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 442 */       if (!created)
/* 443 */         throw new IllegalStateException("Keyboard must be created before you can read events"); 
/* 444 */       int old_position = readBuffer.position();
/* 445 */       int num_events = 0;
/* 446 */       while (readNext(tmp_event) && (!tmp_event.repeat || repeat_enabled))
/* 447 */         num_events++; 
/* 448 */       readBuffer.position(old_position);
/* 449 */       return num_events;
/*     */     } 
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
/*     */   public static boolean next() {
/* 465 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 466 */       if (!created) {
/* 467 */         throw new IllegalStateException("Keyboard must be created before you can read events");
/*     */       }
/*     */       boolean result;
/* 470 */       while ((result = readNext(current_event)) && current_event.repeat && !repeat_enabled);
/*     */       
/* 472 */       return result;
/*     */     } 
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
/*     */   public static void enableRepeatEvents(boolean enable) {
/* 485 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 486 */       repeat_enabled = enable;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean areRepeatEventsEnabled() {
/* 497 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 498 */       return repeat_enabled;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean readNext(KeyEvent event) {
/* 503 */     if (readBuffer.hasRemaining()) {
/* 504 */       event.key = readBuffer.getInt() & 0xFF;
/* 505 */       event.state = (readBuffer.get() != 0);
/* 506 */       event.character = readBuffer.getInt();
/* 507 */       event.nanos = readBuffer.getLong();
/* 508 */       event.repeat = (readBuffer.get() == 1);
/* 509 */       return true;
/*     */     } 
/* 511 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getKeyCount() {
/* 518 */     return keyCount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static char getEventCharacter() {
/* 525 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 526 */       return (char)current_event.character;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getEventKey() {
/* 538 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 539 */       return current_event.key;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean getEventKeyState() {
/* 550 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 551 */       return current_event.state;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getEventNanoseconds() {
/* 563 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 564 */       return current_event.nanos;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isRepeatEvent() {
/* 574 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 575 */       return current_event.repeat;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static final class KeyEvent
/*     */   {
/*     */     private int character;
/*     */     
/*     */     private int key;
/*     */     
/*     */     private boolean state;
/*     */     
/*     */     private long nanos;
/*     */     
/*     */     private boolean repeat;
/*     */ 
/*     */     
/*     */     private KeyEvent() {}
/*     */     
/*     */     private void reset() {
/* 596 */       this.character = 0;
/* 597 */       this.key = 0;
/* 598 */       this.state = false;
/* 599 */       this.repeat = false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\input\Keyboard.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */