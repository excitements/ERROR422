import java.util.Random;

public class xui extends gvx {
  public static final double[] Dne = new double[] { -0.0625D, 0.0625D, 0.1875D, 0.3125D };
  
  private static final int[] Dne = new int[] { 1, 2, 3, 4 };
  
  public boolean a_(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (Qnq(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4) > 0);
  }
  
  public int Dne() {
    return 15;
  }
  
  protected gvx Dne() {
    return (gvx)zKP.FWm;
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.Sdr.Qnq;
  }
  
  protected xui(int paramInt, boolean paramBoolean) {
    super(paramInt, paramBoolean);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    bzF(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.Sdr.Qnq;
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.Dne != null) {
      int k;
      int m;
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = Qnq(i);
      double d1 = (paramInt1 + 0.5F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
      double d2 = (paramInt2 + 0.4F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
      double d3 = (paramInt3 + 0.5F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
      double d4 = 0.0D;
      double d5 = 0.0D;
      if (paramRandom.nextInt(2) == 0) {
        switch (j) {
          case 0:
            d5 = -0.3125D;
            break;
          case 1:
            d4 = 0.3125D;
            break;
          case 2:
            d5 = 0.3125D;
            break;
          case 3:
            d4 = -0.3125D;
            break;
        } 
      } else {
        int n = (i & 0xC) >> 2;
        switch (j) {
          case 0:
            m = Dne[n];
            break;
          case 1:
            k = -Dne[n];
            break;
          case 2:
            m = -Dne[n];
            break;
          case 3:
            k = Dne[n];
            break;
        } 
      } 
      paramQnq.Dne("reddust", d1 + k, d2, d3 + m, 0.0D, 0.0D, 0.0D);
    } 
  }
  
  protected boolean bzF(int paramInt) {
    return Qnq(paramInt);
  }
  
  protected int d_(int paramInt) {
    return Dne[(paramInt & 0xC) >> 2] * 2;
  }
  
  protected gvx FWm() {
    return (gvx)zKP.Dne;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    int j = (i & 0xC) >> 2;
    j = j + 1 << 2 & 0xC;
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, j | i & 0x3, 3);
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */