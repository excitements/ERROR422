public class kGJ extends Sgm {
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    float f1 = geR.Dne(this.Dne * 3.1415927F);
    float f2 = geR.Dne((1.0F - (1.0F - this.Dne) * (1.0F - this.Dne)) * 3.1415927F);
    this.Qnq.div = 0.0F;
    this.aFZ.div = 0.0F;
    this.Qnq.DyG = -(0.1F - f1 * 0.6F);
    this.aFZ.DyG = 0.1F - f1 * 0.6F;
    this.Qnq.zGp = -1.5707964F;
    this.aFZ.zGp = -1.5707964F;
    this.Qnq.zGp -= f1 * 1.2F - f2 * 0.4F;
    this.aFZ.zGp -= f1 * 1.2F - f2 * 0.4F;
    this.Qnq.div += geR.FWm(paramFloat3 * 0.09F) * 0.05F + 0.05F;
    this.aFZ.div -= geR.FWm(paramFloat3 * 0.09F) * 0.05F + 0.05F;
    this.Qnq.zGp += geR.Dne(paramFloat3 * 0.067F) * 0.05F;
    this.aFZ.zGp -= geR.Dne(paramFloat3 * 0.067F) * 0.05F;
  }
  
  public int Dne() {
    return 10;
  }
  
  public kGJ(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    super(paramFloat1, 0.0F, 64, paramBoolean ? 32 : 64);
    if (paramBoolean) {
      this.Dne = new rxL(this, 0, 0);
      this.Dne.Dne(-4.0F, -10.0F, -4.0F, 8, 6, 8, paramFloat1);
      this.Dne.Dne(0.0F, 0.0F + paramFloat2, 0.0F);
    } else {
      this.Dne = new rxL(this);
      this.Dne.Dne(0.0F, 0.0F + paramFloat2, 0.0F);
      this.Dne.Dne(0, 32).Dne(-4.0F, -10.0F, -4.0F, 8, 10, 8, paramFloat1);
      this.Dne.Dne(24, 32).Dne(-1.0F, -3.0F, -6.0F, 2, 4, 2, paramFloat1);
    } 
  }
  
  static {
  
  }
  
  public kGJ() {
    this(0.0F, 0.0F, false);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kGJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */