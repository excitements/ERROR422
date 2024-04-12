import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wwJ extends NER {
  public int Qnq;
  
  public int bzF;
  
  private boolean Dne;
  
  public int FWm;
  
  public int Dne;
  
  public int aFZ;
  
  public int Dne() {
    return 21;
  }
  
  public wwJ() {}
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readByte() & 0xFF;
    this.aFZ = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readBoolean();
  }
  
  public wwJ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    this.Dne = paramInt1;
    this.bzF = paramInt2;
    this.Qnq = paramInt3;
    this.aFZ = paramInt4;
    this.FWm = paramInt5;
    this.Dne = paramBoolean;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeByte(this.Qnq & 0xFF);
    paramDataOutputStream.writeInt(this.aFZ);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeBoolean(this.Dne);
  }
  
  public boolean bzF() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wwJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */