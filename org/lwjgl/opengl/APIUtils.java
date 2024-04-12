/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.CharBuffer;
/*     */ import java.nio.DoubleBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.LongBuffer;
/*     */ import java.nio.ShortBuffer;
/*     */ import java.nio.charset.Charset;
/*     */ import java.nio.charset.CharsetEncoder;
/*     */ import org.lwjgl.BufferUtils;
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
/*     */ final class APIUtils
/*     */ {
/*     */   private static final int INITIAL_BUFFER_SIZE = 256;
/*     */   private static final int INITIAL_LENGTHS_SIZE = 4;
/*     */   private static final int BUFFERS_SIZE = 32;
/*     */   
/*  48 */   private static final ThreadLocal arrayTL = new ThreadLocal() { protected Object initialValue() {
/*  49 */         return new char[256];
/*     */       } }
/*     */   ;
/*  52 */   private static final ThreadLocal bufferTL = new ThreadLocal() { protected Object initialValue() {
/*  53 */         return BufferUtils.createByteBuffer(256);
/*     */       } }
/*     */   ;
/*  56 */   private static final ThreadLocal lengthsTL = new ThreadLocal() { protected Object initialValue() {
/*  57 */         return BufferUtils.createIntBuffer(4);
/*     */       } }
/*     */   ;
/*  60 */   private static final ThreadLocal infiniteSeqTL = new ThreadLocal() { protected Object initialValue() {
/*  61 */         return new APIUtils.InfiniteCharSequence();
/*     */       } }
/*     */   ;
/*  64 */   private static final ThreadLocal buffersTL = new ThreadLocal() { protected Object initialValue() {
/*  65 */         return new APIUtils.Buffers();
/*     */       } }
/*     */   ;
/*  68 */   private static CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static char[] getArray(int size) {
/*  74 */     char[] array = arrayTL.get();
/*     */     
/*  76 */     if (array.length < size) {
/*  77 */       int sizeNew = array.length << 1;
/*  78 */       while (sizeNew < size) {
/*  79 */         sizeNew <<= 1;
/*     */       }
/*  81 */       array = new char[size];
/*  82 */       arrayTL.set(array);
/*     */     } 
/*     */     
/*  85 */     return array;
/*     */   }
/*     */   
/*     */   static ByteBuffer getBufferByte(int size) {
/*  89 */     ByteBuffer buffer = bufferTL.get();
/*     */     
/*  91 */     if (buffer.capacity() < size) {
/*  92 */       int sizeNew = buffer.capacity() << 1;
/*  93 */       while (sizeNew < size) {
/*  94 */         sizeNew <<= 1;
/*     */       }
/*  96 */       buffer = BufferUtils.createByteBuffer(size);
/*  97 */       bufferTL.set(buffer);
/*     */     } else {
/*  99 */       buffer.clear();
/*     */     } 
/* 101 */     return buffer;
/*     */   }
/*     */   
/*     */   private static ByteBuffer getBufferByteOffset(int size) {
/* 105 */     ByteBuffer buffer = bufferTL.get();
/*     */     
/* 107 */     if (buffer.capacity() < size) {
/* 108 */       int sizeNew = buffer.capacity() << 1;
/* 109 */       while (sizeNew < size) {
/* 110 */         sizeNew <<= 1;
/*     */       }
/* 112 */       ByteBuffer bufferNew = BufferUtils.createByteBuffer(size);
/* 113 */       bufferNew.put(buffer);
/* 114 */       bufferTL.set(buffer = bufferNew);
/*     */     } else {
/* 116 */       buffer.position(buffer.limit());
/* 117 */       buffer.limit(buffer.capacity());
/*     */     } 
/*     */     
/* 120 */     return buffer;
/*     */   }
/*     */   static ShortBuffer getBufferShort() {
/* 123 */     return ((Buffers)buffersTL.get()).shorts;
/*     */   } static IntBuffer getBufferInt() {
/* 125 */     return ((Buffers)buffersTL.get()).ints;
/*     */   } static LongBuffer getBufferLong() {
/* 127 */     return ((Buffers)buffersTL.get()).longs;
/*     */   } static FloatBuffer getBufferFloat() {
/* 129 */     return ((Buffers)buffersTL.get()).floats;
/*     */   } static DoubleBuffer getBufferDouble() {
/* 131 */     return ((Buffers)buffersTL.get()).doubles;
/*     */   }
/*     */   static IntBuffer getLengths() {
/* 134 */     return getLengths(1);
/*     */   }
/*     */   
/*     */   static IntBuffer getLengths(int size) {
/* 138 */     IntBuffer lengths = lengthsTL.get();
/*     */     
/* 140 */     if (lengths.capacity() < size) {
/* 141 */       int sizeNew = lengths.capacity();
/* 142 */       while (sizeNew < size) {
/* 143 */         sizeNew <<= 1;
/*     */       }
/* 145 */       lengths = BufferUtils.createIntBuffer(size);
/* 146 */       lengthsTL.set(lengths);
/*     */     } else {
/* 148 */       lengths.clear();
/*     */     } 
/* 150 */     return lengths;
/*     */   }
/*     */   
/*     */   private static InfiniteCharSequence getInfiniteSeq() {
/* 154 */     return infiniteSeqTL.get();
/*     */   }
/*     */   
/*     */   private static void encode(ByteBuffer buffer, CharSequence string) {
/* 158 */     InfiniteCharSequence infiniteSeq = getInfiniteSeq();
/* 159 */     infiniteSeq.setString(string);
/* 160 */     encoder.encode(infiniteSeq.buffer, buffer, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static String getString(ByteBuffer buffer) {
/* 171 */     int length = buffer.remaining();
/* 172 */     char[] charArray = getArray(length);
/*     */     
/* 174 */     for (int i = buffer.position(); i < buffer.limit(); i++) {
/* 175 */       charArray[i - buffer.position()] = (char)buffer.get(i);
/*     */     }
/* 177 */     return new String(charArray, 0, length);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static ByteBuffer getBuffer(CharSequence string) {
/* 188 */     ByteBuffer buffer = getBufferByte(string.length());
/*     */     
/* 190 */     encode(buffer, string);
/*     */     
/* 192 */     buffer.flip();
/* 193 */     return buffer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static ByteBuffer getBuffer(CharSequence string, int offset) {
/* 204 */     ByteBuffer buffer = getBufferByteOffset(offset + string.length());
/*     */     
/* 206 */     encode(buffer, string);
/*     */     
/* 208 */     buffer.flip();
/* 209 */     return buffer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static ByteBuffer getBufferNT(CharSequence string) {
/* 220 */     ByteBuffer buffer = getBufferByte(string.length() + 1);
/*     */     
/* 222 */     encode(buffer, string);
/*     */     
/* 224 */     buffer.put((byte)0);
/* 225 */     buffer.flip();
/* 226 */     return buffer;
/*     */   }
/*     */   
/*     */   static int getTotalLength(CharSequence[] strings) {
/* 230 */     int length = 0;
/* 231 */     for (int i = 0; i < strings.length; i++) {
/* 232 */       length += strings[i].length();
/*     */     }
/* 234 */     return length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static ByteBuffer getBuffer(CharSequence[] strings) {
/* 245 */     ByteBuffer buffer = getBufferByte(getTotalLength(strings));
/*     */     
/* 247 */     InfiniteCharSequence infiniteSeq = getInfiniteSeq();
/* 248 */     for (int i = 0; i < strings.length; i++) {
/* 249 */       infiniteSeq.setString(strings[i]);
/* 250 */       encoder.encode(infiniteSeq.buffer, buffer, true);
/*     */     } 
/* 252 */     infiniteSeq.clear();
/*     */     
/* 254 */     buffer.flip();
/* 255 */     return buffer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static ByteBuffer getBufferNT(CharSequence[] strings) {
/* 266 */     ByteBuffer buffer = getBufferByte(getTotalLength(strings) + strings.length);
/*     */     
/* 268 */     InfiniteCharSequence infiniteSeq = getInfiniteSeq();
/* 269 */     for (int i = 0; i < strings.length; i++) {
/* 270 */       infiniteSeq.setString(strings[i]);
/* 271 */       encoder.encode(infiniteSeq.buffer, buffer, true);
/* 272 */       buffer.put((byte)0);
/*     */     } 
/* 274 */     infiniteSeq.clear();
/*     */     
/* 276 */     buffer.flip();
/* 277 */     return buffer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static IntBuffer getLengths(CharSequence[] strings) {
/* 288 */     IntBuffer buffer = getLengths(strings.length);
/*     */     
/* 290 */     for (int i = 0; i < strings.length; i++) {
/* 291 */       buffer.put(strings[i].length());
/*     */     }
/* 293 */     buffer.flip();
/* 294 */     return buffer;
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
/*     */   private static class InfiniteCharSequence
/*     */     implements CharSequence
/*     */   {
/* 308 */     final CharBuffer buffer = CharBuffer.wrap(this);
/*     */     CharSequence string;
/*     */     
/*     */     void setString(CharSequence string) {
/* 312 */       this.string = string;
/* 313 */       this.buffer.position(0);
/* 314 */       this.buffer.limit(string.length());
/*     */     }
/*     */     
/*     */     void clear() {
/* 318 */       this.string = null;
/*     */     }
/*     */     
/*     */     public int length() {
/* 322 */       return Integer.MAX_VALUE;
/*     */     }
/*     */     
/*     */     public char charAt(int index) {
/* 326 */       return this.string.charAt(index);
/*     */     }
/*     */     
/*     */     public CharSequence subSequence(int start, int end) {
/* 330 */       return this.string.subSequence(start, end);
/*     */     }
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
/*     */   private static class Buffers
/*     */   {
/* 344 */     final ShortBuffer shorts = BufferUtils.createShortBuffer(32);
/* 345 */     final IntBuffer ints = BufferUtils.createIntBuffer(32);
/* 346 */     final LongBuffer longs = BufferUtils.createLongBuffer(32);
/*     */     
/* 348 */     final FloatBuffer floats = BufferUtils.createFloatBuffer(32);
/* 349 */     final DoubleBuffer doubles = BufferUtils.createDoubleBuffer(32);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\APIUtils.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */