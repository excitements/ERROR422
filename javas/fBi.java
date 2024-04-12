public class fBi {
  private int Qnq;
  
  private int FWm;
  
  private int Dne;
  
  private int bzF;
  
  public fBi Dne(fBi paramfBi) {
    int i = this.Dne;
    int j = this.FWm;
    int k = this.Dne + this.bzF;
    int m = this.FWm + this.Qnq;
    int n = paramfBi.Dne();
    int i1 = paramfBi.FWm();
    int i2 = n + paramfBi.bzF();
    int i3 = i1 + paramfBi.Qnq();
    this.Dne = Math.max(i, n);
    this.FWm = Math.max(j, i1);
    this.bzF = Math.max(0, Math.min(k, i2) - this.Dne);
    this.Qnq = Math.max(0, Math.min(m, i3) - this.FWm);
    return this;
  }
  
  public fBi(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public int bzF() {
    return this.bzF;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public int Qnq() {
    return this.Qnq;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fBi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */