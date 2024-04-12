import java.util.Random;

public class KkE extends gwq {
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramRandom.nextInt(5) + 7;
    int j = i - paramRandom.nextInt(2) - 3;
    int k = i - j;
    int m = 1 + paramRandom.nextInt(k + 1);
    boolean bool = true;
    if (paramInt2 >= 1 && paramInt2 + i + 1 <= 128) {
      int n;
      for (n = paramInt2; n <= paramInt2 + 1 + i && bool; n++) {
        int i2;
        boolean bool1 = true;
        if (n - paramInt2 < j) {
          i2 = 0;
        } else {
          i2 = m;
        } 
        for (int i1 = paramInt1 - i2; i1 <= paramInt1 + i2 && bool; i1++) {
          for (int i3 = paramInt3 - i2; i3 <= paramInt3 + i2 && bool; i3++) {
            if (n >= 0 && n < 128) {
              int i4 = paramQnq.Dne(i1, n, i3);
              if (i4 != 0 && i4 != ((VOy)zKP.Dne).FWm)
                bool = false; 
            } else {
              bool = false;
            } 
          } 
        } 
      } 
      if (!bool)
        return false; 
      n = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
      if ((n == ((ZQN)zKP.Dne).FWm || n == zKP.FWm.FWm) && paramInt2 < 128 - i - 1) {
        Dne(paramQnq, paramInt1, paramInt2 - 1, paramInt3, zKP.FWm.FWm);
        byte b = 0;
        int i1;
        for (i1 = paramInt2 + i; i1 >= paramInt2 + j; i1--) {
          for (int i2 = paramInt1 - b; i2 <= paramInt1 + b; i2++) {
            int i3 = i2 - paramInt1;
            for (int i4 = paramInt3 - b; i4 <= paramInt3 + b; i4++) {
              int i5 = i4 - paramInt3;
              if ((Math.abs(i3) != b || Math.abs(i5) != b || b <= 0) && zKP.FWm[paramQnq.Dne(i2, i1, i4)] == null)
                Dne(paramQnq, i2, i1, i4, ((VOy)zKP.Dne).FWm, 1); 
            } 
          } 
          if (b >= 1 && i1 == paramInt2 + j + 1) {
            b--;
          } else if (b < m) {
            b++;
          } 
        } 
        for (i1 = 0; i1 < i - 1; i1++) {
          int i2 = paramQnq.Dne(paramInt1, paramInt2 + i1, paramInt3);
          if (i2 == 0 || i2 == ((VOy)zKP.Dne).FWm)
            Dne(paramQnq, paramInt1, paramInt2 + i1, paramInt3, zKP.udO.FWm, 1); 
        } 
        return true;
      } 
      return false;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KkE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */