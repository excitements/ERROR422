/*    */ package org.lwjgl.opengl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import org.lwjgl.BufferChecks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class GREMEDYStringMarker
/*    */ {
/*    */   public static void glStringMarkerGREMEDY(ByteBuffer string) {
/* 16 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 17 */     long function_pointer = caps.GREMEDY_string_marker_glStringMarkerGREMEDY_pointer;
/* 18 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 19 */     BufferChecks.checkDirect(string);
/* 20 */     nglStringMarkerGREMEDY(string.remaining(), string, string.position(), function_pointer);
/*    */   }
/*    */   
/*    */   private static native void nglStringMarkerGREMEDY(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*    */   
/*    */   public static void glStringMarkerGREMEDY(CharSequence string) {
/* 26 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 27 */     long function_pointer = caps.GREMEDY_string_marker_glStringMarkerGREMEDY_pointer;
/* 28 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 29 */     nglStringMarkerGREMEDY(string.length(), APIUtils.getBuffer(string), 0, function_pointer);
/*    */   }
/*    */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GREMEDYStringMarker.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */