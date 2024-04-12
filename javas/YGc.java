import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public abstract class YGc implements Gax {
  private int Dne;
  
  protected BufferedImage Dne;
  
  private final String bzF;
  
  protected final File Dne;
  
  protected String Dne;
  
  private final Gax Dne = -1;
  
  private final String Qnq;
  
  protected String FWm;
  
  protected abstract InputStream FWm(String paramString);
  
  public abstract boolean Dne(String paramString);
  
  private void FWm() {
    InputStream inputStream = null;
    try {
      inputStream = Dne("/pack.png", false);
      this.Dne = (Gax)ImageIO.read(inputStream);
    } catch (IOException iOException) {
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (IOException iOException1) {}
    } finally {
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (IOException iOException) {}
    } 
  }
  
  protected YGc(String paramString1, File paramFile, String paramString2, Gax paramGax) {
    this.bzF = paramString1;
    this.Qnq = paramString2;
    this.Dne = (Gax)paramFile;
    this.Dne = paramGax;
    FWm();
    Dne();
  }
  
  public void FWm(Snh paramSnh) {
    if (this.Dne != null) {
      if (this.Dne == -1)
        this.Dne = paramSnh.Dne((BufferedImage)this.Dne); 
      GL11.glBindTexture(3553, this.Dne);
      paramSnh.Dne();
    } else {
      paramSnh.Dne("/gui/unknown_pack.png");
    } 
  }
  
  public String bzF() {
    return (String)this.Dne;
  }
  
  public String FWm() {
    return this.Qnq;
  }
  
  public boolean Dne(String paramString, boolean paramBoolean) {
    boolean bool = Dne(paramString);
    return (!bool && paramBoolean && this.Dne != null) ? this.Dne.Dne(paramString, paramBoolean) : bool;
  }
  
  public String Dne() {
    return this.bzF;
  }
  
  public void Dne(Snh paramSnh) {
    if (this.Dne != null && this.Dne != -1)
      paramSnh.Dne(this.Dne); 
  }
  
  public String Qnq() {
    return this.FWm;
  }
  
  private static String Dne(String paramString) {
    if (paramString != null && paramString.length() > 34)
      paramString = paramString.substring(0, 34); 
    return paramString;
  }
  
  public InputStream Dne(String paramString) {
    return Dne(paramString, true);
  }
  
  public InputStream Dne(String paramString, boolean paramBoolean) {
    try {
      return FWm(paramString);
    } catch (IOException iOException) {
      if (this.Dne != null && paramBoolean)
        return this.Dne.Dne(paramString, true); 
      throw iOException;
    } 
  }
  
  protected void Dne() {
    InputStream inputStream = null;
    BufferedReader bufferedReader = null;
    try {
      inputStream = FWm("/pack.txt");
      bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      this.Dne = (Gax)Dne(bufferedReader.readLine());
      this.FWm = Dne(bufferedReader.readLine());
    } catch (IOException iOException) {
      try {
        if (bufferedReader != null)
          bufferedReader.close(); 
        if (inputStream != null)
          inputStream.close(); 
      } catch (IOException iOException1) {}
    } finally {
      try {
        if (bufferedReader != null)
          bufferedReader.close(); 
        if (inputStream != null)
          inputStream.close(); 
      } catch (IOException iOException) {}
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YGc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */