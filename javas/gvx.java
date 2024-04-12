import java.util.Random;

public abstract class gvx extends kbN {
  protected final boolean Dne;
  
  protected int bzF(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return 15;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = ((geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3) + 2) % 4;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 3);
    boolean bool = FWm(paramQnq, paramInt1, paramInt2, paramInt3, i);
    if (bool)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, 1); 
  }
  
  protected int aFZ(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    return bzF(i) ? ((i == ((VHB)zKP.Dne).FWm) ? paramZpi.bzF(paramInt1, paramInt2, paramInt3) : paramZpi.FWm(paramInt1, paramInt2, paramInt3, paramInt4)) : 0;
  }
  
  protected boolean Dne(int paramInt) {
    return this.Dne;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean a_(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return false;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 0) ? (this.Dne ? zKP.CZC.FWm(paramInt1) : zKP.iNQ.FWm(paramInt1)) : ((paramInt1 == 1) ? this.Qnq : zKP.Dne.FWm(1));
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean zGp(int paramInt) {
    return aFZ(paramInt);
  }
  
  protected abstract gvx FWm();
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.Dne) {
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
    } 
    super.bzF(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean aFZ(int paramInt) {
    return (paramInt == (Dne()).FWm || paramInt == (FWm()).FWm);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return !paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) ? false : super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
    } else {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public int Dne() {
    return 36;
  }
  
  protected int bzF(int paramInt) {
    return d_(paramInt);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 != 0 && paramInt4 != 1);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if (!Dne(i))
      return 0; 
    int j = Qnq(i);
    return (j == 0 && paramInt4 == 3) ? bzF(paramZpi, paramInt1, paramInt2, paramInt3, i) : ((j == 1 && paramInt4 == 4) ? bzF(paramZpi, paramInt1, paramInt2, paramInt3, i) : ((j == 2 && paramInt4 == 2) ? bzF(paramZpi, paramInt1, paramInt2, paramInt3, i) : ((j == 3 && paramInt4 == 5) ? bzF(paramZpi, paramInt1, paramInt2, paramInt3, i) : 0)));
  }
  
  protected int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Qnq(paramInt4);
    int j = paramInt1 + zxJ.Dne[i];
    int k = paramInt3 + zxJ.FWm[i];
    int m = paramQnq.bzF(j, paramInt2, k, zxJ.bzF[i]);
    return (m >= 15) ? m : Math.max(m, (paramQnq.Dne(j, paramInt2, k) == ((VHB)zKP.Dne).FWm) ? paramQnq.bzF(j, paramInt2, k) : 0);
  }
  
  public boolean FWm() {
    return false;
  }
  
  public static boolean Qnq(int paramInt) {
    return (zKP.Dne.aFZ(paramInt) || zKP.Dne.aFZ(paramInt));
  }
  
  protected boolean bzF(int paramInt) {
    dNT dNT = zKP.Dne[paramInt];
    return (dNT != null && dNT.bzF());
  }
  
  protected void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3, i)) {
      boolean bool = FWm(paramQnq, paramInt1, paramInt2, paramInt3, i);
      if (((this.Dne && !bool) || (!this.Dne && bool)) && !paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm)) {
        byte b = -1;
        if (bzF(paramQnq, paramInt1, paramInt2, paramInt3, i)) {
          b = -3;
        } else if (this.Dne) {
          b = -2;
        } 
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, d_(i), b);
      } 
    } 
  }
  
  protected abstract int d_(int paramInt);
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne(this.Dne ? "repeater_lit" : "repeater");
  }
  
  protected void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = Qnq(paramQnq.bzF(paramInt1, paramInt2, paramInt3));
    if (i == 1) {
      paramQnq.Qnq(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3, this.FWm, 4);
    } 
    if (i == 3) {
      paramQnq.Qnq(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3, this.FWm, 5);
    } 
    if (i == 2) {
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1, this.FWm, 2);
    } 
    if (i == 0) {
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1, this.FWm, 3);
    } 
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return !paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) ? false : super.a_(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  protected gvx(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.qLR);
    this.Dne = paramBoolean;
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
  }
  
  public boolean bzF() {
    return true;
  }
  
  protected abstract gvx Dne();
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3, i)) {
      boolean bool = FWm(paramQnq, paramInt1, paramInt2, paramInt3, i);
      if (this.Dne && !bool) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, (FWm()).FWm, i, 2);
      } else if (!this.Dne) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, (Dne()).FWm, i, 2);
        if (!bool)
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, (Dne()).FWm, bzF(i), -1); 
      } 
    } 
  }
  
  public boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Qnq(paramInt4);
    if (Qnq(paramQnq.Dne(paramInt1 - zxJ.Dne[i], paramInt2, paramInt3 - zxJ.FWm[i]))) {
      int j = paramQnq.bzF(paramInt1 - zxJ.Dne[i], paramInt2, paramInt3 - zxJ.FWm[i]);
      int k = Qnq(j);
      return (k != i);
    } 
    return false;
  }
  
  protected int Qnq(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Qnq(paramInt4);
    switch (i) {
      case 0:
      case 2:
        return Math.max(aFZ(paramZpi, paramInt1 - 1, paramInt2, paramInt3, 4), aFZ(paramZpi, paramInt1 + 1, paramInt2, paramInt3, 5));
      case 1:
      case 3:
        return Math.max(aFZ(paramZpi, paramInt1, paramInt2, paramInt3 + 1, 3), aFZ(paramZpi, paramInt1, paramInt2, paramInt3 - 1, 2));
    } 
    return 0;
  }
  
  protected boolean FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4) > 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gvx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */