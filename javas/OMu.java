import java.util.Random;

public class OMu extends zKP {
  private gDn FWm;
  
  private gDn Dne;
  
  public boolean FWm() {
    return false;
  }
  
  protected OMu(int paramInt) {
    super(paramInt, KFd.vSL);
    Dne(true);
    Dne(JcN.FWm);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : ((paramInt1 == 0) ? this.FWm : this.Qnq);
  }
  
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    float f = 0.0625F;
    return bSp.Dne().Dne((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), (paramInt2 + 1), ((paramInt3 + 1) - f));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    paramsMa.Dne(zBn.DyG, 1);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return true;
  }
  
  public int Dne() {
    return 13;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    float f = 0.0625F;
    return bSp.Dne().Dne((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), ((paramInt2 + 1) - f), ((paramInt3 + 1) - f));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3)) {
      byte b;
      for (b = 1; paramQnq.Dne(paramInt1, paramInt2 - b, paramInt3) == this.FWm; b++);
      if (b < 3) {
        int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
        if (i == 15) {
          paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, 0, 4);
          Dne(paramQnq, paramInt1, paramInt2 + 1, paramInt3, this.FWm);
        } else {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, i + 1, 4);
        } 
      } 
    } 
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("cactus_side");
    this.Dne = paramRbp.Dne("cactus_top");
    this.FWm = paramRbp.Dne("cactus_bottom");
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!a_(paramQnq, paramInt1, paramInt2, paramInt3))
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, true); 
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\OMu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */