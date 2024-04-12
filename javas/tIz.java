import java.util.Random;

public class tIz extends gwq {
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramRandom.nextInt(3) + 5;
    boolean bool = true;
    if (paramInt2 >= 1 && paramInt2 + i + 1 <= 256) {
      int j;
      for (j = paramInt2; j <= paramInt2 + 1 + i; j++) {
        byte b = 1;
        if (j == paramInt2)
          b = 0; 
        if (j >= paramInt2 + 1 + i - 2)
          b = 2; 
        for (int k = paramInt1 - b; k <= paramInt1 + b && bool; k++) {
          for (int m = paramInt3 - b; m <= paramInt3 + b && bool; m++) {
            if (j >= 0 && j < 256) {
              int n = paramQnq.Dne(k, j, m);
              if (n != 0 && n != ((VOy)zKP.Dne).FWm)
                bool = false; 
            } else {
              bool = false;
            } 
          } 
        } 
      } 
      if (!bool)
        return false; 
      j = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
      if ((j == ((ZQN)zKP.Dne).FWm || j == zKP.FWm.FWm) && paramInt2 < 256 - i - 1) {
        Dne(paramQnq, paramInt1, paramInt2 - 1, paramInt3, zKP.FWm.FWm);
        int k;
        for (k = paramInt2 - 3 + i; k <= paramInt2 + i; k++) {
          int m = k - paramInt2 + i;
          int n = 1 - m / 2;
          for (int i1 = paramInt1 - n; i1 <= paramInt1 + n; i1++) {
            int i2 = i1 - paramInt1;
            for (int i3 = paramInt3 - n; i3 <= paramInt3 + n; i3++) {
              int i4 = i3 - paramInt3;
              if (Math.abs(i2) != n || Math.abs(i4) != n || (paramRandom.nextInt(2) != 0 && m != 0)) {
                int i5 = paramQnq.Dne(i1, k, i3);
                if (i5 == 0 || i5 == ((VOy)zKP.Dne).FWm)
                  Dne(paramQnq, i1, k, i3, ((VOy)zKP.Dne).FWm, 2); 
              } 
            } 
          } 
        } 
        for (k = 0; k < i; k++) {
          int m = paramQnq.Dne(paramInt1, paramInt2 + k, paramInt3);
          if (m == 0 || m == ((VOy)zKP.Dne).FWm)
            Dne(paramQnq, paramInt1, paramInt2 + k, paramInt3, zKP.udO.FWm, 2); 
        } 
        return true;
      } 
      return false;
    } 
    return false;
  }
  
  public tIz(boolean paramBoolean) {
    super(paramBoolean);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tIz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */