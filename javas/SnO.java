import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class SnO extends NER {
  private List Dne;
  
  public int Dne;
  
  public int Dne() {
    return 5;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.Dne = luM.Dne(paramDataInputStream);
  }
  
  public SnO(int paramInt, luM paramluM, boolean paramBoolean) {
    this.Dne = paramInt;
    if (paramBoolean) {
      this.Dne = paramluM.FWm();
    } else {
      this.Dne = paramluM.Dne();
    } 
  }
  
  public List Dne() {
    return this.Dne;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    luM.Dne(this.Dne, paramDataOutputStream);
  }
  
  public SnO() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SnO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */