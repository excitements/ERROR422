import java.io.DataInput;
import java.io.DataOutput;

public class phA extends oNe {
  public short Dne;
  
  public boolean equals(Object paramObject) {
    if (super.equals(paramObject)) {
      phA phA1 = (phA)paramObject;
      return (this.Dne == phA1.Dne);
    } 
    return false;
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeShort(this.Dne);
  }
  
  public phA(String paramString, short paramShort) {
    super(paramString);
    this.Dne = paramShort;
  }
  
  public phA(String paramString) {
    super(paramString);
  }
  
  public String toString() {
    return "" + this.Dne;
  }
  
  public byte Dne() {
    return 2;
  }
  
  public oNe Dne() {
    return new phA(Dne(), this.Dne);
  }
  
  void Dne(DataInput paramDataInput) {
    this.Dne = paramDataInput.readShort();
  }
  
  public int hashCode() {
    return super.hashCode() ^ this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\phA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */