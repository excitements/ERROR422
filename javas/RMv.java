import java.util.List;
import java.util.Random;

public class RMv extends iDn {
  public RMv(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
  }
  
  public static RMv Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -5, -3, 0, 13, 14, 13, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new RMv(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
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
    Dne(paramQnq, paramCLK, 5, 8, 0, 7, 8, 0, zKP.TpV.FWm, zKP.TpV.FWm, false);
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
    Dne(paramQnq, paramCLK, 4, 2, 0, 8, 2, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 2, 4, 12, 2, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 4, 0, 0, 8, 1, 3, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 4, 0, 9, 8, 1, 12, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 0, 0, 4, 3, 1, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 9, 0, 4, 12, 1, 8, zKP.iNH.FWm, zKP.iNH.FWm, false);
    for (i = 4; i <= 8; i++) {
      for (byte b = 0; b <= 2; b++) {
        FWm(paramQnq, zKP.iNH.FWm, 0, i, -1, b, paramCLK);
        FWm(paramQnq, zKP.iNH.FWm, 0, i, -1, 12 - b, paramCLK);
      } 
    } 
    for (i = 0; i <= 2; i++) {
      for (byte b = 4; b <= 8; b++) {
        FWm(paramQnq, zKP.iNH.FWm, 0, i, -1, b, paramCLK);
        FWm(paramQnq, zKP.iNH.FWm, 0, 12 - i, -1, b, paramCLK);
      } 
    } 
    Dne(paramQnq, paramCLK, 5, 5, 5, 7, 5, 7, zKP.iNH.FWm, zKP.iNH.FWm, false);
    Dne(paramQnq, paramCLK, 6, 1, 6, 6, 4, 6, 0, 0, false);
    Dne(paramQnq, zKP.iNH.FWm, 0, 6, 0, 6, paramCLK);
    Dne(paramQnq, ((byt)zKP.FWm).FWm, 0, 6, 5, 6, paramCLK);
    i = Dne(6, 6);
    int j = Dne(5);
    int k = FWm(6, 6);
    if (paramCLK.Dne(i, j, k)) {
      paramQnq.Dne = true;
      zKP.Dne[((byt)zKP.FWm).FWm].Dne(paramQnq, i, j, k, paramRandom);
      paramQnq.Dne = false;
    } 
    return true;
  }
  
  static {
  
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Tps)parambvz, paramList, paramRandom, 5, 3, true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RMv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */