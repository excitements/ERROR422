import java.util.Comparator;

final class mdF implements Comparator {
  public int Dne(OHz paramOHz1, OHz paramOHz2) {
    return (paramOHz1.Dne() > paramOHz2.Dne()) ? 1 : ((paramOHz1.Dne() < paramOHz2.Dne()) ? -1 : 0);
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((OHz)paramObject1, (OHz)paramObject2);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mdF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */