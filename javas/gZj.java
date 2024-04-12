import java.util.List;
import java.util.Random;

public class gZj extends oeq {
  private final RLF Dne;
  
  private boolean Dne;
  
  private static final fKu[] Dne = new fKu[] { 
      new fKu(dEr.iNH.Qnq, 0, 1, 1, 10), new fKu(dEr.div.Qnq, 0, 1, 3, 3), new fKu(dEr.IjH.Qnq, 0, 1, 5, 10), new fKu(dEr.mrb.Qnq, 0, 1, 3, 5), new fKu(dEr.exS.Qnq, 0, 4, 9, 5), new fKu(dEr.rPc.Qnq, 0, 1, 3, 15), new fKu(dEr.aFZ.Qnq, 0, 1, 3, 15), new fKu(dEr.FWm.Qnq, 0, 1, 1, 5), new fKu(dEr.XHL.Qnq, 0, 1, 1, 5), new fKu(dEr.mrb.Qnq, 0, 1, 1, 5), 
      new fKu(dEr.IjH.Qnq, 0, 1, 1, 5), new fKu(((Qoi)dEr.XHL).Qnq, 0, 1, 1, 5), new fKu(((Qoi)dEr.Zpi).Qnq, 0, 1, 1, 5), new fKu(dEr.ZfC.Qnq, 0, 1, 1, 1) };
  
  public static gZj Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 7, paramInt4);
    return (Dne(cLK) && bvz.Dne(paramList, cLK) == null) ? new gZj(paramInt5, paramRandom, cLK, paramInt4) : null;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    Dne((Kci)parambvz, paramList, paramRandom, 1, 1);
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, 0, 0, 0, 4, 4, 6, true, paramRandom, dlc.Dne());
    Dne(paramQnq, paramRandom, paramCLK, (RLF)this.Dne, 1, 1, 0);
    Dne(paramQnq, paramRandom, paramCLK, (RLF)RLF.Dne, 1, 1, 6);
    Dne(paramQnq, paramCLK, 3, 1, 2, 3, 1, 4, zKP.WvN.FWm, zKP.WvN.FWm, false);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 5, 3, 1, 1, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 5, 3, 1, 5, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 5, 3, 2, 2, paramCLK);
    Dne(paramQnq, ((dNT)zKP.FWm).FWm, 5, 3, 2, 4, paramCLK);
    int i;
    for (i = 2; i <= 4; i++)
      Dne(paramQnq, ((dNT)zKP.FWm).FWm, 5, 2, 1, i, paramCLK); 
    if (this.Dne == null) {
      i = Dne(2);
      int j = Dne(3, 3);
      int k = FWm(3, 3);
      if (paramCLK.Dne(j, i, k)) {
        this.Dne = true;
        Dne(paramQnq, paramCLK, paramRandom, 3, 2, 3, fKu.Dne(Dne, new fKu[] { dEr.Dne.Dne(paramRandom) }), 2 + paramRandom.nextInt(2));
      } 
    } 
    return true;
  }
  
  public gZj(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.aFZ = paramInt2;
    this.Dne = (fKu[])Dne(paramRandom);
    this.Dne = (fKu[])paramCLK;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gZj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */