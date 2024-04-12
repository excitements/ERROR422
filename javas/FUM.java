import java.util.List;
import java.util.Random;

public class FUM {
  private static final fKu[] Dne = new fKu[] { 
      new fKu(dEr.IjH.Qnq, 0, 1, 5, 10), new fKu(dEr.mrb.Qnq, 0, 1, 3, 5), new fKu(dEr.exS.Qnq, 0, 4, 9, 5), new fKu(dEr.edi.Qnq, 4, 4, 9, 5), new fKu(dEr.div.Qnq, 0, 1, 2, 3), new fKu(dEr.DyG.Qnq, 0, 3, 8, 10), new fKu(dEr.rPc.Qnq, 0, 1, 3, 15), new fKu(dEr.FWm.Qnq, 0, 1, 1, 1), new fKu(zKP.FYZ.FWm, 0, 4, 8, 1), new fKu(dEr.MUD.Qnq, 0, 2, 4, 10), 
      new fKu(dEr.LDH.Qnq, 0, 2, 4, 10) };
  
  private static bvz Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = paramRandom.nextInt(100);
    if (i >= 80) {
      CLK cLK = dYY.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
      if (cLK != null)
        return new dYY(paramInt5, paramRandom, cLK, paramInt4); 
    } else if (i >= 70) {
      CLK cLK = jXR.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
      if (cLK != null)
        return new jXR(paramInt5, paramRandom, cLK, paramInt4); 
    } else {
      CLK cLK = ZeN.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4);
      if (cLK != null)
        return new ZeN(paramInt5, paramRandom, cLK, paramInt4); 
    } 
    return null;
  }
  
  static fKu[] Dne() {
    return Dne;
  }
  
  static bvz Dne(bvz parambvz, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return FWm(parambvz, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  private static bvz FWm(bvz parambvz, List<bvz> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 > 8)
      return null; 
    if (Math.abs(paramInt1 - (parambvz.Dne()).Dne) <= 80 && Math.abs(paramInt3 - (parambvz.Dne()).bzF) <= 80) {
      bvz bvz1 = Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5 + 1);
      if (bvz1 != null) {
        paramList.add(bvz1);
        bvz1.Dne(parambvz, paramList, paramRandom);
      } 
      return bvz1;
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FUM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */