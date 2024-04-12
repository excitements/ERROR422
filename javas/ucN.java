public class ucN extends dEr {
  private gDn FWm;
  
  public gDn Dne() {
    return this.FWm;
  }
  
  public ucN(int paramInt) {
    super(paramInt);
    FWm(64);
    Dne(1);
    Dne(JcN.div);
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    this.FWm = paramRbp.Dne("fishingRod_empty");
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    if (paramFiG.Dne != null) {
      int i = paramFiG.Dne.Dne();
      paramNMq.Dne(i, paramFiG);
      paramFiG.bzF();
    } else {
      paramQnq.Dne(paramFiG, "random.bow", 0.5F, 0.4F / (Dne.nextFloat() * 0.4F + 0.8F));
      if (paramQnq.aFZ == null)
        paramQnq.FWm(new cQz(paramQnq, paramFiG)); 
      paramFiG.bzF();
    } 
    return paramNMq;
  }
  
  public boolean bzF() {
    return true;
  }
  
  public boolean FWm() {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\ucN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */