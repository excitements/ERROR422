import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aig extends NER {
  public int Dne;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeShort(this.Dne);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readShort();
  }
  
  public aig() {}
  
  public aig(int paramInt) {
    this.Dne = paramInt;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public int Dne() {
    return 2;
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\aig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */