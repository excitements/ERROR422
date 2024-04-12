public class ihb extends yBi {
  public ihb(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
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
        int n = arrayOfInt1[b1 + 0 + (b + 1) * k];
        int i1 = arrayOfInt1[b1 + 2 + (b + 1) * k];
        int i2 = arrayOfInt1[b1 + 1 + (b + 0) * k];
        int i3 = arrayOfInt1[b1 + 1 + (b + 2) * k];
        int i4 = arrayOfInt1[b1 + 1 + (b + 1) * k];
        if (i4 != 0 && n != 0 && i1 != 0 && i2 != 0 && i3 != 0 && i4 == n && i4 == i2 && i4 == i1 && i4 == i3) {
          arrayOfInt2[b1 + b * paramInt3] = -1;
        } else {
          arrayOfInt2[b1 + b * paramInt3] = OdI.div.Qnq;
        } 
      } 
    } 
    return arrayOfInt2;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ihb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */