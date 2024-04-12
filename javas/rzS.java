import java.util.Random;

public class rzS extends zKP {
  private gDn Dne;
  
  private gDn FWm;
  
  public void Dne(Rbp paramRbp) {
    this.Dne = paramRbp.Dne("farmland_wet");
    this.FWm = paramRbp.Dne("farmland_dry");
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? ((paramInt2 > 0) ? this.Dne : this.FWm) : zKP.FWm.FWm(paramInt1);
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    byte b = 0;
    for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
      for (int j = paramInt3 - b; j <= paramInt3 + b; j++) {
        int k = paramQnq.Dne(i, paramInt2 + 1, j);
        if (k == zKP.EWz.FWm || k == zKP.MUD.FWm || k == zKP.LDH.FWm || k == zKP.HDz.FWm || k == zKP.jXR.FWm)
          return true; 
      } 
    } 
    return false;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return zKP.FWm.FWm;
  }
  
  private boolean Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    for (int i = paramInt1 - 4; i <= paramInt1 + 4; i++) {
      for (int j = paramInt2; j <= paramInt2 + 1; j++) {
        for (int k = paramInt3 - 4; k <= paramInt3 + 4; k++) {
          if (paramQnq.Dne(i, j, k) == KFd.div)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  protected rzS(int paramInt) {
    super(paramInt, KFd.bzF);
    Dne(true);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
    Dne(255);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.FWm.Dne(0, paramRandom, paramInt2);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    KFd kFd = paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3);
    if (kFd.Dne())
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.FWm.FWm); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (!Qnq(paramQnq, paramInt1, paramInt2, paramInt3) && !paramQnq.udO(paramInt1, paramInt2 + 1, paramInt3)) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if (i > 0) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i - 1, 2);
      } else if (!bzF(paramQnq, paramInt1, paramInt2, paramInt3)) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.FWm.FWm);
      } 
    } else {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 7, 2);
    } 
  }
  
  public boolean FWm() {
    return false;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return bSp.Dne().Dne((paramInt1 + 0), (paramInt2 + 0), (paramInt3 + 0), (paramInt1 + 1), (paramInt2 + 1), (paramInt3 + 1));
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa, float paramFloat) {
    if (paramQnq.aFZ == null && paramQnq.Dne.nextFloat() < paramFloat - 0.5F) {
      if (!(paramsMa instanceof FiG) && !paramQnq.Dne().Dne("mobGriefing"))
        return; 
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.FWm.FWm);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rzS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */