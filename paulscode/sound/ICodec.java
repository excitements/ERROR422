package paulscode.sound;

import java.net.URL;
import javax.sound.sampled.AudioFormat;

public interface ICodec {
  boolean endOfStream();
  
  SoundBuffer readAll();
  
  boolean initialize(URL paramURL);
  
  AudioFormat getAudioFormat();
  
  void cleanup();
  
  void reverseByteOrder(boolean paramBoolean);
  
  SoundBuffer read();
  
  static {
  
  }
  
  boolean initialized();
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\ICodec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */