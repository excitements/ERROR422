public class SFI extends kbN {
  public gDn Dne(int paramInt1, int paramInt2) {
    return zKP.Qnq.FWm(paramInt1);
  }
  
  static {
  
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = (geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3) % 4;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
  }
  
  public SFI(int paramInt) {
    super(paramInt, KFd.Qnq);
    Dne(JcN.bzF);
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = Qnq(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
    if (i != 2 && i != 0) {
      Dne(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
    } else {
      Dne(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int Dne() {
    return 21;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    return Dne(i) ? null : ((i != 2 && i != 0) ? bSp.Dne().Dne((paramInt1 + 0.375F), paramInt2, paramInt3, (paramInt1 + 0.625F), (paramInt2 + 1.5F), (paramInt3 + 1)) : bSp.Dne().Dne(paramInt1, paramInt2, (paramInt3 + 0.375F), (paramInt1 + 1), (paramInt2 + 1.5F), (paramInt3 + 0.625F)));
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return true;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (Dne(i)) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFFB, 2);
    } else {
      int j = (geR.FWm((paramFiG.mrb * 4.0F / 360.0F) + 0.5D) & 0x3) % 4;
      int k = Qnq(i);
      if (k == (j + 2) % 4)
        i = j; 
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i | 0x4, 2);
    } 
    paramQnq.Dne(paramFiG, 1003, paramInt1, paramInt2, paramInt3, 0);
    return true;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return !paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3).Dne() ? false : super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return Dne(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public static boolean Dne(int paramInt) {
    return ((paramInt & 0x4) != 0);
  }
  
  public void Dne(Rbp paramRbp) {}
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      boolean bool = paramQnq.kGO(paramInt1, paramInt2, paramInt3);
      if (bool || (paramInt4 > 0 && zKP.Dne[paramInt4].bzF()))
        if (bool && !Dne(i)) {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, i | 0x4, 2);
          paramQnq.Dne((FiG)null, 1003, paramInt1, paramInt2, paramInt3, 0);
        } else if (!bool && Dne(i)) {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFFB, 2);
          paramQnq.Dne((FiG)null, 1003, paramInt1, paramInt2, paramInt3, 0);
        }  
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SFI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */