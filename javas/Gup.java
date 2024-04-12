public final class Gup implements Comparable {
  public double Dne;
  
  public String Dne;
  
  public double FWm;
  
  public int Dne() {
    return (this.Dne.hashCode() & 0xAAAAAA) + 4473924;
  }
  
  public int Dne(Gup paramGup) {
    return (paramGup.Dne < this.Dne) ? -1 : ((paramGup.Dne > this.Dne) ? 1 : paramGup.Dne.compareTo(this.Dne));
  }
  
  public int compareTo(Object paramObject) {
    return Dne((Gup)paramObject);
  }
  
  public Gup(String paramString, double paramDouble1, double paramDouble2) {
    this.Dne = paramString;
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Gup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */