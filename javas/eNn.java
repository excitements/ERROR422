import java.io.DataInputStream;
import java.io.DataOutputStream;

public class eNn extends NER {
  public byte Dne;
  
  public int Dne;
  
  public eNn() {}
  
  public int Dne() {
    return 5;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readByte();
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.Dne);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public boolean Dne(NER paramNER) {
    eNn eNn1 = (eNn)paramNER;
    return (eNn1.Dne == this.Dne);
  }
  
  public boolean Dne() {
    return true;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public eNn(int paramInt, byte paramByte) {
    this.Dne = paramInt;
    this.Dne = paramByte;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eNn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */