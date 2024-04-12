import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wXa extends NER {
  public int DyG;
  
  public int Qnq;
  
  public int Dne;
  
  public int bzF;
  
  public int aFZ;
  
  public int mrb;
  
  public int div;
  
  public int XHL;
  
  public int zGp;
  
  public int FWm;
  
  public int IjH;
  
  public wXa() {}
  
  public wXa(sMa paramsMa, int paramInt) {
    this(paramsMa, paramInt, 0);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.mrb);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
    paramDataOutputStream.writeByte(this.div);
    paramDataOutputStream.writeByte(this.IjH);
    paramDataOutputStream.writeInt(this.XHL);
    if (this.XHL > 0) {
      paramDataOutputStream.writeShort(this.aFZ);
      paramDataOutputStream.writeShort(this.zGp);
      paramDataOutputStream.writeShort(this.DyG);
    } 
  }
  
  public wXa(sMa paramsMa, int paramInt1, int paramInt2) {
    this.Dne = paramsMa.aFZ;
    this.FWm = geR.FWm(paramsMa.div * 32.0D);
    this.bzF = geR.FWm(paramsMa.IjH * 32.0D);
    this.Qnq = geR.FWm(paramsMa.mrb * 32.0D);
    this.div = geR.Dne(paramsMa.XHL * 256.0F / 360.0F);
    this.IjH = geR.Dne(paramsMa.mrb * 256.0F / 360.0F);
    this.mrb = paramInt1;
    this.XHL = paramInt2;
    if (paramInt2 > 0) {
      double d1;
      double d2;
      double d3;
      int i = paramsMa.XHL;
      float f1 = paramsMa.Zpi;
      float f2 = paramsMa.kGO;
      double d4 = 3.9D;
      if (i < -d4)
        d1 = -d4; 
      if (f1 < -d4)
        d2 = -d4; 
      if (f2 < -d4)
        d3 = -d4; 
      if (d1 > d4)
        d1 = d4; 
      if (d2 > d4)
        d2 = d4; 
      if (d3 > d4)
        d3 = d4; 
      this.aFZ = (int)(d1 * 8000.0D);
      this.zGp = (int)(d2 * 8000.0D);
      this.DyG = (int)(d3 * 8000.0D);
    } 
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.mrb = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readInt();
    this.div = paramDataInputStream.readByte();
    this.IjH = paramDataInputStream.readByte();
    this.XHL = paramDataInputStream.readInt();
    if (this.XHL > 0) {
      this.aFZ = paramDataInputStream.readShort();
      this.zGp = paramDataInputStream.readShort();
      this.DyG = paramDataInputStream.readShort();
    } 
  }
  
  public int Dne() {
    return (21 + this.XHL > 0) ? 6 : 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wXa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */