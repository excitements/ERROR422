import java.util.Random;

public class VCv extends zKP {
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3)) {
      byte b;
      for (b = 1; paramQnq.Dne(paramInt1, paramInt2 - b, paramInt3) == this.FWm; b++);
      if (b < 3) {
        int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
        if (i == 15) {
          paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0, 4);
        } else {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, i + 1, 4);
        } 
      } 
    } 
  }
  
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
    return (i == this.FWm) ? true : ((i != ((ZQN)zKP.Dne).FWm && i != zKP.FWm.FWm && i != ((zKP)zKP.IjH).FWm) ? false : ((paramQnq.Dne(paramInt1 - 1, paramInt2 - 1, paramInt3) == KFd.div) ? true : ((paramQnq.Dne(paramInt1 + 1, paramInt2 - 1, paramInt3) == KFd.div) ? true : ((paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3 - 1) == KFd.div) ? true : ((paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3 + 1) == KFd.div))))));
  }
  
  public boolean FWm() {
    return false;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.XjO.Qnq;
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  protected VCv(int paramInt) {
    super(paramInt, KFd.XHL);
    float f = 0.375F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
    Dne(true);
  }
  
  public int Dne() {
    return 1;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  protected final void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.XjO.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VCv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */