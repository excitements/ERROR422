import java.io.DataInputStream;
import java.io.DataOutputStream;

public class yUQ extends NER {
  private int bzF;
  
  private int FWm;
  
  private boolean FWm;
  
  private boolean Dne;
  
  private int Dne;
  
  private String Dne;
  
  public int Dne() {
    return 7;
  }
  
  public int bzF() {
    return this.FWm;
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public boolean bzF() {
    return this.Dne;
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 7);
    this.Dne = paramDataInputStream.readByte();
    byte b = paramDataInputStream.readByte();
    this.FWm = b & 0x7;
    this.Dne = ((b & 0x8) == 8) ? 1 : 0;
    this.bzF = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readBoolean();
  }
  
  public yUQ(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2) {
    this.Dne = paramString;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne = paramBoolean1;
    this.bzF = paramInt3;
    this.FWm = paramBoolean2;
  }
  
  public yUQ() {}
  
  public int Qnq() {
    return this.bzF;
  }
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm | ((this.Dne != null) ? 1 : 0) << 3);
    paramDataOutputStream.writeByte(this.bzF);
    paramDataOutputStream.writeBoolean(this.FWm);
  }
  
  public boolean FWm() {
    return true;
  }
  
  public boolean Qnq() {
    return this.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yUQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */