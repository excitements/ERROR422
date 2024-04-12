public class ReV extends cMv {
  float FWm;
  
  private FUH Dne;
  
  float Dne;
  
  private int Dne;
  
  private BRM Dne;
  
  private boolean Dne;
  
  private float bzF;
  
  Qnq Dne;
  
  private KFZ Dne;
  
  public void FWm() {
    this.Dne = null;
    this.Dne.FWm();
    this.Dne.Dne().Dne(this.Dne);
  }
  
  public boolean Dne() {
    FUH fUH = this.Dne.aFZ();
    if (fUH == null)
      return false; 
    if (this.Dne.ICU())
      return false; 
    if (this.Dne.Dne(fUH) < (this.FWm * this.FWm))
      return false; 
    this.Dne = (KFZ)fUH;
    return true;
  }
  
  public void bzF() {
    this.Dne.Dne().Dne((sMa)this.Dne, 10.0F, this.Dne.udO());
    if (!this.Dne.ICU() && --this.Dne <= null) {
      this.Dne = 10;
      if (!this.Dne.Dne((FUH)this.Dne, this.bzF) && this.Dne.Dne((sMa)this.Dne) >= 144.0D) {
        int i = geR.FWm(((FUH)this.Dne).div) - 2;
        int j = geR.FWm(((FUH)this.Dne).mrb) - 2;
        int k = geR.FWm(((FUH)this.Dne).Dne.FWm);
        for (byte b = 0; b <= 4; b++) {
          for (byte b1 = 0; b1 <= 4; b1++) {
            if ((b < 1 || b1 < 1 || b > 3 || b1 > 3) && this.Dne.IjH(i + b, k - 1, j + b1) && !this.Dne.DyG(i + b, k, j + b1) && !this.Dne.DyG(i + b, k + 1, j + b1)) {
              this.Dne.FWm(((i + b) + 0.5F), k, ((j + b1) + 0.5F), ((BRM)this.Dne).mrb, ((BRM)this.Dne).XHL);
              this.Dne.FWm();
              return;
            } 
          } 
        } 
      } 
    } 
  }
  
  public boolean FWm() {
    return (!this.Dne.bzF() && this.Dne.Dne((sMa)this.Dne) > (this.Dne * this.Dne) && !this.Dne.ICU());
  }
  
  public ReV(BRM paramBRM, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.Dne = (KFZ)paramBRM;
    this.Dne = (KFZ)paramBRM.Dne;
    this.bzF = paramFloat1;
    this.Dne = paramBRM.Dne();
    this.FWm = paramFloat2;
    this.Dne = paramFloat3;
    Dne(3);
  }
  
  public void Dne() {
    this.Dne = false;
    this.Dne = this.Dne.Dne().Dne();
    this.Dne.Dne().Dne(false);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ReV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */