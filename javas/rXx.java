import java.io.DataInputStream;
import java.io.DataOutputStream;

public class rXx extends NER {
  private boolean Dne;
  
  public static int Dne = 'w';
  
  public String Dne = '\001';
  
  public boolean bzF() {
    return this.Dne;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public rXx() {}
  
  public boolean Dne() {
    return !this.Dne.startsWith("/");
  }
  
  public int Dne() {
    return 2 + this.Dne.length() * 2;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, Dne);
  }
  
  public rXx(String paramString, boolean paramBoolean) {
    if (paramString.length() > Dne)
      paramString = paramString.substring(0, Dne); 
    this.Dne = paramString;
    this.Dne = paramBoolean;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public rXx(String paramString) {
    this(paramString, true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rXx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */