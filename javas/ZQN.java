import java.util.Random;

public class ZQN extends zKP {
  private gDn FWm;
  
  private gDn bzF;
  
  private gDn Dne;
  
  public int b_() {
    double d1 = 0.5D;
    double d2 = 1.0D;
    return bzF.Dne(d1, d2);
  }
  
  public gDn Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 == 1)
      return this.Dne; 
    if (paramInt4 == 0)
      return zKP.FWm.FWm(paramInt4); 
    KFd kFd = paramZpi.Dne(paramInt1, paramInt2 + 1, paramInt3);
    return (kFd != KFd.OdI && kFd != KFd.oIf) ? this.Qnq : this.FWm;
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
            paramQnq.FWm(i, j, k, ((ZQN)zKP.Dne).FWm); 
        } 
      }  
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("grass_side");
    this.Dne = paramRbp.Dne("grass_top");
    this.FWm = paramRbp.Dne("snow_side");
    this.bzF = paramRbp.Dne("grass_side_overlay");
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 == 1) ? this.Dne : ((paramInt1 == 0) ? zKP.FWm.FWm(paramInt1) : this.Qnq);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    int j = 0;
    int k = 0;
    for (byte b = -1; b <= 1; b++) {
      for (byte b1 = -1; b1 <= 1; b1++) {
        int m = paramZpi.Dne(paramInt1 + b1, paramInt3 + b).bzF();
        i += (m & 0xFF0000) >> 16;
        j += (m & 0xFF00) >> 8;
        k += m & 0xFF;
      } 
    } 
    return (i / 9 & 0xFF) << 16 | (j / 9 & 0xFF) << 8 | k / 9 & 0xFF;
  }
  
  protected ZQN(int paramInt) {
    super(paramInt, KFd.FWm);
    Dne(true);
    Dne(JcN.Dne);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.FWm.Dne(0, paramRandom, paramInt2);
  }
  
  public int FWm(int paramInt) {
    return b_();
  }
  
  public static gDn Dne() {
    return ((ZQN)zKP.Dne).bzF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZQN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */