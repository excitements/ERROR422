import java.io.DataInputStream;
import java.io.DataOutputStream;

public class FTJ extends FQJ {
  static {
  
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeFloat(this.Dne);
    paramDataOutputStream.writeFloat(this.FWm);
    super.Dne(paramDataOutputStream);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readFloat();
    this.FWm = paramDataInputStream.readFloat();
    super.Dne(paramDataInputStream);
  }
  
  public FTJ(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
    this.Dne = paramBoolean;
    this.bzF = true;
  }
  
  public FTJ() {
    this.bzF = true;
  }
  
  public int Dne() {
    return 9;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FTJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */