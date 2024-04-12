import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class oFT extends FilterOutputStream {
  private tUA Dne;
  
  private XAo Dne;
  
  private byte[] FWm;
  
  private byte[] Dne = new byte[1];
  
  public void write(byte[] paramArrayOfbyte) {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void write(int paramInt) {
    this.Dne[0] = (byte)paramInt;
    if (this.Dne != null) {
      int i = this.Dne.Dne(this.Dne, 0, 1, this.FWm, 0);
      if (i != 0)
        this.out.write(this.FWm, 0, i); 
    } else {
      this.out.write(this.Dne.Dne((byte)paramInt));
    } 
  }
  
  public void flush() {
    super.flush();
  }
  
  public oFT(OutputStream paramOutputStream, tUA paramtUA) {
    super(paramOutputStream);
    this.Dne = (byte[])paramtUA;
    this.FWm = new byte[paramtUA.Dne()];
  }
  
  public void close() {
    try {
      if (this.Dne != null) {
        byte[] arrayOfByte = new byte[this.Dne.FWm(0)];
        int i = this.Dne.Dne(arrayOfByte, 0);
        if (i != 0)
          this.out.write(arrayOfByte, 0, i); 
      } 
    } catch (Exception exception) {
      throw new IOException("Error closing stream: " + exception.toString());
    } 
    flush();
    super.close();
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.Dne != null) {
      byte[] arrayOfByte = new byte[this.Dne.FWm(paramInt2)];
      int i = this.Dne.Dne(paramArrayOfbyte, paramInt1, paramInt2, arrayOfByte, 0);
      if (i != 0)
        this.out.write(arrayOfByte, 0, i); 
    } else {
      byte[] arrayOfByte = new byte[paramInt2];
      this.Dne.Dne(paramArrayOfbyte, paramInt1, paramInt2, arrayOfByte, 0);
      this.out.write(arrayOfByte, 0, paramInt2);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oFT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */