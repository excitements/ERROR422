import org.lwjgl.opengl.GL11;

public class EyS extends YAD {
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((Ahh)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((Ahh)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    Dne((Ahh)paramFUH, paramFloat);
  }
  
  protected void Dne(Ahh paramAhh, float paramFloat) {
    super.FWm(paramAhh, paramFloat);
    if (!paramAhh.IjH()) {
      Dne("/terrain.png");
      GL11.glEnable(2884);
      GL11.glPushMatrix();
      GL11.glScalef(1.0F, -1.0F, 1.0F);
      GL11.glTranslatef(0.2F, 0.4F, 0.5F);
      GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
      this.Dne.Dne((zKP)zKP.Qnq, 0, 1.0F);
      GL11.glTranslatef(0.1F, 0.0F, -0.6F);
      GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
      this.Dne.Dne((zKP)zKP.Qnq, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      ((qcK)this.Dne).Dne.bzF(0.0625F);
      GL11.glScalef(1.0F, -1.0F, 1.0F);
      GL11.glTranslatef(0.0F, 0.75F, -0.2F);
      GL11.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
      this.Dne.Dne((zKP)zKP.Qnq, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glDisable(2884);
    } 
  }
  
  public EyS(Gor paramGor, float paramFloat) {
    super(paramGor, paramFloat);
  }
  
  static {
  
  }
  
  public void Dne(Ahh paramAhh, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    super.Dne(paramAhh, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EyS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */