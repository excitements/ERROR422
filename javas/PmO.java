import java.util.Random;

public class PmO extends zKP {
  private boolean Dne(int paramInt) {
    if (paramInt == 0)
      return false; 
    dNT dNT = zKP.Dne[paramInt];
    return (dNT.Dne() && dNT.Dne.bzF());
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return 0;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    float f1 = 1.0F;
    float f2 = 1.0F;
    float f3 = 1.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    boolean bool = (i > 0) ? true : false;
    if ((i & 0x2) != 0) {
      f4 = Math.max(f4, 0.0625F);
      f1 = 0.0F;
      f2 = 0.0F;
      f5 = 1.0F;
      f3 = 0.0F;
      f6 = 1.0F;
      bool = true;
    } 
    if ((i & 0x8) != 0) {
      f1 = Math.min(f1, 0.9375F);
      f4 = 1.0F;
      f2 = 0.0F;
      f5 = 1.0F;
      f3 = 0.0F;
      f6 = 1.0F;
      bool = true;
    } 
    if ((i & 0x4) != 0) {
      f6 = Math.max(f6, 0.0625F);
      f3 = 0.0F;
      f1 = 0.0F;
      f4 = 1.0F;
      f2 = 0.0F;
      f5 = 1.0F;
      bool = true;
    } 
    if ((i & 0x1) != 0) {
      f3 = Math.min(f3, 0.9375F);
      f6 = 1.0F;
      f1 = 0.0F;
      f4 = 1.0F;
      f2 = 0.0F;
      f5 = 1.0F;
      bool = true;
    } 
    if (!bool && Dne(paramZpi.Dne(paramInt1, paramInt2 + 1, paramInt3))) {
      f2 = Math.min(f2, 0.9375F);
      f5 = 1.0F;
      f1 = 0.0F;
      f4 = 1.0F;
      f3 = 0.0F;
      f6 = 1.0F;
    } 
    Dne(f1, f2, f3, f4, f5, f6);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return paramZpi.Dne(paramInt1, paramInt3).Qnq();
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    switch (paramInt4) {
      case 1:
        return Dne(paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3));
      case 2:
        return Dne(paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1));
      case 3:
        return Dne(paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1));
      case 4:
        return Dne(paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3));
      case 5:
        return Dne(paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3));
    } 
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null && paramQnq.Dne.nextInt(4) == 0) {
      byte b1 = 4;
      byte b2 = 5;
      boolean bool = false;
      int i;
      label86: for (i = paramInt1 - b1; i <= paramInt1 + b1; i++) {
        for (int m = paramInt3 - b1; m <= paramInt3 + b1; m++) {
          for (int n = paramInt2 - 1; n <= paramInt2 + 1; n++) {
            if (paramQnq.Dne(i, n, m) == this.FWm && --b2 <= 0) {
              bool = true;
              break label86;
            } 
          } 
        } 
      } 
      i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = paramQnq.Dne.nextInt(6);
      int k = zxJ.Qnq[j];
      if (j == 1 && paramInt2 < 255 && paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3)) {
        if (bool)
          return; 
        int m = paramQnq.Dne.nextInt(16) & i;
        if (m > 0) {
          for (byte b = 0; b <= 3; b++) {
            if (!Dne(paramQnq.Dne(paramInt1 + zxJ.Dne[b], paramInt2 + 1, paramInt3 + zxJ.FWm[b])))
              m &= 1 << b ^ 0xFFFFFFFF; 
          } 
          if (m > 0)
            paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3, this.FWm, m, 2); 
        } 
      } else if (j >= 2 && j <= 5 && (i & 1 << k) == 0) {
        if (bool)
          return; 
        int m = paramQnq.Dne(paramInt1 + zxJ.Dne[k], paramInt2, paramInt3 + zxJ.FWm[k]);
        if (m != 0 && zKP.Dne[m] != null) {
          if ((zKP.Dne[m]).Dne.DyG() && zKP.Dne[m].Dne())
            paramQnq.Dne(paramInt1, paramInt2, paramInt3, i | 1 << k, 2); 
        } else {
          int n = k + 1 & 0x3;
          int i1 = k + 3 & 0x3;
          if ((i & 1 << n) != 0 && Dne(paramQnq.Dne(paramInt1 + zxJ.Dne[k] + zxJ.Dne[n], paramInt2, paramInt3 + zxJ.FWm[k] + zxJ.FWm[n]))) {
            paramQnq.FWm(paramInt1 + zxJ.Dne[k], paramInt2, paramInt3 + zxJ.FWm[k], this.FWm, 1 << n, 2);
          } else if ((i & 1 << i1) != 0 && Dne(paramQnq.Dne(paramInt1 + zxJ.Dne[k] + zxJ.Dne[i1], paramInt2, paramInt3 + zxJ.FWm[k] + zxJ.FWm[i1]))) {
            paramQnq.FWm(paramInt1 + zxJ.Dne[k], paramInt2, paramInt3 + zxJ.FWm[k], this.FWm, 1 << i1, 2);
          } else if ((i & 1 << n) != 0 && paramQnq.Dne(paramInt1 + zxJ.Dne[k] + zxJ.Dne[n], paramInt2, paramInt3 + zxJ.FWm[k] + zxJ.FWm[n]) && Dne(paramQnq.Dne(paramInt1 + zxJ.Dne[n], paramInt2, paramInt3 + zxJ.FWm[n]))) {
            paramQnq.FWm(paramInt1 + zxJ.Dne[k] + zxJ.Dne[n], paramInt2, paramInt3 + zxJ.FWm[k] + zxJ.FWm[n], this.FWm, 1 << (k + 2 & 0x3), 2);
          } else if ((i & 1 << i1) != 0 && paramQnq.Dne(paramInt1 + zxJ.Dne[k] + zxJ.Dne[i1], paramInt2, paramInt3 + zxJ.FWm[k] + zxJ.FWm[i1]) && Dne(paramQnq.Dne(paramInt1 + zxJ.Dne[i1], paramInt2, paramInt3 + zxJ.FWm[i1]))) {
            paramQnq.FWm(paramInt1 + zxJ.Dne[k] + zxJ.Dne[i1], paramInt2, paramInt3 + zxJ.FWm[k] + zxJ.FWm[i1], this.FWm, 1 << (k + 2 & 0x3), 2);
          } else if (Dne(paramQnq.Dne(paramInt1 + zxJ.Dne[k], paramInt2 + 1, paramInt3 + zxJ.FWm[k]))) {
            paramQnq.FWm(paramInt1 + zxJ.Dne[k], paramInt2, paramInt3 + zxJ.FWm[k], this.FWm, 0, 2);
          } 
        } 
      } else if (paramInt2 > 1) {
        int m = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
        if (m == 0) {
          int n = paramQnq.Dne.nextInt(16) & i;
          if (n > 0)
            paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3, this.FWm, n, 2); 
        } else if (m == this.FWm) {
          int n = paramQnq.Dne.nextInt(16) & i;
          int i1 = paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3);
          if (i1 != (i1 | n))
            paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3, i1 | n, 2); 
        } 
      } 
    } 
  }
  
  public int b_() {
    return QFY.bzF();
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = i;
    if (i > 0)
      for (byte b = 0; b <= 3; b++) {
        int k = 1 << b;
        if ((i & k) != 0 && !Dne(paramQnq.Dne(paramInt1 + zxJ.Dne[b], paramInt2, paramInt3 + zxJ.FWm[b])) && (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) != this.FWm || (paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3) & k) == 0))
          j &= k ^ 0xFFFFFFFF; 
      }  
    if (j == 0 && !Dne(paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3)))
      return false; 
    if (j != i)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 2); 
    return true;
  }
  
  static {
  
  }
  
  public PmO(int paramInt) {
    super(paramInt, KFd.Zpi);
    Dne(true);
    Dne(JcN.FWm);
  }
  
  public int Dne() {
    return 20;
  }
  
  public void Dne(Qnq paramQnq, FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null && paramFiG.bzF() != null && (paramFiG.bzF()).bzF == ((ZtP)dEr.Dne).Qnq) {
      paramFiG.Dne(trP.Dne[this.FWm], 1);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(zKP.ipf, 1, 0));
    } else {
      super.Dne(paramQnq, paramFiG, paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public int FWm(int paramInt) {
    return QFY.bzF();
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne() {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    byte b = 0;
    switch (paramInt4) {
      case 2:
        b = 1;
        break;
      case 3:
        b = 4;
        break;
      case 4:
        b = 8;
        break;
      case 5:
        b = 2;
        break;
    } 
    return (b != 0) ? b : paramInt5;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null && !bzF(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PmO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */