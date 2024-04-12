import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DyR extends iET {
  public DyR() {}
  
  public int Dne() {
    return 9;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    super.Dne(paramDataOutputStream);
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
    paramDataOutputStream.writeByte(this.bzF);
    paramDataOutputStream.writeByte(this.Qnq);
    paramDataOutputStream.writeByte(this.aFZ);
  }
  
  static {
  
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    super.Dne(paramDataInputStream);
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
    this.bzF = paramDataInputStream.readByte();
    this.Qnq = paramDataInputStream.readByte();
    this.aFZ = paramDataInputStream.readByte();
  }
  
  public DyR(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5) {
    super(paramInt);
    this.FWm = paramByte2;
    this.bzF = paramByte3;
    this.Qnq = paramByte4;
    this.aFZ = paramByte5;
    this.Dne = 1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DyR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */