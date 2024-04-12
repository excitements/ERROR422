public class fsj extends Sgm {
  static {
  
  }
  
  protected fsj(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    super(paramFloat1, paramFloat2, paramInt1, paramInt2);
  }
  
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
  
  public fsj(float paramFloat, boolean paramBoolean) {
    super(paramFloat, 0.0F, 64, paramBoolean ? 32 : 64);
  }
  
  public fsj() {
    this(0.0F, false);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fsj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */