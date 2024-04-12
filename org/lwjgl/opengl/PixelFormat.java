/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PixelFormat
/*     */ {
/*     */   private int bpp;
/*     */   private int alpha;
/*     */   private int depth;
/*     */   private int stencil;
/*     */   private int samples;
/*     */   private int num_aux_buffers;
/*     */   private int accum_bpp;
/*     */   private int accum_alpha;
/*     */   private boolean stereo;
/*     */   private boolean floating_point;
/*     */   private boolean floating_point_packed;
/*     */   private boolean sRGB;
/*     */   
/*     */   public PixelFormat() {
/*  89 */     this(0, 8, 0);
/*     */   }
/*     */   
/*     */   public PixelFormat(int alpha, int depth, int stencil) {
/*  93 */     this(alpha, depth, stencil, 0);
/*     */   }
/*     */   
/*     */   public PixelFormat(int alpha, int depth, int stencil, int samples) {
/*  97 */     this(0, alpha, depth, stencil, samples);
/*     */   }
/*     */   
/*     */   public PixelFormat(int bpp, int alpha, int depth, int stencil, int samples) {
/* 101 */     this(bpp, alpha, depth, stencil, samples, 0, 0, 0, false);
/*     */   }
/*     */   
/*     */   public PixelFormat(int bpp, int alpha, int depth, int stencil, int samples, int num_aux_buffers, int accum_bpp, int accum_alpha, boolean stereo) {
/* 105 */     this(bpp, alpha, depth, stencil, samples, num_aux_buffers, accum_bpp, accum_alpha, stereo, false);
/*     */   }
/*     */   
/*     */   public PixelFormat(int bpp, int alpha, int depth, int stencil, int samples, int num_aux_buffers, int accum_bpp, int accum_alpha, boolean stereo, boolean floating_point) {
/* 109 */     this.bpp = bpp;
/* 110 */     this.alpha = alpha;
/* 111 */     this.depth = depth;
/* 112 */     this.stencil = stencil;
/*     */     
/* 114 */     this.samples = samples;
/*     */     
/* 116 */     this.num_aux_buffers = num_aux_buffers;
/*     */     
/* 118 */     this.accum_bpp = accum_bpp;
/* 119 */     this.accum_alpha = accum_alpha;
/*     */     
/* 121 */     this.stereo = stereo;
/*     */     
/* 123 */     this.floating_point = floating_point;
/* 124 */     this.floating_point_packed = false;
/* 125 */     this.sRGB = false;
/*     */   }
/*     */   
/*     */   private PixelFormat(PixelFormat pf) {
/* 129 */     this.bpp = pf.bpp;
/* 130 */     this.alpha = pf.alpha;
/* 131 */     this.depth = pf.depth;
/* 132 */     this.stencil = pf.stencil;
/*     */     
/* 134 */     this.samples = pf.samples;
/*     */     
/* 136 */     this.num_aux_buffers = pf.num_aux_buffers;
/*     */     
/* 138 */     this.accum_bpp = pf.accum_bpp;
/* 139 */     this.accum_alpha = pf.accum_alpha;
/*     */     
/* 141 */     this.stereo = pf.stereo;
/*     */     
/* 143 */     this.floating_point = pf.floating_point;
/* 144 */     this.floating_point_packed = pf.floating_point_packed;
/* 145 */     this.sRGB = pf.sRGB;
/*     */   }
/*     */   
/*     */   public int getBitsPerPixel() {
/* 149 */     return this.bpp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withBitsPerPixel(int bpp) {
/* 160 */     if (bpp < 0) {
/* 161 */       throw new IllegalArgumentException("Invalid number of bits per pixel specified: " + bpp);
/*     */     }
/* 163 */     PixelFormat pf = new PixelFormat(this);
/* 164 */     pf.bpp = bpp;
/* 165 */     return pf;
/*     */   }
/*     */   
/*     */   public int getAlphaBits() {
/* 169 */     return this.alpha;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withAlphaBits(int alpha) {
/* 180 */     if (alpha < 0) {
/* 181 */       throw new IllegalArgumentException("Invalid number of alpha bits specified: " + alpha);
/*     */     }
/* 183 */     PixelFormat pf = new PixelFormat(this);
/* 184 */     pf.alpha = alpha;
/* 185 */     return pf;
/*     */   }
/*     */   
/*     */   public int getDepthBits() {
/* 189 */     return this.depth;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withDepthBits(int depth) {
/* 200 */     if (depth < 0) {
/* 201 */       throw new IllegalArgumentException("Invalid number of depth bits specified: " + depth);
/*     */     }
/* 203 */     PixelFormat pf = new PixelFormat(this);
/* 204 */     pf.depth = depth;
/* 205 */     return pf;
/*     */   }
/*     */   
/*     */   public int getStencilBits() {
/* 209 */     return this.stencil;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withStencilBits(int stencil) {
/* 220 */     if (stencil < 0) {
/* 221 */       throw new IllegalArgumentException("Invalid number of stencil bits specified: " + stencil);
/*     */     }
/* 223 */     PixelFormat pf = new PixelFormat(this);
/* 224 */     pf.stencil = stencil;
/* 225 */     return pf;
/*     */   }
/*     */   
/*     */   public int getSamples() {
/* 229 */     return this.samples;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withSamples(int samples) {
/* 240 */     if (samples < 0) {
/* 241 */       throw new IllegalArgumentException("Invalid number of samples specified: " + samples);
/*     */     }
/* 243 */     PixelFormat pf = new PixelFormat(this);
/* 244 */     pf.samples = samples;
/* 245 */     return pf;
/*     */   }
/*     */   
/*     */   public int getAuxBuffers() {
/* 249 */     return this.num_aux_buffers;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withAuxBuffers(int num_aux_buffers) {
/* 260 */     if (num_aux_buffers < 0) {
/* 261 */       throw new IllegalArgumentException("Invalid number of auxiliary buffers specified: " + num_aux_buffers);
/*     */     }
/* 263 */     PixelFormat pf = new PixelFormat(this);
/* 264 */     pf.num_aux_buffers = num_aux_buffers;
/* 265 */     return pf;
/*     */   }
/*     */   
/*     */   public int getAccumulationBitsPerPixel() {
/* 269 */     return this.accum_bpp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withAccumulationBitsPerPixel(int accum_bpp) {
/* 280 */     if (accum_bpp < 0) {
/* 281 */       throw new IllegalArgumentException("Invalid number of bits per pixel in the accumulation buffer specified: " + accum_bpp);
/*     */     }
/* 283 */     PixelFormat pf = new PixelFormat(this);
/* 284 */     pf.accum_bpp = accum_bpp;
/* 285 */     return pf;
/*     */   }
/*     */   
/*     */   public int getAccumulationAlpha() {
/* 289 */     return this.accum_alpha;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withAccumulationAlpha(int accum_alpha) {
/* 300 */     if (accum_alpha < 0) {
/* 301 */       throw new IllegalArgumentException("Invalid number of alpha bits in the accumulation buffer specified: " + accum_alpha);
/*     */     }
/* 303 */     PixelFormat pf = new PixelFormat(this);
/* 304 */     pf.accum_alpha = accum_alpha;
/* 305 */     return pf;
/*     */   }
/*     */   
/*     */   public boolean isStereo() {
/* 309 */     return this.stereo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withStereo(boolean stereo) {
/* 320 */     PixelFormat pf = new PixelFormat(this);
/* 321 */     pf.stereo = stereo;
/* 322 */     return pf;
/*     */   }
/*     */   
/*     */   public boolean isFloatingPoint() {
/* 326 */     return this.floating_point;
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
/*     */   public PixelFormat withFloatingPoint(boolean floating_point) {
/* 338 */     PixelFormat pf = new PixelFormat(this);
/* 339 */     pf.floating_point = floating_point;
/* 340 */     if (floating_point)
/* 341 */       pf.floating_point_packed = false; 
/* 342 */     return pf;
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
/*     */   public PixelFormat withFloatingPointPacked(boolean floating_point_packed) {
/* 354 */     PixelFormat pf = new PixelFormat(this);
/* 355 */     pf.floating_point_packed = floating_point_packed;
/* 356 */     if (floating_point_packed)
/* 357 */       pf.floating_point = false; 
/* 358 */     return pf;
/*     */   }
/*     */   
/*     */   public boolean isSRGB() {
/* 362 */     return this.sRGB;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PixelFormat withSRGB(boolean sRGB) {
/* 373 */     PixelFormat pf = new PixelFormat(this);
/* 374 */     pf.sRGB = sRGB;
/* 375 */     return pf;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\PixelFormat.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */