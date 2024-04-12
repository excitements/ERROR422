import java.io.DataInputStream;
import java.io.DataOutputStream;

public class YVz extends NER {
  public int FWm;
  
  public int Dne;
  
  public boolean Dne(NER paramNER) {
    YVz yVz = (YVz)paramNER;
    return (yVz.Dne == this.Dne);
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
  }
  
  public YVz() {}
  
  public int Dne() {
    return 8;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
  }
  
  public boolean FWm() {
    return true;
  }
  
  public YVz(sMa paramsMa1, sMa paramsMa2) {
    this.Dne = paramsMa1.aFZ;
    this.FWm = (paramsMa2 != null) ? paramsMa2.aFZ : -1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YVz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */