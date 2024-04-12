import java.util.List;
import java.util.Random;

public class xKr extends oeq {
  private final boolean Dne;
  
  private final RLF Dne;
  
  private final boolean FWm;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 4, 4, 6, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, this.Dne, 1, 1, 0);
    Dne(paramQnq, paramRandom, paramCLK, (RLF)RLF.Dne, 1, 1, 6);
    Dne(paramQnq, paramCLK, paramRandom, 0.1F, 1, 2, 1, zKP.Wwe.FWm, 0);
    Dne(paramQnq, paramCLK, paramRandom, 0.1F, 3, 2, 1, zKP.Wwe.FWm, 0);
    Dne(paramQnq, paramCLK, paramRandom, 0.1F, 1, 2, 5, zKP.Wwe.FWm, 0);
    Dne(paramQnq, paramCLK, paramRandom, 0.1F, 3, 2, 5, zKP.Wwe.FWm, 0);
    if (this.Dne != null)
      Dne(paramQnq, paramCLK, 0, 1, 2, 0, 3, 4, 0, 0, false); 
    if (this.FWm)
      Dne(paramQnq, paramCLK, 4, 1, 2, 4, 3, 4, 0, 0, false); 
    return true;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Kci)parambvz, paramList, paramRandom, 1, 1);
    if (this.Dne != null)
      FWm((Kci)parambvz, paramList, paramRandom, 1, 2); 
    if (this.FWm)
      bzF((Kci)parambvz, paramList, paramRandom, 1, 2); 
  }
  
  public xKr(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = Dne(paramRandom);
    this.Dne = (RLF)paramCLK;
    this.Dne = (paramRandom.nextInt(2) == 0) ? 1 : 0;
    this.FWm = (paramRandom.nextInt(2) == 0);
  }
  
  public static xKr Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 7, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new xKr(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xKr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */