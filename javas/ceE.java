public class ceE {
  private int FWm;
  
  private int bzF;
  
  private int aFZ;
  
  private int Dne;
  
  private int zGp;
  
  private int Qnq;
  
  public String toString() {
    return "TE(" + this.Dne + "," + this.FWm + "," + this.bzF + ")," + this.aFZ + "," + this.zGp + "," + this.Qnq;
  }
  
  public int Qnq() {
    return this.aFZ;
  }
  
  public int aFZ() {
    return this.zGp;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public int zGp() {
    return this.Qnq;
  }
  
  public ceE(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.aFZ = paramInt5;
    this.zGp = paramInt6;
    this.Qnq = paramInt4;
  }
  
  public int bzF() {
    return this.bzF;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ceE))
      return false; 
    ceE ceE1 = (ceE)paramObject;
    return (this.Dne == ceE1.Dne && this.FWm == ceE1.FWm && this.bzF == ceE1.bzF && this.aFZ == ceE1.aFZ && this.zGp == ceE1.zGp && this.Qnq == ceE1.Qnq);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ceE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */