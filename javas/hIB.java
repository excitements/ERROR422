import java.util.Random;

public class hIB extends ljW {
  private gDn FWm;
  
  private gDn Dne;
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("enchantment_side");
    this.Dne = paramRbp.Dne("enchantment_top");
    this.FWm = paramRbp.Dne("enchantment_bottom");
  }
  
  protected hIB(int paramInt) {
    super(paramInt, KFd.aFZ);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
    Dne(0);
    Dne(JcN.FWm);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    llR llR = (llR)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    paramFiG.Dne(paramInt1, paramInt2, paramInt3, llR.Dne() ? llR.Dne() : null);
    return true;
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    super.FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
    for (int i = paramInt1 - 2; i <= paramInt1 + 2; i++) {
      for (int j = paramInt3 - 2; j <= paramInt3 + 2; j++) {
        if (i > paramInt1 - 2 && i < paramInt1 + 2 && j == paramInt3 - 1)
          j = paramInt3 + 2; 
        if (paramRandom.nextInt(16) == 0)
          for (int k = paramInt2; k <= paramInt2 + 1; k++) {
            if (paramQnq.Dne(i, k, j) == zKP.AgF.FWm) {
              if (!paramQnq.Dne((i - paramInt1) / 2 + paramInt1, k, (j - paramInt3) / 2 + paramInt3))
                break; 
              paramQnq.Dne("enchantmenttable", paramInt1 + 0.5D, paramInt2 + 2.0D, paramInt3 + 0.5D, ((i - paramInt1) + paramRandom.nextFloat()) - 0.5D, ((k - paramInt2) - paramRandom.nextFloat() - 1.0F), ((j - paramInt3) + paramRandom.nextFloat()) - 0.5D);
            } 
          }  
      } 
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFUH, paramNMq);
    if (paramNMq.zGp())
      ((llR)paramQnq.Dne(paramInt1, paramInt2, paramInt3)).Dne(paramNMq.FWm()); 
  }
  
  public boolean FWm() {
    return false;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 0) ? this.FWm : ((paramInt1 == 1) ? this.Dne : this.Qnq);
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new llR();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hIB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */