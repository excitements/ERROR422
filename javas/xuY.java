import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class xuY extends oNe {
  public int[] Dne;
  
  public String toString() {
    return "[" + this.Dne.length + " bytes]";
  }
  
  void Dne(DataInput paramDataInput) {
    int i = paramDataInput.readInt();
    this.Dne = new int[i];
    for (byte b = 0; b < i; b++)
      this.Dne[b] = paramDataInput.readInt(); 
  }
  
  void Dne(DataOutput paramDataOutput) {
    paramDataOutput.writeInt(this.Dne.length);
    for (byte b = 0; b < this.Dne.length; b++)
      paramDataOutput.writeInt(this.Dne[b]); 
  }
  
  public oNe Dne() {
    int[] arrayOfInt = new int[this.Dne.length];
    System.arraycopy(this.Dne, 0, arrayOfInt, 0, this.Dne.length);
    return new xuY(Dne(), arrayOfInt);
  }
  
  public byte Dne() {
    return 11;
  }
  
  public boolean equals(Object paramObject) {
    if (!super.equals(paramObject))
      return false; 
    xuY xuY1 = (xuY)paramObject;
    return ((this.Dne == null && xuY1.Dne == null) || (this.Dne != null && Arrays.equals(this.Dne, xuY1.Dne)));
  }
  
  public xuY(String paramString, int[] paramArrayOfint) {
    super(paramString);
    this.Dne = paramArrayOfint;
  }
  
  public xuY(String paramString) {
    super(paramString);
  }
  
  public int hashCode() {
    return super.hashCode() ^ Arrays.hashCode(this.Dne);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xuY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */