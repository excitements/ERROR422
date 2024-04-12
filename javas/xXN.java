public class xXN {
  private final int Dne;
  
  public final byte[] Dne;
  
  private final int FWm;
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 << this.FWm | paramInt3 << this.Dne | paramInt2;
    int j = i >> 1;
    int k = i & 0x1;
    return (k == 0) ? (this.Dne[j] & 0xF) : (this.Dne[j] >> 4 & 0xF);
  }
  
  public xXN(byte[] paramArrayOfbyte, int paramInt) {
    this.Dne = paramArrayOfbyte;
    this.Dne = paramInt;
    this.FWm = paramInt + 4;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xXN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */