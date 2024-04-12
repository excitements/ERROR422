import java.util.Random;

public class ghu extends gwq {
  private final int bzF;
  
  private final int FWm;
  
  private final int Dne;
  
  private final boolean Dne;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramRandom.nextInt(3) + this.Dne;
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
              if (n != 0 && n != ((VOy)zKP.Dne).FWm && n != ((ZQN)zKP.Dne).FWm && n != zKP.FWm.FWm && n != zKP.udO.FWm)
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
        byte b1 = 3;
        byte b2 = 0;
        int k;
        for (k = paramInt2 - b1 + i; k <= paramInt2 + i; k++) {
          int m = k - paramInt2 + i;
          int n = b2 + 1 - m / 2;
          for (int i1 = paramInt1 - n; i1 <= paramInt1 + n; i1++) {
            int i2 = i1 - paramInt1;
            for (int i3 = paramInt3 - n; i3 <= paramInt3 + n; i3++) {
              int i4 = i3 - paramInt3;
              if (Math.abs(i2) != n || Math.abs(i4) != n || (paramRandom.nextInt(2) != 0 && m != 0)) {
                int i5 = paramQnq.Dne(i1, k, i3);
                if (i5 == 0 || i5 == ((VOy)zKP.Dne).FWm)
                  Dne(paramQnq, i1, k, i3, ((VOy)zKP.Dne).FWm, this.bzF); 
              } 
            } 
          } 
        } 
        for (k = 0; k < i; k++) {
          int m = paramQnq.Dne(paramInt1, paramInt2 + k, paramInt3);
          if (m == 0 || m == ((VOy)zKP.Dne).FWm) {
            Dne(paramQnq, paramInt1, paramInt2 + k, paramInt3, zKP.udO.FWm, this.FWm);
            if (this.Dne && k > 0) {
              if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 - 1, paramInt2 + k, paramInt3))
                Dne(paramQnq, paramInt1 - 1, paramInt2 + k, paramInt3, zKP.ipf.FWm, 8); 
              if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 + 1, paramInt2 + k, paramInt3))
                Dne(paramQnq, paramInt1 + 1, paramInt2 + k, paramInt3, zKP.ipf.FWm, 2); 
              if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1, paramInt2 + k, paramInt3 - 1))
                Dne(paramQnq, paramInt1, paramInt2 + k, paramInt3 - 1, zKP.ipf.FWm, 1); 
              if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1, paramInt2 + k, paramInt3 + 1))
                Dne(paramQnq, paramInt1, paramInt2 + k, paramInt3 + 1, zKP.ipf.FWm, 4); 
            } 
          } 
        } 
        if (this.Dne) {
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
          if (paramRandom.nextInt(5) == 0 && i > 5)
            for (k = 0; k < 2; k++) {
              for (byte b = 0; b < 4; b++) {
                if (paramRandom.nextInt(4 - k) == 0) {
                  int m = paramRandom.nextInt(3);
                  Dne(paramQnq, paramInt1 + zxJ.Dne[zxJ.aFZ[b]], paramInt2 + i - 5 + k, paramInt3 + zxJ.FWm[zxJ.aFZ[b]], zKP.Woy.FWm, m << 2 | b);
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
  
  public ghu(boolean paramBoolean) {
    this(paramBoolean, 4, 0, 0, false);
  }
  
  private void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, zKP.ipf.FWm, paramInt4);
    for (byte b = 4;; b--) {
      if (paramQnq.Dne(paramInt1, --paramInt2, paramInt3) != 0 || b <= 0)
        return; 
      Dne(paramQnq, paramInt1, paramInt2, paramInt3, zKP.ipf.FWm, paramInt4);
    } 
  }
  
  public ghu(boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean2) {
    super(paramBoolean1);
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Dne = paramBoolean2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ghu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */