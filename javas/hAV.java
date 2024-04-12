import java.util.Comparator;

public class hAV implements Comparator {
  private FUH Dne;
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((snt)paramObject1, (snt)paramObject2);
  }
  
  public hAV(FUH paramFUH) {
    this.Dne = paramFUH;
  }
  
  public int Dne(snt paramsnt1, snt paramsnt2) {
    if (paramsnt1.Dne != null && paramsnt2.Dne == null)
      return 1; 
    if (paramsnt2.Dne != null && paramsnt1.Dne == null)
      return -1; 
    double d1 = paramsnt1.Dne(this.Dne);
    double d2 = paramsnt2.Dne(this.Dne);
    return (d1 < d2) ? 1 : ((d1 > d2) ? -1 : ((paramsnt1.udO < paramsnt2.udO) ? 1 : -1));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hAV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */