import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Fso extends YGc {
  public Fso() {
    super("default", (File)null, "Default", (Gax)null);
  }
  
  protected void Dne() {
    this.Dne = (Gax)"The default look of Minecraft";
  }
  
  protected InputStream FWm(String paramString) {
    InputStream inputStream = Fso.class.getResourceAsStream(paramString);
    if (inputStream == null)
      throw new FileNotFoundException(paramString); 
    return inputStream;
  }
  
  public boolean Dne(String paramString) {
    return (Fso.class.getResourceAsStream(paramString) != null);
  }
  
  static {
  
  }
  
  public boolean Dne() {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Fso.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */