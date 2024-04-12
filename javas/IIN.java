import java.util.Random;

public class IIN extends zKP {
  private gDn Dne;
  
  private gDn bzF;
  
  private gDn FWm;
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramFiG);
    return true;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.iXU.Qnq;
  }
  
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    float f1 = 0.0625F;
    float f2 = (1 + i * 2) / 16.0F;
    float f3 = 0.5F;
    return bSp.Dne().Dne((paramInt1 + f2), paramInt2, (paramInt3 + f1), ((paramInt1 + 1) - f1), (paramInt2 + f3), ((paramInt3 + 1) - f1));
  }
  
  public void Dne() {
    float f1 = 0.0625F;
    float f2 = 0.5F;
    Dne(f1, 0.0F, f1, 1.0F - f1, f2, 1.0F - f1);
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : ((paramInt1 == 0) ? this.FWm : ((paramInt2 > 0 && paramInt1 == 4) ? this.bzF : this.Qnq));
  }
  
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    if (paramFiG.Dne(false)) {
      paramFiG.Dne().Dne(2, 0.1F);
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3) + 1;
      if (i >= 6) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } else {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
      } 
    } 
  }
  
  protected IIN(int paramInt) {
    super(paramInt, KFd.qXo);
    Dne(true);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return 0;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3))
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramFiG);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    float f1 = 0.0625F;
    float f2 = (1 + i * 2) / 16.0F;
    float f3 = 0.5F;
    Dne(f2, 0.0F, f1, 1.0F - f1, f3, 1.0F - f1);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return !super.Dne(paramQnq, paramInt1, paramInt2, paramInt3) ? false : a_(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    float f1 = 0.0625F;
    float f2 = (1 + i * 2) / 16.0F;
    float f3 = 0.5F;
    return bSp.Dne().Dne((paramInt1 + f2), paramInt2, (paramInt3 + f1), ((paramInt1 + 1) - f1), (paramInt2 + f3 - f1), ((paramInt3 + 1) - f1));
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("cake_side");
    this.bzF = paramRbp.Dne("cake_inner");
    this.Dne = paramRbp.Dne("cake_top");
    this.FWm = paramRbp.Dne("cake_bottom");
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3).Dne();
  }
  
  public boolean FWm() {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\IIN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */