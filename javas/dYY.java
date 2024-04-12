import java.util.List;
import java.util.Random;

public class dYY extends bvz {
  private final boolean Dne;
  
  private final int Dne;
  
  public static CLK Dne(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    CLK cLK = new CLK(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
    if (paramRandom.nextInt(4) == 0)
      cLK.aFZ += 4; 
    switch (paramInt4) {
      case 0:
        cLK.Dne = paramInt1 - 1;
        cLK.Qnq = paramInt1 + 3;
        cLK.zGp = paramInt3 + 4;
        break;
      case 1:
        cLK.Dne = paramInt1 - 4;
        cLK.bzF = paramInt3 - 1;
        cLK.zGp = paramInt3 + 3;
        break;
      case 2:
        cLK.Dne = paramInt1 - 1;
        cLK.Qnq = paramInt1 + 3;
        cLK.bzF = paramInt3 - 4;
        break;
      case 3:
        cLK.Qnq = paramInt1 + 4;
        cLK.bzF = paramInt3 - 1;
        cLK.zGp = paramInt3 + 3;
        break;
    } 
    return (bvz.Dne(paramList, cLK) != null) ? null : cLK;
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    if (this.Dne != 0) {
      Dne(paramQnq, paramCLK, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.bzF, this.Dne.Qnq - 1, this.Dne.FWm + 3 - 1, this.Dne.zGp, 0, 0, false);
      Dne(paramQnq, paramCLK, this.Dne.Dne, this.Dne.FWm, this.Dne.bzF + 1, this.Dne.Qnq, this.Dne.FWm + 3 - 1, this.Dne.zGp - 1, 0, 0, false);
      Dne(paramQnq, paramCLK, this.Dne.Dne + 1, this.Dne.aFZ - 2, this.Dne.bzF, this.Dne.Qnq - 1, this.Dne.aFZ, this.Dne.zGp, 0, 0, false);
      Dne(paramQnq, paramCLK, this.Dne.Dne, this.Dne.aFZ - 2, this.Dne.bzF + 1, this.Dne.Qnq, this.Dne.aFZ, this.Dne.zGp - 1, 0, 0, false);
      Dne(paramQnq, paramCLK, this.Dne.Dne + 1, this.Dne.FWm + 3, this.Dne.bzF + 1, this.Dne.Qnq - 1, this.Dne.FWm + 3, this.Dne.zGp - 1, 0, 0, false);
    } else {
      Dne(paramQnq, paramCLK, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.bzF, this.Dne.Qnq - 1, this.Dne.aFZ, this.Dne.zGp, 0, 0, false);
      Dne(paramQnq, paramCLK, this.Dne.Dne, this.Dne.FWm, this.Dne.bzF + 1, this.Dne.Qnq, this.Dne.aFZ, this.Dne.zGp - 1, 0, 0, false);
    } 
    Dne(paramQnq, paramCLK, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.bzF + 1, this.Dne.Dne + 1, this.Dne.aFZ, this.Dne.bzF + 1, ((zKP)zKP.Qnq).FWm, 0, false);
    Dne(paramQnq, paramCLK, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.zGp - 1, this.Dne.Dne + 1, this.Dne.aFZ, this.Dne.zGp - 1, ((zKP)zKP.Qnq).FWm, 0, false);
    Dne(paramQnq, paramCLK, this.Dne.Qnq - 1, this.Dne.FWm, this.Dne.bzF + 1, this.Dne.Qnq - 1, this.Dne.aFZ, this.Dne.bzF + 1, ((zKP)zKP.Qnq).FWm, 0, false);
    Dne(paramQnq, paramCLK, this.Dne.Qnq - 1, this.Dne.FWm, this.Dne.zGp - 1, this.Dne.Qnq - 1, this.Dne.aFZ, this.Dne.zGp - 1, ((zKP)zKP.Qnq).FWm, 0, false);
    for (int i = this.Dne.Dne; i <= this.Dne.Qnq; i++) {
      for (int j = this.Dne.bzF; j <= this.Dne.zGp; j++) {
        int k = Dne(paramQnq, i, this.Dne.FWm - 1, j, paramCLK);
        if (k == 0)
          Dne(paramQnq, ((zKP)zKP.Qnq).FWm, 0, i, this.Dne.FWm - 1, j, paramCLK); 
      } 
    } 
    return true;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    int i = Dne();
    switch (this.Dne) {
      case 0:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.zGp + 1, 0, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm, this.Dne.bzF + 1, 1, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm, this.Dne.bzF + 1, 3, i);
        break;
      case 1:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.bzF - 1, 2, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.zGp + 1, 0, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm, this.Dne.bzF + 1, 1, i);
        break;
      case 2:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.bzF - 1, 2, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm, this.Dne.bzF + 1, 1, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm, this.Dne.bzF + 1, 3, i);
        break;
      case 3:
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.bzF - 1, 2, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm, this.Dne.zGp + 1, 0, i);
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm, this.Dne.bzF + 1, 3, i);
        break;
    } 
    if (this.Dne != 0) {
      if (paramRandom.nextBoolean())
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm + 3 + 1, this.Dne.bzF - 1, 2, i); 
      if (paramRandom.nextBoolean())
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm + 3 + 1, this.Dne.bzF + 1, 1, i); 
      if (paramRandom.nextBoolean())
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm + 3 + 1, this.Dne.bzF + 1, 3, i); 
      if (paramRandom.nextBoolean())
        FUM.Dne(parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.FWm + 3 + 1, this.Dne.zGp + 1, 0, i); 
    } 
  }
  
  public dYY(int paramInt1, Random paramRandom, CLK paramCLK, int paramInt2) {
    super(paramInt1);
    this.Dne = paramInt2;
    this.Dne = paramCLK;
    this.Dne = (paramCLK.FWm() > 3) ? 1 : 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dYY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */