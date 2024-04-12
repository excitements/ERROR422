import java.io.DataInput;
import java.io.DataOutput;

public class BYr extends oNe {
  public int Dne;
  
  void Dne(DataInput paramDataInput) {
    this.Dne = paramDataInput.readInt();
  }
  
  public BYr(String paramString, int paramInt) {
    super(paramString);
    this.Dne = paramInt;
  }
  
  public int hashCode() {
    return super.hashCode() ^ this.Dne;
  }
  
  public boolean equals(Object paramObject) {
    if (super.equals(paramObject)) {
      BYr bYr = (BYr)paramObject;
      return (this.Dne == bYr.Dne);
    } 
    return false;
  }
  
  public byte Dne() {
    return 3;
  }
  
  public oNe Dne() {
    return new BYr(Dne(), this.Dne);
  }
  
  public String toString() {
    return "" + this.Dne;
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeInt(this.Dne);
  }
  
  public BYr(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BYr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */