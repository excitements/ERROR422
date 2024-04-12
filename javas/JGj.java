import java.io.DataInputStream;
import java.io.DataOutputStream;

public class JGj extends NER {
  public int Dne;
  
  public byte Dne;
  
  public int Dne() {
    return 5;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public JGj(int paramInt, byte paramByte) {
    this.Dne = paramInt;
    this.Dne = paramByte;
  }
  
  public JGj() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.Dne);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readByte();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JGj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */