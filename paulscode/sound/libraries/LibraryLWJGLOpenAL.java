package paulscode.sound.libraries;

import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ICodec;
import paulscode.sound.Library;
import paulscode.sound.ListenerData;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

public class LibraryLWJGLOpenAL extends Library {
  private HashMap ALBufferMap = null;
  
  private FloatBuffer listenerVelocity = null;
  
  private static final boolean GET = false;
  
  private FloatBuffer listenerOrientation = null;
  
  private static final boolean XXX;
  
  private static boolean alPitchSupported;
  
  private FloatBuffer listenerPositionAL = null;
  
  private static final boolean SET = true;
  
  public void init() {
    boolean bool = false;
    try {
      AL.create();
      bool = checkALError();
    } catch (LWJGLException lWJGLException) {
      errorMessage("Unable to initialize OpenAL.  Probable cause: OpenAL not supported.");
      printStackTrace((Exception)lWJGLException);
      throw new LibraryLWJGLOpenAL$Exception(lWJGLException.getMessage(), 101);
    } 
    if (bool) {
      importantMessage("OpenAL did not initialize properly!");
    } else {
      message("OpenAL initialized.");
    } 
    this.listenerPositionAL = BufferUtils.createFloatBuffer(3).put(new float[] { this.listener.position.x, this.listener.position.y, this.listener.position.z });
    this.listenerOrientation = BufferUtils.createFloatBuffer(6).put(new float[] { this.listener.lookAt.x, this.listener.lookAt.y, this.listener.lookAt.z, this.listener.up.x, this.listener.up.y, this.listener.up.z });
    this.listenerVelocity = BufferUtils.createFloatBuffer(3).put(new float[] { 0.0F, 0.0F, 0.0F });
    this.listenerPositionAL.flip();
    this.listenerOrientation.flip();
    this.listenerVelocity.flip();
    AL10.alListener(4100, this.listenerPositionAL);
    bool = (checkALError() || bool);
    AL10.alListener(4111, this.listenerOrientation);
    bool = (checkALError() || bool);
    AL10.alListener(4102, this.listenerVelocity);
    bool = (checkALError() || bool);
    AL10.alDopplerFactor(SoundSystemConfig.getDopplerFactor());
    bool = (checkALError() || bool);
    AL10.alDopplerVelocity(SoundSystemConfig.getDopplerVelocity());
    bool = (checkALError() || bool);
    if (bool) {
      importantMessage("OpenAL did not initialize properly!");
      throw new LibraryLWJGLOpenAL$Exception("Problem encountered while loading OpenAL or creating the listener.  Probable cause:  OpenAL not supported", 101);
    } 
    super.init();
    ChannelLWJGLOpenAL channelLWJGLOpenAL = this.normalChannels.get(1);
    try {
      AL10.alSourcef(channelLWJGLOpenAL.ALSource.get(0), 4099, 1.0F);
      if (checkALError()) {
        alPitchSupported(true, false);
        throw new LibraryLWJGLOpenAL$Exception("OpenAL: AL_PITCH not supported.", 108);
      } 
      alPitchSupported(true, true);
    } catch (Exception exception) {
      alPitchSupported(true, false);
      throw new LibraryLWJGLOpenAL$Exception("OpenAL: AL_PITCH not supported.", 108);
    } 
  }
  
  public void setMasterVolume(float paramFloat) {
    super.setMasterVolume(paramFloat);
    AL10.alListenerf(4106, paramFloat);
    checkALError();
  }
  
  public void quickPlay(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
    IntBuffer intBuffer = null;
    if (!paramBoolean2) {
      intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
      if (intBuffer == null)
        loadSound(paramFilenameURL); 
      intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
      if (intBuffer == null) {
        errorMessage("Sound buffer was not created for " + paramFilenameURL.getFilename());
        return;
      } 
    } 
    SoundBuffer soundBuffer = null;
    if (!paramBoolean2) {
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null && !loadSound(paramFilenameURL)) {
        errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
        return;
      } 
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null) {
        errorMessage("Source '" + paramString + "' was not created " + "because audio data was not found for " + paramFilenameURL.getFilename());
        return;
      } 
    } 
    SourceLWJGLOpenAL sourceLWJGLOpenAL = new SourceLWJGLOpenAL(this.listenerPositionAL, intBuffer, paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, soundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, false);
    this.sourceMap.put(paramString, sourceLWJGLOpenAL);
    play(sourceLWJGLOpenAL);
    if (paramBoolean4)
      sourceLWJGLOpenAL.setTemporary(true); 
  }
  
  public void newSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    IntBuffer intBuffer = null;
    if (!paramBoolean2) {
      intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
      if (intBuffer == null && !loadSound(paramFilenameURL)) {
        errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
        return;
      } 
      intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
      if (intBuffer == null) {
        errorMessage("Source '" + paramString + "' was not created " + "because a sound buffer was not found for " + paramFilenameURL.getFilename());
        return;
      } 
    } 
    SoundBuffer soundBuffer = null;
    if (!paramBoolean2) {
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null && !loadSound(paramFilenameURL)) {
        errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
        return;
      } 
      soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
      if (soundBuffer == null) {
        errorMessage("Source '" + paramString + "' was not created " + "because audio data was not found for " + paramFilenameURL.getFilename());
        return;
      } 
    } 
    this.sourceMap.put(paramString, new SourceLWJGLOpenAL(this.listenerPositionAL, intBuffer, paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, soundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, false));
  }
  
  public boolean loadSound(FilenameURL paramFilenameURL) {
    if (this.bufferMap == null) {
      this.bufferMap = new HashMap<Object, Object>();
      importantMessage("Buffer Map was null in method 'loadSound'");
    } 
    if (this.ALBufferMap == null) {
      this.ALBufferMap = new HashMap<Object, Object>();
      importantMessage("Open AL Buffer Map was null in method'loadSound'");
    } 
    if (errorCheck((paramFilenameURL == null), "Filename/URL not specified in method 'loadSound'"))
      return false; 
    if (this.bufferMap.get(paramFilenameURL.getFilename()) != null)
      return true; 
    ICodec iCodec = SoundSystemConfig.getCodec(paramFilenameURL.getFilename());
    if (errorCheck((iCodec == null), "No codec found for file '" + paramFilenameURL.getFilename() + "' in method 'loadSound'"))
      return false; 
    iCodec.reverseByteOrder(true);
    URL uRL = paramFilenameURL.getURL();
    if (errorCheck((uRL == null), "Unable to open file '" + paramFilenameURL.getFilename() + "' in method 'loadSound'"))
      return false; 
    iCodec.initialize(uRL);
    SoundBuffer soundBuffer = iCodec.readAll();
    iCodec.cleanup();
    iCodec = null;
    if (errorCheck((soundBuffer == null), "Sound buffer null in method 'loadSound'"))
      return false; 
    this.bufferMap.put(paramFilenameURL.getFilename(), soundBuffer);
    AudioFormat audioFormat = soundBuffer.audioFormat;
    char c = Character.MIN_VALUE;
    if (audioFormat.getChannels() == 1) {
      if (audioFormat.getSampleSizeInBits() == 8) {
        c = 'ᄀ';
      } else if (audioFormat.getSampleSizeInBits() == 16) {
        c = 'ᄁ';
      } else {
        errorMessage("Illegal sample size in method 'loadSound'");
        return false;
      } 
    } else if (audioFormat.getChannels() == 2) {
      if (audioFormat.getSampleSizeInBits() == 8) {
        c = 'ᄂ';
      } else if (audioFormat.getSampleSizeInBits() == 16) {
        c = 'ᄃ';
      } else {
        errorMessage("Illegal sample size in method 'loadSound'");
        return false;
      } 
    } else {
      errorMessage("File neither mono nor stereo in method 'loadSound'");
      return false;
    } 
    IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
    AL10.alGenBuffers(intBuffer);
    if (errorCheck((AL10.alGetError() != 0), "alGenBuffers error when loading " + paramFilenameURL.getFilename()))
      return false; 
    AL10.alBufferData(intBuffer.get(0), c, (ByteBuffer)BufferUtils.createByteBuffer(soundBuffer.audioData.length).put(soundBuffer.audioData).flip(), (int)audioFormat.getSampleRate());
    if (errorCheck((AL10.alGetError() != 0), "alBufferData error when loading " + paramFilenameURL.getFilename()) && errorCheck((intBuffer == null), "Sound buffer was not created for " + paramFilenameURL.getFilename()))
      return false; 
    this.ALBufferMap.put(paramFilenameURL.getFilename(), intBuffer);
    return true;
  }
  
  static {
    XXX = false;
    alPitchSupported = true;
  }
  
  public void setListenerAngle(float paramFloat) {
    super.setListenerAngle(paramFloat);
    this.listenerOrientation.put(0, this.listener.lookAt.x);
    this.listenerOrientation.put(2, this.listener.lookAt.z);
    AL10.alListener(4111, this.listenerOrientation);
    checkALError();
  }
  
  public static boolean libraryCompatible() {
    if (AL.isCreated())
      return true; 
    try {
      AL.create();
    } catch (Exception exception) {
      return false;
    } 
    try {
      AL.destroy();
    } catch (Exception exception) {}
    return true;
  }
  
  public static boolean alPitchSupported() {
    return alPitchSupported(false, false);
  }
  
  public void cleanup() {
    super.cleanup();
    Set set = this.bufferMap.keySet();
    for (String str : set) {
      IntBuffer intBuffer = (IntBuffer)this.ALBufferMap.get(str);
      if (intBuffer != null) {
        AL10.alDeleteBuffers(intBuffer);
        checkALError();
        intBuffer.clear();
      } 
    } 
    this.bufferMap.clear();
    AL.destroy();
    this.bufferMap = null;
    this.listenerPositionAL = null;
    this.listenerOrientation = null;
    this.listenerVelocity = null;
  }
  
  public void copySources(HashMap paramHashMap) {
    if (paramHashMap == null)
      return; 
    Set set = paramHashMap.keySet();
    Iterator<String> iterator = set.iterator();
    if (this.bufferMap == null) {
      this.bufferMap = new HashMap<Object, Object>();
      importantMessage("Buffer Map was null in method 'copySources'");
    } 
    if (this.ALBufferMap == null) {
      this.ALBufferMap = new HashMap<Object, Object>();
      importantMessage("Open AL Buffer Map was null in method'copySources'");
    } 
    this.sourceMap.clear();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Source source = (Source)paramHashMap.get(str);
      if (source != null) {
        SoundBuffer soundBuffer = null;
        if (!source.toStream) {
          loadSound(source.filenameURL);
          soundBuffer = (SoundBuffer)this.bufferMap.get(source.filenameURL.getFilename());
        } 
        if (source.toStream || soundBuffer != null)
          this.sourceMap.put(str, new SourceLWJGLOpenAL(this.listenerPositionAL, (IntBuffer)this.ALBufferMap.get(source.filenameURL.getFilename()), source, soundBuffer)); 
      } 
    } 
  }
  
  public void unloadSound(String paramString) {
    this.ALBufferMap.remove(paramString);
    super.unloadSound(paramString);
  }
  
  protected Channel createChannel(int paramInt) {
    IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
    try {
      AL10.alGenSources(intBuffer);
    } catch (Exception exception) {
      AL10.alGetError();
      return null;
    } 
    return (AL10.alGetError() != 0) ? null : new ChannelLWJGLOpenAL(paramInt, intBuffer);
  }
  
  public boolean loadSound(SoundBuffer paramSoundBuffer, String paramString) {
    if (this.bufferMap == null) {
      this.bufferMap = new HashMap<Object, Object>();
      importantMessage("Buffer Map was null in method 'loadSound'");
    } 
    if (this.ALBufferMap == null) {
      this.ALBufferMap = new HashMap<Object, Object>();
      importantMessage("Open AL Buffer Map was null in method'loadSound'");
    } 
    if (errorCheck((paramString == null), "Identifier not specified in method 'loadSound'"))
      return false; 
    if (this.bufferMap.get(paramString) != null)
      return true; 
    if (errorCheck((paramSoundBuffer == null), "Sound buffer null in method 'loadSound'"))
      return false; 
    this.bufferMap.put(paramString, paramSoundBuffer);
    AudioFormat audioFormat = paramSoundBuffer.audioFormat;
    char c = Character.MIN_VALUE;
    if (audioFormat.getChannels() == 1) {
      if (audioFormat.getSampleSizeInBits() == 8) {
        c = 'ᄀ';
      } else if (audioFormat.getSampleSizeInBits() == 16) {
        c = 'ᄁ';
      } else {
        errorMessage("Illegal sample size in method 'loadSound'");
        return false;
      } 
    } else if (audioFormat.getChannels() == 2) {
      if (audioFormat.getSampleSizeInBits() == 8) {
        c = 'ᄂ';
      } else if (audioFormat.getSampleSizeInBits() == 16) {
        c = 'ᄃ';
      } else {
        errorMessage("Illegal sample size in method 'loadSound'");
        return false;
      } 
    } else {
      errorMessage("File neither mono nor stereo in method 'loadSound'");
      return false;
    } 
    IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
    AL10.alGenBuffers(intBuffer);
    if (errorCheck((AL10.alGetError() != 0), "alGenBuffers error when saving " + paramString))
      return false; 
    AL10.alBufferData(intBuffer.get(0), c, (ByteBuffer)BufferUtils.createByteBuffer(paramSoundBuffer.audioData.length).put(paramSoundBuffer.audioData).flip(), (int)audioFormat.getSampleRate());
    if (errorCheck((AL10.alGetError() != 0), "alBufferData error when saving " + paramString) && errorCheck((intBuffer == null), "Sound buffer was not created for " + paramString))
      return false; 
    this.ALBufferMap.put(paramString, intBuffer);
    return true;
  }
  
  public void rawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
    this.sourceMap.put(paramString, new SourceLWJGLOpenAL(this.listenerPositionAL, paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
  }
  
  public static String getTitle() {
    return "LWJGL OpenAL";
  }
  
  public void setListenerData(ListenerData paramListenerData) {
    super.setListenerData(paramListenerData);
    this.listenerPositionAL.put(0, paramListenerData.position.x);
    this.listenerPositionAL.put(1, paramListenerData.position.y);
    this.listenerPositionAL.put(2, paramListenerData.position.z);
    AL10.alListener(4100, this.listenerPositionAL);
    checkALError();
    this.listenerOrientation.put(0, paramListenerData.lookAt.x);
    this.listenerOrientation.put(1, paramListenerData.lookAt.y);
    this.listenerOrientation.put(2, paramListenerData.lookAt.z);
    this.listenerOrientation.put(3, paramListenerData.up.x);
    this.listenerOrientation.put(4, paramListenerData.up.y);
    this.listenerOrientation.put(5, paramListenerData.up.z);
    AL10.alListener(4111, this.listenerOrientation);
    checkALError();
    this.listenerVelocity.put(0, paramListenerData.velocity.x);
    this.listenerVelocity.put(1, paramListenerData.velocity.y);
    this.listenerVelocity.put(2, paramListenerData.velocity.z);
    AL10.alListener(4102, this.listenerVelocity);
    checkALError();
  }
  
  public LibraryLWJGLOpenAL() {
    this.ALBufferMap = new HashMap<Object, Object>();
    this.reverseByteOrder = true;
  }
  
  public void setListenerVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    super.setListenerVelocity(paramFloat1, paramFloat2, paramFloat3);
    this.listenerVelocity.put(0, this.listener.velocity.x);
    this.listenerVelocity.put(1, this.listener.velocity.y);
    this.listenerVelocity.put(2, this.listener.velocity.z);
    AL10.alListener(4102, this.listenerVelocity);
  }
  
  public void setListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
    super.setListenerPosition(paramFloat1, paramFloat2, paramFloat3);
    this.listenerPositionAL.put(0, paramFloat1);
    this.listenerPositionAL.put(1, paramFloat2);
    this.listenerPositionAL.put(2, paramFloat3);
    AL10.alListener(4100, this.listenerPositionAL);
    checkALError();
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
  
  private static synchronized boolean alPitchSupported(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 == true)
      alPitchSupported = paramBoolean2; 
    return alPitchSupported;
  }
  
  public void setListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    super.setListenerOrientation(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    this.listenerOrientation.put(0, paramFloat1);
    this.listenerOrientation.put(1, paramFloat2);
    this.listenerOrientation.put(2, paramFloat3);
    this.listenerOrientation.put(3, paramFloat4);
    this.listenerOrientation.put(4, paramFloat5);
    this.listenerOrientation.put(5, paramFloat6);
    AL10.alListener(4111, this.listenerOrientation);
    checkALError();
  }
  
  public static String getDescription() {
    return "The LWJGL binding of OpenAL.  For more information, see http://www.lwjgl.org";
  }
  
  public String getClassName() {
    return "LibraryLWJGLOpenAL";
  }
  
  public void dopplerChanged() {
    super.dopplerChanged();
    AL10.alDopplerFactor(SoundSystemConfig.getDopplerFactor());
    checkALError();
    AL10.alDopplerVelocity(SoundSystemConfig.getDopplerVelocity());
    checkALError();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\LibraryLWJGLOpenAL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */