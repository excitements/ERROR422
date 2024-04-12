import java.io.DataInputStream;
import java.io.DataOutputStream;

public class bEj extends NER {
  private int Qnq;
  
  private int aFZ;
  
  private int FWm;
  
  private int Dne;
  
  private int bzF;
  
  public int zGp() {
    return this.Qnq;
  }
  
  public bEj(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.aFZ = paramInt5;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readInt();
    this.aFZ = paramDataInputStream.read();
  }
  
  public int Dne() {
    return 13;
  }
  
  public int DyG() {
    return this.aFZ;
  }
  
  public bEj() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
    paramDataOutputStream.write(this.aFZ);
  }
  
  public boolean FWm() {
    return true;
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public boolean Dne(NER paramNER) {
    bEj bEj1 = (bEj)paramNER;
    return (bEj1.Dne == this.Dne);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int bzF() {
    return this.FWm;
  }
  
  public int Qnq() {
    return this.bzF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bEj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */