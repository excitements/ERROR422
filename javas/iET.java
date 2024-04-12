import java.io.DataInputStream;
import java.io.DataOutputStream;

public class iET extends NER {
  public boolean Dne;
  
  public byte Dne;
  
  public byte bzF;
  
  public byte Qnq;
  
  public byte aFZ;
  
  public byte FWm;
  
  public int Dne = 0;
  
  public String toString() {
    return "Entity_" + super.toString();
  }
  
  public iET() {}
  
  public boolean FWm() {
    return true;
  }
  
  public boolean Dne(NER paramNER) {
    iET iET1 = (iET)paramNER;
    return (iET1.Dne == this.Dne);
  }
  
  public iET(int paramInt) {
    this.Dne = paramInt;
  }
  
  public int Dne() {
    return 4;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iET.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */