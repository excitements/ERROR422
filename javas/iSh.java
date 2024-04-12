public class iSh implements Comparable {
  public int FWm;
  
  public int bzF;
  
  public int Dne;
  
  public iSh() {}
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof iSh))
      return false; 
    iSh iSh1 = (iSh)paramObject;
    return (this.Dne == iSh1.Dne && this.FWm == iSh1.FWm && this.bzF == iSh1.bzF);
  }
  
  public int compareTo(Object paramObject) {
    return Dne((iSh)paramObject);
  }
  
  public float Dne(iSh paramiSh) {
    return Dne(paramiSh.Dne, paramiSh.FWm, paramiSh.bzF);
  }
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.Dne - paramInt1;
    int j = this.FWm - paramInt2;
    int k = this.bzF - paramInt3;
    return (i * i + j * j + k * k);
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
  
  public iSh(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
  }
  
  public int hashCode() {
    return this.Dne + this.bzF << 8 + this.FWm << 16;
  }
  
  public int Dne(iSh paramiSh) {
    return (this.FWm == paramiSh.FWm) ? ((this.bzF == paramiSh.bzF) ? (this.Dne - paramiSh.Dne) : (this.bzF - paramiSh.bzF)) : (this.FWm - paramiSh.FWm);
  }
  
  public iSh(iSh paramiSh) {
    this.Dne = paramiSh.Dne;
    this.FWm = paramiSh.FWm;
    this.bzF = paramiSh.bzF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iSh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */