import java.io.InputStream;
import java.net.URL;

class gEW extends InputStream {
  private InputStream Dne;
  
  byte[] Dne;
  
  private int Dne;
  
  final Lrh Dne;
  
  public int read() {
    int i = read((byte[])this.Dne, 0, 1);
    return (i < 0) ? i : this.Dne[0];
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt2 = this.Dne.read(paramArrayOfbyte, paramInt1, paramInt2);
    for (byte b = 0; b < paramInt2; b++) {
      byte b1 = paramArrayOfbyte[paramInt1 + b] = (byte)(paramArrayOfbyte[paramInt1 + b] ^ this.Dne >> 8);
      this.Dne = this.Dne * 498729871 + 85731 * b1;
    } 
    return paramInt2;
  }
  
  public gEW(Lrh paramLrh, URL paramURL, InputStream paramInputStream) {
    this.Dne = paramLrh;
    this.Dne = (Lrh)new byte[1];
    this.Dne = (Lrh)paramInputStream;
    String str = paramURL.getPath();
    str = str.substring(str.lastIndexOf("/") + 1);
    this.Dne = str.hashCode();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gEW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */