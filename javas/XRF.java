public class XRF extends Gor {
  public rxL Qnq;
  
  public rxL FWm;
  
  public rxL Dne;
  
  public rxL bzF;
  
  public rxL aFZ;
  
  public XRF() {
    float f1 = 4.0F;
    float f2 = 0.0F;
    this.bzF = (new rxL(this, 0, 0)).FWm(64, 64);
    this.bzF.Dne(-4.0F, -8.0F, -4.0F, 8, 8, 8, f2 - 0.5F);
    this.bzF.Dne(0.0F, 0.0F + f1, 0.0F);
    this.Qnq = (new rxL(this, 32, 0)).FWm(64, 64);
    this.Qnq.Dne(-1.0F, 0.0F, -1.0F, 12, 2, 2, f2 - 0.5F);
    this.Qnq.Dne(0.0F, 0.0F + f1 + 9.0F - 7.0F, 0.0F);
    this.aFZ = (new rxL(this, 32, 0)).FWm(64, 64);
    this.aFZ.Dne(-1.0F, 0.0F, -1.0F, 12, 2, 2, f2 - 0.5F);
    this.aFZ.Dne(0.0F, 0.0F + f1 + 9.0F - 7.0F, 0.0F);
    this.Dne = (new rxL(this, 0, 16)).FWm(64, 64);
    this.Dne.Dne(-5.0F, -10.0F, -5.0F, 10, 10, 10, f2 - 0.5F);
    this.Dne.Dne(0.0F, 0.0F + f1 + 9.0F, 0.0F);
    this.FWm = (new rxL(this, 0, 36)).FWm(64, 64);
    this.FWm.Dne(-6.0F, -12.0F, -6.0F, 12, 12, 12, f2 - 0.5F);
    this.FWm.Dne(0.0F, 0.0F + f1 + 20.0F, 0.0F);
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    this.FWm.Dne(paramFloat6);
    this.bzF.Dne(paramFloat6);
    this.Qnq.Dne(paramFloat6);
    this.aFZ.Dne(paramFloat6);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.bzF.DyG = paramFloat4 / 57.295776F;
    this.bzF.zGp = paramFloat5 / 57.295776F;
    this.Dne.DyG = paramFloat4 / 57.295776F * 0.25F;
    float f1 = geR.Dne(this.Dne.DyG);
    float f2 = geR.FWm(this.Dne.DyG);
    this.Qnq.div = 1.0F;
    this.aFZ.div = -1.0F;
    this.Qnq.DyG = 0.0F + this.Dne.DyG;
    this.aFZ.DyG = 3.1415927F + this.Dne.DyG;
    this.Qnq.bzF = f2 * 5.0F;
    this.Qnq.aFZ = -f1 * 5.0F;
    this.aFZ.bzF = -f2 * 5.0F;
    this.aFZ.aFZ = f1 * 5.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XRF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */