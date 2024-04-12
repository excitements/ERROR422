import java.io.DataInputStream;
import java.io.DataOutputStream;

public class WXC extends NER {
  public float Dne;
  
  public int FWm;
  
  public int Dne;
  
  public WXC(float paramFloat, int paramInt1, int paramInt2) {
    this.Dne = paramFloat;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readFloat();
    this.FWm = paramDataInputStream.readShort();
    this.Dne = paramDataInputStream.readShort();
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeFloat(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeShort(this.Dne);
  }
  
  public int Dne() {
    return 4;
  }
  
  public WXC() {}
  
  public boolean FWm() {
    return true;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WXC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */