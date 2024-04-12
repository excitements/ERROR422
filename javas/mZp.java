import java.io.DataInputStream;
import java.io.DataOutputStream;

public class mZp extends NER {
  public NMq Dne;
  
  public int Qnq;
  
  public int Dne;
  
  public short Dne;
  
  public int FWm;
  
  public int bzF;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne() {
    return 11;
  }
  
  public mZp() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readShort();
    this.bzF = paramDataInputStream.readByte();
    this.Dne = paramDataInputStream.readShort();
    this.Qnq = paramDataInputStream.readByte();
    this.Dne = Dne(paramDataInputStream);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeByte(this.bzF);
    paramDataOutputStream.writeShort(this.Dne);
    paramDataOutputStream.writeByte(this.Qnq);
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public mZp(int paramInt1, int paramInt2, int paramInt3, int paramInt4, NMq paramNMq, short paramShort) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Dne = (paramNMq != null) ? paramNMq.Dne() : null;
    this.Dne = paramShort;
    this.Qnq = paramInt4;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mZp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */