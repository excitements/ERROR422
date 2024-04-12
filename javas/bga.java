import org.lwjgl.opengl.GL11;

public class bga extends dfe {
  protected void Dne(Ebp paramEbp, float paramFloat, zKP paramzKP, int paramInt) {
    Dne((Art)paramEbp, paramFloat, paramzKP, paramInt);
  }
  
  protected void Dne(Art paramArt, float paramFloat, zKP paramzKP, int paramInt) {
    int i = paramArt.Qnq();
    if (i > -1 && i - paramFloat + 1.0F < 10.0F) {
      float f1 = 1.0F - (i - paramFloat + 1.0F) / 10.0F;
      if (f1 < 0.0F)
        f1 = 0.0F; 
      if (f1 > 1.0F)
        f1 = 1.0F; 
      f1 *= f1;
      f1 *= f1;
      float f2 = 1.0F + f1 * 0.3F;
      GL11.glScalef(f2, f2, f2);
    } 
    super.Dne(paramArt, paramFloat, paramzKP, paramInt);
    if (i > -1 && i / 5 % 2 == 0) {
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 772);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (1.0F - (i - paramFloat + 1.0F) / 100.0F) * 0.8F);
      GL11.glPushMatrix();
      this.FWm.Dne(zKP.qXo, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2896);
      GL11.glEnable(3553);
    } 
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */