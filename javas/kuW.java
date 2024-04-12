import java.util.List;
import java.util.Random;

public class kuW extends oeq {
  protected final RLF Dne;
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    if (this.aFZ != 2 && this.aFZ != 3) {
      bzF((Kci)parambvz, paramList, paramRandom, 1, 1);
    } else {
      FWm((Kci)parambvz, paramList, paramRandom, 1, 1);
    } 
  }
  
  public static kuW Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 5, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new kuW(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public kuW(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = Dne(paramRandom);
    this.Dne = (RLF)paramCLK;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 4, 4, 4, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, this.Dne, 1, 1, 0);
    if (this.aFZ != 2 && this.aFZ != 3) {
      Dne(paramQnq, paramCLK, 4, 1, 1, 4, 3, 3, 0, 0, false);
    } else {
      Dne(paramQnq, paramCLK, 0, 1, 1, 0, 3, 3, 0, 0, false);
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kuW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */