import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Gle extends NER {
  public int Dne;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne & 0xFF);
  }
  
  public Gle(int paramInt) {
    this.Dne = paramInt;
  }
  
  public Gle() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
  }
  
  public int Dne() {
    return 1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Gle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */