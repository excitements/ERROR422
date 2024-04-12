import java.util.List;
import java.util.Random;

public class ISl extends oeq {
  private final boolean Dne;
  
  private final RLF Dne = false;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 4, 10, 4, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, this.Dne, 1, 7, 0);
    Dne(paramQnq, paramRandom, paramCLK, (RLF)RLF.Dne, 1, 1, 4);
    Dne(paramQnq, zKP.WvN.FWm, 0, 2, 6, 1, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 1, 5, 1, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 0, 1, 6, 1, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 1, 5, 2, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 1, 4, 3, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 0, 1, 5, 3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 2, 4, 3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 3, 3, 3, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 0, 3, 4, 3, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 3, 3, 2, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 3, 2, 1, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 0, 3, 3, 1, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 2, 2, 1, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 1, 1, 1, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 0, 1, 2, 1, paramCLK);
    Dne(paramQnq, zKP.WvN.FWm, 0, 1, 1, 2, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 0, 1, 1, 3, paramCLK);
    return true;
  }
  
  public ISl(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = Dne(paramRandom);
    this.Dne = (RLF)paramCLK;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    if (this.Dne != null)
      dlc.Dne(xwV.class); 
    Dne((Kci)parambvz, paramList, paramRandom, 1, 1);
  }
  
  public ISl(int paramInt1, Random paramRandom, int paramInt2, int paramInt3) {
    super(paramInt1);
    this.aFZ = paramRandom.nextInt(4);
    this.Dne = (RLF)RLF.Dne;
    switch (this.aFZ) {
      case 0:
      case 2:
        this.Dne = (RLF)new CLK(paramInt2, 64, paramInt3, paramInt2 + 5 - 1, 74, paramInt3 + 5 - 1);
        return;
    } 
    this.Dne = (RLF)new CLK(paramInt2, 64, paramInt3, paramInt2 + 5 - 1, 74, paramInt3 + 5 - 1);
  }
  
  public static ISl Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -7, 0, 5, 11, 5, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new ISl(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ISl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */