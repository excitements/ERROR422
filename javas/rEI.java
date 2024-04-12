import java.util.List;
import java.util.Random;

public class rEI extends oeq {
  private final RLF Dne;
  
  public static rEI Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -7, 0, 5, 11, 8, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new rEI(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public rEI(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = Dne(paramRandom);
    this.Dne = (RLF)paramCLK;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 4, 10, 7, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, this.Dne, 1, 7, 0);
    Dne(paramQnq, paramRandom, paramCLK, (RLF)RLF.Dne, 1, 1, 7);
    int i = bzF(zKP.BJH.FWm, 2);
    for (byte b = 0; b < 6; b++) {
      Dne(paramQnq, zKP.BJH.FWm, i, 1, 6 - b, 1 + b, paramCLK);
      Dne(paramQnq, zKP.BJH.FWm, i, 2, 6 - b, 1 + b, paramCLK);
      Dne(paramQnq, zKP.BJH.FWm, i, 3, 6 - b, 1 + b, paramCLK);
      if (b < 5) {
        Dne(paramQnq, zKP.WvN.FWm, 0, 1, 5 - b, 1 + b, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, 2, 5 - b, 1 + b, paramCLK);
        Dne(paramQnq, zKP.WvN.FWm, 0, 3, 5 - b, 1 + b, paramCLK);
      } 
    } 
    return true;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Kci)parambvz, paramList, paramRandom, 1, 1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rEI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */