public class bvU {
  private float Dne;
  
  private double FWm;
  
  private double Dne;
  
  private boolean Dne;
  
  private double bzF;
  
  private FUH Dne = false;
  
  private float FWm;
  
  public bvU(FUH paramFUH) {
    this.Dne = paramFUH;
  }
  
  public void Dne() {
    this.Dne.XHL = 0.0F;
    if (this.Dne != null) {
      this.Dne = false;
      double d1 = this.Dne - this.Dne.div;
      double d2 = this.FWm - this.Dne.IjH + this.Dne.c_();
      double d3 = this.bzF - this.Dne.mrb;
      double d4 = geR.Dne(d1 * d1 + d3 * d3);
      float f1 = (float)(Math.atan2(d3, d1) * 180.0D / Math.PI) - 90.0F;
      float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / Math.PI);
      this.Dne.XHL = Dne(this.Dne.XHL, f2, this.FWm);
      this.Dne.vSL = Dne(this.Dne.vSL, f1, this.Dne);
    } else {
      this.Dne.vSL = Dne(this.Dne.vSL, this.Dne.IjH, 10.0F);
    } 
    float f = geR.aFZ(this.Dne.vSL - this.Dne.IjH);
    if (!this.Dne.Dne().bzF()) {
      if (f < -75.0F)
        this.Dne.vSL = this.Dne.IjH - 75.0F; 
      if (f > 75.0F)
        this.Dne.vSL = this.Dne.IjH + 75.0F; 
    } 
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
    this.Dne = true;
  }
  
  private float Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    float f = geR.aFZ(paramFloat2 - paramFloat1);
    if (f > paramFloat3)
      f = paramFloat3; 
    if (f < -paramFloat3)
      f = -paramFloat3; 
    return paramFloat1 + f;
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2) {
    this.Dne = paramsMa.div;
    if (paramsMa instanceof FUH) {
      this.FWm = paramsMa.IjH + paramsMa.c_();
    } else {
      this.FWm = (paramsMa.Dne.FWm + paramsMa.Dne.aFZ) / 2.0D;
    } 
    this.bzF = paramsMa.mrb;
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
    this.Dne = true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bvU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */