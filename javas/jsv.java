import java.util.List;
import java.util.Random;

public class jsv extends iDn {
  public jsv(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public static jsv Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -8, -3, 0, 19, 10, 19, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new jsv(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  static {
  
  }
  
  protected jsv(Random paramRandom, int paramInt1, int paramInt2) {
    super(0);
    this.aFZ = paramRandom.nextInt(4);
    switch (this.aFZ) {
      case 0:
      case 2:
        this.Dne = new CLK(paramInt1, 64, paramInt2, paramInt1 + 19 - 1, 73, paramInt2 + 19 - 1);
        return;
    } 
    this.Dne = new CLK(paramInt1, 64, paramInt2, paramInt1 + 19 - 1, 73, paramInt2 + 19 - 1);
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Dne(paramQnq, paramCLK, 7, 3, 0, 11, 4, 18, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 3, 7, 18, 4, 11, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 8, 5, 0, 10, 7, 18, 0, 0, false);
    Dne(paramQnq, paramCLK, 0, 5, 8, 18, 7, 10, 0, 0, false);
    Dne(paramQnq, paramCLK, 7, 5, 0, 7, 5, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 7, 5, 11, 7, 5, 18, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 11, 5, 0, 11, 5, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 11, 5, 11, 11, 5, 18, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 5, 7, 7, 5, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 11, 5, 7, 18, 5, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 5, 11, 7, 5, 11, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 11, 5, 11, 18, 5, 11, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 7, 2, 0, 11, 2, 5, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 7, 2, 13, 11, 2, 18, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 7, 0, 0, 11, 1, 3, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 7, 0, 15, 11, 1, 18, zKP.iNH.FWm, zKP.iNH.FWm, false);
    byte b;
    for (b = 7; b <= 11; b++) {
      for (byte b1 = 0; b1 <= 2; b1++) {
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, b1, paramCLK);
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, 18 - b1, paramCLK);
      } 
    } 
    Dne(paramQnq, paramCLK, 0, 2, 7, 5, 2, 11, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 13, 2, 7, 18, 2, 11, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 0, 7, 3, 1, 11, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 15, 0, 7, 18, 1, 11, zKP.iNH.FWm, zKP.iNH.FWm, false);
    for (b = 0; b <= 2; b++) {
      for (byte b1 = 7; b1 <= 11; b1++) {
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, b1, paramCLK);
        FWm(paramQnq, zKP.iNH.FWm, 0, 18 - b, -1, b1, paramCLK);
      } 
    } 
    return true;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Tps)parambvz, paramList, paramRandom, 8, 3, false);
    FWm((Tps)parambvz, paramList, paramRandom, 3, 8, false);
    bzF((Tps)parambvz, paramList, paramRandom, 3, 8, false);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jsv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */