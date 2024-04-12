import org.lwjgl.opengl.GL11;

public class JgT extends Gor {
  rxL Qnq;
  
  rxL aFZ;
  
  rxL FWm;
  
  int Dne;
  
  rxL DyG;
  
  rxL Dne = true;
  
  rxL zGp;
  
  rxL bzF;
  
  rxL div;
  
  public void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    kQo kQo = (kQo)paramFUH;
    this.div.Qnq = 12.0F;
    this.div.aFZ = -10.0F;
    this.DyG.Qnq = 15.0F;
    this.DyG.aFZ = -9.0F;
    this.aFZ.Qnq = 15.0F;
    this.aFZ.aFZ = 8.0F;
    this.zGp.Qnq = 20.0F;
    this.zGp.aFZ = 14.0F;
    this.Qnq.Qnq = 13.8F;
    this.Qnq.aFZ = -5.0F;
    this.FWm.Qnq = 18.0F;
    this.FWm.aFZ = 5.0F;
    this.aFZ.zGp = 0.9F;
    if (kQo.aFZ()) {
      this.div.Qnq++;
      this.DyG.Qnq += 2.0F;
      this.aFZ.Qnq++;
      this.zGp.Qnq += -4.0F;
      this.zGp.aFZ += 2.0F;
      this.aFZ.zGp = 1.5707964F;
      this.zGp.zGp = 1.5707964F;
      this.Dne = false;
    } else if (kQo.ATE()) {
      this.zGp.Qnq = this.aFZ.Qnq;
      this.zGp.aFZ += 2.0F;
      this.aFZ.zGp = 1.5707964F;
      this.zGp.zGp = 1.5707964F;
      this.Dne = 2;
    } else if (kQo.ICU()) {
      this.div.zGp = 0.7853982F;
      this.div.Qnq += -4.0F;
      this.div.aFZ += 5.0F;
      this.DyG.Qnq += -3.3F;
      this.DyG.aFZ++;
      this.aFZ.Qnq += 8.0F;
      this.aFZ.aFZ += -2.0F;
      this.zGp.Qnq += 2.0F;
      this.zGp.aFZ += -0.8F;
      this.aFZ.zGp = 1.7278761F;
      this.zGp.zGp = 2.670354F;
      this.Qnq.zGp = -0.15707964F;
      this.Qnq.Qnq = 15.8F;
      this.Qnq.aFZ = -7.0F;
      this.FWm.zGp = -1.5707964F;
      this.FWm.Qnq = 21.0F;
      this.FWm.aFZ = 1.0F;
      this.Dne = 3;
    } else {
      this.Dne = true;
    } 
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    if (this.DyG != null) {
      float f = 2.0F;
      GL11.glPushMatrix();
      GL11.glScalef(1.5F / f, 1.5F / f, 1.5F / f);
      GL11.glTranslatef(0.0F, 10.0F * paramFloat6, 4.0F * paramFloat6);
      this.DyG.Dne(paramFloat6);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
      GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
      this.div.Dne(paramFloat6);
      this.Dne.Dne(paramFloat6);
      this.FWm.Dne(paramFloat6);
      this.bzF.Dne(paramFloat6);
      this.Qnq.Dne(paramFloat6);
      this.aFZ.Dne(paramFloat6);
      this.zGp.Dne(paramFloat6);
      GL11.glPopMatrix();
    } else {
      this.DyG.Dne(paramFloat6);
      this.div.Dne(paramFloat6);
      this.aFZ.Dne(paramFloat6);
      this.zGp.Dne(paramFloat6);
      this.Dne.Dne(paramFloat6);
      this.FWm.Dne(paramFloat6);
      this.bzF.Dne(paramFloat6);
      this.Qnq.Dne(paramFloat6);
    } 
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    this.DyG.zGp = paramFloat5 / 57.295776F;
    this.DyG.DyG = paramFloat4 / 57.295776F;
    if (this.Dne != 3) {
      this.div.zGp = 1.5707964F;
      if (this.Dne == 2) {
        this.Dne.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.0F * paramFloat2;
        this.FWm.zGp = geR.FWm(paramFloat1 * 0.6662F + 0.3F) * 1.0F * paramFloat2;
        this.bzF.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F + 0.3F) * 1.0F * paramFloat2;
        this.Qnq.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.0F * paramFloat2;
        this.zGp.zGp = 1.7278761F + 0.31415927F * geR.FWm(paramFloat1) * paramFloat2;
      } else {
        this.Dne.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.0F * paramFloat2;
        this.FWm.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.0F * paramFloat2;
        this.bzF.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.0F * paramFloat2;
        this.Qnq.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.0F * paramFloat2;
        if (this.Dne == true) {
          this.zGp.zGp = 1.7278761F + 0.7853982F * geR.FWm(paramFloat1) * paramFloat2;
        } else {
          this.zGp.zGp = 1.7278761F + 0.47123894F * geR.FWm(paramFloat1) * paramFloat2;
        } 
      } 
    } 
  }
  
  public JgT() {
    Dne("head.main", 0, 0);
    Dne("head.nose", 0, 24);
    Dne("head.ear1", 0, 10);
    Dne("head.ear2", 6, 10);
    this.DyG = new rxL(this, "head");
    this.DyG.Dne("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
    this.DyG.Dne("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
    this.DyG.Dne("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
    this.DyG.Dne("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
    this.DyG.Dne(0.0F, 15.0F, -9.0F);
    this.div = new rxL(this, 20, 0);
    this.div.Dne(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
    this.div.Dne(0.0F, 12.0F, -10.0F);
    this.aFZ = new rxL(this, 0, 15);
    this.aFZ.Dne(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    this.aFZ.zGp = 0.9F;
    this.aFZ.Dne(0.0F, 15.0F, 8.0F);
    this.zGp = new rxL(this, 4, 15);
    this.zGp.Dne(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    this.zGp.Dne(0.0F, 20.0F, 14.0F);
    this.Dne = new rxL(this, 8, 13);
    this.Dne.Dne(-1.0F, 0.0F, 1.0F, 2, 6, 2);
    this.Dne.Dne(1.1F, 18.0F, 5.0F);
    this.FWm = new rxL(this, 8, 13);
    this.FWm.Dne(-1.0F, 0.0F, 1.0F, 2, 6, 2);
    this.FWm.Dne(-1.1F, 18.0F, 5.0F);
    this.bzF = new rxL(this, 40, 0);
    this.bzF.Dne(-1.0F, 0.0F, 0.0F, 2, 10, 2);
    this.bzF.Dne(1.2F, 13.8F, -5.0F);
    this.Qnq = new rxL(this, 40, 0);
    this.Qnq.Dne(-1.0F, 0.0F, 0.0F, 2, 10, 2);
    this.Qnq.Dne(-1.2F, 13.8F, -5.0F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JgT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */