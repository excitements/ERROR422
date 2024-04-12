import java.util.List;
import java.util.Random;

public class ikY extends iDn {
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Dne(paramQnq, paramCLK, 0, 3, 0, 12, 4, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 5, 0, 12, 13, 12, 0, 0, false);
    Dne(paramQnq, paramCLK, 0, 5, 0, 1, 12, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 11, 5, 0, 12, 12, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 5, 11, 4, 12, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 8, 5, 11, 10, 12, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 5, 9, 11, 7, 12, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 5, 0, 4, 12, 1, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 8, 5, 0, 10, 12, 1, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 5, 9, 0, 7, 12, 1, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 11, 2, 10, 12, 10, zKP.iNH.FWm, zKP.iNH.FWm, false);
    int i;
    for (i = 1; i <= 11; i += 2) {
      Dne(paramQnq, paramCLK, i, 10, 0, i, 11, 0, zKP.TpV.FWm, zKP.TpV.FWm, false);
      Dne(paramQnq, paramCLK, i, 10, 12, i, 11, 12, zKP.TpV.FWm, zKP.TpV.FWm, false);
      Dne(paramQnq, paramCLK, 0, 10, i, 0, 11, i, zKP.TpV.FWm, zKP.TpV.FWm, false);
      Dne(paramQnq, paramCLK, 12, 10, i, 12, 11, i, zKP.TpV.FWm, zKP.TpV.FWm, false);
      Dne(paramQnq, zKP.iNH.FWm, 0, i, 13, 0, paramCLK);
      Dne(paramQnq, zKP.iNH.FWm, 0, i, 13, 12, paramCLK);
      Dne(paramQnq, zKP.iNH.FWm, 0, 0, 13, i, paramCLK);
      Dne(paramQnq, zKP.iNH.FWm, 0, 12, 13, i, paramCLK);
      Dne(paramQnq, zKP.TpV.FWm, 0, i + 1, 13, 0, paramCLK);
      Dne(paramQnq, zKP.TpV.FWm, 0, i + 1, 13, 12, paramCLK);
      Dne(paramQnq, zKP.TpV.FWm, 0, 0, 13, i + 1, paramCLK);
      Dne(paramQnq, zKP.TpV.FWm, 0, 12, 13, i + 1, paramCLK);
    } 
    Dne(paramQnq, zKP.TpV.FWm, 0, 0, 13, 0, paramCLK);
    Dne(paramQnq, zKP.TpV.FWm, 0, 0, 13, 12, paramCLK);
    Dne(paramQnq, zKP.TpV.FWm, 0, 0, 13, 0, paramCLK);
    Dne(paramQnq, zKP.TpV.FWm, 0, 12, 13, 0, paramCLK);
    for (i = 3; i <= 9; i += 2) {
      Dne(paramQnq, paramCLK, 1, 7, i, 1, 8, i, zKP.TpV.FWm, zKP.TpV.FWm, false);
      Dne(paramQnq, paramCLK, 11, 7, i, 11, 8, i, zKP.TpV.FWm, zKP.TpV.FWm, false);
    } 
    i = bzF(zKP.ivB.FWm, 3);
    int j;
    for (j = 0; j <= 6; j++) {
      int m = j + 4;
      for (byte b1 = 5; b1 <= 7; b1++)
        Dne(paramQnq, zKP.ivB.FWm, i, b1, 5 + j, m, paramCLK); 
      if (m >= 5 && m <= 8) {
        Dne(paramQnq, paramCLK, 5, 5, m, 7, j + 4, m, zKP.iNH.FWm, zKP.iNH.FWm, false);
      } else if (m >= 9 && m <= 10) {
        Dne(paramQnq, paramCLK, 5, 8, m, 7, j + 4, m, zKP.iNH.FWm, zKP.iNH.FWm, false);
      } 
      if (j >= 1)
        Dne(paramQnq, paramCLK, 5, 6 + j, m, 7, 9 + j, m, 0, 0, false); 
    } 
    for (j = 5; j <= 7; j++)
      Dne(paramQnq, zKP.ivB.FWm, i, j, 12, 11, paramCLK); 
    Dne(paramQnq, paramCLK, 5, 6, 7, 5, 7, 7, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 7, 6, 7, 7, 7, 7, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 5, 13, 12, 7, 13, 12, 0, 0, false);
    Dne(paramQnq, paramCLK, 2, 5, 2, 3, 5, 3, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 5, 9, 3, 5, 10, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 5, 4, 2, 5, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 9, 5, 2, 10, 5, 3, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 9, 5, 9, 10, 5, 10, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 10, 5, 4, 10, 5, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    j = bzF(zKP.ivB.FWm, 0);
    int k = bzF(zKP.ivB.FWm, 1);
    Dne(paramQnq, zKP.ivB.FWm, k, 4, 5, 2, paramCLK);
    Dne(paramQnq, zKP.ivB.FWm, k, 4, 5, 3, paramCLK);
    Dne(paramQnq, zKP.ivB.FWm, k, 4, 5, 9, paramCLK);
    Dne(paramQnq, zKP.ivB.FWm, k, 4, 5, 10, paramCLK);
    Dne(paramQnq, zKP.ivB.FWm, j, 8, 5, 2, paramCLK);
    Dne(paramQnq, zKP.ivB.FWm, j, 8, 5, 3, paramCLK);
    Dne(paramQnq, zKP.ivB.FWm, j, 8, 5, 9, paramCLK);
    Dne(paramQnq, zKP.ivB.FWm, j, 8, 5, 10, paramCLK);
    Dne(paramQnq, paramCLK, 3, 4, 4, 4, 4, 8, zKP.Suj.FWm, zKP.Suj.FWm, false);
    Dne(paramQnq, paramCLK, 8, 4, 4, 9, 4, 8, zKP.Suj.FWm, zKP.Suj.FWm, false);
    Dne(paramQnq, paramCLK, 3, 5, 4, 4, 5, 8, zKP.uzC.FWm, zKP.uzC.FWm, false);
    Dne(paramQnq, paramCLK, 8, 5, 4, 9, 5, 8, zKP.uzC.FWm, zKP.uzC.FWm, false);
    Dne(paramQnq, paramCLK, 4, 2, 0, 8, 2, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 4, 12, 2, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 4, 0, 0, 8, 1, 3, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 4, 0, 9, 8, 1, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 0, 4, 3, 1, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 9, 0, 4, 12, 1, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    byte b;
    for (b = 4; b <= 8; b++) {
      for (byte b1 = 0; b1 <= 2; b1++) {
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, b1, paramCLK);
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, 12 - b1, paramCLK);
      } 
    } 
    for (b = 0; b <= 2; b++) {
      for (byte b1 = 4; b1 <= 8; b1++) {
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, b1, paramCLK);
        FWm(paramQnq, zKP.iNH.FWm, 0, 12 - b, -1, b1, paramCLK);
      } 
    } 
    return true;
  }
  
  public static ikY Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -5, -3, 0, 13, 14, 13, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new ikY(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  static {
  
  }
  
  public ikY(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Tps)parambvz, paramList, paramRandom, 5, 3, true);
    Dne((Tps)parambvz, paramList, paramRandom, 5, 11, true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ikY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */