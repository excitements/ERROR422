/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedAction;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class XRandR
/*     */ {
/*     */   private static Screen[] current;
/*     */   private static Map screens;
/*     */   
/*     */   private static void populate() {
/*  59 */     if (screens == null) {
/*  60 */       screens = new HashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/*  66 */         Process p = Runtime.getRuntime().exec(new String[] { "xrandr", "-q" });
/*     */         
/*  68 */         List currentList = new ArrayList();
/*  69 */         List possibles = new ArrayList();
/*  70 */         String name = null;
/*     */         
/*  72 */         BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
/*     */         String line;
/*  74 */         while ((line = br.readLine()) != null) {
/*  75 */           line = line.trim();
/*  76 */           String[] sa = line.split("\\s+");
/*     */           
/*  78 */           if (sa[1].equals("connected")) {
/*     */             
/*  80 */             if (name != null) {
/*  81 */               screens.put(name, possibles.toArray((Object[])new Screen[possibles.size()]));
/*  82 */               possibles.clear();
/*     */             } 
/*  84 */             name = sa[0];
/*     */ 
/*     */             
/*  87 */             currentList.add(new Screen(name, sa[2])); continue;
/*  88 */           }  if (Pattern.matches("\\d*x\\d*", sa[0]))
/*     */           {
/*  90 */             possibles.add(new Screen(name, sa[0]));
/*     */           }
/*     */         } 
/*     */         
/*  94 */         screens.put(name, possibles.toArray(new Screen[possibles.size()]));
/*     */         
/*  96 */         current = currentList.<Screen>toArray(new Screen[currentList.size()]);
/*  97 */       } catch (IOException e) {
/*  98 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Screen[] getConfiguration() {
/* 108 */     AccessController.doPrivileged(new PrivilegedAction() {
/*     */           public Object run() {
/* 110 */             XRandR.populate();
/* 111 */             return null;
/*     */           }
/*     */         });
/*     */     
/* 115 */     return (Screen[])current.clone();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setConfiguration(Screen[] screens) {
/* 123 */     if (screens.length == 0) {
/* 124 */       throw new IllegalArgumentException("Must specify at least one screen");
/*     */     }
/*     */     
/* 127 */     List cmd = new ArrayList();
/* 128 */     cmd.add("xrandr");
/*     */     
/*     */     int i;
/* 131 */     for (i = 0; i < current.length; i++) {
/* 132 */       boolean found = false;
/* 133 */       for (int j = 0; j < screens.length; j++) {
/* 134 */         if ((screens[j]).name.equals((current[i]).name)) {
/* 135 */           found = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 140 */       if (!found) {
/* 141 */         cmd.add("--output");
/* 142 */         cmd.add((current[i]).name);
/* 143 */         cmd.add("--off");
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 148 */     for (i = 0; i < screens.length; i++) {
/* 149 */       screens[i].getArgs(cmd);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 156 */       Process p = Runtime.getRuntime().exec(cmd.<String>toArray(new String[cmd.size()]));
/*     */       
/* 158 */       BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
/*     */       String line;
/* 160 */       while ((line = br.readLine()) != null) {
/* 161 */         System.out.println(line);
/*     */       }
/* 163 */       current = screens;
/* 164 */     } catch (IOException e) {
/* 165 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] getScreenNames() {
/* 175 */     populate();
/* 176 */     return (String[])screens.keySet().toArray((Object[])new String[screens.size()]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Screen[] getResolutions(String name) {
/* 185 */     populate();
/*     */     
/* 187 */     return (Screen[])((Screen[])screens.get(name)).clone();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Screen
/*     */     implements Cloneable
/*     */   {
/*     */     public final String name;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int width;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int height;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 216 */     public int xPos = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     public int yPos = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Screen(String name, String conf) {
/* 231 */       this.name = name;
/*     */       
/* 233 */       String[] sa = conf.split("\\D");
/* 234 */       this.width = Integer.parseInt(sa[0]);
/* 235 */       this.height = Integer.parseInt(sa[1]);
/*     */       
/* 237 */       if (sa.length > 2) {
/* 238 */         this.xPos = Integer.parseInt(sa[2]);
/* 239 */         this.yPos = Integer.parseInt(sa[3]);
/*     */       } 
/*     */     }
/*     */     
/*     */     private void getArgs(List argList) {
/* 244 */       argList.add("--output");
/* 245 */       argList.add(this.name);
/* 246 */       argList.add("--mode");
/* 247 */       argList.add(this.width + "x" + this.height);
/* 248 */       argList.add("--pos");
/* 249 */       argList.add(this.xPos + "x" + this.yPos);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 254 */       return this.name + " " + this.width + "x" + this.height + " @ " + this.xPos + "x" + this.yPos;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\XRandR.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */