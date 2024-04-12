public class Auu extends cMv {
  private int Qnq;
  
  private float Dne;
  
  private int Dne;
  
  private int bzF;
  
  private float bzF;
  
  private float FWm;
  
  private FUH FWm;
  
  private int FWm = 0;
  
  private final FUH Dne;
  
  private final vjn Dne = -1;
  
  public Auu(vjn paramvjn, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2) {
    if (!(paramvjn instanceof FUH))
      throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob"); 
    this.Dne = paramvjn;
    this.Dne = paramvjn;
    this.Dne = paramFloat1;
    this.bzF = paramInt1;
    this.Qnq = paramInt2;
    this.FWm = paramFloat2;
    this.bzF = paramFloat2 * paramFloat2;
    Dne(3);
  }
  
  public boolean FWm() {
    return (Dne() || !this.Dne.Dne().bzF());
  }
  
  public Auu(vjn paramvjn, float paramFloat1, int paramInt, float paramFloat2) {
    this(paramvjn, paramFloat1, paramInt, paramInt, paramFloat2);
  }
  
  public void FWm() {
    this.FWm = null;
    this.FWm = 0;
    this.Dne = -1;
  }
  
  public void bzF() {
    double d = this.Dne.Dne(this.FWm.div, this.FWm.Dne.FWm, this.FWm.mrb);
    boolean bool = this.Dne.Dne().Dne(this.FWm);
    if (bool) {
      this.FWm++;
    } else {
      this.FWm = 0;
    } 
    if (d <= this.bzF && this.FWm >= 20) {
      this.Dne.Dne().FWm();
    } else {
      this.Dne.Dne().Dne(this.FWm, this.Dne);
    } 
    this.Dne.Dne().Dne(this.FWm, 30.0F, 30.0F);
    if (--this.Dne == null) {
      if (d > this.bzF || !bool)
        return; 
      float f1 = geR.Dne(d) / this.FWm;
      float f2 = f1;
      if (f1 < 0.1F)
        f2 = 0.1F; 
      if (f2 > 1.0F)
        f2 = 1.0F; 
      this.Dne.Dne(this.FWm, f2);
      this.Dne = geR.Dne(f1 * (this.Qnq - this.bzF) + this.bzF);
    } else if (this.Dne < null) {
      float f = geR.Dne(d) / this.FWm;
      this.Dne = geR.Dne(f * (this.Qnq - this.bzF) + this.bzF);
    } 
  }
  
  public boolean Dne() {
    FUH fUH = this.Dne.bzF();
    if (fUH == null)
      return false; 
    this.FWm = fUH;
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Auu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */