import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Pkw extends NER {
  public int Dne;
  
  public int FWm;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public Pkw(sMa paramsMa, int paramInt) {
    this.Dne = paramsMa.aFZ;
    this.FWm = paramInt;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
  }
  
  public int Dne() {
    return 5;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readByte();
  }
  
  public Pkw() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Pkw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */