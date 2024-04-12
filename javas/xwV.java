import java.util.List;
import java.util.Random;

public class xwV extends oeq {
  private boolean Dne;
  
  private boolean FWm;
  
  protected final RLF Dne;
  
  private boolean bzF;
  
  private boolean Qnq;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 9, 8, 10, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, this.Dne, 4, 3, 0);
    if (this.Dne != null)
      Dne(paramQnq, paramCLK, 0, 3, 1, 0, 5, 3, 0, 0, false); 
    if (this.bzF)
      Dne(paramQnq, paramCLK, 9, 3, 1, 9, 5, 3, 0, 0, false); 
    if (this.FWm)
      Dne(paramQnq, paramCLK, 0, 5, 7, 0, 7, 9, 0, 0, false); 
    if (this.Qnq)
      Dne(paramQnq, paramCLK, 9, 5, 7, 9, 7, 9, 0, 0, false); 
    Dne(paramQnq, paramCLK, 5, 1, 10, 7, 3, 10, 0, 0, false);
    Dne(paramQnq, paramCLK, 1, 2, 1, 8, 2, 6, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 4, 1, 5, 4, 4, 9, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 8, 1, 5, 8, 4, 9, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 1, 4, 7, 3, 4, 9, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 1, 3, 5, 3, 3, 6, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 1, 3, 4, 3, 3, 4, ((dNT)zKP.FWm).FWm, ((dNT)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 1, 4, 6, 3, 4, 6, ((dNT)zKP.FWm).FWm, ((dNT)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 5, 1, 7, 7, 1, 8, false, paramRandom, dlc.Dne());
    Dne(paramQnq, paramCLK, 5, 1, 9, 7, 1, 9, ((dNT)zKP.FWm).FWm, ((dNT)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 5, 2, 7, 7, 2, 7, ((dNT)zKP.FWm).FWm, ((dNT)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 4, 5, 7, 4, 5, 9, ((dNT)zKP.FWm).FWm, ((dNT)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 8, 5, 7, 8, 5, 9, ((dNT)zKP.FWm).FWm, ((dNT)zKP.FWm).FWm, false);
    Dne(paramQnq, paramCLK, 5, 5, 7, 7, 5, 9, zKP.Dne.FWm, zKP.Dne.FWm, false);
    Dne(paramQnq, zKP.Wwe.FWm, 0, 6, 5, 6, paramCLK);
    return true;
  }
  
  public xwV(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = Dne(paramRandom);
    this.Dne = (RLF)paramCLK;
    this.Dne = paramRandom.nextBoolean();
    this.FWm = paramRandom.nextBoolean();
    this.bzF = paramRandom.nextBoolean();
    this.Qnq = (paramRandom.nextInt(3) > 0);
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    int i = 3;
    int j = 5;
    if (this.aFZ == 1 || this.aFZ == 2) {
      i = 8 - i;
      j = 8 - j;
    } 
    Dne((Kci)parambvz, paramList, paramRandom, 5, 1);
    if (this.Dne != null)
      FWm((Kci)parambvz, paramList, paramRandom, i, 1); 
    if (this.FWm)
      FWm((Kci)parambvz, paramList, paramRandom, j, 7); 
    if (this.bzF)
      bzF((Kci)parambvz, paramList, paramRandom, i, 1); 
    if (this.Qnq)
      bzF((Kci)parambvz, paramList, paramRandom, j, 7); 
  }
  
  public static xwV Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -4, -3, 0, 10, 9, 11, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new xwV(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xwV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */