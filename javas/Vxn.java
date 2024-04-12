public class Vxn implements Comparable {
  public int Dne;
  
  private static long FWm = 0L;
  
  public long Dne;
  
  private long bzF;
  
  public int FWm;
  
  public int Qnq;
  
  public int bzF;
  
  public int aFZ;
  
  public int compareTo(Object paramObject) {
    return Dne((Vxn)paramObject);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Vxn))
      return false; 
    Vxn vxn = (Vxn)paramObject;
    return (this.Dne == vxn.Dne && this.FWm == vxn.FWm && this.bzF == vxn.bzF && zKP.Dne(this.Qnq, vxn.Qnq));
  }
  
  public String toString() {
    return this.Qnq + ": (" + this.Dne + ", " + this.FWm + ", " + this.bzF + "), " + this.Dne + ", " + this.aFZ + ", " + this.bzF;
  }
  
  public Vxn Dne(long paramLong) {
    this.Dne = paramLong;
    return this;
  }
  
  public Vxn(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    FWm++;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
  }
  
  public int Dne(Vxn paramVxn) {
    return (this.Dne < paramVxn.Dne) ? -1 : ((this.Dne > paramVxn.Dne) ? 1 : ((this.aFZ != paramVxn.aFZ) ? (this.aFZ - paramVxn.aFZ) : ((this.bzF < paramVxn.bzF) ? -1 : ((this.bzF > paramVxn.bzF) ? 1 : 0))));
  }
  
  public void Dne(int paramInt) {
    this.aFZ = paramInt;
  }
  
  public int hashCode() {
    return (this.Dne * 1024 * 1024 + this.bzF * 1024 + this.FWm) * 256;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Vxn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */