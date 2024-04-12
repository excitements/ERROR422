import java.util.Random;

public class Rhm extends hbe {
  private static final String[] Dne = new String[] { "netherStalk_0", "netherStalk_1", "netherStalk_2" };
  
  private gDn[] Dne;
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt2 >= 3) ? this.Dne[2] : ((paramInt2 > 0) ? this.Dne[1] : this.Dne[0]);
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return true;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return 0;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    if (paramQnq.aFZ == null) {
      int i = 1;
      if (paramInt4 >= 3) {
        i = 2 + paramQnq.Dne.nextInt(3);
        if (paramInt5 > 0)
          i += paramQnq.Dne.nextInt(paramInt5 + 1); 
      } 
      for (byte b = 0; b < i; b++)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(dEr.KkE)); 
    } 
  }
  
  protected boolean Dne(int paramInt) {
    return true;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.KkE.Qnq;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (i < 3 && paramRandom.nextInt(10) == 0)
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, ++i, 2); 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[Dne.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne((String)Dne[b]); 
  }
  
  public int Dne() {
    return 6;
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  protected Rhm(int paramInt) {
    super(paramInt);
    Dne(true);
    float f = 0.5F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    Dne((JcN)null);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Rhm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */