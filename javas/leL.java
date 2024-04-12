import org.lwjgl.opengl.GL11;

public class leL extends Jte {
  private UuX Dne = new UuX();
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((AjG)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
  
  public void Dne(AjG paramAjG, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    zKP zKP = paramAjG.Dne();
    GL11.glPushMatrix();
    float f1 = 0.6666667F;
    if (zKP == zKP.LVR) {
      GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
      float f = (paramAjG.zGp() * 360) / 16.0F;
      GL11.glRotatef(-f, 0.0F, 1.0F, 0.0F);
      this.Dne.FWm.FWm = 1;
    } else {
      int i = paramAjG.zGp();
      float f = 0.0F;
      if (i == 2)
        f = 180.0F; 
      if (i == 4)
        f = 90.0F; 
      if (i == 5)
        f = -90.0F; 
      GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
      GL11.glRotatef(-f, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
      this.Dne.FWm.FWm = 0;
    } 
    Dne("/item/sign.png");
    GL11.glPushMatrix();
    GL11.glScalef(f1, -f1, -f1);
    this.Dne.Dne();
    GL11.glPopMatrix();
    msA msA = Dne();
    float f2 = 0.016666668F * f1;
    GL11.glTranslatef(0.0F, 0.5F * f1, 0.07F * f1);
    GL11.glScalef(f2, -f2, f2);
    GL11.glNormal3f(0.0F, 0.0F, -1.0F * f2);
    GL11.glDepthMask(false);
    boolean bool = false;
    for (byte b = 0; b < paramAjG.Dne.length; b++) {
      String str = paramAjG.Dne[b];
      if (b == paramAjG.Dne) {
        str = "> " + str + " <";
        msA.FWm(str, -msA.Dne(str) / 2, b * 10 - paramAjG.Dne.length * 5, bool);
      } else {
        msA.FWm(str, -msA.Dne(str) / 2, b * 10 - paramAjG.Dne.length * 5, bool);
      } 
    } 
    GL11.glDepthMask(true);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glPopMatrix();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\leL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */