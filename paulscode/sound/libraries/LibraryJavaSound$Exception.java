package paulscode.sound.libraries;

import paulscode.sound.SoundSystemException;

public class LibraryJavaSound$Exception extends SoundSystemException {
  public static LibraryJavaSound$MixerRanking mixerRanking;
  
  public static final int MIXER_PROBLEM = 101;
  
  public LibraryJavaSound$Exception(String paramString, int paramInt) {
    super(paramString, paramInt);
  }
  
  static {
    mixerRanking = null;
  }
  
  public LibraryJavaSound$Exception(String paramString, LibraryJavaSound$MixerRanking paramLibraryJavaSound$MixerRanking) {
    super(paramString, 101);
    mixerRanking = paramLibraryJavaSound$MixerRanking;
  }
  
  public LibraryJavaSound$Exception(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\libraries\LibraryJavaSound$Exception.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */