public class nnv extends yBi {
  public nnv(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
  
  static {
  
  }
  
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt1 = this.Dne.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
    int[] arrayOfInt2 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        Dne((b1 + paramInt1), (b + paramInt2));
        arrayOfInt2[b1 + b * paramInt3] = (arrayOfInt1[b1 + b * paramInt3] > 0) ? (Dne(2) + 2) : 0;
      } 
    } 
    return arrayOfInt2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nnv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */