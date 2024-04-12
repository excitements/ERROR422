import java.io.DataInputStream;
import java.io.DataOutputStream;

public class eMn extends FQJ {
  static {
  
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeDouble(this.Dne);
    paramDataOutputStream.writeDouble(this.FWm);
    paramDataOutputStream.writeDouble(this.Qnq);
    paramDataOutputStream.writeDouble(this.bzF);
    paramDataOutputStream.writeFloat(this.Dne);
    paramDataOutputStream.writeFloat(this.FWm);
    super.Dne(paramDataOutputStream);
  }
  
  public eMn(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.Qnq = paramDouble3;
    this.bzF = paramDouble4;
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
    this.Dne = paramBoolean;
    this.bzF = true;
    this.FWm = true;
  }
  
  public int Dne() {
    return 41;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readDouble();
    this.FWm = paramDataInputStream.readDouble();
    this.Qnq = paramDataInputStream.readDouble();
    this.bzF = paramDataInputStream.readDouble();
    this.Dne = paramDataInputStream.readFloat();
    this.FWm = paramDataInputStream.readFloat();
    super.Dne(paramDataInputStream);
  }
  
  public eMn() {
    this.bzF = true;
    this.FWm = true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\eMn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */