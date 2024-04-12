/*      */ package org.lwjgl.openal;
/*      */ 
/*      */ import java.nio.Buffer;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.DoubleBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import java.nio.ShortBuffer;
/*      */ import org.lwjgl.BufferChecks;
/*      */ import org.lwjgl.LWJGLException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class AL10
/*      */ {
/*      */   public static final int AL_INVALID = -1;
/*      */   public static final int AL_NONE = 0;
/*      */   public static final int AL_FALSE = 0;
/*      */   public static final int AL_TRUE = 1;
/*      */   public static final int AL_SOURCE_TYPE = 4135;
/*      */   public static final int AL_SOURCE_ABSOLUTE = 513;
/*      */   public static final int AL_SOURCE_RELATIVE = 514;
/*      */   public static final int AL_CONE_INNER_ANGLE = 4097;
/*      */   public static final int AL_CONE_OUTER_ANGLE = 4098;
/*      */   public static final int AL_PITCH = 4099;
/*      */   public static final int AL_POSITION = 4100;
/*      */   public static final int AL_DIRECTION = 4101;
/*      */   public static final int AL_VELOCITY = 4102;
/*      */   public static final int AL_LOOPING = 4103;
/*      */   public static final int AL_BUFFER = 4105;
/*      */   public static final int AL_GAIN = 4106;
/*      */   public static final int AL_MIN_GAIN = 4109;
/*      */   public static final int AL_MAX_GAIN = 4110;
/*      */   public static final int AL_ORIENTATION = 4111;
/*      */   public static final int AL_REFERENCE_DISTANCE = 4128;
/*      */   public static final int AL_ROLLOFF_FACTOR = 4129;
/*      */   public static final int AL_CONE_OUTER_GAIN = 4130;
/*      */   public static final int AL_MAX_DISTANCE = 4131;
/*      */   public static final int AL_CHANNEL_MASK = 12288;
/*      */   public static final int AL_SOURCE_STATE = 4112;
/*      */   public static final int AL_INITIAL = 4113;
/*      */   public static final int AL_PLAYING = 4114;
/*      */   public static final int AL_PAUSED = 4115;
/*      */   public static final int AL_STOPPED = 4116;
/*      */   public static final int AL_BUFFERS_QUEUED = 4117;
/*      */   public static final int AL_BUFFERS_PROCESSED = 4118;
/*      */   public static final int AL_FORMAT_MONO8 = 4352;
/*      */   public static final int AL_FORMAT_MONO16 = 4353;
/*      */   public static final int AL_FORMAT_STEREO8 = 4354;
/*      */   public static final int AL_FORMAT_STEREO16 = 4355;
/*      */   public static final int AL_FORMAT_VORBIS_EXT = 65539;
/*      */   public static final int AL_FREQUENCY = 8193;
/*      */   public static final int AL_BITS = 8194;
/*      */   public static final int AL_CHANNELS = 8195;
/*      */   public static final int AL_SIZE = 8196;
/*      */   public static final int AL_DATA = 8197;
/*      */   public static final int AL_UNUSED = 8208;
/*      */   public static final int AL_PENDING = 8209;
/*      */   public static final int AL_PROCESSED = 8210;
/*      */   public static final int AL_NO_ERROR = 0;
/*      */   public static final int AL_INVALID_NAME = 40961;
/*      */   public static final int AL_INVALID_ENUM = 40962;
/*      */   public static final int AL_INVALID_VALUE = 40963;
/*      */   public static final int AL_INVALID_OPERATION = 40964;
/*      */   public static final int AL_OUT_OF_MEMORY = 40965;
/*      */   public static final int AL_VENDOR = 45057;
/*      */   public static final int AL_VERSION = 45058;
/*      */   public static final int AL_RENDERER = 45059;
/*      */   public static final int AL_EXTENSIONS = 45060;
/*      */   public static final int AL_DOPPLER_FACTOR = 49152;
/*      */   public static final int AL_DOPPLER_VELOCITY = 49153;
/*      */   public static final int AL_DISTANCE_MODEL = 53248;
/*      */   public static final int AL_INVERSE_DISTANCE = 53249;
/*      */   public static final int AL_INVERSE_DISTANCE_CLAMPED = 53250;
/*      */   
/*      */   static native void initNativeStubs() throws LWJGLException;
/*      */   
/*      */   public static native void alEnable(int paramInt);
/*      */   
/*      */   public static native void alDisable(int paramInt);
/*      */   
/*      */   public static native boolean alIsEnabled(int paramInt);
/*      */   
/*      */   public static native boolean alGetBoolean(int paramInt);
/*      */   
/*      */   public static native int alGetInteger(int paramInt);
/*      */   
/*      */   public static native float alGetFloat(int paramInt);
/*      */   
/*      */   public static native double alGetDouble(int paramInt);
/*      */   
/*      */   public static void alGetInteger(int pname, IntBuffer data) {
/*  425 */     BufferChecks.checkBuffer(data, 1);
/*  426 */     nalGetIntegerv(pname, data, data.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalGetIntegerv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alGetFloat(int pname, FloatBuffer data) {
/*  443 */     BufferChecks.checkBuffer(data, 1);
/*  444 */     nalGetFloatv(pname, data, data.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalGetFloatv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alGetDouble(int pname, DoubleBuffer data) {
/*  461 */     BufferChecks.checkBuffer(data, 1);
/*  462 */     nalGetDoublev(pname, data, data.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalGetDoublev(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native String alGetString(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native int alGetError();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean alIsExtensionPresent(String fname) {
/*  566 */     BufferChecks.checkNotNull(fname);
/*  567 */     boolean __result = nalIsExtensionPresent(fname);
/*  568 */     return __result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native boolean nalIsExtensionPresent(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int alGetEnumValue(String ename) {
/*  590 */     BufferChecks.checkNotNull(ename);
/*  591 */     int __result = nalGetEnumValue(ename);
/*  592 */     return __result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native int nalGetEnumValue(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alListeneri(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alListenerf(int paramInt, float paramFloat);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alListener(int pname, FloatBuffer value) {
/*  616 */     BufferChecks.checkBuffer(value, 1);
/*  617 */     nalListenerfv(pname, value, value.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalListenerfv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alListener3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native int alGetListeneri(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native float alGetListenerf(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alGetListener(int pname, FloatBuffer floatdata) {
/*  653 */     BufferChecks.checkBuffer(floatdata, 1);
/*  654 */     nalGetListenerfv(pname, floatdata, floatdata.position());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalGetListenerfv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2);
/*      */ 
/*      */   
/*      */   public static void alGenSources(IntBuffer sources) {
/*  663 */     BufferChecks.checkDirect(sources);
/*  664 */     nalGenSources(sources.remaining(), sources, sources.position());
/*      */   }
/*      */   
/*      */   private static native void nalGenSources(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */   
/*      */   public static int alGenSources() {
/*  670 */     int __result = nalGenSources2(1);
/*  671 */     return __result;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static native int nalGenSources2(int paramInt);
/*      */ 
/*      */   
/*      */   public static void alDeleteSources(IntBuffer sources) {
/*  680 */     BufferChecks.checkDirect(sources);
/*  681 */     nalDeleteSources(sources.remaining(), sources, sources.position());
/*      */   }
/*      */   
/*      */   private static native void nalDeleteSources(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */   
/*      */   public static void alDeleteSources(int source) {
/*  687 */     nalDeleteSources2(1, source);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalDeleteSources2(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native boolean alIsSource(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alSourcei(int paramInt1, int paramInt2, int paramInt3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alSourcef(int paramInt1, int paramInt2, float paramFloat);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alSource(int source, int pname, FloatBuffer value) {
/*  724 */     BufferChecks.checkBuffer(value, 1);
/*  725 */     nalSourcefv(source, pname, value, value.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalSourcefv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alSource3f(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native int alGetSourcei(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native float alGetSourcef(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alGetSource(int source, int pname, FloatBuffer floatdata) {
/*  769 */     BufferChecks.checkBuffer(floatdata, 1);
/*  770 */     nalGetSourcefv(source, pname, floatdata, floatdata.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalGetSourcefv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alSourcePlay(IntBuffer sources) {
/*  786 */     BufferChecks.checkDirect(sources);
/*  787 */     nalSourcePlayv(sources.remaining(), sources, sources.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalSourcePlayv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alSourcePause(IntBuffer sources) {
/*  799 */     BufferChecks.checkDirect(sources);
/*  800 */     nalSourcePausev(sources.remaining(), sources, sources.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalSourcePausev(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alSourceStop(IntBuffer sources) {
/*  813 */     BufferChecks.checkDirect(sources);
/*  814 */     nalSourceStopv(sources.remaining(), sources, sources.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalSourceStopv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alSourceRewind(IntBuffer sources) {
/*  829 */     BufferChecks.checkDirect(sources);
/*  830 */     nalSourceRewindv(sources.remaining(), sources, sources.position());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalSourceRewindv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alSourcePlay(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alSourcePause(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alSourceStop(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native void alSourceRewind(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alGenBuffers(IntBuffer buffers) {
/*  883 */     BufferChecks.checkDirect(buffers);
/*  884 */     nalGenBuffers(buffers.remaining(), buffers, buffers.position());
/*      */   }
/*      */   
/*      */   private static native void nalGenBuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */   
/*      */   public static int alGenBuffers() {
/*  890 */     int __result = nalGenBuffers2(1);
/*  891 */     return __result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native int nalGenBuffers2(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alDeleteBuffers(IntBuffer buffers) {
/*  911 */     BufferChecks.checkDirect(buffers);
/*  912 */     nalDeleteBuffers(buffers.remaining(), buffers, buffers.position());
/*      */   }
/*      */   
/*      */   private static native void nalDeleteBuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2);
/*      */   
/*      */   public static void alDeleteBuffers(int buffer) {
/*  918 */     nalDeleteBuffers2(1, buffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalDeleteBuffers2(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native boolean alIsBuffer(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alBufferData(int buffer, int format, ByteBuffer data, int freq) {
/*  956 */     BufferChecks.checkDirect(data);
/*  957 */     nalBufferData(buffer, format, data, data.position(), data.remaining(), freq);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alBufferData(int buffer, int format, IntBuffer data, int freq) {
/*  986 */     BufferChecks.checkDirect(data);
/*  987 */     nalBufferData(buffer, format, data, data.position() << 2, data.remaining() << 2, freq);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alBufferData(int buffer, int format, ShortBuffer data, int freq) {
/* 1016 */     BufferChecks.checkDirect(data);
/* 1017 */     nalBufferData(buffer, format, data, data.position() << 1, data.remaining() << 1, freq);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalBufferData(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, int paramInt4, int paramInt5);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native int alGetBufferi(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static native float alGetBufferf(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alSourceQueueBuffers(int source, IntBuffer buffers) {
/* 1055 */     BufferChecks.checkDirect(buffers);
/* 1056 */     nalSourceQueueBuffers(source, buffers.remaining(), buffers, buffers.position());
/*      */   }
/*      */   
/*      */   private static native void nalSourceQueueBuffers(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3);
/*      */   
/*      */   public static void alSourceQueueBuffers(int source, int buffer) {
/* 1062 */     nalSourceQueueBuffers2(source, 1, buffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nalSourceQueueBuffers2(int paramInt1, int paramInt2, int paramInt3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void alSourceUnqueueBuffers(int source, IntBuffer buffers) {
/* 1085 */     BufferChecks.checkDirect(buffers);
/* 1086 */     nalSourceUnqueueBuffers(source, buffers.remaining(), buffers, buffers.position());
/*      */   }
/*      */   
/*      */   private static native void nalSourceUnqueueBuffers(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3);
/*      */   
/*      */   public static int alSourceUnqueueBuffers(int source) {
/* 1092 */     int __result = nalSourceUnqueueBuffers2(source, 1);
/* 1093 */     return __result;
/*      */   }
/*      */   
/*      */   private static native int nalSourceUnqueueBuffers2(int paramInt1, int paramInt2);
/*      */   
/*      */   public static native void alDistanceModel(int paramInt);
/*      */   
/*      */   public static native void alDopplerFactor(float paramFloat);
/*      */   
/*      */   public static native void alDopplerVelocity(float paramFloat);
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\openal\AL10.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */