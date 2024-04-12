public class Xor extends yBi {
  public Xor(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
  
  static {
  
  }
  
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 - 1;
    int j = paramInt2 - 1;
    int k = paramInt3 + 2;
    int m = paramInt4 + 2;
    int[] arrayOfInt1 = this.Dne.Dne(i, j, k, m);
    int[] arrayOfInt2 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        int n = arrayOfInt1[b1 + 1 + (b + 1) * k];
        Dne((b1 + paramInt1), (b + paramInt2));
        if (n == 0) {
          arrayOfInt2[b1 + b * paramInt3] = 0;
        } else {
          int i1 = Dne(5);
          if (i1 == 0) {
            OdI odI = OdI.kGO.Qnq;
          } else {
            i1 = 1;
          } 
          arrayOfInt2[b1 + b * paramInt3] = i1;
        } 
      } 
    } 
    return arrayOfInt2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Xor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */