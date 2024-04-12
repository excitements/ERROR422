public class wsR extends Gor {
  public rxL DyG = (new rxL(this)).Dne(12, 0).Dne(-1.0F, -5.0F, 0.0F, 2, 10, 0);
  
  public rxL aFZ = (new rxL(this)).Dne(24, 10).Dne(0.0F, -4.0F, 0.0F, 5, 8, 0);
  
  public rxL bzF = (new rxL(this)).Dne(0, 10).Dne(0.0F, -4.0F, -0.99F, 5, 8, 1);
  
  public rxL Qnq = (new rxL(this)).Dne(12, 10).Dne(0.0F, -4.0F, -0.01F, 5, 8, 1);
  
  public rxL Dne = (new rxL(this)).Dne(0, 0).Dne(-6.0F, -5.0F, 0.0F, 6, 10, 0);
  
  public rxL FWm = (new rxL(this)).Dne(16, 0).Dne(0.0F, -5.0F, 0.0F, 6, 10, 0);
  
  public rxL zGp = (new rxL(this)).Dne(24, 10).Dne(0.0F, -4.0F, 0.0F, 5, 8, 0);
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    this.FWm.Dne(paramFloat6);
    this.DyG.Dne(paramFloat6);
    this.bzF.Dne(paramFloat6);
    this.Qnq.Dne(paramFloat6);
    this.aFZ.Dne(paramFloat6);
    this.zGp.Dne(paramFloat6);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    float f = (geR.Dne(paramFloat1 * 0.02F) * 0.1F + 1.25F) * paramFloat4;
    this.Dne.DyG = 3.1415927F + f;
    this.FWm.DyG = -f;
    this.bzF.DyG = f;
    this.Qnq.DyG = -f;
    this.aFZ.DyG = f - f * 2.0F * paramFloat2;
    this.zGp.DyG = f - f * 2.0F * paramFloat3;
    this.bzF.bzF = geR.Dne(f);
    this.Qnq.bzF = geR.Dne(f);
    this.aFZ.bzF = geR.Dne(f);
    this.zGp.bzF = geR.Dne(f);
  }
  
  public wsR() {
    this.Dne.Dne(0.0F, 0.0F, -1.0F);
    this.FWm.Dne(0.0F, 0.0F, 1.0F);
    this.DyG.DyG = 1.5707964F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wsR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */