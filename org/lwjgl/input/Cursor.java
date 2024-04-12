/*     */ package org.lwjgl.input;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ import org.lwjgl.NondirectBufferWrapper;
/*     */ import org.lwjgl.Sys;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Cursor
/*     */ {
/*     */   public static final int CURSOR_ONE_BIT_TRANSPARENCY = 1;
/*     */   public static final int CURSOR_8_BIT_ALPHA = 2;
/*     */   public static final int CURSOR_ANIMATION = 4;
/*     */   private final CursorElement[] cursors;
/*  66 */   private int index = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean destroyed;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Cursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/*  86 */     synchronized (OpenGLPackageAccess.global_lock) {
/*  87 */       if ((getCapabilities() & 0x1) == 0)
/*  88 */         throw new LWJGLException("Native cursors not supported"); 
/*  89 */       images = NondirectBufferWrapper.wrapBuffer(images, width * height * numImages);
/*  90 */       if (delays != null)
/*  91 */         delays = NondirectBufferWrapper.wrapBuffer(delays, numImages); 
/*  92 */       if (!Mouse.isCreated())
/*  93 */         throw new IllegalStateException("Mouse must be created before creating cursor objects"); 
/*  94 */       if (width * height * numImages > images.remaining())
/*  95 */         throw new IllegalArgumentException("width*height*numImages > images.remaining()"); 
/*  96 */       if (xHotspot >= width || xHotspot < 0)
/*  97 */         throw new IllegalArgumentException("xHotspot > width || xHotspot < 0"); 
/*  98 */       if (yHotspot >= height || yHotspot < 0) {
/*  99 */         throw new IllegalArgumentException("yHotspot > height || yHotspot < 0");
/*     */       }
/* 101 */       Sys.initialize();
/*     */ 
/*     */       
/* 104 */       yHotspot = height - 1 - yHotspot;
/*     */ 
/*     */       
/* 107 */       this.cursors = createCursors(width, height, xHotspot, yHotspot, numImages, images, delays);
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
/*     */   public static int getMinCursorSize() {
/* 119 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 120 */       if (!Mouse.isCreated())
/* 121 */         throw new IllegalStateException("Mouse must be created."); 
/* 122 */       return Mouse.getImplementation().getMinCursorSize();
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
/*     */   public static int getMaxCursorSize() {
/* 134 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 135 */       if (!Mouse.isCreated())
/* 136 */         throw new IllegalStateException("Mouse must be created."); 
/* 137 */       return Mouse.getImplementation().getMaxCursorSize();
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
/*     */   public static int getCapabilities() {
/* 150 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 151 */       if (Mouse.getImplementation() != null) {
/* 152 */         return Mouse.getImplementation().getNativeCursorCapabilities();
/*     */       }
/* 154 */       return OpenGLPackageAccess.createImplementation().getNativeCursorCapabilities();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static CursorElement[] createCursors(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
/*     */     CursorElement[] cursors;
/*     */     int i;
/*     */     Object handle;
/*     */     CursorElement cursor_element;
/* 163 */     IntBuffer images_copy = BufferUtils.createIntBuffer(images.remaining());
/* 164 */     flipImages(width, height, numImages, images, images_copy);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     switch (LWJGLUtil.getPlatform()) {
/*     */ 
/*     */       
/*     */       case 2:
/*     */       case 3:
/* 179 */         cursors = new CursorElement[numImages];
/* 180 */         for (i = 0; i < numImages; i++) {
/*     */ 
/*     */           
/* 183 */           int size = width * height;
/* 184 */           for (int j = 0; j < size; j++) {
/* 185 */             int index = j + i * size;
/* 186 */             int alpha = images_copy.get(index) >> 24 & 0xFF;
/* 187 */             if (alpha != 255) {
/* 188 */               images_copy.put(index, 0);
/*     */             }
/*     */           } 
/*     */           
/* 192 */           Object object = Mouse.getImplementation().createCursor(width, height, xHotspot, yHotspot, 1, images_copy, null);
/* 193 */           long delay = (delays != null) ? delays.get(i) : 0L;
/* 194 */           long timeout = System.currentTimeMillis();
/* 195 */           cursors[i] = new CursorElement(object, delay, timeout);
/*     */ 
/*     */           
/* 198 */           images_copy.position(width * height * (i + 1));
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 210 */         return cursors;case 1: handle = Mouse.getImplementation().createCursor(width, height, xHotspot, yHotspot, numImages, images_copy, delays); cursor_element = new CursorElement(handle, -1L, -1L); cursors = new CursorElement[] { cursor_element }; return cursors;
/*     */     } 
/*     */     throw new RuntimeException("Unknown OS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void flipImages(int width, int height, int numImages, IntBuffer images, IntBuffer images_copy) {
/* 223 */     for (int i = 0; i < numImages; i++) {
/* 224 */       int start_index = i * width * height;
/* 225 */       flipImage(width, height, start_index, images, images_copy);
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
/*     */   private static void flipImage(int width, int height, int start_index, IntBuffer images, IntBuffer images_copy) {
/* 237 */     for (int y = 0; y < height >> 1; y++) {
/* 238 */       int index_y_1 = y * width + start_index;
/* 239 */       int index_y_2 = (height - y - 1) * width + start_index;
/* 240 */       for (int x = 0; x < width; x++) {
/* 241 */         int index1 = index_y_1 + x;
/* 242 */         int index2 = index_y_2 + x;
/* 243 */         int temp_pixel = images.get(index1 + images.position());
/* 244 */         images_copy.put(index1, images.get(index2 + images.position()));
/* 245 */         images_copy.put(index2, temp_pixel);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Object getHandle() {
/* 254 */     checkValid();
/* 255 */     return (this.cursors[this.index]).cursorHandle;
/*     */   }
/*     */   
/*     */   private void checkValid() {
/* 259 */     if (this.destroyed) {
/* 260 */       throw new IllegalStateException("The cursor is destroyed");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() {
/* 269 */     synchronized (OpenGLPackageAccess.global_lock) {
/* 270 */       if (this.destroyed)
/*     */         return; 
/* 272 */       if (Mouse.getNativeCursor() == this) {
/*     */         try {
/* 274 */           Mouse.setNativeCursor(null);
/* 275 */         } catch (LWJGLException e) {}
/*     */       }
/*     */ 
/*     */       
/* 279 */       for (int i = 0; i < this.cursors.length; i++) {
/* 280 */         Mouse.getImplementation().destroyCursor((this.cursors[i]).cursorHandle);
/*     */       }
/* 282 */       this.destroyed = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setTimeout() {
/* 290 */     checkValid();
/* 291 */     (this.cursors[this.index]).timeout = System.currentTimeMillis() + (this.cursors[this.index]).delay;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean hasTimedOut() {
/* 299 */     checkValid();
/* 300 */     return (this.cursors.length > 1 && (this.cursors[this.index]).timeout < System.currentTimeMillis());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void nextCursor() {
/* 307 */     checkValid();
/* 308 */     this.index = ++this.index % this.cursors.length;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class CursorElement
/*     */   {
/*     */     final Object cursorHandle;
/*     */ 
/*     */     
/*     */     final long delay;
/*     */ 
/*     */     
/*     */     long timeout;
/*     */ 
/*     */     
/*     */     CursorElement(Object cursorHandle, long delay, long timeout) {
/* 325 */       this.cursorHandle = cursorHandle;
/* 326 */       this.delay = delay;
/* 327 */       this.timeout = timeout;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\input\Cursor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */