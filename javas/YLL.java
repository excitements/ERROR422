import java.io.DataInputStream;
import java.io.DataOutputStream;

public class YLL extends NER {
  private float Qnq;
  
  private float DyG;
  
  private float bzF;
  
  private int Dne;
  
  private float Dne;
  
  private String Dne;
  
  private float zGp;
  
  private float aFZ;
  
  private float FWm;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public double FWm() {
    return this.FWm;
  }
  
  public int Dne() {
    return 64;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeFloat(this.Dne);
    paramDataOutputStream.writeFloat(this.FWm);
    paramDataOutputStream.writeFloat(this.bzF);
    paramDataOutputStream.writeFloat(this.Qnq);
    paramDataOutputStream.writeFloat(this.aFZ);
    paramDataOutputStream.writeFloat(this.zGp);
    paramDataOutputStream.writeFloat(this.DyG);
    paramDataOutputStream.writeInt(this.Dne);
  }
  
  public float bzF() {
    return this.zGp;
  }
  
  public float Dne() {
    return this.Qnq;
  }
  
  public double bzF() {
    return this.bzF;
  }
  
  public float Qnq() {
    return this.DyG;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 64);
    this.Dne = paramDataInputStream.readFloat();
    this.FWm = paramDataInputStream.readFloat();
    this.bzF = paramDataInputStream.readFloat();
    this.Qnq = paramDataInputStream.readFloat();
    this.aFZ = paramDataInputStream.readFloat();
    this.zGp = paramDataInputStream.readFloat();
    this.DyG = paramDataInputStream.readFloat();
    this.Dne = paramDataInputStream.readInt();
  }
  
  public float FWm() {
    return this.aFZ;
  }
  
  public double Dne() {
    return this.Dne;
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public String Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YLL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */