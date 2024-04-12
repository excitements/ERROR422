import java.io.DataInputStream;
import java.io.DataOutputStream;

public class zqT extends NER {
  public float Dne;
  
  public int Dne;
  
  public int FWm;
  
  public int Dne() {
    return 8;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeShort(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeFloat(this.Dne);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public zqT(int paramInt1, int paramInt2, float paramFloat) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne = paramFloat;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readShort();
    this.FWm = paramDataInputStream.readShort();
    this.Dne = paramDataInputStream.readFloat();
  }
  
  public zqT() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zqT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */