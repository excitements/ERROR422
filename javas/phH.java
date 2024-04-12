import java.util.Random;

public class phH extends zKP {
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.bzF(paramInt1, paramInt2, paramInt3) == 0)
      if (paramQnq.FWm(paramInt1 - 1, paramInt2, paramInt3, true)) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 1, 2);
      } else if (paramQnq.FWm(paramInt1 + 1, paramInt2, paramInt3, true)) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 2, 2);
      } else if (paramQnq.FWm(paramInt1, paramInt2, paramInt3 - 1, true)) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 3, 2);
      } else if (paramQnq.FWm(paramInt1, paramInt2, paramInt3 + 1, true)) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 4, 2);
      } else if (Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3)) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 5, 2);
      }  
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  protected boolean FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (bzF(paramQnq, paramInt1, paramInt2, paramInt3)) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      boolean bool = false;
      if (!paramQnq.FWm(paramInt1 - 1, paramInt2, paramInt3, true) && i == 1)
        bool = true; 
      if (!paramQnq.FWm(paramInt1 + 1, paramInt2, paramInt3, true) && i == 2)
        bool = true; 
      if (!paramQnq.FWm(paramInt1, paramInt2, paramInt3 - 1, true) && i == 3)
        bool = true; 
      if (!paramQnq.FWm(paramInt1, paramInt2, paramInt3 + 1, true) && i == 4)
        bool = true; 
      if (!Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3) && i == 5)
        bool = true; 
      if (bool) {
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        return true;
      } 
      return false;
    } 
    return true;
  }
  
  protected boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!Dne(paramQnq, paramInt1, paramInt2, paramInt3)) {
      if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm) {
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } 
      return false;
    } 
    return true;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    double d1 = (paramInt1 + 0.5F);
    double d2 = (paramInt2 + 0.7F);
    double d3 = (paramInt3 + 0.5F);
    double d4 = 0.2199999988079071D;
    double d5 = 0.27000001072883606D;
    if (i == 1) {
      paramQnq.Dne("smoke", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
      paramQnq.Dne("flame", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
    } else if (i == 2) {
      paramQnq.Dne("smoke", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
      paramQnq.Dne("flame", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
    } else if (i == 3) {
      paramQnq.Dne("smoke", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
      paramQnq.Dne("flame", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
    } else if (i == 4) {
      paramQnq.Dne("smoke", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
      paramQnq.Dne("flame", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
    } else {
      paramQnq.Dne("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
      paramQnq.Dne("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static {
  
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    int i = paramInt5;
    if (paramInt4 == 1 && Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3))
      i = 5; 
    if (paramInt4 == 2 && paramQnq.FWm(paramInt1, paramInt2, paramInt3 + 1, true))
      i = 4; 
    if (paramInt4 == 3 && paramQnq.FWm(paramInt1, paramInt2, paramInt3 - 1, true))
      i = 3; 
    if (paramInt4 == 4 && paramQnq.FWm(paramInt1 + 1, paramInt2, paramInt3, true))
      i = 2; 
    if (paramInt4 == 5 && paramQnq.FWm(paramInt1 - 1, paramInt2, paramInt3, true))
      i = 1; 
    return i;
  }
  
  public wHH Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, chN paramchN1, chN paramchN2) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x7;
    float f = 0.15F;
    if (i == 1) {
      Dne(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
    } else if (i == 2) {
      Dne(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
    } else if (i == 3) {
      Dne(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
    } else if (i == 4) {
      Dne(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
    } else {
      f = 0.1F;
      Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
    } 
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramchN1, paramchN2);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.FWm(paramInt1 - 1, paramInt2, paramInt3, true) ? true : (paramQnq.FWm(paramInt1 + 1, paramInt2, paramInt3, true) ? true : (paramQnq.FWm(paramInt1, paramInt2, paramInt3 - 1, true) ? true : (paramQnq.FWm(paramInt1, paramInt2, paramInt3 + 1, true) ? true : Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3))));
  }
  
  protected phH(int paramInt) {
    super(paramInt, KFd.qLR);
    Dne(true);
    Dne(JcN.FWm);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
    if (paramQnq.bzF(paramInt1, paramInt2, paramInt3) == 0)
      Dne(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int Dne() {
    return 2;
  }
  
  private boolean Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.IjH(paramInt1, paramInt2, paramInt3))
      return true; 
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    return (i == zKP.sly.FWm || i == zKP.TpV.FWm || i == zKP.trS.FWm || i == zKP.dYY.FWm);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\phH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */