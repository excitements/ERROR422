public class rML extends Gor {
  private rxL[] Dne = new rxL[3];
  
  private rxL[] FWm;
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    float f = geR.FWm(paramFloat3 * 0.1F);
    (this.Dne[1]).zGp = (0.065F + 0.05F * f) * 3.1415927F;
    this.Dne[2].Dne(-2.0F, 6.9F + geR.FWm((this.Dne[1]).zGp) * 10.0F, -0.5F + geR.Dne((this.Dne[1]).zGp) * 10.0F);
    (this.Dne[2]).zGp = (0.265F + 0.1F * f) * 3.1415927F;
    (this.FWm[0]).DyG = paramFloat4 / 57.295776F;
    (this.FWm[0]).zGp = paramFloat5 / 57.295776F;
  }
  
  public int Dne() {
    return 32;
  }
  
  public rML() {
    this.Dne[0] = new rxL(this, 0, 16);
    this.Dne[0].Dne(-10.0F, 3.9F, -0.5F, 20, 3, 3);
    this.Dne[1] = (new rxL(this)).FWm(this.bzF, this.Qnq);
    this.Dne[1].Dne(-2.0F, 6.9F, -0.5F);
    this.Dne[1].Dne(0, 22).Dne(0.0F, 0.0F, 0.0F, 3, 10, 3);
    this.Dne[1].Dne(24, 22).Dne(-4.0F, 1.5F, 0.5F, 11, 2, 2);
    this.Dne[1].Dne(24, 22).Dne(-4.0F, 4.0F, 0.5F, 11, 2, 2);
    this.Dne[1].Dne(24, 22).Dne(-4.0F, 6.5F, 0.5F, 11, 2, 2);
    this.Dne[2] = new rxL(this, 12, 22);
    this.Dne[2].Dne(0.0F, 0.0F, 0.0F, 3, 6, 3);
    this.FWm = new rxL[3];
    this.FWm[0] = new rxL(this, 0, 0);
    this.FWm[0].Dne(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.FWm[1] = new rxL(this, 32, 0);
    this.FWm[1].Dne(-4.0F, -4.0F, -4.0F, 6, 6, 6);
    (this.FWm[1]).bzF = -8.0F;
    (this.FWm[1]).Qnq = 4.0F;
    this.FWm[2] = new rxL(this, 32, 0);
    this.FWm[2].Dne(-4.0F, -4.0F, -4.0F, 6, 6, 6);
    (this.FWm[2]).bzF = 10.0F;
    (this.FWm[2]).Qnq = 4.0F;
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    for (rxL rxL1 : this.FWm)
      rxL1.Dne(paramFloat6); 
    for (rxL rxL1 : this.Dne)
      rxL1.Dne(paramFloat6); 
  }
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    DhB dhB = (DhB)paramFUH;
    for (byte b = 1; b < 3; b++) {
      (this.FWm[b]).DyG = (dhB.Dne(b - 1) - paramFUH.IjH) / 57.295776F;
      (this.FWm[b]).zGp = dhB.FWm(b - 1) / 57.295776F;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rML.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */