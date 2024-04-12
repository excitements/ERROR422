public class BHA extends Gor {
  public rxL bzF;
  
  public rxL DyG;
  
  public rxL FWm;
  
  public rxL aFZ;
  
  public rxL Dne;
  
  public rxL Qnq;
  
  public rxL zGp;
  
  public BHA(float paramFloat) {
    byte b = 4;
    this.Dne = new rxL(this, 0, 0);
    this.Dne.Dne(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat);
    this.Dne.Dne(0.0F, b, 0.0F);
    this.FWm = new rxL(this, 32, 0);
    this.FWm.Dne(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat + 0.5F);
    this.FWm.Dne(0.0F, b, 0.0F);
    this.bzF = new rxL(this, 16, 16);
    this.bzF.Dne(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat);
    this.bzF.Dne(0.0F, b, 0.0F);
    this.Qnq = new rxL(this, 0, 16);
    this.Qnq.Dne(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.Qnq.Dne(-2.0F, (12 + b), 4.0F);
    this.aFZ = new rxL(this, 0, 16);
    this.aFZ.Dne(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.aFZ.Dne(2.0F, (12 + b), 4.0F);
    this.zGp = new rxL(this, 0, 16);
    this.zGp.Dne(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.zGp.Dne(-2.0F, (12 + b), -4.0F);
    this.DyG = new rxL(this, 0, 16);
    this.DyG.Dne(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.DyG.Dne(2.0F, (12 + b), -4.0F);
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    this.bzF.Dne(paramFloat6);
    this.Qnq.Dne(paramFloat6);
    this.aFZ.Dne(paramFloat6);
    this.zGp.Dne(paramFloat6);
    this.DyG.Dne(paramFloat6);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.Dne.zGp = paramFloat5 / 57.295776F;
    this.Qnq.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
    this.aFZ.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.zGp.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.DyG.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
  }
  
  public BHA() {
    this(0.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BHA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */