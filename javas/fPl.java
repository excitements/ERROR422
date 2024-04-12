import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fPl extends NER {
  public int Dne;
  
  public boolean Dne;
  
  public String Dne;
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 16);
    this.Dne = (paramDataInputStream.readByte() != 0) ? 1 : 0;
    this.Dne = paramDataInputStream.readShort();
  }
  
  public int Dne() {
    return this.Dne.length() + 2 + 1 + 2;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeByte((this.Dne != null) ? 1 : 0);
    paramDataOutputStream.writeShort(this.Dne);
  }
  
  public fPl(String paramString, boolean paramBoolean, int paramInt) {
    this.Dne = paramString;
    this.Dne = paramBoolean;
    this.Dne = paramInt;
  }
  
  public fPl() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fPl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */