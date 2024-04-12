import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class MwE extends NER {
  public int Qnq;
  
  public int Dne;
  
  public int FWm;
  
  private luM Dne;
  
  public int aFZ;
  
  public byte Dne;
  
  public String Dne;
  
  public byte FWm;
  
  public int bzF;
  
  private List Dne;
  
  public List Dne() {
    if (this.Dne == null)
      this.Dne = this.Dne.FWm(); 
    return this.Dne;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    Dne((String)this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
    paramDataOutputStream.writeShort(this.aFZ);
    this.Dne.Dne(paramDataOutputStream);
  }
  
  public MwE() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.Dne = (List)Dne(paramDataInputStream, 16);
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
    this.aFZ = paramDataInputStream.readShort();
    this.Dne = luM.Dne(paramDataInputStream);
  }
  
  public int Dne() {
    return 28;
  }
  
  public MwE(FiG paramFiG) {
    this.Dne = (List)paramFiG.aFZ;
    this.Dne = (List)paramFiG.aFZ;
    this.FWm = geR.FWm(paramFiG.div * 32.0D);
    this.bzF = geR.FWm(paramFiG.IjH * 32.0D);
    this.Qnq = geR.FWm(paramFiG.mrb * 32.0D);
    this.Dne = (byte)(int)(paramFiG.mrb * 256.0F / 360.0F);
    this.FWm = (byte)(int)(paramFiG.XHL * 256.0F / 360.0F);
    NMq nMq = paramFiG.Dne.Dne();
    this.aFZ = (nMq == null) ? 0 : nMq.bzF;
    this.Dne = (List)paramFiG.Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MwE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */