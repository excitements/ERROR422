public class VKe extends ljW {
  private gDn Dne;
  
  public ipD Dne(Qnq paramQnq) {
    return new nKy();
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, NMq paramNMq) {
    if (paramQnq.aFZ == null) {
      nKy nKy = (nKy)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      if (nKy != null) {
        nKy.Dne(paramNMq.Dne());
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 1, 2);
      } 
    } 
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.aFZ == null) {
      nKy nKy = (nKy)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      if (nKy != null) {
        NMq nMq = nKy.Dne();
        if (nMq != null) {
          paramQnq.Qnq(1005, paramInt1, paramInt2, paramInt3, 0);
          paramQnq.Dne((String)null, paramInt1, paramInt2, paramInt3);
          nKy.Dne((NMq)null);
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0, 2);
          float f = 0.7F;
          double d1 = (paramQnq.Dne.nextFloat() * f) + (1.0F - f) * 0.5D;
          double d2 = (paramQnq.Dne.nextFloat() * f) + (1.0F - f) * 0.2D + 0.6D;
          double d3 = (paramQnq.Dne.nextFloat() * f) + (1.0F - f) * 0.5D;
          NMq nMq1 = nMq.Dne();
          JiM jiM = new JiM(paramQnq, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, nMq1);
          jiM.FWm = 10;
          paramQnq.FWm(jiM);
        } 
      } 
    } 
  }
  
  protected VKe(int paramInt) {
    super(paramInt, KFd.Qnq);
    Dne(JcN.FWm);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    NMq nMq = ((nKy)paramQnq.Dne(paramInt1, paramInt2, paramInt3)).Dne();
    return (nMq == null) ? 0 : (nMq.bzF + 1 - dEr.iTJ.Qnq);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("musicBlock");
    this.Dne = paramRbp.Dne("jukebox_top");
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    if (paramQnq.aFZ == null)
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, 0); 
  }
  
  public boolean a_() {
    return true;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : this.Qnq;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.bzF(paramInt1, paramInt2, paramInt3) == 0)
      return false; 
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VKe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */