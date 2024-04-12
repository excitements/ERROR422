package paulscode.sound;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import javax.sound.sampled.AudioFormat;

public class SoundSystem {
  protected String className = "SoundSystem";
  
  private List sourcePlayList;
  
  private static boolean initialized;
  
  protected SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  protected Library soundLibrary;
  
  public Random randomNumberGenerator;
  
  private static final boolean SET;
  
  protected CommandThread commandThread;
  
  private static final boolean GET;
  
  protected List commandQueue;
  
  private static Class currentLibrary;
  
  private static final boolean XXX = false;
  
  private static SoundSystemException lastException;
  
  public float getPitch(String paramString) {
    return (this.soundLibrary != null) ? this.soundLibrary.getPitch(paramString) : 1.0F;
  }
  
  public void queueSound(String paramString1, URL paramURL, String paramString2) {
    CommandQueue(new CommandObject(5, paramString1, new FilenameURL(paramURL, paramString2)));
    this.commandThread.interrupt();
  }
  
  public void setListenerAngle(float paramFloat) {
    CommandQueue(new CommandObject(37, paramFloat));
    this.commandThread.interrupt();
  }
  
  public String quickPlay(boolean paramBoolean1, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
    CommandQueue(new CommandObject(12, paramBoolean1, false, paramBoolean2, str, new FilenameURL(paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
    CommandQueue(new CommandObject(24, str));
    this.commandThread.interrupt();
    return str;
  }
  
  public void setPosition(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    CommandQueue(new CommandObject(13, paramString, paramFloat1, paramFloat2, paramFloat3));
    this.commandThread.interrupt();
  }
  
  public void setLooping(String paramString, boolean paramBoolean) {
    CommandQueue(new CommandObject(17, paramString, paramBoolean));
    this.commandThread.interrupt();
  }
  
  public float millisecondsPlayed(String paramString) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      return this.soundLibrary.millisecondsPlayed(paramString);
    } 
  }
  
  private void CommandSetListenerVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setListenerVelocity(paramFloat1, paramFloat2, paramFloat3);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetListenerVelocity'", 0);
    } 
  }
  
  public void changeDopplerFactor(float paramFloat) {
    CommandQueue(new CommandObject(20, paramFloat));
    this.commandThread.interrupt();
  }
  
  public static boolean libraryCompatible(Class paramClass) {
    SoundSystemLogger soundSystemLogger = SoundSystemConfig.getLogger();
    if (soundSystemLogger == null) {
      soundSystemLogger = new SoundSystemLogger();
      SoundSystemConfig.setLogger(soundSystemLogger);
    } 
    soundSystemLogger.message("", 0);
    soundSystemLogger.message("Checking if " + SoundSystemConfig.getLibraryTitle(paramClass) + " is compatible...", 0);
    boolean bool = SoundSystemConfig.libraryCompatible(paramClass);
    if (bool) {
      soundSystemLogger.message("...yes", 1);
    } else {
      soundSystemLogger.message("...no", 1);
    } 
    return bool;
  }
  
  private void CommandPause(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.pause(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandPause'", 0);
    } 
  }
  
  public void setListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    CommandQueue(new CommandObject(38, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6));
    this.commandThread.interrupt();
  }
  
  public void setTemporary(String paramString, boolean paramBoolean) {
    CommandQueue(new CommandObject(32, paramString, paramBoolean));
    this.commandThread.interrupt();
  }
  
  public void cull(String paramString) {
    CommandQueue(new CommandObject(30, paramString));
    this.commandThread.interrupt();
  }
  
  private void CommandRemoveSource(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.removeSource(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandRemoveSource'", 0);
    } 
  }
  
  public void setListenerVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    CommandQueue(new CommandObject(23, paramFloat1, paramFloat2, paramFloat3));
    this.commandThread.interrupt();
  }
  
  public SoundSystem() {
    if (this.logger == null) {
      this.logger = new SoundSystemLogger();
      SoundSystemConfig.setLogger(this.logger);
    } 
    linkDefaultLibrariesAndCodecs();
    LinkedList linkedList = SoundSystemConfig.getLibraries();
    if (linkedList != null) {
      ListIterator<Class<?>> listIterator = linkedList.listIterator();
      while (listIterator.hasNext()) {
        Class clazz = listIterator.next();
        try {
          init(clazz);
          return;
        } catch (SoundSystemException soundSystemException) {
          this.logger.printExceptionMessage(soundSystemException, 1);
        } 
      } 
    } 
    try {
      init(Library.class);
      return;
    } catch (SoundSystemException soundSystemException) {
      this.logger.printExceptionMessage(soundSystemException, 1);
      return;
    } 
  }
  
  public boolean switchLibrary(Class<Library> paramClass) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      initialized(true, false);
      HashMap hashMap = null;
      ListenerData listenerData = null;
      boolean bool = false;
      MidiChannel midiChannel = null;
      FilenameURL filenameURL = null;
      String str = "";
      boolean bool1 = true;
      if (this.soundLibrary != null) {
        currentLibrary(true, null);
        hashMap = copySources(this.soundLibrary.getSources());
        listenerData = this.soundLibrary.getListenerData();
        midiChannel = this.soundLibrary.getMidiChannel();
        if (midiChannel != null) {
          bool = true;
          bool1 = midiChannel.getLooping();
          str = midiChannel.getSourcename();
          filenameURL = midiChannel.getFilenameURL();
        } 
        this.soundLibrary.cleanup();
        this.soundLibrary = null;
      } 
      message("", 0);
      message("Switching to " + SoundSystemConfig.getLibraryTitle(paramClass), 0);
      message("(" + SoundSystemConfig.getLibraryDescription(paramClass) + ")", 1);
      try {
        this.soundLibrary = paramClass.newInstance();
      } catch (InstantiationException instantiationException) {
        errorMessage("The specified library did not load properly", 1);
      } catch (IllegalAccessException illegalAccessException) {
        errorMessage("The specified library did not load properly", 1);
      } catch (ExceptionInInitializerError exceptionInInitializerError) {
        errorMessage("The specified library did not load properly", 1);
      } catch (SecurityException securityException) {
        errorMessage("The specified library did not load properly", 1);
      } 
      if (errorCheck((this.soundLibrary == null), "Library null after initialization in method 'switchLibrary'", 1)) {
        SoundSystemException soundSystemException = new SoundSystemException(this.className + " did not load properly.  " + "Library was null after initialization.", 4);
        lastException(true, soundSystemException);
        initialized(true, true);
        throw soundSystemException;
      } 
      try {
        this.soundLibrary.init();
      } catch (SoundSystemException soundSystemException) {
        lastException(true, soundSystemException);
        initialized(true, true);
        throw soundSystemException;
      } 
      this.soundLibrary.setListenerData(listenerData);
      if (bool) {
        if (midiChannel != null)
          midiChannel.cleanup(); 
        midiChannel = new MidiChannel(bool1, str, filenameURL);
        this.soundLibrary.setMidiChannel(midiChannel);
      } 
      this.soundLibrary.copySources(hashMap);
      message("", 0);
      lastException(true, null);
      initialized(true, true);
      return true;
    } 
  }
  
  private void CommandLoadSound(SoundBuffer paramSoundBuffer, String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.loadSound(paramSoundBuffer, paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
    } 
  }
  
  private static boolean initialized(boolean paramBoolean1, boolean paramBoolean2) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (paramBoolean1 == true)
        initialized = paramBoolean2; 
      return initialized;
    } 
  }
  
  public void feedRawAudioData(String paramString, byte[] paramArrayOfbyte) {
    CommandQueue(new CommandObject(25, paramString, paramArrayOfbyte));
    this.commandThread.interrupt();
  }
  
  public void stop(String paramString) {
    CommandQueue(new CommandObject(27, paramString));
    this.commandThread.interrupt();
  }
  
  public void turnListener(float paramFloat) {
    CommandQueue(new CommandObject(36, paramFloat));
    this.commandThread.interrupt();
  }
  
  private void CommandSetListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setListenerPosition(paramFloat1, paramFloat2, paramFloat3);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetListenerPosition'", 0);
    } 
  }
  
  private void CommandUnloadSound(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.unloadSound(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
    } 
  }
  
  private void CommandFeedRawAudioData(String paramString, byte[] paramArrayOfbyte) {
    if (this.soundLibrary != null) {
      this.soundLibrary.feedRawAudioData(paramString, paramArrayOfbyte);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandFeedRawAudioData'", 0);
    } 
  }
  
  protected void importantMessage(String paramString, int paramInt) {
    this.logger.importantMessage(paramString, paramInt);
  }
  
  public void loadSound(byte[] paramArrayOfbyte, AudioFormat paramAudioFormat, String paramString) {
    CommandQueue(new CommandObject(3, paramString, new SoundBuffer(paramArrayOfbyte, paramAudioFormat)));
    this.commandThread.interrupt();
  }
  
  public void loadSound(String paramString) {
    CommandQueue(new CommandObject(2, new FilenameURL(paramString)));
    this.commandThread.interrupt();
  }
  
  public void activate(String paramString) {
    CommandQueue(new CommandObject(31, paramString));
    this.commandThread.interrupt();
  }
  
  private void CommandTurnListener(float paramFloat) {
    if (this.soundLibrary != null) {
      this.soundLibrary.turnListener(paramFloat);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandTurnListener'", 0);
    } 
  }
  
  private void CommandInitialize() {
    try {
      if (errorCheck((this.soundLibrary == null), "Library null after initialization in method 'CommandInitialize'", 1)) {
        SoundSystemException soundSystemException = new SoundSystemException(this.className + " did not load properly.  " + "Library was null after initialization.", 4);
        lastException(true, soundSystemException);
        throw soundSystemException;
      } 
      this.soundLibrary.init();
    } catch (SoundSystemException soundSystemException) {
      lastException(true, soundSystemException);
      initialized(true, true);
    } 
  }
  
  private void CommandSetPriority(String paramString, boolean paramBoolean) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setPriority(paramString, paramBoolean);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetPriority'", 0);
    } 
  }
  
  public void setAttenuation(String paramString, int paramInt) {
    CommandQueue(new CommandObject(18, paramString, paramInt));
    this.commandThread.interrupt();
  }
  
  protected void message(String paramString, int paramInt) {
    this.logger.message(paramString, paramInt);
  }
  
  public SoundSystem(Class paramClass) {
    if (this.logger == null) {
      this.logger = new SoundSystemLogger();
      SoundSystemConfig.setLogger(this.logger);
    } 
    linkDefaultLibrariesAndCodecs();
    init(paramClass);
  }
  
  public void removeSource(String paramString) {
    CommandQueue(new CommandObject(33, paramString));
    this.commandThread.interrupt();
  }
  
  public void backgroundMusic(String paramString1, URL paramURL, String paramString2, boolean paramBoolean) {
    CommandQueue(new CommandObject(12, true, true, paramBoolean, paramString1, new FilenameURL(paramURL, paramString2), 0.0F, 0.0F, 0.0F, 0, 0.0F, false));
    CommandQueue(new CommandObject(24, paramString1));
    this.commandThread.interrupt();
  }
  
  public void unloadSound(String paramString) {
    CommandQueue(new CommandObject(4, paramString));
    this.commandThread.interrupt();
  }
  
  private void CommandCull(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.cull(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandCull'", 0);
    } 
  }
  
  public String quickStream(boolean paramBoolean1, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
    CommandQueue(new CommandObject(12, paramBoolean1, true, paramBoolean2, str, new FilenameURL(paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
    CommandQueue(new CommandObject(24, str));
    this.commandThread.interrupt();
    return str;
  }
  
  protected void init(Class paramClass) {
    message("", 0);
    message("Starting up " + this.className + "...", 0);
    this.randomNumberGenerator = new Random();
    this.commandQueue = new LinkedList();
    this.sourcePlayList = new LinkedList();
    this.commandThread = new CommandThread(this);
    this.commandThread.start();
    snooze(200L);
    newLibrary(paramClass);
    message("", 0);
  }
  
  private HashMap copySources(HashMap paramHashMap) {
    Set set = paramHashMap.keySet();
    Iterator<String> iterator = set.iterator();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Source source = (Source)paramHashMap.get(str);
      if (source != null)
        hashMap.put(str, new Source(source, null)); 
    } 
    return hashMap;
  }
  
  public static Class currentLibrary() {
    return currentLibrary(false, null);
  }
  
  private void CommandRewind(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.rewind(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandRewind'", 0);
    } 
  }
  
  public void fadeOutIn(String paramString1, URL paramURL, String paramString2, long paramLong1, long paramLong2) {
    CommandQueue(new CommandObject(8, paramString1, new FilenameURL(paramURL, paramString2), paramLong1, paramLong2));
    this.commandThread.interrupt();
  }
  
  private void CommandChangeDopplerFactor(float paramFloat) {
    if (this.soundLibrary != null) {
      SoundSystemConfig.setDopplerFactor(paramFloat);
      this.soundLibrary.dopplerChanged();
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetDopplerFactor'", 0);
    } 
  }
  
  public void play(String paramString) {
    CommandQueue(new CommandObject(24, paramString));
    this.commandThread.interrupt();
  }
  
  public String quickPlay(boolean paramBoolean1, URL paramURL, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
    CommandQueue(new CommandObject(12, paramBoolean1, false, paramBoolean2, str, new FilenameURL(paramURL, paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
    CommandQueue(new CommandObject(24, str));
    this.commandThread.interrupt();
    return str;
  }
  
  private void CommandMoveListener(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.soundLibrary != null) {
      this.soundLibrary.moveListener(paramFloat1, paramFloat2, paramFloat3);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandMoveListener'", 0);
    } 
  }
  
  private void CommandSetMasterVolume(float paramFloat) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setMasterVolume(paramFloat);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetMasterVolume'", 0);
    } 
  }
  
  public void dequeueSound(String paramString1, String paramString2) {
    CommandQueue(new CommandObject(6, paramString1, paramString2));
    this.commandThread.interrupt();
  }
  
  private void CommandActivate(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.activate(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandActivate'", 0);
    } 
  }
  
  private void CommandSetVelocity(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setVelocity(paramString, paramFloat1, paramFloat2, paramFloat3);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandVelocity'", 0);
    } 
  }
  
  public void cleanup() {
    boolean bool = false;
    message("", 0);
    message(this.className + " shutting down...", 0);
    try {
      this.commandThread.kill();
      this.commandThread.interrupt();
    } catch (Exception exception) {
      bool = true;
    } 
    if (!bool)
      for (byte b = 0; b < 50 && this.commandThread.alive(); b++)
        snooze(100L);  
    if (bool || this.commandThread.alive()) {
      errorMessage("Command thread did not die!", 0);
      message("Ignoring errors... continuing clean-up.", 0);
    } 
    initialized(true, false);
    currentLibrary(true, null);
    try {
      if (this.soundLibrary != null)
        this.soundLibrary.cleanup(); 
    } catch (Exception exception) {
      errorMessage("Problem during Library.cleanup()!", 0);
      message("Ignoring errors... continuing clean-up.", 0);
    } 
    try {
      if (this.commandQueue != null)
        this.commandQueue.clear(); 
    } catch (Exception exception) {
      errorMessage("Unable to clear the command queue!", 0);
      message("Ignoring errors... continuing clean-up.", 0);
    } 
    try {
      if (this.sourcePlayList != null)
        this.sourcePlayList.clear(); 
    } catch (Exception exception) {
      errorMessage("Unable to clear the source management list!", 0);
      message("Ignoring errors... continuing clean-up.", 0);
    } 
    this.randomNumberGenerator = null;
    this.soundLibrary = null;
    this.commandQueue = null;
    this.sourcePlayList = null;
    this.commandThread = null;
    importantMessage("Author: Paul Lamb, www.paulscode.com", 1);
    message("", 0);
  }
  
  public String quickStream(boolean paramBoolean1, URL paramURL, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
    CommandQueue(new CommandObject(12, paramBoolean1, true, paramBoolean2, str, new FilenameURL(paramURL, paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
    CommandQueue(new CommandObject(24, str));
    this.commandThread.interrupt();
    return str;
  }
  
  public void setDistOrRoll(String paramString, float paramFloat) {
    CommandQueue(new CommandObject(19, paramString, paramFloat));
    this.commandThread.interrupt();
  }
  
  private void CommandFlush(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.flush(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandFlush'", 0);
    } 
  }
  
  private void CommandSetDistOrRoll(String paramString, float paramFloat) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setDistOrRoll(paramString, paramFloat);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetDistOrRoll'", 0);
    } 
  }
  
  public void removeTemporarySources() {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (this.soundLibrary != null)
        this.soundLibrary.removeTemporarySources(); 
    } 
  }
  
  private void CommandSetAttenuation(String paramString, int paramInt) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setAttenuation(paramString, paramInt);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetAttenuation'", 0);
    } 
  }
  
  public void newSource(boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    CommandQueue(new CommandObject(10, paramBoolean1, false, paramBoolean2, paramString1, new FilenameURL(paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
    this.commandThread.interrupt();
  }
  
  public void setPitch(String paramString, float paramFloat) {
    CommandQueue(new CommandObject(15, paramString, paramFloat));
    this.commandThread.interrupt();
  }
  
  private void CommandSetListenerAngle(float paramFloat) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setListenerAngle(paramFloat);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetListenerAngle'", 0);
    } 
  }
  
  private void CommandSetPosition(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setPosition(paramString, paramFloat1, paramFloat2, paramFloat3);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandMoveSource'", 0);
    } 
  }
  
  public void setVolume(String paramString, float paramFloat) {
    CommandQueue(new CommandObject(14, paramString, paramFloat));
    this.commandThread.interrupt();
  }
  
  private void CommandChangeDopplerVelocity(float paramFloat) {
    if (this.soundLibrary != null) {
      SoundSystemConfig.setDopplerVelocity(paramFloat);
      this.soundLibrary.dopplerChanged();
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetDopplerFactor'", 0);
    } 
  }
  
  public void setPriority(String paramString, boolean paramBoolean) {
    CommandQueue(new CommandObject(16, paramString, paramBoolean));
    this.commandThread.interrupt();
  }
  
  protected static void snooze(long paramLong) {
    try {
      Thread.sleep(paramLong);
    } catch (InterruptedException interruptedException) {}
  }
  
  public void newStreamingSource(boolean paramBoolean1, String paramString1, URL paramURL, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    CommandQueue(new CommandObject(10, paramBoolean1, true, paramBoolean2, paramString1, new FilenameURL(paramURL, paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
    this.commandThread.interrupt();
  }
  
  public void setVelocity(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    CommandQueue(new CommandObject(22, paramString, paramFloat1, paramFloat2, paramFloat3));
    this.commandThread.interrupt();
  }
  
  protected void linkDefaultLibrariesAndCodecs() {}
  
  public float getVolume(String paramString) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (this.soundLibrary != null)
        return this.soundLibrary.getVolume(paramString); 
      return 0.0F;
    } 
  }
  
  private void CommandSetLooping(String paramString, boolean paramBoolean) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setLooping(paramString, paramBoolean);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetLooping'", 0);
    } 
  }
  
  private void CommandLoadSound(FilenameURL paramFilenameURL) {
    if (this.soundLibrary != null) {
      this.soundLibrary.loadSound(paramFilenameURL);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
    } 
  }
  
  public void newSource(boolean paramBoolean1, String paramString1, URL paramURL, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    CommandQueue(new CommandObject(10, paramBoolean1, false, paramBoolean2, paramString1, new FilenameURL(paramURL, paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
    this.commandThread.interrupt();
  }
  
  public void backgroundMusic(String paramString1, String paramString2, boolean paramBoolean) {
    CommandQueue(new CommandObject(12, true, true, paramBoolean, paramString1, new FilenameURL(paramString2), 0.0F, 0.0F, 0.0F, 0, 0.0F, false));
    CommandQueue(new CommandObject(24, paramString1));
    this.commandThread.interrupt();
  }
  
  public void rawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    CommandQueue(new CommandObject(11, paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
    this.commandThread.interrupt();
  }
  
  private void CommandNewSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    if (this.soundLibrary != null) {
      if (paramFilenameURL.getFilename().matches(SoundSystemConfig.EXTENSION_MIDI) && !SoundSystemConfig.midiCodec()) {
        this.soundLibrary.loadMidi(paramBoolean3, paramString, paramFilenameURL);
      } else {
        this.soundLibrary.newSource(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4);
      } 
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandNewSource'", 0);
    } 
  }
  
  public boolean newLibrary(Class paramClass) {
    initialized(true, false);
    CommandQueue(new CommandObject(40, paramClass));
    this.commandThread.interrupt();
    for (byte b = 0; !initialized(false, false) && b < 100; b++) {
      snooze(400L);
      this.commandThread.interrupt();
    } 
    if (!initialized(false, false)) {
      SoundSystemException soundSystemException1 = new SoundSystemException(this.className + " did not load after 30 seconds.", 4);
      lastException(true, soundSystemException1);
      throw soundSystemException1;
    } 
    SoundSystemException soundSystemException = lastException(false, null);
    if (soundSystemException != null)
      throw soundSystemException; 
    return true;
  }
  
  private void CommandStop(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.stop(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandStop'", 0);
    } 
  }
  
  public static void setException(SoundSystemException paramSoundSystemException) {
    lastException(true, paramSoundSystemException);
  }
  
  private void CommandQuickPlay(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    if (this.soundLibrary != null) {
      if (paramFilenameURL.getFilename().matches(SoundSystemConfig.EXTENSION_MIDI) && !SoundSystemConfig.midiCodec()) {
        this.soundLibrary.loadMidi(paramBoolean3, paramString, paramFilenameURL);
      } else {
        this.soundLibrary.quickPlay(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4);
      } 
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandQuickPlay'", 0);
    } 
  }
  
  private void CommandSetListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setListenerOrientation(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetListenerOrientation'", 0);
    } 
  }
  
  private static Class currentLibrary(boolean paramBoolean, Class paramClass) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (paramBoolean == true)
        currentLibrary = paramClass; 
      return currentLibrary;
    } 
  }
  
  public void changeDopplerVelocity(float paramFloat) {
    CommandQueue(new CommandObject(21, paramFloat));
    this.commandThread.interrupt();
  }
  
  protected void errorMessage(String paramString, int paramInt) {
    this.logger.errorMessage(this.className, paramString, paramInt);
  }
  
  private void CommandFadeOut(String paramString, FilenameURL paramFilenameURL, long paramLong) {
    if (this.soundLibrary != null) {
      this.soundLibrary.fadeOut(paramString, paramFilenameURL, paramLong);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandFadeOut'", 0);
    } 
  }
  
  public void flush(String paramString) {
    CommandQueue(new CommandObject(29, paramString));
    this.commandThread.interrupt();
  }
  
  public void fadeOut(String paramString1, String paramString2, long paramLong) {
    FilenameURL filenameURL = null;
    if (paramString2 != null)
      filenameURL = new FilenameURL(paramString2); 
    CommandQueue(new CommandObject(7, paramString1, filenameURL, paramLong));
    this.commandThread.interrupt();
  }
  
  public void pause(String paramString) {
    CommandQueue(new CommandObject(26, paramString));
    this.commandThread.interrupt();
  }
  
  private void CommandSetPitch(String paramString, float paramFloat) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setPitch(paramString, paramFloat);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetPitch'", 0);
    } 
  }
  
  public void setMasterVolume(float paramFloat) {
    CommandQueue(new CommandObject(39, paramFloat));
    this.commandThread.interrupt();
  }
  
  public float getMasterVolume() {
    return SoundSystemConfig.getMasterGain();
  }
  
  public void fadeOut(String paramString1, URL paramURL, String paramString2, long paramLong) {
    FilenameURL filenameURL = null;
    if (paramURL != null && paramString2 != null)
      filenameURL = new FilenameURL(paramURL, paramString2); 
    CommandQueue(new CommandObject(7, paramString1, filenameURL, paramLong));
    this.commandThread.interrupt();
  }
  
  static {
    GET = false;
    SET = true;
    currentLibrary = null;
    initialized = false;
    lastException = null;
  }
  
  public static SoundSystemException getLastException() {
    return lastException(false, null);
  }
  
  public void newStreamingSource(boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    CommandQueue(new CommandObject(10, paramBoolean1, true, paramBoolean2, paramString1, new FilenameURL(paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
    this.commandThread.interrupt();
  }
  
  public boolean CommandQueue(CommandObject paramCommandObject) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (paramCommandObject == null) {
        boolean bool = false;
        while (this.commandQueue != null && this.commandQueue.size() > 0) {
          CommandObject commandObject = this.commandQueue.remove(0);
          if (commandObject != null)
            switch (commandObject.Command) {
              case 1:
                CommandInitialize();
              case 2:
                CommandLoadSound((FilenameURL)commandObject.objectArgs[0]);
              case 3:
                CommandLoadSound((SoundBuffer)commandObject.objectArgs[0], commandObject.stringArgs[0]);
              case 4:
                CommandUnloadSound(commandObject.stringArgs[0]);
              case 5:
                CommandQueueSound(commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0]);
              case 6:
                CommandDequeueSound(commandObject.stringArgs[0], commandObject.stringArgs[1]);
              case 7:
                CommandFadeOut(commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.longArgs[0]);
              case 8:
                CommandFadeOutIn(commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.longArgs[0], commandObject.longArgs[1]);
              case 9:
                CommandCheckFadeVolumes();
              case 10:
                CommandNewSource(commandObject.boolArgs[0], commandObject.boolArgs[1], commandObject.boolArgs[2], commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.intArgs[0], commandObject.floatArgs[3]);
              case 11:
                CommandRawDataStream((AudioFormat)commandObject.objectArgs[0], commandObject.boolArgs[0], commandObject.stringArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.intArgs[0], commandObject.floatArgs[3]);
              case 12:
                CommandQuickPlay(commandObject.boolArgs[0], commandObject.boolArgs[1], commandObject.boolArgs[2], commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.intArgs[0], commandObject.floatArgs[3], commandObject.boolArgs[3]);
              case 13:
                CommandSetPosition(commandObject.stringArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
              case 14:
                CommandSetVolume(commandObject.stringArgs[0], commandObject.floatArgs[0]);
              case 15:
                CommandSetPitch(commandObject.stringArgs[0], commandObject.floatArgs[0]);
              case 16:
                CommandSetPriority(commandObject.stringArgs[0], commandObject.boolArgs[0]);
              case 17:
                CommandSetLooping(commandObject.stringArgs[0], commandObject.boolArgs[0]);
              case 18:
                CommandSetAttenuation(commandObject.stringArgs[0], commandObject.intArgs[0]);
              case 19:
                CommandSetDistOrRoll(commandObject.stringArgs[0], commandObject.floatArgs[0]);
              case 20:
                CommandChangeDopplerFactor(commandObject.floatArgs[0]);
              case 21:
                CommandChangeDopplerVelocity(commandObject.floatArgs[0]);
              case 22:
                CommandSetVelocity(commandObject.stringArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
              case 23:
                CommandSetListenerVelocity(commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
              case 24:
                this.sourcePlayList.add(commandObject);
              case 25:
                this.sourcePlayList.add(commandObject);
              case 26:
                CommandPause(commandObject.stringArgs[0]);
              case 27:
                CommandStop(commandObject.stringArgs[0]);
              case 28:
                CommandRewind(commandObject.stringArgs[0]);
              case 29:
                CommandFlush(commandObject.stringArgs[0]);
              case 30:
                CommandCull(commandObject.stringArgs[0]);
              case 31:
                bool = true;
                CommandActivate(commandObject.stringArgs[0]);
              case 32:
                CommandSetTemporary(commandObject.stringArgs[0], commandObject.boolArgs[0]);
              case 33:
                CommandRemoveSource(commandObject.stringArgs[0]);
              case 34:
                CommandMoveListener(commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
              case 35:
                CommandSetListenerPosition(commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
              case 36:
                CommandTurnListener(commandObject.floatArgs[0]);
              case 37:
                CommandSetListenerAngle(commandObject.floatArgs[0]);
              case 38:
                CommandSetListenerOrientation(commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.floatArgs[3], commandObject.floatArgs[4], commandObject.floatArgs[5]);
              case 39:
                CommandSetMasterVolume(commandObject.floatArgs[0]);
              case 40:
                CommandNewLibrary(commandObject.classArgs[0]);
            }  
        } 
        if (bool)
          this.soundLibrary.replaySources(); 
        while (this.sourcePlayList != null && this.sourcePlayList.size() > 0) {
          CommandObject commandObject = this.sourcePlayList.remove(0);
          if (commandObject != null)
            switch (commandObject.Command) {
              case 24:
                CommandPlay(commandObject.stringArgs[0]);
              case 25:
                CommandFeedRawAudioData(commandObject.stringArgs[0], commandObject.buffer);
            }  
        } 
        return (this.commandQueue != null && this.commandQueue.size() > 0);
      } 
      if (this.commandQueue == null)
        return false; 
      this.commandQueue.add(paramCommandObject);
      return true;
    } 
  }
  
  private void CommandCheckFadeVolumes() {
    if (this.soundLibrary != null) {
      this.soundLibrary.checkFadeVolumes();
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandCheckFadeVolumes'", 0);
    } 
  }
  
  private void CommandSetVolume(String paramString, float paramFloat) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setVolume(paramString, paramFloat);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetVolume'", 0);
    } 
  }
  
  public void rewind(String paramString) {
    CommandQueue(new CommandObject(28, paramString));
    this.commandThread.interrupt();
  }
  
  private static SoundSystemException lastException(boolean paramBoolean, SoundSystemException paramSoundSystemException) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (paramBoolean == true)
        lastException = paramSoundSystemException; 
      return lastException;
    } 
  }
  
  protected void ManageSources() {}
  
  public void queueSound(String paramString1, String paramString2) {
    CommandQueue(new CommandObject(5, paramString1, new FilenameURL(paramString2)));
    this.commandThread.interrupt();
  }
  
  public static boolean initialized() {
    return initialized(false, false);
  }
  
  private void CommandRawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    if (this.soundLibrary != null) {
      this.soundLibrary.rawDataStream(paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandRawDataStream'", 0);
    } 
  }
  
  public void loadSound(URL paramURL, String paramString) {
    CommandQueue(new CommandObject(2, new FilenameURL(paramURL, paramString)));
    this.commandThread.interrupt();
  }
  
  public void setListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
    CommandQueue(new CommandObject(35, paramFloat1, paramFloat2, paramFloat3));
    this.commandThread.interrupt();
  }
  
  public void checkFadeVolumes() {
    CommandQueue(new CommandObject(9));
    this.commandThread.interrupt();
  }
  
  private void CommandSetTemporary(String paramString, boolean paramBoolean) {
    if (this.soundLibrary != null) {
      this.soundLibrary.setTemporary(paramString, paramBoolean);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandSetActive'", 0);
    } 
  }
  
  private void CommandPlay(String paramString) {
    if (this.soundLibrary != null) {
      this.soundLibrary.play(paramString);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandPlay'", 0);
    } 
  }
  
  private void CommandDequeueSound(String paramString1, String paramString2) {
    if (this.soundLibrary != null) {
      this.soundLibrary.dequeueSound(paramString1, paramString2);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandDequeueSound'", 0);
    } 
  }
  
  public boolean playing() {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (this.soundLibrary == null)
        return false; 
      HashMap hashMap = this.soundLibrary.getSources();
      if (hashMap == null)
        return false; 
      Set set = hashMap.keySet();
      for (String str : set) {
        Source source = (Source)hashMap.get(str);
        if (source != null && source.playing())
          return true; 
      } 
      return false;
    } 
  }
  
  public void moveListener(float paramFloat1, float paramFloat2, float paramFloat3) {
    CommandQueue(new CommandObject(34, paramFloat1, paramFloat2, paramFloat3));
    this.commandThread.interrupt();
  }
  
  protected boolean errorCheck(boolean paramBoolean, String paramString, int paramInt) {
    return this.logger.errorCheck(paramBoolean, this.className, paramString, paramInt);
  }
  
  private void CommandQueueSound(String paramString, FilenameURL paramFilenameURL) {
    if (this.soundLibrary != null) {
      this.soundLibrary.queueSound(paramString, paramFilenameURL);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandQueueSound'", 0);
    } 
  }
  
  public void interruptCommandThread() {
    if (this.commandThread == null) {
      errorMessage("Command Thread null in method 'interruptCommandThread'", 0);
      return;
    } 
    this.commandThread.interrupt();
  }
  
  public void fadeOutIn(String paramString1, String paramString2, long paramLong1, long paramLong2) {
    CommandQueue(new CommandObject(8, paramString1, new FilenameURL(paramString2), paramLong1, paramLong2));
    this.commandThread.interrupt();
  }
  
  public boolean playing(String paramString) {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      if (this.soundLibrary == null)
        return false; 
      Source source = (Source)this.soundLibrary.getSources().get(paramString);
      if (source == null)
        return false; 
      return source.playing();
    } 
  }
  
  public ListenerData getListenerData() {
    synchronized (SoundSystemConfig.THREAD_SYNC) {
      return this.soundLibrary.getListenerData();
    } 
  }
  
  private void CommandFadeOutIn(String paramString, FilenameURL paramFilenameURL, long paramLong1, long paramLong2) {
    if (this.soundLibrary != null) {
      this.soundLibrary.fadeOutIn(paramString, paramFilenameURL, paramLong1, paramLong2);
    } else {
      errorMessage("Variable 'soundLibrary' null in method 'CommandFadeOutIn'", 0);
    } 
  }
  
  private void CommandNewLibrary(Class<Library> paramClass) {
    initialized(true, false);
    String str = "Initializing ";
    if (this.soundLibrary != null) {
      currentLibrary(true, null);
      str = "Switching to ";
      this.soundLibrary.cleanup();
      this.soundLibrary = null;
    } 
    message(str + SoundSystemConfig.getLibraryTitle(paramClass), 0);
    message("(" + SoundSystemConfig.getLibraryDescription(paramClass) + ")", 1);
    try {
      this.soundLibrary = paramClass.newInstance();
    } catch (InstantiationException instantiationException) {
      errorMessage("The specified library did not load properly", 1);
    } catch (IllegalAccessException illegalAccessException) {
      errorMessage("The specified library did not load properly", 1);
    } catch (ExceptionInInitializerError exceptionInInitializerError) {
      errorMessage("The specified library did not load properly", 1);
    } catch (SecurityException securityException) {
      errorMessage("The specified library did not load properly", 1);
    } 
    if (errorCheck((this.soundLibrary == null), "Library null after initialization in method 'newLibrary'", 1)) {
      lastException(true, new SoundSystemException(this.className + " did not load properly.  " + "Library was null after initialization.", 4));
      importantMessage("Switching to silent mode", 1);
      try {
        this.soundLibrary = new Library();
      } catch (SoundSystemException soundSystemException) {
        lastException(true, new SoundSystemException("Silent mode did not load properly.  Library was null after initialization.", 4));
        initialized(true, true);
        return;
      } 
    } 
    try {
      this.soundLibrary.init();
    } catch (SoundSystemException soundSystemException) {
      lastException(true, soundSystemException);
      initialized(true, true);
      return;
    } 
    lastException(true, null);
    initialized(true, true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SoundSystem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */