public class FgN extends Gor {
  public rxL Qnq;
  
  public rxL bzF;
  
  public rxL div;
  
  public rxL XHL;
  
  public rxL Dne;
  
  public rxL IjH;
  
  public rxL zGp;
  
  public rxL DyG;
  
  public rxL aFZ;
  
  public rxL FWm;
  
  public rxL mrb;
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.Dne.zGp = paramFloat5 / 57.295776F;
    float f1 = 0.7853982F;
    this.Qnq.div = -f1;
    this.aFZ.div = f1;
    this.zGp.div = -f1 * 0.74F;
    this.DyG.div = f1 * 0.74F;
    this.div.div = -f1 * 0.74F;
    this.IjH.div = f1 * 0.74F;
    this.mrb.div = -f1;
    this.XHL.div = f1;
    float f2 = -0.0F;
    float f3 = 0.3926991F;
    this.Qnq.DyG = f3 * 2.0F + f2;
    this.aFZ.DyG = -f3 * 2.0F - f2;
    this.zGp.DyG = f3 * 1.0F + f2;
    this.DyG.DyG = -f3 * 1.0F - f2;
    this.div.DyG = -f3 * 1.0F + f2;
    this.IjH.DyG = f3 * 1.0F - f2;
    this.mrb.DyG = -f3 * 2.0F + f2;
    this.XHL.DyG = f3 * 2.0F - f2;
    float f4 = -(geR.FWm(paramFloat1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * paramFloat2;
    float f5 = -(geR.FWm(paramFloat1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * paramFloat2;
    float f6 = -(geR.FWm(paramFloat1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * paramFloat2;
    float f7 = -(geR.FWm(paramFloat1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * paramFloat2;
    float f8 = Math.abs(geR.Dne(paramFloat1 * 0.6662F + 0.0F) * 0.4F) * paramFloat2;
    float f9 = Math.abs(geR.Dne(paramFloat1 * 0.6662F + 3.1415927F) * 0.4F) * paramFloat2;
    float f10 = Math.abs(geR.Dne(paramFloat1 * 0.6662F + 1.5707964F) * 0.4F) * paramFloat2;
    float f11 = Math.abs(geR.Dne(paramFloat1 * 0.6662F + 4.712389F) * 0.4F) * paramFloat2;
    this.Qnq.DyG += f4;
    this.aFZ.DyG += -f4;
    this.zGp.DyG += f5;
    this.DyG.DyG += -f5;
    this.div.DyG += f6;
    this.IjH.DyG += -f6;
    this.mrb.DyG += f7;
    this.XHL.DyG += -f7;
    this.Qnq.div += f8;
    this.aFZ.div += -f8;
    this.zGp.div += f9;
    this.DyG.div += -f9;
    this.div.div += f10;
    this.IjH.div += -f10;
    this.mrb.div += f11;
    this.XHL.div += -f11;
  }
  
  public FgN() {
    float f = 0.0F;
    byte b = 15;
    this.Dne = new rxL(this, 32, 4);
    this.Dne.Dne(-4.0F, -4.0F, -8.0F, 8, 8, 8, f);
    this.Dne.Dne(0.0F, b, -3.0F);
    this.FWm = new rxL(this, 0, 0);
    this.FWm.Dne(-3.0F, -3.0F, -3.0F, 6, 6, 6, f);
    this.FWm.Dne(0.0F, b, 0.0F);
    this.bzF = new rxL(this, 0, 12);
    this.bzF.Dne(-5.0F, -4.0F, -6.0F, 10, 8, 12, f);
    this.bzF.Dne(0.0F, b, 9.0F);
    this.Qnq = new rxL(this, 18, 0);
    this.Qnq.Dne(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.Qnq.Dne(-4.0F, b, 2.0F);
    this.aFZ = new rxL(this, 18, 0);
    this.aFZ.Dne(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.aFZ.Dne(4.0F, b, 2.0F);
    this.zGp = new rxL(this, 18, 0);
    this.zGp.Dne(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.zGp.Dne(-4.0F, b, 1.0F);
    this.DyG = new rxL(this, 18, 0);
    this.DyG.Dne(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.DyG.Dne(4.0F, b, 1.0F);
    this.div = new rxL(this, 18, 0);
    this.div.Dne(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.div.Dne(-4.0F, b, 0.0F);
    this.IjH = new rxL(this, 18, 0);
    this.IjH.Dne(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.IjH.Dne(4.0F, b, 0.0F);
    this.mrb = new rxL(this, 18, 0);
    this.mrb.Dne(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.mrb.Dne(-4.0F, b, -1.0F);
    this.XHL = new rxL(this, 18, 0);
    this.XHL.Dne(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.XHL.Dne(4.0F, b, -1.0F);
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.Dne(paramFloat6);
    this.FWm.Dne(paramFloat6);
    this.bzF.Dne(paramFloat6);
    this.Qnq.Dne(paramFloat6);
    this.aFZ.Dne(paramFloat6);
    this.zGp.Dne(paramFloat6);
    this.DyG.Dne(paramFloat6);
    this.div.Dne(paramFloat6);
    this.IjH.Dne(paramFloat6);
    this.mrb.Dne(paramFloat6);
    this.XHL.Dne(paramFloat6);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FgN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */