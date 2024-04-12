import java.io.DataInputStream;
import java.io.DataOutputStream;

public class qHm extends NER {
  public int Dne;
  
  public int FWm;
  
  private NMq Dne;
  
  public qHm(int paramInt1, int paramInt2, NMq paramNMq) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne = (paramNMq == null) ? null : paramNMq.Dne();
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readShort();
    this.Dne = Dne(paramDataInputStream);
  }
  
  public boolean Dne(NER paramNER) {
    qHm qHm1 = (qHm)paramNER;
    return (qHm1.Dne == this.Dne && qHm1.FWm == this.FWm);
  }
  
  public NMq Dne() {
    return this.Dne;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public qHm() {}
  
  public boolean FWm() {
    return true;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne() {
    return 8;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qHm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */