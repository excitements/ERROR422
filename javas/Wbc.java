import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Wbc extends NER {
  public int Qnq;
  
  public int FWm;
  
  public int bzF;
  
  public int Dne;
  
  public int aFZ;
  
  public Wbc(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.aFZ = paramInt1;
    this.Dne = paramInt2;
    this.FWm = paramInt3;
    this.bzF = paramInt4;
    this.Qnq = paramInt5;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.write(this.aFZ);
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.write(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.write(this.Qnq);
  }
  
  public Wbc() {}
  
  public int Dne() {
    return 11;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.aFZ = paramDataInputStream.read();
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.read();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.read();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Wbc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */