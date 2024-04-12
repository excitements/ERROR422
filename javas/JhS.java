import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class JhS {
  protected CLK Dne;
  
  protected LinkedList Dne = new LinkedList();
  
  public LinkedList Dne() {
    return this.Dne;
  }
  
  public CLK Dne() {
    return (CLK)this.Dne;
  }
  
  public void Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    Iterator<bvz> iterator = this.Dne.iterator();
    while (iterator.hasNext()) {
      bvz bvz = iterator.next();
      if (bvz.Dne().Dne(paramCLK) && !bvz.Dne(paramQnq, paramRandom, paramCLK))
        iterator.remove(); 
    } 
  }
  
  protected void Dne() {
    this.Dne = (LinkedList)CLK.Dne();
    for (bvz bvz : this.Dne)
      this.Dne.Dne(bvz.Dne()); 
  }
  
  protected void Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    int j;
    int i = paramInt2 - paramInt1 + 1 - this.Dne.FWm();
    boolean bool = true;
    if (i > 1) {
      j = paramInt1 + paramRandom.nextInt(i);
    } else {
      j = paramInt1;
    } 
    int k = j - ((CLK)this.Dne).FWm;
    this.Dne.Dne(0, k, 0);
    for (bvz bvz : this.Dne)
      bvz.Dne().Dne(0, k, 0); 
  }
  
  public boolean Dne() {
    return true;
  }
  
  protected void Dne(Qnq paramQnq, Random paramRandom, int paramInt) {
    int i = 63 - paramInt;
    int j = this.Dne.FWm() + 1;
    if (j < i)
      j += paramRandom.nextInt(i - j); 
    int k = j - ((CLK)this.Dne).aFZ;
    this.Dne.Dne(0, k, 0);
    for (bvz bvz : this.Dne)
      bvz.Dne().Dne(0, k, 0); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JhS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */