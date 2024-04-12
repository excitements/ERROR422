import java.io.DataInputStream;
import java.io.DataOutputStream;

public class QKM extends NER {
  public int Dne;
  
  public int bzF;
  
  public int FWm;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public QKM() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readShort();
    this.bzF = paramDataInputStream.readShort();
  }
  
  public int Dne() {
    return 5;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeShort(this.bzF);
  }
  
  public QKM(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QKM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */