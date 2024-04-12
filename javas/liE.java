import java.io.DataInputStream;
import java.io.DataOutputStream;

public class liE extends NER {
  public int Dne;
  
  public int FWm;
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
  }
  
  public liE() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
  }
  
  public liE(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public int Dne() {
    return 8;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\liE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */