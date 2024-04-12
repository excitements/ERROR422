import java.util.List;
import java.util.Random;

public abstract class dNT extends zKP {
  protected final boolean Dne;
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne) {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      boolean bool = ((paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) != 0) ? true : false;
      if (bool) {
        Dne(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
        Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      } 
    } 
  }
  
  private static boolean Dne(int paramInt) {
    return (paramInt == ((dNT)zKP.FWm).FWm || paramInt == ((dNT)zKP.Qnq).FWm);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return Dne(this.FWm) ? this.FWm : ((this.FWm == zKP.Dne.FWm) ? ((dNT)zKP.FWm).FWm : ((this.FWm == zKP.bzF.FWm) ? ((dNT)zKP.Qnq).FWm : ((dNT)zKP.FWm).FWm));
  }
  
  public int Dne(Random paramRandom) {
    return this.Dne ? 2 : 1;
  }
  
  public abstract String Dne(int paramInt);
  
  public void Dne() {
    if (this.Dne) {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    } 
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    return this.Dne ? paramInt5 : ((paramInt4 != 0 && (paramInt4 == 1 || paramFloat2 <= 0.5D)) ? paramInt5 : (paramInt5 | 0x8));
  }
  
  public dNT(int paramInt, boolean paramBoolean, KFd paramKFd) {
    super(paramInt, paramKFd);
    this.Dne = paramBoolean;
    if (paramBoolean) {
      FWm[paramInt] = true;
    } else {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    } 
    Dne(255);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.Dne)
      return super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4); 
    if (paramInt4 != 1 && paramInt4 != 0 && !super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4))
      return false; 
    int i = paramInt1 + rrP.FWm[rrP.Dne[paramInt4]];
    int j = paramInt2 + rrP.bzF[rrP.Dne[paramInt4]];
    int k = paramInt3 + rrP.Qnq[rrP.Dne[paramInt4]];
    boolean bool = ((paramZpi.bzF(i, j, k) & 0x8) != 0) ? true : false;
    return bool ? ((paramInt4 == 0) ? true : ((paramInt4 == 1 && super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4)) ? true : ((!Dne(paramZpi.Dne(paramInt1, paramInt2, paramInt3)) || (paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) == 0)))) : ((paramInt4 == 1) ? true : ((paramInt4 == 0 && super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4)) ? true : ((!Dne(paramZpi.Dne(paramInt1, paramInt2, paramInt3)) || (paramZpi.bzF(paramInt1, paramInt2, paramInt3) & 0x8) != 0))));
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return super.FWm(paramQnq, paramInt1, paramInt2, paramInt3) & 0x7;
  }
  
  public int Dne(int paramInt) {
    return paramInt & 0x7;
  }
  
  public boolean FWm() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dNT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */