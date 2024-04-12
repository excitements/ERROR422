import java.util.Random;

public class AgF extends OdI {
  private gwq Dne = new uzC(zKP.tIz.FWm, 8);
  
  public void Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    super.Dne(paramQnq, paramRandom, paramInt1, paramInt2);
    int i = 3 + paramRandom.nextInt(6);
    int j;
    for (j = 0; j < i; j++) {
      int k = paramInt1 + paramRandom.nextInt(16);
      int m = paramRandom.nextInt(28) + 4;
      int n = paramInt2 + paramRandom.nextInt(16);
      int i1 = paramQnq.Dne(k, m, n);
      if (i1 == zKP.Dne.FWm)
        paramQnq.FWm(k, m, n, zKP.ghu.FWm, 0, 2); 
    } 
    for (i = 0; i < 7; i++) {
      j = paramInt1 + paramRandom.nextInt(16);
      int k = paramRandom.nextInt(64);
      int m = paramInt2 + paramRandom.nextInt(16);
      this.Dne.Dne(paramQnq, paramRandom, j, k, m);
    } 
  }
  
  protected AgF(int paramInt) {
    super(paramInt);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AgF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */