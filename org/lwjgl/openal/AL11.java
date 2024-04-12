/*     */ package org.lwjgl.openal;
/*     */ 
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ import org.lwjgl.LWJGLException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AL11
/*     */ {
/*     */   public static final int AL_SEC_OFFSET = 4132;
/*     */   public static final int AL_SAMPLE_OFFSET = 4133;
/*     */   public static final int AL_BYTE_OFFSET = 4134;
/*     */   public static final int AL_STATIC = 4136;
/*     */   public static final int AL_STREAMING = 4137;
/*     */   public static final int AL_UNDETERMINED = 4144;
/*     */   public static final int AL_ILLEGAL_COMMAND = 40964;
/*     */   public static final int AL_SPEED_OF_SOUND = 49155;
/*     */   public static final int AL_LINEAR_DISTANCE = 53251;
/*     */   public static final int AL_LINEAR_DISTANCE_CLAMPED = 53252;
/*     */   public static final int AL_EXPONENT_DISTANCE = 53253;
/*     */   public static final int AL_EXPONENT_DISTANCE_CLAMPED = 53254;
/*     */   
/*     */   static native void initNativeStubs() throws LWJGLException;
/*     */   
/*     */   public static native void alListener3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   public static void alGetListeneri(int pname, FloatBuffer intdata) {
/*  76 */     BufferChecks.checkBuffer(intdata, 1);
/*  77 */     nalGetListeneriv(pname, intdata, intdata.position());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static native void nalGetListeneriv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static native void alSource3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alSource(int source, int pname, IntBuffer value) {
/* 100 */     BufferChecks.checkBuffer(value, 1);
/* 101 */     nalSourceiv(source, pname, value, value.position());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static native void nalSourceiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static native void alBufferf(int paramInt1, int paramInt2, float paramFloat);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static native void alBuffer3f(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alBuffer(int buffer, int pname, FloatBuffer value) {
/* 136 */     BufferChecks.checkBuffer(value, 1);
/* 137 */     nalBufferfv(buffer, pname, value, value.position());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static native void nalBufferfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static native void alBufferi(int paramInt1, int paramInt2, int paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static native void alBuffer3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alBuffer(int buffer, int pname, IntBuffer value) {
/* 172 */     BufferChecks.checkBuffer(value, 1);
/* 173 */     nalBufferiv(buffer, pname, value, value.position());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static native void nalBufferiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static native int alGetBufferi(int paramInt1, int paramInt2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alGetBuffer(int buffer, int pname, IntBuffer values) {
/* 195 */     BufferChecks.checkBuffer(values, 1);
/* 196 */     nalGetBufferiv(buffer, pname, values, values.position());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static native void nalGetBufferiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static native float alGetBufferf(int paramInt1, int paramInt2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alGetBuffer(int buffer, int pname, FloatBuffer values) {
/* 220 */     BufferChecks.checkBuffer(values, 1);
/* 221 */     nalGetBufferfv(buffer, pname, values, values.position());
/*     */   }
/*     */   
/*     */   private static native void nalGetBufferfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3);
/*     */   
/*     */   public static native void alSpeedOfSound(float paramFloat);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\AL11.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */