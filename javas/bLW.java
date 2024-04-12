import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bLW extends YAD {
  private Random Dne;
  
  private ZYo Dne = (ZYo)new Random();
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((iGp)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected int Dne(iGp paramiGp, int paramInt, float paramFloat) {
    if (paramInt != 0)
      return -1; 
    Dne("/mob/enderman_eyes.png");
    float f = 1.0F;
    GL11.glEnable(3042);
    GL11.glDisable(3008);
    GL11.glBlendFunc(1, 1);
    GL11.glDisable(2896);
    if (paramiGp.Vxn()) {
      GL11.glDepthMask(false);
    } else {
      GL11.glDepthMask(true);
    } 
    char c = '';
    int i = c % 65536;
    int j = c / 65536;
    oCF.Dne(oCF.FWm, i / 1.0F, j / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glEnable(2896);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
    return 1;
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((iGp)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(iGp paramiGp, float paramFloat) {
    super.FWm(paramiGp, paramFloat);
    if (paramiGp.bzF() > 0) {
      GL11.glEnable(32826);
      GL11.glPushMatrix();
      float f = 0.5F;
      GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
      f *= 1.0F;
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glScalef(-f, -f, f);
      int i = paramiGp.Dne(paramFloat);
      int j = i % 65536;
      int k = i / 65536;
      oCF.Dne(oCF.FWm, j / 1.0F, k / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      Dne("/terrain.png");
      this.Dne.Dne(zKP.Dne[paramiGp.bzF()], paramiGp.qLR(), 1.0F);
      GL11.glPopMatrix();
      GL11.glDisable(32826);
    } 
  }
  
  public void Dne(iGp paramiGp, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.Dne.Dne = (paramiGp.bzF() > 0);
    this.Dne.FWm = paramiGp.ZfC();
    if (paramiGp.ZfC()) {
      double d = 0.02D;
      paramDouble1 += this.Dne.nextGaussian() * d;
      paramDouble3 += this.Dne.nextGaussian() * d;
    } 
    super.Dne(paramiGp, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((iGp)paramFUH, paramInt, paramFloat);
  }
  
  public bLW() {
    super(new ZYo(), 0.5F);
    this.Dne = (ZYo)super.Dne;
    Dne(this.Dne);
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    Dne((iGp)paramFUH, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bLW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */