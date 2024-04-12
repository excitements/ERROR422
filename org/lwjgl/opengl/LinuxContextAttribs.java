/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class LinuxContextAttribs
/*    */   implements ContextAttribsImplementation
/*    */ {
/*    */   private static final int GLX_CONTEXT_MAJOR_VERSION_ARB = 8337;
/*    */   private static final int GLX_CONTEXT_MINOR_VERSION_ARB = 8338;
/*    */   private static final int GLX_CONTEXT_LAYER_PLANE_ARB = 8339;
/*    */   private static final int GLX_CONTEXT_FLAGS_ARB = 8340;
/*    */   private static final int GLX_CONTEXT_PROFILE_MASK_ARB = 37158;
/*    */   private static final int GLX_CONTEXT_DEBUG_BIT_ARB = 1;
/*    */   private static final int GLX_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 2;
/*    */   private static final int GLX_CONTEXT_CORE_PROFILE_BIT_ARB = 1;
/*    */   private static final int GLX_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB = 2;
/*    */   
/*    */   public int getMajorVersionAttrib() {
/* 59 */     return 8337;
/*    */   }
/*    */   
/*    */   public int getMinorVersionAttrib() {
/* 63 */     return 8338;
/*    */   }
/*    */   
/*    */   public int getLayerPlaneAttrib() {
/* 67 */     return 8339;
/*    */   }
/*    */   
/*    */   public int getFlagsAttrib() {
/* 71 */     return 8340;
/*    */   }
/*    */   
/*    */   public int getDebugBit() {
/* 75 */     return 1;
/*    */   }
/*    */   
/*    */   public int getForwardCompatibleBit() {
/* 79 */     return 2;
/*    */   }
/*    */   
/*    */   public int getProfileMaskAttrib() {
/* 83 */     return 37158;
/*    */   }
/*    */   
/*    */   public int getProfileCoreBit() {
/* 87 */     return 1;
/*    */   }
/*    */   
/*    */   public int getProfileCompatibilityBit() {
/* 91 */     return 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\LinuxContextAttribs.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */