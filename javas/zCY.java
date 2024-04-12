import java.io.DataInput;
import java.io.DataOutput;

public class zCY extends oNe {
  public long Dne;
  
  public byte Dne() {
    return 4;
  }
  
  public zCY(String paramString, long paramLong) {
    super(paramString);
    this.Dne = paramLong;
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeLong(this.Dne);
  }
  
  void Dne(DataInput paramDataInput) {
    this.Dne = paramDataInput.readLong();
  }
  
  public zCY(String paramString) {
    super(paramString);
  }
  
  public int hashCode() {
    return super.hashCode() ^ (int)(this.Dne ^ this.Dne >>> 32L);
  }
  
  public boolean equals(Object paramObject) {
    if (super.equals(paramObject)) {
      zCY zCY1 = (zCY)paramObject;
      return (this.Dne == zCY1.Dne);
    } 
    return false;
  }
  
  public String toString() {
    return "" + this.Dne;
  }
  
  public oNe Dne() {
    return new zCY(Dne(), this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zCY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */