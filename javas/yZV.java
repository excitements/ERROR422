import java.io.DataInputStream;
import java.io.DataOutputStream;

public class yZV extends NER {
  public String Dne;
  
  public yZV(String paramString) {
    this.Dne = paramString;
  }
  
  public yZV() {}
  
  public boolean FWm() {
    return true;
  }
  
  public int Dne() {
    return this.Dne.length();
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 256);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yZV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */