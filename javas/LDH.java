import java.util.Random;

public class LDH extends gwq {
  private int Dne;
  
  public LDH(int paramInt) {
    this.Dne = paramInt;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < 64; b++) {
      int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      int j = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
      if (paramQnq.Dne(i, j, k) && (!((Jik)paramQnq.Dne).FWm || j < 127) && zKP.Dne[this.Dne].a_(paramQnq, i, j, k))
        paramQnq.FWm(i, j, k, this.Dne, 0, 2); 
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LDH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */