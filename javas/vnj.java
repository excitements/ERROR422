import org.lwjgl.opengl.GL11;

public class vnj extends YAD {
  private yGB Dne = this.Dne;
  
  protected void Dne(CDE paramCDE, float paramFloat) {
    super.FWm(paramCDE, paramFloat);
    if (paramCDE.qLR() != 0) {
      GL11.glEnable(32826);
      GL11.glPushMatrix();
      GL11.glRotatef(5.0F + 180.0F * this.Dne.bzF.zGp / 3.1415927F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(-0.6875F, 1.25F, -0.9375F);
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      float f = 0.8F;
      GL11.glScalef(f, -f, f);
      int i = paramCDE.Dne(paramFloat);
      int j = i % 65536;
      int k = i / 65536;
      oCF.Dne(oCF.FWm, j / 1.0F, k / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      Dne("/terrain.png");
      this.Dne.Dne(zKP.FWm, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glDisable(32826);
    } 
  }
  
  protected void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    Dne((CDE)paramFUH, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public vnj() {
    super(new yGB(), 0.5F);
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((CDE)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(CDE paramCDE, float paramFloat1, float paramFloat2, float paramFloat3) {
    super.Dne(paramCDE, paramFloat1, paramFloat2, paramFloat3);
    if (paramCDE.qrB >= 0.01D) {
      float f1 = 13.0F;
      float f2 = paramCDE.LVR - paramCDE.qrB * (1.0F - paramFloat3) + 6.0F;
      float f3 = (Math.abs(f2 % f1 - f1 * 0.5F) - f1 * 0.25F) / f1 * 0.25F;
      GL11.glRotatef(6.5F * f3, 0.0F, 0.0F, 1.0F);
    } 
  }
  
  public void Dne(CDE paramCDE, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    super.Dne(paramCDE, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((CDE)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    Dne((CDE)paramFUH, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vnj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */