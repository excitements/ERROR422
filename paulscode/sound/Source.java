package paulscode.sound;

import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.sound.sampled.AudioFormat;

public class Source {
  protected ICodec nextCodec = null;
  
  public int attModel = 0;
  
  public Channel channel = null;
  
  public boolean toPlay = false;
  
  protected LinkedList soundSequenceQueue = null;
  
  protected long lastFadeCheck = 0L;
  
  private boolean paused = false;
  
  protected float pitch = 1.0F;
  
  public AudioFormat rawDataFormat = null;
  
  public SoundBuffer soundBuffer = null;
  
  public float sourceVolume = 1.0F;
  
  private boolean active = true;
  
  protected ICodec codec = null;
  
  private boolean stopped = true;
  
  public boolean toLoop = false;
  
  public boolean toStream = false;
  
  protected float fadeInGain = 1.0F;
  
  protected float fadeOutGain = -1.0F;
  
  private static final boolean GET;
  
  protected Class libraryType = Library.class;
  
  protected long fadeInMilis = 0L;
  
  protected LinkedList nextBuffers = null;
  
  private static final boolean SET;
  
  private static final boolean XXX = false;
  
  protected final Object soundSequenceLock = new Object();
  
  public boolean rawDataStream = false;
  
  public boolean preLoad = false;
  
  public float distOrRoll = 0.0F;
  
  public Vector3D position;
  
  public float gain = 1.0F;
  
  public float distanceFromListener = 0.0F;
  
  public FilenameURL filenameURL = null;
  
  public String sourcename = "";
  
  public boolean temporary = false;
  
  protected long fadeOutMilis = 0L;
  
  public Vector3D velocity;
  
  public boolean priority = false;
  
  private SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  public boolean reverseByteOrder() {
    return SoundSystemConfig.reverseByteOrder(this.libraryType);
  }
  
  public int feedRawAudioData(Channel paramChannel, byte[] paramArrayOfbyte) {
    if (!active(false, false)) {
      this.toPlay = true;
      return -1;
    } 
    if (this.channel != paramChannel) {
      this.channel = paramChannel;
      this.channel.close();
      this.channel.setAudioFormat(this.rawDataFormat);
      positionChanged();
    } 
    stopped(true, false);
    paused(true, false);
    return this.channel.feedRawAudioData(paramArrayOfbyte);
  }
  
  public Source(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    this.priority = paramBoolean1;
    this.toStream = paramBoolean2;
    this.toLoop = paramBoolean3;
    this.sourcename = paramString;
    this.filenameURL = paramFilenameURL;
    this.soundBuffer = paramSoundBuffer;
    this.position = new Vector3D(paramFloat1, paramFloat2, paramFloat3);
    this.attModel = paramInt;
    this.distOrRoll = paramFloat4;
    this.velocity = new Vector3D(0.0F, 0.0F, 0.0F);
    this.temporary = paramBoolean4;
    if (paramBoolean2 && paramFilenameURL != null)
      this.codec = SoundSystemConfig.getCodec(paramFilenameURL.getFilename()); 
  }
  
  public void setVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.velocity.x = paramFloat1;
    this.velocity.y = paramFloat2;
    this.velocity.z = paramFloat3;
  }
  
  private synchronized boolean active(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.active = paramBoolean2; 
    return this.active;
  }
  
  public void setPitch(float paramFloat) {
    float f = paramFloat;
    if (f < 0.5F) {
      f = 0.5F;
    } else if (f > 2.0F) {
      f = 2.0F;
    } 
    this.pitch = f;
  }
  
  protected void importantMessage(String paramString) {
    this.logger.importantMessage(paramString, 0);
  }
  
  public boolean paused() {
    return paused(false, false);
  }
  
  protected void printStackTrace(Exception paramException) {
    this.logger.printStackTrace(paramException, 1);
  }
  
  public void setPriority(boolean paramBoolean) {
    this.priority = paramBoolean;
  }
  
  public Source(Source paramSource, SoundBuffer paramSoundBuffer) {
    this.priority = paramSource.priority;
    this.toStream = paramSource.toStream;
    this.toLoop = paramSource.toLoop;
    this.sourcename = paramSource.sourcename;
    this.filenameURL = paramSource.filenameURL;
    this.position = paramSource.position.clone();
    this.attModel = paramSource.attModel;
    this.distOrRoll = paramSource.distOrRoll;
    this.velocity = paramSource.velocity.clone();
    this.temporary = paramSource.temporary;
    this.sourceVolume = paramSource.sourceVolume;
    this.rawDataStream = paramSource.rawDataStream;
    this.rawDataFormat = paramSource.rawDataFormat;
    this.soundBuffer = paramSoundBuffer;
    if (this.toStream && this.filenameURL != null)
      this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename()); 
  }
  
  public void listenerMoved() {}
  
  public float millisecondsPlayed() {
    return (this.channel == null) ? -1.0F : this.channel.millisecondsPlayed();
  }
  
  public void positionChanged() {}
  
  public void setTemporary(boolean paramBoolean) {
    this.temporary = paramBoolean;
  }
  
  public boolean stopped() {
    return stopped(false, false);
  }
  
  public boolean checkFadeOut() {
    if (!this.toStream)
      return false; 
    if (this.fadeOutGain == -1.0F && this.fadeInGain == 1.0F)
      return false; 
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.lastFadeCheck;
    this.lastFadeCheck = l1;
    if (this.fadeOutGain >= 0.0F) {
      if (this.fadeOutMilis == 0L) {
        this.fadeOutGain = -1.0F;
        this.fadeInGain = 0.0F;
        if (!incrementSoundSequence())
          stop(); 
        positionChanged();
        this.preLoad = true;
        return false;
      } 
      float f = (float)l2 / (float)this.fadeOutMilis;
      this.fadeOutGain -= f;
      if (this.fadeOutGain <= 0.0F) {
        this.fadeOutGain = -1.0F;
        this.fadeInGain = 0.0F;
        if (!incrementSoundSequence())
          stop(); 
        positionChanged();
        this.preLoad = true;
        return false;
      } 
      positionChanged();
      return true;
    } 
    if (this.fadeInGain < 1.0F) {
      this.fadeOutGain = -1.0F;
      if (this.fadeInMilis == 0L) {
        this.fadeOutGain = -1.0F;
        this.fadeInGain = 1.0F;
      } else {
        float f = (float)l2 / (float)this.fadeInMilis;
        this.fadeInGain += f;
        if (this.fadeInGain >= 1.0F) {
          this.fadeOutGain = -1.0F;
          this.fadeInGain = 1.0F;
        } 
      } 
      positionChanged();
      return true;
    } 
    return false;
  }
  
  public String getClassName() {
    String str = SoundSystemConfig.getLibraryTitle(this.libraryType);
    return str.equals("No Sound") ? "Source" : ("Source" + str);
  }
  
  public void flush() {
    if (this.channel != null) {
      this.channel.flush();
    } else {
      errorMessage("Channel null in method 'flush'");
    } 
  }
  
  public void queueSound(FilenameURL paramFilenameURL) {
    if (!this.toStream) {
      errorMessage("Method 'queueSound' may only be used for streaming and MIDI sources.");
      return;
    } 
    if (paramFilenameURL == null) {
      errorMessage("File not specified in method 'queueSound'");
      return;
    } 
    synchronized (this.soundSequenceLock) {
      if (this.soundSequenceQueue == null)
        this.soundSequenceQueue = new LinkedList(); 
      this.soundSequenceQueue.add(paramFilenameURL);
    } 
  }
  
  public void fadeOutIn(FilenameURL paramFilenameURL, long paramLong1, long paramLong2) {
    if (!this.toStream) {
      errorMessage("Method 'fadeOutIn' may only be used for streaming and MIDI sources.");
      return;
    } 
    if (paramFilenameURL == null) {
      errorMessage("Filename/URL not specified in method 'fadeOutIn'.");
      return;
    } 
    if (paramLong1 < 0L || paramLong2 < 0L) {
      errorMessage("Miliseconds may not be negative in method 'fadeOutIn'.");
      return;
    } 
    this.fadeOutMilis = paramLong1;
    this.fadeInMilis = paramLong2;
    this.fadeOutGain = 1.0F;
    this.lastFadeCheck = System.currentTimeMillis();
    synchronized (this.soundSequenceLock) {
      if (this.soundSequenceQueue == null)
        this.soundSequenceQueue = new LinkedList(); 
      this.soundSequenceQueue.clear();
      this.soundSequenceQueue.add(paramFilenameURL);
    } 
  }
  
  public void dequeueSound(String paramString) {
    if (!this.toStream) {
      errorMessage("Method 'dequeueSound' may only be used for streaming and MIDI sources.");
      return;
    } 
    if (paramString == null || paramString.equals("")) {
      errorMessage("Filename not specified in method 'dequeueSound'");
      return;
    } 
    synchronized (this.soundSequenceLock) {
      if (this.soundSequenceQueue != null) {
        ListIterator<FilenameURL> listIterator = this.soundSequenceQueue.listIterator();
        while (listIterator.hasNext()) {
          if (((FilenameURL)listIterator.next()).getFilename().equals(paramString)) {
            listIterator.remove();
            break;
          } 
        } 
      } 
    } 
  }
  
  public void cleanup() {
    if (this.codec != null)
      this.codec.cleanup(); 
    synchronized (this.soundSequenceLock) {
      if (this.soundSequenceQueue != null)
        this.soundSequenceQueue.clear(); 
      this.soundSequenceQueue = null;
    } 
    this.sourcename = null;
    this.filenameURL = null;
    this.position = null;
    this.soundBuffer = null;
    this.codec = null;
  }
  
  public void stop() {
    this.toPlay = false;
    stopped(true, true);
    paused(true, false);
    if (this.channel != null) {
      this.channel.stop();
    } else {
      errorMessage("Channel null in method 'stop'");
    } 
  }
  
  public void cull() {
    if (!active(false, false))
      return; 
    if (playing() && this.toLoop)
      this.toPlay = true; 
    if (this.rawDataStream)
      this.toPlay = true; 
    active(true, false);
    if (this.channel != null)
      this.channel.close(); 
    this.channel = null;
  }
  
  public boolean stream() {
    if (this.channel == null)
      return false; 
    if (this.preLoad)
      if (this.rawDataStream) {
        this.preLoad = false;
      } else {
        return preLoad();
      }  
    if (this.rawDataStream) {
      if (stopped() || paused())
        return true; 
      if (this.channel.buffersProcessed() > 0)
        this.channel.processBuffer(); 
      return true;
    } 
    if (this.codec == null)
      return false; 
    if (stopped())
      return false; 
    if (paused())
      return true; 
    int i = this.channel.buffersProcessed();
    SoundBuffer soundBuffer = null;
    for (byte b = 0; b < i; b++) {
      soundBuffer = this.codec.read();
      if (soundBuffer != null) {
        if (soundBuffer.audioData != null)
          this.channel.queueBuffer(soundBuffer.audioData); 
        soundBuffer.cleanup();
        soundBuffer = null;
        return true;
      } 
      if (this.codec.endOfStream())
        synchronized (this.soundSequenceLock) {
          if (SoundSystemConfig.getStreamQueueFormatsMatch())
            if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
              if (this.codec != null)
                this.codec.cleanup(); 
              this.filenameURL = this.soundSequenceQueue.remove(0);
              this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
              this.codec.initialize(this.filenameURL.getURL());
              soundBuffer = this.codec.read();
              if (soundBuffer != null) {
                if (soundBuffer.audioData != null)
                  this.channel.queueBuffer(soundBuffer.audioData); 
                soundBuffer.cleanup();
                soundBuffer = null;
                return true;
              } 
            } else if (this.toLoop) {
              this.codec.initialize(this.filenameURL.getURL());
              soundBuffer = this.codec.read();
              if (soundBuffer != null) {
                if (soundBuffer.audioData != null)
                  this.channel.queueBuffer(soundBuffer.audioData); 
                soundBuffer.cleanup();
                soundBuffer = null;
                return true;
              } 
            }  
        }  
    } 
    return false;
  }
  
  private synchronized boolean paused(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.paused = paramBoolean2; 
    return this.paused;
  }
  
  public boolean preLoad() {
    if (this.channel == null)
      return false; 
    if (this.codec == null)
      return false; 
    SoundBuffer soundBuffer = null;
    boolean bool = false;
    synchronized (this.soundSequenceLock) {
      if (this.nextBuffers == null || this.nextBuffers.isEmpty())
        bool = true; 
    } 
    if (this.nextCodec != null && !bool) {
      this.codec = this.nextCodec;
      this.nextCodec = null;
      synchronized (this.soundSequenceLock) {
        while (!this.nextBuffers.isEmpty()) {
          soundBuffer = this.nextBuffers.remove(0);
          if (soundBuffer != null) {
            if (soundBuffer.audioData != null)
              this.channel.queueBuffer(soundBuffer.audioData); 
            soundBuffer.cleanup();
            soundBuffer = null;
          } 
        } 
      } 
    } else {
      this.nextCodec = null;
      URL uRL = this.filenameURL.getURL();
      this.codec.initialize(uRL);
      for (byte b = 0; b < SoundSystemConfig.getNumberStreamingBuffers(); b++) {
        soundBuffer = this.codec.read();
        if (soundBuffer != null) {
          if (soundBuffer.audioData != null)
            this.channel.queueBuffer(soundBuffer.audioData); 
          soundBuffer.cleanup();
          soundBuffer = null;
        } 
      } 
    } 
    return true;
  }
  
  public boolean playing() {
    return (this.channel == null || this.channel.attachedSource != this) ? false : ((paused() || stopped()) ? false : this.channel.playing());
  }
  
  protected void message(String paramString) {
    this.logger.message(paramString, 0);
  }
  
  public boolean readBuffersFromNextSoundInSequence() {
    if (!this.toStream) {
      errorMessage("Method 'readBuffersFromNextSoundInSequence' may only be used for streaming sources.");
      return false;
    } 
    synchronized (this.soundSequenceLock) {
      if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
        if (this.nextCodec != null)
          this.nextCodec.cleanup(); 
        this.nextCodec = SoundSystemConfig.getCodec(((FilenameURL)this.soundSequenceQueue.get(0)).getFilename());
        this.nextCodec.initialize(((FilenameURL)this.soundSequenceQueue.get(0)).getURL());
        SoundBuffer soundBuffer = null;
        for (byte b = 0; b < SoundSystemConfig.getNumberStreamingBuffers() && !this.nextCodec.endOfStream(); b++) {
          soundBuffer = this.nextCodec.read();
          if (soundBuffer != null) {
            if (this.nextBuffers == null)
              this.nextBuffers = new LinkedList(); 
            this.nextBuffers.add(soundBuffer);
          } 
        } 
        return true;
      } 
    } 
    return false;
  }
  
  private synchronized boolean stopped(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.stopped = paramBoolean2; 
    return this.stopped;
  }
  
  public void setDistOrRoll(float paramFloat) {
    this.distOrRoll = paramFloat;
  }
  
  public Source(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    this.priority = paramBoolean;
    this.toStream = true;
    this.toLoop = false;
    this.sourcename = paramString;
    this.filenameURL = null;
    this.soundBuffer = null;
    this.position = new Vector3D(paramFloat1, paramFloat2, paramFloat3);
    this.attModel = paramInt;
    this.distOrRoll = paramFloat4;
    this.velocity = new Vector3D(0.0F, 0.0F, 0.0F);
    this.temporary = false;
    this.rawDataStream = true;
    this.rawDataFormat = paramAudioFormat;
  }
  
  public void setLooping(boolean paramBoolean) {
    this.toLoop = paramBoolean;
  }
  
  public int getSoundSequenceQueueSize() {
    return (this.soundSequenceQueue == null) ? 0 : this.soundSequenceQueue.size();
  }
  
  protected boolean errorCheck(boolean paramBoolean, String paramString) {
    return this.logger.errorCheck(paramBoolean, getClassName(), paramString, 0);
  }
  
  public void changeSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    this.priority = paramBoolean1;
    this.toStream = paramBoolean2;
    this.toLoop = paramBoolean3;
    this.sourcename = paramString;
    this.filenameURL = paramFilenameURL;
    this.soundBuffer = paramSoundBuffer;
    this.position.x = paramFloat1;
    this.position.y = paramFloat2;
    this.position.z = paramFloat3;
    this.attModel = paramInt;
    this.distOrRoll = paramFloat4;
    this.temporary = paramBoolean4;
  }
  
  public void pause() {
    this.toPlay = false;
    paused(true, true);
    if (this.channel != null) {
      this.channel.pause();
    } else {
      errorMessage("Channel null in method 'pause'");
    } 
  }
  
  public boolean incrementSoundSequence() {
    if (!this.toStream) {
      errorMessage("Method 'incrementSoundSequence' may only be used for streaming and MIDI sources.");
      return false;
    } 
    synchronized (this.soundSequenceLock) {
      if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
        this.filenameURL = this.soundSequenceQueue.remove(0);
        if (this.codec != null)
          this.codec.cleanup(); 
        this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
        return true;
      } 
    } 
    return false;
  }
  
  public void setPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.position.x = paramFloat1;
    this.position.y = paramFloat2;
    this.position.z = paramFloat3;
  }
  
  public void play(Channel paramChannel) {
    if (!active(false, false)) {
      if (this.toLoop)
        this.toPlay = true; 
      return;
    } 
    if (this.channel != paramChannel) {
      this.channel = paramChannel;
      this.channel.close();
    } 
    stopped(true, false);
    paused(true, false);
  }
  
  public boolean active() {
    return active(false, false);
  }
  
  protected void errorMessage(String paramString) {
    this.logger.errorMessage(getClassName(), paramString, 0);
  }
  
  public float getPitch() {
    return this.pitch;
  }
  
  public void fadeOut(FilenameURL paramFilenameURL, long paramLong) {
    if (!this.toStream) {
      errorMessage("Method 'fadeOut' may only be used for streaming and MIDI sources.");
      return;
    } 
    if (paramLong < 0L) {
      errorMessage("Miliseconds may not be negative in method 'fadeOut'.");
      return;
    } 
    this.fadeOutMilis = paramLong;
    this.fadeInMilis = 0L;
    this.fadeOutGain = 1.0F;
    this.lastFadeCheck = System.currentTimeMillis();
    synchronized (this.soundSequenceLock) {
      if (this.soundSequenceQueue != null)
        this.soundSequenceQueue.clear(); 
      if (paramFilenameURL != null) {
        if (this.soundSequenceQueue == null)
          this.soundSequenceQueue = new LinkedList(); 
        this.soundSequenceQueue.add(paramFilenameURL);
      } 
    } 
  }
  
  static {
    GET = false;
    SET = true;
  }
  
  public float getDistanceFromListener() {
    return this.distanceFromListener;
  }
  
  public void rewind() {
    if (paused(false, false))
      stop(); 
    if (this.channel != null) {
      boolean bool = playing();
      this.channel.rewind();
      if (this.toStream && bool) {
        stop();
        play(this.channel);
      } 
    } else {
      errorMessage("Channel null in method 'rewind'");
    } 
  }
  
  public void setAttenuation(int paramInt) {
    this.attModel = paramInt;
  }
  
  public void activate() {
    active(true, true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\Source.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */