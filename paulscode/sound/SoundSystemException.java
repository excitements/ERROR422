package paulscode.sound;

public class SoundSystemException extends Exception {
  public static final int CLASS_TYPE_MISMATCH;
  
  public static final int ERROR_NONE;
  
  private int myType = 1;
  
  public static final int LIBRARY_TYPE;
  
  public static final int LIBRARY_NULL;
  
  public static final int NULL_PARAMETER;
  
  public static final int UNKNOWN_ERROR = 1;
  
  public int getType() {
    return this.myType;
  }
  
  public SoundSystemException(String paramString, int paramInt) {
    super(paramString);
    this.myType = paramInt;
  }
  
  public SoundSystemException(String paramString) {
    super(paramString);
  }
  
  static {
    NULL_PARAMETER = 2;
    LIBRARY_NULL = 4;
    CLASS_TYPE_MISMATCH = 3;
    ERROR_NONE = 0;
    LIBRARY_TYPE = 5;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SoundSystemException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */