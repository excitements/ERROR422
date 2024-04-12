/*     */ package org.lwjgl.util;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.LWJGLUtil;
/*     */ import org.lwjgl.opengl.DisplayMode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Display
/*     */ {
/*     */   private static final boolean DEBUG = false;
/*     */   static final boolean $assertionsDisabled;
/*     */   
/*     */   public static DisplayMode[] getAvailableDisplayModes(int minWidth, int minHeight, int maxWidth, int maxHeight, int minBPP, int maxBPP, int minFreq, int maxFreq) throws LWJGLException {
/*  71 */     DisplayMode[] modes = org.lwjgl.opengl.Display.getAvailableDisplayModes();
/*     */     
/*  73 */     if (LWJGLUtil.DEBUG) {
/*  74 */       System.out.println("Available screen modes:");
/*  75 */       for (int j = 0; j < modes.length; j++) {
/*  76 */         System.out.println(modes[j]);
/*     */       }
/*     */     } 
/*     */     
/*  80 */     ArrayList matches = new ArrayList(modes.length);
/*     */     
/*  82 */     for (int i = 0; i < modes.length; i++) {
/*  83 */       assert modes[i] != null : "" + i + " " + modes.length;
/*  84 */       if (minWidth != -1 && modes[i].getWidth() < minWidth)
/*     */         continue; 
/*  86 */       if (maxWidth != -1 && modes[i].getWidth() > maxWidth)
/*     */         continue; 
/*  88 */       if (minHeight != -1 && modes[i].getHeight() < minHeight)
/*     */         continue; 
/*  90 */       if (maxHeight != -1 && modes[i].getHeight() > maxHeight)
/*     */         continue; 
/*  92 */       if (minBPP != -1 && modes[i].getBitsPerPixel() < minBPP)
/*     */         continue; 
/*  94 */       if (maxBPP != -1 && modes[i].getBitsPerPixel() > maxBPP) {
/*     */         continue;
/*     */       }
/*     */       
/*  98 */       if (modes[i].getFrequency() != 0) {
/*  99 */         if (minFreq != -1 && modes[i].getFrequency() < minFreq)
/*     */           continue; 
/* 101 */         if (maxFreq != -1 && modes[i].getFrequency() > maxFreq)
/*     */           continue; 
/*     */       } 
/* 104 */       matches.add(modes[i]);
/*     */       continue;
/*     */     } 
/* 107 */     DisplayMode[] ret = new DisplayMode[matches.size()];
/* 108 */     matches.toArray(ret);
/* 109 */     if (LWJGLUtil.DEBUG);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     return ret;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DisplayMode setDisplayMode(DisplayMode[] dm, final String[] param) throws Exception {
/*     */     class Sorter
/*     */       implements Comparator
/*     */     {
/* 167 */       final Display.FieldAccessor[] field = new Display.FieldAccessor[param.length]; Sorter() {
/* 168 */         for (int i = 0; i < this.field.length; i++) {
/* 169 */           int idx = param[i].indexOf('=');
/* 170 */           if (idx > 0) {
/* 171 */             this.field[i] = new Display.FieldAccessor(param[i].substring(0, idx), 0, Integer.parseInt(param[i].substring(idx + 1, param[i].length())), true);
/* 172 */           } else if (param[i].charAt(0) == '-') {
/* 173 */             this.field[i] = new Display.FieldAccessor(param[i].substring(1), -1, 0, false);
/*     */           } else {
/* 175 */             this.field[i] = new Display.FieldAccessor(param[i], 1, 0, false);
/*     */           } 
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       private final String[] val$param;
/*     */       
/*     */       public int compare(Object o1, Object o2) {
/* 184 */         DisplayMode dm1 = (DisplayMode)o1;
/* 185 */         DisplayMode dm2 = (DisplayMode)o2;
/*     */         
/* 187 */         for (int i = 0; i < this.field.length; i++) {
/* 188 */           int f1 = this.field[i].getInt(dm1);
/* 189 */           int f2 = this.field[i].getInt(dm2);
/*     */           
/* 191 */           if ((this.field[i]).usePreferred && f1 != f2) {
/* 192 */             if (f1 == (this.field[i]).preferred)
/* 193 */               return -1; 
/* 194 */             if (f2 == (this.field[i]).preferred) {
/* 195 */               return 1;
/*     */             }
/*     */             
/* 198 */             int absf1 = Math.abs(f1 - (this.field[i]).preferred);
/* 199 */             int absf2 = Math.abs(f2 - (this.field[i]).preferred);
/* 200 */             if (absf1 < absf2)
/* 201 */               return -1; 
/* 202 */             if (absf1 > absf2) {
/* 203 */               return 1;
/*     */             }
/*     */           } else {
/*     */             
/* 207 */             if (f1 < f2)
/* 208 */               return (this.field[i]).order; 
/* 209 */             if (f1 != f2)
/*     */             {
/*     */               
/* 212 */               return -(this.field[i]).order; } 
/*     */           } 
/*     */         } 
/* 215 */         return 0;
/*     */       }
/*     */     };
/*     */ 
/*     */     
/* 220 */     Arrays.sort(dm, new Sorter());
/*     */ 
/*     */     
/* 223 */     if (LWJGLUtil.DEBUG) {
/* 224 */       System.out.println("Sorted display modes:");
/* 225 */       for (int j = 0; j < dm.length; j++) {
/* 226 */         System.out.println(dm[j]);
/*     */       }
/*     */     } 
/* 229 */     for (int i = 0; i < dm.length; i++) {
/*     */       try {
/* 231 */         if (LWJGLUtil.DEBUG)
/* 232 */           System.out.println("Attempting to set displaymode: " + dm[i]); 
/* 233 */         org.lwjgl.opengl.Display.setDisplayMode(dm[i]);
/* 234 */         return dm[i];
/* 235 */       } catch (Exception e) {
/* 236 */         if (LWJGLUtil.DEBUG) {
/* 237 */           System.out.println("Failed to set display mode to " + dm[i]);
/* 238 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 243 */     throw new Exception("Failed to set display mode.");
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\Display.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */