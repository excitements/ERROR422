/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class RenderTexture
/*     */ {
/*     */   private static final int WGL_BIND_TO_TEXTURE_RGB_ARB = 8304;
/*     */   private static final int WGL_BIND_TO_TEXTURE_RGBA_ARB = 8305;
/*     */   private static final int WGL_TEXTURE_FORMAT_ARB = 8306;
/*     */   private static final int WGL_TEXTURE_TARGET_ARB = 8307;
/*     */   private static final int WGL_MIPMAP_TEXTURE_ARB = 8308;
/*     */   private static final int WGL_TEXTURE_RGB_ARB = 8309;
/*     */   private static final int WGL_TEXTURE_RGBA_ARB = 8310;
/*     */   private static final int WGL_TEXTURE_CUBE_MAP_ARB = 8312;
/*     */   private static final int WGL_TEXTURE_1D_ARB = 8313;
/*     */   private static final int WGL_TEXTURE_2D_ARB = 8314;
/*     */   private static final int WGL_NO_TEXTURE_ARB = 8311;
/*     */   static final int WGL_MIPMAP_LEVEL_ARB = 8315;
/*     */   static final int WGL_CUBE_MAP_FACE_ARB = 8316;
/*     */   static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB = 8317;
/*     */   static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB = 8318;
/*     */   static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB = 8319;
/*     */   static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB = 8320;
/*     */   static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB = 8321;
/*     */   static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB = 8322;
/*     */   static final int WGL_FRONT_LEFT_ARB = 8323;
/*     */   static final int WGL_FRONT_RIGHT_ARB = 8324;
/*     */   static final int WGL_BACK_LEFT_ARB = 8325;
/*     */   static final int WGL_BACK_RIGHT_ARB = 8326;
/*     */   private static final int WGL_BIND_TO_TEXTURE_RECTANGLE_RGB_NV = 8352;
/*     */   private static final int WGL_BIND_TO_TEXTURE_RECTANGLE_RGBA_NV = 8353;
/*     */   private static final int WGL_TEXTURE_RECTANGLE_NV = 8354;
/*     */   private static final int WGL_BIND_TO_TEXTURE_DEPTH_NV = 8355;
/*     */   private static final int WGL_BIND_TO_TEXTURE_RECTANGLE_DEPTH_NV = 8356;
/*     */   private static final int WGL_DEPTH_TEXTURE_FORMAT_NV = 8357;
/*     */   private static final int WGL_TEXTURE_DEPTH_COMPONENT_NV = 8358;
/*     */   static final int WGL_DEPTH_COMPONENT_NV = 8359;
/*     */   public static final int RENDER_TEXTURE_1D = 8313;
/*     */   public static final int RENDER_TEXTURE_2D = 8314;
/*     */   public static final int RENDER_TEXTURE_RECTANGLE = 8354;
/*     */   public static final int RENDER_TEXTURE_CUBE_MAP = 8312;
/*     */   IntBuffer pixelFormatCaps;
/*     */   IntBuffer pBufferAttribs;
/*     */   
/*     */   public RenderTexture(boolean useRGB, boolean useRGBA, boolean useDepth, boolean isRectangle, int target, int mipmaps) {
/* 203 */     if (useRGB && useRGBA) {
/* 204 */       throw new IllegalArgumentException("A RenderTexture can't be both RGB and RGBA.");
/*     */     }
/* 206 */     if (mipmaps < 0) {
/* 207 */       throw new IllegalArgumentException("The mipmap levels can't be negative.");
/*     */     }
/* 209 */     if (isRectangle && target != 8354) {
/* 210 */       throw new IllegalArgumentException("When the RenderTexture is rectangle the target must be RENDER_TEXTURE_RECTANGLE.");
/*     */     }
/* 212 */     this.pixelFormatCaps = BufferUtils.createIntBuffer(4);
/* 213 */     this.pBufferAttribs = BufferUtils.createIntBuffer(8);
/*     */     
/* 215 */     if (useRGB) {
/* 216 */       this.pixelFormatCaps.put(isRectangle ? 8352 : 8304);
/* 217 */       this.pixelFormatCaps.put(1);
/*     */       
/* 219 */       this.pBufferAttribs.put(8306);
/* 220 */       this.pBufferAttribs.put(8309);
/* 221 */     } else if (useRGBA) {
/* 222 */       this.pixelFormatCaps.put(isRectangle ? 8353 : 8305);
/* 223 */       this.pixelFormatCaps.put(1);
/*     */       
/* 225 */       this.pBufferAttribs.put(8306);
/* 226 */       this.pBufferAttribs.put(8310);
/*     */     } 
/*     */     
/* 229 */     if (useDepth) {
/* 230 */       this.pixelFormatCaps.put(isRectangle ? 8356 : 8355);
/* 231 */       this.pixelFormatCaps.put(1);
/*     */       
/* 233 */       this.pBufferAttribs.put(8357);
/* 234 */       this.pBufferAttribs.put(8358);
/*     */     } 
/*     */     
/* 237 */     this.pBufferAttribs.put(8307);
/* 238 */     this.pBufferAttribs.put(target);
/*     */     
/* 240 */     if (mipmaps != 0) {
/* 241 */       this.pBufferAttribs.put(8308);
/* 242 */       this.pBufferAttribs.put(mipmaps);
/*     */     } 
/*     */     
/* 245 */     this.pixelFormatCaps.flip();
/* 246 */     this.pBufferAttribs.flip();
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\RenderTexture.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */