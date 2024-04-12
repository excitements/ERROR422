public class IJm {
  private int FWm;
  
  private int bzF;
  
  private double Dne;
  
  private int Dne;
  
  private double FWm;
  
  public int Dne() {
    return this.Dne;
  }
  
  public double Dne() {
    return this.Dne;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public IJm(fZI paramfZI, int paramInt1, int paramInt2) {
    char c;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = 1;
    ulE ulE = paramfZI.IjH;
    if (ulE == null)
      c = 'Ϩ'; 
    while (this.bzF < c && this.Dne / (this.bzF + 1) >= 320 && this.FWm / (this.bzF + 1) >= 240)
      this.bzF++; 
    this.Dne = this.Dne / this.bzF;
    this.FWm = this.FWm / this.bzF;
    this.Dne = geR.bzF(this.Dne);
    this.FWm = geR.bzF(this.FWm);
  }
  
  public double FWm() {
    return this.FWm;
  }
  
  public int bzF() {
    return this.bzF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\IJm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */