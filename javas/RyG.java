public class RyG extends yBi {
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt1 = this.Dne.Dne(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
    int[] arrayOfInt2 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        Dne((b1 + paramInt1), (b + paramInt2));
        int i = arrayOfInt1[b1 + 1 + (b + 1) * (paramInt3 + 2)];
        if ((i != OdI.DyG.Qnq || Dne(6) != 0) && ((i != OdI.FfS.Qnq && i != OdI.OdI.Qnq) || Dne(8) != 0)) {
          arrayOfInt2[b1 + b * paramInt3] = i;
        } else {
          arrayOfInt2[b1 + b * paramInt3] = OdI.div.Qnq;
        } 
      } 
    } 
    return arrayOfInt2;
  }
  
  static {
  
  }
  
  public RyG(long paramLong, yBi paramyBi) {
    super(paramLong);
    this.Dne = paramyBi;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RyG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */