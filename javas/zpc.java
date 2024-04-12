import org.lwjgl.opengl.GL11;

public class zpc extends Jte {
  private XLo Dne = new XLo();
  
  public void Dne(RPI paramRPI, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    int i = 0;
    if (paramRPI.Qnq())
      i = paramRPI.zGp(); 
    Dne("/item/enderchest.png");
    GL11.glPushMatrix();
    GL11.glEnable(32826);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2 + 1.0F, (float)paramDouble3 + 1.0F);
    GL11.glScalef(1.0F, -1.0F, -1.0F);
    GL11.glTranslatef(0.5F, 0.5F, 0.5F);
    short s = 0;
    if (i == 2)
      s = 180; 
    if (i == 3)
      s = 0; 
    if (i == 4)
      s = 90; 
    if (i == 5)
      s = -90; 
    GL11.glRotatef(s, 0.0F, 1.0F, 0.0F);
    GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
    float f = paramRPI.FWm + (paramRPI.Dne - paramRPI.FWm) * paramFloat;
    f = 1.0F - f;
    f = 1.0F - f * f * f;
    this.Dne.Dne.zGp = -(f * 3.1415927F / 2.0F);
    this.Dne.Dne();
    GL11.glDisable(32826);
    GL11.glPopMatrix();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void Dne(ipD paramipD, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    Dne((RPI)paramipD, paramDouble1, paramDouble2, paramDouble3, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zpc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */