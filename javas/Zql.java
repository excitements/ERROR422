public class Zql extends zKP {
  static {
  
  }
  
  private static boolean FWm(int paramInt) {
    if (paramInt <= 0)
      return false; 
    dNT dNT = zKP.Dne[paramInt];
    return ((dNT != null && dNT.Dne.DyG() && dNT.Dne()) || dNT == zKP.fYA || dNT instanceof dNT || dNT instanceof vla);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool = ((i & 0x4) > 0);
    if (bool != paramBoolean) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i ^ 0x4, 2);
      paramQnq.Dne((FiG)null, 1003, paramInt1, paramInt2, paramInt3, 0);
    } 
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 == 0)
      return false; 
    if (paramInt4 == 1)
      return false; 
    if (paramInt4 == 2)
      paramInt3++; 
    if (paramInt4 == 3)
      paramInt3--; 
    if (paramInt4 == 4)
      paramInt1++; 
    if (paramInt4 == 5)
      paramInt1--; 
    return FWm(paramQnq.Dne(paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = paramInt1;
      int k = paramInt3;
      if ((i & 0x3) == 0)
        k = paramInt3 + 1; 
      if ((i & 0x3) == 1)
        k--; 
      if ((i & 0x3) == 2)
        j = paramInt1 + 1; 
      if ((i & 0x3) == 3)
        j--; 
      if (!FWm(paramQnq.Dne(j, paramInt2, k))) {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i, 0);
      } 
      boolean bool = paramQnq.kGO(paramInt1, paramInt2, paramInt3);
      if (bool || (paramInt4 > 0 && zKP.Dne[paramInt4].bzF()))
        Dne(paramQnq, paramInt1, paramInt2, paramInt3, bool); 
    } 
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (this.Dne == KFd.zGp)
      return true; 
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i ^ 0x4, 2);
    paramQnq.Dne(paramFiG, 1003, paramInt1, paramInt2, paramInt3, 0);
    return true;
  }
  
  public static boolean Dne(int paramInt) {
    return ((paramInt & 0x4) != 0);
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(int paramInt) {
    float f = 0.1875F;
    if ((paramInt & 0x8) != 0) {
      Dne(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    } 
    if (Dne(paramInt)) {
      if ((paramInt & 0x3) == 0)
        Dne(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
      if ((paramInt & 0x3) == 1)
        Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
      if ((paramInt & 0x3) == 2)
        Dne(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
      if ((paramInt & 0x3) == 3)
        Dne(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F); 
    } 
  }
  
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne() {
    float f = 0.1875F;
    Dne(0.0F, 0.5F - f / 2.0F, 0.0F, 1.0F, 0.5F + f / 2.0F, 1.0F);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {}
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public int Dne() {
    return 0;
  }
  
  public wHH Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, chN paramchN1, chN paramchN2) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramchN1, paramchN2);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return !Dne(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    int i = 0;
    if (paramInt4 == 2)
      i = 0; 
    if (paramInt4 == 3)
      i = 1; 
    if (paramInt4 == 4)
      i = 2; 
    if (paramInt4 == 5)
      i = 3; 
    if (paramInt4 != 1 && paramInt4 != 0 && paramFloat2 > 0.5F)
      i |= 0x8; 
    return i;
  }
  
  protected Zql(int paramInt, KFd paramKFd) {
    super(paramInt, paramKFd);
    float f1 = 0.5F;
    float f2 = 1.0F;
    Dne(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
    Dne(JcN.bzF);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Zql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */