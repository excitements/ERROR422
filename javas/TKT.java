public class TKT extends yBi {
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 - 1;
    int j = paramInt2 - 1;
    int k = paramInt3 + 2;
    int m = paramInt4 + 2;
    int[] arrayOfInt1 = this.Dne.Dne(i, j, k, m);
    int[] arrayOfInt2 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        int n = arrayOfInt1[b1 + 0 + (b + 0) * k];
        int i1 = arrayOfInt1[b1 + 2 + (b + 0) * k];
        int i2 = arrayOfInt1[b1 + 0 + (b + 2) * k];
        int i3 = arrayOfInt1[b1 + 2 + (b + 2) * k];
        int i4 = arrayOfInt1[b1 + 1 + (b + 1) * k];
        Dne((b1 + paramInt1), (b + paramInt2));
        if (i4 == 0 && (n != 0 || i1 != 0 || i2 != 0 || i3 != 0)) {
          byte b2 = 1;
          int i5 = 1;
          if (n != 0 && Dne(b2++) == 0)
            i5 = n; 
          if (i1 != 0 && Dne(b2++) == 0)
            i5 = i1; 
          if (i2 != 0 && Dne(b2++) == 0)
            i5 = i2; 
          if (i3 != 0 && Dne(b2++) == 0)
            i5 = i3; 
          if (Dne(3) == 0) {
            arrayOfInt2[b1 + b * paramInt3] = i5;
          } else if (i5 == OdI.kGO.Qnq) {
            arrayOfInt2[b1 + b * paramInt3] = OdI.XHL.Qnq;
          } else {
            arrayOfInt2[b1 + b * paramInt3] = 0;
          } 
        } else if (i4 > 0 && (n == 0 || i1 == 0 || i2 == 0 || i3 == 0)) {
          if (Dne(5) == 0) {
            if (i4 == OdI.kGO.Qnq) {
              arrayOfInt2[b1 + b * paramInt3] = OdI.XHL.Qnq;
            } else {
              arrayOfInt2[b1 + b * paramInt3] = 0;
            } 
          } else {
            arrayOfInt2[b1 + b * paramInt3] = i4;
          } 
        } else {
          arrayOfInt2[b1 + b * paramInt3] = i4;
        } 
      } 
    } 
    return arrayOfInt2;
  }
  
  static {
  
  }
  
  public TKT(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TKT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */