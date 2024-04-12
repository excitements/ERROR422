import java.util.Random;

public class iXU extends gwq {
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < 10; b++) {
      int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      int j = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      if (paramQnq.Dne(i, j, k)) {
        int m = 1 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
        for (byte b1 = 0; b1 < m; b1++) {
          if (zKP.XjO.a_(paramQnq, i, j + b1, k))
            paramQnq.FWm(i, j + b1, k, zKP.XjO.FWm, 0, 2); 
        } 
      } 
    } 
    return true;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iXU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */