import java.util.Random;

public class tVs extends zKP {
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return 0;
  }
  
  static {
  
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
  }
  
  public boolean Dne() {
    return false;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return true;
  }
  
  public tVs(int paramInt) {
    super(paramInt, KFd.gnI);
    Dne(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
  }
  
  public int Dne() {
    return 27;
  }
  
  private void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm)
      for (byte b = 0; b < 'Ϩ'; b++) {
        int i = paramInt1 + paramQnq.Dne.nextInt(16) - paramQnq.Dne.nextInt(16);
        int j = paramInt2 + paramQnq.Dne.nextInt(8) - paramQnq.Dne.nextInt(8);
        int k = paramInt3 + paramQnq.Dne.nextInt(16) - paramQnq.Dne.nextInt(16);
        if (paramQnq.Dne(i, j, k) == 0) {
          if (paramQnq.aFZ == null) {
            paramQnq.FWm(i, j, k, this.FWm, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 2);
            paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
          } else {
            char c = '';
            for (byte b1 = 0; b1 < c; b1++) {
              double d1 = paramQnq.Dne.nextDouble();
              float f1 = (paramQnq.Dne.nextFloat() - 0.5F) * 0.2F;
              float f2 = (paramQnq.Dne.nextFloat() - 0.5F) * 0.2F;
              float f3 = (paramQnq.Dne.nextFloat() - 0.5F) * 0.2F;
              double d2 = i + (paramInt1 - i) * d1 + (paramQnq.Dne.nextDouble() - 0.5D) * 1.0D + 0.5D;
              double d3 = j + (paramInt2 - j) * d1 + paramQnq.Dne.nextDouble() * 1.0D - 0.5D;
              double d4 = k + (paramInt3 - k) * d1 + (paramQnq.Dne.nextDouble() - 0.5D) * 1.0D + 0.5D;
              paramQnq.Dne("portal", d2, d3, d4, f1, f2, f3);
            } 
          } 
          return;
        } 
      }  
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (ZgW.bzF(paramQnq, paramInt1, paramInt2 - 1, paramInt3) && paramInt2 >= 0) {
      byte b = 32;
      if (!ZgW.Dne && paramQnq.Dne(paramInt1 - b, paramInt2 - b, paramInt3 - b, paramInt1 + b, paramInt2 + b, paramInt3 + b)) {
        CiF ciF = new CiF(paramQnq, (paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), this.FWm);
        paramQnq.FWm(ciF);
      } else {
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
        while (ZgW.bzF(paramQnq, paramInt1, paramInt2 - 1, paramInt3) && paramInt2 > 0)
          paramInt2--; 
        if (paramInt2 > 0)
          paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, 0, 2); 
      } 
    } 
  }
  
  public int Dne(Qnq paramQnq) {
    return 5;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tVs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */