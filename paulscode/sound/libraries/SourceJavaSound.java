package paulscode.sound.libraries;

import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ListenerData;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;
import paulscode.sound.Vector3D;

public class SourceJavaSound extends Source {
  protected ChannelJavaSound channelJavaSound = (ChannelJavaSound)this.channel;
  
  private float pan = 0.0F;
  
  public ListenerData listener;
  
  public void calculateGain() {
    float f4;
    float f5;
    float f1 = this.position.x - this.listener.position.x;
    float f2 = this.position.y - this.listener.position.y;
    float f3 = this.position.z - this.listener.position.z;
    this.distanceFromListener = (float)Math.sqrt((f1 * f1 + f2 * f2 + f3 * f3));
    switch (this.attModel) {
      case 2:
        if (this.distanceFromListener <= 0.0F) {
          this.gain = 1.0F;
          break;
        } 
        if (this.distanceFromListener >= this.distOrRoll) {
          this.gain = 0.0F;
          break;
        } 
        this.gain = 1.0F - this.distanceFromListener / this.distOrRoll;
        break;
      case 1:
        if (this.distanceFromListener <= 0.0F) {
          this.gain = 1.0F;
          break;
        } 
        f4 = 5.0E-4F;
        f5 = this.distOrRoll * this.distanceFromListener * this.distanceFromListener * f4;
        if (f5 < 0.0F)
          f5 = 0.0F; 
        this.gain = 1.0F / (1.0F + f5);
        break;
      default:
        this.gain = 1.0F;
        break;
    } 
    if (this.gain > 1.0F)
      this.gain = 1.0F; 
    if (this.gain < 0.0F)
      this.gain = 0.0F; 
    this.gain *= this.sourceVolume * SoundSystemConfig.getMasterGain() * Math.abs(this.fadeOutGain) * this.fadeInGain;
    if (this.channel != null && this.channel.attachedSource == this && this.channelJavaSound != null)
      this.channelJavaSound.setGain(this.gain); 
  }
  
  public void changeSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    super.changeSource(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramSoundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4);
    if (this.channelJavaSound != null)
      this.channelJavaSound.setLooping(paramBoolean3); 
    positionChanged();
  }
  
  public void play(Channel paramChannel) {
    if (!active()) {
      if (this.toLoop)
        this.toPlay = true; 
      return;
    } 
    if (paramChannel == null) {
      errorMessage("Unable to play source, because channel was null");
      return;
    } 
    boolean bool = (this.channel != paramChannel) ? true : false;
    if (this.channel != null && this.channel.attachedSource != this)
      bool = true; 
    boolean bool1 = paused();
    boolean bool2 = stopped();
    super.play(paramChannel);
    this.channelJavaSound = (ChannelJavaSound)this.channel;
    if (bool) {
      if (this.channelJavaSound != null)
        this.channelJavaSound.setLooping(this.toLoop); 
      if (!this.toStream) {
        if (this.soundBuffer == null) {
          errorMessage("No sound buffer to play");
          return;
        } 
        this.channelJavaSound.attachBuffer(this.soundBuffer);
      } 
    } 
    positionChanged();
    if (bool2 || !playing()) {
      if (this.toStream && !bool1)
        this.preLoad = true; 
      this.channel.play();
    } 
  }
  
  public void setDistOrRoll(float paramFloat) {
    super.setDistOrRoll(paramFloat);
    calculateGain();
  }
  
  public boolean preLoad() {
    if (this.codec == null)
      return false; 
    boolean bool = false;
    synchronized (this.soundSequenceLock) {
      if (this.nextBuffers == null || this.nextBuffers.isEmpty())
        bool = true; 
    } 
    LinkedList<byte[]> linkedList = new LinkedList();
    if (this.nextCodec != null && !bool) {
      this.codec = this.nextCodec;
      this.nextCodec = null;
      synchronized (this.soundSequenceLock) {
        while (!this.nextBuffers.isEmpty()) {
          this.soundBuffer = this.nextBuffers.remove(0);
          if (this.soundBuffer != null && this.soundBuffer.audioData != null)
            linkedList.add(this.soundBuffer.audioData); 
        } 
      } 
    } else {
      this.codec.initialize(this.filenameURL.getURL());
      for (byte b = 0; b < SoundSystemConfig.getNumberStreamingBuffers(); b++) {
        this.soundBuffer = this.codec.read();
        if (this.soundBuffer == null || this.soundBuffer.audioData == null)
          break; 
        linkedList.add(this.soundBuffer.audioData);
      } 
      this.channelJavaSound.resetStream(this.codec.getAudioFormat());
    } 
    positionChanged();
    this.channel.preLoadBuffers(linkedList);
    this.preLoad = false;
    return true;
  }
  
  public void cleanup() {
    super.cleanup();
  }
  
  public void setAttenuation(int paramInt) {
    super.setAttenuation(paramInt);
    calculateGain();
  }
  
  public void calculatePan() {
    Vector3D vector3D = this.listener.up.cross(this.listener.lookAt);
    vector3D.normalize();
    float f1 = this.position.dot(this.position.subtract(this.listener.position), vector3D);
    float f2 = this.position.dot(this.position.subtract(this.listener.position), this.listener.lookAt);
    vector3D = null;
    float f3 = (float)Math.atan2(f1, f2);
    this.pan = (float)-Math.sin(f3);
    if (this.channel != null && this.channel.attachedSource == this && this.channelJavaSound != null)
      if (this.attModel == 0) {
        this.channelJavaSound.setPan(0.0F);
      } else {
        this.channelJavaSound.setPan(this.pan);
      }  
  }
  
  public void setPitch(float paramFloat) {
    super.setPitch(paramFloat);
    calculatePitch();
  }
  
  public void positionChanged() {
    calculateGain();
    calculatePan();
    calculatePitch();
  }
  
  public SourceJavaSound(ListenerData paramListenerData, Source paramSource, SoundBuffer paramSoundBuffer) {
    super(paramSource, paramSoundBuffer);
    this.listener = paramListenerData;
    positionChanged();
  }
  
  public void setPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
    super.setPosition(paramFloat1, paramFloat2, paramFloat3);
    positionChanged();
  }
  
  public void setVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    super.setVelocity(paramFloat1, paramFloat2, paramFloat3);
    positionChanged();
  }
  
  public SourceJavaSound(ListenerData paramListenerData, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    super(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramSoundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4);
    this.listener = paramListenerData;
    positionChanged();
  }
  
  public SourceJavaSound(ListenerData paramListenerData, AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    super(paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4);
    this.listener = paramListenerData;
    positionChanged();
  }
  
  public float min(float paramFloat1, float paramFloat2) {
    return (paramFloat1 < paramFloat2) ? paramFloat1 : paramFloat2;
  }
  
  public void calculatePitch() {
    if (this.channel != null && this.channel.attachedSource == this && this.channelJavaSound != null)
      if (SoundSystemConfig.getDopplerFactor() == 0.0F) {
        this.channelJavaSound.setPitch(this.pitch);
      } else {
        float f1 = 343.3F;
        Vector3D vector3D1 = this.velocity;
        Vector3D vector3D2 = this.listener.velocity;
        float f2 = SoundSystemConfig.getDopplerVelocity();
        float f3 = SoundSystemConfig.getDopplerFactor();
        Vector3D vector3D3 = this.listener.position.subtract(this.position);
        float f4 = vector3D3.dot(vector3D2) / vector3D3.length();
        float f5 = vector3D3.dot(vector3D1) / vector3D3.length();
        f5 = min(f5, f1 / f3);
        f4 = min(f4, f1 / f3);
        float f6 = this.pitch * (f1 * f2 - f3 * f4) / (f1 * f2 - f3 * f5);
        if (f6 < 0.5F) {
          f6 = 0.5F;
        } else if (f6 > 2.0F) {
          f6 = 2.0F;
        } 
        this.channelJavaSound.setPitch(f6);
      }  
  }
  
  public void listenerMoved() {
    positionChanged();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\SourceJavaSound.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */