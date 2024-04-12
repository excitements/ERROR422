import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class eqx extends YGc {
  private ZipFile Dne;
  
  private void FWm() {
    if (this.Dne == null)
      this.Dne = new ZipFile((File)this.Dne); 
  }
  
  public void Dne(Snh paramSnh) {
    super.Dne(paramSnh);
    try {
      if (this.Dne != null)
        this.Dne.close(); 
    } catch (IOException iOException) {}
    this.Dne = null;
  }
  
  public boolean Dne(String paramString) {
    try {
      FWm();
      return (this.Dne.getEntry(paramString.substring(1)) != null);
    } catch (Exception exception) {
      return false;
    } 
  }
  
  protected InputStream FWm(String paramString) {
    FWm();
    ZipEntry zipEntry = this.Dne.getEntry(paramString.substring(1));
    if (zipEntry == null)
      throw new FileNotFoundException(paramString); 
    return this.Dne.getInputStream(zipEntry);
  }
  
  public eqx(String paramString, File paramFile, Gax paramGax) {
    super(paramString, paramFile, paramFile.getName(), paramGax);
  }
  
  public boolean Dne() {
    try {
      FWm();
      Enumeration<? extends ZipEntry> enumeration = this.Dne.entries();
      while (enumeration.hasMoreElements()) {
        ZipEntry zipEntry = enumeration.nextElement();
        if (zipEntry.getName().startsWith("textures/"))
          return true; 
      } 
    } catch (Exception exception) {}
    boolean bool = (Dne("terrain.png") || Dne("gui/items.png")) ? true : false;
    return !bool;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eqx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */