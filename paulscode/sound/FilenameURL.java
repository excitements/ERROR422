package paulscode.sound;

import java.net.URL;

public class FilenameURL {
  private URL url = null;
  
  private String filename = null;
  
  private SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  public FilenameURL(String paramString) {
    this.filename = paramString;
    this.url = null;
  }
  
  public FilenameURL(URL paramURL, String paramString) {
    this.filename = paramString;
    this.url = paramURL;
  }
  
  private void printStackTrace(Exception paramException) {
    this.logger.printStackTrace(paramException, 1);
  }
  
  public String getFilename() {
    return this.filename;
  }
  
  private void errorMessage(String paramString) {
    this.logger.errorMessage("MidiChannel", paramString, 0);
  }
  
  public URL getURL() {
    if (this.url == null)
      if (this.filename.matches(SoundSystemConfig.PREFIX_URL)) {
        try {
          this.url = new URL(this.filename);
        } catch (Exception exception) {
          errorMessage("Unable to access online URL in method 'getURL'");
          printStackTrace(exception);
          return null;
        } 
      } else {
        this.url = getClass().getClassLoader().getResource(SoundSystemConfig.getSoundFilesPackage() + this.filename);
      }  
    return this.url;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\FilenameURL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */