import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class euc {
  private final Properties Dne;
  
  private final File Dne;
  
  private final dLs Dne = (dLs)new Properties();
  
  public euc(File paramFile, dLs paramdLs) {
    this.Dne = (dLs)paramFile;
    this.Dne = paramdLs;
    if (paramFile.exists()) {
      FileInputStream fileInputStream = null;
      try {
        fileInputStream = new FileInputStream(paramFile);
        this.Dne.load(fileInputStream);
      } catch (Exception exception) {
        paramdLs.Dne("Failed to load " + paramFile, exception);
        Dne();
      } finally {
        if (fileInputStream != null)
          try {
            fileInputStream.close();
          } catch (IOException iOException) {} 
      } 
    } else {
      paramdLs.FWm(paramFile + " does not exist");
      Dne();
    } 
  }
  
  public void Dne() {
    this.Dne.Dne("Generating new properties file");
    FWm();
  }
  
  public boolean Dne(String paramString, boolean paramBoolean) {
    try {
      return Boolean.parseBoolean(Dne(paramString, "" + paramBoolean));
    } catch (Exception exception) {
      this.Dne.setProperty(paramString, "" + paramBoolean);
      return paramBoolean;
    } 
  }
  
  public File Dne() {
    return (File)this.Dne;
  }
  
  public int Dne(String paramString, int paramInt) {
    try {
      return Integer.parseInt(Dne(paramString, "" + paramInt));
    } catch (Exception exception) {
      this.Dne.setProperty(paramString, "" + paramInt);
      return paramInt;
    } 
  }
  
  public String Dne(String paramString1, String paramString2) {
    if (!this.Dne.containsKey(paramString1)) {
      this.Dne.setProperty(paramString1, paramString2);
      FWm();
    } 
    return this.Dne.getProperty(paramString1, paramString2);
  }
  
  public void FWm() {
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream((File)this.Dne);
      this.Dne.store(fileOutputStream, "Minecraft server properties");
    } catch (Exception exception) {
      this.Dne.Dne("Failed to save " + this.Dne, exception);
      Dne();
    } finally {
      if (fileOutputStream != null)
        try {
          fileOutputStream.close();
        } catch (IOException iOException) {} 
    } 
  }
  
  public void Dne(String paramString, Object paramObject) {
    this.Dne.setProperty(paramString, "" + paramObject);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\euc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */