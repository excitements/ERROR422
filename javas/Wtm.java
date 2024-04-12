import java.util.Comparator;

public class Wtm implements Comparator {
  private sMa Dne;
  
  final AmF Dne;
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((sMa)paramObject1, (sMa)paramObject2);
  }
  
  public Wtm(AmF paramAmF, sMa paramsMa) {
    this.Dne = paramAmF;
    this.Dne = (AmF)paramsMa;
  }
  
  public int Dne(sMa paramsMa1, sMa paramsMa2) {
    double d1 = this.Dne.Dne(paramsMa1);
    double d2 = this.Dne.Dne(paramsMa2);
    return (d1 < d2) ? -1 : ((d1 > d2) ? 1 : 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Wtm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */