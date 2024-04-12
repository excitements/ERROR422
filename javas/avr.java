import java.util.Random;

public class avr extends zKP {
  private boolean Dne;
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, sMa paramsMa) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    super.FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramsMa);
  }
  
  public int Dne(Random paramRandom) {
    return 4 + paramRandom.nextInt(2);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
    if (Dne(paramInt4, (Random)paramQnq.Dne, paramInt5) != this.FWm) {
      int i = 1 + paramQnq.Dne.nextInt(5);
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3, i);
    } 
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
    if (this.FWm == zKP.JLG.FWm)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.exS.FWm); 
  }
  
  protected NMq Dne(int paramInt) {
    return new NMq(zKP.JLG);
  }
  
  public int Dne(int paramInt, Random paramRandom) {
    return Dne(paramRandom) + paramRandom.nextInt(paramInt + 1);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFiG, paramInt4, paramFloat1, paramFloat2, paramFloat3);
  }
  
  private void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    ZfC zfC = paramQnq.Dne;
    double d = 0.0625D;
    for (byte b = 0; b < 6; b++) {
      double d1 = (paramInt1 + zfC.nextFloat());
      double d2 = (paramInt2 + zfC.nextFloat());
      double d3 = (paramInt3 + zfC.nextFloat());
      if (b == 0 && !paramQnq.zGp(paramInt1, paramInt2 + 1, paramInt3))
        d2 = (paramInt2 + 1) + d; 
      if (b == 1 && !paramQnq.zGp(paramInt1, paramInt2 - 1, paramInt3))
        d2 = (paramInt2 + 0) - d; 
      if (b == 2 && !paramQnq.zGp(paramInt1, paramInt2, paramInt3 + 1))
        d3 = (paramInt3 + 1) + d; 
      if (b == 3 && !paramQnq.zGp(paramInt1, paramInt2, paramInt3 - 1))
        d3 = (paramInt3 + 0) - d; 
      if (b == 4 && !paramQnq.zGp(paramInt1 + 1, paramInt2, paramInt3))
        d1 = (paramInt1 + 1) + d; 
      if (b == 5 && !paramQnq.zGp(paramInt1 - 1, paramInt2, paramInt3))
        d1 = (paramInt1 + 0) - d; 
      if (d1 < paramInt1 || d1 > (paramInt1 + 1) || d2 < 0.0D || d2 > (paramInt2 + 1) || d3 < paramInt3 || d3 > (paramInt3 + 1))
        paramQnq.Dne("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D); 
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.FWm == zKP.exS.FWm)
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.JLG.FWm); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFiG);
  }
  
  public int Dne(Qnq paramQnq) {
    return 30;
  }
  
  public avr(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.aFZ);
    if (paramBoolean)
      Dne(true); 
    this.Dne = paramBoolean;
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.Dne)
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.exS.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\avr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */