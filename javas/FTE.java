import java.util.List;
import java.util.Random;

public class FTE extends oeq {
  private final boolean Dne;
  
  protected final RLF Dne;
  
  private static final fKu[] Dne = new fKu[] { new fKu(dEr.TKg.Qnq, 0, 1, 3, 20), new fKu(dEr.lMz.Qnq, 0, 2, 7, 20), new fKu(((AtC)dEr.Dne).Qnq, 0, 1, 1, 1), new fKu(dEr.Suj.Qnq, 0, 1, 1, 1) };
  
  public FTE(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = (fKu[])Dne(paramRandom);
    this.Dne = (fKu[])paramCLK;
    this.Dne = (paramCLK.FWm() > 6) ? 1 : 0;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    byte b = 11;
    if (this.Dne == null)
      b = 6; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 13, b - 1, 14, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, (RLF)this.Dne, 4, 1, 0);
    Dne(paramQnq, paramCLK, paramRandom, 0.07F, 2, 1, 1, 11, 4, 13, zKP.vSL.FWm, zKP.vSL.FWm, false);
    int i;
    for (i = 1; i <= 13; i++) {
      if ((i - 1) % 4 == 0) {
        Dne(paramQnq, paramCLK, 1, 1, i, 1, 4, i, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
        Dne(paramQnq, paramCLK, 12, 1, i, 12, 4, i, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
        Dne(paramQnq, zKP.Wwe.FWm, 0, 2, 3, i, paramCLK);
        Dne(paramQnq, zKP.Wwe.FWm, 0, 11, 3, i, paramCLK);
        if (this.Dne != null) {
          Dne(paramQnq, paramCLK, 1, 6, i, 1, 9, i, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
          Dne(paramQnq, paramCLK, 12, 6, i, 12, 9, i, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
        } 
      } else {
        Dne(paramQnq, paramCLK, 1, 1, i, 1, 4, i, zKP.AgF.FWm, zKP.AgF.FWm, false);
        Dne(paramQnq, paramCLK, 12, 1, i, 12, 4, i, zKP.AgF.FWm, zKP.AgF.FWm, false);
        if (this.Dne != null) {
          Dne(paramQnq, paramCLK, 1, 6, i, 1, 9, i, zKP.AgF.FWm, zKP.AgF.FWm, false);
          Dne(paramQnq, paramCLK, 12, 6, i, 12, 9, i, zKP.AgF.FWm, zKP.AgF.FWm, false);
        } 
      } 
    } 
    for (i = 3; i < 12; i += 2) {
      Dne(paramQnq, paramCLK, 3, 1, i, 4, 3, i, zKP.AgF.FWm, zKP.AgF.FWm, false);
      Dne(paramQnq, paramCLK, 6, 1, i, 7, 3, i, zKP.AgF.FWm, zKP.AgF.FWm, false);
      Dne(paramQnq, paramCLK, 9, 1, i, 10, 3, i, zKP.AgF.FWm, zKP.AgF.FWm, false);
    } 
    if (this.Dne != null) {
      Dne(paramQnq, paramCLK, 1, 5, 1, 3, 5, 13, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
      Dne(paramQnq, paramCLK, 10, 5, 1, 12, 5, 13, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
      Dne(paramQnq, paramCLK, 4, 5, 1, 9, 5, 2, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
      Dne(paramQnq, paramCLK, 4, 5, 12, 9, 5, 13, ((zKP)zKP.Qnq).FWm, ((zKP)zKP.Qnq).FWm, false);
      Dne(paramQnq, ((zKP)zKP.Qnq).FWm, 0, 9, 5, 11, paramCLK);
      Dne(paramQnq, ((zKP)zKP.Qnq).FWm, 0, 8, 5, 11, paramCLK);
      Dne(paramQnq, ((zKP)zKP.Qnq).FWm, 0, 9, 5, 10, paramCLK);
      Dne(paramQnq, paramCLK, 3, 6, 2, 3, 6, 12, zKP.sly.FWm, zKP.sly.FWm, false);
      Dne(paramQnq, paramCLK, 10, 6, 2, 10, 6, 10, zKP.sly.FWm, zKP.sly.FWm, false);
      Dne(paramQnq, paramCLK, 4, 6, 2, 9, 6, 2, zKP.sly.FWm, zKP.sly.FWm, false);
      Dne(paramQnq, paramCLK, 4, 6, 12, 8, 6, 12, zKP.sly.FWm, zKP.sly.FWm, false);
      Dne(paramQnq, zKP.sly.FWm, 0, 9, 6, 11, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, 8, 6, 11, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, 9, 6, 10, paramCLK);
      i = bzF(zKP.ZfC.FWm, 3);
      Dne(paramQnq, zKP.ZfC.FWm, i, 10, 1, 13, paramCLK);
      Dne(paramQnq, zKP.ZfC.FWm, i, 10, 2, 13, paramCLK);
      Dne(paramQnq, zKP.ZfC.FWm, i, 10, 3, 13, paramCLK);
      Dne(paramQnq, zKP.ZfC.FWm, i, 10, 4, 13, paramCLK);
      Dne(paramQnq, zKP.ZfC.FWm, i, 10, 5, 13, paramCLK);
      Dne(paramQnq, zKP.ZfC.FWm, i, 10, 6, 13, paramCLK);
      Dne(paramQnq, zKP.ZfC.FWm, i, 10, 7, 13, paramCLK);
      byte b1 = 7;
      byte b2 = 7;
      Dne(paramQnq, zKP.sly.FWm, 0, b1 - 1, 9, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1, 9, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1 - 1, 8, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1, 8, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1 - 1, 7, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1, 7, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1 - 2, 7, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1 + 1, 7, b2, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1 - 1, 7, b2 - 1, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1 - 1, 7, b2 + 1, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1, 7, b2 - 1, paramCLK);
      Dne(paramQnq, zKP.sly.FWm, 0, b1, 7, b2 + 1, paramCLK);
      Dne(paramQnq, zKP.Wwe.FWm, 0, b1 - 2, 8, b2, paramCLK);
      Dne(paramQnq, zKP.Wwe.FWm, 0, b1 + 1, 8, b2, paramCLK);
      Dne(paramQnq, zKP.Wwe.FWm, 0, b1 - 1, 8, b2 - 1, paramCLK);
      Dne(paramQnq, zKP.Wwe.FWm, 0, b1 - 1, 8, b2 + 1, paramCLK);
      Dne(paramQnq, zKP.Wwe.FWm, 0, b1, 8, b2 - 1, paramCLK);
      Dne(paramQnq, zKP.Wwe.FWm, 0, b1, 8, b2 + 1, paramCLK);
    } 
    Dne(paramQnq, paramCLK, paramRandom, 3, 3, 5, fKu.Dne(Dne, new fKu[] { dEr.Dne.Dne(paramRandom, 1, 5, 2) }), 1 + paramRandom.nextInt(4));
    if (this.Dne != null) {
      Dne(paramQnq, 0, 0, 12, 9, 1, paramCLK);
      Dne(paramQnq, paramCLK, paramRandom, 12, 8, 1, fKu.Dne(Dne, new fKu[] { dEr.Dne.Dne(paramRandom, 1, 5, 2) }), 1 + paramRandom.nextInt(4));
    } 
    return true;
  }
  
  public static FTE Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -4, -1, 0, 14, 11, 15, paramInt4);
    if (!Dne(cLK) || bvz.Dne(paramList, cLK) != null) {
      cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -4, -1, 0, 14, 6, 15, paramInt4);
      if (!Dne(cLK) || bvz.Dne(paramList, cLK) != null)
        return null; 
    } 
    return new FTE(paramInt5, paramRandom, cLK, paramInt4);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FTE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */