/*     */ package org.lwjgl.openal;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.HashMap;
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
/*     */ 
/*     */ public final class ALC10
/*     */ {
/*  60 */   static HashMap contexts = new HashMap();
/*     */ 
/*     */   
/*  63 */   static HashMap devices = new HashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_INVALID = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_FALSE = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_TRUE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_NO_ERROR = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_MAJOR_VERSION = 4096;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_MINOR_VERSION = 4097;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_ATTRIBUTES_SIZE = 4098;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_ALL_ATTRIBUTES = 4099;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_DEFAULT_DEVICE_SPECIFIER = 4100;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_DEVICE_SPECIFIER = 4101;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_EXTENSIONS = 4102;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_FREQUENCY = 4103;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_REFRESH = 4104;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_SYNC = 4105;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_INVALID_DEVICE = 40961;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_INVALID_CONTEXT = 40962;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_INVALID_ENUM = 40963;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_INVALID_VALUE = 40964;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ALC_OUT_OF_MEMORY = 40965;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native void initNativeStubs() throws LWJGLException;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String alcGetString(ALCdevice device, int pname) {
/* 155 */     String result = nalcGetString(getDevice(device), pname);
/* 156 */     Util.checkALCError(device);
/* 157 */     return result;
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
/*     */   static native String nalcGetString(long paramLong, int paramInt);
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
/*     */   public static void alcGetInteger(ALCdevice device, int pname, IntBuffer integerdata) {
/* 182 */     BufferChecks.checkDirect(integerdata);
/* 183 */     nalcGetIntegerv(getDevice(device), pname, integerdata.remaining(), integerdata, integerdata.position());
/* 184 */     Util.checkALCError(device);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native void nalcGetIntegerv(long paramLong, int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ALCdevice alcOpenDevice(String devicename) {
/* 201 */     long device_address = nalcOpenDevice(devicename);
/* 202 */     if (device_address != 0L) {
/* 203 */       ALCdevice device = new ALCdevice(device_address);
/* 204 */       synchronized (devices) {
/* 205 */         devices.put(new Long(device_address), device);
/*     */       } 
/* 207 */       return device;
/*     */     } 
/* 209 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native long nalcOpenDevice(String paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean alcCloseDevice(ALCdevice device) {
/* 223 */     boolean result = nalcCloseDevice(getDevice(device));
/* 224 */     synchronized (devices) {
/* 225 */       device.setInvalid();
/* 226 */       devices.remove(new Long(device.device));
/*     */     } 
/* 228 */     return result;
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
/*     */   static native boolean nalcCloseDevice(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ALCcontext alcCreateContext(ALCdevice device, IntBuffer attrList) {
/* 249 */     long context_address = nalcCreateContext(getDevice(device), attrList);
/* 250 */     Util.checkALCError(device);
/*     */     
/* 252 */     if (context_address != 0L) {
/* 253 */       ALCcontext context = new ALCcontext(context_address);
/* 254 */       synchronized (contexts) {
/* 255 */         contexts.put(new Long(context_address), context);
/* 256 */         device.addContext(context);
/*     */       } 
/* 258 */       return context;
/*     */     } 
/* 260 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native long nalcCreateContext(long paramLong, IntBuffer paramIntBuffer);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int alcMakeContextCurrent(ALCcontext context) {
/* 279 */     return nalcMakeContextCurrent(getContext(context));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native int nalcMakeContextCurrent(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alcProcessContext(ALCcontext context) {
/* 295 */     nalcProcessContext(getContext(context));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native void nalcProcessContext(long paramLong);
/*     */ 
/*     */ 
/*     */   
/*     */   public static ALCcontext alcGetCurrentContext() {
/* 306 */     ALCcontext context = null;
/* 307 */     long context_address = nalcGetCurrentContext();
/* 308 */     if (context_address != 0L) {
/* 309 */       synchronized (contexts) {
/* 310 */         context = (ALCcontext)contexts.get(new Long(context_address));
/*     */       } 
/*     */     }
/* 313 */     return context;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static native long nalcGetCurrentContext();
/*     */ 
/*     */ 
/*     */   
/*     */   public static ALCdevice alcGetContextsDevice(ALCcontext context) {
/* 323 */     ALCdevice device = null;
/* 324 */     long device_address = nalcGetContextsDevice(getContext(context));
/* 325 */     if (device_address != 0L) {
/* 326 */       synchronized (devices) {
/* 327 */         device = (ALCdevice)devices.get(new Long(device_address));
/*     */       } 
/*     */     }
/* 330 */     return device;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native long nalcGetContextsDevice(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alcSuspendContext(ALCcontext context) {
/* 347 */     nalcSuspendContext(getContext(context));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native void nalcSuspendContext(long paramLong);
/*     */ 
/*     */ 
/*     */   
/*     */   public static void alcDestroyContext(ALCcontext context) {
/* 358 */     synchronized (contexts) {
/* 359 */       ALCdevice device = alcGetContextsDevice(context);
/* 360 */       nalcDestroyContext(getContext(context));
/* 361 */       device.removeContext(context);
/* 362 */       context.setInvalid();
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
/*     */   static native void nalcDestroyContext(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int alcGetError(ALCdevice device) {
/* 383 */     return nalcGetError(getDevice(device));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native int nalcGetError(long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean alcIsExtensionPresent(ALCdevice device, String extName) {
/* 397 */     boolean result = nalcIsExtensionPresent(getDevice(device), extName);
/* 398 */     Util.checkALCError(device);
/* 399 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static native boolean nalcIsExtensionPresent(long paramLong, String paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int alcGetEnumValue(ALCdevice device, String enumName) {
/* 414 */     int result = nalcGetEnumValue(getDevice(device), enumName);
/* 415 */     Util.checkALCError(device);
/* 416 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   static long getDevice(ALCdevice device) {
/* 421 */     if (device != null) {
/* 422 */       Util.checkALCValidDevice(device);
/* 423 */       return device.device;
/*     */     } 
/* 425 */     return 0L;
/*     */   }
/*     */   static native int nalcGetEnumValue(long paramLong, String paramString);
/*     */   static long getContext(ALCcontext context) {
/* 429 */     if (context != null) {
/* 430 */       Util.checkALCValidContext(context);
/* 431 */       return context.context;
/*     */     } 
/* 433 */     return 0L;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\ALC10.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */