import java.io.InputStream;
import java.io.RandomAccessFile;

class TJY extends InputStream {
  RandomAccessFile Dne;
  
  final String Dne = null;
  
  public int read() {
    return this.Dne.read();
  }
  
  TJY(JQZ paramJQZ, String paramString) {
    this.Dne = "r";
    this.Dne = (String)new RandomAccessFile(paramString, "r");
  }
  
  public long FWm() {
    return this.Dne.getFilePointer();
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return this.Dne.read(paramArrayOfbyte);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return this.Dne.read(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public synchronized void mark(int paramInt) {}
  
  public int available() {
    return (this.Dne.length() == this.Dne.getFilePointer()) ? 0 : 1;
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public void Dne(long paramLong) {
    this.Dne.seek(paramLong);
  }
  
  public void close() {
    this.Dne.close();
  }
  
  public synchronized void reset() {}
  
  public long Dne() {
    return this.Dne.length();
  }
  
  public long skip(long paramLong) {
    return this.Dne.skipBytes((int)paramLong);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TJY.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */