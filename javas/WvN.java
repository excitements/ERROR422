import java.util.Random;

public class WvN extends gwq {
  private final int Dne;
  
  private final fKu[] Dne;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    byte b = 0;
    int i;
    while (((i = paramQnq.Dne(paramInt1, paramInt2, paramInt3)) == 0 || i == ((VOy)zKP.Dne).FWm) && paramInt2 > 1)
      paramInt2--; 
    if (paramInt2 < 1)
      return false; 
    paramInt2++;
    for (b = 0; b < 4; b++) {
      int j = paramInt1 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      int k = paramInt2 + paramRandom.nextInt(3) - paramRandom.nextInt(3);
      int m = paramInt3 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
      if (paramQnq.Dne(j, k, m) && paramQnq.IjH(j, k - 1, m)) {
        paramQnq.FWm(j, k, m, ((gHK)zKP.Dne).FWm, 0, 2);
        GON gON = (GON)paramQnq.Dne(j, k, m);
        if (gON != null && gON != null)
          fKu.Dne(paramRandom, this.Dne, gON, this.Dne); 
        if (paramQnq.Dne(j - 1, k, m) && paramQnq.IjH(j - 1, k - 1, m))
          paramQnq.FWm(j - 1, k, m, zKP.Wwe.FWm, 0, 2); 
        if (paramQnq.Dne(j + 1, k, m) && paramQnq.IjH(j - 1, k - 1, m))
          paramQnq.FWm(j + 1, k, m, zKP.Wwe.FWm, 0, 2); 
        if (paramQnq.Dne(j, k, m - 1) && paramQnq.IjH(j - 1, k - 1, m))
          paramQnq.FWm(j, k, m - 1, zKP.Wwe.FWm, 0, 2); 
        if (paramQnq.Dne(j, k, m + 1) && paramQnq.IjH(j - 1, k - 1, m))
          paramQnq.FWm(j, k, m + 1, zKP.Wwe.FWm, 0, 2); 
        return true;
      } 
    } 
    return false;
  }
  
  public WvN(fKu[] paramArrayOffKu, int paramInt) {
    this.Dne = paramArrayOffKu;
    this.Dne = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WvN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */