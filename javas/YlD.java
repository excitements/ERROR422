public class YlD extends zKP {
  public int Dne() {
    return 12;
  }
  
  protected YlD(int paramInt) {
    super(paramInt, KFd.qLR);
    Dne(JcN.bzF);
  }
  
  public static int bzF(int paramInt) {
    switch (paramInt) {
      case 0:
        return 0;
      case 1:
        return 5;
      case 2:
        return 4;
      case 3:
        return 3;
      case 4:
        return 2;
      case 5:
        return 1;
    } 
    return -1;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1) ? true : (paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1) ? true : (paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) ? true : paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3)))));
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) > 0) ? 15 : 0;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if ((paramInt5 & 0x8) > 0) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
      int i = paramInt5 & 0x7;
      if (i == 1) {
        paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      } else if (i == 2) {
        paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      } else if (i == 3) {
        paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      } else if (i == 4) {
        paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
      } else if (i != 5 && i != 6) {
        if (i == 0 || i == 7)
          paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm); 
      } else {
        paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      } 
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  static {
  
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    int i = paramInt5 & 0x8;
    int j = paramInt5 & 0x7;
    byte b = -1;
    if (paramInt4 == 0 && paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3))
      b = 0; 
    if (paramInt4 == 1 && paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3))
      b = 5; 
    if (paramInt4 == 2 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1))
      b = 4; 
    if (paramInt4 == 3 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1))
      b = 3; 
    if (paramInt4 == 4 && paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3))
      b = 2; 
    if (paramInt4 == 5 && paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3))
      b = 1; 
    return b + i;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x7;
    int k = i & 0x8;
    if (j == bzF(1)) {
      if ((geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x1) == 0) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x5 | k, 2);
      } else {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x6 | k, 2);
      } 
    } else if (j == bzF(0)) {
      if ((geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x1) == 0) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x7 | k, 2);
      } else {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x0 | k, 2);
      } 
    } 
  }
  
  public boolean FWm() {
    return false;
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!Dne(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      return false;
    } 
    return true;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 0 && paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3)) ? true : ((paramInt4 == 1 && paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3)) ? true : ((paramInt4 == 2 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)) ? true : ((paramInt4 == 3 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1)) ? true : ((paramInt4 == 4 && paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3)) ? true : ((paramInt4 == 5 && paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3)))))));
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x7;
    float f = 0.1875F;
    if (i == 1) {
      Dne(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
    } else if (i == 2) {
      Dne(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
    } else if (i == 3) {
      Dne(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
    } else if (i == 4) {
      Dne(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
    } else if (i != 5 && i != 6) {
      if (i == 0 || i == 7) {
        f = 0.25F;
        Dne(0.5F - f, 0.4F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
      } 
    } else {
      f = 0.25F;
      Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
    } 
  }
  
  public boolean bzF() {
    return true;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if ((i & 0x8) == 0)
      return 0; 
    int j = i & 0x7;
    return (j == 0 && paramInt4 == 0) ? 15 : ((j == 7 && paramInt4 == 0) ? 15 : ((j == 6 && paramInt4 == 1) ? 15 : ((j == 5 && paramInt4 == 1) ? 15 : ((j == 4 && paramInt4 == 2) ? 15 : ((j == 3 && paramInt4 == 3) ? 15 : ((j == 2 && paramInt4 == 4) ? 15 : ((j == 1 && paramInt4 == 5) ? 15 : 0)))))));
  }
  
  public boolean Dne() {
    return false;
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
      if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && i == 5)
        bool = true; 
      if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && i == 6)
        bool = true; 
      if (!paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3) && i == 0)
        bool = true; 
      if (!paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3) && i == 7)
        bool = true; 
      if (bool) {
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } 
    } 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x7;
    int k = 8 - (i & 0x8);
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, j + k, 3);
    paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, (k > 0) ? 0.6F : 0.5F);
    paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
    if (j == 1) {
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
    } else if (j == 2) {
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
    } else if (j == 3) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
    } else if (j == 4) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
    } else if (j != 5 && j != 6) {
      if (j == 0 || j == 7)
        paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm); 
    } else {
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YlD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */