package paulscode.sound.libraries;

import paulscode.sound.SoundSystemException;

public class LibraryLWJGLOpenAL$Exception extends SoundSystemException {
  public static final int INVALID_ENUM;
  
  public static final int INVALID_VALUE;
  
  public static final int INVALID_OPERATION;
  
  public static final int NO_AL_PITCH;
  
  public static final int OUT_OF_MEMORY;
  
  public static final int INVALID_NAME;
  
  public static final int CREATE = 101;
  
  public static final int LISTENER = 107;
  
  public LibraryLWJGLOpenAL$Exception(String paramString) {
    super(paramString);
  }
  
  static {
    INVALID_ENUM = 103;
    INVALID_NAME = 102;
    INVALID_OPERATION = 105;
    OUT_OF_MEMORY = 106;
    NO_AL_PITCH = 108;
    INVALID_VALUE = 104;
  }
  
  public LibraryLWJGLOpenAL$Exception(String paramString, int paramInt) {
    super(paramString, paramInt);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\LibraryLWJGLOpenAL$Exception.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */