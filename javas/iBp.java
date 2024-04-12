import java.util.Random;

public class iBp extends zKP {
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 != this.FWm && bzF(paramQnq, paramInt1, paramInt2, paramInt3)) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = i & 0x3;
      boolean bool = false;
      if (!paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3) && j == 3)
        bool = true; 
      if (!paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3) && j == 1)
        bool = true; 
      if (!paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1) && j == 0)
        bool = true; 
      if (!paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1) && j == 2)
        bool = true; 
      if (bool) {
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i, 0);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } 
    } 
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public void aFZ(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, this.FWm, paramInt4, false, -1, 0);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) == 8) ? 15 : 0;
  }
  
  public int Dne(Qnq paramQnq) {
    return 10;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x3;
    float f = 0.1875F;
    if (i == 3) {
      Dne(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
    } else if (i == 1) {
      Dne(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
    } else if (i == 0) {
      Dne(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
    } else if (i == 2) {
      Dne(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
    } 
  }
  
  private void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (paramBoolean2 && !paramBoolean4) {
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.4F, 0.6F);
    } else if (!paramBoolean2 && paramBoolean4) {
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.4F, 0.5F);
    } else if (paramBoolean1 && !paramBoolean3) {
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.4F, 0.7F);
    } else if (!paramBoolean1 && paramBoolean3) {
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.bowhit", 0.4F, 1.2F / (paramQnq.Dne.nextFloat() * 0.2F + 0.9F));
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    boolean bool1 = ((paramInt5 & 0x4) == 4) ? true : false;
    boolean bool2 = ((paramInt5 & 0x8) == 8) ? true : false;
    if (bool1 || bool2)
      Dne(paramQnq, paramInt1, paramInt2, paramInt3, 0, paramInt5, false, -1, 0); 
    if (bool2) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
      int i = paramInt5 & 0x3;
      if (i == 3) {
        paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      } else if (i == 1) {
        paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      } else if (i == 0) {
        paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      } else if (i == 2) {
        paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
      } 
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public iBp(int paramInt) {
    super(paramInt, KFd.qLR);
    Dne(JcN.bzF);
    Dne(true);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, this.FWm, paramQnq.bzF(paramInt1, paramInt2, paramInt3), true, -1, 0);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3) ? true : (paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1) ? true : paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)));
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 2 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)) ? true : ((paramInt4 == 3 && paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1)) ? true : ((paramInt4 == 4 && paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3)) ? true : ((paramInt4 == 5 && paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3)))));
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    byte b = 0;
    if (paramInt4 == 2 && paramQnq.FWm(paramInt1, paramInt2, paramInt3 + 1, true))
      b = 2; 
    if (paramInt4 == 3 && paramQnq.FWm(paramInt1, paramInt2, paramInt3 - 1, true))
      b = 0; 
    if (paramInt4 == 4 && paramQnq.FWm(paramInt1 + 1, paramInt2, paramInt3, true))
      b = 1; 
    if (paramInt4 == 5 && paramQnq.FWm(paramInt1 - 1, paramInt2, paramInt3, true))
      b = 3; 
    return b;
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!Dne(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      return false;
    } 
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, int paramInt7) {
    int i = paramInt5 & 0x3;
    int j = ((paramInt5 & 0x4) == 4) ? 1 : 0;
    boolean bool1 = ((paramInt5 & 0x8) == 8) ? true : false;
    int k = (paramInt4 == ((iBp)zKP.Dne).FWm) ? 1 : 0;
    int m = 0;
    boolean bool2 = !paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) ? true : false;
    String str = zxJ.Dne[i];
    int n = zxJ.FWm[i];
    int i1 = 0;
    int[] arrayOfInt = new int[42];
    int i2;
    for (i2 = 1; i2 < 42; i2++) {
      int i3 = paramInt1 + str * i2;
      int i4 = paramInt3 + n * i2;
      int i5 = paramQnq.Dne(i3, paramInt2, i4);
      if (i5 == ((iBp)zKP.Dne).FWm) {
        int i6 = paramQnq.bzF(i3, paramInt2, i4);
        if ((i6 & 0x3) == zxJ.aFZ[i])
          i1 = i2; 
        break;
      } 
      if (i5 != zKP.lDk.FWm && i2 != paramInt6) {
        arrayOfInt[i2] = -1;
        k = 0;
      } else {
        int i6 = (i2 == paramInt6) ? paramInt7 : paramQnq.bzF(i3, paramInt2, i4);
        byte b = ((i6 & 0x8) != 8) ? 1 : 0;
        boolean bool3 = ((i6 & 0x1) == 1) ? true : false;
        boolean bool4 = ((i6 & 0x2) == 2) ? true : false;
        k &= (bool4 == bool2) ? 1 : 0;
        m |= (b && bool3) ? 1 : 0;
        arrayOfInt[i2] = i6;
        if (i2 == paramInt6) {
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, paramInt4, Dne(paramQnq));
          k &= b;
        } 
      } 
    } 
    k &= (i1 > 1) ? 1 : 0;
    m &= k;
    i2 = ((k != 0) ? 4 : 0) | ((m != 0) ? 8 : 0);
    paramInt5 = i | i2;
    if (i1 > 0) {
      int i3 = paramInt1 + str * i1;
      int i4 = paramInt3 + n * i1;
      int i5 = zxJ.aFZ[i];
      paramQnq.Dne(i3, paramInt2, i4, i5 | i2, 3);
      FWm(paramQnq, i3, paramInt2, i4, i5);
      Dne(paramQnq, i3, paramInt2, i4, k, m, j, bool1);
    } 
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, k, m, j, bool1);
    if (paramInt4 > 0) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt5, 3);
      if (paramBoolean)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i); 
    } 
    if (j != k)
      for (byte b = 1; b < i1; b++) {
        int i3 = paramInt1 + str * b;
        int i4 = paramInt3 + n * b;
        int i5 = arrayOfInt[b];
        if (i5 >= 0) {
          if (k != 0) {
            i5 |= 0x4;
          } else {
            i5 &= 0xFFFFFFFB;
          } 
          paramQnq.Dne(i3, paramInt2, i4, i5, 3);
        } 
      }  
  }
  
  public int Dne() {
    return 29;
  }
  
  static {
  
  }
  
  public boolean bzF() {
    return true;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if ((i & 0x8) != 8)
      return 0; 
    int j = i & 0x3;
    return (j == 2 && paramInt4 == 2) ? 15 : ((j == 0 && paramInt4 == 3) ? 15 : ((j == 1 && paramInt4 == 4) ? 15 : ((j == 3 && paramInt4 == 5) ? 15 : 0)));
  }
  
  public boolean FWm() {
    return false;
  }
  
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
    if (paramInt4 == 3) {
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
    } else if (paramInt4 == 1) {
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
    } else if (paramInt4 == 0) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
    } else if (paramInt4 == 2) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iBp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */