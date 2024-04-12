public class yGB extends Gor {
  public rxL aFZ;
  
  public rxL zGp;
  
  public rxL Dne;
  
  public rxL Qnq;
  
  public rxL FWm;
  
  public rxL bzF;
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    this.FWm.Dne(paramFloat6);
    this.aFZ.Dne(paramFloat6);
    this.zGp.Dne(paramFloat6);
    this.bzF.Dne(paramFloat6);
    this.Qnq.Dne(paramFloat6);
  }
  
  private float Dne(float paramFloat1, float paramFloat2) {
    return (Math.abs(paramFloat1 % paramFloat2 - paramFloat2 * 0.5F) - paramFloat2 * 0.25F) / paramFloat2 * 0.25F;
  }
  
  public yGB() {
    this(0.0F);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.Dne.zGp = paramFloat5 / 57.295776F;
    this.aFZ.zGp = -1.5F * Dne(paramFloat1, 13.0F) * paramFloat2;
    this.zGp.zGp = 1.5F * Dne(paramFloat1, 13.0F) * paramFloat2;
    this.aFZ.DyG = 0.0F;
    this.zGp.DyG = 0.0F;
  }
  
  public yGB(float paramFloat1, float paramFloat2) {
    char c1 = '';
    char c2 = '';
    this.Dne = (new rxL(this)).FWm(c1, c2);
    this.Dne.Dne(0.0F, 0.0F + paramFloat2, -2.0F);
    this.Dne.Dne(0, 0).Dne(-4.0F, -12.0F, -5.5F, 8, 10, 8, paramFloat1);
    this.Dne.Dne(24, 0).Dne(-1.0F, -5.0F, -7.5F, 2, 4, 2, paramFloat1);
    this.FWm = (new rxL(this)).FWm(c1, c2);
    this.FWm.Dne(0.0F, 0.0F + paramFloat2, 0.0F);
    this.FWm.Dne(0, 40).Dne(-9.0F, -2.0F, -6.0F, 18, 12, 11, paramFloat1);
    this.FWm.Dne(0, 70).Dne(-4.5F, 10.0F, -3.0F, 9, 5, 6, paramFloat1 + 0.5F);
    this.bzF = (new rxL(this)).FWm(c1, c2);
    this.bzF.Dne(0.0F, -7.0F, 0.0F);
    this.bzF.Dne(60, 21).Dne(-13.0F, -2.5F, -3.0F, 4, 30, 6, paramFloat1);
    this.Qnq = (new rxL(this)).FWm(c1, c2);
    this.Qnq.Dne(0.0F, -7.0F, 0.0F);
    this.Qnq.Dne(60, 58).Dne(9.0F, -2.5F, -3.0F, 4, 30, 6, paramFloat1);
    this.aFZ = (new rxL(this, 0, 22)).FWm(c1, c2);
    this.aFZ.Dne(-4.0F, 18.0F + paramFloat2, 0.0F);
    this.aFZ.Dne(37, 0).Dne(-3.5F, -3.0F, -3.0F, 6, 16, 5, paramFloat1);
    this.zGp = (new rxL(this, 0, 22)).FWm(c1, c2);
    this.zGp.Dne = true;
    this.zGp.Dne(60, 0).Dne(5.0F, 18.0F + paramFloat2, 0.0F);
    this.zGp.Dne(-3.5F, -3.0F, -3.0F, 6, 16, 5, paramFloat1);
  }
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    CDE cDE = (CDE)paramFUH;
    int i = cDE.bzF();
    if (i > 0) {
      this.bzF.zGp = -2.0F + 1.5F * Dne(i - paramFloat3, 10.0F);
      this.Qnq.zGp = -2.0F + 1.5F * Dne(i - paramFloat3, 10.0F);
    } else {
      int j = cDE.qLR();
      if (j > 0) {
        this.bzF.zGp = -0.8F + 0.025F * Dne(j, 70.0F);
        this.Qnq.zGp = 0.0F;
      } else {
        this.bzF.zGp = (-0.2F + 1.5F * Dne(paramFloat1, 13.0F)) * paramFloat2;
        this.Qnq.zGp = (-0.2F - 1.5F * Dne(paramFloat1, 13.0F)) * paramFloat2;
      } 
    } 
  }
  
  public yGB(float paramFloat) {
    this(paramFloat, -7.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yGB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */