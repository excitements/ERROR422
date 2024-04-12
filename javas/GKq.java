import java.io.DataInputStream;
import java.io.DataOutputStream;

public class GKq extends iET {
  static {
  
  }
  
  public int Dne() {
    return 7;
  }
  
  public GKq(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3) {
    super(paramInt);
    this.Dne = paramByte1;
    this.FWm = paramByte2;
    this.bzF = paramByte3;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    super.Dne(paramDataInputStream);
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
    this.bzF = paramDataInputStream.readByte();
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    super.Dne(paramDataOutputStream);
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
    paramDataOutputStream.writeByte(this.bzF);
  }
  
  public GKq() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GKq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */