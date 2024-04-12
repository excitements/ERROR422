import java.io.DataInputStream;
import java.io.DataOutputStream;

public class bia extends NER {
  public int Qnq;
  
  public int aFZ;
  
  public int FWm;
  
  public int bzF;
  
  public String Dne;
  
  public int Dne;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.Dne = Dne(paramDataInputStream, uCl.Dne);
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readInt();
    this.aFZ = paramDataInputStream.readInt();
  }
  
  public bia() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
    paramDataOutputStream.writeInt(this.aFZ);
  }
  
  public bia(JCd paramJCd) {
    this.Dne = paramJCd.aFZ;
    this.FWm = paramJCd.FWm;
    this.bzF = paramJCd.bzF;
    this.Qnq = paramJCd.Qnq;
    this.aFZ = paramJCd.Dne;
    this.Dne = paramJCd.Dne.Dne;
  }
  
  public int Dne() {
    return 24;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */