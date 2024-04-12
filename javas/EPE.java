public class EPE {
  private int Dne;
  
  private float Dne;
  
  private FUH Dne = false;
  
  public void Dne() {
    double d1 = this.Dne.div - this.Dne.aFZ;
    double d2 = this.Dne.mrb - this.Dne.DyG;
    if (d1 * d1 + d2 * d2 > 2.500000277905201E-7D) {
      this.Dne.IjH = this.Dne.mrb;
      this.Dne.vSL = Dne(this.Dne.IjH, this.Dne.vSL, 75.0F);
      this.Dne = this.Dne.vSL;
      this.Dne = false;
    } else {
      float f = 75.0F;
      if (Math.abs(this.Dne.vSL - this.Dne) > 15.0F) {
        this.Dne = false;
        this.Dne = this.Dne.vSL;
      } else {
        this.Dne++;
        if (this.Dne > 10)
          f = Math.max(1.0F - (this.Dne - 10) / 10.0F, 0.0F) * 75.0F; 
      } 
      this.Dne.IjH = Dne(this.Dne.vSL, this.Dne.IjH, f);
    } 
  }
  
  private float Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    float f = geR.aFZ(paramFloat1 - paramFloat2);
    if (f < -paramFloat3)
      f = -paramFloat3; 
    if (f >= paramFloat3)
      f = paramFloat3; 
    return paramFloat1 - f;
  }
  
  public EPE(FUH paramFUH) {
    this.Dne = 0.0F;
    this.Dne = paramFUH;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EPE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */