public class dMv extends ljW {
  private gDn Dne;
  
  public boolean FWm() {
    return false;
  }
  
  public gDn Dne() {
    return this.Dne;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFUH, paramNMq);
    if (paramNMq.zGp())
      ((TpA)paramQnq.Dne(paramInt1, paramInt2, paramInt3)).Dne(paramNMq.FWm()); 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    this.Dne = paramRbp.Dne("beacon");
  }
  
  public dMv(int paramInt) {
    super(paramInt, KFd.ATE);
    bzF(3.0F);
    Dne(JcN.aFZ);
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new TpA();
  }
  
  public int Dne() {
    return 34;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    TpA tpA = (TpA)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (tpA != null)
      paramFiG.Dne(tpA); 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dMv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */