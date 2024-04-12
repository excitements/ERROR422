import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class dnY extends bvz {
  private List Dne = new LinkedList();
  
  public dnY(int paramInt1, Random paramRandom, int paramInt2, int paramInt3) {
    super(paramInt1);
    this.Dne = (List)new CLK(paramInt2, 50, paramInt3, paramInt2 + 7 + paramRandom.nextInt(6), 54 + paramRandom.nextInt(6), paramInt3 + 7 + paramRandom.nextInt(6));
  }
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    if (Dne(paramQnq, paramCLK))
      return false; 
    Dne(paramQnq, paramCLK, ((CLK)this.Dne).Dne, ((CLK)this.Dne).FWm, ((CLK)this.Dne).bzF, ((CLK)this.Dne).Qnq, ((CLK)this.Dne).FWm, ((CLK)this.Dne).zGp, zKP.FWm.FWm, 0, true);
    Dne(paramQnq, paramCLK, ((CLK)this.Dne).Dne, ((CLK)this.Dne).FWm + 1, ((CLK)this.Dne).bzF, ((CLK)this.Dne).Qnq, Math.min(((CLK)this.Dne).FWm + 3, ((CLK)this.Dne).aFZ), ((CLK)this.Dne).zGp, 0, 0, false);
    for (CLK cLK : this.Dne)
      Dne(paramQnq, paramCLK, cLK.Dne, cLK.aFZ - 2, cLK.bzF, cLK.Qnq, cLK.aFZ, cLK.zGp, 0, 0, false); 
    Dne(paramQnq, paramCLK, ((CLK)this.Dne).Dne, ((CLK)this.Dne).FWm + 4, ((CLK)this.Dne).bzF, ((CLK)this.Dne).Qnq, ((CLK)this.Dne).aFZ, ((CLK)this.Dne).zGp, 0, false);
    return true;
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    int i = Dne();
    int j = this.Dne.FWm() - 3 - 1;
    if (j <= 0)
      j = 1; 
    int k;
    for (k = 0; k < this.Dne.Dne(); k += 4) {
      k += paramRandom.nextInt(this.Dne.Dne());
      if (k + 3 > this.Dne.Dne())
        break; 
      bvz bvz1 = FUM.Dne(parambvz, paramList, paramRandom, ((CLK)this.Dne).Dne + k, ((CLK)this.Dne).FWm + paramRandom.nextInt(j) + 1, ((CLK)this.Dne).bzF - 1, 2, i);
      if (bvz1 != null) {
        CLK cLK = bvz1.Dne();
        this.Dne.add(new CLK(cLK.Dne, cLK.FWm, ((CLK)this.Dne).bzF, cLK.Qnq, cLK.aFZ, ((CLK)this.Dne).bzF + 1));
      } 
    } 
    for (k = 0; k < this.Dne.Dne(); k += 4) {
      k += paramRandom.nextInt(this.Dne.Dne());
      if (k + 3 > this.Dne.Dne())
        break; 
      bvz bvz1 = FUM.Dne(parambvz, paramList, paramRandom, ((CLK)this.Dne).Dne + k, ((CLK)this.Dne).FWm + paramRandom.nextInt(j) + 1, ((CLK)this.Dne).zGp + 1, 0, i);
      if (bvz1 != null) {
        CLK cLK = bvz1.Dne();
        this.Dne.add(new CLK(cLK.Dne, cLK.FWm, ((CLK)this.Dne).zGp - 1, cLK.Qnq, cLK.aFZ, ((CLK)this.Dne).zGp));
      } 
    } 
    for (k = 0; k < this.Dne.bzF(); k += 4) {
      k += paramRandom.nextInt(this.Dne.bzF());
      if (k + 3 > this.Dne.bzF())
        break; 
      bvz bvz1 = FUM.Dne(parambvz, paramList, paramRandom, ((CLK)this.Dne).Dne - 1, ((CLK)this.Dne).FWm + paramRandom.nextInt(j) + 1, ((CLK)this.Dne).bzF + k, 1, i);
      if (bvz1 != null) {
        CLK cLK = bvz1.Dne();
        this.Dne.add(new CLK(((CLK)this.Dne).Dne, cLK.FWm, cLK.bzF, ((CLK)this.Dne).Dne + 1, cLK.aFZ, cLK.zGp));
      } 
    } 
    for (k = 0; k < this.Dne.bzF(); k += 4) {
      k += paramRandom.nextInt(this.Dne.bzF());
      if (k + 3 > this.Dne.bzF())
        break; 
      bvz bvz1 = FUM.Dne(parambvz, paramList, paramRandom, ((CLK)this.Dne).Qnq + 1, ((CLK)this.Dne).FWm + paramRandom.nextInt(j) + 1, ((CLK)this.Dne).bzF + k, 3, i);
      if (bvz1 != null) {
        CLK cLK = bvz1.Dne();
        this.Dne.add(new CLK(((CLK)this.Dne).Qnq - 1, cLK.FWm, cLK.bzF, ((CLK)this.Dne).Qnq, cLK.aFZ, cLK.zGp));
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dnY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */