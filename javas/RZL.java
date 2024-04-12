import java.io.DataInputStream;
import java.io.DataOutputStream;

public class RZL extends NER {
  public int Dne;
  
  public NMq Dne;
  
  public int FWm;
  
  public RZL() {}
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readShort();
    this.Dne = Dne(paramDataInputStream);
  }
  
  public int Dne() {
    return 8;
  }
  
  public RZL(int paramInt1, int paramInt2, NMq paramNMq) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne = (paramNMq == null) ? paramNMq : paramNMq.Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RZL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */