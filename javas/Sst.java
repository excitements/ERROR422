public class Sst implements ePy {
  private byte[] Dne;
  
  public Sst(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Dne = new byte[paramInt2];
    System.arraycopy(paramArrayOfbyte, paramInt1, this.Dne, 0, paramInt2);
  }
  
  public Sst(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public byte[] Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Sst.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */