import java.io.DataInputStream;
import java.io.DataOutputStream;

public class QEr extends FQJ {
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeDouble(this.Dne);
    paramDataOutputStream.writeDouble(this.FWm);
    paramDataOutputStream.writeDouble(this.Qnq);
    paramDataOutputStream.writeDouble(this.bzF);
    super.Dne(paramDataOutputStream);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readDouble();
    this.FWm = paramDataInputStream.readDouble();
    this.Qnq = paramDataInputStream.readDouble();
    this.bzF = paramDataInputStream.readDouble();
    super.Dne(paramDataInputStream);
  }
  
  public int Dne() {
    return 33;
  }
  
  public QEr(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.Qnq = paramDouble3;
    this.bzF = paramDouble4;
    this.Dne = paramBoolean;
    this.FWm = true;
  }
  
  static {
  
  }
  
  public QEr() {
    this.FWm = true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QEr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */