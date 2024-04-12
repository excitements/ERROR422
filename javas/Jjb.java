public class Jjb {
  private int FWm = 0;
  
  private int Qnq = 0;
  
  private int bzF = 0;
  
  private int Dne = 1;
  
  public int Qnq() {
    return this.Qnq;
  }
  
  public String toString() {
    String str = Integer.toString(this.FWm);
    if (this.Dne > 1)
      str = this.Dne + "x" + str; 
    if (this.bzF > 0)
      str = str + ":" + this.bzF; 
    return str;
  }
  
  public Jjb(int paramInt1, int paramInt2, int paramInt3) {
    this(paramInt1, paramInt2);
    this.bzF = paramInt3;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public Jjb(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public int bzF() {
    return this.bzF;
  }
  
  public void Dne(int paramInt) {
    this.Qnq = paramInt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Jjb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */