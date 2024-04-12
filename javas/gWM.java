public class gWM extends CAZ {
  private zKP Dne;
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f1 = (this.Dne + this.FWm / 4.0F) / 16.0F;
    float f2 = f1 + 0.015609375F;
    float f3 = (this.FWm + this.bzF / 4.0F) / 16.0F;
    float f4 = f3 + 0.015609375F;
    float f5 = 0.1F * this.Qnq;
    if (this.Dne != null) {
      f1 = this.Dne.Dne((this.FWm / 4.0F * 16.0F));
      f2 = this.Dne.Dne(((this.FWm + 1.0F) / 4.0F * 16.0F));
      f3 = this.Dne.FWm((this.bzF / 4.0F * 16.0F));
      f4 = this.Dne.FWm(((this.bzF + 1.0F) / 4.0F * 16.0F));
    } 
    float f6 = (float)(this.aFZ + (this.div - this.aFZ) * paramFloat1 - Dne);
    float f7 = (float)(this.zGp + (this.IjH - this.zGp) * paramFloat1 - FWm);
    float f8 = (float)(this.DyG + (this.mrb - this.DyG) * paramFloat1 - bzF);
    float f9 = 1.0F;
    paramWAR.Dne(f9 * this.zGp, f9 * this.DyG, f9 * this.div);
    paramWAR.Dne((f6 - paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 - paramFloat4 * f5 - paramFloat6 * f5), f1, f4);
    paramWAR.Dne((f6 - paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 - paramFloat4 * f5 + paramFloat6 * f5), f1, f3);
    paramWAR.Dne((f6 + paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 + paramFloat4 * f5 + paramFloat6 * f5), f2, f3);
    paramWAR.Dne((f6 + paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 + paramFloat4 * f5 - paramFloat6 * f5), f2, f4);
  }
  
  public gWM Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne == zKP.Dne)
      return this; 
    int i = this.Dne.Dne((Zpi)this.Dne, paramInt1, paramInt2, paramInt3);
    this.zGp *= (i >> 16 & 0xFF) / 255.0F;
    this.DyG *= (i >> 8 & 0xFF) / 255.0F;
    this.div *= (i & 0xFF) / 255.0F;
    return this;
  }
  
  public int Dne() {
    return 1;
  }
  
  public gWM Dne(int paramInt) {
    if (this.Dne == zKP.Dne)
      return this; 
    int i = this.Dne.FWm(paramInt);
    this.zGp *= (i >> 16 & 0xFF) / 255.0F;
    this.DyG *= (i >> 8 & 0xFF) / 255.0F;
    this.div *= (i & 0xFF) / 255.0F;
    return this;
  }
  
  public gWM(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, zKP paramzKP, int paramInt1, int paramInt2, Snh paramSnh) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
    this.Dne = paramzKP;
    Dne(paramSnh, paramzKP.Dne(0, paramInt2));
    this.aFZ = paramzKP.bzF;
    this.zGp = this.DyG = this.div = 0.6F;
    this.Qnq /= 2.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gWM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */