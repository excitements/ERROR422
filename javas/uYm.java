import java.io.DataInputStream;
import java.io.DataOutputStream;

public class uYm extends NER {
  public long zGp;
  
  public long DyG;
  
  public boolean Dne() {
    return true;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeLong(this.zGp);
    paramDataOutputStream.writeLong(this.DyG);
  }
  
  public int Dne() {
    return 16;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.zGp = paramDataInputStream.readLong();
    this.DyG = paramDataInputStream.readLong();
  }
  
  public uYm() {}
  
  public boolean Dne(NER paramNER) {
    return true;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public uYm(long paramLong1, long paramLong2) {
    this.zGp = paramLong1;
    this.DyG = paramLong2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uYm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */