import java.io.DataInputStream;
import java.io.DataOutputStream;

public class cSs extends NER {
  public int aFZ;
  
  public int Dne;
  
  public int bzF;
  
  public int FWm;
  
  public int Qnq = 1;
  
  public int Dne() {
    return 11;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.read();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readShort();
    this.aFZ = paramDataInputStream.read();
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public cSs() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.write(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeShort(this.Qnq);
    paramDataOutputStream.write(this.aFZ);
  }
  
  public cSs(int paramInt1, int paramInt2, int paramInt3, Qnq paramQnq) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    this.aFZ = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cSs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */