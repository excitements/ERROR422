public class dTk extends zKP {
  private gDn FWm;
  
  private gDn Dne;
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    paramFiG.Dne(paramInt1, paramInt2, paramInt3);
    return true;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : ((paramInt1 == 0) ? zKP.Qnq.FWm(paramInt1) : ((paramInt1 != 2 && paramInt1 != 4) ? this.Qnq : this.FWm));
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("workbench_side");
    this.Dne = paramRbp.Dne("workbench_top");
    this.FWm = paramRbp.Dne("workbench_front");
  }
  
  protected dTk(int paramInt) {
    super(paramInt, KFd.Qnq);
    Dne(JcN.FWm);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dTk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */