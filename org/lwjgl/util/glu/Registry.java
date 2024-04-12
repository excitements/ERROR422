/*    */ package org.lwjgl.util.glu;
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
/*    */ 
/*    */ 
/*    */ public class Registry
/*    */   extends Util
/*    */ {
/*    */   private static final String versionString = "1.3";
/*    */   private static final String extensionString = "GLU_EXT_nurbs_tessellator GLU_EXT_object_space_tess ";
/*    */   
/*    */   public static String gluGetString(int name) {
/* 54 */     if (name == 100800)
/* 55 */       return "1.3"; 
/* 56 */     if (name == 100801) {
/* 57 */       return "GLU_EXT_nurbs_tessellator GLU_EXT_object_space_tess ";
/*    */     }
/* 59 */     return null;
/*    */   }
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
/*    */   public static boolean gluCheckExtension(String extName, String extString) {
/* 73 */     if (extString == null || extName == null) {
/* 74 */       return false;
/*    */     }
/* 76 */     return (extString.indexOf(extName) != -1);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\Registry.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */