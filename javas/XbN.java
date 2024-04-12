import java.util.List;

public class XbN extends zKP {
  private gDn FWm;
  
  private final boolean Dne;
  
  private gDn Dne;
  
  private gDn bzF;
  
  public void Dne() {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public static boolean Dne(int paramInt) {
    return ((paramInt & 0x8) != 0);
  }
  
  public static gDn Dne(String paramString) {
    return (paramString == "piston_side") ? ((XbN)zKP.FWm).Qnq : ((paramString == "piston_top") ? ((XbN)zKP.FWm).bzF : ((paramString == "piston_top_sticky") ? ((XbN)zKP.Dne).bzF : ((paramString == "piston_inner_top") ? ((XbN)zKP.FWm).Dne : null)));
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramQnq.aFZ == null) {
      boolean bool = FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt5);
      if (bool && paramInt4 == 1) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt5 | 0x8, 2);
        return false;
      } 
      if (!bool && paramInt4 == 0)
        return false; 
    } 
    if (paramInt4 == 0) {
      if (!Qnq(paramQnq, paramInt1, paramInt2, paramInt3, paramInt5))
        return false; 
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt5 | 0x8, 2);
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "tile.piston.out", 0.5F, paramQnq.Dne.nextFloat() * 0.25F + 0.6F);
    } else if (paramInt4 == 1) {
      ipD ipD = paramQnq.Dne(paramInt1 + rrP.FWm[paramInt5], paramInt2 + rrP.bzF[paramInt5], paramInt3 + rrP.Qnq[paramInt5]);
      if (ipD instanceof SoB)
        ((SoB)ipD).FWm(); 
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((tsU)zKP.Dne).FWm, paramInt5, 3);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, tsU.Dne(this.FWm, paramInt5, paramInt5, false, true));
      if (this.Dne != null) {
        int i = paramInt1 + rrP.FWm[paramInt5] * 2;
        int j = paramInt2 + rrP.bzF[paramInt5] * 2;
        int k = paramInt3 + rrP.Qnq[paramInt5] * 2;
        int m = paramQnq.Dne(i, j, k);
        int n = paramQnq.bzF(i, j, k);
        boolean bool = false;
        if (m == ((tsU)zKP.Dne).FWm) {
          ipD ipD1 = paramQnq.Dne(i, j, k);
          if (ipD1 instanceof SoB) {
            SoB soB = (SoB)ipD1;
            if (soB.FWm() == paramInt5 && soB.Dne()) {
              soB.FWm();
              m = soB.Dne();
              n = soB.zGp();
              bool = true;
            } 
          } 
        } 
        if (!bool && m > 0 && Dne(m, paramQnq, i, j, k, false) && (zKP.Dne[m].FWm() == 0 || m == ((XbN)zKP.FWm).FWm || m == ((XbN)zKP.Dne).FWm)) {
          paramInt1 += rrP.FWm[paramInt5];
          paramInt2 += rrP.bzF[paramInt5];
          paramInt3 += rrP.Qnq[paramInt5];
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((tsU)zKP.Dne).FWm, n, 3);
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, tsU.Dne(m, n, paramInt5, false, false));
          paramQnq.Qnq(i, j, k);
        } else if (!bool) {
          paramQnq.Qnq(paramInt1 + rrP.FWm[paramInt5], paramInt2 + rrP.bzF[paramInt5], paramInt3 + rrP.Qnq[paramInt5]);
        } 
      } else {
        paramQnq.Qnq(paramInt1 + rrP.FWm[paramInt5], paramInt2 + rrP.bzF[paramInt5], paramInt3 + rrP.Qnq[paramInt5]);
      } 
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "tile.piston.in", 0.5F, paramQnq.Dne.nextFloat() * 0.15F + 0.6F);
    } 
    return true;
  }
  
  public static int bzF(int paramInt) {
    return paramInt & 0x7;
  }
  
  private boolean Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 + rrP.FWm[paramInt4];
    int j = paramInt2 + rrP.bzF[paramInt4];
    int k = paramInt3 + rrP.Qnq[paramInt4];
    int m = 0;
    while (m < 13) {
      if (j <= 0 || j >= 255)
        return false; 
      int i2 = paramQnq.Dne(i, j, k);
      if (i2 != 0) {
        if (!Dne(i2, paramQnq, i, j, k, true))
          return false; 
        if (zKP.Dne[i2].FWm() != 1) {
          if (m == 12)
            return false; 
          i += rrP.FWm[paramInt4];
          j += rrP.bzF[paramInt4];
          k += rrP.Qnq[paramInt4];
          m++;
          continue;
        } 
        zKP.Dne[i2].FWm(paramQnq, i, j, k, paramQnq.bzF(i, j, k), 0);
        paramQnq.Qnq(i, j, k);
      } 
    } 
    m = i;
    int n = j;
    int i1 = k;
    byte b = 0;
    int[] arrayOfInt = new int[13];
    while (true) {
      if (i != paramInt1 || j != paramInt2 || k != paramInt3) {
        int i2 = i - rrP.FWm[paramInt4];
        int i3 = j - rrP.bzF[paramInt4];
        int i4 = k - rrP.Qnq[paramInt4];
        int i5 = paramQnq.Dne(i2, i3, i4);
        int i6 = paramQnq.bzF(i2, i3, i4);
        if (i5 == this.FWm && i2 == paramInt1 && i3 == paramInt2 && i4 == paramInt3) {
          paramQnq.FWm(i, j, k, ((tsU)zKP.Dne).FWm, paramInt4 | ((this.Dne != null) ? 8 : 0), 4);
          paramQnq.Dne(i, j, k, tsU.Dne(((FmX)zKP.Dne).FWm, paramInt4 | ((this.Dne != null) ? 8 : 0), paramInt4, true, false));
        } else {
          paramQnq.FWm(i, j, k, ((tsU)zKP.Dne).FWm, i6, 4);
          paramQnq.Dne(i, j, k, tsU.Dne(i5, i6, paramInt4, true, false));
        } 
        arrayOfInt[b++] = i5;
        i = i2;
        j = i3;
        k = i4;
        continue;
      } 
      i = m;
      j = n;
      k = i1;
      b = 0;
      while (true) {
        if (i != paramInt1 || j != paramInt2 || k != paramInt3) {
          int i2 = i - rrP.FWm[paramInt4];
          int i3 = j - rrP.bzF[paramInt4];
          int i4 = k - rrP.Qnq[paramInt4];
          paramQnq.bzF(i2, i3, i4, arrayOfInt[b++]);
          i = i2;
          j = i3;
          k = i4;
          continue;
        } 
        return true;
      } 
      break;
    } 
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    int i = bzF(paramInt2);
    return (i > 5) ? this.bzF : ((paramInt1 == i) ? ((!Dne(paramInt2) && this.Dne <= 0.0D && this.FWm <= 0.0D && this.bzF <= 0.0D && this.Qnq >= 1.0D && this.aFZ >= 1.0D && this.zGp >= 1.0D) ? this.bzF : this.Dne) : ((paramInt1 == rrP.Dne[i]) ? this.FWm : this.Qnq));
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    return false;
  }
  
  private static boolean Dne(int paramInt1, Qnq paramQnq, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    if (paramInt1 != ((XbN)zKP.FWm).FWm && paramInt1 != ((XbN)zKP.Dne).FWm) {
      if (zKP.Dne[paramInt1].Dne(paramQnq, paramInt2, paramInt3, paramInt4) == -1.0F)
        return false; 
      if (zKP.Dne[paramInt1].FWm() == 2)
        return false; 
      if (zKP.Dne[paramInt1].FWm() == 1)
        return !!paramBoolean; 
    } else if (Dne(paramQnq.bzF(paramInt2, paramInt3, paramInt4))) {
      return false;
    } 
    return !(zKP.Dne[paramInt1] instanceof sCQ);
  }
  
  public static int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH) {
    if (geR.Qnq((float)paramFUH.div - paramInt1) < 2.0F && geR.Qnq((float)paramFUH.mrb - paramInt3) < 2.0F) {
      double d = paramFUH.IjH + 1.82D - paramFUH.udO;
      if (d - paramInt2 > 2.0D)
        return 1; 
      if (paramInt2 - d > 0.0D)
        return 0; 
    } 
    int i = geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3;
    return (i == 0) ? 2 : ((i == 1) ? 5 : ((i == 2) ? 3 : ((i == 3) ? 4 : 0)));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = bzF(i);
    if (j != 7) {
      boolean bool = FWm(paramQnq, paramInt1, paramInt2, paramInt3, j);
      if (bool && !Dne(i)) {
        if (bzF(paramQnq, paramInt1, paramInt2, paramInt3, j))
          paramQnq.Qnq(paramInt1, paramInt2, paramInt3, this.FWm, 0, j); 
      } else if (!bool && Dne(i)) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 2);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3, this.FWm, 1, j);
      } 
    } 
  }
  
  private static boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 + rrP.FWm[paramInt4];
    int j = paramInt2 + rrP.bzF[paramInt4];
    int k = paramInt3 + rrP.Qnq[paramInt4];
    byte b = 0;
    while (b < 13) {
      if (j <= 0 || j >= 255)
        return false; 
      int m = paramQnq.Dne(i, j, k);
      if (m != 0) {
        if (!Dne(m, paramQnq, i, j, k, true))
          return false; 
        if (zKP.Dne[m].FWm() != 1) {
          if (b == 12)
            return false; 
          i += rrP.FWm[paramInt4];
          j += rrP.bzF[paramInt4];
          k += rrP.Qnq[paramInt4];
          b++;
        } 
      } 
    } 
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.aFZ == null && paramQnq.Dne(paramInt1, paramInt2, paramInt3) == null)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  public boolean FWm() {
    return false;
  }
  
  private boolean FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 != 0 && paramQnq.Qnq(paramInt1, paramInt2 - 1, paramInt3, 0)) ? true : ((paramInt4 != 1 && paramQnq.Qnq(paramInt1, paramInt2 + 1, paramInt3, 1)) ? true : ((paramInt4 != 2 && paramQnq.Qnq(paramInt1, paramInt2, paramInt3 - 1, 2)) ? true : ((paramInt4 != 3 && paramQnq.Qnq(paramInt1, paramInt2, paramInt3 + 1, 3)) ? true : ((paramInt4 != 5 && paramQnq.Qnq(paramInt1 + 1, paramInt2, paramInt3, 5)) ? true : ((paramInt4 != 4 && paramQnq.Qnq(paramInt1 - 1, paramInt2, paramInt3, 4)) ? true : (paramQnq.Qnq(paramInt1, paramInt2, paramInt3, 0) ? true : (paramQnq.Qnq(paramInt1, paramInt2 + 2, paramInt3, 1) ? true : (paramQnq.Qnq(paramInt1, paramInt2 + 1, paramInt3 - 1, 2) ? true : (paramQnq.Qnq(paramInt1, paramInt2 + 1, paramInt3 + 1, 3) ? true : (paramQnq.Qnq(paramInt1 - 1, paramInt2 + 1, paramInt3, 4) ? true : paramQnq.Qnq(paramInt1 + 1, paramInt2 + 1, paramInt3, 5)))))))))));
  }
  
  public void FWm(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public XbN(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.yMz);
    this.Dne = paramBoolean;
    Dne((PsW)aFZ);
    bzF(0.5F);
    Dne(JcN.bzF);
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if (Dne(i)) {
      switch (bzF(i)) {
        case 0:
          Dne(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
          break;
        case 1:
          Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
          break;
        case 2:
          Dne(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
          break;
        case 3:
          Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
          break;
        case 4:
          Dne(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
          break;
        case 5:
          Dne(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
          break;
      } 
    } else {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    } 
  }
  
  public gDn Dne() {
    return this.bzF;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("piston_side");
    this.bzF = paramRbp.Dne((this.Dne != null) ? "piston_top_sticky" : "piston_top");
    this.Dne = paramRbp.Dne("piston_inner_top");
    this.FWm = paramRbp.Dne("piston_bottom");
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFUH);
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
    if (paramQnq.aFZ == null)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  public int Dne() {
    return 16;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XbN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */