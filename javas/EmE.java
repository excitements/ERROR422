import org.lwjgl.opengl.GL11;

public class EmE extends QCe {
  protected Gor Dne = 0.5F;
  
  public EmE() {
    this.Dne = new WXj();
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((iMX)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(iMX paramiMX, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
    GL11.glRotatef(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
    float f1 = paramiMX.bzF() - paramFloat2;
    float f2 = paramiMX.Dne() - paramFloat2;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f1 > 0.0F)
      GL11.glRotatef(geR.Dne(f1) * f1 * f2 / 10.0F * paramiMX.Qnq(), 1.0F, 0.0F, 0.0F); 
    Dne("/terrain.png");
    float f3 = 0.75F;
    GL11.glScalef(f3, f3, f3);
    GL11.glScalef(1.0F / f3, 1.0F / f3, 1.0F / f3);
    Dne("/item/boat.png");
    GL11.glScalef(-1.0F, -1.0F, 1.0F);
    this.Dne.Dne(paramiMX, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glPopMatrix();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EmE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */