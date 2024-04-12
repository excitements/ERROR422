import java.io.DataInputStream;
import java.io.DataOutputStream;

public class efs extends NER {
  private String Dne;
  
  public String Dne() {
    return this.Dne;
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, rXx.Dne);
  }
  
  public efs(String paramString) {
    this.Dne = paramString;
  }
  
  public efs() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public int Dne() {
    return 2 + this.Dne.length() * 2;
  }
  
  public boolean FWm() {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\efs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */