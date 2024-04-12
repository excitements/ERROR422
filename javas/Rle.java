import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Rle extends NER {
  public int Qnq;
  
  public int Dne;
  
  public int FWm;
  
  public int bzF;
  
  public int aFZ;
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.aFZ = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readInt();
  }
  
  public int Dne() {
    return 17;
  }
  
  public Rle() {}
  
  public Rle(sMa paramsMa) {
    this.Dne = paramsMa.aFZ;
    this.FWm = geR.FWm(paramsMa.div * 32.0D);
    this.bzF = geR.FWm(paramsMa.IjH * 32.0D);
    this.Qnq = geR.FWm(paramsMa.mrb * 32.0D);
    if (paramsMa instanceof xIh)
      this.aFZ = 1; 
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.aFZ);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Rle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */