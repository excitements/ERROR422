import java.util.Comparator;

public class dTr implements Comparator {
  private final iSh Dne;
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((PJQ)paramObject1, (PJQ)paramObject2);
  }
  
  public dTr(iSh paramiSh) {
    this.Dne = paramiSh;
  }
  
  public int Dne(PJQ paramPJQ1, PJQ paramPJQ2) {
    double d1 = paramPJQ1.Dne(this.Dne.Dne, this.Dne.FWm, this.Dne.bzF);
    double d2 = paramPJQ2.Dne(this.Dne.Dne, this.Dne.FWm, this.Dne.bzF);
    return (d1 < d2) ? -1 : ((d1 > d2) ? 1 : 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dTr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */