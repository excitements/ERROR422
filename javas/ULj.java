public class ULj extends kbN {
  private boolean Dne;
  
  private gDn FWm;
  
  private gDn Dne;
  
  public void Dne(Rbp paramRbp) {
    this.FWm = paramRbp.Dne((this.Dne != null) ? "pumpkin_jack" : "pumpkin_face");
    this.Dne = paramRbp.Dne("pumpkin_top");
    this.Qnq = paramRbp.Dne("pumpkin_side");
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 2.5D) & 0x3;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == zKP.Jik.FWm && paramQnq.Dne(paramInt1, paramInt2 - 2, paramInt3) == zKP.Jik.FWm) {
      if (paramQnq.aFZ == null) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, 0, 0, 2);
        paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3, 0, 0, 2);
        paramQnq.FWm(paramInt1, paramInt2 - 2, paramInt3, 0, 0, 2);
        wao wao = new wao(paramQnq);
        wao.FWm(paramInt1 + 0.5D, paramInt2 - 1.95D, paramInt3 + 0.5D, 0.0F, 0.0F);
        paramQnq.FWm(wao);
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0);
        paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3, 0);
        paramQnq.Dne(paramInt1, paramInt2 - 2, paramInt3, 0);
      } 
      for (byte b = 0; b < 120; b++)
        paramQnq.Dne("snowshovel", paramInt1 + paramQnq.Dne.nextDouble(), (paramInt2 - 2) + paramQnq.Dne.nextDouble() * 2.5D, paramInt3 + paramQnq.Dne.nextDouble(), 0.0D, 0.0D, 0.0D); 
    } else if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == zKP.gnI.FWm && paramQnq.Dne(paramInt1, paramInt2 - 2, paramInt3) == zKP.gnI.FWm) {
      boolean bool1 = (paramQnq.Dne(paramInt1 - 1, paramInt2 - 1, paramInt3) == zKP.gnI.FWm && paramQnq.Dne(paramInt1 + 1, paramInt2 - 1, paramInt3) == zKP.gnI.FWm) ? true : false;
      boolean bool2 = (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3 - 1) == zKP.gnI.FWm && paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3 + 1) == zKP.gnI.FWm) ? true : false;
      if (bool1 || bool2) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, 0, 0, 2);
        paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3, 0, 0, 2);
        paramQnq.FWm(paramInt1, paramInt2 - 2, paramInt3, 0, 0, 2);
        if (bool1) {
          paramQnq.FWm(paramInt1 - 1, paramInt2 - 1, paramInt3, 0, 0, 2);
          paramQnq.FWm(paramInt1 + 1, paramInt2 - 1, paramInt3, 0, 0, 2);
        } else {
          paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3 - 1, 0, 0, 2);
          paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3 + 1, 0, 0, 2);
        } 
        CDE cDE = new CDE(paramQnq);
        cDE.IjH(true);
        cDE.FWm(paramInt1 + 0.5D, paramInt2 - 1.95D, paramInt3 + 0.5D, 0.0F, 0.0F);
        paramQnq.FWm(cDE);
        for (byte b = 0; b < 120; b++)
          paramQnq.Dne("snowballpoof", paramInt1 + paramQnq.Dne.nextDouble(), (paramInt2 - 2) + paramQnq.Dne.nextDouble() * 3.9D, paramInt3 + paramQnq.Dne.nextDouble(), 0.0D, 0.0D, 0.0D); 
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0);
        paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3, 0);
        paramQnq.Dne(paramInt1, paramInt2 - 2, paramInt3, 0);
        if (bool1) {
          paramQnq.Dne(paramInt1 - 1, paramInt2 - 1, paramInt3, 0);
          paramQnq.Dne(paramInt1 + 1, paramInt2 - 1, paramInt3, 0);
        } else {
          paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3 - 1, 0);
          paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3 + 1, 0);
        } 
      } 
    } 
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : ((paramInt1 == 0) ? this.Dne : ((paramInt2 == 2 && paramInt1 == 2) ? this.FWm : ((paramInt2 == 3 && paramInt1 == 5) ? this.FWm : ((paramInt2 == 0 && paramInt1 == 3) ? this.FWm : ((paramInt2 == 1 && paramInt1 == 4) ? this.FWm : this.Qnq)))));
  }
  
  protected ULj(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.Fnk);
    Dne(true);
    this.Dne = paramBoolean;
    Dne(JcN.Dne);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    return ((i == 0 || (zKP.Dne[i]).Dne.zGp()) && paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ULj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */