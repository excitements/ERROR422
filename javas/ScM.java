import java.util.Random;

public class ScM extends hbe {
  private final zKP iTJ;
  
  private gDn Dne;
  
  private float FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    float f = 1.0F;
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1);
    int j = paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1);
    int k = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3);
    int m = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3);
    int n = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3 - 1);
    int i1 = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3 - 1);
    int i2 = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3 + 1);
    int i3 = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3 + 1);
    boolean bool1 = (k == this.FWm || m == this.FWm) ? true : false;
    boolean bool2 = (i == this.FWm || j == this.FWm) ? true : false;
    boolean bool3 = (n == this.FWm || i1 == this.FWm || i2 == this.FWm || i3 == this.FWm) ? true : false;
    for (int i4 = paramInt1 - 1; i4 <= paramInt1 + 1; i4++) {
      for (int i5 = paramInt3 - 1; i5 <= paramInt3 + 1; i5++) {
        int i6 = paramQnq.Dne(i4, paramInt2 - 1, i5);
        float f1 = 0.0F;
        if (i6 == zKP.rPc.FWm) {
          f1 = 1.0F;
          if (paramQnq.bzF(i4, paramInt2 - 1, i5) > 0)
            f1 = 3.0F; 
        } 
        if (i4 != paramInt1 || i5 != paramInt3)
          f1 /= 4.0F; 
        f += f1;
      } 
    } 
    if (bool3 || (bool1 && bool2))
      f /= 2.0F; 
    return f;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (this.iTJ == zKP.aJO) ? dEr.LDH.Qnq : ((this.iTJ == zKP.gwq) ? dEr.MUD.Qnq : 0);
  }
  
  public gDn Dne() {
    return this.Dne;
  }
  
  public int Dne(Random paramRandom) {
    return 1;
  }
  
  protected ScM(int paramInt, zKP paramzKP) {
    super(paramInt);
    this.iTJ = paramzKP;
    Dne(true);
    float f = 0.125F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    Dne((JcN)null);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
    if (paramQnq.aFZ(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
      float f = FWm(paramQnq, paramInt1, paramInt2, paramInt3);
      if (paramRandom.nextInt((int)(25.0F / f) + 1) == 0) {
        int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
        if (i < 7) {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, ++i, 2);
        } else {
          if (paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.iTJ.FWm)
            return; 
          if (paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.iTJ.FWm)
            return; 
          if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.iTJ.FWm)
            return; 
          if (paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.iTJ.FWm)
            return; 
          int j = paramRandom.nextInt(4);
          int k = paramInt1;
          int m = paramInt3;
          if (j == 0)
            k = paramInt1 - 1; 
          if (j == 1)
            k++; 
          if (j == 2)
            m = paramInt3 - 1; 
          if (j == 3)
            m++; 
          int n = paramQnq.Dne(k, paramInt2 - 1, m);
          if (paramQnq.Dne(k, paramInt2, m) == 0 && (n == zKP.rPc.FWm || n == zKP.FWm.FWm || n == ((ZQN)zKP.Dne).FWm))
            paramQnq.FWm(k, paramInt2, m, this.iTJ.FWm); 
        } 
      } 
    } 
  }
  
  protected boolean Dne(int paramInt) {
    return (paramInt == zKP.rPc.FWm);
  }
  
  public int FWm(int paramInt) {
    int i = paramInt * 32;
    int j = 255 - paramInt * 8;
    int k = paramInt * 4;
    return i << 16 | j << 8 | k;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    this.aFZ = ((paramZpi.bzF(paramInt1, paramInt2, paramInt3) * 2 + 2) / 16.0F);
    float f = 0.125F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, (float)this.aFZ, 0.5F + f);
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3) + geR.Dne((Random)paramQnq.Dne, 2, 5);
    if (i > 7)
      i = 7; 
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
  }
  
  public int Dne() {
    return 19;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
    if (paramQnq.aFZ == null) {
      dEr dEr = null;
      if (this.iTJ == zKP.aJO)
        dEr = dEr.LDH; 
      if (this.iTJ == zKP.gwq)
        dEr = dEr.MUD; 
      for (byte b = 0; b < 3; b++) {
        if (paramQnq.Dne.nextInt(15) <= paramInt4)
          FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(dEr)); 
      } 
    } 
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return FWm(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return -1;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    return (i < 7) ? -1 : ((paramZpi.Dne(paramInt1 - 1, paramInt2, paramInt3) == this.iTJ.FWm) ? 0 : ((paramZpi.Dne(paramInt1 + 1, paramInt2, paramInt3) == this.iTJ.FWm) ? 1 : ((paramZpi.Dne(paramInt1, paramInt2, paramInt3 - 1) == this.iTJ.FWm) ? 2 : ((paramZpi.Dne(paramInt1, paramInt2, paramInt3 + 1) == this.iTJ.FWm) ? 3 : -1))));
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("stem_straight");
    this.Dne = paramRbp.Dne("stem_bent");
  }
  
  public void Dne() {
    float f = 0.125F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ScM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */