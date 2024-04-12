import java.util.List;
import java.util.Random;

public class yHt extends iDn {
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Dne(paramQnq, paramCLK, 0, 0, 0, 4, 1, 4, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 0, 4, 5, 4, 0, 0, false);
    Dne(paramQnq, paramCLK, 4, 2, 0, 4, 5, 4, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 4, 3, 1, 4, 4, 1, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 4, 3, 3, 4, 4, 3, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 0, 0, 5, 0, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 4, 3, 5, 4, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 3, 4, 1, 4, 4, zKP.TpV.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 3, 3, 4, 3, 4, 4, zKP.TpV.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 6, 0, 4, 6, 4, zKP.iNH.FWm, zKP.iNH.FWm, false);
    for (byte b = 0; b <= 4; b++) {
      for (byte b1 = 0; b1 <= 4; b1++)
        FWm(paramQnq, zKP.iNH.FWm, 0, b, -1, b1, paramCLK); 
    } 
    return true;
  }
  
  public yHt(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    FWm((Tps)parambvz, paramList, paramRandom, 0, 1, true);
  }
  
  public static yHt Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, 0, 0, 5, 7, 5, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new yHt(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yHt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */