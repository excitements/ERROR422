import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ziQ extends NER {
  public int Dne;
  
  public byte FWm;
  
  public byte Dne;
  
  public short Dne;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public boolean Dne(NER paramNER) {
    ziQ ziQ1 = (ziQ)paramNER;
    return (ziQ1.Dne == this.Dne && ziQ1.Dne == this.Dne);
  }
  
  public int Dne() {
    return 8;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
    paramDataOutputStream.writeShort(this.Dne);
  }
  
  public boolean bzF() {
    return (this.Dne == Short.MAX_VALUE);
  }
  
  public ziQ(int paramInt, NAx paramNAx) {
    this.Dne = paramInt;
    this.Dne = (byte)(paramNAx.Dne() & 0xFF);
    this.FWm = (byte)(paramNAx.bzF() & 0xFF);
    if (paramNAx.FWm() > 32767) {
      this.Dne = Short.MAX_VALUE;
    } else {
      this.Dne = (short)paramNAx.FWm();
    } 
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
    this.Dne = paramDataInputStream.readShort();
  }
  
  public ziQ() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ziQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */