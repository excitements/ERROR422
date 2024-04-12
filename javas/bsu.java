public class bsu extends CAZ {
  float Dne;
  
  public bsu(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    this.XHL *= 0.10000000149011612D;
    this.Zpi *= 0.10000000149011612D;
    this.kGO *= 0.10000000149011612D;
    this.XHL += paramDouble4;
    this.Zpi += paramDouble5;
    this.kGO += paramDouble6;
    this.zGp = this.DyG = this.div = (float)(Math.random() * 0.30000001192092896D);
    this.Qnq *= 0.75F;
    this.Qnq *= paramFloat;
    this.Dne = this.Qnq;
    this.Qnq = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
    this.Qnq = (int)(this.Qnq * paramFloat);
    this.kGO = false;
  }
  
  public bsu(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    this(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 1.0F);
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
    bzF(7 - this.bzF * 8 / this.Qnq);
    this.Zpi += 0.004D;
    Dne(this.XHL, this.Zpi, this.kGO);
    if (this.IjH == this.zGp) {
      this.XHL *= 1.1D;
      this.kGO *= 1.1D;
    } 
    this.XHL *= 0.9599999785423279D;
    this.Zpi *= 0.9599999785423279D;
    this.kGO *= 0.9599999785423279D;
    if (this.aFZ != 0.0F) {
      this.XHL *= 0.699999988079071D;
      this.kGO *= 0.699999988079071D;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bsu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */