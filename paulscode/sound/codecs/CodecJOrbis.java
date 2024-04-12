package paulscode.sound.codecs;

import AOl;
import Lth;
import MOU;
import PRc;
import aHQ;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.ICodec;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;
import qlF;
import tYH;
import ytS;

public class CodecJOrbis implements ICodec {
  private qlF joggPacket = new qlF();
  
  private InputStream inputStream;
  
  private tYH joggStreamState = new tYH();
  
  private int convertedBufferSize;
  
  private static final boolean XXX = false;
  
  protected URL url;
  
  private byte[] convertedBuffer = null;
  
  private static final boolean SET;
  
  private byte[] buffer = null;
  
  private SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  private int bufferSize;
  
  private int index = 0;
  
  private int count = 0;
  
  private ytS joggSyncState = new ytS();
  
  private boolean initialized = false;
  
  private aHQ joggPage = new aHQ();
  
  private MOU jorbisBlock = new MOU(this.jorbisDspState);
  
  private boolean endOfStream = false;
  
  private int[] pcmIndex;
  
  private AOl jorbisDspState = new AOl();
  
  private AudioFormat audioFormat;
  
  protected URLConnection urlConnection = null;
  
  private PRc jorbisComment = new PRc();
  
  private Lth jorbisInfo = new Lth();
  
  private static final boolean GET = false;
  
  private float[][][] pcmInfo;
  
  private void errorMessage(String paramString) {
    this.logger.errorMessage("CodecJOrbis", paramString, 0);
  }
  
  private synchronized boolean endOfStream(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.endOfStream = paramBoolean2; 
    return this.endOfStream;
  }
  
  public void cleanup() {
    this.joggStreamState.FWm();
    this.jorbisBlock.Dne();
    this.jorbisDspState.Dne();
    this.jorbisInfo.FWm();
    this.joggSyncState.Dne();
    if (this.inputStream != null)
      try {
        this.inputStream.close();
      } catch (IOException iOException) {} 
    this.joggStreamState = null;
    this.jorbisBlock = null;
    this.jorbisDspState = null;
    this.jorbisInfo = null;
    this.joggSyncState = null;
    this.inputStream = null;
  }
  
  public SoundBuffer read() {
    byte[] arrayOfByte;
    for (arrayOfByte = null; !endOfStream(false, false) && (arrayOfByte == null || arrayOfByte.length < SoundSystemConfig.getStreamingBufferSize()); arrayOfByte = appendByteArrays(arrayOfByte, readBytes())) {
      if (arrayOfByte == null) {
        arrayOfByte = readBytes();
        continue;
      } 
    } 
    return (arrayOfByte == null) ? null : new SoundBuffer(arrayOfByte, this.audioFormat);
  }
  
  protected InputStream openInputStream() {
    return this.urlConnection.getInputStream();
  }
  
  public boolean initialize(URL paramURL) {
    initialized(true, false);
    if (this.joggStreamState != null)
      this.joggStreamState.FWm(); 
    if (this.jorbisBlock != null)
      this.jorbisBlock.Dne(); 
    if (this.jorbisDspState != null)
      this.jorbisDspState.Dne(); 
    if (this.jorbisInfo != null)
      this.jorbisInfo.FWm(); 
    if (this.joggSyncState != null)
      this.joggSyncState.Dne(); 
    if (this.inputStream != null)
      try {
        this.inputStream.close();
      } catch (IOException iOException) {} 
    this.url = paramURL;
    this.bufferSize = 8192;
    this.buffer = null;
    this.count = 0;
    this.index = 0;
    this.joggStreamState = new tYH();
    this.jorbisBlock = new MOU(this.jorbisDspState);
    this.jorbisDspState = new AOl();
    this.jorbisInfo = new Lth();
    this.joggSyncState = new ytS();
    try {
      this.urlConnection = paramURL.openConnection();
    } catch (UnknownServiceException unknownServiceException) {
      errorMessage("Unable to create a UrlConnection in method 'initialize'.");
      printStackTrace(unknownServiceException);
      cleanup();
      return false;
    } catch (IOException iOException) {
      errorMessage("Unable to create a UrlConnection in method 'initialize'.");
      printStackTrace(iOException);
      cleanup();
      return false;
    } 
    if (this.urlConnection != null)
      try {
        this.inputStream = openInputStream();
      } catch (IOException iOException) {
        errorMessage("Unable to acquire inputstream in method 'initialize'.");
        printStackTrace(iOException);
        cleanup();
        return false;
      }  
    endOfStream(true, false);
    this.joggSyncState.Dne();
    this.joggSyncState.Dne(this.bufferSize);
    this.buffer = this.joggSyncState.Dne;
    try {
      if (!readHeader()) {
        errorMessage("Error reading the header");
        return false;
      } 
    } catch (IOException iOException) {
      errorMessage("Error reading the header");
      return false;
    } 
    this.convertedBufferSize = this.bufferSize * 2;
    this.jorbisDspState.Dne(this.jorbisInfo);
    this.jorbisBlock.Dne(this.jorbisDspState);
    int i = this.jorbisInfo.FWm;
    int j = this.jorbisInfo.bzF;
    this.audioFormat = new AudioFormat(j, 16, i, true, false);
    this.pcmInfo = new float[1][][];
    this.pcmIndex = new int[this.jorbisInfo.FWm];
    initialized(true, true);
    return true;
  }
  
  private synchronized boolean initialized(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      this.initialized = paramBoolean2; 
    return this.initialized;
  }
  
  private static byte[] appendByteArrays(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte;
    if (paramArrayOfbyte1 == null && paramArrayOfbyte2 == null)
      return null; 
    if (paramArrayOfbyte1 == null) {
      arrayOfByte = new byte[paramArrayOfbyte2.length];
      System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, 0, paramArrayOfbyte2.length);
      paramArrayOfbyte2 = null;
    } else if (paramArrayOfbyte2 == null) {
      arrayOfByte = new byte[paramArrayOfbyte1.length];
      System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
      paramArrayOfbyte1 = null;
    } else {
      arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte2.length];
      System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
      System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte2.length);
      paramArrayOfbyte1 = null;
      paramArrayOfbyte2 = null;
    } 
    return arrayOfByte;
  }
  
  public void reverseByteOrder(boolean paramBoolean) {}
  
  public boolean endOfStream() {
    return endOfStream(false, false);
  }
  
  static {
    SET = true;
  }
  
  public SoundBuffer readAll() {
    byte[] arrayOfByte;
    for (arrayOfByte = null; !endOfStream(false, false); arrayOfByte = appendByteArrays(arrayOfByte, readBytes())) {
      if (arrayOfByte == null) {
        arrayOfByte = readBytes();
        continue;
      } 
    } 
    return (arrayOfByte == null) ? null : new SoundBuffer(arrayOfByte, this.audioFormat);
  }
  
  public boolean initialized() {
    return initialized(false, false);
  }
  
  private byte[] readBytes() {
    if (!initialized(false, false))
      return null; 
    if (endOfStream(false, false))
      return null; 
    if (this.convertedBuffer == null)
      this.convertedBuffer = new byte[this.convertedBufferSize]; 
    byte[] arrayOfByte = null;
    switch (this.joggSyncState.FWm(this.joggPage)) {
      case -1:
      case 0:
        break;
      default:
        this.joggStreamState.Dne(this.joggPage);
        if (this.joggPage.Dne() == 0L) {
          endOfStream(true, true);
          return null;
        } 
        while (true) {
          int i;
          switch (this.joggStreamState.FWm(this.joggPacket)) {
            case 0:
              break;
            case -1:
              continue;
            default:
              if (this.jorbisBlock.Dne(this.joggPacket) == 0)
                this.jorbisDspState.Dne(this.jorbisBlock); 
              while ((i = this.jorbisDspState.Dne(this.pcmInfo, this.pcmIndex)) > 0) {
                float[][] arrayOfFloat = this.pcmInfo[0];
                int j = (i < this.convertedBufferSize) ? i : this.convertedBufferSize;
                for (byte b = 0; b < this.jorbisInfo.FWm; b++) {
                  int k = b * 2;
                  int m = this.pcmIndex[b];
                  for (byte b1 = 0; b1 < j; b1++) {
                    int n = (int)(arrayOfFloat[b][m + b1] * 32767.0D);
                    if (n > 32767)
                      n = 32767; 
                    if (n < -32768)
                      n = -32768; 
                    if (n < 0)
                      n |= 0x8000; 
                    this.convertedBuffer[k] = (byte)n;
                    this.convertedBuffer[k + 1] = (byte)(n >>> 8);
                    k += 2 * this.jorbisInfo.FWm;
                  } 
                } 
                this.jorbisDspState.Dne(j);
                arrayOfByte = appendByteArrays(arrayOfByte, this.convertedBuffer, 2 * this.jorbisInfo.FWm * j);
              } 
              continue;
          } 
          if (this.joggPage.Qnq() != 0)
            endOfStream(true, true); 
          break;
        } 
        break;
    } 
    if (!endOfStream(false, false)) {
      this.index = this.joggSyncState.Dne(this.bufferSize);
      this.buffer = this.joggSyncState.Dne;
      try {
        this.count = this.inputStream.read(this.buffer, this.index, this.bufferSize);
      } catch (Exception exception) {
        printStackTrace(exception);
        return null;
      } 
      if (this.count == -1)
        return arrayOfByte; 
      this.joggSyncState.FWm(this.count);
      if (this.count == 0)
        endOfStream(true, true); 
    } 
    return arrayOfByte;
  }
  
  private static byte[] appendByteArrays(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    byte[] arrayOfByte;
    int i = paramInt;
    if (paramArrayOfbyte2 == null || paramArrayOfbyte2.length == 0) {
      i = 0;
    } else if (paramArrayOfbyte2.length < paramInt) {
      i = paramArrayOfbyte2.length;
    } 
    if (paramArrayOfbyte1 == null && (paramArrayOfbyte2 == null || i <= 0))
      return null; 
    if (paramArrayOfbyte1 == null) {
      arrayOfByte = new byte[i];
      System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, 0, i);
      paramArrayOfbyte2 = null;
    } else if (paramArrayOfbyte2 == null || i <= 0) {
      arrayOfByte = new byte[paramArrayOfbyte1.length];
      System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
      paramArrayOfbyte1 = null;
    } else {
      arrayOfByte = new byte[paramArrayOfbyte1.length + i];
      System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
      System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, i);
      paramArrayOfbyte1 = null;
      paramArrayOfbyte2 = null;
    } 
    return arrayOfByte;
  }
  
  private static byte[] trimArray(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = null;
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > paramInt) {
      arrayOfByte = new byte[paramInt];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramInt);
    } 
    return arrayOfByte;
  }
  
  private void printStackTrace(Exception paramException) {
    this.logger.printStackTrace(paramException, 1);
  }
  
  private boolean readHeader() {
    this.index = this.joggSyncState.Dne(this.bufferSize);
    int i = this.inputStream.read(this.joggSyncState.Dne, this.index, this.bufferSize);
    if (i < 0)
      i = 0; 
    this.joggSyncState.FWm(i);
    if (this.joggSyncState.FWm(this.joggPage) != 1) {
      if (i < this.bufferSize)
        return true; 
      errorMessage("Ogg header not recognized in method 'readHeader'.");
      return false;
    } 
    this.joggStreamState.Dne(this.joggPage.aFZ());
    this.jorbisInfo.Dne();
    this.jorbisComment.Dne();
    if (this.joggStreamState.Dne(this.joggPage) < 0) {
      errorMessage("Problem with first Ogg header page in method 'readHeader'.");
      return false;
    } 
    if (this.joggStreamState.FWm(this.joggPacket) != 1) {
      errorMessage("Problem with first Ogg header packet in method 'readHeader'.");
      return false;
    } 
    if (this.jorbisInfo.Dne(this.jorbisComment, this.joggPacket) < 0) {
      errorMessage("File does not contain Vorbis header in method 'readHeader'.");
      return false;
    } 
    byte b = 0;
    while (b < 2) {
      while (b < 2) {
        int j = this.joggSyncState.FWm(this.joggPage);
        if (j == 0)
          break; 
        if (j == 1) {
          this.joggStreamState.Dne(this.joggPage);
          while (b < 2) {
            j = this.joggStreamState.FWm(this.joggPacket);
            if (j == 0)
              break; 
            if (j == -1) {
              errorMessage("Secondary Ogg header corrupt in method 'readHeader'.");
              return false;
            } 
            this.jorbisInfo.Dne(this.jorbisComment, this.joggPacket);
            b++;
          } 
        } 
      } 
      this.index = this.joggSyncState.Dne(this.bufferSize);
      i = this.inputStream.read(this.joggSyncState.Dne, this.index, this.bufferSize);
      if (i < 0)
        i = 0; 
      if (i == 0 && b < 2) {
        errorMessage("End of file reached before finished readingOgg header in method 'readHeader'");
        return false;
      } 
      this.joggSyncState.FWm(i);
    } 
    this.index = this.joggSyncState.Dne(this.bufferSize);
    this.buffer = this.joggSyncState.Dne;
    return true;
  }
  
  public AudioFormat getAudioFormat() {
    return this.audioFormat;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\codecs\CodecJOrbis.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */