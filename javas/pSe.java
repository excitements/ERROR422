import java.io.DataInputStream;
import java.io.DataOutputStream;

public class pSe extends NER {
  private boolean Dne;
  
  private float Dne = false;
  
  private boolean bzF = false;
  
  private float FWm;
  
  private boolean aFZ = false;
  
  private boolean FWm = false;
  
  public boolean bzF() {
    return this.Dne;
  }
  
  public int Dne() {
    return 2;
  }
  
  public pSe() {}
  
  public boolean Qnq() {
    return this.FWm;
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public void bzF(boolean paramBoolean) {
    this.bzF = paramBoolean;
  }
  
  public float FWm() {
    return this.FWm;
  }
  
  public pSe(uqg paramuqg) {
    Dne(paramuqg.Dne);
    FWm(paramuqg.FWm);
    bzF(paramuqg.bzF);
    Qnq(paramuqg.Qnq);
    Dne(paramuqg.Dne());
    FWm(paramuqg.FWm());
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    byte b = 0;
    if (bzF())
      b = (byte)(b | 0x1); 
    if (Qnq())
      b = (byte)(b | 0x2); 
    if (aFZ())
      b = (byte)(b | 0x4); 
    if (zGp())
      b = (byte)(b | 0x8); 
    paramDataOutputStream.writeByte(b);
    paramDataOutputStream.writeByte((int)(this.Dne * 255.0F));
    paramDataOutputStream.writeByte((int)(this.FWm * 255.0F));
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    byte b = paramDataInputStream.readByte();
    Dne(((b & 0x1) > 0));
    FWm(((b & 0x2) > 0));
    bzF(((b & 0x4) > 0));
    Qnq(((b & 0x8) > 0));
    Dne(paramDataInputStream.readByte() / 255.0F);
    FWm(paramDataInputStream.readByte() / 255.0F);
  }
  
  public boolean aFZ() {
    return this.bzF;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public void FWm(boolean paramBoolean) {
    this.FWm = paramBoolean;
  }
  
  public void Dne(float paramFloat) {
    this.Dne = paramFloat;
  }
  
  public boolean zGp() {
    return this.aFZ;
  }
  
  public float Dne() {
    return this.Dne;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public void Qnq(boolean paramBoolean) {
    this.aFZ = paramBoolean;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void FWm(float paramFloat) {
    this.FWm = paramFloat;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pSe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */