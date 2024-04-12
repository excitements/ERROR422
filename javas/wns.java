import java.util.Random;

public class wns extends gwq {
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1;
    int j = paramInt3;
    while (paramInt2 < 128) {
      if (paramQnq.Dne(paramInt1, paramInt2, paramInt3)) {
        for (byte b = 2; b <= 5; b++) {
          if (zKP.ipf.Dne(paramQnq, paramInt1, paramInt2, paramInt3, b)) {
            paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.ipf.FWm, 1 << zxJ.Qnq[rrP.Dne[b]], 2);
            break;
          } 
        } 
      } else {
        paramInt1 = i + paramRandom.nextInt(4) - paramRandom.nextInt(4);
        paramInt3 = j + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      } 
      paramInt2++;
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */