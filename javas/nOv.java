import java.io.DataInput;
import java.io.DataOutput;

public class nOv extends oNe {
  public float Dne;
  
  public int hashCode() {
    return super.hashCode() ^ Float.floatToIntBits(this.Dne);
  }
  
  public nOv(String paramString, float paramFloat) {
    super(paramString);
    this.Dne = paramFloat;
  }
  
  public byte Dne() {
    return 5;
  }
  
  public String toString() {
    return "" + this.Dne;
  }
  
  public oNe Dne() {
    return new nOv(Dne(), this.Dne);
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeFloat(this.Dne);
  }
  
  public boolean equals(Object paramObject) {
    if (super.equals(paramObject)) {
      nOv nOv1 = (nOv)paramObject;
      return (this.Dne == nOv1.Dne);
    } 
    return false;
  }
  
  public nOv(String paramString) {
    super(paramString);
  }
  
  void Dne(DataInput paramDataInput) {
    this.Dne = paramDataInput.readFloat();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nOv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */