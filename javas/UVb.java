import java.io.DataInputStream;
import java.io.DataOutputStream;

public class UVb extends NER {
  public int FWm;
  
  public int Dne;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
  }
  
  public UVb(sMa paramsMa, int paramInt) {
    this.Dne = paramsMa.aFZ;
    this.FWm = paramInt;
  }
  
  public int Dne() {
    return 5;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readByte();
  }
  
  public UVb() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UVb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */