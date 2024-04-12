import java.io.DataInputStream;
import java.io.DataOutputStream;

public class kwp extends NER {
  public int Qnq;
  
  public int FWm;
  
  public int bzF;
  
  public int Dne;
  
  public int aFZ;
  
  public kwp(sMa paramsMa, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aFZ = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.Dne = paramsMa.aFZ;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.aFZ = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readByte();
    this.Qnq = paramDataInputStream.readInt();
  }
  
  public kwp() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.aFZ);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeByte(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
  }
  
  public int Dne() {
    return 14;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kwp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */