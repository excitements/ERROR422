import java.util.Random;

public class yaZ extends gwq {
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramRandom.nextInt(4) + 6;
    int j = 1 + paramRandom.nextInt(2);
    int k = i - j;
    int m = 2 + paramRandom.nextInt(2);
    boolean bool = true;
    if (paramInt2 >= 1 && paramInt2 + i + 1 <= 256) {
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
            if (n >= 0 && n < 256) {
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
      if ((n == ((ZQN)zKP.Dne).FWm || n == zKP.FWm.FWm) && paramInt2 < 256 - i - 1) {
        Dne(paramQnq, paramInt1, paramInt2 - 1, paramInt3, zKP.FWm.FWm);
        int i3 = paramRandom.nextInt(2);
        int i1 = 1;
        boolean bool1 = false;
        int i2;
        for (i2 = 0; i2 <= k; i2++) {
          int i4 = paramInt2 + i - i2;
          for (int i5 = paramInt1 - i3; i5 <= paramInt1 + i3; i5++) {
            int i6 = i5 - paramInt1;
            for (int i7 = paramInt3 - i3; i7 <= paramInt3 + i3; i7++) {
              int i8 = i7 - paramInt3;
              if ((Math.abs(i6) != i3 || Math.abs(i8) != i3 || i3 <= 0) && zKP.FWm[paramQnq.Dne(i5, i4, i7)] == null)
                Dne(paramQnq, i5, i4, i7, ((VOy)zKP.Dne).FWm, 1); 
            } 
          } 
          if (i3 >= i1) {
            i3 = bool1;
            bool1 = true;
            if (++i1 > m)
              i1 = m; 
          } else {
            i3++;
          } 
        } 
        i2 = paramRandom.nextInt(3);
        for (byte b = 0; b < i - i2; b++) {
          int i4 = paramQnq.Dne(paramInt1, paramInt2 + b, paramInt3);
          if (i4 == 0 || i4 == ((VOy)zKP.Dne).FWm)
            Dne(paramQnq, paramInt1, paramInt2 + b, paramInt3, zKP.udO.FWm, 1); 
        } 
        return true;
      } 
      return false;
    } 
    return false;
  }
  
  static {
  
  }
  
  public yaZ(boolean paramBoolean) {
    super(paramBoolean);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yaZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */