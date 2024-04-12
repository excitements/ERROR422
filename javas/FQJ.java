import java.io.DataInputStream;
import java.io.DataOutputStream;

public class FQJ extends NER {
  public boolean FWm;
  
  public double bzF;
  
  public float FWm;
  
  public double Dne;
  
  public boolean Dne;
  
  public double Qnq;
  
  public float Dne;
  
  public double FWm;
  
  public boolean bzF;
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = (paramDataInputStream.read() != 0) ? true : false;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.write((this.Dne != 0.0F) ? 1 : 0);
  }
  
  public FQJ() {}
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public int Dne() {
    return 1;
  }
  
  public FQJ(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FQJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */