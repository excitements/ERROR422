import java.util.List;
import java.util.Random;

public class ZVw extends oeq {
  private final int Dne;
  
  public static CLK Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 4, paramInt4);
    bvz bvz = bvz.Dne(paramList, cLK);
    if (bvz == null)
      return null; 
    if ((bvz.Dne()).FWm == cLK.FWm)
      for (byte b = 3; b >= 1; b--) {
        cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, b - 1, paramInt4);
        if (!bvz.Dne().Dne(cLK))
          return CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, b, paramInt4); 
      }  
    return null;
  }
  
  public ZVw(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.Dne = (paramInt2 != 2 && paramInt2 != 0) ? paramCLK.Dne() : paramCLK.bzF();
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    for (byte b = 0; b < this.Dne; b++) {
      Dne(paramQnq, zKP.WvN.FWm, 0, 0, 0, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 1, 0, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 2, 0, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 3, 0, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 4, 0, b, paramCLK);
      for (byte b1 = 1; b1 <= 3; b1++) {
        Dne(paramQnq, zKP.WvN.FWm, 0, 0, b1, b, paramCLK);
        Dne(paramQnq, 0, 0, 1, b1, b, paramCLK);
        Dne(paramQnq, 0, 0, 2, b1, b, paramCLK);
        Dne(paramQnq, 0, 0, 3, b1, b, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, 4, b1, b, paramCLK);
      } 
      Dne(paramQnq, zKP.WvN.FWm, 0, 0, 4, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 1, 4, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 2, 4, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 3, 4, b, paramCLK);
      Dne(paramQnq, zKP.WvN.FWm, 0, 4, 4, b, paramCLK);
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZVw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */