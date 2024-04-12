import java.util.Random;

public class YkL extends gvx implements sCQ {
  protected int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = super.FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    int j = Qnq(paramInt4);
    int k = paramInt1 + zxJ.Dne[j];
    int m = paramInt3 + zxJ.FWm[j];
    int n = paramQnq.Dne(k, paramInt2, m);
    if (n > 0)
      if (zKP.Dne[n].a_()) {
        i = zKP.Dne[n].Dne(paramQnq, k, paramInt2, m, zxJ.aFZ[j]);
      } else if (i < 15 && zKP.DyG(n)) {
        k += zxJ.Dne[j];
        m += zxJ.FWm[j];
        n = paramQnq.Dne(k, paramInt2, m);
        if (n > 0 && zKP.Dne[n].a_())
          i = zKP.Dne[n].Dne(paramQnq, k, paramInt2, m, zxJ.aFZ[j]); 
      }  
    return i;
  }
  
  public boolean FWm(int paramInt) {
    return ((paramInt & 0x4) == 4);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.NEG.Qnq;
  }
  
  static {
  
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new HFC();
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    ipD ipD = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    return (ipD != null) ? ipD.Dne(paramInt4, paramInt5) : false;
  }
  
  protected boolean Dne(int paramInt) {
    return (this.Dne || (paramInt & 0x8) != 0);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    boolean bool = (this.Dne || (paramInt2 & 0x8) != 0) ? true : false;
    return (paramInt1 == 0) ? (bool ? zKP.CZC.FWm(paramInt1) : zKP.iNQ.FWm(paramInt1)) : ((paramInt1 == 1) ? (bool ? ((YkL)zKP.FWm).Qnq : this.Qnq) : zKP.Dne.FWm(1));
  }
  
  protected int d_(int paramInt) {
    return 2;
  }
  
  protected gvx FWm() {
    return (gvx)zKP.Dne;
  }
  
  public YkL(int paramInt, boolean paramBoolean) {
    super(paramInt, paramBoolean);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.Dne) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, (FWm()).FWm, i | 0x8, 4);
    } 
    bzF(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
  }
  
  public int Dne() {
    return 37;
  }
  
  protected int bzF(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Dne(paramZpi, paramInt1, paramInt2, paramInt3).Dne();
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, Dne(paramQnq));
  }
  
  private int bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return !FWm(paramInt4) ? FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4) : Math.max(FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4) - Qnq(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4), 0);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = this.Dne | (((i & 0x8) != 0) ? 1 : 0);
    boolean bool = !FWm(i) ? true : false;
    int k = bool ? 4 : 0;
    k |= (j != 0) ? 8 : 0;
    paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, bool ? 0.55F : 0.5F);
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, k | i & 0x3, 2);
    bzF(paramQnq, paramInt1, paramInt2, paramInt3, (Random)paramQnq.Dne);
    return true;
  }
  
  public HFC Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return (HFC)paramZpi.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  protected gvx Dne() {
    return (gvx)zKP.FWm;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.NEG.Qnq;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne(this.Dne ? "comparator_lit" : "comparator");
  }
  
  protected boolean FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    if (i >= 15)
      return true; 
    if (i == 0)
      return false; 
    int j = Qnq(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    return (j == 0) ? true : ((i >= j));
  }
  
  protected void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm)) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = bzF(paramQnq, paramInt1, paramInt2, paramInt3, i);
      int k = Dne(paramQnq, paramInt1, paramInt2, paramInt3).Dne();
      if (j != k || Dne(i) != FWm(paramQnq, paramInt1, paramInt2, paramInt3, i))
        if (bzF(paramQnq, paramInt1, paramInt2, paramInt3, i)) {
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, d_(0), -1);
        } else {
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, d_(0), 0);
        }  
    } 
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = bzF(paramQnq, paramInt1, paramInt2, paramInt3, i);
    int k = Dne(paramQnq, paramInt1, paramInt2, paramInt3).Dne();
    Dne(paramQnq, paramInt1, paramInt2, paramInt3).Dne(j);
    if (k != j || !FWm(i)) {
      boolean bool = FWm(paramQnq, paramInt1, paramInt2, paramInt3, i);
      boolean bool1 = (this.Dne || (i & 0x8) != 0) ? true : false;
      if (bool1 && !bool) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFF7, 2);
      } else if (!bool1 && bool) {
        paramQnq.Dne(paramInt1, paramInt2, paramInt3, i | 0x8, 2);
      } 
      bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YkL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */