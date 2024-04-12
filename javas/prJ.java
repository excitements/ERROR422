import java.io.DataInputStream;
import java.io.DataOutputStream;

public class prJ extends NER {
  public int Dne = 0;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {}
  
  public int Dne() {
    return 0;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    try {
      this.Dne = paramDataInputStream.readByte();
    } catch (Throwable throwable) {
      this.Dne = 0;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\prJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */