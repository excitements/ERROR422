/*     */ package org.lwjgl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BufferChecks
/*     */ {
/*     */   public static void checkFunctionAddress(long pointer) {
/*  63 */     if (pointer == 0L) {
/*  64 */       throw new IllegalStateException("Function is not supported");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void checkNullTerminated(ByteBuffer buf) {
/*  72 */     if (buf.get(buf.limit() - 1) != 0) {
/*  73 */       throw new IllegalArgumentException("Missing null termination");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkNullTerminated(ByteBuffer buf, int count) {
/*  78 */     int nullFound = 0;
/*  79 */     for (int i = buf.position(); i < buf.limit(); i++) {
/*  80 */       if (buf.get(i) == 0) {
/*  81 */         nullFound++;
/*     */       }
/*     */     } 
/*  84 */     if (nullFound < count) {
/*  85 */       throw new IllegalArgumentException("Missing null termination");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkNullTerminated(IntBuffer buf) {
/*  90 */     if (buf.get(buf.limit() - 1) != 0) {
/*  91 */       throw new IllegalArgumentException("Missing null termination");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkNotNull(Object o) {
/*  96 */     if (o == null) {
/*  97 */       throw new IllegalArgumentException("Null argument");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void checkDirect(ByteBuffer buf) {
/* 104 */     if (!buf.isDirect()) {
/* 105 */       throw new IllegalArgumentException("ByteBuffer is not direct");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkDirect(ShortBuffer buf) {
/* 110 */     if (!buf.isDirect()) {
/* 111 */       throw new IllegalArgumentException("ShortBuffer is not direct");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkDirect(IntBuffer buf) {
/* 116 */     if (!buf.isDirect()) {
/* 117 */       throw new IllegalArgumentException("IntBuffer is not direct");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkDirect(LongBuffer buf) {
/* 122 */     if (!buf.isDirect()) {
/* 123 */       throw new IllegalArgumentException("LongBuffer is not direct");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkDirect(FloatBuffer buf) {
/* 128 */     if (!buf.isDirect()) {
/* 129 */       throw new IllegalArgumentException("FloatBuffer is not direct");
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkDirect(DoubleBuffer buf) {
/* 134 */     if (!buf.isDirect()) {
/* 135 */       throw new IllegalArgumentException("DoubleBuffer is not direct");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void throwBufferSizeException(Buffer buf, int size) {
/* 143 */     throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at least " + size);
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
/*     */   public static void checkBufferSize(Buffer buf, int size) {
/* 157 */     if (buf.remaining() < size) {
/* 158 */       throwBufferSizeException(buf, size);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void checkBuffer(ByteBuffer buf, int size) {
/* 163 */     checkBufferSize(buf, size);
/* 164 */     checkDirect(buf);
/*     */   }
/*     */   
/*     */   public static void checkBuffer(ShortBuffer buf, int size) {
/* 168 */     checkBufferSize(buf, size);
/* 169 */     checkDirect(buf);
/*     */   }
/*     */   
/*     */   public static void checkBuffer(IntBuffer buf, int size) {
/* 173 */     checkBufferSize(buf, size);
/* 174 */     checkDirect(buf);
/*     */   }
/*     */   
/*     */   public static void checkBuffer(LongBuffer buf, int size) {
/* 178 */     checkBufferSize(buf, size);
/* 179 */     checkDirect(buf);
/*     */   }
/*     */   
/*     */   public static void checkBuffer(FloatBuffer buf, int size) {
/* 183 */     checkBufferSize(buf, size);
/* 184 */     checkDirect(buf);
/*     */   }
/*     */   
/*     */   public static void checkBuffer(DoubleBuffer buf, int size) {
/* 188 */     checkBufferSize(buf, size);
/* 189 */     checkDirect(buf);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\BufferChecks.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */