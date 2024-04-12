package paulscode.sound;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.ListIterator;

public class SoundSystemConfig {
  private static SoundSystemLogger logger;
  
  private static int numberStreamingChannels;
  
  private static float defaultRolloffFactor;
  
  private static float dopplerFactor;
  
  private static int streamingBufferSize;
  
  public static final int TYPE_NORMAL;
  
  private static LinkedList codecs;
  
  private static float masterGain;
  
  public static final int ATTENUATION_ROLLOFF;
  
  private static int fileChunkSize;
  
  private static LinkedList libraries;
  
  private static String soundFilesPackage;
  
  public static String PREFIX_URL;
  
  private static int maxFileSize;
  
  private static String overrideMIDISynthesizer;
  
  private static int numberNormalChannels;
  
  private static int numberStreamingBuffers;
  
  private static LinkedList streamListeners;
  
  private static float dopplerVelocity;
  
  private static boolean streamQueueFormatsMatch;
  
  public static String EXTENSION_MIDI;
  
  public static final int ATTENUATION_LINEAR = 2;
  
  private static final Object streamListenersLock;
  
  private static float defaultFadeDistance;
  
  public static final int TYPE_STREAMING;
  
  private static int defaultAttenuationModel;
  
  public static final int ATTENUATION_NONE;
  
  public static final Object THREAD_SYNC;
  
  private static boolean midiCodec;
  
  private static Object runMethod(Class paramClass, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject) {
    Method method = null;
    try {
      method = paramClass.getMethod(paramString, paramArrayOfClass);
    } catch (NoSuchMethodException noSuchMethodException) {
      errorMessage("NoSuchMethodException thrown when attempting to call method '" + paramString + "' in " + "method 'runMethod'");
      return null;
    } catch (SecurityException securityException) {
      errorMessage("Access denied when attempting to call method '" + paramString + "' in method 'runMethod'");
      return null;
    } catch (NullPointerException nullPointerException) {
      errorMessage("NullPointerException thrown when attempting to call method '" + paramString + "' in " + "method 'runMethod'");
      return null;
    } 
    if (method == null) {
      errorMessage("Method '" + paramString + "' not found for the class " + "specified in method 'runMethod'");
      return null;
    } 
    Object object = null;
    try {
      object = method.invoke(null, paramArrayOfObject);
    } catch (IllegalAccessException illegalAccessException) {
      errorMessage("IllegalAccessException thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
      return null;
    } catch (IllegalArgumentException illegalArgumentException) {
      errorMessage("IllegalArgumentException thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
      return null;
    } catch (InvocationTargetException invocationTargetException) {
      errorMessage("InvocationTargetException thrown while attempting to invoke method 'Library.getTitle' in method 'getLibraryTitle'");
      return null;
    } catch (NullPointerException nullPointerException) {
      errorMessage("NullPointerException thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
      return null;
    } catch (ExceptionInInitializerError exceptionInInitializerError) {
      errorMessage("ExceptionInInitializerError thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
      return null;
    } 
    return object;
  }
  
  private static void errorMessage(String paramString) {
    if (logger != null)
      logger.errorMessage("SoundSystemConfig", paramString, 0); 
  }
  
  public static String getLibraryDescription(Class<?> paramClass) {
    if (paramClass == null) {
      errorMessage("Parameter 'libraryClass' null in method'getLibrayDescription'");
      return null;
    } 
    if (!Library.class.isAssignableFrom(paramClass)) {
      errorMessage("The specified class does not extend class 'Library' in method 'getLibraryDescription'");
      return null;
    } 
    Object object = runMethod(paramClass, "getDescription", new Class[0], new Object[0]);
    if (object == null) {
      errorMessage("Method 'Library.getDescription' returned 'null' in method 'getLibraryDescription'");
      return null;
    } 
    return (String)object;
  }
  
  public static synchronized int getNumberNormalChannels() {
    return numberNormalChannels;
  }
  
  public static boolean midiCodec() {
    return midiCodec;
  }
  
  public static synchronized String getOverrideMIDISynthesizer() {
    return overrideMIDISynthesizer;
  }
  
  public static synchronized void setOverrideMIDISynthesizer(String paramString) {
    overrideMIDISynthesizer = paramString;
  }
  
  public static synchronized int getFileChunkSize() {
    return fileChunkSize;
  }
  
  public static synchronized void setNumberStreamingChannels(int paramInt) {
    numberStreamingChannels = paramInt;
  }
  
  public static void addLibrary(Class<?> paramClass) {
    if (paramClass == null)
      throw new SoundSystemException("Parameter null in method 'addLibrary'", 2); 
    if (!Library.class.isAssignableFrom(paramClass))
      throw new SoundSystemException("The specified class does not extend class 'Library' in method 'addLibrary'"); 
    if (libraries == null)
      libraries = new LinkedList(); 
    if (!libraries.contains(paramClass))
      libraries.add(paramClass); 
  }
  
  public static synchronized void setDopplerFactor(float paramFloat) {
    dopplerFactor = paramFloat;
  }
  
  public static synchronized void setStreamingBufferSize(int paramInt) {
    streamingBufferSize = paramInt;
  }
  
  public static synchronized int getStreamingBufferSize() {
    return streamingBufferSize;
  }
  
  public static void addStreamListener(IStreamListener paramIStreamListener) {
    synchronized (streamListenersLock) {
      if (streamListeners == null)
        streamListeners = new LinkedList(); 
      if (!streamListeners.contains(paramIStreamListener))
        streamListeners.add(paramIStreamListener); 
    } 
  }
  
  public static boolean libraryCompatible(Class<?> paramClass) {
    if (paramClass == null) {
      errorMessage("Parameter 'libraryClass' null in method'librayCompatible'");
      return false;
    } 
    if (!Library.class.isAssignableFrom(paramClass)) {
      errorMessage("The specified class does not extend class 'Library' in method 'libraryCompatible'");
      return false;
    } 
    Object object = runMethod(paramClass, "libraryCompatible", new Class[0], new Object[0]);
    if (object == null) {
      errorMessage("Method 'Library.libraryCompatible' returned 'null' in method 'libraryCompatible'");
      return false;
    } 
    return ((Boolean)object).booleanValue();
  }
  
  public static synchronized void setNumberStreamingBuffers(int paramInt) {
    numberStreamingBuffers = paramInt;
  }
  
  public static synchronized String getSoundFilesPackage() {
    return soundFilesPackage;
  }
  
  public static synchronized void setFileChunkSize(int paramInt) {
    fileChunkSize = paramInt;
  }
  
  public static synchronized int getNumberStreamingChannels() {
    return numberStreamingChannels;
  }
  
  public static synchronized void setSoundFilesPackage(String paramString) {
    soundFilesPackage = paramString;
  }
  
  public static synchronized void setCodec(String paramString, Class<?> paramClass) {
    if (paramString == null)
      throw new SoundSystemException("Parameter 'extension' null in method 'setCodec'.", 2); 
    if (paramClass == null)
      throw new SoundSystemException("Parameter 'iCodecClass' null in method 'setCodec'.", 2); 
    if (!ICodec.class.isAssignableFrom(paramClass))
      throw new SoundSystemException("The specified class does not implement interface 'ICodec' in method 'setCodec'", 3); 
    if (codecs == null)
      codecs = new LinkedList(); 
    ListIterator<SoundSystemConfig$Codec> listIterator = codecs.listIterator();
    while (listIterator.hasNext()) {
      SoundSystemConfig$Codec soundSystemConfig$Codec = listIterator.next();
      if (paramString.matches(soundSystemConfig$Codec.extensionRegX))
        listIterator.remove(); 
    } 
    codecs.add(new SoundSystemConfig$Codec(paramString, paramClass));
    if (paramString.matches(EXTENSION_MIDI))
      midiCodec = true; 
  }
  
  public static synchronized void setDopplerVelocity(float paramFloat) {
    dopplerVelocity = paramFloat;
  }
  
  public static boolean reverseByteOrder(Class<?> paramClass) {
    if (paramClass == null) {
      errorMessage("Parameter 'libraryClass' null in method'reverseByteOrder'");
      return false;
    } 
    if (!Library.class.isAssignableFrom(paramClass)) {
      errorMessage("The specified class does not extend class 'Library' in method 'reverseByteOrder'");
      return false;
    } 
    Object object = runMethod(paramClass, "reversByteOrder", new Class[0], new Object[0]);
    if (object == null) {
      errorMessage("Method 'Library.reverseByteOrder' returned 'null' in method 'getLibraryDescription'");
      return false;
    } 
    return ((Boolean)object).booleanValue();
  }
  
  public static synchronized void setDefaultRolloff(float paramFloat) {
    defaultRolloffFactor = paramFloat;
  }
  
  public static SoundSystemLogger getLogger() {
    return logger;
  }
  
  public static synchronized float getDefaultRolloff() {
    return defaultRolloffFactor;
  }
  
  public static synchronized int getNumberStreamingBuffers() {
    return numberStreamingBuffers;
  }
  
  public static synchronized int getDefaultAttenuation() {
    return defaultAttenuationModel;
  }
  
  public static synchronized boolean getStreamQueueFormatsMatch() {
    return streamQueueFormatsMatch;
  }
  
  public static synchronized float getMasterGain() {
    return masterGain;
  }
  
  public static synchronized void setMaxFileSize(int paramInt) {
    maxFileSize = paramInt;
  }
  
  public static synchronized int getMaxFileSize() {
    return maxFileSize;
  }
  
  public static void removeLibrary(Class paramClass) {
    if (libraries == null || paramClass == null)
      return; 
    libraries.remove(paramClass);
  }
  
  public static synchronized float getDopplerFactor() {
    return dopplerFactor;
  }
  
  public static synchronized void setNumberNormalChannels(int paramInt) {
    numberNormalChannels = paramInt;
  }
  
  public static synchronized float getDefaultFadeDistance() {
    return defaultFadeDistance;
  }
  
  public static synchronized void setStreamQueueFormatsMatch(boolean paramBoolean) {
    streamQueueFormatsMatch = paramBoolean;
  }
  
  public static synchronized void setMasterGain(float paramFloat) {
    masterGain = paramFloat;
  }
  
  static {
    TYPE_NORMAL = 0;
    TYPE_STREAMING = 1;
    ATTENUATION_NONE = 0;
    ATTENUATION_ROLLOFF = 1;
    THREAD_SYNC = new Object();
    EXTENSION_MIDI = ".*[mM][iI][dD][iI]?$";
    PREFIX_URL = "^[hH][tT][tT][pP]://.*";
    logger = null;
    codecs = null;
    streamListeners = null;
    streamListenersLock = new Object();
    numberNormalChannels = 28;
    numberStreamingChannels = 4;
    masterGain = 1.0F;
    defaultAttenuationModel = 1;
    defaultRolloffFactor = 0.03F;
    dopplerFactor = 0.0F;
    dopplerVelocity = 1.0F;
    defaultFadeDistance = 1000.0F;
    soundFilesPackage = "Sounds/";
    streamingBufferSize = 131072;
    numberStreamingBuffers = 3;
    streamQueueFormatsMatch = false;
    maxFileSize = 268435456;
    fileChunkSize = 1048576;
    midiCodec = false;
    overrideMIDISynthesizer = "";
  }
  
  public static synchronized void setDefaultFadeDistance(float paramFloat) {
    defaultFadeDistance = paramFloat;
  }
  
  public static LinkedList getLibraries() {
    return libraries;
  }
  
  public static void notifyEOS(String paramString, int paramInt) {
    synchronized (streamListenersLock) {
      if (streamListeners == null)
        return; 
    } 
    String str = paramString;
    int i = paramInt;
    (new SoundSystemConfig$1(str, i)).start();
  }
  
  public static String getLibraryTitle(Class<?> paramClass) {
    if (paramClass == null) {
      errorMessage("Parameter 'libraryClass' null in method'getLibrayTitle'");
      return null;
    } 
    if (!Library.class.isAssignableFrom(paramClass)) {
      errorMessage("The specified class does not extend class 'Library' in method 'getLibraryTitle'");
      return null;
    } 
    Object object = runMethod(paramClass, "getTitle", new Class[0], new Object[0]);
    if (object == null) {
      errorMessage("Method 'Library.getTitle' returned 'null' in method 'getLibraryTitle'");
      return null;
    } 
    return (String)object;
  }
  
  public static synchronized void setDefaultAttenuation(int paramInt) {
    defaultAttenuationModel = paramInt;
  }
  
  public static synchronized ICodec getCodec(String paramString) {
    if (codecs == null)
      return null; 
    ListIterator<SoundSystemConfig$Codec> listIterator = codecs.listIterator();
    while (listIterator.hasNext()) {
      SoundSystemConfig$Codec soundSystemConfig$Codec = listIterator.next();
      if (paramString.matches(soundSystemConfig$Codec.extensionRegX))
        return soundSystemConfig$Codec.getInstance(); 
    } 
    return null;
  }
  
  public static void removeStreamListener(IStreamListener paramIStreamListener) {
    synchronized (streamListenersLock) {
      if (streamListeners == null)
        streamListeners = new LinkedList(); 
      if (streamListeners.contains(paramIStreamListener))
        streamListeners.remove(paramIStreamListener); 
    } 
  }
  
  public static synchronized float getDopplerVelocity() {
    return dopplerVelocity;
  }
  
  public static void setLogger(SoundSystemLogger paramSoundSystemLogger) {
    logger = paramSoundSystemLogger;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SoundSystemConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */