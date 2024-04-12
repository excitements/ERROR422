import java.util.List;
import java.util.Random;

public class HLP extends oeq {
  protected final RLF Dne;
  
  public static HLP Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -1, 0, 9, 5, 11, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new HLP(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public HLP(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = Dne(paramRandom);
    this.Dne = (RLF)paramCLK;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 8, 4, 10, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, this.Dne, 1, 1, 0);
    Dne(paramQnq, paramCLK, 1, 1, 10, 3, 3, 10, 0, 0, false);
    Dne(paramQnq, paramCLK, 4, 1, 1, 4, 3, 1, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 1, 3, 4, 3, 3, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 1, 7, 4, 3, 7, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 1, 9, 4, 3, 9, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 1, 4, 4, 3, 6, zKP.Sdr.FWm, zKP.Sdr.FWm, false);
    Dne(paramQnq, paramCLK, 5, 1, 5, 7, 3, 5, zKP.Sdr.FWm, zKP.Sdr.FWm, false);
    Dne(paramQnq, zKP.Sdr.FWm, 0, 4, 3, 2, paramCLK);
    Dne(paramQnq, zKP.Sdr.FWm, 0, 4, 3, 8, paramCLK);
    Dne(paramQnq, zKP.IYC.FWm, bzF(zKP.IYC.FWm, 3), 4, 1, 2, paramCLK);
    Dne(paramQnq, zKP.IYC.FWm, bzF(zKP.IYC.FWm, 3) + 8, 4, 2, 2, paramCLK);
    Dne(paramQnq, zKP.IYC.FWm, bzF(zKP.IYC.FWm, 3), 4, 1, 8, paramCLK);
    Dne(paramQnq, zKP.IYC.FWm, bzF(zKP.IYC.FWm, 3) + 8, 4, 2, 8, paramCLK);
    return true;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Kci)parambvz, paramList, paramRandom, 1, 1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HLP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */