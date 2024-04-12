public class fgS extends dEr {
  private KFd Dne;
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    zKP zKP;
    if (paramInt4 != 1)
      return false; 
    paramInt2++;
    if (this.Dne == KFd.Qnq) {
      zKP = zKP.ICU;
    } else {
      zKP = zKP.IYC;
    } 
    if (paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq) && paramFiG.Dne(paramInt1, paramInt2 + 1, paramInt3, paramInt4, paramNMq)) {
      if (!zKP.Dne(paramQnq, paramInt1, paramInt2, paramInt3))
        return false; 
      int i = geR.FWm(((paramFiG.mrb + 180.0F) * 4.0F / 360.0F) - 0.5D) & 0x3;
      Dne(paramQnq, paramInt1, paramInt2, paramInt3, i, zKP);
      paramNMq.Dne--;
      return true;
    } 
    return false;
  }
  
  public static void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, zKP paramzKP) {
    byte b1 = 0;
    byte b2 = 0;
    if (paramInt4 == 0)
      b2 = 1; 
    if (paramInt4 == 1)
      b1 = -1; 
    if (paramInt4 == 2)
      b2 = -1; 
    if (paramInt4 == 3)
      b1 = 1; 
    int i = (paramQnq.DyG(paramInt1 - b1, paramInt2, paramInt3 - b2) ? 1 : 0) + (paramQnq.DyG(paramInt1 - b1, paramInt2 + 1, paramInt3 - b2) ? 1 : 0);
    int j = (paramQnq.DyG(paramInt1 + b1, paramInt2, paramInt3 + b2) ? 1 : 0) + (paramQnq.DyG(paramInt1 + b1, paramInt2 + 1, paramInt3 + b2) ? 1 : 0);
    boolean bool1 = (paramQnq.Dne(paramInt1 - b1, paramInt2, paramInt3 - b2) == paramzKP.FWm || paramQnq.Dne(paramInt1 - b1, paramInt2 + 1, paramInt3 - b2) == paramzKP.FWm) ? true : false;
    boolean bool2 = (paramQnq.Dne(paramInt1 + b1, paramInt2, paramInt3 + b2) == paramzKP.FWm || paramQnq.Dne(paramInt1 + b1, paramInt2 + 1, paramInt3 + b2) == paramzKP.FWm) ? true : false;
    boolean bool3 = false;
    if (bool1 && !bool2) {
      bool3 = true;
    } else if (j > i) {
      bool3 = true;
    } 
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, paramzKP.FWm, paramInt4, 2);
    paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3, paramzKP.FWm, 0x8 | (bool3 ? 1 : 0), 2);
    paramQnq.bzF(paramInt1, paramInt2, paramInt3, paramzKP.FWm);
    paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, paramzKP.FWm);
  }
  
  public fgS(int paramInt, KFd paramKFd) {
    super(paramInt);
    this.Dne = paramKFd;
    this.aFZ = 1;
    Dne(JcN.bzF);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fgS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */