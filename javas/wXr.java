import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wXr extends iET {
  static {
  
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    super.Dne(paramDataOutputStream);
    paramDataOutputStream.writeByte(this.Qnq);
    paramDataOutputStream.writeByte(this.aFZ);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    super.Dne(paramDataInputStream);
    this.Qnq = paramDataInputStream.readByte();
    this.aFZ = paramDataInputStream.readByte();
  }
  
  public int Dne() {
    return 6;
  }
  
  public wXr(int paramInt, byte paramByte1, byte paramByte2) {
    super(paramInt);
    this.Qnq = paramByte1;
    this.aFZ = paramByte2;
    this.Dne = 1;
  }
  
  public wXr() {
    this.Dne = 1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wXr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */