import java.io.DataInputStream;
import java.io.DataOutputStream;

public class EHr extends NER {
  public int FWm;
  
  public int Dne;
  
  public int bzF;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeByte(this.bzF);
  }
  
  public EHr() {}
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readByte();
  }
  
  public EHr(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
  
  public int Dne() {
    return 9;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EHr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */