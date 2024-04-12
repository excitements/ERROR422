public class dhs extends CAZ {
  float Dne;
  
  public dhs(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    this.XHL *= 0.10000000149011612D;
    this.Zpi *= 0.10000000149011612D;
    this.kGO *= 0.10000000149011612D;
    if (paramFloat2 == 0.0F)
      paramFloat2 = 1.0F; 
    float f = (float)Math.random() * 0.4F + 0.6F;
    this.zGp = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat2 * f;
    this.DyG = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat3 * f;
    this.div = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat4 * f;
    this.Qnq *= 0.75F;
    this.Qnq *= paramFloat1;
    this.Dne = this.Qnq;
    this.Qnq = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
    this.Qnq = (int)(this.Qnq * paramFloat1);
    this.kGO = false;
  }
  
  public dhs(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3) {
    this(paramQnq, paramDouble1, paramDouble2, paramDouble3, 1.0F, paramFloat1, paramFloat2, paramFloat3);
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


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dhs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */