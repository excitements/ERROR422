import java.util.Random;

public class XUv extends zKP {
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramZpi.bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne() {
    Dne(0);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.iNQ.Qnq;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
    return (i == 0) ? false : ((i == this.FWm && (paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3) & 0x7) == 7) ? true : ((i != ((VOy)zKP.Dne).FWm && !zKP.Dne[i].FWm()) ? false : paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3).bzF()));
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public void Dne(Qnq paramQnq, FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = dEr.iNQ.Qnq;
    int j = paramInt4 & 0x7;
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(i, j + 1, 0));
    paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    paramFiG.Dne(trP.Dne[this.FWm], 1);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.FWm(udO.FWm, paramInt1, paramInt2, paramInt3) > 11) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x7;
    float f = 0.125F;
    return bSp.Dne().Dne(paramInt1 + this.Dne, paramInt2 + this.FWm, paramInt3 + this.bzF, paramInt1 + this.Qnq, (paramInt2 + i * f), paramInt3 + this.zGp);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("snow");
  }
  
  static {
  
  }
  
  public boolean Dne() {
    return false;
  }
  
  protected XUv(int paramInt) {
    super(paramInt, KFd.OdI);
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    Dne(true);
    Dne(JcN.FWm);
    Dne(0);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 1) ? true : super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean FWm() {
    return false;
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (!Dne(paramQnq, paramInt1, paramInt2, paramInt3)) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      return false;
    } 
    return true;
  }
  
  protected void Dne(int paramInt) {
    int i = paramInt & 0x7;
    float f = (2 * (1 + i)) / 16.0F;
    Dne(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XUv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */