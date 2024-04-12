import java.util.Random;

public class Woy extends gwq {
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, zKP.ipf.FWm, paramInt4);
    for (byte b = 4;; b--) {
      if (paramQnq.Dne(paramInt1, --paramInt2, paramInt3) != 0 || b <= 0)
        return; 
      Dne(paramQnq, paramInt1, paramInt2, paramInt3, zKP.ipf.FWm, paramInt4);
    } 
  }
  
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramRandom.nextInt(4) + 5;
    while (paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == KFd.div)
      paramInt2--; 
    boolean bool = true;
    if (paramInt2 >= 1 && paramInt2 + i + 1 <= 128) {
      int j;
      for (j = paramInt2; j <= paramInt2 + 1 + i; j++) {
        byte b = 1;
        if (j == paramInt2)
          b = 0; 
        if (j >= paramInt2 + 1 + i - 2)
          b = 3; 
        for (int k = paramInt1 - b; k <= paramInt1 + b && bool; k++) {
          for (int m = paramInt3 - b; m <= paramInt3 + b && bool; m++) {
            if (j >= 0 && j < 128) {
              int n = paramQnq.Dne(k, j, m);
              if (n != 0 && n != ((VOy)zKP.Dne).FWm)
                if (n != ((zKP)zKP.DyG).FWm && n != ((byt)zKP.Dne).FWm) {
                  bool = false;
                } else if (j > paramInt2) {
                  bool = false;
                }  
            } else {
              bool = false;
            } 
          } 
        } 
      } 
      if (!bool)
        return false; 
      j = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
      if ((j == ((ZQN)zKP.Dne).FWm || j == zKP.FWm.FWm) && paramInt2 < 128 - i - 1) {
        Dne(paramQnq, paramInt1, paramInt2 - 1, paramInt3, zKP.FWm.FWm);
        int k;
        for (k = paramInt2 - 3 + i; k <= paramInt2 + i; k++) {
          int m = k - paramInt2 + i;
          int n = 2 - m / 2;
          for (int i1 = paramInt1 - n; i1 <= paramInt1 + n; i1++) {
            int i2 = i1 - paramInt1;
            for (int i3 = paramInt3 - n; i3 <= paramInt3 + n; i3++) {
              int i4 = i3 - paramInt3;
              if ((Math.abs(i2) != n || Math.abs(i4) != n || (paramRandom.nextInt(2) != 0 && m != 0)) && zKP.FWm[paramQnq.Dne(i1, k, i3)] == null)
                Dne(paramQnq, i1, k, i3, ((VOy)zKP.Dne).FWm); 
            } 
          } 
        } 
        for (k = 0; k < i; k++) {
          int m = paramQnq.Dne(paramInt1, paramInt2 + k, paramInt3);
          if (m == 0 || m == ((VOy)zKP.Dne).FWm || m == ((byt)zKP.Dne).FWm || m == ((zKP)zKP.DyG).FWm)
            Dne(paramQnq, paramInt1, paramInt2 + k, paramInt3, zKP.udO.FWm); 
        } 
        for (k = paramInt2 - 3 + i; k <= paramInt2 + i; k++) {
          int m = k - paramInt2 + i;
          int n = 2 - m / 2;
          for (int i1 = paramInt1 - n; i1 <= paramInt1 + n; i1++) {
            for (int i2 = paramInt3 - n; i2 <= paramInt3 + n; i2++) {
              if (paramQnq.Dne(i1, k, i2) == ((VOy)zKP.Dne).FWm) {
                if (paramRandom.nextInt(4) == 0 && paramQnq.Dne(i1 - 1, k, i2) == 0)
                  FWm(paramQnq, i1 - 1, k, i2, 8); 
                if (paramRandom.nextInt(4) == 0 && paramQnq.Dne(i1 + 1, k, i2) == 0)
                  FWm(paramQnq, i1 + 1, k, i2, 2); 
                if (paramRandom.nextInt(4) == 0 && paramQnq.Dne(i1, k, i2 - 1) == 0)
                  FWm(paramQnq, i1, k, i2 - 1, 1); 
                if (paramRandom.nextInt(4) == 0 && paramQnq.Dne(i1, k, i2 + 1) == 0)
                  FWm(paramQnq, i1, k, i2 + 1, 4); 
              } 
            } 
          } 
        } 
        return true;
      } 
      return false;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Woy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */