package paulscode.sound.libraries;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import paulscode.sound.Channel;

public class ChannelLWJGLOpenAL extends Channel {
  public float millisPreviouslyPlayed = 0.0F;
  
  public IntBuffer ALSource;
  
  public int sampleRate;
  
  public int ALformat;
  
  public boolean attachBuffer(IntBuffer paramIntBuffer) {
    if (errorCheck((this.channelType != 0), "Sound buffers may only be attached to normal sources."))
      return false; 
    AL10.alSourcei(this.ALSource.get(0), 4105, paramIntBuffer.get(0));
    if (this.attachedSource != null && this.attachedSource.soundBuffer != null && this.attachedSource.soundBuffer.audioFormat != null)
      setAudioFormat(this.attachedSource.soundBuffer.audioFormat); 
    return checkALError();
  }
  
  public void stop() {
    AL10.alSourceStop(this.ALSource.get(0));
    if (!checkALError())
      this.millisPreviouslyPlayed = 0.0F; 
  }
  
  public void play() {
    AL10.alSourcePlay(this.ALSource.get(0));
    checkALError();
  }
  
  public void flush() {
    if (this.channelType != 1)
      return; 
    int i = AL10.alGetSourcei(this.ALSource.get(0), 4117);
    if (checkALError())
      return; 
    IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
    while (i > 0) {
      try {
        AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
      } catch (Exception exception) {
        return;
      } 
      if (checkALError())
        return; 
      i--;
    } 
    this.millisPreviouslyPlayed = 0.0F;
  }
  
  public boolean queueBuffer(byte[] paramArrayOfbyte) {
    if (errorCheck((this.channelType != 1), "Buffers may only be queued for streaming sources."))
      return false; 
    ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer(paramArrayOfbyte.length).put(paramArrayOfbyte).flip();
    IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
    AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
    if (checkALError())
      return false; 
    if (AL10.alIsBuffer(intBuffer.get(0)))
      this.millisPreviouslyPlayed += millisInBuffer(intBuffer.get(0)); 
    checkALError();
    AL10.alBufferData(intBuffer.get(0), this.ALformat, byteBuffer, this.sampleRate);
    if (checkALError())
      return false; 
    AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
    return !checkALError();
  }
  
  private boolean checkALError() {
    switch (AL10.alGetError()) {
      case 0:
        return false;
      case 40961:
        errorMessage("Invalid name parameter.");
        return true;
      case 40962:
        errorMessage("Invalid parameter.");
        return true;
      case 40963:
        errorMessage("Invalid enumerated parameter value.");
        return true;
      case 40964:
        errorMessage("Illegal call.");
        return true;
      case 40965:
        errorMessage("Unable to allocate memory.");
        return true;
    } 
    errorMessage("An unrecognized error occurred.");
    return true;
  }
  
  public float millisecondsPlayed() {
    float f1 = AL10.alGetSourcei(this.ALSource.get(0), 4134);
    float f2 = 1.0F;
    switch (this.ALformat) {
      case 4352:
        f2 = 1.0F;
        break;
      case 4353:
        f2 = 2.0F;
        break;
      case 4354:
        f2 = 2.0F;
        break;
      case 4355:
        f2 = 4.0F;
        break;
    } 
    f1 = f1 / f2 / this.sampleRate * 1000.0F;
    if (this.channelType == 1)
      f1 += this.millisPreviouslyPlayed; 
    return f1;
  }
  
  public float millisInBuffer(int paramInt) {
    return AL10.alGetBufferi(paramInt, 8196) / AL10.alGetBufferi(paramInt, 8195) / AL10.alGetBufferi(paramInt, 8194) / 8.0F / this.sampleRate * 1000.0F;
  }
  
  public boolean preLoadBuffers(LinkedList<byte[]> paramLinkedList) {
    if (errorCheck((this.channelType != 1), "Buffers may only be queued for streaming sources."))
      return false; 
    if (errorCheck((paramLinkedList == null), "Buffer List null in method 'preLoadBuffers'"))
      return false; 
    boolean bool = playing();
    if (bool) {
      AL10.alSourceStop(this.ALSource.get(0));
      checkALError();
    } 
    int i = AL10.alGetSourcei(this.ALSource.get(0), 4118);
    if (i > 0) {
      IntBuffer intBuffer1 = BufferUtils.createIntBuffer(i);
      AL10.alGenBuffers(intBuffer1);
      if (errorCheck(checkALError(), "Error clearing stream buffers in method 'preLoadBuffers'"))
        return false; 
      AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer1);
      if (errorCheck(checkALError(), "Error unqueuing stream buffers in method 'preLoadBuffers'"))
        return false; 
    } 
    if (bool) {
      AL10.alSourcePlay(this.ALSource.get(0));
      checkALError();
    } 
    IntBuffer intBuffer = BufferUtils.createIntBuffer(paramLinkedList.size());
    AL10.alGenBuffers(intBuffer);
    if (errorCheck(checkALError(), "Error generating stream buffers in method 'preLoadBuffers'"))
      return false; 
    ByteBuffer byteBuffer = null;
    for (byte b = 0; b < paramLinkedList.size(); b++) {
      byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer(((byte[])paramLinkedList.get(b)).length).put(paramLinkedList.get(b)).flip();
      try {
        AL10.alBufferData(intBuffer.get(b), this.ALformat, byteBuffer, this.sampleRate);
      } catch (Exception exception) {
        errorMessage("Error creating buffers in method 'preLoadBuffers'");
        printStackTrace(exception);
        return false;
      } 
      if (errorCheck(checkALError(), "Error creating buffers in method 'preLoadBuffers'"))
        return false; 
    } 
    try {
      AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
    } catch (Exception exception) {
      errorMessage("Error queuing buffers in method 'preLoadBuffers'");
      printStackTrace(exception);
      return false;
    } 
    if (errorCheck(checkALError(), "Error queuing buffers in method 'preLoadBuffers'"))
      return false; 
    AL10.alSourcePlay(this.ALSource.get(0));
    return !errorCheck(checkALError(), "Error playing source in method 'preLoadBuffers'");
  }
  
  public void cleanup() {
    if (this.ALSource != null) {
      try {
        AL10.alSourceStop(this.ALSource);
        AL10.alGetError();
      } catch (Exception exception) {}
      try {
        AL10.alDeleteSources(this.ALSource);
        AL10.alGetError();
      } catch (Exception exception) {}
      this.ALSource.clear();
    } 
    this.ALSource = null;
    super.cleanup();
  }
  
  public void rewind() {
    if (this.channelType == 1)
      return; 
    AL10.alSourceRewind(this.ALSource.get(0));
    if (!checkALError())
      this.millisPreviouslyPlayed = 0.0F; 
  }
  
  public int feedRawAudioData(byte[] paramArrayOfbyte) {
    IntBuffer intBuffer;
    if (errorCheck((this.channelType != 1), "Raw audio data can only be fed to streaming sources."))
      return -1; 
    ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer(paramArrayOfbyte.length).put(paramArrayOfbyte).flip();
    int i = AL10.alGetSourcei(this.ALSource.get(0), 4118);
    if (i > 0) {
      intBuffer = BufferUtils.createIntBuffer(i);
      AL10.alGenBuffers(intBuffer);
      if (errorCheck(checkALError(), "Error clearing stream buffers in method 'feedRawAudioData'"))
        return -1; 
      AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
      if (errorCheck(checkALError(), "Error unqueuing stream buffers in method 'feedRawAudioData'"))
        return -1; 
      if (AL10.alIsBuffer(intBuffer.get(0)))
        this.millisPreviouslyPlayed += millisInBuffer(intBuffer.get(0)); 
      checkALError();
    } else {
      intBuffer = BufferUtils.createIntBuffer(1);
      AL10.alGenBuffers(intBuffer);
      if (errorCheck(checkALError(), "Error generating stream buffers in method 'preLoadBuffers'"))
        return -1; 
    } 
    AL10.alBufferData(intBuffer.get(0), this.ALformat, byteBuffer, this.sampleRate);
    if (checkALError())
      return -1; 
    AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
    if (checkALError())
      return -1; 
    if (this.attachedSource != null && this.attachedSource.channel == this && this.attachedSource.active() && !playing()) {
      AL10.alSourcePlay(this.ALSource.get(0));
      checkALError();
    } 
    return i;
  }
  
  public ChannelLWJGLOpenAL(int paramInt, IntBuffer paramIntBuffer) {
    super(paramInt);
    this.ALSource = paramIntBuffer;
  }
  
  public boolean playing() {
    int i = AL10.alGetSourcei(this.ALSource.get(0), 4112);
    return checkALError() ? false : ((i == 4114));
  }
  
  public void setAudioFormat(AudioFormat paramAudioFormat) {
    char c = Character.MIN_VALUE;
    if (paramAudioFormat.getChannels() == 1) {
      if (paramAudioFormat.getSampleSizeInBits() == 8) {
        c = 'ᄀ';
      } else if (paramAudioFormat.getSampleSizeInBits() == 16) {
        c = 'ᄁ';
      } else {
        errorMessage("Illegal sample size in method 'setAudioFormat'");
        return;
      } 
    } else if (paramAudioFormat.getChannels() == 2) {
      if (paramAudioFormat.getSampleSizeInBits() == 8) {
        c = 'ᄂ';
      } else if (paramAudioFormat.getSampleSizeInBits() == 16) {
        c = 'ᄃ';
      } else {
        errorMessage("Illegal sample size in method 'setAudioFormat'");
        return;
      } 
    } else {
      errorMessage("Audio data neither mono nor stereo in method 'setAudioFormat'");
      return;
    } 
    this.ALformat = c;
    this.sampleRate = (int)paramAudioFormat.getSampleRate();
  }
  
  public void setFormat(int paramInt1, int paramInt2) {
    this.ALformat = paramInt1;
    this.sampleRate = paramInt2;
  }
  
  public int buffersProcessed() {
    if (this.channelType != 1)
      return 0; 
    int i = AL10.alGetSourcei(this.ALSource.get(0), 4118);
    return checkALError() ? 0 : i;
  }
  
  public void close() {
    try {
      AL10.alSourceStop(this.ALSource.get(0));
      AL10.alGetError();
    } catch (Exception exception) {}
    if (this.channelType == 1)
      flush(); 
  }
  
  public void pause() {
    AL10.alSourcePause(this.ALSource.get(0));
    checkALError();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\ChannelLWJGLOpenAL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */