import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class kfd extends oNe {
  public byte[] Dne;
  
  public kfd(String paramString) {
    super(paramString);
  }
  
  public byte Dne() {
    return 7;
  }
  
  public String toString() {
    return "[" + this.Dne.length + " bytes]";
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeInt(this.Dne.length);
    paramDataOutput.write(this.Dne);
  }
  
  public boolean equals(Object paramObject) {
    return super.equals(paramObject) ? Arrays.equals(this.Dne, ((kfd)paramObject).Dne) : false;
  }
  
  void Dne(DataInput paramDataInput) {
    int i = paramDataInput.readInt();
    this.Dne = new byte[i];
    paramDataInput.readFully(this.Dne);
  }
  
  public kfd(String paramString, byte[] paramArrayOfbyte) {
    super(paramString);
    this.Dne = paramArrayOfbyte;
  }
  
  public int hashCode() {
    return super.hashCode() ^ Arrays.hashCode(this.Dne);
  }
  
  public oNe Dne() {
    byte[] arrayOfByte = new byte[this.Dne.length];
    System.arraycopy(this.Dne, 0, arrayOfByte, 0, this.Dne.length);
    return new kfd(Dne(), arrayOfByte);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kfd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */