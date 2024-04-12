public class MHV extends yBi {
  private yBi bzF;
  
  private yBi FWm;
  
  public void Dne(long paramLong) {
    this.FWm.Dne(paramLong);
    this.bzF.Dne(paramLong);
    super.Dne(paramLong);
  }
  
  public MHV(long paramLong, yBi paramyBi1, yBi paramyBi2) {
    super(paramLong);
    this.FWm = paramyBi1;
    this.bzF = paramyBi2;
  }
  
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt1 = this.FWm.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
    int[] arrayOfInt2 = this.bzF.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
    int[] arrayOfInt3 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt3 * paramInt4; b++) {
      if (arrayOfInt1[b] == OdI.Dne.Qnq) {
        arrayOfInt3[b] = arrayOfInt1[b];
      } else if (arrayOfInt2[b] >= 0) {
        if (arrayOfInt1[b] == OdI.kGO.Qnq) {
          arrayOfInt3[b] = OdI.Zpi.Qnq;
        } else if (arrayOfInt1[b] != OdI.ooe.Qnq && arrayOfInt1[b] != OdI.trS.Qnq) {
          arrayOfInt3[b] = arrayOfInt2[b];
        } else {
          arrayOfInt3[b] = OdI.trS.Qnq;
        } 
      } else {
        arrayOfInt3[b] = arrayOfInt1[b];
      } 
    } 
    return arrayOfInt3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MHV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */