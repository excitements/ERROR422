import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Krr extends NER {
  public int Dne;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
  }
  
  public Krr() {}
  
  public Krr(int paramInt) {
    this.Dne = paramInt;
  }
  
  public int Dne() {
    return 1;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Krr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */