import java.util.List;
import java.util.Random;

public class NEG extends iDn {
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    byte b = 1;
    if (this.aFZ == 1 || this.aFZ == 2)
      b = 5; 
    FWm((Tps)parambvz, paramList, paramRandom, 0, b, (paramRandom.nextInt(8) > 0));
    bzF((Tps)parambvz, paramList, paramRandom, 0, b, (paramRandom.nextInt(8) > 0));
  }
  
  public static NEG Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -3, 0, 0, 9, 7, 9, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new NEG(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Dne(paramQnq, paramCLK, 0, 0, 0, 8, 1, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 0, 8, 5, 8, 0, 0, false);
    Dne(paramQnq, paramCLK, 0, 6, 0, 8, 6, 5, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 0, 2, 5, 0, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 6, 2, 0, 8, 5, 0, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 3, 0, 1, 4, 0, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 7, 3, 0, 7, 4, 0, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 4, 8, 2, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 1, 4, 2, 2, 4, 0, 0, false);
    Dne(paramQnq, paramCLK, 6, 1, 4, 7, 2, 4, 0, 0, false);
    Dne(paramQnq, paramCLK, 0, 3, 8, 8, 3, 8, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 0, 3, 6, 0, 3, 7, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 8, 3, 6, 8, 3, 7, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 0, 3, 4, 0, 5, 5, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 8, 3, 4, 8, 5, 5, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 3, 5, 2, 5, 5, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 6, 3, 5, 7, 5, 5, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 1, 4, 5, 1, 5, 5, zKP.TpV.FWm, zKP.TpV.FWm, false);
    Dne(paramQnq, paramCLK, 7, 4, 5, 7, 5, 5, zKP.TpV.FWm, zKP.TpV.FWm, false);
    for (byte b = 0; b <= 5; b++) {
      for (byte b1 = 0; b1 <= 8; b1++)
        FWm(paramQnq, zKP.iNH.FWm, 0, b1, -1, b, paramCLK); 
    } 
    return true;
  }
  
  static {
  
  }
  
  public NEG(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NEG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */