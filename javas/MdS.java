import java.util.Random;

public class MdS extends hbe {
  private gDn[] Dne;
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, 0);
    if (paramQnq.aFZ == null && paramInt4 >= 7) {
      int i = 3 + paramInt5;
      for (byte b = 0; b < i; b++) {
        if (paramQnq.Dne.nextInt(15) <= paramInt4)
          FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(bzF(), 1, 0)); 
      } 
    } 
  }
  
  public int Dne() {
    return 6;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return bzF();
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3) + geR.Dne((Random)paramQnq.Dne, 2, 5);
    if (i > 7)
      i = 7; 
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt2 < 0 || paramInt2 > 7)
      paramInt2 = 7; 
    return this.Dne[paramInt2];
  }
  
  protected int Qnq() {
    return dEr.EWz.Qnq;
  }
  
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
        f1 = 1.0F;
        if (paramQnq.bzF(i4, paramInt2 - 1, i5) > 0)
          f1 = 3.0F; 
        if (i4 != paramInt1 || i5 != paramInt3)
          f1 /= 4.0F; 
        f += f1;
      } 
    } 
    if (bool3 || (bool1 && bool2))
      f /= 2.0F; 
    return f;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[8];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne("crops_" + b); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
    if (paramQnq.aFZ(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if (i < 7) {
        float f = FWm(paramQnq, paramInt1, paramInt2, paramInt3);
        if (paramRandom.nextInt((int)(25.0F / f) + 1) == 0)
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, ++i, 2); 
      } 
    } 
  }
  
  protected int bzF() {
    return dEr.mlD.Qnq;
  }
  
  protected boolean Dne(int paramInt) {
    return true;
  }
  
  public int Dne(Random paramRandom) {
    return 1;
  }
  
  protected MdS(int paramInt) {
    super(paramInt);
    Dne(true);
    float f = 0.5F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    Dne((JcN)null);
    bzF(0.0F);
    Dne((PsW)Qnq);
    FWm();
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return (paramInt1 == 7) ? Qnq() : bzF();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MdS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */