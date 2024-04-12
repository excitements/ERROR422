import java.util.List;
import java.util.Random;

public class lmZ extends iDn {
  private boolean Dne;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Dne(paramQnq, paramCLK, 0, 2, 0, 6, 7, 7, 0, 0, false);
    Dne(paramQnq, paramCLK, 1, 0, 0, 5, 1, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 2, 1, 5, 2, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 3, 2, 5, 3, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 4, 3, 5, 4, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 2, 0, 1, 4, 2, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 5, 2, 0, 5, 4, 2, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 5, 2, 1, 5, 3, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 5, 5, 2, 5, 5, 3, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 5, 3, 0, 5, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 6, 5, 3, 6, 5, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 5, 8, 5, 5, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, zKP.TpV.FWm, 0, 1, 6, 3, paramCLK);
    Dne(paramQnq, zKP.TpV.FWm, 0, 5, 6, 3, paramCLK);
    Dne(paramQnq, paramCLK, 0, 6, 3, 0, 6, 8, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 6, 6, 3, 6, 6, 8, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 1, 6, 8, 5, 7, 8, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 2, 8, 8, 4, 8, 8, zKP.TpV.FWm, zKP.TpV.FWm, false);
    if (!this.Dne) {
      int i = Dne(5);
      int j = Dne(3, 5);
      int k = FWm(3, 5);
      if (paramCLK.Dne(j, i, k)) {
        this.Dne = true;
        paramQnq.FWm(j, i, k, zKP.eJi.FWm, 0, 2);
        ySb ySb = (ySb)paramQnq.Dne(j, i, k);
        if (ySb != null)
          ySb.Dne().Dne("Blaze"); 
      } 
    } 
    for (byte b = 0; b <= 6; b++) {
      for (byte b1 = 0; b1 <= 6; b1++)
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, b1, paramCLK); 
    } 
    return true;
  }
  
  public static lmZ Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -2, 0, 0, 7, 8, 9, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new lmZ(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public lmZ(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lmZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */