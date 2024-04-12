import java.io.DataInput;
import java.io.DataOutput;

public class bCM extends oNe {
  public byte Dne;
  
  public int hashCode() {
    return super.hashCode() ^ this.Dne;
  }
  
  public bCM(String paramString, byte paramByte) {
    super(paramString);
    this.Dne = paramByte;
  }
  
  public bCM(String paramString) {
    super(paramString);
  }
  
  public oNe Dne() {
    return new bCM(Dne(), this.Dne);
  }
  
  public byte Dne() {
    return 1;
  }
  
  public boolean equals(Object paramObject) {
    if (super.equals(paramObject)) {
      bCM bCM1 = (bCM)paramObject;
      return (this.Dne == bCM1.Dne);
    } 
    return false;
  }
  
  public String toString() {
    return "" + this.Dne;
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeByte(this.Dne);
  }
  
  void Dne(DataInput paramDataInput) {
    this.Dne = paramDataInput.readByte();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bCM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */