import java.util.Random;

public class oMk extends zKP {
  private final int Dne;
  
  private gDn Dne;
  
  private static final String[] Dne = new String[] { "mushroom_skin_brown", "mushroom_skin_red" };
  
  private gDn FWm;
  
  private gDn[] Dne;
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[Dne.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne((String)Dne[b]); 
    this.FWm = paramRbp.Dne("mushroom_inside");
    this.Dne = (gDn[])paramRbp.Dne("mushroom_skin_stem");
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt2 == 10 && paramInt1 > 1) ? (gDn)this.Dne : ((paramInt2 >= 1 && paramInt2 <= 9 && paramInt1 == 1) ? this.Dne[this.Dne] : ((paramInt2 >= 1 && paramInt2 <= 3 && paramInt1 == 2) ? this.Dne[this.Dne] : ((paramInt2 >= 7 && paramInt2 <= 9 && paramInt1 == 3) ? this.Dne[this.Dne] : (((paramInt2 == 1 || paramInt2 == 4 || paramInt2 == 7) && paramInt1 == 4) ? this.Dne[this.Dne] : (((paramInt2 == 3 || paramInt2 == 6 || paramInt2 == 9) && paramInt1 == 5) ? this.Dne[this.Dne] : ((paramInt2 == 14) ? this.Dne[this.Dne] : ((paramInt2 == 15) ? (gDn)this.Dne : this.FWm)))))));
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return zKP.bzF.FWm + this.Dne;
  }
  
  public oMk(int paramInt1, KFd paramKFd, int paramInt2) {
    super(paramInt1, paramKFd);
    this.Dne = paramInt2;
  }
  
  public int Dne(Random paramRandom) {
    int i = paramRandom.nextInt(10) - 7;
    if (i < 0)
      i = 0; 
    return i;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.bzF.FWm + this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oMk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */