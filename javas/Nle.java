import java.util.Random;

public class Nle extends hvE {
  private boolean Dne;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (!Dne(paramQnq, paramCLK, 0))
      return false; 
    Dne(paramQnq, paramCLK, 1, 1, 1, 5, 1, 7, ((zKP)zKP.Qnq).FWm, 1, ((zKP)zKP.Qnq).FWm, 1, false);
    Dne(paramQnq, paramCLK, 1, 4, 2, 5, 4, 7, ((zKP)zKP.Qnq).FWm, 1, ((zKP)zKP.Qnq).FWm, 1, false);
    Dne(paramQnq, paramCLK, 2, 1, 0, 4, 1, 0, ((zKP)zKP.Qnq).FWm, 1, ((zKP)zKP.Qnq).FWm, 1, false);
    Dne(paramQnq, paramCLK, 2, 2, 2, 3, 3, 2, ((zKP)zKP.Qnq).FWm, 1, ((zKP)zKP.Qnq).FWm, 1, false);
    Dne(paramQnq, paramCLK, 1, 2, 3, 1, 3, 6, ((zKP)zKP.Qnq).FWm, 1, ((zKP)zKP.Qnq).FWm, 1, false);
    Dne(paramQnq, paramCLK, 5, 2, 3, 5, 3, 6, ((zKP)zKP.Qnq).FWm, 1, ((zKP)zKP.Qnq).FWm, 1, false);
    Dne(paramQnq, paramCLK, 2, 2, 7, 4, 3, 7, ((zKP)zKP.Qnq).FWm, 1, ((zKP)zKP.Qnq).FWm, 1, false);
    Dne(paramQnq, paramCLK, 1, 0, 2, 1, 3, 2, zKP.udO.FWm, zKP.udO.FWm, false);
    Dne(paramQnq, paramCLK, 5, 0, 2, 5, 3, 2, zKP.udO.FWm, zKP.udO.FWm, false);
    Dne(paramQnq, paramCLK, 1, 0, 7, 1, 3, 7, zKP.udO.FWm, zKP.udO.FWm, false);
    Dne(paramQnq, paramCLK, 5, 0, 7, 5, 3, 7, zKP.udO.FWm, zKP.udO.FWm, false);
    Dne(paramQnq, zKP.sly.FWm, 0, 2, 3, 2, paramCLK);
    Dne(paramQnq, zKP.sly.FWm, 0, 3, 3, 7, paramCLK);
    Dne(paramQnq, 0, 0, 1, 3, 4, paramCLK);
    Dne(paramQnq, 0, 0, 5, 3, 4, paramCLK);
    Dne(paramQnq, 0, 0, 5, 3, 5, paramCLK);
    Dne(paramQnq, zKP.dnY.FWm, 7, 1, 3, 5, paramCLK);
    Dne(paramQnq, zKP.mlD.FWm, 0, 3, 2, 6, paramCLK);
    Dne(paramQnq, ((BTA)zKP.Dne).FWm, 0, 4, 2, 6, paramCLK);
    Dne(paramQnq, zKP.sly.FWm, 0, 1, 2, 1, paramCLK);
    Dne(paramQnq, zKP.sly.FWm, 0, 5, 2, 1, paramCLK);
    int i = bzF(zKP.One.FWm, 3);
    int j = bzF(zKP.One.FWm, 1);
    int k = bzF(zKP.One.FWm, 0);
    int m = bzF(zKP.One.FWm, 2);
    Dne(paramQnq, paramCLK, 0, 4, 1, 6, 4, 1, zKP.CLK.FWm, i, zKP.CLK.FWm, i, false);
    Dne(paramQnq, paramCLK, 0, 4, 2, 0, 4, 7, zKP.CLK.FWm, k, zKP.CLK.FWm, k, false);
    Dne(paramQnq, paramCLK, 6, 4, 2, 6, 4, 7, zKP.CLK.FWm, j, zKP.CLK.FWm, j, false);
    Dne(paramQnq, paramCLK, 0, 4, 8, 6, 4, 8, zKP.CLK.FWm, m, zKP.CLK.FWm, m, false);
    int n;
    for (n = 2; n <= 7; n += 5) {
      for (byte b = 1; b <= 5; b += 4)
        FWm(paramQnq, zKP.udO.FWm, 0, b, -1, n, paramCLK); 
    } 
    if (!this.Dne) {
      n = Dne(2, 5);
      int i1 = Dne(2);
      int i2 = FWm(2, 5);
      if (paramCLK.Dne(n, i1, i2)) {
        this.Dne = true;
        bVr bVr = new bVr(paramQnq);
        bVr.FWm(n + 0.5D, i1, i2 + 0.5D, 0.0F, 0.0F);
        bVr.ICU();
        paramQnq.FWm(bVr);
      } 
    } 
    return true;
  }
  
  public Nle(Random paramRandom, int paramInt1, int paramInt2) {
    super(paramRandom, paramInt1, 64, paramInt2, 7, 5, 9);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Nle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */