public class vAj extends cMv {
  int Dne;
  
  Qnq Dne;
  
  FUH FWm;
  
  FUH Dne = false;
  
  public boolean FWm() {
    return !this.FWm.udO() ? false : ((this.Dne.Dne(this.FWm) > 225.0D) ? false : ((!this.Dne.Dne().bzF() || Dne())));
  }
  
  public vAj(FUH paramFUH) {
    this.Dne = paramFUH;
    this.Dne = paramFUH.Dne;
    Dne(3);
  }
  
  public boolean Dne() {
    FUH fUH = this.Dne.bzF();
    if (fUH == null)
      return false; 
    this.FWm = fUH;
    return true;
  }
  
  public void FWm() {
    this.FWm = null;
    this.Dne.Dne().FWm();
  }
  
  public void bzF() {
    this.Dne.Dne().Dne(this.FWm, 30.0F, 30.0F);
    double d1 = (this.Dne.ooe * 2.0F * this.Dne.ooe * 2.0F);
    double d2 = this.Dne.Dne(this.FWm.div, this.FWm.Dne.FWm, this.FWm.mrb);
    float f = 0.23F;
    if (d2 > d1 && d2 < 16.0D) {
      f = 0.4F;
    } else if (d2 < 225.0D) {
      f = 0.18F;
    } 
    this.Dne.Dne().Dne(this.FWm, f);
    this.Dne = Math.max(this.Dne - 1, 0);
    if (d2 <= d1 && this.Dne <= null) {
      this.Dne = 20;
      this.Dne.bzF(this.FWm);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vAj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */