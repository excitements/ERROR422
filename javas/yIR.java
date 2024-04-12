import java.util.Random;

public class yIR extends gwq {
  private int Dne = -1;
  
  public yIR() {
    super(false);
  }
  
  public yIR(int paramInt) {
    super(true);
    this.Dne = paramInt;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramRandom.nextInt(2);
    if (this.Dne >= 0)
      i = this.Dne; 
    int j = paramRandom.nextInt(3) + 4;
    boolean bool = true;
    if (paramInt2 >= 1 && paramInt2 + j + 1 < 256) {
      int k;
      for (k = paramInt2; k <= paramInt2 + 1 + j; k++) {
        byte b = 3;
        if (k <= paramInt2 + 3)
          b = 0; 
        for (int i1 = paramInt1 - b; i1 <= paramInt1 + b && bool; i1++) {
          for (int i2 = paramInt3 - b; i2 <= paramInt3 + b && bool; i2++) {
            if (k >= 0 && k < 256) {
              int i3 = paramQnq.Dne(i1, k, i2);
              if (i3 != 0 && i3 != ((VOy)zKP.Dne).FWm)
                bool = false; 
            } else {
              bool = false;
            } 
          } 
        } 
      } 
      if (!bool)
        return false; 
      k = paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3);
      if (k != zKP.FWm.FWm && k != ((ZQN)zKP.Dne).FWm && k != ((UyU)zKP.Dne).FWm)
        return false; 
      int n = paramInt2 + j;
      if (i == 1)
        n = paramInt2 + j - 3; 
      int m;
      for (m = n; m <= paramInt2 + j; m++) {
        byte b = 1;
        if (m < paramInt2 + j)
          b++; 
        if (i == 0)
          b = 3; 
        for (int i1 = paramInt1 - b; i1 <= paramInt1 + b; i1++) {
          for (int i2 = paramInt3 - b; i2 <= paramInt3 + b; i2++) {
            byte b1 = 5;
            if (i1 == paramInt1 - b)
              b1--; 
            if (i1 == paramInt1 + b)
              b1++; 
            if (i2 == paramInt3 - b)
              b1 -= 3; 
            if (i2 == paramInt3 + b)
              b1 += 3; 
            if (i == 0 || m < paramInt2 + j) {
              if ((i1 == paramInt1 - b || i1 == paramInt1 + b) && (i2 == paramInt3 - b || i2 == paramInt3 + b))
                continue; 
              if (i1 == paramInt1 - b - 1 && i2 == paramInt3 - b)
                b1 = 1; 
              if (i1 == paramInt1 - b && i2 == paramInt3 - b - 1)
                b1 = 1; 
              if (i1 == paramInt1 + b - 1 && i2 == paramInt3 - b)
                b1 = 3; 
              if (i1 == paramInt1 + b && i2 == paramInt3 - b - 1)
                b1 = 3; 
              if (i1 == paramInt1 - b - 1 && i2 == paramInt3 + b)
                b1 = 7; 
              if (i1 == paramInt1 - b && i2 == paramInt3 + b - 1)
                b1 = 7; 
              if (i1 == paramInt1 + b - 1 && i2 == paramInt3 + b)
                b1 = 9; 
              if (i1 == paramInt1 + b && i2 == paramInt3 + b - 1)
                b1 = 9; 
            } 
            if (b1 == 5 && m < paramInt2 + j)
              b1 = 0; 
            if ((b1 != 0 || paramInt2 >= paramInt2 + j - 1) && zKP.FWm[paramQnq.Dne(i1, m, i2)] == null)
              Dne(paramQnq, i1, m, i2, zKP.iXU.FWm + i, b1); 
            continue;
          } 
        } 
      } 
      for (m = 0; m < j; m++) {
        int i1 = paramQnq.Dne(paramInt1, paramInt2 + m, paramInt3);
        if (zKP.FWm[i1] == null)
          Dne(paramQnq, paramInt1, paramInt2 + m, paramInt3, zKP.iXU.FWm + i, 10); 
      } 
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yIR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */