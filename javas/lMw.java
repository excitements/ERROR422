public class lMw extends CAZ {
  private KFd Dne;
  
  private int Vxn;
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    if (this.Dne == KFd.div) {
      this.zGp = 0.2F;
      this.DyG = 0.3F;
      this.div = 1.0F;
    } else {
      this.zGp = 1.0F;
      this.DyG = 16.0F / (40 - this.Vxn + 16);
      this.div = 4.0F / (40 - this.Vxn + 8);
    } 
    this.Zpi -= this.aFZ;
    if (this.Vxn-- > 0) {
      this.XHL *= 0.02D;
      this.Zpi *= 0.02D;
      this.kGO *= 0.02D;
      bzF(113);
    } else {
      bzF(112);
    } 
    Dne(this.XHL, this.Zpi, this.kGO);
    this.XHL *= 0.9800000190734863D;
    this.Zpi *= 0.9800000190734863D;
    this.kGO *= 0.9800000190734863D;
    if (this.Qnq-- <= 0.0F)
      g_(); 
    if (this.aFZ != 0.0F) {
      if (this.Dne == KFd.div) {
        g_();
        this.Dne.Dne("splash", this.div, this.IjH, this.mrb, 0.0D, 0.0D, 0.0D);
      } else {
        bzF(114);
      } 
      this.XHL *= 0.699999988079071D;
      this.kGO *= 0.699999988079071D;
    } 
    KFd kFd = this.Dne.Dne(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb));
    if (kFd.Qnq() || kFd.Dne()) {
      double d = ((geR.FWm(this.IjH) + 1) - byt.Dne(this.Dne.bzF(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb))));
      if (this.IjH < d)
        g_(); 
    } 
  }
  
  public int Dne(float paramFloat) {
    return (this.Dne == KFd.div) ? super.Dne(paramFloat) : 257;
  }
  
  public float Dne(float paramFloat) {
    return (this.Dne == KFd.div) ? super.Dne(paramFloat) : 1.0F;
  }
  
  public lMw(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, KFd paramKFd) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    (this.kGO = 0.0D).XHL = this;
    if (paramKFd == KFd.div) {
      this.zGp = 0.0F;
      this.DyG = 0.0F;
      this.div = 1.0F;
    } else {
      this.zGp = 1.0F;
      this.DyG = 0.0F;
      this.div = 0.0F;
    } 
    bzF(113);
    Dne(0.01F, 0.01F);
    this.aFZ = 0.06F;
    this.Dne = paramKFd;
    this.Vxn = 40;
    this.Qnq = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
    this.Zpi = this.kGO = 0.0D;
    (this.kGO = 0.0D).XHL = this;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lMw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */