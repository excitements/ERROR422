package paulscode.sound;

import java.util.Locale;

class SoundSystemConfig$Codec {
  public String extensionRegX = "";
  
  public Class iCodecClass;
  
  public SoundSystemConfig$Codec(String paramString, Class paramClass) {
    if (paramString != null && paramString.length() > 0) {
      this.extensionRegX = ".*";
      for (byte b = 0; b < paramString.length(); b++) {
        String str = paramString.substring(b, b + 1);
        this.extensionRegX += "[" + str.toLowerCase(Locale.ENGLISH) + str.toUpperCase(Locale.ENGLISH) + "]";
      } 
      this.extensionRegX += "$";
    } 
    this.iCodecClass = paramClass;
  }
  
  public ICodec getInstance() {
    if (this.iCodecClass == null)
      return null; 
    ICodec iCodec = null;
    try {
      iCodec = (ICodec)this.iCodecClass.newInstance();
    } catch (InstantiationException instantiationException) {
      instantiationErrorMessage();
      return null;
    } catch (IllegalAccessException illegalAccessException) {
      instantiationErrorMessage();
      return null;
    } catch (ExceptionInInitializerError exceptionInInitializerError) {
      instantiationErrorMessage();
      return null;
    } catch (SecurityException securityException) {
      instantiationErrorMessage();
      return null;
    } 
    if (iCodec == null) {
      instantiationErrorMessage();
      return null;
    } 
    return iCodec;
  }
  
  private void instantiationErrorMessage() {
    SoundSystemConfig.access$200("Unrecognized ICodec implementation in method 'getInstance'.  Ensure that the implementing class has one public, parameterless constructor.");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SoundSystemConfig$Codec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */