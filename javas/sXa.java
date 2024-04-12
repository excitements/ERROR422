import java.util.List;
import java.util.Random;

public class sXa extends iDn {
  public static sXa Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -2, 0, 0, 7, 9, 7, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new sXa(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public sXa(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Tps)parambvz, paramList, paramRandom, 2, 0, false);
    FWm((Tps)parambvz, paramList, paramRandom, 0, 2, false);
    bzF((Tps)parambvz, paramList, paramRandom, 0, 2, false);
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Dne(paramQnq, paramCLK, 0, 0, 0, 6, 1, 6, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 0, 6, 7, 6, 0, 0, false);
    Dne(paramQnq, paramCLK, 0, 2, 0, 1, 6, 0, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 6, 1, 6, 6, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 5, 2, 0, 6, 6, 0, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 5, 2, 6, 6, 6, 6, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 0, 0, 6, 1, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 5, 0, 6, 6, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 6, 2, 0, 6, 6, 1, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 6, 2, 5, 6, 6, 6, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 6, 0, 4, 6, 0, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 5, 0, 4, 5, 0, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 2, 6, 6, 4, 6, 6, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 2, 5, 6, 4, 5, 6, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 0, 6, 2, 0, 6, 4, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 5, 2, 0, 5, 4, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 6, 6, 2, 6, 6, 4, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 6, 5, 2, 6, 5, 4, zKP.TpV.FWm, zKP.TpV.FWm, false);
    for (byte b = 0; b <= 6; b++) {
      for (byte b1 = 0; b1 <= 6; b1++)
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, b1, paramCLK); 
    } 
    return true;
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\sXa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */