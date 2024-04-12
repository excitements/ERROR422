/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ContextAttribs
/*     */ {
/*     */   private int majorVersion;
/*     */   private int minorVersion;
/*     */   private int layerPlane;
/*     */   private boolean debug;
/*     */   private boolean forwardCompatible;
/*     */   private boolean profileCore;
/*     */   private boolean profileCompatibility;
/*     */   
/*     */   public ContextAttribs() {
/*  71 */     this(1, 0);
/*     */   }
/*     */   
/*     */   public ContextAttribs(int majorVersion, int minorVersion) {
/*  75 */     if (majorVersion < 0 || 3 < majorVersion || minorVersion < 0 || (majorVersion == 3 && 2 < minorVersion) || (majorVersion == 2 && 1 < minorVersion) || (majorVersion == 1 && 5 < minorVersion))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  81 */       throw new IllegalArgumentException("Invalid OpenGL version specified: " + majorVersion + '.' + minorVersion);
/*     */     }
/*  83 */     this.majorVersion = majorVersion;
/*  84 */     this.minorVersion = minorVersion;
/*     */     
/*  86 */     this.layerPlane = 0;
/*     */     
/*  88 */     this.debug = false;
/*  89 */     this.forwardCompatible = false;
/*     */     
/*  91 */     this.profileCore = (3 < majorVersion || (majorVersion == 3 && 2 <= minorVersion));
/*  92 */     this.profileCompatibility = false;
/*     */   }
/*     */   
/*     */   private ContextAttribs(ContextAttribs attribs) {
/*  96 */     this.majorVersion = attribs.majorVersion;
/*  97 */     this.minorVersion = attribs.minorVersion;
/*     */     
/*  99 */     this.layerPlane = attribs.layerPlane;
/*     */     
/* 101 */     this.debug = attribs.debug;
/* 102 */     this.forwardCompatible = attribs.forwardCompatible;
/*     */     
/* 104 */     this.profileCore = attribs.profileCore;
/* 105 */     this.profileCompatibility = attribs.profileCompatibility;
/*     */   }
/*     */   
/*     */   public int getMajorVersion() {
/* 109 */     return this.majorVersion;
/*     */   }
/*     */   
/*     */   public int getMinorVersion() {
/* 113 */     return this.minorVersion;
/*     */   }
/*     */   
/*     */   public int getLayerPlane() {
/* 117 */     return this.layerPlane;
/*     */   }
/*     */   
/*     */   public boolean isDebug() {
/* 121 */     return this.debug;
/*     */   }
/*     */   
/*     */   public boolean isForwardCompatible() {
/* 125 */     return this.forwardCompatible;
/*     */   }
/*     */   
/*     */   public boolean isProfileCore() {
/* 129 */     return this.profileCore;
/*     */   }
/*     */   
/*     */   public boolean isProfileCompatibility() {
/* 133 */     return this.profileCompatibility;
/*     */   }
/*     */   
/*     */   public ContextAttribs withLayer(int layerPlane) {
/* 137 */     if (layerPlane < 0) {
/* 138 */       throw new IllegalArgumentException("Invalid layer plane specified: " + layerPlane);
/*     */     }
/* 140 */     if (layerPlane == this.layerPlane) {
/* 141 */       return this;
/*     */     }
/* 143 */     ContextAttribs attribs = new ContextAttribs(this);
/* 144 */     attribs.layerPlane = layerPlane;
/* 145 */     return attribs;
/*     */   }
/*     */   
/*     */   public ContextAttribs withDebug(boolean debug) {
/* 149 */     if (debug == this.debug) {
/* 150 */       return this;
/*     */     }
/* 152 */     ContextAttribs attribs = new ContextAttribs(this);
/* 153 */     attribs.debug = debug;
/* 154 */     return attribs;
/*     */   }
/*     */   
/*     */   public ContextAttribs withForwardCompatible(boolean forwardCompatible) {
/* 158 */     if (forwardCompatible == this.forwardCompatible) {
/* 159 */       return this;
/*     */     }
/* 161 */     ContextAttribs attribs = new ContextAttribs(this);
/* 162 */     attribs.forwardCompatible = forwardCompatible;
/* 163 */     return attribs;
/*     */   }
/*     */   
/*     */   public ContextAttribs withProfileCore(boolean profileCore) {
/* 167 */     if (this.majorVersion < 3 || (this.majorVersion == 3 && this.minorVersion < 2)) {
/* 168 */       throw new IllegalArgumentException("Profiles are only supported on OpenGL version 3.2 or higher.");
/*     */     }
/* 170 */     if (profileCore == this.profileCore) {
/* 171 */       return this;
/*     */     }
/* 173 */     ContextAttribs attribs = new ContextAttribs(this);
/* 174 */     attribs.profileCore = profileCore;
/* 175 */     if (profileCore) {
/* 176 */       attribs.profileCompatibility = false;
/*     */     }
/* 178 */     return attribs;
/*     */   }
/*     */   
/*     */   public ContextAttribs withProfileCompatibility(boolean profileCompatibility) {
/* 182 */     if (this.majorVersion < 3 || (this.majorVersion == 3 && this.minorVersion < 2)) {
/* 183 */       throw new IllegalArgumentException("Profiles are only supported on OpenGL version 3.2 or higher.");
/*     */     }
/* 185 */     if (profileCompatibility == this.profileCompatibility) {
/* 186 */       return this;
/*     */     }
/* 188 */     ContextAttribs attribs = new ContextAttribs(this);
/* 189 */     attribs.profileCompatibility = profileCompatibility;
/* 190 */     if (profileCompatibility) {
/* 191 */       attribs.profileCore = false;
/*     */     }
/* 193 */     return attribs;
/*     */   }
/*     */   
/*     */   private static ContextAttribsImplementation getImplementation() {
/* 197 */     switch (LWJGLUtil.getPlatform()) {
/*     */       case 1:
/* 199 */         return new LinuxContextAttribs();
/*     */       case 3:
/* 201 */         return new WindowsContextAttribs();
/*     */       case 2:
/* 203 */         return new MacOSXContextAttribs();
/*     */     } 
/* 205 */     throw new IllegalStateException("Unsupported platform");
/*     */   }
/*     */ 
/*     */   
/*     */   IntBuffer getAttribList() {
/* 210 */     ContextAttribsImplementation implementation = getImplementation();
/*     */     
/* 212 */     int attribCount = 0;
/*     */     
/* 214 */     if (this.majorVersion != 1 || this.minorVersion != 0)
/* 215 */       attribCount += 2; 
/* 216 */     if (0 < this.layerPlane) {
/* 217 */       attribCount++;
/*     */     }
/* 219 */     int flags = 0;
/* 220 */     if (this.debug)
/* 221 */       flags |= implementation.getDebugBit(); 
/* 222 */     if (this.forwardCompatible)
/* 223 */       flags |= implementation.getForwardCompatibleBit(); 
/* 224 */     if (0 < flags) {
/* 225 */       attribCount++;
/*     */     }
/* 227 */     int profileMask = 0;
/* 228 */     if (this.profileCore) {
/* 229 */       profileMask |= implementation.getProfileCoreBit();
/* 230 */     } else if (this.profileCompatibility) {
/* 231 */       profileMask |= implementation.getProfileCompatibilityBit();
/* 232 */     }  if (0 < profileMask) {
/* 233 */       attribCount++;
/*     */     }
/* 235 */     if (attribCount == 0) {
/* 236 */       return null;
/*     */     }
/* 238 */     IntBuffer attribs = BufferUtils.createIntBuffer(attribCount * 2 + 1);
/*     */     
/* 240 */     if (this.majorVersion != 1 || this.minorVersion != 0) {
/* 241 */       attribs.put(implementation.getMajorVersionAttrib()).put(this.majorVersion);
/* 242 */       attribs.put(implementation.getMinorVersionAttrib()).put(this.minorVersion);
/*     */     } 
/* 244 */     if (0 < this.layerPlane)
/* 245 */       attribs.put(implementation.getLayerPlaneAttrib()).put(this.layerPlane); 
/* 246 */     if (0 < flags)
/* 247 */       attribs.put(implementation.getFlagsAttrib()).put(flags); 
/* 248 */     if (0 < profileMask) {
/* 249 */       attribs.put(implementation.getProfileMaskAttrib()).put(profileMask);
/*     */     }
/* 251 */     attribs.put(0);
/* 252 */     attribs.rewind();
/* 253 */     return attribs;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 257 */     StringBuffer sb = new StringBuffer(32);
/*     */     
/* 259 */     sb.append("ContextAttribs:");
/* 260 */     sb.append(" Version=").append(this.majorVersion).append('.').append(this.minorVersion);
/* 261 */     sb.append(" - Layer=").append(this.layerPlane);
/* 262 */     sb.append(" - Debug=").append(this.debug);
/* 263 */     sb.append(" - ForwardCompatible=").append(this.forwardCompatible);
/* 264 */     sb.append(" - Profile=");
/* 265 */     if (this.profileCore) {
/* 266 */       sb.append("Core");
/* 267 */     } else if (this.profileCompatibility) {
/* 268 */       sb.append("Compatibility");
/*     */     } else {
/* 270 */       sb.append("None");
/*     */     } 
/* 272 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ContextAttribs.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */