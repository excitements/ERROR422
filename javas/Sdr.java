import java.util.Random;

public class Sdr extends gwq {
  private int Dne;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    byte b = 0;
    int i;
    while (((i = paramQnq.Dne(paramInt1, paramInt2, paramInt3)) == 0 || i == ((VOy)zKP.Dne).FWm) && paramInt2 > 0)
      paramInt2--; 
    for (b = 0; b < 4; b++) {
      int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      if (paramQnq.Dne(j, k, m) && zKP.Dne[this.Dne].a_(paramQnq, j, k, m))
        paramQnq.FWm(j, k, m, this.Dne, 0, 2); 
    } 
    return true;
  }
  
  public Sdr(int paramInt) {
    this.Dne = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Sdr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */