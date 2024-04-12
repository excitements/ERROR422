import java.io.DataInput;
import java.io.DataOutput;

public class kJU extends oNe {
  public double Dne;
  
  void Dne(DataInput paramDataInput) {
    this.Dne = paramDataInput.readDouble();
  }
  
  public int hashCode() {
    long l = Double.doubleToLongBits(this.Dne);
    return super.hashCode() ^ (int)(l ^ l >>> 32L);
  }
  
  public oNe Dne() {
    return new kJU(Dne(), this.Dne);
  }
  
  public byte Dne() {
    return 6;
  }
  
  public String toString() {
    return "" + this.Dne;
  }
  
  public kJU(String paramString) {
    super(paramString);
  }
  
  public boolean equals(Object paramObject) {
    if (super.equals(paramObject)) {
      kJU kJU1 = (kJU)paramObject;
      return (this.Dne == kJU1.Dne);
    } 
    return false;
  }
  
  public kJU(String paramString, double paramDouble) {
    super(paramString);
    this.Dne = paramDouble;
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeDouble(this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kJU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */