public class bSX extends CAZ {
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f1 = 0.25F;
    float f2 = f1 + 0.25F;
    float f3 = 0.125F;
    float f4 = f3 + 0.25F;
    float f5 = 7.1F * geR.Dne((this.bzF + paramFloat1 - 1.0F) * 0.25F * 3.1415927F);
    this.IjH = 0.6F - (this.bzF + paramFloat1 - 1.0F) * 0.25F * 0.5F;
    float f6 = (float)(this.aFZ + (this.div - this.aFZ) * paramFloat1 - Dne);
    float f7 = (float)(this.zGp + (this.IjH - this.zGp) * paramFloat1 - FWm);
    float f8 = (float)(this.DyG + (this.mrb - this.DyG) * paramFloat1 - bzF);
    paramWAR.Dne(this.zGp, this.DyG, this.div, this.IjH);
    paramWAR.Dne((f6 - paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 - paramFloat4 * f5 - paramFloat6 * f5), f2, f4);
    paramWAR.Dne((f6 - paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 - paramFloat4 * f5 + paramFloat6 * f5), f2, f3);
    paramWAR.Dne((f6 + paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 + paramFloat4 * f5 + paramFloat6 * f5), f1, f3);
    paramWAR.Dne((f6 + paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 + paramFloat4 * f5 - paramFloat6 * f5), f1, f4);
  }
  
  protected bSX(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3);
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bSX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */