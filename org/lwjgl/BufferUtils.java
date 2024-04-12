/*     */ package org.lwjgl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import java.nio.CharBuffer;
/*     */ import java.nio.DoubleBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.LongBuffer;
/*     */ import java.nio.ShortBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class BufferUtils
/*     */ {
/*     */   public static ByteBuffer createByteBuffer(int size) {
/*  60 */     return ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ShortBuffer createShortBuffer(int size) {
/*  70 */     return createByteBuffer(size << 1).asShortBuffer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CharBuffer createCharBuffer(int size) {
/*  80 */     return createByteBuffer(size << 1).asCharBuffer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static IntBuffer createIntBuffer(int size) {
/*  90 */     return createByteBuffer(size << 2).asIntBuffer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LongBuffer createLongBuffer(int size) {
/* 100 */     return createByteBuffer(size << 3).asLongBuffer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FloatBuffer createFloatBuffer(int size) {
/* 110 */     return createByteBuffer(size << 2).asFloatBuffer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DoubleBuffer createDoubleBuffer(int size) {
/* 120 */     return createByteBuffer(size << 3).asDoubleBuffer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getElementSizeExponent(Buffer buf) {
/* 127 */     if (buf instanceof ByteBuffer)
/* 128 */       return 0; 
/* 129 */     if (buf instanceof ShortBuffer || buf instanceof CharBuffer)
/* 130 */       return 1; 
/* 131 */     if (buf instanceof FloatBuffer || buf instanceof IntBuffer)
/* 132 */       return 2; 
/* 133 */     if (buf instanceof LongBuffer || buf instanceof DoubleBuffer) {
/* 134 */       return 3;
/*     */     }
/* 136 */     throw new IllegalStateException("Unsupported buffer type: " + buf);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getOffset(Buffer buffer) {
/* 145 */     return buffer.position() << getElementSizeExponent(buffer);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\BufferUtils.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */