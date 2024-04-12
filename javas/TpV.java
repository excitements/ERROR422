import java.util.Random;

public class TpV extends gwq {
  private final int bzF;
  
  private final int FWm;
  
  private final int Dne;
  
  public TpV(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3) {
    super(paramBoolean);
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
  
  private void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) {
    byte b = 2;
    for (int i = paramInt3 - b; i <= paramInt3; i++) {
      int j = i - paramInt3;
      int k = paramInt4 + 1 - j;
      for (int m = paramInt1 - k; m <= paramInt1 + k + 1; m++) {
        int n = m - paramInt1;
        for (int i1 = paramInt2 - k; i1 <= paramInt2 + k + 1; i1++) {
          int i2 = i1 - paramInt2;
          if ((n >= 0 || i2 >= 0 || n * n + i2 * i2 <= k * k) && ((n <= 0 && i2 <= 0) || n * n + i2 * i2 <= (k + 1) * (k + 1)) && (paramRandom.nextInt(4) != 0 || n * n + i2 * i2 <= (k - 1) * (k - 1))) {
            int i3 = paramQnq.Dne(m, i, i1);
            if (i3 == 0 || i3 == ((VOy)zKP.Dne).FWm)
              Dne(paramQnq, m, i, i1, ((VOy)zKP.Dne).FWm, this.bzF); 
          } 
        } 
      } 
    } 
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramRandom.nextInt(3) + this.Dne;
    boolean bool = true;
    if (paramInt2 >= 1 && paramInt2 + i + 1 <= 256) {
      int j;
      for (j = paramInt2; j <= paramInt2 + 1 + i; j++) {
        byte b = 2;
        if (j == paramInt2)
          b = 1; 
        if (j >= paramInt2 + 1 + i - 2)
          b = 2; 
        for (int k = paramInt1 - b; k <= paramInt1 + b && bool; k++) {
          for (int m = paramInt3 - b; m <= paramInt3 + b && bool; m++) {
            if (j >= 0 && j < 256) {
              int n = paramQnq.Dne(k, j, m);
              if (n != 0 && n != ((VOy)zKP.Dne).FWm && n != ((ZQN)zKP.Dne).FWm && n != zKP.FWm.FWm && n != zKP.udO.FWm && n != zKP.aFZ.FWm)
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
        paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3, zKP.FWm.FWm, 0, 2);
        paramQnq.FWm(paramInt1 + 1, paramInt2 - 1, paramInt3, zKP.FWm.FWm, 0, 2);
        paramQnq.FWm(paramInt1, paramInt2 - 1, paramInt3 + 1, zKP.FWm.FWm, 0, 2);
        paramQnq.FWm(paramInt1 + 1, paramInt2 - 1, paramInt3 + 1, zKP.FWm.FWm, 0, 2);
        Dne(paramQnq, paramInt1, paramInt3, paramInt2 + i, 2, paramRandom);
        int k;
        for (k = paramInt2 + i - 2 - paramRandom.nextInt(4); k > paramInt2 + i / 2; k -= 2 + paramRandom.nextInt(4)) {
          float f = paramRandom.nextFloat() * 3.1415927F * 2.0F;
          int m = paramInt1 + (int)(0.5F + geR.FWm(f) * 4.0F);
          int n = paramInt3 + (int)(0.5F + geR.Dne(f) * 4.0F);
          Dne(paramQnq, m, n, k, 0, paramRandom);
          for (byte b1 = 0; b1 < 5; b1++) {
            m = paramInt1 + (int)(1.5F + geR.FWm(f) * b1);
            n = paramInt3 + (int)(1.5F + geR.Dne(f) * b1);
            Dne(paramQnq, m, k - 3 + b1 / 2, n, zKP.udO.FWm, this.FWm);
          } 
        } 
        for (byte b = 0; b < i; b++) {
          int m = paramQnq.Dne(paramInt1, paramInt2 + b, paramInt3);
          if (m == 0 || m == ((VOy)zKP.Dne).FWm) {
            Dne(paramQnq, paramInt1, paramInt2 + b, paramInt3, zKP.udO.FWm, this.FWm);
            if (b > 0) {
              if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 - 1, paramInt2 + b, paramInt3))
                Dne(paramQnq, paramInt1 - 1, paramInt2 + b, paramInt3, zKP.ipf.FWm, 8); 
              if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1, paramInt2 + b, paramInt3 - 1))
                Dne(paramQnq, paramInt1, paramInt2 + b, paramInt3 - 1, zKP.ipf.FWm, 1); 
            } 
          } 
          if (b < i - 1) {
            m = paramQnq.Dne(paramInt1 + 1, paramInt2 + b, paramInt3);
            if (m == 0 || m == ((VOy)zKP.Dne).FWm) {
              Dne(paramQnq, paramInt1 + 1, paramInt2 + b, paramInt3, zKP.udO.FWm, this.FWm);
              if (b > 0) {
                if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 + 2, paramInt2 + b, paramInt3))
                  Dne(paramQnq, paramInt1 + 2, paramInt2 + b, paramInt3, zKP.ipf.FWm, 2); 
                if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 + 1, paramInt2 + b, paramInt3 - 1))
                  Dne(paramQnq, paramInt1 + 1, paramInt2 + b, paramInt3 - 1, zKP.ipf.FWm, 1); 
              } 
            } 
            m = paramQnq.Dne(paramInt1 + 1, paramInt2 + b, paramInt3 + 1);
            if (m == 0 || m == ((VOy)zKP.Dne).FWm) {
              Dne(paramQnq, paramInt1 + 1, paramInt2 + b, paramInt3 + 1, zKP.udO.FWm, this.FWm);
              if (b > 0) {
                if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 + 2, paramInt2 + b, paramInt3 + 1))
                  Dne(paramQnq, paramInt1 + 2, paramInt2 + b, paramInt3 + 1, zKP.ipf.FWm, 2); 
                if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 + 1, paramInt2 + b, paramInt3 + 2))
                  Dne(paramQnq, paramInt1 + 1, paramInt2 + b, paramInt3 + 2, zKP.ipf.FWm, 4); 
              } 
            } 
            m = paramQnq.Dne(paramInt1, paramInt2 + b, paramInt3 + 1);
            if (m == 0 || m == ((VOy)zKP.Dne).FWm) {
              Dne(paramQnq, paramInt1, paramInt2 + b, paramInt3 + 1, zKP.udO.FWm, this.FWm);
              if (b > 0) {
                if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1 - 1, paramInt2 + b, paramInt3 + 1))
                  Dne(paramQnq, paramInt1 - 1, paramInt2 + b, paramInt3 + 1, zKP.ipf.FWm, 8); 
                if (paramRandom.nextInt(3) > 0 && paramQnq.Dne(paramInt1, paramInt2 + b, paramInt3 + 2))
                  Dne(paramQnq, paramInt1, paramInt2 + b, paramInt3 + 2, zKP.ipf.FWm, 4); 
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


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TpV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */