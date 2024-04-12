import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gzk extends NER {
  public byte Dne;
  
  public int Dne;
  
  public int Dne() {
    return 5;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.Dne);
  }
  
  public gzk() {}
  
  public gzk(int paramInt, NAx paramNAx) {
    this.Dne = paramInt;
    this.Dne = (byte)(paramNAx.Dne() & 0xFF);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readByte();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gzk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */