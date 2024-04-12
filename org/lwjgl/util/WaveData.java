/*     */ package org.lwjgl.util;
/*     */ 
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.URL;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import java.nio.ShortBuffer;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ import javax.sound.sampled.AudioInputStream;
/*     */ import javax.sound.sampled.AudioSystem;
/*     */ import org.lwjgl.LWJGLUtil;
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
/*     */ public class WaveData
/*     */ {
/*     */   public final ByteBuffer data;
/*     */   public final int format;
/*     */   public final int samplerate;
/*     */   static final boolean $assertionsDisabled;
/*     */   
/*     */   private WaveData(ByteBuffer data, int format, int samplerate) {
/*  75 */     this.data = data;
/*  76 */     this.format = format;
/*  77 */     this.samplerate = samplerate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/*  84 */     this.data.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WaveData create(URL path) {
/*     */     try {
/*  95 */       return create(AudioSystem.getAudioInputStream(new BufferedInputStream(path.openStream())));
/*     */     
/*     */     }
/*  98 */     catch (Exception e) {
/*  99 */       LWJGLUtil.log("Unable to create from: " + path + ", " + e.getMessage());
/* 100 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WaveData create(String path) {
/* 111 */     return create(WaveData.class.getClassLoader().getResource(path));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WaveData create(InputStream is) {
/*     */     try {
/* 122 */       return create(AudioSystem.getAudioInputStream(is));
/*     */     }
/* 124 */     catch (Exception e) {
/* 125 */       LWJGLUtil.log("Unable to create from inputstream, " + e.getMessage());
/* 126 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WaveData create(byte[] buffer) {
/*     */     try {
/* 138 */       return create(AudioSystem.getAudioInputStream(new BufferedInputStream(new ByteArrayInputStream(buffer))));
/*     */     
/*     */     }
/* 141 */     catch (Exception e) {
/* 142 */       LWJGLUtil.log("Unable to create from byte array, " + e.getMessage());
/* 143 */       return null;
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
/*     */   public static WaveData create(ByteBuffer buffer) {
/*     */     try {
/* 157 */       byte[] bytes = null;
/*     */       
/* 159 */       if (buffer.hasArray()) {
/* 160 */         bytes = buffer.array();
/*     */       } else {
/* 162 */         bytes = new byte[buffer.capacity()];
/* 163 */         buffer.get(bytes);
/*     */       } 
/* 165 */       return create(bytes);
/* 166 */     } catch (Exception e) {
/* 167 */       LWJGLUtil.log("Unable to create from ByteBuffer, " + e.getMessage());
/* 168 */       return null;
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
/*     */   public static WaveData create(AudioInputStream ais) {
/* 180 */     AudioFormat audioformat = ais.getFormat();
/*     */ 
/*     */     
/* 183 */     int channels = 0;
/* 184 */     if (audioformat.getChannels() == 1) {
/* 185 */       if (audioformat.getSampleSizeInBits() == 8) {
/* 186 */         channels = 4352;
/* 187 */       } else if (audioformat.getSampleSizeInBits() == 16) {
/* 188 */         channels = 4353;
/*     */       } else {
/* 190 */         assert false : "Illegal sample size";
/*     */       } 
/* 192 */     } else if (audioformat.getChannels() == 2) {
/* 193 */       if (audioformat.getSampleSizeInBits() == 8) {
/* 194 */         channels = 4354;
/* 195 */       } else if (audioformat.getSampleSizeInBits() == 16) {
/* 196 */         channels = 4355;
/*     */       } else {
/* 198 */         assert false : "Illegal sample size";
/*     */       } 
/*     */     } else {
/* 201 */       assert false : "Only mono or stereo is supported";
/*     */     } 
/*     */ 
/*     */     
/* 205 */     ByteBuffer buffer = null;
/*     */     try {
/* 207 */       int available = ais.available();
/* 208 */       if (available <= 0) {
/* 209 */         available = ais.getFormat().getChannels() * (int)ais.getFrameLength() * ais.getFormat().getSampleSizeInBits() / 8;
/*     */       }
/* 211 */       byte[] buf = new byte[ais.available()];
/* 212 */       int read = 0, total = 0;
/*     */       
/* 214 */       while ((read = ais.read(buf, total, buf.length - total)) != -1 && total < buf.length) {
/* 215 */         total += read;
/*     */       }
/* 217 */       buffer = convertAudioBytes(buf, (audioformat.getSampleSizeInBits() == 16));
/* 218 */     } catch (IOException ioe) {
/* 219 */       return null;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 224 */     WaveData wavedata = new WaveData(buffer, channels, (int)audioformat.getSampleRate());
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 229 */       ais.close();
/* 230 */     } catch (IOException ioe) {}
/*     */ 
/*     */     
/* 233 */     return wavedata;
/*     */   }
/*     */   
/*     */   private static ByteBuffer convertAudioBytes(byte[] audio_bytes, boolean two_bytes_data) {
/* 237 */     ByteBuffer dest = ByteBuffer.allocateDirect(audio_bytes.length);
/* 238 */     dest.order(ByteOrder.nativeOrder());
/* 239 */     ByteBuffer src = ByteBuffer.wrap(audio_bytes);
/* 240 */     src.order(ByteOrder.LITTLE_ENDIAN);
/* 241 */     if (two_bytes_data) {
/* 242 */       ShortBuffer dest_short = dest.asShortBuffer();
/* 243 */       ShortBuffer src_short = src.asShortBuffer();
/* 244 */       while (src_short.hasRemaining())
/* 245 */         dest_short.put(src_short.get()); 
/*     */     } else {
/* 247 */       while (src.hasRemaining())
/* 248 */         dest.put(src.get()); 
/*     */     } 
/* 250 */     dest.rewind();
/* 251 */     return dest;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\WaveData.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */