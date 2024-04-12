public class EyB {
  public final int bzF;
  
  public final int FWm;
  
  public final int Dne;
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof EyB))
      return false; 
    EyB eyB = (EyB)paramObject;
    return (eyB.Dne == this.Dne && eyB.FWm == this.FWm && eyB.bzF == this.bzF);
  }
  
  public EyB(chN paramchN) {
    this(geR.FWm(paramchN.Dne), geR.FWm(paramchN.FWm), geR.FWm(paramchN.bzF));
  }
  
  public EyB(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
  
  public int hashCode() {
    return this.Dne * 8976890 + this.FWm * 981131 + this.bzF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EyB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */