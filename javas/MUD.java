import java.util.Random;

public class MUD extends gwq {
  private int Dne;
  
  private int FWm;
  
  public MUD(int paramInt1, int paramInt2) {
    this.FWm = paramInt1;
    this.Dne = paramInt2;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    int j = 0;
    int i;
    while (((i = paramQnq.Dne(paramInt1, paramInt2, paramInt3)) == 0 || i == ((VOy)zKP.Dne).FWm) && paramInt2 > 0)
      paramInt2--; 
    j = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (j == zKP.FWm.FWm || j == ((ZQN)zKP.Dne).FWm) {
      Dne(paramQnq, paramInt1, ++paramInt2, paramInt3, zKP.udO.FWm, this.FWm);
      for (int k = paramInt2; k <= paramInt2 + 2; k++) {
        int m = k - paramInt2;
        int n = 2 - m;
        for (int i1 = paramInt1 - n; i1 <= paramInt1 + n; i1++) {
          int i2 = i1 - paramInt1;
          for (int i3 = paramInt3 - n; i3 <= paramInt3 + n; i3++) {
            int i4 = i3 - paramInt3;
            if ((Math.abs(i2) != n || Math.abs(i4) != n || paramRandom.nextInt(2) != 0) && zKP.FWm[paramQnq.Dne(i1, k, i3)] == null)
              Dne(paramQnq, i1, k, i3, ((VOy)zKP.Dne).FWm, this.Dne); 
          } 
        } 
      } 
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MUD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */