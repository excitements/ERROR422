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
/*    */ public class OpenGLException
/*    */   extends RuntimeException
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public OpenGLException(int gl_error_code) {
/* 48 */     this(createErrorMessage(gl_error_code));
/*    */   }
/*    */   
/*    */   private static String createErrorMessage(int gl_error_code) {
/* 52 */     String error_string = Util.translateGLErrorString(gl_error_code);
/* 53 */     return error_string + " (" + gl_error_code + ")";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public OpenGLException() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public OpenGLException(String message) {
/* 67 */     super(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public OpenGLException(String message, Throwable cause) {
/* 77 */     super(message, cause);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public OpenGLException(Throwable cause) {
/* 86 */     super(cause);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\OpenGLException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */