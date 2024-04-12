package paulscode.sound;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.sound.sampled.AudioFormat;

public class Library {
  protected ListenerData listener;
  
  protected boolean reverseByteOrder = false;
  
  protected List normalChannels;
  
  private SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  private String[] normalChannelSourceNames;
  
  private int nextNormalChannel = 0;
  
  private int nextStreamingChannel = 0;
  
  protected HashMap bufferMap = null;
  
  private MidiChannel midiChannel;
  
  protected List streamingChannels;
  
  protected HashMap sourceMap;
  
  private String[] streamingChannelSourceNames;
  
  protected StreamThread streamThread;
  
  public void cleanup() {
    this.streamThread.kill();
    this.streamThread.interrupt();
    for (byte b = 0; b < 50 && this.streamThread.alive(); b++) {
      try {
        Thread.sleep(100L);
      } catch (Exception exception) {}
    } 
    if (this.streamThread.alive()) {
      errorMessage("Stream thread did not die!");
      message("Ignoring errors... continuing clean-up.");
    } 
    if (this.midiChannel != null) {
      this.midiChannel.cleanup();
      this.midiChannel = null;
    } 
    Channel channel = null;
    if (this.streamingChannels != null) {
      while (!this.streamingChannels.isEmpty()) {
        channel = this.streamingChannels.remove(0);
        channel.close();
        channel.cleanup();
        channel = null;
      } 
      this.streamingChannels.clear();
      this.streamingChannels = null;
    } 
    if (this.normalChannels != null) {
      while (!this.normalChannels.isEmpty()) {
        channel = this.normalChannels.remove(0);
        channel.close();
        channel.cleanup();
        channel = null;
      } 
      this.normalChannels.clear();
      this.normalChannels = null;
    } 
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null)
        source.cleanup(); 
    } 
    this.sourceMap.clear();
    this.sourceMap = null;
    this.listener = null;
    this.streamThread = null;
  }
  
  public void setDistOrRoll(String paramString, float paramFloat) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.setDistOrRoll(paramFloat); 
  }
  
  private Channel getNextChannel(Source paramSource) {
    int j;
    List<Channel> list;
    String[] arrayOfString;
    if (paramSource == null)
      return null; 
    String str = paramSource.sourcename;
    if (str == null)
      return null; 
    if (paramSource.toStream) {
      j = this.nextStreamingChannel;
      list = this.streamingChannels;
      arrayOfString = this.streamingChannelSourceNames;
    } else {
      j = this.nextNormalChannel;
      list = this.normalChannels;
      arrayOfString = this.normalChannelSourceNames;
    } 
    int i = list.size();
    byte b;
    for (b = 0; b < i; b++) {
      if (str.equals(arrayOfString[b]))
        return list.get(b); 
    } 
    int k = j;
    for (b = 0; b < i; b++) {
      Source source;
      String str1 = arrayOfString[k];
      if (str1 == null) {
        source = null;
      } else {
        source = (Source)this.sourceMap.get(str1);
      } 
      if (source == null || !source.playing()) {
        if (paramSource.toStream) {
          this.nextStreamingChannel = k + 1;
          if (this.nextStreamingChannel >= i)
            this.nextStreamingChannel = 0; 
        } else {
          this.nextNormalChannel = k + 1;
          if (this.nextNormalChannel >= i)
            this.nextNormalChannel = 0; 
        } 
        arrayOfString[k] = str;
        return list.get(k);
      } 
      if (++k >= i)
        k = 0; 
    } 
    k = j;
    for (b = 0; b < i; b++) {
      Source source;
      String str1 = arrayOfString[k];
      if (str1 == null) {
        source = null;
      } else {
        source = (Source)this.sourceMap.get(str1);
      } 
      if (source == null || !source.playing() || !source.priority) {
        if (paramSource.toStream) {
          this.nextStreamingChannel = k + 1;
          if (this.nextStreamingChannel >= i)
            this.nextStreamingChannel = 0; 
        } else {
          this.nextNormalChannel = k + 1;
          if (this.nextNormalChannel >= i)
            this.nextNormalChannel = 0; 
        } 
        arrayOfString[k] = str;
        return list.get(k);
      } 
      if (++k >= i)
        k = 0; 
    } 
    return null;
  }
  
  public void activate(String paramString) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null) {
      source.activate();
      if (source.toPlay)
        play(source); 
    } 
  }
  
  public boolean loadSound(SoundBuffer paramSoundBuffer, String paramString) {
    return true;
  }
  
  public void unloadMidi() {
    if (this.midiChannel != null)
      this.midiChannel.cleanup(); 
    this.midiChannel = null;
  }
  
  public void replaySources() {
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null && source.toPlay && !source.playing()) {
        play(str);
        source.toPlay = false;
      } 
    } 
  }
  
  public boolean midiSourcename(String paramString) {
    return (this.midiChannel == null || paramString == null) ? false : ((this.midiChannel.getSourcename() == null || paramString.equals("")) ? false : (paramString.equals(this.midiChannel.getSourcename())));
  }
  
  public void removeSource(String paramString) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.cleanup(); 
    this.sourceMap.remove(paramString);
  }
  
  public void stop(String paramString) {
    if (paramString == null || paramString.equals("")) {
      errorMessage("Sourcename not specified in method 'stop'");
      return;
    } 
    if (midiSourcename(paramString)) {
      this.midiChannel.stop();
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        source.stop(); 
    } 
  }
  
  public void dopplerChanged() {}
  
  public void setPosition(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.setPosition(paramFloat1, paramFloat2, paramFloat3); 
  }
  
  public boolean loadSound(FilenameURL paramFilenameURL) {
    return true;
  }
  
  public void loadMidi(boolean paramBoolean, String paramString, FilenameURL paramFilenameURL) {
    if (paramFilenameURL == null) {
      errorMessage("Filename/URL not specified in method 'loadMidi'.");
      return;
    } 
    if (!paramFilenameURL.getFilename().matches(SoundSystemConfig.EXTENSION_MIDI)) {
      errorMessage("Filename/identifier doesn't end in '.mid' or'.midi' in method loadMidi.");
      return;
    } 
    if (this.midiChannel == null) {
      this.midiChannel = new MidiChannel(paramBoolean, paramString, paramFilenameURL);
    } else {
      this.midiChannel.switchSource(paramBoolean, paramString, paramFilenameURL);
    } 
  }
  
  public Library() {
    this.bufferMap = new HashMap<Object, Object>();
    this.sourceMap = new HashMap<Object, Object>();
    this.listener = new ListenerData(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F);
    this.streamingChannels = new LinkedList();
    this.normalChannels = new LinkedList();
    this.streamingChannelSourceNames = new String[SoundSystemConfig.getNumberStreamingChannels()];
    this.normalChannelSourceNames = new String[SoundSystemConfig.getNumberNormalChannels()];
    this.streamThread = new StreamThread();
    this.streamThread.start();
  }
  
  public LinkedList getAllSourcenames() {
    LinkedList<String> linkedList = new LinkedList();
    Set set = this.sourceMap.keySet();
    Iterator<String> iterator = set.iterator();
    if (this.midiChannel != null)
      linkedList.add(this.midiChannel.getSourcename()); 
    while (iterator.hasNext())
      linkedList.add(iterator.next()); 
    return linkedList;
  }
  
  public MidiChannel getMidiChannel() {
    return this.midiChannel;
  }
  
  protected void message(String paramString) {
    this.logger.message(paramString, 0);
  }
  
  public void rawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    this.sourceMap.put(paramString, new Source(paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
  }
  
  public void setListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.listener.setPosition(paramFloat1, paramFloat2, paramFloat3);
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null)
        source.positionChanged(); 
    } 
  }
  
  public float millisecondsPlayed(String paramString) {
    if (paramString == null || paramString.equals("")) {
      errorMessage("Sourcename not specified in method 'millisecondsPlayed'");
      return -1.0F;
    } 
    if (midiSourcename(paramString)) {
      errorMessage("Unable to calculate milliseconds for MIDI source.");
      return -1.0F;
    } 
    Source source = (Source)this.sourceMap.get(paramString);
    if (source == null)
      errorMessage("Source '" + paramString + "' not found in " + "method 'millisecondsPlayed'"); 
    return source.millisecondsPlayed();
  }
  
  public void setVolume(String paramString, float paramFloat) {
    if (midiSourcename(paramString)) {
      this.midiChannel.setVolume(paramFloat);
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null) {
        float f = paramFloat;
        if (f < 0.0F) {
          f = 0.0F;
        } else if (f > 1.0F) {
          f = 1.0F;
        } 
        source.sourceVolume = f;
        source.positionChanged();
      } 
    } 
  }
  
  public void setAttenuation(String paramString, int paramInt) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.setAttenuation(paramInt); 
  }
  
  public void flush(String paramString) {
    if (midiSourcename(paramString)) {
      errorMessage("You can not flush the MIDI channel");
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        source.flush(); 
    } 
  }
  
  public void setMidiChannel(MidiChannel paramMidiChannel) {
    if (this.midiChannel != null && this.midiChannel != paramMidiChannel)
      this.midiChannel.cleanup(); 
    this.midiChannel = paramMidiChannel;
  }
  
  public LinkedList getAllLoadedFilenames() {
    LinkedList linkedList = new LinkedList();
    Set set = this.bufferMap.keySet();
    Iterator iterator = set.iterator();
    while (iterator.hasNext())
      linkedList.add(iterator.next()); 
    return linkedList;
  }
  
  public void newSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    this.sourceMap.put(paramString, new Source(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, null, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, false));
  }
  
  public static boolean libraryCompatible() {
    return true;
  }
  
  public void setLooping(String paramString, boolean paramBoolean) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.setLooping(paramBoolean); 
  }
  
  public static String getDescription() {
    return "Silent Mode";
  }
  
  public void setMasterVolume(float paramFloat) {
    SoundSystemConfig.setMasterGain(paramFloat);
    if (this.midiChannel != null)
      this.midiChannel.resetGain(); 
  }
  
  protected void errorMessage(String paramString) {
    this.logger.errorMessage(getClassName(), paramString, 0);
  }
  
  public void unloadSound(String paramString) {
    this.bufferMap.remove(paramString);
  }
  
  public void play(Source paramSource) {
    if (paramSource == null)
      return; 
    if (paramSource.rawDataStream)
      return; 
    if (!paramSource.active())
      return; 
    if (!paramSource.playing()) {
      Channel channel = getNextChannel(paramSource);
      if (paramSource != null && channel != null) {
        if (paramSource.channel != null && paramSource.channel.attachedSource != paramSource)
          paramSource.channel = null; 
        channel.attachedSource = paramSource;
        paramSource.play(channel);
        if (paramSource.toStream) {
          this.streamThread.watch(paramSource);
          this.streamThread.interrupt();
        } 
      } 
    } 
  }
  
  public String getClassName() {
    return "Library";
  }
  
  public void fadeOutIn(String paramString, FilenameURL paramFilenameURL, long paramLong1, long paramLong2) {
    if (midiSourcename(paramString)) {
      this.midiChannel.fadeOutIn(paramFilenameURL, paramLong1, paramLong2);
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        source.fadeOutIn(paramFilenameURL, paramLong1, paramLong2); 
    } 
  }
  
  public ListenerData getListenerData() {
    return this.listener;
  }
  
  public HashMap getSources() {
    return this.sourceMap;
  }
  
  public void setPriority(String paramString, boolean paramBoolean) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.setPriority(paramBoolean); 
  }
  
  public void pause(String paramString) {
    if (paramString == null || paramString.equals("")) {
      errorMessage("Sourcename not specified in method 'stop'");
      return;
    } 
    if (midiSourcename(paramString)) {
      this.midiChannel.pause();
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        source.pause(); 
    } 
  }
  
  public void setListenerData(ListenerData paramListenerData) {
    this.listener.setData(paramListenerData);
  }
  
  public void rewind(String paramString) {
    if (midiSourcename(paramString)) {
      this.midiChannel.rewind();
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        source.rewind(); 
    } 
  }
  
  public void cull(String paramString) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.cull(); 
  }
  
  public void listenerMoved() {
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null)
        source.listenerMoved(); 
    } 
  }
  
  public void setPitch(String paramString, float paramFloat) {
    if (!midiSourcename(paramString)) {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null) {
        float f = paramFloat;
        if (f < 0.5F) {
          f = 0.5F;
        } else if (f > 2.0F) {
          f = 2.0F;
        } 
        source.setPitch(f);
        source.positionChanged();
      } 
    } 
  }
  
  public void queueSound(String paramString, FilenameURL paramFilenameURL) {
    if (midiSourcename(paramString)) {
      this.midiChannel.queueSound(paramFilenameURL);
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        source.queueSound(paramFilenameURL); 
    } 
  }
  
  public void setVelocity(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.setVelocity(paramFloat1, paramFloat2, paramFloat3); 
  }
  
  public void dequeueSound(String paramString1, String paramString2) {
    if (midiSourcename(paramString1)) {
      this.midiChannel.dequeueSound(paramString2);
    } else {
      Source source = (Source)this.sourceMap.get(paramString1);
      if (source != null)
        source.dequeueSound(paramString2); 
    } 
  }
  
  public void moveListener(float paramFloat1, float paramFloat2, float paramFloat3) {
    setListenerPosition(this.listener.position.x + paramFloat1, this.listener.position.y + paramFloat2, this.listener.position.z + paramFloat3);
  }
  
  public static String getTitle() {
    return "No Sound";
  }
  
  public void setListenerVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.listener.setVelocity(paramFloat1, paramFloat2, paramFloat3);
  }
  
  public float getVolume(String paramString) {
    if (midiSourcename(paramString))
      return this.midiChannel.getVolume(); 
    Source source = (Source)this.sourceMap.get(paramString);
    return (source != null) ? source.sourceVolume : 0.0F;
  }
  
  public float getPitch(String paramString) {
    if (!midiSourcename(paramString)) {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        return source.getPitch(); 
    } 
    return 1.0F;
  }
  
  protected Channel createChannel(int paramInt) {
    return new Channel(paramInt);
  }
  
  protected void printStackTrace(Exception paramException) {
    this.logger.printStackTrace(paramException, 1);
  }
  
  public void turnListener(float paramFloat) {
    setListenerAngle(this.listener.angle + paramFloat);
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null)
        source.positionChanged(); 
    } 
  }
  
  public int feedRawAudioData(Source paramSource, byte[] paramArrayOfbyte) {
    if (paramSource == null) {
      errorMessage("Source parameter null in method 'feedRawAudioData'");
      return -1;
    } 
    if (!paramSource.toStream) {
      errorMessage("Only a streaming source may be specified in method 'feedRawAudioData'");
      return -1;
    } 
    if (!paramSource.rawDataStream) {
      errorMessage("Streaming source already associated with a file or URL in method'feedRawAudioData'");
      return -1;
    } 
    if (!paramSource.playing() || paramSource.channel == null) {
      Channel channel;
      if (paramSource.channel != null && paramSource.channel.attachedSource == paramSource) {
        channel = paramSource.channel;
      } else {
        channel = getNextChannel(paramSource);
      } 
      int i = paramSource.feedRawAudioData(channel, paramArrayOfbyte);
      channel.attachedSource = paramSource;
      this.streamThread.watch(paramSource);
      this.streamThread.interrupt();
      return i;
    } 
    return paramSource.feedRawAudioData(paramSource.channel, paramArrayOfbyte);
  }
  
  protected void importantMessage(String paramString) {
    this.logger.importantMessage(paramString, 0);
  }
  
  public void play(String paramString) {
    if (paramString == null || paramString.equals("")) {
      errorMessage("Sourcename not specified in method 'play'");
      return;
    } 
    if (midiSourcename(paramString)) {
      this.midiChannel.play();
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source == null)
        errorMessage("Source '" + paramString + "' not found in " + "method 'play'"); 
      play(source);
    } 
  }
  
  public void removeTemporarySources() {
    Set set = this.sourceMap.keySet();
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Source source = (Source)this.sourceMap.get(str);
      if (source != null && source.temporary && !source.playing()) {
        source.cleanup();
        iterator.remove();
      } 
    } 
  }
  
  public void quickPlay(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    this.sourceMap.put(paramString, new Source(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, null, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4));
  }
  
  public void setListenerAngle(float paramFloat) {
    this.listener.setAngle(paramFloat);
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null)
        source.positionChanged(); 
    } 
  }
  
  public int feedRawAudioData(String paramString, byte[] paramArrayOfbyte) {
    if (paramString == null || paramString.equals("")) {
      errorMessage("Sourcename not specified in method 'feedRawAudioData'");
      return -1;
    } 
    if (midiSourcename(paramString)) {
      errorMessage("Raw audio data can not be fed to the MIDI channel.");
      return -1;
    } 
    Source source = (Source)this.sourceMap.get(paramString);
    if (source == null)
      errorMessage("Source '" + paramString + "' not found in " + "method 'feedRawAudioData'"); 
    return feedRawAudioData(source, paramArrayOfbyte);
  }
  
  public void fadeOut(String paramString, FilenameURL paramFilenameURL, long paramLong) {
    if (midiSourcename(paramString)) {
      this.midiChannel.fadeOut(paramFilenameURL, paramLong);
    } else {
      Source source = (Source)this.sourceMap.get(paramString);
      if (source != null)
        source.fadeOut(paramFilenameURL, paramLong); 
    } 
  }
  
  public void init() {
    Channel channel = null;
    byte b;
    for (b = 0; b < SoundSystemConfig.getNumberStreamingChannels(); b++) {
      channel = createChannel(1);
      if (channel == null)
        break; 
      this.streamingChannels.add(channel);
    } 
    for (b = 0; b < SoundSystemConfig.getNumberNormalChannels(); b++) {
      channel = createChannel(0);
      if (channel == null)
        break; 
      this.normalChannels.add(channel);
    } 
  }
  
  public void setListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    this.listener.setOrientation(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    Set set = this.sourceMap.keySet();
    for (String str : set) {
      Source source = (Source)this.sourceMap.get(str);
      if (source != null)
        source.positionChanged(); 
    } 
  }
  
  public boolean reverseByteOrder() {
    return this.reverseByteOrder;
  }
  
  public Source getSource(String paramString) {
    return (Source)this.sourceMap.get(paramString);
  }
  
  protected boolean errorCheck(boolean paramBoolean, String paramString) {
    return this.logger.errorCheck(paramBoolean, getClassName(), paramString, 0);
  }
  
  public void checkFadeVolumes() {
    if (this.midiChannel != null)
      this.midiChannel.resetGain(); 
    for (byte b = 0; b < this.streamingChannels.size(); b++) {
      Channel channel = this.streamingChannels.get(b);
      if (channel != null) {
        Source source = channel.attachedSource;
        if (source != null)
          source.checkFadeOut(); 
      } 
    } 
    Object object1 = null;
    Object object2 = null;
  }
  
  public void copySources(HashMap paramHashMap) {
    if (paramHashMap == null)
      return; 
    Set set = paramHashMap.keySet();
    Iterator<String> iterator = set.iterator();
    this.sourceMap.clear();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Source source = (Source)paramHashMap.get(str);
      if (source != null) {
        loadSound(source.filenameURL);
        this.sourceMap.put(str, new Source(source, null));
      } 
    } 
  }
  
  public void setTemporary(String paramString, boolean paramBoolean) {
    Source source = (Source)this.sourceMap.get(paramString);
    if (source != null)
      source.setTemporary(paramBoolean); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\Library.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */