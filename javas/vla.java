import java.util.List;
import java.util.Random;

public class vla extends zKP {
  private final zKP iTJ;
  
  private boolean Dne;
  
  private static final int[][] Dne = new int[][] { { 2, 6 }, { 3, 7 }, { 2, 3 }, { 6, 7 }, { 0, 4 }, { 1, 5 }, { 0, 1 }, { 4, 5 } };
  
  private final int Dne = 0;
  
  private int bzF = 0;
  
  public static boolean Dne(int paramInt) {
    return (paramInt > 0 && zKP.Dne[paramInt] instanceof vla);
  }
  
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return this.iTJ.FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(Rbp paramRbp) {}
  
  public boolean DyG() {
    return this.iTJ.DyG();
  }
  
  protected vla(int paramInt1, zKP paramzKP, int paramInt2) {
    super(paramInt1, (KFd)paramzKP.Dne);
    this.iTJ = paramzKP;
    this.Dne = paramInt2;
    bzF(paramzKP.Dne);
    FWm(paramzKP.FWm / 3.0F);
    Dne((PsW)paramzKP.kGO);
    Dne(255);
    Dne(JcN.Dne);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFiG);
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne != 0) {
      Dne(0.5F * (this.bzF % 2), 0.5F * (this.bzF / 2 % 2), 0.5F * (this.bzF / 4 % 2), 0.5F + 0.5F * (this.bzF % 2), 0.5F + 0.5F * (this.bzF / 2 % 2), 0.5F + 0.5F * (this.bzF / 4 % 2));
    } else {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa, chN paramchN) {
    this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramsMa, paramchN);
  }
  
  private boolean bzF(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    return (Dne(i) && paramZpi.bzF(paramInt1, paramInt2, paramInt3) == paramInt4);
  }
  
  public int Dne(Qnq paramQnq) {
    return this.iTJ.Dne(paramQnq);
  }
  
  public float Dne(sMa paramsMa) {
    return this.iTJ.Dne(paramsMa);
  }
  
  public float Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return this.iTJ.Dne(paramZpi, paramInt1, paramInt2, paramInt3);
  }
  
  public int bzF(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return this.iTJ.bzF(paramZpi, paramInt1, paramInt2, paramInt3);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    return (paramInt4 != 0 && (paramInt4 == 1 || paramFloat2 <= 0.5D)) ? paramInt5 : (paramInt5 | 0x4);
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.iTJ.bzF(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, yTR paramyTR) {
    this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramyTR);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public boolean Dne(int paramInt, boolean paramBoolean) {
    return this.iTJ.Dne(paramInt, paramBoolean);
  }
  
  public wHH Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, chN paramchN1, chN paramchN2) {
    wHH[] arrayOfWHH1 = new wHH[8];
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x3;
    boolean bool = ((i & 0x4) == 4) ? true : false;
    int k = Dne[j + (bool ? 4 : 0)];
    this.Dne = 1;
    int n;
    for (n = 0; n < 8; n++) {
      this.bzF = n;
      int i3 = k;
      int i2 = k.length;
      for (byte b = 0; b < i2; b++) {
        int i4 = i3[b];
        if (i4 == n);
      } 
      arrayOfWHH1[n] = super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramchN1, paramchN2);
    } 
    n = k;
    int i1 = k.length;
    for (byte b1 = 0; b1 < i1; b1++) {
      int i2 = n[b1];
      arrayOfWHH1[i2] = null;
    } 
    wHH wHH = null;
    double d = 0.0D;
    wHH[] arrayOfWHH2 = arrayOfWHH1;
    int m = arrayOfWHH1.length;
    for (byte b2 = 0; b2 < m; b2++) {
      wHH wHH1 = arrayOfWHH2[b2];
      if (wHH1 != null) {
        double d1 = wHH1.Dne.bzF(paramchN2);
        if (d1 > d) {
          wHH = wHH1;
          d = d1;
        } 
      } 
    } 
    return wHH;
  }
  
  public boolean bzF(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x3;
    float f1 = 0.5F;
    float f2 = 1.0F;
    if ((i & 0x4) != 0) {
      f1 = 0.0F;
      f2 = 0.5F;
    } 
    float f3 = 0.0F;
    float f4 = 0.5F;
    float f5 = 0.5F;
    float f6 = 1.0F;
    boolean bool = false;
    if (j == 0) {
      int k = paramZpi.Dne(paramInt1 - 1, paramInt2, paramInt3);
      int m = paramZpi.bzF(paramInt1 - 1, paramInt2, paramInt3);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        int n = m & 0x3;
        if (n == 3 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 - 1, i)) {
          f5 = 0.0F;
          f6 = 0.5F;
          bool = true;
        } else if (n == 2 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 + 1, i)) {
          f5 = 0.5F;
          f6 = 1.0F;
          bool = true;
        } 
      } 
    } else if (j == 1) {
      int k = paramZpi.Dne(paramInt1 + 1, paramInt2, paramInt3);
      int m = paramZpi.bzF(paramInt1 + 1, paramInt2, paramInt3);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        f3 = 0.5F;
        f4 = 1.0F;
        int n = m & 0x3;
        if (n == 3 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 - 1, i)) {
          f5 = 0.0F;
          f6 = 0.5F;
          bool = true;
        } else if (n == 2 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 + 1, i)) {
          f5 = 0.5F;
          f6 = 1.0F;
          bool = true;
        } 
      } 
    } else if (j == 2) {
      int k = paramZpi.Dne(paramInt1, paramInt2, paramInt3 - 1);
      int m = paramZpi.bzF(paramInt1, paramInt2, paramInt3 - 1);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        f5 = 0.0F;
        f6 = 0.5F;
        int n = m & 0x3;
        if (n == 1 && !bzF(paramZpi, paramInt1 - 1, paramInt2, paramInt3, i)) {
          bool = true;
        } else if (n == 0 && !bzF(paramZpi, paramInt1 + 1, paramInt2, paramInt3, i)) {
          f3 = 0.5F;
          f4 = 1.0F;
          bool = true;
        } 
      } 
    } else if (j == 3) {
      int k = paramZpi.Dne(paramInt1, paramInt2, paramInt3 + 1);
      int m = paramZpi.bzF(paramInt1, paramInt2, paramInt3 + 1);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        int n = m & 0x3;
        if (n == 1 && !bzF(paramZpi, paramInt1 - 1, paramInt2, paramInt3, i)) {
          bool = true;
        } else if (n == 0 && !bzF(paramZpi, paramInt1 + 1, paramInt2, paramInt3, i)) {
          f3 = 0.5F;
          f4 = 1.0F;
          bool = true;
        } 
      } 
    } 
    if (bool)
      Dne(f3, f1, f5, f4, f2, f6); 
    return bool;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    FWm(paramQnq, paramInt1, paramInt2, paramInt3);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    boolean bool = FWm(paramQnq, paramInt1, paramInt2, paramInt3);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    if (bool && bzF(paramQnq, paramInt1, paramInt2, paramInt3))
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa); 
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return this.iTJ.Dne(paramInt1, this.Dne);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
  }
  
  public int Dne() {
    return 10;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    return this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFiG, 0, 0.0F, 0.0F, 0.0F);
  }
  
  public boolean FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    int j = i & 0x3;
    float f1 = 0.5F;
    float f2 = 1.0F;
    if ((i & 0x4) != 0) {
      f1 = 0.0F;
      f2 = 0.5F;
    } 
    float f3 = 0.0F;
    float f4 = 1.0F;
    float f5 = 0.0F;
    float f6 = 0.5F;
    boolean bool = true;
    if (j == 0) {
      f3 = 0.5F;
      f6 = 1.0F;
      int k = paramZpi.Dne(paramInt1 + 1, paramInt2, paramInt3);
      int m = paramZpi.bzF(paramInt1 + 1, paramInt2, paramInt3);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        int n = m & 0x3;
        if (n == 3 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 + 1, i)) {
          f6 = 0.5F;
          bool = false;
        } else if (n == 2 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 - 1, i)) {
          f5 = 0.5F;
          bool = false;
        } 
      } 
    } else if (j == 1) {
      f4 = 0.5F;
      f6 = 1.0F;
      int k = paramZpi.Dne(paramInt1 - 1, paramInt2, paramInt3);
      int m = paramZpi.bzF(paramInt1 - 1, paramInt2, paramInt3);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        int n = m & 0x3;
        if (n == 3 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 + 1, i)) {
          f6 = 0.5F;
          bool = false;
        } else if (n == 2 && !bzF(paramZpi, paramInt1, paramInt2, paramInt3 - 1, i)) {
          f5 = 0.5F;
          bool = false;
        } 
      } 
    } else if (j == 2) {
      f5 = 0.5F;
      f6 = 1.0F;
      int k = paramZpi.Dne(paramInt1, paramInt2, paramInt3 + 1);
      int m = paramZpi.bzF(paramInt1, paramInt2, paramInt3 + 1);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        int n = m & 0x3;
        if (n == 1 && !bzF(paramZpi, paramInt1 + 1, paramInt2, paramInt3, i)) {
          f4 = 0.5F;
          bool = false;
        } else if (n == 0 && !bzF(paramZpi, paramInt1 - 1, paramInt2, paramInt3, i)) {
          f3 = 0.5F;
          bool = false;
        } 
      } 
    } else if (j == 3) {
      int k = paramZpi.Dne(paramInt1, paramInt2, paramInt3 - 1);
      int m = paramZpi.bzF(paramInt1, paramInt2, paramInt3 - 1);
      if (Dne(k) && (i & 0x4) == (m & 0x4)) {
        int n = m & 0x3;
        if (n == 1 && !bzF(paramZpi, paramInt1 + 1, paramInt2, paramInt3, i)) {
          f4 = 0.5F;
          bool = false;
        } else if (n == 0 && !bzF(paramZpi, paramInt1 - 1, paramInt2, paramInt3, i)) {
          f3 = 0.5F;
          bool = false;
        } 
      } 
    } 
    Dne(f3, f1, f5, f4, f2, f6);
    return bool;
  }
  
  public void FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if ((i & 0x4) != 0) {
      Dne(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    } 
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    this.iTJ.FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3;
    int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x4;
    if (i == 0)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x2 | j, 2); 
    if (i == 1)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x1 | j, 2); 
    if (i == 2)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x3 | j, 2); 
    if (i == 3)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0x0 | j, 2); 
  }
  
  public int a_() {
    return this.iTJ.a_();
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, 0);
    this.iTJ.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    this.iTJ.FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramsMa);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vla.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */