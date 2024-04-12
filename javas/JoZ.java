public class JoZ extends yBi {
  static {
  
  }
  
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 -= 2;
    paramInt2 -= 2;
    byte b1 = 2;
    int i = 1 << b1;
    int j = paramInt1 >> b1;
    int k = paramInt2 >> b1;
    int m = (paramInt3 >> b1) + 3;
    int n = (paramInt4 >> b1) + 3;
    int[] arrayOfInt1 = this.Dne.Dne(j, k, m, n);
    int i1 = m << b1;
    int i2 = n << b1;
    int[] arrayOfInt2 = Xyv.Dne(i1 * i2);
    for (byte b3 = 0; b3 < n - 1; b3++) {
      int i3 = arrayOfInt1[0 + (b3 + 0) * m];
      int i4 = arrayOfInt1[0 + (b3 + 1) * m];
      for (byte b = 0; b < m - 1; b++) {
        double d1 = i * 0.9D;
        Dne((b + j << b1), (b3 + k << b1));
        double d2 = (Dne(1024) / 1024.0D - 0.5D) * d1;
        double d3 = (Dne(1024) / 1024.0D - 0.5D) * d1;
        Dne((b + j + 1 << b1), (b3 + k << b1));
        double d4 = (Dne(1024) / 1024.0D - 0.5D) * d1 + i;
        double d5 = (Dne(1024) / 1024.0D - 0.5D) * d1;
        Dne((b + j << b1), (b3 + k + 1 << b1));
        double d6 = (Dne(1024) / 1024.0D - 0.5D) * d1;
        double d7 = (Dne(1024) / 1024.0D - 0.5D) * d1 + i;
        Dne((b + j + 1 << b1), (b3 + k + 1 << b1));
        double d8 = (Dne(1024) / 1024.0D - 0.5D) * d1 + i;
        double d9 = (Dne(1024) / 1024.0D - 0.5D) * d1 + i;
        int i5 = arrayOfInt1[b + 1 + (b3 + 0) * m];
        int i6 = arrayOfInt1[b + 1 + (b3 + 1) * m];
        for (byte b4 = 0; b4 < i; b4++) {
          int i7 = ((b3 << b1) + b4) * i1 + (b << b1);
          for (byte b5 = 0; b5 < i; b5++) {
            double d10 = (b4 - d3) * (b4 - d3) + (b5 - d2) * (b5 - d2);
            double d11 = (b4 - d5) * (b4 - d5) + (b5 - d4) * (b5 - d4);
            double d12 = (b4 - d7) * (b4 - d7) + (b5 - d6) * (b5 - d6);
            double d13 = (b4 - d9) * (b4 - d9) + (b5 - d8) * (b5 - d8);
            if (d10 < d11 && d10 < d12 && d10 < d13) {
              arrayOfInt2[i7++] = i3;
            } else if (d11 < d10 && d11 < d12 && d11 < d13) {
              arrayOfInt2[i7++] = i5;
            } else if (d12 < d10 && d12 < d11 && d12 < d13) {
              arrayOfInt2[i7++] = i4;
            } else {
              arrayOfInt2[i7++] = i6;
            } 
          } 
        } 
        i3 = i5;
        i4 = i6;
      } 
    } 
    int[] arrayOfInt3 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b2 = 0; b2 < paramInt4; b2++)
      System.arraycopy(arrayOfInt2, (b2 + (paramInt2 & i - 1)) * (m << b1) + (paramInt1 & i - 1), arrayOfInt3, b2 * paramInt3, paramInt3); 
    return arrayOfInt3;
  }
  
  public JoZ(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JoZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */