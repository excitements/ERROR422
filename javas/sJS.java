import java.util.Random;

public class sJS extends gwq {
  private int Dne;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) && paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == this.Dne) {
      int i = paramRandom.nextInt(32) + 6;
      int j = paramRandom.nextInt(4) + 1;
      int k;
      for (k = paramInt1 - j; k <= paramInt1 + j; k++) {
        for (int m = paramInt3 - j; m <= paramInt3 + j; m++) {
          int n = k - paramInt1;
          int i1 = m - paramInt3;
          if (n * n + i1 * i1 <= j * j + 1 && paramQnq.Dne(k, paramInt2 - 1, m) != this.Dne)
            return false; 
        } 
      } 
      for (k = paramInt2; k < paramInt2 + i && k < 128; k++) {
        for (int m = paramInt1 - j; m <= paramInt1 + j; m++) {
          for (int n = paramInt3 - j; n <= paramInt3 + j; n++) {
            int i1 = m - paramInt1;
            int i2 = n - paramInt3;
            if (i1 * i1 + i2 * i2 <= j * j + 1)
              paramQnq.FWm(m, k, n, zKP.cot.FWm, 0, 2); 
          } 
        } 
      } 
      Ndk ndk = new Ndk(paramQnq);
      ndk.FWm((paramInt1 + 0.5F), (paramInt2 + i), (paramInt3 + 0.5F), paramRandom.nextFloat() * 360.0F, 0.0F);
      paramQnq.FWm(ndk);
      paramQnq.FWm(paramInt1, paramInt2 + i, paramInt3, zKP.zGp.FWm, 0, 2);
      return true;
    } 
    return false;
  }
  
  public sJS(int paramInt) {
    this.Dne = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\sJS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */