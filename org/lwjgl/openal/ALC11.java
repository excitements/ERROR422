/*     */ package org.lwjgl.openal;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
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
/*     */ public final class ALC11
/*     */ {
/*     */   public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 4114;
/*     */   public static final int ALC_ALL_DEVICES_SPECIFIER = 4115;
/*     */   public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 784;
/*     */   public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 785;
/*     */   public static final int ALC_CAPTURE_SAMPLES = 786;
/*     */   
/*     */   public static ALCdevice alcCaptureOpenDevice(String devicename, int frequency, int format, int buffersize) {
/*  92 */     long device_address = nalcCaptureOpenDevice(devicename, frequency, format, buffersize);
/*  93 */     if (device_address != 0L) {
/*  94 */       ALCdevice device = new ALCdevice(device_address);
/*  95 */       synchronized (ALC10.devices) {
/*  96 */         ALC10.devices.put(new Long(device_address), device);
/*     */       } 
/*  98 */       return device;
/*     */     } 
/* 100 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native long nalcCaptureOpenDevice(String paramString, int paramInt1, int paramInt2, int paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean alcCaptureCloseDevice(ALCdevice device) {
/* 114 */     boolean result = nalcCaptureCloseDevice(ALC10.getDevice(device));
/* 115 */     synchronized (ALC10.devices) {
/* 116 */       device.setInvalid();
/* 117 */       ALC10.devices.remove(new Long(device.device));
/*     */     } 
/* 119 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native boolean nalcCaptureCloseDevice(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alcCaptureStart(ALCdevice device) {
/* 134 */     nalcCaptureStart(ALC10.getDevice(device));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native void nalcCaptureStart(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alcCaptureStop(ALCdevice device) {
/* 146 */     nalcCaptureStop(ALC10.getDevice(device));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native void nalcCaptureStop(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alcCaptureSamples(ALCdevice device, ByteBuffer buffer, int samples) {
/* 162 */     nalcCaptureSamples(ALC10.getDevice(device), buffer, buffer.position(), samples);
/*     */   }
/*     */ 
/*     */   
/*     */   static native void nalcCaptureSamples(long paramLong, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   static native void initNativeStubs() throws LWJGLException;
/*     */ 
/*     */   
/*     */   static boolean initialize() {
/*     */     try {
/* 174 */       IntBuffer ib = BufferUtils.createIntBuffer(2);
/* 175 */       ALC10.alcGetInteger(AL.getDevice(), 4096, ib);
/* 176 */       ib.position(1);
/* 177 */       ALC10.alcGetInteger(AL.getDevice(), 4097, ib);
/*     */       
/* 179 */       int major = ib.get(0);
/* 180 */       int minor = ib.get(1);
/*     */ 
/*     */       
/* 183 */       if (major >= 1)
/*     */       {
/*     */         
/* 186 */         if (major > 1 || minor >= 1) {
/* 187 */           initNativeStubs();
/* 188 */           AL11.initNativeStubs();
/*     */         } 
/*     */       }
/* 191 */     } catch (LWJGLException le) {
/* 192 */       LWJGLUtil.log("failed to initialize ALC11: " + le);
/* 193 */       return false;
/*     */     } 
/* 195 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\ALC11.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */