public class BRZ extends CAZ {
  float Dne;
  
  public BRZ(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    this(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 2.0F);
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f = (this.bzF + paramFloat1) / this.Qnq * 32.0F;
    if (f < 0.0F)
      f = 0.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    this.Qnq = this.Dne * f;
    super.Dne(paramWAR, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    if (this.bzF++ >= this.Qnq)
      g_(); 
    Dne(this.XHL, this.Zpi, this.kGO);
    if (this.IjH == this.zGp) {
      this.XHL *= 1.1D;
      this.kGO *= 1.1D;
    } 
    this.XHL *= 0.8600000143051147D;
    this.Zpi *= 0.8600000143051147D;
    this.kGO *= 0.8600000143051147D;
    if (this.aFZ != 0.0F) {
      this.XHL *= 0.699999988079071D;
      this.kGO *= 0.699999988079071D;
    } 
  }
  
  public BRZ(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    this.XHL *= 0.009999999776482582D;
    this.Zpi *= 0.009999999776482582D;
    this.kGO *= 0.009999999776482582D;
    this.Zpi += 0.1D;
    this.Qnq *= 0.75F;
    this.Qnq *= paramFloat;
    this.Dne = this.Qnq;
    this.Qnq = 16;
    this.kGO = false;
    bzF(80);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BRZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */