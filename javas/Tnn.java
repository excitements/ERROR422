import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Tnn extends NER {
  public int FWm;
  
  public static final String[] Dne = new String[] { "tile.bed.notValid", null, null, "gameMode.changed" };
  
  public int Dne;
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
  }
  
  public Tnn(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne() {
    return 2;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
  }
  
  public Tnn() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tnn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */