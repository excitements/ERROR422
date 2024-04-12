public class mpE implements ePy {
  private ePy Dne;
  
  private byte[] Dne;
  
  public ePy Dne() {
    return (ePy)this.Dne;
  }
  
  public mpE(ePy paramePy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Dne = new byte[paramInt2];
    this.Dne = (byte[])paramePy;
    System.arraycopy(paramArrayOfbyte, paramInt1, this.Dne, 0, paramInt2);
  }
  
  public byte[] Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mpE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */