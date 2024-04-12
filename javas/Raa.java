import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Raa extends NER {
  public int Dne;
  
  public int FWm;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public Raa(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public Raa() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
  }
  
  public boolean Dne() {
    return true;
  }
  
  public int Dne() {
    return 6;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readByte();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Raa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */