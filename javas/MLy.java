import java.util.List;
import java.util.Random;

public class MLy extends zKP {
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    for (byte b = 0; b < 2; b++) {
      byte b1 = 1;
      while (b1 < 42) {
        int i = paramInt1 + zxJ.Dne[b] * b1;
        int j = paramInt3 + zxJ.FWm[b] * b1;
        int k = paramQnq.Dne(i, paramInt2, j);
        if (k == ((iBp)zKP.Dne).FWm) {
          int m = paramQnq.bzF(i, paramInt2, j) & 0x3;
          if (m == zxJ.aFZ[b])
            zKP.Dne.Dne(paramQnq, i, paramInt2, j, k, paramQnq.bzF(i, paramInt2, j), true, b1, paramInt4); 
          break;
        } 
        if (k == zKP.lDk.FWm)
          b1++; 
      } 
    } 
  }
  
  static {
  
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.AgF.Qnq;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public int Dne(Qnq paramQnq) {
    return 10;
  }
  
  public int a_() {
    return 1;
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool1 = ((i & 0x1) == 1) ? true : false;
    boolean bool2 = false;
    List list = paramQnq.FWm((sMa)null, bSp.Dne().Dne(paramInt1 + this.Dne, paramInt2 + this.FWm, paramInt3 + this.bzF, paramInt1 + this.Qnq, paramInt2 + this.aFZ, paramInt3 + this.zGp));
    if (!list.isEmpty())
      for (sMa sMa : list) {
        if (!sMa.FfS()) {
          bool2 = true;
          break;
        } 
      }  
    if (bool2 && !bool1)
      i |= 0x1; 
    if (!bool2 && bool1)
      i &= 0xFFFFFFFE; 
    if (bool2 != bool1) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 3);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, i);
    } 
    if (bool2)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq)); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null && (paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x1) == 1)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    if (paramQnq.aFZ == null && (paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x1) != 1)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.AgF.Qnq;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool1 = ((i & 0x4) == 4) ? true : false;
    boolean bool2 = ((i & 0x2) == 2) ? true : false;
    if (!bool2) {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
    } else if (!bool1) {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    } else {
      Dne(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool1 = ((i & 0x2) == 2) ? true : false;
    boolean bool2 = !paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) ? true : false;
    if (bool1 != bool2) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, i, 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public MLy(int paramInt) {
    super(paramInt, KFd.qLR);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
    Dne(true);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt5 | 0x1);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public static boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = paramInt1 + zxJ.Dne[paramInt5];
    int j = paramInt3 + zxJ.FWm[paramInt5];
    int k = paramZpi.Dne(i, paramInt2, j);
    boolean bool = ((paramInt4 & 0x2) == 2) ? true : false;
    if (k == ((iBp)zKP.Dne).FWm) {
      int m = paramZpi.bzF(i, paramInt2, j);
      int n = m & 0x3;
      return (n == zxJ.aFZ[paramInt5]);
    } 
    if (k == zKP.lDk.FWm) {
      int m = paramZpi.bzF(i, paramInt2, j);
      boolean bool1 = ((m & 0x2) == 2) ? true : false;
      return (bool == bool1);
    } 
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) ? false : true;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, bool, 3);
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, bool);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, FiG paramFiG) {
    if (paramQnq.aFZ == null && paramFiG.bzF() != null && (paramFiG.bzF()).bzF == ((ZtP)dEr.Dne).Qnq)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt4 | 0x8, 4); 
  }
  
  public boolean FWm() {
    return false;
  }
  
  public int Dne() {
    return 30;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MLy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */