package paulscode.sound.libraries;

import java.util.LinkedList;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import paulscode.sound.Channel;
import paulscode.sound.SoundBuffer;

public class ChannelJavaSound extends Channel {
  private float initialSampleRate = 0.0F;
  
  private FloatControl gainControl = null;
  
  public SourceDataLine sourceDataLine = null;
  
  private int processed = 0;
  
  SoundBuffer soundBuffer;
  
  private boolean toLoop = false;
  
  private Mixer myMixer = null;
  
  private FloatControl sampleRateControl = null;
  
  public Clip clip = null;
  
  private List streamBuffers;
  
  private FloatControl panControl = null;
  
  private AudioFormat myFormat = null;
  
  private float initialGain = 0.0F;
  
  public void newMixer(Mixer paramMixer) {
    if (this.myMixer != paramMixer) {
      try {
        if (this.clip != null) {
          this.clip.close();
        } else if (this.sourceDataLine != null) {
          this.sourceDataLine.close();
        } 
      } catch (SecurityException securityException) {}
      this.myMixer = paramMixer;
      if (this.attachedSource != null)
        if (this.channelType == 0 && this.soundBuffer != null) {
          attachBuffer(this.soundBuffer);
        } else if (this.myFormat != null) {
          resetStream(this.myFormat);
        }  
    } 
  }
  
  public boolean preLoadBuffers(LinkedList<byte[]> paramLinkedList) {
    if (errorCheck((this.channelType != 1), "Buffers may only be queued for streaming sources."))
      return false; 
    if (errorCheck((this.sourceDataLine == null), "SourceDataLine null in method 'preLoadBuffers'."))
      return false; 
    this.sourceDataLine.start();
    if (paramLinkedList.isEmpty())
      return true; 
    byte[] arrayOfByte = paramLinkedList.remove(0);
    if (errorCheck((arrayOfByte == null), "Missing sound-bytes in method 'preLoadBuffers'."))
      return false; 
    while (!paramLinkedList.isEmpty())
      this.streamBuffers.add(new SoundBuffer(paramLinkedList.remove(0), this.myFormat)); 
    this.sourceDataLine.write(arrayOfByte, 0, arrayOfByte.length);
    this.processed = 0;
    return true;
  }
  
  public boolean playing() {
    switch (this.channelType) {
      case 0:
        return (this.clip == null) ? false : this.clip.isActive();
      case 1:
        return (this.sourceDataLine == null) ? false : this.sourceDataLine.isActive();
    } 
    return false;
  }
  
  public float millisecondsPlayed() {
    switch (this.channelType) {
      case 0:
        return (this.clip == null) ? -1.0F : ((float)this.clip.getMicrosecondPosition() / 1000.0F);
      case 1:
        return (this.sourceDataLine == null) ? -1.0F : ((float)this.sourceDataLine.getMicrosecondPosition() / 1000.0F);
    } 
    return -1.0F;
  }
  
  public boolean attachBuffer(SoundBuffer paramSoundBuffer) {
    if (errorCheck((this.channelType != 0), "Buffers may only be attached to non-streaming sources"))
      return false; 
    if (errorCheck((this.myMixer == null), "Mixer null in method 'attachBuffer'"))
      return false; 
    if (errorCheck((paramSoundBuffer == null), "Buffer null in method 'attachBuffer'"))
      return false; 
    if (errorCheck((paramSoundBuffer.audioData == null), "Buffer missing audio data in method 'attachBuffer'"))
      return false; 
    if (errorCheck((paramSoundBuffer.audioFormat == null), "Buffer missing format information in method 'attachBuffer'"))
      return false; 
    DataLine.Info info = new DataLine.Info(Clip.class, paramSoundBuffer.audioFormat);
    if (errorCheck(!AudioSystem.isLineSupported(info), "Line not supported in method 'attachBuffer'"))
      return false; 
    Clip clip = null;
    try {
      clip = (Clip)this.myMixer.getLine(info);
    } catch (Exception exception) {
      errorMessage("Unable to create clip in method 'attachBuffer'");
      printStackTrace(exception);
      return false;
    } 
    if (errorCheck((clip == null), "New clip null in method 'attachBuffer'"))
      return false; 
    if (this.clip != null) {
      this.clip.stop();
      this.clip.flush();
      this.clip.close();
    } 
    this.clip = clip;
    this.soundBuffer = paramSoundBuffer;
    this.myFormat = paramSoundBuffer.audioFormat;
    clip = null;
    try {
      this.clip.open(this.myFormat, paramSoundBuffer.audioData, 0, paramSoundBuffer.audioData.length);
    } catch (Exception exception) {
      errorMessage("Unable to attach buffer to clip in method 'attachBuffer'");
      printStackTrace(exception);
      return false;
    } 
    resetControls();
    return true;
  }
  
  public void setPan(float paramFloat) {
    if (this.panControl == null)
      return; 
    float f = paramFloat;
    if (f < -1.0F)
      f = -1.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    this.panControl.setValue(f);
  }
  
  public void setGain(float paramFloat) {
    if (this.gainControl == null)
      return; 
    float f1 = paramFloat;
    if (f1 < 0.0F)
      f1 = 0.0F; 
    if (f1 > 1.0F)
      f1 = 1.0F; 
    double d1 = this.gainControl.getMinimum();
    double d2 = this.initialGain;
    double d3 = 0.5D * d2 - d1;
    double d4 = Math.log(10.0D) / 20.0D;
    float f2 = (float)(d1 + 1.0D / d4 * Math.log(1.0D + (Math.exp(d4 * d3) - 1.0D) * f1));
    this.gainControl.setValue(f2);
  }
  
  public boolean queueBuffer(byte[] paramArrayOfbyte) {
    if (errorCheck((this.channelType != 1), "Buffers may only be queued for streaming sources."))
      return false; 
    if (errorCheck((this.sourceDataLine == null), "SourceDataLine null in method 'queueBuffer'."))
      return false; 
    if (errorCheck((this.myFormat == null), "AudioFormat null in method 'queueBuffer'"))
      return false; 
    this.streamBuffers.add(new SoundBuffer(paramArrayOfbyte, this.myFormat));
    processBuffer();
    this.processed = 0;
    return true;
  }
  
  public void cleanup() {
    if (this.streamBuffers != null) {
      for (SoundBuffer soundBuffer = null; !this.streamBuffers.isEmpty(); soundBuffer = null) {
        soundBuffer = this.streamBuffers.remove(0);
        soundBuffer.cleanup();
      } 
      this.streamBuffers.clear();
    } 
    this.clip = null;
    this.soundBuffer = null;
    this.sourceDataLine = null;
    this.streamBuffers.clear();
    this.myMixer = null;
    this.myFormat = null;
    this.streamBuffers = null;
    super.cleanup();
  }
  
  private void resetControls() {
    switch (this.channelType) {
      case 0:
        try {
          if (!this.clip.isControlSupported(FloatControl.Type.PAN)) {
            this.panControl = null;
          } else {
            this.panControl = (FloatControl)this.clip.getControl(FloatControl.Type.PAN);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          this.panControl = null;
        } 
        try {
          if (!this.clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            this.gainControl = null;
            this.initialGain = 0.0F;
          } else {
            this.gainControl = (FloatControl)this.clip.getControl(FloatControl.Type.MASTER_GAIN);
            this.initialGain = this.gainControl.getValue();
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          this.gainControl = null;
          this.initialGain = 0.0F;
        } 
        try {
          if (!this.clip.isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
            this.sampleRateControl = null;
            this.initialSampleRate = 0.0F;
          } else {
            this.sampleRateControl = (FloatControl)this.clip.getControl(FloatControl.Type.SAMPLE_RATE);
            this.initialSampleRate = this.sampleRateControl.getValue();
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          this.sampleRateControl = null;
          this.initialSampleRate = 0.0F;
        } 
        return;
      case 1:
        try {
          if (!this.sourceDataLine.isControlSupported(FloatControl.Type.PAN)) {
            this.panControl = null;
          } else {
            this.panControl = (FloatControl)this.sourceDataLine.getControl(FloatControl.Type.PAN);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          this.panControl = null;
        } 
        try {
          if (!this.sourceDataLine.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            this.gainControl = null;
            this.initialGain = 0.0F;
          } else {
            this.gainControl = (FloatControl)this.sourceDataLine.getControl(FloatControl.Type.MASTER_GAIN);
            this.initialGain = this.gainControl.getValue();
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          this.gainControl = null;
          this.initialGain = 0.0F;
        } 
        try {
          if (!this.sourceDataLine.isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
            this.sampleRateControl = null;
            this.initialSampleRate = 0.0F;
          } else {
            this.sampleRateControl = (FloatControl)this.sourceDataLine.getControl(FloatControl.Type.SAMPLE_RATE);
            this.initialSampleRate = this.sampleRateControl.getValue();
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          this.sampleRateControl = null;
          this.initialSampleRate = 0.0F;
        } 
        return;
    } 
    errorMessage("Unrecognized channel type in method 'resetControls'");
    this.panControl = null;
    this.gainControl = null;
    this.sampleRateControl = null;
  }
  
  public void setLooping(boolean paramBoolean) {
    this.toLoop = paramBoolean;
  }
  
  public int buffersProcessed() {
    this.processed = 0;
    if (errorCheck((this.channelType != 1), "Buffers may only be queued for streaming sources.")) {
      if (this.streamBuffers != null)
        this.streamBuffers.clear(); 
      return 0;
    } 
    if (this.sourceDataLine == null) {
      if (this.streamBuffers != null)
        this.streamBuffers.clear(); 
      return 0;
    } 
    if (this.sourceDataLine.available() > 0)
      this.processed = 1; 
    return this.processed;
  }
  
  public boolean resetStream(AudioFormat paramAudioFormat) {
    if (errorCheck((this.myMixer == null), "Mixer null in method 'resetStream'"))
      return false; 
    if (errorCheck((paramAudioFormat == null), "AudioFormat null in method 'resetStream'"))
      return false; 
    DataLine.Info info = new DataLine.Info(SourceDataLine.class, paramAudioFormat);
    if (errorCheck(!AudioSystem.isLineSupported(info), "Line not supported in method 'resetStream'"))
      return false; 
    SourceDataLine sourceDataLine = null;
    try {
      sourceDataLine = (SourceDataLine)this.myMixer.getLine(info);
    } catch (Exception exception) {
      errorMessage("Unable to create a SourceDataLine in method 'resetStream'");
      printStackTrace(exception);
      return false;
    } 
    if (errorCheck((sourceDataLine == null), "New SourceDataLine null in method 'resetStream'"))
      return false; 
    this.streamBuffers.clear();
    this.processed = 0;
    if (this.sourceDataLine != null) {
      this.sourceDataLine.stop();
      this.sourceDataLine.flush();
      this.sourceDataLine.close();
    } 
    this.sourceDataLine = sourceDataLine;
    this.myFormat = paramAudioFormat;
    sourceDataLine = null;
    try {
      this.sourceDataLine.open(this.myFormat);
    } catch (Exception exception) {
      errorMessage("Unable to open the new SourceDataLine in method 'resetStream'");
      printStackTrace(exception);
      return false;
    } 
    resetControls();
    return true;
  }
  
  public void rewind() {
    switch (this.channelType) {
      case 0:
        if (this.clip != null) {
          boolean bool = this.clip.isRunning();
          this.clip.stop();
          this.clip.setFramePosition(0);
          if (bool) {
            if (this.toLoop) {
              this.clip.loop(-1);
              break;
            } 
            this.clip.start();
          } 
        } 
        break;
    } 
  }
  
  public void play() {
    switch (this.channelType) {
      case 0:
        if (this.clip != null) {
          if (this.toLoop) {
            this.clip.stop();
            this.clip.loop(-1);
            break;
          } 
          this.clip.stop();
          this.clip.start();
        } 
        break;
      case 1:
        if (this.sourceDataLine != null)
          this.sourceDataLine.start(); 
        break;
    } 
  }
  
  public void flush() {
    if (this.channelType != 1)
      return; 
    if (errorCheck((this.sourceDataLine == null), "SourceDataLine null in method 'flush'."))
      return; 
    this.sourceDataLine.stop();
    this.sourceDataLine.flush();
    this.sourceDataLine.drain();
    this.streamBuffers.clear();
    this.processed = 0;
  }
  
  public void setPitch(float paramFloat) {
    if (this.sampleRateControl == null)
      return; 
    float f = paramFloat;
    if (f < 0.5F)
      f = 0.5F; 
    if (f > 2.0F)
      f = 2.0F; 
    f *= this.initialSampleRate;
    this.sampleRateControl.setValue(f);
  }
  
  public void setAudioFormat(AudioFormat paramAudioFormat) {
    resetStream(paramAudioFormat);
    if (this.attachedSource != null && this.attachedSource.rawDataStream && this.attachedSource.active() && this.sourceDataLine != null)
      this.sourceDataLine.start(); 
  }
  
  public void stop() {
    switch (this.channelType) {
      case 0:
        if (this.clip != null) {
          this.clip.stop();
          this.clip.setFramePosition(0);
        } 
        break;
      case 1:
        if (this.sourceDataLine != null)
          this.sourceDataLine.stop(); 
        break;
    } 
  }
  
  public void pause() {
    switch (this.channelType) {
      case 0:
        if (this.clip != null)
          this.clip.stop(); 
        break;
      case 1:
        if (this.sourceDataLine != null)
          this.sourceDataLine.stop(); 
        break;
    } 
  }
  
  public int feedRawAudioData(byte[] paramArrayOfbyte) {
    if (errorCheck((this.channelType != 1), "Raw audio data can only be processed by streaming sources."))
      return -1; 
    if (errorCheck((this.streamBuffers == null), "StreamBuffers queue null in method 'feedRawAudioData'."))
      return -1; 
    this.streamBuffers.add(new SoundBuffer(paramArrayOfbyte, this.myFormat));
    return buffersProcessed();
  }
  
  public void close() {
    switch (this.channelType) {
      case 0:
        if (this.clip != null) {
          this.clip.stop();
          this.clip.flush();
          this.clip.close();
        } 
        break;
      case 1:
        if (this.sourceDataLine != null) {
          flush();
          this.sourceDataLine.close();
        } 
        break;
    } 
  }
  
  public ChannelJavaSound(int paramInt, Mixer paramMixer) {
    super(paramInt);
    this.myMixer = paramMixer;
    this.clip = null;
    this.sourceDataLine = null;
    this.streamBuffers = new LinkedList();
  }
  
  public boolean processBuffer() {
    if (errorCheck((this.channelType != 1), "Buffers are only processed for streaming sources."))
      return false; 
    if (errorCheck((this.sourceDataLine == null), "SourceDataLine null in method 'processBuffer'."))
      return false; 
    if (this.streamBuffers == null || this.streamBuffers.isEmpty())
      return false; 
    SoundBuffer soundBuffer = this.streamBuffers.remove(0);
    this.sourceDataLine.write(soundBuffer.audioData, 0, soundBuffer.audioData.length);
    if (!this.sourceDataLine.isActive())
      this.sourceDataLine.start(); 
    soundBuffer.cleanup();
    soundBuffer = null;
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\ChannelJavaSound.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */