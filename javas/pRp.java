import java.io.DataInputStream;
import java.io.DataOutputStream;

public class pRp extends NER {
  public int Dne;
  
  public NMq Dne;
  
  public int Dne() {
    return 8;
  }
  
  public pRp(int paramInt, NMq paramNMq) {
    this.Dne = paramInt;
    this.Dne = (paramNMq != null) ? paramNMq.Dne() : null;
  }
  
  public pRp() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeShort(this.Dne);
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readShort();
    this.Dne = Dne(paramDataInputStream);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pRp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */