import java.util.Random;

public class oqu extends zKP {
  private final int Dne;
  
  private gDn[] Dne;
  
  private static final String[] Dne = new String[] { "doorWood_lower", "doorWood_upper", "doorIron_lower", "doorIron_upper" };
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, FiG paramFiG) {
    if (((uqg)paramFiG.Dne).Qnq && (paramInt4 & 0x8) != 0 && paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == this.FWm)
      paramQnq.Qnq(paramInt1, paramInt2 - 1, paramInt3); 
  }
  
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public int Dne() {
    return 7;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (gDn)this.Dne[this.Dne];
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int j;
    int k;
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool1 = ((i & 0x8) != 0) ? true : false;
    if (bool1) {
      j = paramZpi.bzF(paramInt1, paramInt2 - 1, paramInt3);
      k = i;
    } else {
      j = i;
      k = paramZpi.bzF(paramInt1, paramInt2 + 1, paramInt3);
    } 
    boolean bool2 = ((k & 0x1) != 0) ? true : false;
    return j & 0x7 | (bool1 ? 8 : 0) | (bool2 ? 16 : 0);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (this.Dne == KFd.zGp) ? dEr.JLG.Qnq : dEr.BJH.Qnq;
  }
  
  public boolean FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return ((FWm(paramZpi, paramInt1, paramInt2, paramInt3) & 0x4) != 0);
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = FWm(paramZpi, paramInt1, paramInt2, paramInt3);
    return ((i & 0x4) != 0);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return ((paramInt1 & 0x8) != 0) ? 0 : ((this.Dne == KFd.zGp) ? dEr.JLG.Qnq : dEr.BJH.Qnq);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.Dne == KFd.zGp)
      return true; 
    int i = FWm(paramQnq, paramInt1, paramInt2, paramInt3);
    int j = i & 0x7;
    j ^= 0x4;
    if ((i & 0x8) == 0) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 2);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    } else {
      paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3, j, 2);
      paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
    } 
    paramQnq.Dne(paramFiG, 1003, paramInt1, paramInt2, paramInt3, 0);
    return true;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (String[])new gDn[Dne.length * 2];
    for (byte b = 0; b < Dne.length; b++) {
      this.Dne[b] = (String)paramRbp.Dne(Dne[b]);
      this.Dne[b + Dne.length] = (String)new pOO((gDn)this.Dne[b], true, false);
    } 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt2 >= 255) ? false : ((paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && super.Dne(paramQnq, paramInt1, paramInt2, paramInt3) && super.Dne(paramQnq, paramInt1, paramInt2 + 1, paramInt3)));
  }
  
  public wHH Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, chN paramchN1, chN paramchN2) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramchN1, paramchN2);
  }
  
  public gDn Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 != 1 && paramInt4 != 0) {
      int i = FWm(paramZpi, paramInt1, paramInt2, paramInt3);
      int j = i & 0x3;
      boolean bool1 = ((i & 0x4) != 0) ? true : false;
      boolean bool2 = false;
      boolean bool3 = ((i & 0x8) != 0) ? true : false;
      if (bool1) {
        if (j == 0 && paramInt4 == 2) {
          bool2 = !bool2 ? true : false;
        } else if (j == 1 && paramInt4 == 5) {
          bool2 = !bool2 ? true : false;
        } else if (j == 2 && paramInt4 == 3) {
          bool2 = !bool2 ? true : false;
        } else if (j == 3 && paramInt4 == 4) {
          bool2 = !bool2 ? true : false;
        } 
      } else {
        if (j == 0 && paramInt4 == 5) {
          bool2 = !bool2 ? true : false;
        } else if (j == 1 && paramInt4 == 3) {
          bool2 = !bool2 ? true : false;
        } else if (j == 2 && paramInt4 == 4) {
          bool2 = !bool2 ? true : false;
        } else if (j == 3 && paramInt4 == 2) {
          bool2 = !bool2 ? true : false;
        } 
        if ((i & 0x10) != 0)
          bool2 = !bool2 ? true : false; 
      } 
      return (gDn)this.Dne[this.Dne + (bool2 ? Dne.length : 0) + (bool3 ? 1 : 0)];
    } 
    return (gDn)this.Dne[this.Dne];
  }
  
  private void Dne(int paramInt) {
    float f = 0.1875F;
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
    int i = paramInt & 0x3;
    boolean bool1 = ((paramInt & 0x4) != 0) ? true : false;
    boolean bool2 = ((paramInt & 0x10) != 0) ? true : false;
    if (i == 0) {
      if (bool1) {
        if (!bool2) {
          Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        } else {
          Dne(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        } 
      } else {
        Dne(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
      } 
    } else if (i == 1) {
      if (bool1) {
        if (!bool2) {
          Dne(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        } else {
          Dne(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        } 
      } else {
        Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
      } 
    } else if (i == 2) {
      if (bool1) {
        if (!bool2) {
          Dne(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        } else {
          Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        } 
      } else {
        Dne(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } 
    } else if (i == 3) {
      if (bool1) {
        if (!bool2) {
          Dne(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        } else {
          Dne(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        } 
      } else {
        Dne(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
      } 
    } 
  }
  
  public boolean FWm() {
    return false;
  }
  
  public int FWm() {
    return 1;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = FWm(paramQnq, paramInt1, paramInt2, paramInt3);
    boolean bool = ((i & 0x4) != 0);
    if (bool != paramBoolean) {
      int j = i & 0x7;
      j ^= 0x4;
      if ((i & 0x8) == 0) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 2);
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
      } else {
        paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3, j, 2);
        paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
      } 
      paramQnq.Dne((FiG)null, 1003, paramInt1, paramInt2, paramInt3, 0);
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int a_(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return FWm(paramZpi, paramInt1, paramInt2, paramInt3) & 0x3;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    Dne(FWm(paramZpi, paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {}
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if ((i & 0x8) == 0) {
      boolean bool = false;
      if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) != this.FWm) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        bool = true;
      } 
      if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3)) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        bool = true;
        if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) == this.FWm)
          paramQnq.Qnq(paramInt1, paramInt2 + 1, paramInt3); 
      } 
      if (bool) {
        if (paramQnq.aFZ == null)
          FWm(paramQnq, paramInt1, paramInt2, paramInt3, i, 0); 
      } else {
        boolean bool1 = (paramQnq.kGO(paramInt1, paramInt2, paramInt3) || paramQnq.kGO(paramInt1, paramInt2 + 1, paramInt3)) ? true : false;
        if ((bool1 || (paramInt4 > 0 && zKP.Dne[paramInt4].bzF())) && paramInt4 != this.FWm)
          Dne(paramQnq, paramInt1, paramInt2, paramInt3, bool1); 
      } 
    } else {
      if (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) != this.FWm)
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3); 
      if (paramInt4 > 0 && paramInt4 != this.FWm)
        Dne(paramQnq, paramInt1, paramInt2 - 1, paramInt3, paramInt4); 
    } 
  }
  
  protected oqu(int paramInt, KFd paramKFd) {
    super(paramInt, paramKFd);
    if (paramKFd == KFd.zGp) {
      this.Dne = 2;
    } else {
      this.Dne = false;
    } 
    float f1 = 0.5F;
    float f2 = 1.0F;
    Dne(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oqu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */