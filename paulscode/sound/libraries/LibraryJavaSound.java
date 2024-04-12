package paulscode.sound.libraries;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ICodec;
import paulscode.sound.Library;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.Source;

public class LibraryJavaSound extends Library {
  private static int minSampleRate;
  
  private static final int XXX;
  
  private final int maxClipSize = 1048576;
  
  private static Mixer myMixer;
  
  private static int maxSampleRate;
  
  private static boolean useSampleRateControl;
  
  private static final boolean SET = true;
  
  private static LibraryJavaSound$MixerRanking myMixerRanking;
  
  private static final boolean GET;
  
  private static boolean usePanControl;
  
  private static boolean useGainControl;
  
  private static int lineCount;
  
  private static LibraryJavaSound instance;
  
  private static synchronized LibraryJavaSound$MixerRanking mixerRanking(boolean paramBoolean, LibraryJavaSound$MixerRanking paramLibraryJavaSound$MixerRanking) {
    if (paramBoolean == true)
      myMixerRanking = paramLibraryJavaSound$MixerRanking; 
    return myMixerRanking;
  }
  
  private static synchronized boolean useSampleRateControl(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      useSampleRateControl = paramBoolean2; 
    return useSampleRateControl;
  }
  
  public static boolean libraryCompatible() {
    for (Mixer.Info info : AudioSystem.getMixerInfo()) {
      if (info.getName().equals("Java Sound Audio Engine"))
        return true; 
    } 
    return false;
  }
  
  public static Mixer getMixer() {
    return mixer(false, (Mixer)null);
  }
  
  public void cleanup() {
    super.cleanup();
    instance = null;
    myMixer = null;
    myMixerRanking = null;
  }
  
  public void quickPlay(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    SoundBuffer soundBuffer = null;
    if (!paramBoolean2) {
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null && !loadSound(paramFilenameURL)) {
        errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
        return;
      } 
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null) {
        errorMessage("Source '" + paramString + "' was not created " + "because audio data was not found for " + paramFilenameURL.getFilename());
        return;
      } 
    } 
    if (!paramBoolean2 && soundBuffer != null)
      soundBuffer.trimData(1048576); 
    this.sourceMap.put(paramString, new SourceJavaSound(this.listener, paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, soundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4));
  }
  
  public void newSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    SoundBuffer soundBuffer = null;
    if (!paramBoolean2) {
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null && !loadSound(paramFilenameURL)) {
        errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
        return;
      } 
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null) {
        errorMessage("Source '" + paramString + "' was not created " + "because audio data was not found for " + paramFilenameURL.getFilename());
        return;
      } 
    } 
    if (!paramBoolean2 && soundBuffer != null)
      soundBuffer.trimData(1048576); 
    this.sourceMap.put(paramString, new SourceJavaSound(this.listener, paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, soundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, false));
  }
  
  public boolean loadSound(FilenameURL paramFilenameURL) {
    if (this.bufferMap == null) {
      this.bufferMap = new HashMap<Object, Object>();
      importantMessage("Buffer Map was null in method 'loadSound'");
    } 
    if (errorCheck((paramFilenameURL == null), "Filename/URL not specified in method 'loadSound'"))
      return false; 
    if (this.bufferMap.get(paramFilenameURL.getFilename()) != null)
      return true; 
    ICodec iCodec = SoundSystemConfig.getCodec(paramFilenameURL.getFilename());
    if (errorCheck((iCodec == null), "No codec found for file '" + paramFilenameURL.getFilename() + "' in method 'loadSound'"))
      return false; 
    URL uRL = paramFilenameURL.getURL();
    if (errorCheck((uRL == null), "Unable to open file '" + paramFilenameURL.getFilename() + "' in method 'loadSound'"))
      return false; 
    iCodec.initialize(uRL);
    SoundBuffer soundBuffer = iCodec.readAll();
    iCodec.cleanup();
    iCodec = null;
    if (soundBuffer != null) {
      this.bufferMap.put(paramFilenameURL.getFilename(), soundBuffer);
    } else {
      errorMessage("Sound buffer null in method 'loadSound'");
    } 
    return true;
  }
  
  private static synchronized int lineCount(boolean paramBoolean, int paramInt) {
    if (paramBoolean == true)
      lineCount = paramInt; 
    return lineCount;
  }
  
  public boolean loadSound(SoundBuffer paramSoundBuffer, String paramString) {
    if (this.bufferMap == null) {
      this.bufferMap = new HashMap<Object, Object>();
      importantMessage("Buffer Map was null in method 'loadSound'");
    } 
    if (errorCheck((paramString == null), "Identifier not specified in method 'loadSound'"))
      return false; 
    if (this.bufferMap.get(paramString) != null)
      return true; 
    if (paramSoundBuffer != null) {
      this.bufferMap.put(paramString, paramSoundBuffer);
    } else {
      errorMessage("Sound buffer null in method 'loadSound'");
    } 
    return true;
  }
  
  public static void useGainControl(boolean paramBoolean) {
    useGainControl(true, paramBoolean);
  }
  
  public void rawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    this.sourceMap.put(paramString, new SourceJavaSound(this.listener, paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
  }
  
  public static void useSampleRateControl(boolean paramBoolean) {
    useSampleRateControl(true, paramBoolean);
  }
  
  public static LibraryJavaSound$MixerRanking getMixerRanking() {
    return mixerRanking(false, (LibraryJavaSound$MixerRanking)null);
  }
  
  private static synchronized boolean usePanControl(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      usePanControl = paramBoolean2; 
    return usePanControl;
  }
  
  public static void usePanControl(boolean paramBoolean) {
    usePanControl(true, paramBoolean);
  }
  
  public static void setMinSampleRate(int paramInt) {
    minSampleRate(true, paramInt);
  }
  
  public void init() {
    LibraryJavaSound$MixerRanking libraryJavaSound$MixerRanking = null;
    if (myMixer == null) {
      for (Mixer.Info info : AudioSystem.getMixerInfo()) {
        if (info.getName().equals("Java Sound Audio Engine")) {
          libraryJavaSound$MixerRanking = new LibraryJavaSound$MixerRanking();
          try {
            libraryJavaSound$MixerRanking.rank(info);
          } catch (LibraryJavaSound$Exception libraryJavaSound$Exception) {
            break;
          } 
          if (libraryJavaSound$MixerRanking.rank < 14)
            break; 
          myMixer = AudioSystem.getMixer(info);
          mixerRanking(true, libraryJavaSound$MixerRanking);
          break;
        } 
      } 
      if (myMixer == null) {
        LibraryJavaSound$MixerRanking libraryJavaSound$MixerRanking1 = libraryJavaSound$MixerRanking;
        for (Mixer.Info info : AudioSystem.getMixerInfo()) {
          libraryJavaSound$MixerRanking = new LibraryJavaSound$MixerRanking();
          try {
            libraryJavaSound$MixerRanking.rank(info);
          } catch (LibraryJavaSound$Exception libraryJavaSound$Exception) {}
          if (libraryJavaSound$MixerRanking1 == null || libraryJavaSound$MixerRanking.rank > libraryJavaSound$MixerRanking1.rank)
            libraryJavaSound$MixerRanking1 = libraryJavaSound$MixerRanking; 
        } 
        if (libraryJavaSound$MixerRanking1 == null)
          throw new LibraryJavaSound$Exception("No useable mixers found!", new LibraryJavaSound$MixerRanking()); 
        try {
          myMixer = AudioSystem.getMixer(libraryJavaSound$MixerRanking1.mixerInfo);
          mixerRanking(true, libraryJavaSound$MixerRanking1);
        } catch (Exception exception) {
          throw new LibraryJavaSound$Exception("No useable mixers available!", new LibraryJavaSound$MixerRanking());
        } 
      } 
    } 
    setMasterVolume(1.0F);
    message("JavaSound initialized.");
    super.init();
  }
  
  public static void setLineCount(int paramInt) {
    lineCount(true, paramInt);
  }
  
  public static String getDescription() {
    return "The Java Sound API.  For more information, see http://java.sun.com/products/java-media/sound/";
  }
  
  static {
    XXX = 0;
    GET = false;
    myMixer = null;
    myMixerRanking = null;
    instance = null;
    minSampleRate = 4000;
    maxSampleRate = 48000;
    lineCount = 32;
    useGainControl = true;
    usePanControl = true;
    useSampleRateControl = true;
  }
  
  private static synchronized int minSampleRate(boolean paramBoolean, int paramInt) {
    if (paramBoolean == true)
      minSampleRate = paramInt; 
    return minSampleRate;
  }
  
  public void setMasterVolume(float paramFloat) {
    super.setMasterVolume(paramFloat);
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null)
        source.positionChanged(); 
    } 
  }
  
  public static String getTitle() {
    return "Java Sound";
  }
  
  protected Channel createChannel(int paramInt) {
    return new ChannelJavaSound(paramInt, myMixer);
  }
  
  private static synchronized Mixer mixer(boolean paramBoolean, Mixer paramMixer) {
    if (paramBoolean == true) {
      if (paramMixer == null)
        return myMixer; 
      LibraryJavaSound$MixerRanking libraryJavaSound$MixerRanking = new LibraryJavaSound$MixerRanking();
      try {
        libraryJavaSound$MixerRanking.rank(paramMixer.getMixerInfo());
      } catch (LibraryJavaSound$Exception libraryJavaSound$Exception) {
        SoundSystemConfig.getLogger().printStackTrace((Exception)libraryJavaSound$Exception, 1);
        SoundSystem.setException(libraryJavaSound$Exception);
      } 
      myMixer = paramMixer;
      mixerRanking(true, libraryJavaSound$MixerRanking);
      if (instance != null) {
        ListIterator<ChannelJavaSound> listIterator = instance.normalChannels.listIterator();
        SoundSystem.setException(null);
        while (listIterator.hasNext()) {
          ChannelJavaSound channelJavaSound = listIterator.next();
          channelJavaSound.newMixer(paramMixer);
        } 
        listIterator = instance.streamingChannels.listIterator();
        while (listIterator.hasNext()) {
          ChannelJavaSound channelJavaSound = listIterator.next();
          channelJavaSound.newMixer(paramMixer);
        } 
      } 
    } 
    return myMixer;
  }
  
  public void copySources(HashMap paramHashMap) {
    if (paramHashMap == null)
      return; 
    Set set = paramHashMap.keySet();
    Iterator<String> iterator = set.iterator();
    if (this.bufferMap == null) {
      this.bufferMap = new HashMap<Object, Object>();
      importantMessage("Buffer Map was null in method 'copySources'");
    } 
    this.sourceMap.clear();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Source source = (Source)paramHashMap.get(str);
      if (source != null) {
        SoundBuffer soundBuffer = null;
        if (!source.toStream) {
          loadSound(source.filenameURL);
          soundBuffer = (SoundBuffer)this.bufferMap.get(source.filenameURL.getFilename());
        } 
        if (!source.toStream && soundBuffer != null)
          soundBuffer.trimData(1048576); 
        if (source.toStream || soundBuffer != null)
          this.sourceMap.put(str, new SourceJavaSound(this.listener, source, soundBuffer)); 
      } 
    } 
  }
  
  public String getClassName() {
    return "LibraryJavaSound";
  }
  
  public static void setMixer(Mixer paramMixer) {
    mixer(true, paramMixer);
    SoundSystemException soundSystemException = SoundSystem.getLastException();
    SoundSystem.setException(null);
    if (soundSystemException != null)
      throw soundSystemException; 
  }
  
  public void setListenerVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    super.setListenerVelocity(paramFloat1, paramFloat2, paramFloat3);
    listenerMoved();
  }
  
  private static synchronized boolean useGainControl(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      useGainControl = paramBoolean2; 
    return useGainControl;
  }
  
  private static synchronized int maxSampleRate(boolean paramBoolean, int paramInt) {
    if (paramBoolean == true)
      maxSampleRate = paramInt; 
    return maxSampleRate;
  }
  
  public void dopplerChanged() {
    super.dopplerChanged();
    listenerMoved();
  }
  
  public LibraryJavaSound() {
    instance = this;
  }
  
  public static void setMaxSampleRate(int paramInt) {
    maxSampleRate(true, paramInt);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\LibraryJavaSound.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */