import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DtJ extends NER {
  private float bzF;
  
  private int Qnq;
  
  private float FWm;
  
  private int bzF;
  
  private int FWm;
  
  private int Dne;
  
  private float Dne;
  
  private NMq Dne;
  
  public DtJ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, NMq paramNMq, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.Dne = (paramNMq != null) ? paramNMq.Dne() : null;
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
    this.bzF = paramFloat3;
  }
  
  public float FWm() {
    return this.FWm;
  }
  
  public DtJ() {}
  
  public NMq Dne() {
    return this.Dne;
  }
  
  public int Dne() {
    return 19;
  }
  
  public float bzF() {
    return this.bzF;
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.read();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.read();
    this.Dne = Dne(paramDataInputStream);
    this.Dne = paramDataInputStream.read() / 16.0F;
    this.FWm = paramDataInputStream.read() / 16.0F;
    this.bzF = paramDataInputStream.read() / 16.0F;
  }
  
  public float Dne() {
    return this.Dne;
  }
  
  public int Qnq() {
    return this.bzF;
  }
  
  public int bzF() {
    return this.FWm;
  }
  
  public int zGp() {
    return this.Qnq;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.write(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.write(this.Qnq);
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.write((int)(this.Dne * 16.0F));
    paramDataOutputStream.write((int)(this.FWm * 16.0F));
    paramDataOutputStream.write((int)(this.bzF * 16.0F));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DtJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */