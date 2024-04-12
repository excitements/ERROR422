import java.util.Random;

public class kTB extends zKP {
  private gDn Dne;
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt1 != 1 && paramInt1 != 0) ? this.Qnq : this.Dne;
  }
  
  public int Dne(int paramInt, Random paramRandom) {
    int i = Dne(paramRandom) + paramRandom.nextInt(1 + paramInt);
    if (i > 9)
      i = 9; 
    return i;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("melon_side");
    this.Dne = paramRbp.Dne("melon_top");
  }
  
  protected kTB(int paramInt) {
    super(paramInt, KFd.Fnk);
    Dne(JcN.Dne);
  }
  
  public int Dne(Random paramRandom) {
    return 3 + paramRandom.nextInt(5);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.gwq.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kTB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */