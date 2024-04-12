import java.util.Random;

public class KNm extends byt {
  static {
  
  }
  
  private void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm - 1, i, 2);
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm - 1, Dne(paramQnq));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.Dne == KFd.IjH) {
      int i = paramRandom.nextInt(3);
      int j;
      for (j = 0; j < i; j++) {
        paramInt1 += paramRandom.nextInt(3) - 1;
        paramInt2++;
        paramInt3 += paramRandom.nextInt(3) - 1;
        int k = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
        if (k == 0) {
          if (bzF(paramQnq, paramInt1 - 1, paramInt2, paramInt3) || bzF(paramQnq, paramInt1 + 1, paramInt2, paramInt3) || bzF(paramQnq, paramInt1, paramInt2, paramInt3 - 1) || bzF(paramQnq, paramInt1, paramInt2, paramInt3 + 1) || bzF(paramQnq, paramInt1, paramInt2 - 1, paramInt3) || bzF(paramQnq, paramInt1, paramInt2 + 1, paramInt3)) {
            paramQnq.FWm(paramInt1, paramInt2, paramInt3, ((iqp)zKP.Dne).FWm);
            return;
          } 
        } else if ((zKP.Dne[k]).Dne.bzF()) {
          return;
        } 
      } 
      if (i == 0) {
        j = paramInt1;
        int k = paramInt3;
        for (byte b = 0; b < 3; b++) {
          paramInt1 = j + paramRandom.nextInt(3) - 1;
          paramInt3 = k + paramRandom.nextInt(3) - 1;
          if (paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3) && bzF(paramQnq, paramInt1, paramInt2, paramInt3))
            paramQnq.FWm(paramInt1, paramInt2 + 1, paramInt3, ((iqp)zKP.Dne).FWm); 
        } 
      } 
    } 
  }
  
  private boolean bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.Dne(paramInt1, paramInt2, paramInt3).aFZ();
  }
  
  protected KNm(int paramInt, KFd paramKFd) {
    super(paramInt, paramKFd);
    Dne(false);
    if (paramKFd == KFd.IjH)
      Dne(true); 
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return (this.Dne != KFd.IjH);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm)
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KNm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */