import org.lwjgl.opengl.GL11;

public class cgN extends Gor {
  public rxL bzF;
  
  public rxL Qnq;
  
  rxL div;
  
  public rxL FWm;
  
  rxL DyG;
  
  public rxL zGp;
  
  public rxL aFZ;
  
  public rxL Dne;
  
  public cgN() {
    float f1 = 0.0F;
    float f2 = 13.5F;
    this.Dne = new rxL(this, 0, 0);
    this.Dne.Dne(-3.0F, -3.0F, -2.0F, 6, 6, 4, f1);
    this.Dne.Dne(-1.0F, f2, -7.0F);
    this.FWm = new rxL(this, 18, 14);
    this.FWm.Dne(-4.0F, -2.0F, -3.0F, 6, 9, 6, f1);
    this.FWm.Dne(0.0F, 14.0F, 2.0F);
    this.div = new rxL(this, 21, 0);
    this.div.Dne(-4.0F, -3.0F, -3.0F, 8, 6, 7, f1);
    this.div.Dne(-1.0F, 14.0F, 2.0F);
    this.bzF = new rxL(this, 0, 18);
    this.bzF.Dne(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
    this.bzF.Dne(-2.5F, 16.0F, 7.0F);
    this.Qnq = new rxL(this, 0, 18);
    this.Qnq.Dne(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
    this.Qnq.Dne(0.5F, 16.0F, 7.0F);
    this.aFZ = new rxL(this, 0, 18);
    this.aFZ.Dne(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
    this.aFZ.Dne(-2.5F, 16.0F, -4.0F);
    this.zGp = new rxL(this, 0, 18);
    this.zGp.Dne(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
    this.zGp.Dne(0.5F, 16.0F, -4.0F);
    this.DyG = new rxL(this, 9, 18);
    this.DyG.Dne(-1.0F, 0.0F, -1.0F, 2, 8, 2, f1);
    this.DyG.Dne(-1.0F, 12.0F, 8.0F);
    this.Dne.Dne(16, 14).Dne(-3.0F, -5.0F, 0.0F, 2, 2, 1, f1);
    this.Dne.Dne(16, 14).Dne(1.0F, -5.0F, 0.0F, 2, 2, 1, f1);
    this.Dne.Dne(0, 10).Dne(-1.5F, 0.0F, -5.0F, 3, 3, 4, f1);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    super.Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    this.Dne.zGp = paramFloat5 / 57.295776F;
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.DyG.zGp = paramFloat3;
  }
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    oEB oEB = (oEB)paramFUH;
    if (oEB.BJH()) {
      this.DyG.DyG = 0.0F;
    } else {
      this.DyG.DyG = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
    } 
    if (oEB.ICU()) {
      this.div.Dne(-1.0F, 16.0F, -3.0F);
      this.div.zGp = 1.2566371F;
      this.div.DyG = 0.0F;
      this.FWm.Dne(0.0F, 18.0F, 0.0F);
      this.FWm.zGp = 0.7853982F;
      this.DyG.Dne(-1.0F, 21.0F, 6.0F);
      this.bzF.Dne(-2.5F, 22.0F, 2.0F);
      this.bzF.zGp = 4.712389F;
      this.Qnq.Dne(0.5F, 22.0F, 2.0F);
      this.Qnq.zGp = 4.712389F;
      this.aFZ.zGp = 5.811947F;
      this.aFZ.Dne(-2.49F, 17.0F, -4.0F);
      this.zGp.zGp = 5.811947F;
      this.zGp.Dne(0.51F, 17.0F, -4.0F);
    } else {
      this.FWm.Dne(0.0F, 14.0F, 2.0F);
      this.FWm.zGp = 1.5707964F;
      this.div.Dne(-1.0F, 14.0F, -3.0F);
      this.div.zGp = this.FWm.zGp;
      this.DyG.Dne(-1.0F, 12.0F, 8.0F);
      this.bzF.Dne(-2.5F, 16.0F, 7.0F);
      this.Qnq.Dne(0.5F, 16.0F, 7.0F);
      this.aFZ.Dne(-2.5F, 16.0F, -4.0F);
      this.zGp.Dne(0.5F, 16.0F, -4.0F);
      this.bzF.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
      this.Qnq.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
      this.aFZ.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
      this.zGp.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
    } 
    this.Dne.div = oEB.Qnq(paramFloat3) + oEB.Dne(paramFloat3, 0.0F);
    this.div.div = oEB.Dne(paramFloat3, -0.08F);
    this.FWm.div = oEB.Dne(paramFloat3, -0.16F);
    this.DyG.div = oEB.Dne(paramFloat3, -0.2F);
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    super.Dne(paramsMa, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    if (this.DyG != null) {
      float f = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 5.0F * paramFloat6, 2.0F * paramFloat6);
      this.Dne.FWm(paramFloat6);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
      GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
      this.FWm.Dne(paramFloat6);
      this.bzF.Dne(paramFloat6);
      this.Qnq.Dne(paramFloat6);
      this.aFZ.Dne(paramFloat6);
      this.zGp.Dne(paramFloat6);
      this.DyG.FWm(paramFloat6);
      this.div.Dne(paramFloat6);
      GL11.glPopMatrix();
    } else {
      this.Dne.FWm(paramFloat6);
      this.FWm.Dne(paramFloat6);
      this.bzF.Dne(paramFloat6);
      this.Qnq.Dne(paramFloat6);
      this.aFZ.Dne(paramFloat6);
      this.zGp.Dne(paramFloat6);
      this.DyG.FWm(paramFloat6);
      this.div.Dne(paramFloat6);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cgN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */