import java.util.Random;

public class ICU extends gwq {
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < 10; b++) {
      int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      int j = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      if (paramQnq.Dne(i, j, k) && zKP.gvF.Dne(paramQnq, i, j, k))
        paramQnq.FWm(i, j, k, zKP.gvF.FWm, 0, 2); 
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ICU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */