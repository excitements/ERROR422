import java.util.Random;

public class mzX extends gwq {
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    if (!paramQnq.Dne(paramInt1, paramInt2, paramInt3))
      return false; 
    if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) != zKP.KLR.FWm)
      return false; 
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.fYA.FWm, 0, 2);
    for (byte b = 0; b < 'ל'; b++) {
      int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      int j = paramInt2 - paramRandom.nextInt(12);
      int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      if (paramQnq.Dne(i, j, k) == 0) {
        byte b1 = 0;
        for (byte b2 = 0; b2 < 6; b2++) {
          int m = 0;
          if (b2 == 0)
            m = paramQnq.Dne(i - 1, j, k); 
          if (b2 == 1)
            m = paramQnq.Dne(i + 1, j, k); 
          if (b2 == 2)
            m = paramQnq.Dne(i, j - 1, k); 
          if (b2 == 3)
            m = paramQnq.Dne(i, j + 1, k); 
          if (b2 == 4)
            m = paramQnq.Dne(i, j, k - 1); 
          if (b2 == 5)
            m = paramQnq.Dne(i, j, k + 1); 
          if (m == zKP.fYA.FWm)
            b1++; 
        } 
        if (b1 == 1)
          paramQnq.FWm(i, j, k, zKP.fYA.FWm, 0, 2); 
      } 
    } 
    return true;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mzX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */