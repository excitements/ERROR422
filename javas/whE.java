public class whE {
  public final int FWm;
  
  whE Dne;
  
  private final int aFZ;
  
  float bzF;
  
  int Qnq = -1;
  
  float Dne;
  
  public final int bzF;
  
  float FWm;
  
  public final int Dne;
  
  public boolean Dne = false;
  
  public int hashCode() {
    return this.aFZ;
  }
  
  public boolean Dne() {
    return (this.Qnq >= 0);
  }
  
  public float FWm(whE paramwhE) {
    float f1 = (paramwhE.Dne - this.Dne);
    float f2 = (paramwhE.FWm - this.FWm);
    float f3 = (paramwhE.bzF - this.bzF);
    return f1 * f1 + f2 * f2 + f3 * f3;
  }
  
  public String toString() {
    return this.Dne + ", " + this.FWm + ", " + this.bzF;
  }
  
  public float Dne(whE paramwhE) {
    float f1 = (paramwhE.Dne - this.Dne);
    float f2 = (paramwhE.FWm - this.FWm);
    float f3 = (paramwhE.bzF - this.bzF);
    return geR.bzF(f1 * f1 + f2 * f2 + f3 * f3);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof whE))
      return false; 
    whE whE1 = (whE)paramObject;
    return (this.aFZ == whE1.aFZ && this.Dne == whE1.Dne && this.FWm == whE1.FWm && this.bzF == whE1.bzF);
  }
  
  public static int Dne(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt2 & 0xFF | (paramInt1 & 0x7FFF) << 8 | (paramInt3 & 0x7FFF) << 24 | ((paramInt1 < 0) ? Integer.MIN_VALUE : 0) | ((paramInt3 < 0) ? 32768 : 0);
  }
  
  public whE(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.aFZ = Dne(paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\whE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */