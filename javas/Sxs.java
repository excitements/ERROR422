public class Sxs {
  public final int Dne;
  
  public final int FWm;
  
  public boolean equals(Object paramObject) {
    Sxs sxs = (Sxs)paramObject;
    return (sxs.Dne == this.Dne && sxs.FWm == this.FWm);
  }
  
  public EyB Dne(int paramInt) {
    return new EyB(Dne(), paramInt, FWm());
  }
  
  public static long Dne(int paramInt1, int paramInt2) {
    return paramInt1 & 0xFFFFFFFFL | (paramInt2 & 0xFFFFFFFFL) << 32L;
  }
  
  public String toString() {
    return "[" + this.Dne + ", " + this.FWm + "]";
  }
  
  public Sxs(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public int FWm() {
    return (this.FWm << 4) + 8;
  }
  
  public int hashCode() {
    long l = Dne(this.Dne, this.FWm);
    int i = (int)l;
    int j = (int)(l >> 32L);
    return i ^ j;
  }
  
  public int Dne() {
    return (this.Dne << 4) + 8;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Sxs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */