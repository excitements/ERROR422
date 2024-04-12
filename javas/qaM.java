public class qaM extends onZ {
  private FiG Dne;
  
  private int Dne;
  
  private final Jmn Dne;
  
  private final YzO Dne;
  
  public NMq Dne(int paramInt) {
    if (Dne())
      this.Dne += Math.min(paramInt, (Dne()).Dne); 
    return super.Dne(paramInt);
  }
  
  public boolean Dne(NMq paramNMq) {
    return false;
  }
  
  protected void Dne(NMq paramNMq, int paramInt) {
    this.Dne += paramInt;
    FWm(paramNMq);
  }
  
  protected void FWm(NMq paramNMq) {
    paramNMq.Dne((Qnq)((FiG)this.Dne).Dne, (FiG)this.Dne, this.Dne);
    this.Dne = false;
  }
  
  private boolean Dne(Vnr paramVnr, NMq paramNMq1, NMq paramNMq2) {
    NMq nMq1 = paramVnr.Dne();
    NMq nMq2 = paramVnr.FWm();
    if (paramNMq1 != null && paramNMq1.bzF == nMq1.bzF) {
      if (nMq2 != null && paramNMq2 != null && nMq2.bzF == paramNMq2.bzF) {
        paramNMq1.Dne -= nMq1.Dne;
        paramNMq2.Dne -= nMq2.Dne;
        return true;
      } 
      if (nMq2 == null && paramNMq2 == null) {
        paramNMq1.Dne -= nMq1.Dne;
        return true;
      } 
    } 
    return false;
  }
  
  public void Dne(FiG paramFiG, NMq paramNMq) {
    FWm(paramNMq);
    Vnr vnr = this.Dne.Dne();
    if (vnr != null) {
      NMq nMq1 = this.Dne.Dne(0);
      NMq nMq2 = this.Dne.Dne(1);
      if (Dne(vnr, nMq1, nMq2) || Dne(vnr, nMq2, nMq1)) {
        if (nMq1 != null && nMq1.Dne <= 0)
          nMq1 = null; 
        if (nMq2 != null && nMq2.Dne <= 0)
          nMq2 = null; 
        this.Dne.Dne(0, nMq1);
        this.Dne.Dne(1, nMq2);
        this.Dne.Dne(vnr);
      } 
    } 
  }
  
  public qaM(FiG paramFiG, YzO paramYzO, Jmn paramJmn, int paramInt1, int paramInt2, int paramInt3) {
    super(paramJmn, paramInt1, paramInt2, paramInt3);
    this.Dne = (YzO)paramFiG;
    this.Dne = paramYzO;
    this.Dne = (YzO)paramJmn;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qaM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */