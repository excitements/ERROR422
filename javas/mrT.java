import org.lwjgl.opengl.GL11;

public class mrT extends Gor {
  private rxL FWm = new rxL(this, "glass");
  
  private rxL bzF;
  
  private rxL Dne;
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    GL11.glPushMatrix();
    GL11.glScalef(2.0F, 2.0F, 2.0F);
    GL11.glTranslatef(0.0F, -0.5F, 0.0F);
    if (this.bzF != null)
      this.bzF.Dne(paramFloat6); 
    GL11.glRotatef(paramFloat2, 0.0F, 1.0F, 0.0F);
    GL11.glTranslatef(0.0F, 0.8F + paramFloat3, 0.0F);
    GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
    this.FWm.Dne(paramFloat6);
    float f = 0.875F;
    GL11.glScalef(f, f, f);
    GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
    GL11.glRotatef(paramFloat2, 0.0F, 1.0F, 0.0F);
    this.FWm.Dne(paramFloat6);
    GL11.glScalef(f, f, f);
    GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
    GL11.glRotatef(paramFloat2, 0.0F, 1.0F, 0.0F);
    this.Dne.Dne(paramFloat6);
    GL11.glPopMatrix();
  }
  
  public mrT(float paramFloat, boolean paramBoolean) {
    this.FWm.Dne(0, 0).Dne(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.Dne = new rxL(this, "cube");
    this.Dne.Dne(32, 0).Dne(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    if (paramBoolean) {
      this.bzF = new rxL(this, "base");
      this.bzF.Dne(0, 16).Dne(-6.0F, 0.0F, -6.0F, 12, 4, 12);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mrT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */