import java.util.ArrayList;
import java.util.Random;

class AAE extends JhS {
  public AAE(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    dlc.Dne();
    Kci kci = new Kci(0, paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
    this.Dne.add(kci);
    kci.Dne(kci, this.Dne, paramRandom);
    ArrayList<bvz> arrayList = kci.Dne;
    while (!arrayList.isEmpty()) {
      int i = paramRandom.nextInt(arrayList.size());
      bvz bvz = arrayList.remove(i);
      bvz.Dne(kci, this.Dne, paramRandom);
    } 
    Dne();
    Dne(paramQnq, paramRandom, 10);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AAE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */