public class uqp extends yBi {
  private OdI[] Dne = new OdI[] { OdI.bzF, OdI.aFZ, OdI.Qnq, OdI.DyG, OdI.FWm, OdI.zGp, OdI.FfS };
  
  public uqp(long paramLong, yBi paramyBi, kGO paramkGO) {
    super(paramLong);
    this.Dne = (OdI[])paramyBi;
    if (paramkGO == kGO.Qnq)
      this.Dne = new OdI[] { OdI.bzF, OdI.aFZ, OdI.Qnq, OdI.DyG, OdI.FWm, OdI.zGp }; 
  }
  
  public int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int[] arrayOfInt1 = this.Dne.Dne(paramInt1, paramInt2, paramInt3, paramInt4);
    int[] arrayOfInt2 = Xyv.Dne(paramInt3 * paramInt4);
    for (byte b = 0; b < paramInt4; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        Dne((b1 + paramInt1), (b + paramInt2));
        int i = arrayOfInt1[b1 + b * paramInt3];
        if (i == 0) {
          arrayOfInt2[b1 + b * paramInt3] = 0;
        } else if (i == OdI.ooe.Qnq) {
          arrayOfInt2[b1 + b * paramInt3] = i;
        } else if (i == 1) {
          arrayOfInt2[b1 + b * paramInt3] = (this.Dne[Dne(this.Dne.length)]).Qnq;
        } else {
          OdI odI = (this.Dne[Dne(this.Dne.length)]).Qnq;
          if (odI == OdI.zGp.Qnq) {
            arrayOfInt2[b1 + b * paramInt3] = odI;
          } else {
            arrayOfInt2[b1 + b * paramInt3] = OdI.kGO.Qnq;
          } 
        } 
      } 
    } 
    return arrayOfInt2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uqp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */