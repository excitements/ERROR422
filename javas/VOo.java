public class VOo extends cMv {
  gls Dne;
  
  FUH Dne;
  
  public VOo(gls paramgls) {
    this.Dne = paramgls;
    Dne(1);
  }
  
  public boolean Dne() {
    FUH fUH = this.Dne.bzF();
    return (this.Dne.bzF() > 0 || (fUH != null && this.Dne.Dne(fUH) < 9.0D));
  }
  
  public void FWm() {
    this.Dne = null;
  }
  
  public void bzF() {
    if (this.Dne == null) {
      this.Dne.FWm(-1);
    } else if (this.Dne.Dne(this.Dne) > 49.0D) {
      this.Dne.FWm(-1);
    } else if (!this.Dne.Dne().Dne(this.Dne)) {
      this.Dne.FWm(-1);
    } else {
      this.Dne.FWm(1);
    } 
  }
  
  public void Dne() {
    this.Dne.Dne().FWm();
    this.Dne = this.Dne.bzF();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VOo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */