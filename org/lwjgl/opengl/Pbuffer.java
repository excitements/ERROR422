/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Pbuffer
/*     */   implements Drawable
/*     */ {
/*     */   public static final int PBUFFER_SUPPORTED = 1;
/*     */   public static final int RENDER_TEXTURE_SUPPORTED = 2;
/*     */   public static final int RENDER_TEXTURE_RECTANGLE_SUPPORTED = 4;
/*     */   public static final int RENDER_DEPTH_TEXTURE_SUPPORTED = 8;
/*     */   public static final int MIPMAP_LEVEL = 8315;
/*     */   public static final int CUBE_MAP_FACE = 8316;
/*     */   public static final int TEXTURE_CUBE_MAP_POSITIVE_X = 8317;
/*     */   public static final int TEXTURE_CUBE_MAP_NEGATIVE_X = 8318;
/*     */   public static final int TEXTURE_CUBE_MAP_POSITIVE_Y = 8319;
/*     */   public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y = 8320;
/*     */   public static final int TEXTURE_CUBE_MAP_POSITIVE_Z = 8321;
/*     */   public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z = 8322;
/*     */   public static final int FRONT_LEFT_BUFFER = 8323;
/*     */   public static final int FRONT_RIGHT_BUFFER = 8324;
/*     */   public static final int BACK_LEFT_BUFFER = 8325;
/*     */   public static final int BACK_RIGHT_BUFFER = 8326;
/*     */   public static final int DEPTH_BUFFER = 8359;
/*     */   private final PeerInfo peer_info;
/*     */   private final int width;
/*     */   private final int height;
/*     */   private final Context context;
/*     */   private boolean destroyed;
/*     */   
/*     */   static {
/* 158 */     Sys.initialize();
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
/*     */   public Pbuffer(int width, int height, PixelFormat pixel_format, Drawable shared_drawable) throws LWJGLException {
/* 176 */     this(width, height, pixel_format, null, shared_drawable);
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
/*     */   public Pbuffer(int width, int height, PixelFormat pixel_format, RenderTexture renderTexture, Drawable shared_drawable) throws LWJGLException {
/* 200 */     this(width, height, pixel_format, renderTexture, shared_drawable, null);
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
/*     */   public Pbuffer(int width, int height, PixelFormat pixel_format, RenderTexture renderTexture, Drawable shared_drawable, ContextAttribs attribs) throws LWJGLException {
/* 225 */     if (pixel_format == null)
/* 226 */       throw new NullPointerException("Pixel format must be non-null"); 
/* 227 */     this.width = width;
/* 228 */     this.height = height;
/* 229 */     this.peer_info = createPbuffer(width, height, pixel_format, renderTexture);
/* 230 */     Context shared_context = null;
/* 231 */     if (shared_drawable != null) {
/* 232 */       shared_context = shared_drawable.getContext();
/*     */     } else {
/* 234 */       Drawable display_drawable = Display.getDrawable();
/* 235 */       if (display_drawable != null)
/* 236 */         shared_context = display_drawable.getContext(); 
/*     */     } 
/* 238 */     this.context = new Context(this.peer_info, attribs, shared_context);
/*     */   }
/*     */   
/*     */   private static PeerInfo createPbuffer(int width, int height, PixelFormat pixel_format, RenderTexture renderTexture) throws LWJGLException {
/* 242 */     if (renderTexture == null) {
/*     */ 
/*     */ 
/*     */       
/* 246 */       IntBuffer defaultAttribs = BufferUtils.createIntBuffer(1);
/* 247 */       return Display.getImplementation().createPbuffer(width, height, pixel_format, null, defaultAttribs);
/*     */     } 
/* 249 */     return Display.getImplementation().createPbuffer(width, height, pixel_format, renderTexture.pixelFormatCaps, renderTexture.pBufferAttribs);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Context getContext() {
/* 255 */     return this.context;
/*     */   }
/*     */   
/*     */   private void checkDestroyed() {
/* 259 */     if (this.destroyed) {
/* 260 */       throw new IllegalStateException("Pbuffer is destroyed");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized boolean isBufferLost() {
/* 271 */     checkDestroyed();
/* 272 */     return Display.getImplementation().isBufferLost(this.peer_info);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void makeCurrent() throws LWJGLException {
/* 280 */     checkDestroyed();
/* 281 */     this.context.makeCurrent();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getCapabilities() {
/* 290 */     return Display.getImplementation().getPbufferCapabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void destroy() {
/* 298 */     if (this.destroyed)
/*     */       return; 
/*     */     try {
/* 301 */       this.context.forceDestroy();
/* 302 */       this.peer_info.destroy();
/* 303 */       this.destroyed = true;
/* 304 */     } catch (LWJGLException e) {
/* 305 */       LWJGLUtil.log("Exception occurred while destroying pbuffer: " + e);
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
/*     */   public synchronized void setAttrib(int attrib, int value) {
/* 326 */     checkDestroyed();
/* 327 */     Display.getImplementation().setPbufferAttrib(this.peer_info, attrib, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void bindTexImage(int buffer) {
/* 338 */     checkDestroyed();
/* 339 */     Display.getImplementation().bindTexImageToPbuffer(this.peer_info, buffer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void releaseTexImage(int buffer) {
/* 348 */     checkDestroyed();
/* 349 */     Display.getImplementation().releaseTexImageFromPbuffer(this.peer_info, buffer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getHeight() {
/* 356 */     checkDestroyed();
/* 357 */     return this.height;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int getWidth() {
/* 364 */     checkDestroyed();
/* 365 */     return this.width;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\Pbuffer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */