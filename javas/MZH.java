public class MZH extends CVd {
  private final ClS Dne = new tip();
  
  protected ClS Dne(NMq paramNMq) {
    return this.Dne;
  }
  
  protected MZH(int paramInt) {
    super(paramInt);
  }
  
  protected void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    XSK xSK = new XSK(paramQnq, paramInt1, paramInt2, paramInt3);
    UTs uTs = (UTs)xSK.Dne();
    if (uTs != null) {
      int i = uTs.Dne();
      if (i < 0) {
        paramQnq.Qnq(1001, paramInt1, paramInt2, paramInt3, 0);
      } else {
        NMq nMq2;
        NMq nMq1 = uTs.Dne(i);
        int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x7;
        MqS mqS = Aem.Dne(paramQnq, (paramInt1 + rrP.FWm[j]), (paramInt2 + rrP.bzF[j]), (paramInt3 + rrP.Qnq[j]));
        if (mqS != null) {
          nMq2 = Aem.Dne(mqS, nMq1.Dne().Dne(1), rrP.Dne[j]);
          if (nMq2 == null) {
            nMq2 = nMq1.Dne();
            if (--nMq2.Dne == 0)
              nMq2 = null; 
          } else {
            nMq2 = nMq1.Dne();
          } 
        } else {
          nMq2 = this.Dne.Dne(xSK, nMq1);
          if (nMq2 != null && nMq2.Dne == 0)
            nMq2 = null; 
        } 
        uTs.Dne(i, nMq2);
      } 
    } 
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("furnace_side");
    this.Dne = (ClS)paramRbp.Dne("furnace_top");
    this.FWm = paramRbp.Dne("dropper_front");
    this.bzF = paramRbp.Dne("dropper_front_vertical");
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new BDA();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MZH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */