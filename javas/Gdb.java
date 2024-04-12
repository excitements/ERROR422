import org.lwjgl.opengl.GL11;

public class Gdb extends Gor {
  public rxL DyG;
  
  public rxL Qnq;
  
  public rxL Dne;
  
  public rxL aFZ;
  
  public rxL zGp;
  
  public rxL bzF;
  
  public rxL div;
  
  public rxL FWm;
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    Dne(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsMa);
    if (this.DyG != null) {
      float f = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 5.0F * paramFloat6, 2.0F * paramFloat6);
      this.Dne.Dne(paramFloat6);
      this.DyG.Dne(paramFloat6);
      this.div.Dne(paramFloat6);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
      GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
      this.FWm.Dne(paramFloat6);
      this.bzF.Dne(paramFloat6);
      this.Qnq.Dne(paramFloat6);
      this.aFZ.Dne(paramFloat6);
      this.zGp.Dne(paramFloat6);
      GL11.glPopMatrix();
    } else {
      this.Dne.Dne(paramFloat6);
      this.DyG.Dne(paramFloat6);
      this.div.Dne(paramFloat6);
      this.FWm.Dne(paramFloat6);
      this.bzF.Dne(paramFloat6);
      this.Qnq.Dne(paramFloat6);
      this.aFZ.Dne(paramFloat6);
      this.zGp.Dne(paramFloat6);
    } 
  }
  
  public Gdb() {
    byte b = 16;
    this.Dne = new rxL(this, 0, 0);
    this.Dne.Dne(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
    this.Dne.Dne(0.0F, (-1 + b), -4.0F);
    this.DyG = new rxL(this, 14, 0);
    this.DyG.Dne(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
    this.DyG.Dne(0.0F, (-1 + b), -4.0F);
    this.div = new rxL(this, 14, 4);
    this.div.Dne(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
    this.div.Dne(0.0F, (-1 + b), -4.0F);
    this.FWm = new rxL(this, 0, 9);
    this.FWm.Dne(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
    this.FWm.Dne(0.0F, b, 0.0F);
    this.bzF = new rxL(this, 26, 0);
    this.bzF.Dne(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    this.bzF.Dne(-2.0F, (3 + b), 1.0F);
    this.Qnq = new rxL(this, 26, 0);
    this.Qnq.Dne(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    this.Qnq.Dne(1.0F, (3 + b), 1.0F);
    this.aFZ = new rxL(this, 24, 13);
    this.aFZ.Dne(0.0F, 0.0F, -3.0F, 1, 4, 6);
    this.aFZ.Dne(-4.0F, (-3 + b), 0.0F);
    this.zGp = new rxL(this, 24, 13);
    this.zGp.Dne(-1.0F, 0.0F, -3.0F, 1, 4, 6);
    this.zGp.Dne(4.0F, (-3 + b), 0.0F);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    this.Dne.zGp = paramFloat5 / 57.295776F;
    this.Dne.DyG = paramFloat4 / 57.295776F;
    this.DyG.zGp = this.Dne.zGp;
    this.DyG.DyG = this.Dne.DyG;
    this.div.zGp = this.Dne.zGp;
    this.div.DyG = this.Dne.DyG;
    this.FWm.zGp = 1.5707964F;
    this.bzF.zGp = geR.FWm(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
    this.Qnq.zGp = geR.FWm(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.aFZ.div = paramFloat3;
    this.zGp.div = -paramFloat3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Gdb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */