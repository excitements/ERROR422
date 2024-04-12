import java.io.DataInputStream;
import java.io.DataOutputStream;

public class NVL extends NER {
  public byte FWm;
  
  public int FWm;
  
  public int Qnq;
  
  public byte Dne;
  
  public int bzF;
  
  public int Dne;
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readInt();
    this.Dne = (byte)paramDataInputStream.read();
    this.FWm = (byte)paramDataInputStream.read();
  }
  
  public boolean Dne(NER paramNER) {
    NVL nVL = (NVL)paramNER;
    return (nVL.Dne == this.Dne);
  }
  
  public boolean FWm() {
    return true;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
    paramDataOutputStream.write(this.Dne);
    paramDataOutputStream.write(this.FWm);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public NVL() {}
  
  public NVL(sMa paramsMa) {
    this.Dne = paramsMa.aFZ;
    this.FWm = geR.FWm(paramsMa.div * 32.0D);
    this.bzF = geR.FWm(paramsMa.IjH * 32.0D);
    this.Qnq = geR.FWm(paramsMa.mrb * 32.0D);
    this.Dne = (byte)(int)(paramsMa.mrb * 256.0F / 360.0F);
    this.FWm = (byte)(int)(paramsMa.XHL * 256.0F / 360.0F);
  }
  
  public int Dne() {
    return 34;
  }
  
  public NVL(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte1, byte paramByte2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
    this.Dne = paramByte1;
    this.FWm = paramByte2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NVL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */