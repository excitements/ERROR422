import java.util.List;
import java.util.Random;

public class Tte extends hbe {
  private static final String[] Dne = new String[] { "deadbush", "tallgrass", "fern" };
  
  private gDn[] Dne;
  
  public gDn Dne(int paramInt1, int paramInt2) {
    if (paramInt2 >= this.Dne.length)
      paramInt2 = 0; 
    return this.Dne[paramInt2];
  }
  
  public int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.bzF(paramInt1, paramInt2, paramInt3);
  }
  
  public int FWm(int paramInt) {
    return (paramInt == 0) ? 16777215 : QFY.bzF();
  }
  
  public int Dne(int paramInt, Random paramRandom) {
    return 1 + paramRandom.nextInt(paramInt * 2 + 1);
  }
  
  public void Dne(Qnq paramQnq, FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null && paramFiG.bzF() != null && (paramFiG.bzF()).bzF == ((ZtP)dEr.Dne).Qnq) {
      paramFiG.Dne(trP.Dne[this.FWm], 1);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(zKP.Dne, 1, paramInt4));
    } else {
      super.Dne(paramQnq, paramFiG, paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return (paramRandom.nextInt(8) == 0) ? dEr.mlD.Qnq : -1;
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    for (byte b = 1; b < 3; b++)
      paramList.add(new NMq(paramInt, 1, b)); 
  }
  
  public int b_() {
    double d1 = 0.5D;
    double d2 = 1.0D;
    return bzF.Dne(d1, d2);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[Dne.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne((String)Dne[b]); 
  }
  
  protected Tte(int paramInt) {
    super(paramInt, KFd.Zpi);
    float f = 0.4F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    return (i == 0) ? 16777215 : paramZpi.Dne(paramInt1, paramInt3).bzF();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tte.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */