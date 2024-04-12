import java.util.Random;

public class EYV extends gwq {
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < 20; b++) {
      int i = paramInt1 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      int j = paramInt2;
      int k = paramInt3 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      if (paramQnq.Dne(i, paramInt2, k) && (paramQnq.Dne(i - 1, paramInt2 - 1, k) == KFd.div || paramQnq.Dne(i + 1, paramInt2 - 1, k) == KFd.div || paramQnq.Dne(i, paramInt2 - 1, k - 1) == KFd.div || paramQnq.Dne(i, paramInt2 - 1, k + 1) == KFd.div)) {
        int m = 2 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
        for (byte b1 = 0; b1 < m; b1++) {
          if (zKP.TKg.a_(paramQnq, i, j + b1, k))
            paramQnq.FWm(i, j + b1, k, zKP.TKg.FWm, 0, 2); 
        } 
      } 
    } 
    return true;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EYV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */