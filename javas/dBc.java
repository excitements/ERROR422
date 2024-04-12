import java.util.Random;

public class dBc extends gwq {
  private int Dne;
  
  private int FWm;
  
  public dBc(int paramInt1, int paramInt2) {
    this.Dne = paramInt2;
    this.FWm = paramInt1;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) != KFd.div)
      return false; 
    int i = paramRandom.nextInt(this.FWm - 2) + 2;
    byte b = 2;
    for (int j = paramInt1 - i; j <= paramInt1 + i; j++) {
      for (int k = paramInt3 - i; k <= paramInt3 + i; k++) {
        int m = j - paramInt1;
        int n = k - paramInt3;
        if (m * m + n * n <= i * i)
          for (int i1 = paramInt2 - b; i1 <= paramInt2 + b; i1++) {
            int i2 = paramQnq.Dne(j, i1, k);
            if (i2 == zKP.FWm.FWm || i2 == ((ZQN)zKP.Dne).FWm)
              paramQnq.FWm(j, i1, k, this.Dne, 0, 2); 
          }  
      } 
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dBc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */