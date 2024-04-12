import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class ybG {
  private ByteArrayOutputStream Dne;
  
  private DataOutputStream Dne;
  
  public void Dne(String paramString) {
    this.Dne.writeBytes(paramString);
    this.Dne.write(0);
  }
  
  public ybG(int paramInt) {
    this.Dne = (DataOutputStream)new ByteArrayOutputStream(paramInt);
    this.Dne = new DataOutputStream(this.Dne);
  }
  
  public void Dne() {
    this.Dne.reset();
  }
  
  public void Dne(short paramShort) {
    this.Dne.writeShort(Short.reverseBytes(paramShort));
  }
  
  public byte[] Dne() {
    return this.Dne.toByteArray();
  }
  
  public void Dne(byte[] paramArrayOfbyte) {
    this.Dne.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void Dne(int paramInt) {
    this.Dne.write(paramInt);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ybG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */