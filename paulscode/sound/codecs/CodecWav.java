package paulscode.sound.codecs;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import paulscode.sound.ICodec;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

public class CodecWav implements ICodec {
  private static final boolean GET;
  
  private AudioInputStream myAudioInputStream = null;
  
  private boolean endOfStream = false;
  
  private static final boolean XXX;
  
  private boolean initialized = false;
  
  private static final boolean SET = true;
  
  private SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  private synchronized boolean endOfStream(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.endOfStream = paramBoolean2; 
    return this.endOfStream;
  }
  
  private static byte[] trimArray(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = null;
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > paramInt) {
      arrayOfByte = new byte[paramInt];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramInt);
    } 
    return arrayOfByte;
  }
  
  public boolean initialized() {
    return initialized(false, false);
  }
  
  public SoundBuffer read() {
    if (this.myAudioInputStream == null)
      return null; 
    AudioFormat audioFormat = this.myAudioInputStream.getFormat();
    if (audioFormat == null) {
      errorMessage("Audio Format null in method 'read'");
      return null;
    } 
    int i = 0;
    int j = 0;
    byte[] arrayOfByte1 = new byte[SoundSystemConfig.getStreamingBufferSize()];
    try {
      while (!endOfStream(false, false) && i < arrayOfByte1.length) {
        if ((j = this.myAudioInputStream.read(arrayOfByte1, i, arrayOfByte1.length - i)) <= 0) {
          endOfStream(true, true);
          break;
        } 
        i += j;
      } 
    } catch (IOException iOException) {
      endOfStream(true, true);
      return null;
    } 
    if (i <= 0)
      return null; 
    if (i < arrayOfByte1.length)
      arrayOfByte1 = trimArray(arrayOfByte1, i); 
    byte[] arrayOfByte2 = convertAudioBytes(arrayOfByte1, (audioFormat.getSampleSizeInBits() == 16));
    return new SoundBuffer(arrayOfByte2, audioFormat);
  }
  
  public boolean endOfStream() {
    return endOfStream(false, false);
  }
  
  public SoundBuffer readAll() {
    if (this.myAudioInputStream == null) {
      errorMessage("Audio input stream null in method 'readAll'");
      return null;
    } 
    AudioFormat audioFormat = this.myAudioInputStream.getFormat();
    if (audioFormat == null) {
      errorMessage("Audio Format null in method 'readAll'");
      return null;
    } 
    byte[] arrayOfByte1 = null;
    int i = audioFormat.getChannels() * (int)this.myAudioInputStream.getFrameLength() * audioFormat.getSampleSizeInBits() / 8;
    if (i > 0) {
      arrayOfByte1 = new byte[audioFormat.getChannels() * (int)this.myAudioInputStream.getFrameLength() * audioFormat.getSampleSizeInBits() / 8];
      int j = 0;
      int k = 0;
      try {
        while ((j = this.myAudioInputStream.read(arrayOfByte1, k, arrayOfByte1.length - k)) != -1 && k < arrayOfByte1.length)
          k += j; 
      } catch (IOException iOException) {
        errorMessage("Exception thrown while reading from the AudioInputStream (location #1).");
        printStackTrace(iOException);
        return null;
      } 
    } else {
      int j = 0;
      int k = 0;
      int m = 0;
      byte[] arrayOfByte = null;
      arrayOfByte = new byte[SoundSystemConfig.getFileChunkSize()];
      while (!endOfStream(false, false) && j < SoundSystemConfig.getMaxFileSize()) {
        k = 0;
        m = 0;
        try {
          while (k < arrayOfByte.length) {
            if ((m = this.myAudioInputStream.read(arrayOfByte, k, arrayOfByte.length - k)) <= 0) {
              endOfStream(true, true);
              break;
            } 
            k += m;
          } 
        } catch (IOException iOException) {
          errorMessage("Exception thrown while reading from the AudioInputStream (location #2).");
          printStackTrace(iOException);
          return null;
        } 
        j += k;
        arrayOfByte1 = appendByteArrays(arrayOfByte1, arrayOfByte, k);
      } 
    } 
    byte[] arrayOfByte2 = convertAudioBytes(arrayOfByte1, (audioFormat.getSampleSizeInBits() == 16));
    SoundBuffer soundBuffer = new SoundBuffer(arrayOfByte2, audioFormat);
    try {
      this.myAudioInputStream.close();
    } catch (IOException iOException) {}
    return soundBuffer;
  }
  
  private void printStackTrace(Exception paramException) {
    this.logger.printStackTrace(paramException, 1);
  }
  
  public void cleanup() {
    if (this.myAudioInputStream != null)
      try {
        this.myAudioInputStream.close();
      } catch (Exception exception) {} 
    this.myAudioInputStream = null;
  }
  
  private static byte[] appendByteArrays(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    byte[] arrayOfByte;
    if (paramArrayOfbyte1 == null && paramArrayOfbyte2 == null)
      return null; 
    if (paramArrayOfbyte1 == null) {
      arrayOfByte = new byte[paramInt];
      System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, 0, paramInt);
      paramArrayOfbyte2 = null;
    } else if (paramArrayOfbyte2 == null) {
      arrayOfByte = new byte[paramArrayOfbyte1.length];
      System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
      paramArrayOfbyte1 = null;
    } else {
      arrayOfByte = new byte[paramArrayOfbyte1.length + paramInt];
      System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
      System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, paramInt);
      paramArrayOfbyte1 = null;
      paramArrayOfbyte2 = null;
    } 
    return arrayOfByte;
  }
  
  public AudioFormat getAudioFormat() {
    return (this.myAudioInputStream == null) ? null : this.myAudioInputStream.getFormat();
  }
  
  private void errorMessage(String paramString) {
    this.logger.errorMessage("CodecWav", paramString, 0);
  }
  
  private synchronized boolean initialized(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.initialized = paramBoolean2; 
    return this.initialized;
  }
  
  private static byte[] convertAudioBytes(byte[] paramArrayOfbyte, boolean paramBoolean) {
    ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(paramArrayOfbyte.length);
    byteBuffer1.order(ByteOrder.nativeOrder());
    ByteBuffer byteBuffer2 = ByteBuffer.wrap(paramArrayOfbyte);
    byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
    if (paramBoolean) {
      ShortBuffer shortBuffer1 = byteBuffer1.asShortBuffer();
      ShortBuffer shortBuffer2 = byteBuffer2.asShortBuffer();
      while (shortBuffer2.hasRemaining())
        shortBuffer1.put(shortBuffer2.get()); 
    } else {
      while (byteBuffer2.hasRemaining())
        byteBuffer1.put(byteBuffer2.get()); 
    } 
    byteBuffer1.rewind();
    if (!byteBuffer1.hasArray()) {
      byte[] arrayOfByte = new byte[byteBuffer1.capacity()];
      byteBuffer1.get(arrayOfByte);
      byteBuffer1.clear();
      return arrayOfByte;
    } 
    return byteBuffer1.array();
  }
  
  static {
    GET = false;
    XXX = false;
  }
  
  public void reverseByteOrder(boolean paramBoolean) {}
  
  public boolean initialize(URL paramURL) {
    initialized(true, false);
    cleanup();
    if (paramURL == null) {
      errorMessage("url null in method 'initialize'");
      cleanup();
      return false;
    } 
    try {
      this.myAudioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(paramURL.openStream()));
    } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
      errorMessage("Unsupported audio format in method 'initialize'");
      printStackTrace(unsupportedAudioFileException);
      return false;
    } catch (IOException iOException) {
      errorMessage("Error setting up audio input stream in method 'initialize'");
      printStackTrace(iOException);
      return false;
    } 
    endOfStream(true, false);
    initialized(true, true);
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\codecs\CodecWav.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */