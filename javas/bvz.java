import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class bvz {
  protected int zGp;
  
  protected CLK Dne;
  
  protected int aFZ;
  
  protected int Dne(int paramInt1, int paramInt2) {
    switch (this.aFZ) {
      case 0:
      case 2:
        return this.Dne.Dne + paramInt1;
      case 1:
        return this.Dne.Qnq - paramInt2;
      case 3:
        return this.Dne.Dne + paramInt2;
    } 
    return paramInt1;
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, Random paramRandom, float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramRandom.nextFloat() < paramFloat)
      Dne(paramQnq, paramInt4, paramInt5, paramInt1, paramInt2, paramInt3, paramCLK); 
  }
  
  public int Dne() {
    return this.zGp;
  }
  
  protected int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, CLK paramCLK) {
    int i = Dne(paramInt1, paramInt3);
    int j = Dne(paramInt2);
    int k = FWm(paramInt1, paramInt3);
    return !paramCLK.Dne(i, j, k) ? 0 : paramQnq.Dne(i, j, k);
  }
  
  protected boolean Dne(Qnq paramQnq, CLK paramCLK, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, fKu[] paramArrayOffKu, int paramInt4) {
    int i = Dne(paramInt1, paramInt3);
    int j = Dne(paramInt2);
    int k = FWm(paramInt1, paramInt3);
    if (paramCLK.Dne(i, j, k) && paramQnq.Dne(i, j, k) != ((gHK)zKP.Dne).FWm) {
      paramQnq.FWm(i, j, k, ((gHK)zKP.Dne).FWm, 0, 2);
      GON gON = (GON)paramQnq.Dne(i, j, k);
      if (gON != null)
        fKu.Dne(paramRandom, paramArrayOffKu, gON, paramInt4); 
      return true;
    } 
    return false;
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, boolean paramBoolean) {
    for (int i = paramInt2; i <= paramInt5; i++) {
      for (int j = paramInt1; j <= paramInt4; j++) {
        for (int k = paramInt3; k <= paramInt6; k++) {
          if (!paramBoolean || Dne(paramQnq, j, i, k, paramCLK) != 0)
            if (i != paramInt2 && i != paramInt5 && j != paramInt1 && j != paramInt4 && k != paramInt3 && k != paramInt6) {
              Dne(paramQnq, paramInt9, paramInt10, j, i, k, paramCLK);
            } else {
              Dne(paramQnq, paramInt7, paramInt8, j, i, k, paramCLK);
            }  
        } 
      } 
    } 
  }
  
  protected boolean Dne(Qnq paramQnq, CLK paramCLK) {
    int i = Math.max(this.Dne.Dne - 1, paramCLK.Dne);
    int j = Math.max(this.Dne.FWm - 1, paramCLK.FWm);
    int k = Math.max(this.Dne.bzF - 1, paramCLK.bzF);
    int m = Math.min(this.Dne.Qnq + 1, paramCLK.Qnq);
    int n = Math.min(this.Dne.aFZ + 1, paramCLK.aFZ);
    int i1 = Math.min(this.Dne.zGp + 1, paramCLK.zGp);
    int i2;
    for (i2 = i; i2 <= m; i2++) {
      for (int i3 = k; i3 <= i1; i3++) {
        int i4 = paramQnq.Dne(i2, j, i3);
        if (i4 > 0 && (zKP.Dne[i4]).Dne.Qnq())
          return true; 
        i4 = paramQnq.Dne(i2, n, i3);
        if (i4 > 0 && (zKP.Dne[i4]).Dne.Qnq())
          return true; 
      } 
    } 
    for (i2 = i; i2 <= m; i2++) {
      for (int i3 = j; i3 <= n; i3++) {
        int i4 = paramQnq.Dne(i2, i3, k);
        if (i4 > 0 && (zKP.Dne[i4]).Dne.Qnq())
          return true; 
        i4 = paramQnq.Dne(i2, i3, i1);
        if (i4 > 0 && (zKP.Dne[i4]).Dne.Qnq())
          return true; 
      } 
    } 
    for (i2 = k; i2 <= i1; i2++) {
      for (int i3 = j; i3 <= n; i3++) {
        int i4 = paramQnq.Dne(i, i3, i2);
        if (i4 > 0 && (zKP.Dne[i4]).Dne.Qnq())
          return true; 
        i4 = paramQnq.Dne(m, i3, i2);
        if (i4 > 0 && (zKP.Dne[i4]).Dne.Qnq())
          return true; 
      } 
    } 
    return false;
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, Random paramRandom, float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean) {
    for (int i = paramInt2; i <= paramInt5; i++) {
      for (int j = paramInt1; j <= paramInt4; j++) {
        for (int k = paramInt3; k <= paramInt6; k++) {
          if (paramRandom.nextFloat() <= paramFloat && (!paramBoolean || Dne(paramQnq, j, i, k, paramCLK) != 0))
            if (i != paramInt2 && i != paramInt5 && j != paramInt1 && j != paramInt4 && k != paramInt3 && k != paramInt6) {
              Dne(paramQnq, paramInt8, 0, j, i, k, paramCLK);
            } else {
              Dne(paramQnq, paramInt7, 0, j, i, k, paramCLK);
            }  
        } 
      } 
    } 
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, CLK paramCLK) {
    int i = Dne(paramInt1, paramInt3);
    int j = Dne(paramInt2);
    int k = FWm(paramInt1, paramInt3);
    if (paramCLK.Dne(i, j, k))
      while (!paramQnq.Dne(i, j, k) && j < 255) {
        paramQnq.FWm(i, j, k, 0, 0, 2);
        j++;
      }  
  }
  
  public CLK Dne() {
    return this.Dne;
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean) {
    for (int i = paramInt2; i <= paramInt5; i++) {
      for (int j = paramInt1; j <= paramInt4; j++) {
        for (int k = paramInt3; k <= paramInt6; k++) {
          if (!paramBoolean || Dne(paramQnq, j, i, k, paramCLK) != 0)
            if (i != paramInt2 && i != paramInt5 && j != paramInt1 && j != paramInt4 && k != paramInt3 && k != paramInt6) {
              Dne(paramQnq, paramInt8, 0, j, i, k, paramCLK);
            } else {
              Dne(paramQnq, paramInt7, 0, j, i, k, paramCLK);
            }  
        } 
      } 
    } 
  }
  
  protected void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CLK paramCLK) {
    int i = Dne(paramInt3, paramInt5);
    int j = Dne(paramInt4);
    int k = FWm(paramInt3, paramInt5);
    if (paramCLK.Dne(i, j, k))
      while ((paramQnq.Dne(i, j, k) || paramQnq.Dne(i, j, k).Qnq()) && j > 1) {
        paramQnq.FWm(i, j, k, paramInt1, paramInt2, 2);
        j--;
      }  
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    for (int i = paramInt2; i <= paramInt5; i++) {
      for (int j = paramInt1; j <= paramInt4; j++) {
        for (int k = paramInt3; k <= paramInt6; k++)
          Dne(paramQnq, 0, 0, j, i, k, paramCLK); 
      } 
    } 
  }
  
  protected bvz(int paramInt) {
    this.zGp = paramInt;
    this.aFZ = -1;
  }
  
  protected int Dne(int paramInt) {
    return (this.aFZ == -1) ? paramInt : (paramInt + this.Dne.FWm);
  }
  
  public abstract boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK);
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {}
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, Random paramRandom, Xtu paramXtu) {
    for (int i = paramInt2; i <= paramInt5; i++) {
      for (int j = paramInt1; j <= paramInt4; j++) {
        for (int k = paramInt3; k <= paramInt6; k++) {
          if (!paramBoolean || Dne(paramQnq, j, i, k, paramCLK) != 0) {
            paramXtu.Dne(paramRandom, j, i, k, (i == paramInt2 || i == paramInt5 || j == paramInt1 || j == paramInt4 || k == paramInt3 || k == paramInt6));
            Dne(paramQnq, paramXtu.Dne(), paramXtu.FWm(), j, i, k, paramCLK);
          } 
        } 
      } 
    } 
  }
  
  public EyB Dne() {
    return new EyB(this.Dne.Qnq(), this.Dne.aFZ(), this.Dne.zGp());
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CLK paramCLK) {
    int i = Dne(paramInt3, paramInt5);
    int j = Dne(paramInt4);
    int k = FWm(paramInt3, paramInt5);
    if (paramCLK.Dne(i, j, k))
      paramQnq.FWm(i, j, k, paramInt1, paramInt2, 2); 
  }
  
  public static bvz Dne(List paramList, CLK paramCLK) {
    Iterator<bvz> iterator = paramList.iterator();
    while (true) {
      if (!iterator.hasNext())
        return null; 
      bvz bvz1 = iterator.next();
      if (bvz1.Dne() != null && bvz1.Dne().Dne(paramCLK))
        return bvz1; 
    } 
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean) {
    float f1 = (paramInt4 - paramInt1 + 1);
    float f2 = (paramInt5 - paramInt2 + 1);
    float f3 = (paramInt6 - paramInt3 + 1);
    float f4 = paramInt1 + f1 / 2.0F;
    float f5 = paramInt3 + f3 / 2.0F;
    for (int i = paramInt2; i <= paramInt5; i++) {
      float f = (i - paramInt2) / f2;
      for (int j = paramInt1; j <= paramInt4; j++) {
        float f6 = (j - f4) / f1 * 0.5F;
        for (int k = paramInt3; k <= paramInt6; k++) {
          float f7 = (k - f5) / f3 * 0.5F;
          if (!paramBoolean || Dne(paramQnq, j, i, k, paramCLK) != 0) {
            float f8 = f6 * f6 + f * f + f7 * f7;
            if (f8 <= 1.05F)
              Dne(paramQnq, paramInt7, 0, j, i, k, paramCLK); 
          } 
        } 
      } 
    } 
  }
  
  protected int bzF(int paramInt1, int paramInt2) {
    if (paramInt1 == zKP.FYZ.FWm) {
      if (this.aFZ == 1 || this.aFZ == 3)
        return (paramInt2 == 1) ? 0 : 1; 
    } else if (paramInt1 != zKP.ICU.FWm && paramInt1 != zKP.IYC.FWm) {
      if (paramInt1 != zKP.BJH.FWm && paramInt1 != zKP.One.FWm && paramInt1 != zKP.ivB.FWm && paramInt1 != zKP.yIR.FWm && paramInt1 != zKP.Wnd.FWm) {
        if (paramInt1 == zKP.ZfC.FWm) {
          if (this.aFZ == 0) {
            if (paramInt2 == 2)
              return 3; 
            if (paramInt2 == 3)
              return 2; 
          } else if (this.aFZ == 1) {
            if (paramInt2 == 2)
              return 4; 
            if (paramInt2 == 3)
              return 5; 
            if (paramInt2 == 4)
              return 2; 
            if (paramInt2 == 5)
              return 3; 
          } else if (this.aFZ == 3) {
            if (paramInt2 == 2)
              return 5; 
            if (paramInt2 == 3)
              return 4; 
            if (paramInt2 == 4)
              return 2; 
            if (paramInt2 == 5)
              return 3; 
          } 
        } else if (paramInt1 == zKP.LoG.FWm) {
          if (this.aFZ == 0) {
            if (paramInt2 == 3)
              return 4; 
            if (paramInt2 == 4)
              return 3; 
          } else if (this.aFZ == 1) {
            if (paramInt2 == 3)
              return 1; 
            if (paramInt2 == 4)
              return 2; 
            if (paramInt2 == 2)
              return 3; 
            if (paramInt2 == 1)
              return 4; 
          } else if (this.aFZ == 3) {
            if (paramInt2 == 3)
              return 2; 
            if (paramInt2 == 4)
              return 1; 
            if (paramInt2 == 2)
              return 3; 
            if (paramInt2 == 1)
              return 4; 
          } 
        } else if (paramInt1 != ((iBp)zKP.Dne).FWm && (zKP.Dne[paramInt1] == null || !(zKP.Dne[paramInt1] instanceof kbN))) {
          if (paramInt1 == ((XbN)zKP.FWm).FWm || paramInt1 == ((XbN)zKP.Dne).FWm || paramInt1 == zKP.cHy.FWm || paramInt1 == zKP.Vxn.FWm)
            if (this.aFZ == 0) {
              if (paramInt2 == 2 || paramInt2 == 3)
                return rrP.Dne[paramInt2]; 
            } else if (this.aFZ == 1) {
              if (paramInt2 == 2)
                return 4; 
              if (paramInt2 == 3)
                return 5; 
              if (paramInt2 == 4)
                return 2; 
              if (paramInt2 == 5)
                return 3; 
            } else if (this.aFZ == 3) {
              if (paramInt2 == 2)
                return 5; 
              if (paramInt2 == 3)
                return 4; 
              if (paramInt2 == 4)
                return 2; 
              if (paramInt2 == 5)
                return 3; 
            }  
        } else if (this.aFZ == 0) {
          if (paramInt2 == 0 || paramInt2 == 2)
            return zxJ.aFZ[paramInt2]; 
        } else if (this.aFZ == 1) {
          if (paramInt2 == 2)
            return 1; 
          if (paramInt2 == 0)
            return 3; 
          if (paramInt2 == 1)
            return 2; 
          if (paramInt2 == 3)
            return 0; 
        } else if (this.aFZ == 3) {
          if (paramInt2 == 2)
            return 3; 
          if (paramInt2 == 0)
            return 1; 
          if (paramInt2 == 1)
            return 2; 
          if (paramInt2 == 3)
            return 0; 
        } 
      } else if (this.aFZ == 0) {
        if (paramInt2 == 2)
          return 3; 
        if (paramInt2 == 3)
          return 2; 
      } else if (this.aFZ == 1) {
        if (paramInt2 == 0)
          return 2; 
        if (paramInt2 == 1)
          return 3; 
        if (paramInt2 == 2)
          return 0; 
        if (paramInt2 == 3)
          return 1; 
      } else if (this.aFZ == 3) {
        if (paramInt2 == 0)
          return 2; 
        if (paramInt2 == 1)
          return 3; 
        if (paramInt2 == 2)
          return 1; 
        if (paramInt2 == 3)
          return 0; 
      } 
    } else if (this.aFZ == 0) {
      if (paramInt2 == 0)
        return 2; 
      if (paramInt2 == 2)
        return 0; 
    } else {
      if (this.aFZ == 1)
        return paramInt2 + 1 & 0x3; 
      if (this.aFZ == 3)
        return paramInt2 + 3 & 0x3; 
    } 
    return paramInt2;
  }
  
  protected int FWm(int paramInt1, int paramInt2) {
    switch (this.aFZ) {
      case 0:
        return this.Dne.bzF + paramInt2;
      case 1:
      case 3:
        return this.Dne.bzF + paramInt1;
      case 2:
        return this.Dne.zGp - paramInt2;
    } 
    return paramInt2;
  }
  
  protected boolean Dne(Qnq paramQnq, CLK paramCLK, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, fKu[] paramArrayOffKu, int paramInt5) {
    int i = Dne(paramInt1, paramInt3);
    int j = Dne(paramInt2);
    int k = FWm(paramInt1, paramInt3);
    if (paramCLK.Dne(i, j, k) && paramQnq.Dne(i, j, k) != zKP.Vxn.FWm) {
      paramQnq.FWm(i, j, k, zKP.Vxn.FWm, bzF(zKP.Vxn.FWm, paramInt4), 2);
      UTs uTs = (UTs)paramQnq.Dne(i, j, k);
      if (uTs != null)
        fKu.Dne(paramRandom, paramArrayOffKu, uTs, paramInt5); 
      return true;
    } 
    return false;
  }
  
  protected void Dne(Qnq paramQnq, CLK paramCLK, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Dne(paramInt1, paramInt3);
    int j = Dne(paramInt2);
    int k = FWm(paramInt1, paramInt3);
    if (paramCLK.Dne(i, j, k))
      fgS.Dne(paramQnq, i, j, k, paramInt4, zKP.ICU); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bvz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */