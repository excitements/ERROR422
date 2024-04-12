public class Lur {
  private final Object Dne;
  
  private final Object FWm;
  
  protected Lur(Object paramObject1, Object paramObject2) {
    this.Dne = paramObject1;
    this.FWm = paramObject2;
  }
  
  public Object FWm() {
    return this.FWm;
  }
  
  public Object Dne() {
    return this.Dne;
  }
  
  public static Lur Dne(Object paramObject1, Object paramObject2) {
    return new Lur(paramObject1, paramObject2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */