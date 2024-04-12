import java.util.List;
import java.util.Random;

public abstract class vAg extends zKP {
  private final boolean Dne;
  
  public boolean bzF() {
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (bzF(paramQnq, paramInt1, paramInt2, paramInt3)) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x7;
      boolean bool = false;
      if (!paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3) && i == 1)
        bool = true; 
      if (!paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3) && i == 2)
        bool = true; 
      if (!paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1) && i == 3)
        bool = true; 
      if (!paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1) && i == 4)
        bool = true; 
      if (bool) {
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } 
    } 
  }
  
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
    if (paramInt4 == 1) {
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
    } else if (paramInt4 == 2) {
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
    } else if (paramInt4 == 3) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
    } else if (paramInt4 == 4) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
    } else {
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
    } 
  }
  
  protected vAg(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.qLR);
    Dne(true);
    Dne(JcN.bzF);
    this.Dne = paramBoolean;
  }
  
  public void Dne(Rbp paramRbp) {}
  
  private int bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3) ? 1 : (paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3) ? 2 : (paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1) ? 3 : (paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1) ? 4 : 1)));
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public void Dne() {
    float f1 = 0.1875F;
    float f2 = 0.125F;
    float f3 = 0.125F;
    Dne(0.5F - f1, 0.5F - f2, 0.5F - f3, 0.5F + f1, 0.5F + f2, 0.5F + f3);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if ((i & 0x8) != 0)
        if (this.Dne) {
          bzF(paramQnq, paramInt1, paramInt2, paramInt3);
        } else {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, i & 0x7, 3);
          int j = i & 0x7;
          FWm(paramQnq, paramInt1, paramInt2, paramInt3, j);
          paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
        }  
    } 
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) > 0) ? 15 : 0;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if ((i & 0x8) == 0)
      return 0; 
    int j = i & 0x7;
    return (j == 5 && paramInt4 == 1) ? 15 : ((j == 4 && paramInt4 == 2) ? 15 : ((j == 3 && paramInt4 == 3) ? 15 : ((j == 2 && paramInt4 == 4) ? 15 : ((j == 1 && paramInt4 == 5) ? 15 : 0))));
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x7;
    boolean bool1 = ((i & 0x8) != 0) ? true : false;
    Dne(i);
    List list = paramQnq.Dne(hhc.class, bSp.Dne().Dne(paramInt1 + this.Dne, paramInt2 + this.FWm, paramInt3 + this.bzF, paramInt1 + this.Qnq, paramInt2 + this.aFZ, paramInt3 + this.zGp));
    boolean bool2 = !list.isEmpty() ? true : false;
    if (bool2 && !bool1) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, j | 0x8, 3);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, j);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
    } 
    if (!bool2 && bool1) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 3);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, j);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
    } 
    if (bool2)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq)); 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1) ? true : paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)));
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x8;
    i &= 0x7;
    if (paramInt4 == 2 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)) {
      i = 4;
    } else if (paramInt4 == 3 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1)) {
      i = 3;
    } else if (paramInt4 == 4 && paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3)) {
      i = 2;
    } else if (paramInt4 == 5 && paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3)) {
      i = 1;
    } else {
      i = bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    } 
    return i + j;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {}
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!Dne(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      return false;
    } 
    return true;
  }
  
  public int Dne(Qnq paramQnq) {
    return this.Dne ? 30 : 20;
  }
  
  private void Dne(int paramInt) {
    int i = paramInt & 0x7;
    boolean bool = ((paramInt & 0x8) > 0) ? true : false;
    float f1 = 0.375F;
    float f2 = 0.625F;
    float f3 = 0.1875F;
    float f4 = 0.125F;
    if (bool)
      f4 = 0.0625F; 
    if (i == 1) {
      Dne(0.0F, f1, 0.5F - f3, f4, f2, 0.5F + f3);
    } else if (i == 2) {
      Dne(1.0F - f4, f1, 0.5F - f3, 1.0F, f2, 0.5F + f3);
    } else if (i == 3) {
      Dne(0.5F - f3, f1, 0.0F, 0.5F + f3, f2, f4);
    } else if (i == 4) {
      Dne(0.5F - f3, f1, 1.0F - f4, 0.5F + f3, f2, 1.0F);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if ((paramInt5 & 0x8) > 0) {
      int i = paramInt5 & 0x7;
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, i);
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    Dne(i);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 2 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)) ? true : ((paramInt4 == 3 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1)) ? true : ((paramInt4 == 4 && paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3)) ? true : ((paramInt4 == 5 && paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3)))));
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x7;
    int k = 8 - (i & 0x8);
    if (k == 0)
      return true; 
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, j + k, 3);
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, j);
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    if (paramQnq.aFZ == null && this.Dne && (paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x8) == 0)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vAg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */