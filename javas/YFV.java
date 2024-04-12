import java.util.List;
import java.util.Random;

public class YFV extends kuW {
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 4, 4, 4, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, this.Dne, 1, 1, 0);
    if (this.aFZ != 2 && this.aFZ != 3) {
      Dne(paramQnq, paramCLK, 0, 1, 1, 0, 3, 3, 0, 0, false);
    } else {
      Dne(paramQnq, paramCLK, 4, 1, 1, 4, 3, 3, 0, 0, false);
    } 
    return true;
  }
  
  static {
  
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    if (this.aFZ != 2 && this.aFZ != 3) {
      FWm((Kci)parambvz, paramList, paramRandom, 1, 1);
    } else {
      bzF((Kci)parambvz, paramList, paramRandom, 1, 1);
    } 
  }
  
  public YFV(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1, paramRandom, paramCLK, paramInt2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YFV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */