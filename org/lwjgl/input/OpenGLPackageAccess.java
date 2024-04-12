/*    */ package org.lwjgl.input;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ import java.security.AccessController;
/*    */ import java.security.PrivilegedActionException;
/*    */ import java.security.PrivilegedExceptionAction;
/*    */ import org.lwjgl.opengl.InputImplementation;
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
/*    */ final class OpenGLPackageAccess
/*    */ {
/*    */   static final Object global_lock;
/*    */   static Class class$org$lwjgl$opengl$Display;
/*    */   
/*    */   static {
/*    */     try {
/* 52 */       global_lock = AccessController.doPrivileged(new PrivilegedExceptionAction() {
/*    */             public Object run() throws Exception {
/* 54 */               Field lock_field = Class.forName("org.lwjgl.opengl.GlobalLock").getDeclaredField("lock");
/* 55 */               lock_field.setAccessible(true);
/* 56 */               return lock_field.get(null);
/*    */             }
/*    */           });
/* 59 */     } catch (PrivilegedActionException e) {
/* 60 */       throw new Error(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static InputImplementation createImplementation() {
/*    */     try {
/* 69 */       return AccessController.<InputImplementation>doPrivileged(new PrivilegedExceptionAction() {
/*    */             public Object run() throws Exception {
/* 71 */               Method getImplementation_method = ((OpenGLPackageAccess.class$org$lwjgl$opengl$Display == null) ? (OpenGLPackageAccess.class$org$lwjgl$opengl$Display = OpenGLPackageAccess.class$("org.lwjgl.opengl.Display")) : OpenGLPackageAccess.class$org$lwjgl$opengl$Display).getDeclaredMethod("getImplementation", null);
/* 72 */               getImplementation_method.setAccessible(true);
/* 73 */               return getImplementation_method.invoke(null, null);
/*    */             }
/*    */           });
/* 76 */     } catch (PrivilegedActionException e) {
/* 77 */       throw new Error(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   static Class class$(String x0) {
/*    */     try {
/*    */       return Class.forName(x0);
/*    */     } catch (ClassNotFoundException x1) {
/*    */       throw (new NoClassDefFoundError()).initCause(x1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\input\OpenGLPackageAccess.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */