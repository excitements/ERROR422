import java.util.List;
import java.util.Random;

public class mte extends iDn {
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    int i = bzF(zKP.ivB.FWm, 2);
    for (byte b = 0; b <= 9; b++) {
      int j = Math.max(1, 7 - b);
      int k = Math.min(Math.max(j + 5, 14 - b), 13);
      byte b1 = b;
      Dne(paramQnq, paramCLK, 0, 0, b, 4, j, b, zKP.iNH.FWm, zKP.iNH.FWm, false);
      Dne(paramQnq, paramCLK, 1, j + 1, b, 3, k - 1, b, 0, 0, false);
      if (b <= 6) {
        Dne(paramQnq, zKP.ivB.FWm, i, 1, j + 1, b, paramCLK);
        Dne(paramQnq, zKP.ivB.FWm, i, 2, j + 1, b, paramCLK);
        Dne(paramQnq, zKP.ivB.FWm, i, 3, j + 1, b, paramCLK);
      } 
      Dne(paramQnq, paramCLK, 0, k, b, 4, k, b, zKP.iNH.FWm, zKP.iNH.FWm, false);
      Dne(paramQnq, paramCLK, 0, j + 1, b, 0, k - 1, b, zKP.iNH.FWm, zKP.iNH.FWm, false);
      Dne(paramQnq, paramCLK, 4, j + 1, b, 4, k - 1, b, zKP.iNH.FWm, zKP.iNH.FWm, false);
      if ((b & 0x1) == 0) {
        Dne(paramQnq, paramCLK, 0, j + 2, b, 0, j + 3, b, zKP.TpV.FWm, zKP.TpV.FWm, false);
        Dne(paramQnq, paramCLK, 4, j + 2, b, 4, j + 3, b, zKP.TpV.FWm, zKP.TpV.FWm, false);
      } 
      for (byte b2 = 0; b2 <= 4; b2++)
        FWm(paramQnq, zKP.iNH.FWm, 0, b2, -1, b1, paramCLK); 
    } 
    return true;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Tps)parambvz, paramList, paramRandom, 1, 0, true);
  }
  
  public mte(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public static mte Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -7, 0, 5, 14, 10, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new mte(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mte.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */