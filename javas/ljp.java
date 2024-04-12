public class ljp extends Gor {
  private rxL Dne = new rxL(this, 0, 0);
  
  private rxL FWm;
  
  private rxL aFZ;
  
  private rxL zGp;
  
  private rxL bzF = 64;
  
  private rxL Qnq = 64;
  
  public ljp() {
    this.Dne.Dne(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    rxL rxL1 = new rxL(this, 24, 0);
    rxL1.Dne(-4.0F, -6.0F, -2.0F, 3, 4, 1);
    this.Dne.Dne(rxL1);
    rxL rxL2 = new rxL(this, 24, 0);
    rxL2.Dne = true;
    rxL2.Dne(1.0F, -6.0F, -2.0F, 3, 4, 1);
    this.Dne.Dne(rxL2);
    this.FWm = new rxL(this, 0, 16);
    this.FWm.Dne(-3.0F, 4.0F, -3.0F, 6, 12, 6);
    this.FWm.Dne(0, 34).Dne(-5.0F, 16.0F, 0.0F, 10, 6, 1);
    this.bzF = new rxL(this, 42, 0);
    this.bzF.Dne(-12.0F, 1.0F, 1.5F, 10, 16, 1);
    this.aFZ = new rxL(this, 24, 16);
    this.aFZ.Dne(-12.0F, 1.0F, 1.5F);
    this.aFZ.Dne(-8.0F, 1.0F, 0.0F, 8, 12, 1);
    this.Qnq = new rxL(this, 42, 0);
    this.Qnq.Dne = true;
    this.Qnq.Dne(2.0F, 1.0F, 1.5F, 10, 16, 1);
    this.zGp = new rxL(this, 24, 16);
    this.zGp.Dne = true;
    this.zGp.Dne(12.0F, 1.0F, 1.5F);
    this.zGp.Dne(0.0F, 1.0F, 0.0F, 8, 12, 1);
    this.FWm.Dne(this.bzF);
    this.FWm.Dne(this.Qnq);
    this.bzF.Dne(this.aFZ);
    this.Qnq.Dne(this.zGp);
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    oaw oaw = (oaw)paramsMa;
    if (oaw.haP()) {
      this.Dne.zGp = paramFloat5 / 57.295776F;
      this.Dne.DyG = 3.1415927F - paramFloat4 / 57.295776F;
      this.Dne.div = 3.1415927F;
      this.Dne.Dne(0.0F, -2.0F, 0.0F);
      this.bzF.Dne(-3.0F, 0.0F, 3.0F);
      this.Qnq.Dne(3.0F, 0.0F, 3.0F);
      this.FWm.zGp = 3.1415927F;
      this.bzF.zGp = -0.15707964F;
      this.bzF.DyG = -1.2566371F;
      this.aFZ.DyG = -1.7278761F;
      this.Qnq.zGp = this.bzF.zGp;
      this.Qnq.DyG = -this.bzF.DyG;
      this.zGp.DyG = -this.aFZ.DyG;
    } else {
      this.Dne.zGp = paramFloat5 / 57.295776F;
      this.Dne.DyG = paramFloat4 / 57.295776F;
      this.Dne.div = 0.0F;
      this.Dne.Dne(0.0F, 0.0F, 0.0F);
      this.bzF.Dne(0.0F, 0.0F, 0.0F);
      this.Qnq.Dne(0.0F, 0.0F, 0.0F);
      this.FWm.zGp = 0.7853982F + geR.FWm(paramFloat3 * 0.1F) * 0.15F;
      this.FWm.DyG = 0.0F;
      this.bzF.DyG = geR.FWm(paramFloat3 * 1.3F) * 3.1415927F * 0.25F;
      this.Qnq.DyG = -this.bzF.DyG;
      this.bzF.DyG *= 0.5F;
      this.zGp.DyG = -this.bzF.DyG * 0.5F;
    } 
    this.Dne.Dne(paramFloat6);
    this.FWm.Dne(paramFloat6);
  }
  
  public int Dne() {
    return 36;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ljp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */