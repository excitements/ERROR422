public class yRM extends yBi {
  public static yBi Dne(long paramLong, yBi paramyBi, int paramInt) {
    yBi yBi1 = paramyBi;
    for (byte b = 0; b < paramInt; b++)
      yBi1 = new yRM(paramLong + b, yBi1); 
    return yBi1;
  }
  
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 >> 1;
    int j = paramInt2 >> 1;
    int k = (paramInt3 >> 1) + 3;
    int m = (paramInt4 >> 1) + 3;
    int[] arrayOfInt1 = this.Dne.Dne(i, j, k, m);
    int[] arrayOfInt2 = Xyv.Dne(k * 2 * m * 2);
    int n = k << 1;
    for (byte b2 = 0; b2 < m - 1; b2++) {
      int i1 = b2 << 1;
      int i2 = i1 * n;
      int i3 = arrayOfInt1[0 + (b2 + 0) * k];
      int i4 = arrayOfInt1[0 + (b2 + 1) * k];
      for (byte b = 0; b < k - 1; b++) {
        Dne((b + i << 1), (b2 + j << 1));
        int i5 = arrayOfInt1[b + 1 + (b2 + 0) * k];
        int i6 = arrayOfInt1[b + 1 + (b2 + 1) * k];
        arrayOfInt2[i2] = i3;
        arrayOfInt2[i2++ + n] = Dne(i3, i4);
        arrayOfInt2[i2] = Dne(i3, i5);
        arrayOfInt2[i2++ + n] = Dne(i3, i5, i4, i6);
        i3 = i5;
        i4 = i6;
      } 
    } 
    int[] arrayOfInt3 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b1 = 0; b1 < paramInt4; b1++)
      System.arraycopy(arrayOfInt2, (b1 + (paramInt2 & 0x1)) * (k << 1) + (paramInt1 & 0x1), arrayOfInt3, b1 * paramInt3, paramInt3); 
    return arrayOfInt3;
  }
  
  protected int Dne(int paramInt1, int paramInt2) {
    return (Dne(2) == 0) ? paramInt1 : paramInt2;
  }
  
  public yRM(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
  
  static {
  
  }
  
  protected int Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 == paramInt3 && paramInt3 == paramInt4)
      return paramInt2; 
    if (paramInt1 == paramInt2 && paramInt1 == paramInt3)
      return paramInt1; 
    if (paramInt1 == paramInt2 && paramInt1 == paramInt4)
      return paramInt1; 
    if (paramInt1 == paramInt3 && paramInt1 == paramInt4)
      return paramInt1; 
    if (paramInt1 == paramInt2 && paramInt3 != paramInt4)
      return paramInt1; 
    if (paramInt1 == paramInt3 && paramInt2 != paramInt4)
      return paramInt1; 
    if (paramInt1 == paramInt4 && paramInt2 != paramInt3)
      return paramInt1; 
    if (paramInt2 == paramInt1 && paramInt3 != paramInt4)
      return paramInt2; 
    if (paramInt2 == paramInt3 && paramInt1 != paramInt4)
      return paramInt2; 
    if (paramInt2 == paramInt4 && paramInt1 != paramInt3)
      return paramInt2; 
    if (paramInt3 == paramInt1 && paramInt2 != paramInt4)
      return paramInt3; 
    if (paramInt3 == paramInt2 && paramInt1 != paramInt4)
      return paramInt3; 
    if (paramInt3 == paramInt4 && paramInt1 != paramInt2)
      return paramInt3; 
    if (paramInt4 == paramInt1 && paramInt2 != paramInt3)
      return paramInt3; 
    if (paramInt4 == paramInt2 && paramInt1 != paramInt3)
      return paramInt3; 
    if (paramInt4 == paramInt3 && paramInt1 != paramInt2)
      return paramInt3; 
    int i = Dne(4);
    return (i == 0) ? paramInt1 : ((i == 1) ? paramInt2 : ((i == 2) ? paramInt3 : paramInt4));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yRM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */