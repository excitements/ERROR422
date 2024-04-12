import java.util.ArrayList;
import java.util.Random;

class mfU extends JhS {
  public mfU(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    Tps tps = new Tps(paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
    this.Dne.add(tps);
    tps.Dne(tps, this.Dne, paramRandom);
    ArrayList<bvz> arrayList = tps.Dne;
    while (!arrayList.isEmpty()) {
      int i = paramRandom.nextInt(arrayList.size());
      bvz bvz = arrayList.remove(i);
      bvz.Dne(tps, this.Dne, paramRandom);
    } 
    Dne();
    Dne(paramQnq, paramRandom, 48, 70);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mfU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */