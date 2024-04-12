import java.util.List;
import java.util.Random;

public class JZc extends XLq {
  private int Dne;
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    boolean bool = false;
    int i;
    for (i = paramRandom.nextInt(5); i < this.Dne - 8; i += 2 + paramRandom.nextInt(5)) {
      bvz bvz1 = Dne((opc)parambvz, paramList, paramRandom, 0, i);
      if (bvz1 != null) {
        i += Math.max(bvz1.Dne.Dne(), bvz1.Dne.bzF());
        bool = true;
      } 
    } 
    for (i = paramRandom.nextInt(5); i < this.Dne - 8; i += 2 + paramRandom.nextInt(5)) {
      bvz bvz1 = FWm((opc)parambvz, paramList, paramRandom, 0, i);
      if (bvz1 != null) {
        i += Math.max(bvz1.Dne.Dne(), bvz1.Dne.bzF());
        bool = true;
      } 
    } 
    if (bool && paramRandom.nextInt(3) > 0)
      switch (this.aFZ) {
        case 0:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm, this.Dne.zGp - 2, 1, Dne());
          break;
        case 1:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm, this.Dne.bzF - 1, 2, Dne());
          break;
        case 2:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm, this.Dne.bzF, 1, Dne());
          break;
        case 3:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Qnq - 2, this.Dne.FWm, this.Dne.bzF - 1, 2, Dne());
          break;
      }  
    if (bool && paramRandom.nextInt(3) > 0)
      switch (this.aFZ) {
        case 0:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm, this.Dne.zGp - 2, 3, Dne());
          break;
        case 1:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Dne, this.Dne.FWm, this.Dne.zGp + 1, 0, Dne());
          break;
        case 2:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm, this.Dne.bzF, 3, Dne());
          break;
        case 3:
          wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Qnq - 2, this.Dne.FWm, this.Dne.zGp + 1, 0, Dne());
          break;
      }  
  }
  
  public JZc(opc paramopc, int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramopc, paramInt1);
    this.aFZ = paramInt2;
    this.Dne = paramCLK;
    this.Dne = Math.max(paramCLK.Dne(), paramCLK.bzF());
  }
  
  public static CLK Dne(opc paramopc, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    for (int i = 7 * geR.Dne(paramRandom, 3, 5); i >= 7; i -= 7) {
      CLK cLK = CLK.Dne(paramInt1, paramInt2, paramInt3, 0, 0, 0, 3, 3, i, paramInt4);
      if (bvz.Dne(paramList, cLK) == null)
        return cLK; 
    } 
    return null;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    int i = Qnq(zKP.mrb.FWm, 0);
    for (int j = this.Dne.Dne; j <= this.Dne.Qnq; j++) {
      for (int k = this.Dne.bzF; k <= this.Dne.zGp; k++) {
        if (paramCLK.Dne(j, 64, k)) {
          int m = paramQnq.aFZ(j, k) - 1;
          paramQnq.FWm(j, m, k, i, 0, 2);
        } 
      } 
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JZc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */