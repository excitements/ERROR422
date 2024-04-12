import java.util.Random;

public class gCn extends hbe {
  private final String Dne;
  
  protected boolean Dne(int paramInt) {
    return zKP.FWm[paramInt];
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramRandom.nextInt(25) == 0) {
      byte b1 = 4;
      byte b2 = 5;
      int i;
      for (i = paramInt1 - b1; i <= paramInt1 + b1; i++) {
        for (int m = paramInt3 - b1; m <= paramInt3 + b1; m++) {
          for (int n = paramInt2 - 1; n <= paramInt2 + 1; n++) {
            if (paramQnq.Dne(i, n, m) == this.FWm && --b2 <= 0)
              return; 
          } 
        } 
      } 
      i = paramInt1 + paramRandom.nextInt(3) - 1;
      int j = paramInt2 + paramRandom.nextInt(2) - paramRandom.nextInt(2);
      int k = paramInt3 + paramRandom.nextInt(3) - 1;
      for (byte b3 = 0; b3 < 4; b3++) {
        if (paramQnq.Dne(i, j, k) && a_(paramQnq, i, j, k)) {
          paramInt1 = i;
          paramInt2 = j;
          paramInt3 = k;
        } 
        i = paramInt1 + paramRandom.nextInt(3) - 1;
        j = paramInt2 + paramRandom.nextInt(2) - paramRandom.nextInt(2);
        k = paramInt3 + paramRandom.nextInt(3) - 1;
      } 
      if (paramQnq.Dne(i, j, k) && a_(paramQnq, i, j, k))
        paramQnq.FWm(i, j, k, this.FWm); 
    } 
  }
  
  protected gCn(int paramInt, String paramString) {
    super(paramInt);
    this.Dne = paramString;
    float f = 0.2F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    Dne(true);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (super.Dne(paramQnq, paramInt1, paramInt2, paramInt3) && a_(paramQnq, paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne(this.Dne);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    yIR yIR = null;
    if (this.FWm == zKP.bzF.FWm) {
      yIR = new yIR(0);
    } else if (this.FWm == ((hbe)zKP.Qnq).FWm) {
      yIR = new yIR(1);
    } 
    if (yIR != null && yIR.Dne(paramQnq, paramRandom, paramInt1, paramInt2, paramInt3))
      return true; 
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, i, 3);
    return false;
  }
  
  public boolean a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 >= 0 && paramInt2 < 256) {
      int i = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
      return (i == ((UyU)zKP.Dne).FWm || (paramQnq.Qnq(paramInt1, paramInt2, paramInt3) < 13 && Dne(i)));
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gCn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */