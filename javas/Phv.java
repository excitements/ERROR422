import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Phv extends NER {
  public int Dne;
  
  public boolean FWm() {
    return true;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public boolean Dne() {
    return true;
  }
  
  public Phv() {}
  
  public int Dne() {
    return 4;
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public Phv(int paramInt) {
    this.Dne = paramInt;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Phv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */