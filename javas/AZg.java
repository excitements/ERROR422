public class AZg extends yBi {
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 - 1;
    int j = paramInt2 - 1;
    int k = paramInt3 + 2;
    int m = paramInt4 + 2;
    int[] arrayOfInt1 = this.Dne.Dne(i, j, k, m);
    int[] arrayOfInt2 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        int n = arrayOfInt1[b1 + 0 + (b + 1) * k];
        int i1 = arrayOfInt1[b1 + 2 + (b + 1) * k];
        int i2 = arrayOfInt1[b1 + 1 + (b + 0) * k];
        int i3 = arrayOfInt1[b1 + 1 + (b + 2) * k];
        int i4 = arrayOfInt1[b1 + 1 + (b + 1) * k];
        if (n == i1 && i2 == i3) {
          Dne((b1 + paramInt1), (b + paramInt2));
          if (Dne(2) == 0) {
            i4 = n;
          } else {
            i4 = i2;
          } 
        } else {
          if (n == i1)
            i4 = n; 
          if (i2 == i3)
            i4 = i2; 
        } 
        arrayOfInt2[b1 + b * paramInt3] = i4;
      } 
    } 
    return arrayOfInt2;
  }
  
  static {
  
  }
  
  public AZg(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AZg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */