import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WUf extends YGc {
  public WUf(String paramString, File paramFile, Gax paramGax) {
    super(paramString, paramFile, paramFile.getName(), paramGax);
  }
  
  public boolean Dne(String paramString) {
    File file = new File((File)this.Dne, paramString);
    return (file.exists() && file.isFile());
  }
  
  protected InputStream FWm(String paramString) {
    File file = new File((File)this.Dne, paramString.substring(1));
    if (!file.exists())
      throw new FileNotFoundException(paramString); 
    return new BufferedInputStream(new FileInputStream(file));
  }
  
  public boolean Dne() {
    File file = new File((File)this.Dne, "textures/");
    boolean bool1 = (file.exists() && file.isDirectory()) ? true : false;
    boolean bool2 = (Dne("terrain.png") || Dne("gui/items.png")) ? true : false;
    return (bool1 || !bool2);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WUf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */