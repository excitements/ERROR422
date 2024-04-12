import java.util.Random;

public class UyU extends zKP {
  private gDn Dne;
  
  private gDn FWm;
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    super.FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
    if (paramRandom.nextInt(10) == 0)
      paramQnq.Dne("townaura", (paramInt1 + paramRandom.nextFloat()), (paramInt2 + 1.1F), (paramInt3 + paramRandom.nextFloat()), 0.0D, 0.0D, 0.0D); 
  }
  
  public gDn Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 == 1)
      return this.Dne; 
    if (paramInt4 == 0)
      return zKP.FWm.FWm(paramInt4); 
    KFd kFd = paramZpi.Dne(paramInt1, paramInt2 + 1, paramInt3);
    return (kFd != KFd.OdI && kFd != KFd.oIf) ? this.Qnq : this.FWm;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : ((paramInt1 == 0) ? zKP.FWm.FWm(paramInt1) : this.Qnq);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.FWm.Dne(0, paramRandom, paramInt2);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("mycel_side");
    this.Dne = paramRbp.Dne("mycel_top");
    this.FWm = paramRbp.Dne("snow_side");
  }
  
  protected UyU(int paramInt) {
    super(paramInt, KFd.FWm);
    Dne(true);
    Dne(JcN.Dne);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null)
      if (paramQnq.aFZ(paramInt1, paramInt2 + 1, paramInt3) < 4 && zKP.FWm[paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3)] > 2) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.FWm.FWm);
      } else if (paramQnq.aFZ(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
        for (byte b = 0; b < 4; b++) {
          int i = paramInt1 + paramRandom.nextInt(3) - 1;
          int j = paramInt2 + paramRandom.nextInt(5) - 3;
          int k = paramInt3 + paramRandom.nextInt(3) - 1;
          int m = paramQnq.Dne(i, j + 1, k);
          if (paramQnq.Dne(i, j, k) == zKP.FWm.FWm && paramQnq.aFZ(i, j + 1, k) >= 4 && zKP.FWm[m] <= 2)
            paramQnq.FWm(i, j, k, this.FWm); 
        } 
      }  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UyU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */