package paulscode.sound;

import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;

public class Channel {
  public Source attachedSource = null;
  
  protected Class libraryType = Library.class;
  
  private SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  public int channelType;
  
  public int buffersUnqueued = 0;
  
  public void flush() {}
  
  public void rewind() {}
  
  public float millisecondsPlayed() {
    return -1.0F;
  }
  
  public void play() {}
  
  protected void errorMessage(String paramString) {
    this.logger.errorMessage(getClassName(), paramString, 0);
  }
  
  public void setAudioFormat(AudioFormat paramAudioFormat) {}
  
  protected void printStackTrace(Exception paramException) {
    this.logger.printStackTrace(paramException, 1);
  }
  
  protected void message(String paramString) {
    this.logger.message(paramString, 0);
  }
  
  public String getClassName() {
    String str = SoundSystemConfig.getLibraryTitle(this.libraryType);
    return str.equals("No Sound") ? "Channel" : ("Channel" + str);
  }
  
  public boolean playing() {
    return false;
  }
  
  protected boolean errorCheck(boolean paramBoolean, String paramString) {
    return this.logger.errorCheck(paramBoolean, getClassName(), paramString, 0);
  }
  
  public boolean preLoadBuffers(LinkedList paramLinkedList) {
    return true;
  }
  
  public void close() {}
  
  public void stop() {}
  
  public void pause() {}
  
  public int feedRawAudioData(byte[] paramArrayOfbyte) {
    return 1;
  }
  
  public int buffersProcessed() {
    return 0;
  }
  
  protected void importantMessage(String paramString) {
    this.logger.importantMessage(paramString, 0);
  }
  
  public Channel(int paramInt) {
    this.channelType = paramInt;
  }
  
  public void cleanup() {
    this.logger = null;
  }
  
  public boolean queueBuffer(byte[] paramArrayOfbyte) {
    return false;
  }
  
  public boolean processBuffer() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\Channel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */