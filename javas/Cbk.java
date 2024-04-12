public class Cbk extends CAZ {
  private int Vxn = 128;
  
  public Cbk(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
    this.Zpi *= 0.20000000298023224D;
    if (paramDouble4 == 0.0D && paramDouble6 == 0.0D) {
      this.XHL *= 0.10000000149011612D;
      this.kGO *= 0.10000000149011612D;
    } 
    this.Qnq *= 0.75F;
    this.Qnq = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
    this.kGO = false;
  }
  
  public void Dne(int paramInt) {
    this.Vxn = paramInt;
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f = (this.bzF + paramFloat1) / this.Qnq * 32.0F;
    if (f < 0.0F)
      f = 0.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    super.Dne(paramWAR, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void Dne() {
    this.aFZ = this.div;
    this.zGp = this.IjH;
    this.DyG = this.mrb;
    if (this.bzF++ >= this.Qnq)
      g_(); 
    bzF(this.Vxn + 7 - this.bzF * 8 / this.Qnq);
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


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Cbk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */