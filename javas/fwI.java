import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fwI extends NER {
  public int Dne;
  
  public int FWm;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
  }
  
  public fwI() {}
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne() {
    return 2;
  }
  
  public fwI(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fwI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */