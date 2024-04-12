public class pRH extends yBi {
  public pRH(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
  
  static {
  
  }
  
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt1 = this.Dne.Dne(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
    int[] arrayOfInt2 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        Dne((b1 + paramInt1), (b + paramInt2));
        int i = arrayOfInt1[b1 + 1 + (b + 1) * (paramInt3 + 2)];
        if (i == OdI.ooe.Qnq) {
          int j = arrayOfInt1[b1 + 1 + (b + 1 - 1) * (paramInt3 + 2)];
          int k = arrayOfInt1[b1 + 1 + 1 + (b + 1) * (paramInt3 + 2)];
          int m = arrayOfInt1[b1 + 1 - 1 + (b + 1) * (paramInt3 + 2)];
          int n = arrayOfInt1[b1 + 1 + (b + 1 + 1) * (paramInt3 + 2)];
          if (j != OdI.Dne.Qnq && k != OdI.Dne.Qnq && m != OdI.Dne.Qnq && n != OdI.Dne.Qnq) {
            arrayOfInt2[b1 + b * paramInt3] = i;
          } else {
            arrayOfInt2[b1 + b * paramInt3] = OdI.trS.Qnq;
          } 
        } else if (i != OdI.Dne.Qnq && i != OdI.div.Qnq && i != OdI.DyG.Qnq && i != OdI.Qnq.Qnq) {
          int j = arrayOfInt1[b1 + 1 + (b + 1 - 1) * (paramInt3 + 2)];
          int k = arrayOfInt1[b1 + 1 + 1 + (b + 1) * (paramInt3 + 2)];
          int m = arrayOfInt1[b1 + 1 - 1 + (b + 1) * (paramInt3 + 2)];
          int n = arrayOfInt1[b1 + 1 + (b + 1 + 1) * (paramInt3 + 2)];
          if (j != OdI.Dne.Qnq && k != OdI.Dne.Qnq && m != OdI.Dne.Qnq && n != OdI.Dne.Qnq) {
            arrayOfInt2[b1 + b * paramInt3] = i;
          } else {
            arrayOfInt2[b1 + b * paramInt3] = OdI.qLR.Qnq;
          } 
        } else if (i == OdI.Qnq.Qnq) {
          int j = arrayOfInt1[b1 + 1 + (b + 1 - 1) * (paramInt3 + 2)];
          int k = arrayOfInt1[b1 + 1 + 1 + (b + 1) * (paramInt3 + 2)];
          int m = arrayOfInt1[b1 + 1 - 1 + (b + 1) * (paramInt3 + 2)];
          int n = arrayOfInt1[b1 + 1 + (b + 1 + 1) * (paramInt3 + 2)];
          if (j == OdI.Qnq.Qnq && k == OdI.Qnq.Qnq && m == OdI.Qnq.Qnq && n == OdI.Qnq.Qnq) {
            arrayOfInt2[b1 + b * paramInt3] = i;
          } else {
            arrayOfInt2[b1 + b * paramInt3] = OdI.EyB.Qnq;
          } 
        } else {
          arrayOfInt2[b1 + b * paramInt3] = i;
        } 
      } 
    } 
    return arrayOfInt2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pRH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */