import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ROw extends NER {
  public int Dne;
  
  public int FWm;
  
  public int bzF;
  
  public ROw() {}
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public ROw(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
  
  public int Dne() {
    return 12;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public boolean FWm() {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ROw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */