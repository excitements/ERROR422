import java.util.Random;

public abstract class ajI extends zKP {
  private String Dne;
  
  public boolean FWm() {
    return false;
  }
  
  protected abstract int bzF(int paramInt);
  
  protected bSp Dne(int paramInt1, int paramInt2, int paramInt3) {
    float f = 0.125F;
    return bSp.Dne().Dne((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool = false;
    if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && !LRA.Dne(paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3)))
      bool = true; 
    if (bool) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne(this.Dne);
  }
  
  protected void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
    paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (a_(paramInt5) > 0)
      FWm(paramQnq, paramInt1, paramInt2, paramInt3); 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return a_(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne() {
    float f1 = 0.5F;
    float f2 = 0.125F;
    float f3 = 0.5F;
    Dne(0.5F - f1, 0.5F - f2, 0.5F - f3, 0.5F + f1, 0.5F + f2, 0.5F + f3);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    if (paramQnq.aFZ == null) {
      int i = a_(paramQnq.bzF(paramInt1, paramInt2, paramInt3));
      if (i == 0)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i); 
    } 
  }
  
  public int Dne(Qnq paramQnq) {
    return 20;
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return true;
  }
  
  protected void Dne(int paramInt) {
    boolean bool = (a_(paramInt) > 0) ? true : false;
    float f = 0.0625F;
    if (bool) {
      Dne(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
    } else {
      Dne(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null) {
      int i = a_(paramQnq.bzF(paramInt1, paramInt2, paramInt3));
      if (i > 0)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, i); 
    } 
  }
  
  protected abstract int a_(int paramInt);
  
  protected abstract int a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3);
  
  public boolean Dne() {
    return false;
  }
  
  protected void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = a_(paramQnq, paramInt1, paramInt2, paramInt3);
    boolean bool1 = (paramInt4 > 0) ? true : false;
    boolean bool2 = (i > 0) ? true : false;
    if (paramInt4 != i) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, bzF(i), 2);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3);
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    } 
    if (!bool2 && bool1) {
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
    } else if (bool2 && !bool1) {
      paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
    } 
    if (bool2)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq)); 
  }
  
  public int FWm() {
    return 1;
  }
  
  public boolean bzF() {
    return true;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  protected ajI(int paramInt, String paramString, KFd paramKFd) {
    super(paramInt, paramKFd);
    this.Dne = paramString;
    Dne(JcN.bzF);
    Dne(true);
    Dne(bzF(15));
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) || LRA.Dne(paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3)));
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 1) ? a_(paramZpi.bzF(paramInt1, paramInt2, paramInt3)) : 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ajI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */