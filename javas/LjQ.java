import java.io.DataInputStream;
import java.io.DataOutputStream;

public class LjQ extends NER {
  public int Dne;
  
  public String Dne;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public LjQ() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    Dne(this.Dne, paramDataOutputStream);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.Dne = Dne(paramDataInputStream, 16);
  }
  
  public LjQ(int paramInt, vfE paramvfE) {
    this.Dne = paramInt;
    if (paramvfE == null) {
      this.Dne = "";
    } else {
      this.Dne = paramvfE.Dne();
    } 
  }
  
  public int Dne() {
    return 3 + this.Dne.length();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LjQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */