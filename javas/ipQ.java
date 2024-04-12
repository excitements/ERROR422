import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ipQ extends NER {
  public int bzF;
  
  public int Qnq = 1;
  
  public int Dne;
  
  public WkD Dne;
  
  public int FWm;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeByte((byte)this.Qnq);
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public ipQ() {}
  
  public int Dne() {
    return 25;
  }
  
  public ipQ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WkD paramWkD) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.Dne = paramWkD;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readShort();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readByte();
    this.Dne = Dne(paramDataInputStream);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ipQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */