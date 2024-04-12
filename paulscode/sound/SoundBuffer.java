package paulscode.sound;

import javax.sound.sampled.AudioFormat;

public class SoundBuffer {
  public AudioFormat audioFormat;
  
  public byte[] audioData;
  
  public void trimData(int paramInt) {
    if (this.audioData == null || paramInt == 0) {
      this.audioData = null;
    } else if (this.audioData.length > paramInt) {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.audioData, 0, arrayOfByte, 0, paramInt);
      this.audioData = arrayOfByte;
    } 
  }
  
  public SoundBuffer(byte[] paramArrayOfbyte, AudioFormat paramAudioFormat) {
    this.audioData = paramArrayOfbyte;
    this.audioFormat = paramAudioFormat;
  }
  
  public void cleanup() {
    this.audioData = null;
    this.audioFormat = null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SoundBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */