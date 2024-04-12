import org.lwjgl.opengl.GL11;

public class UmO extends QCe {
  private zVu FWm = new zVu();
  
  public void Dne(gqg paramgqg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
    if (paramgqg.Dne - paramFloat2 + 1.0F < 10.0F) {
      float f1 = 1.0F - (paramgqg.Dne - paramFloat2 + 1.0F) / 10.0F;
      if (f1 < 0.0F)
        f1 = 0.0F; 
      if (f1 > 1.0F)
        f1 = 1.0F; 
      f1 *= f1;
      f1 *= f1;
      float f2 = 1.0F + f1 * 0.3F;
      GL11.glScalef(f2, f2, f2);
    } 
    float f = (1.0F - (paramgqg.Dne - paramFloat2 + 1.0F) / 100.0F) * 0.8F;
    Dne("/terrain.png");
    this.FWm.Dne(zKP.qXo, 0, paramgqg.Dne(paramFloat2));
    if (paramgqg.Dne / 5 % 2 == 0) {
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 772);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
      this.FWm.Dne(zKP.qXo, 0, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2896);
      GL11.glEnable(3553);
    } 
    GL11.glPopMatrix();
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((gqg)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UmO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */