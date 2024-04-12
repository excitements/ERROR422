import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wFl extends NER {
  public int Dne;
  
  public int Qnq;
  
  public int bzF;
  
  public int FWm;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeShort(this.FWm);
    paramDataOutputStream.writeShort(this.bzF);
    paramDataOutputStream.writeShort(this.Qnq);
  }
  
  public wFl(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
    this.Dne = paramInt;
    double d = 3.9D;
    if (paramDouble1 < -d)
      paramDouble1 = -d; 
    if (paramDouble2 < -d)
      paramDouble2 = -d; 
    if (paramDouble3 < -d)
      paramDouble3 = -d; 
    if (paramDouble1 > d)
      paramDouble1 = d; 
    if (paramDouble2 > d)
      paramDouble2 = d; 
    if (paramDouble3 > d)
      paramDouble3 = d; 
    this.FWm = (int)(paramDouble1 * 8000.0D);
    this.bzF = (int)(paramDouble2 * 8000.0D);
    this.Qnq = (int)(paramDouble3 * 8000.0D);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public wFl(sMa paramsMa) {
    this(paramsMa.aFZ, paramsMa.XHL, paramsMa.Zpi, paramsMa.kGO);
  }
  
  public int Dne() {
    return 10;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readShort();
    this.bzF = paramDataInputStream.readShort();
    this.Qnq = paramDataInputStream.readShort();
  }
  
  public boolean Dne(NER paramNER) {
    wFl wFl1 = (wFl)paramNER;
    return (wFl1.Dne == this.Dne);
  }
  
  public wFl() {}
  
  public boolean FWm() {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wFl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */