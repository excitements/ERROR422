import org.lwjgl.opengl.GL11;

public class TSA extends YAD {
  private int Dne = ((rML)this.Dne).Dne();
  
  protected int FWm(FUH paramFUH, int paramInt, float paramFloat) {
    return FWm((DhB)paramFUH, paramInt, paramFloat);
  }
  
  protected int Dne(DhB paramDhB, int paramInt, float paramFloat) {
    if (paramDhB.LVR()) {
      if (paramDhB.Vxn()) {
        GL11.glDepthMask(false);
      } else {
        GL11.glDepthMask(true);
      } 
      if (paramInt == 1) {
        float f1 = paramDhB.zGp + paramFloat;
        Dne("/armor/witherarmor.png");
        GL11.glMatrixMode(5890);
        GL11.glLoadIdentity();
        float f2 = geR.FWm(f1 * 0.02F) * 3.0F;
        float f3 = f1 * 0.01F;
        GL11.glTranslatef(f2, f3, 0.0F);
        Dne(this.Dne);
        GL11.glMatrixMode(5888);
        GL11.glEnable(3042);
        float f4 = 0.5F;
        GL11.glColor4f(f4, f4, f4, 1.0F);
        GL11.glDisable(2896);
        GL11.glBlendFunc(1, 1);
        GL11.glTranslatef(0.0F, -0.01F, 0.0F);
        GL11.glScalef(1.1F, 1.1F, 1.1F);
        return 1;
      } 
      if (paramInt == 2) {
        GL11.glMatrixMode(5890);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
      } 
    } 
    return -1;
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((DhB)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public TSA() {
    super(new rML(), 1.0F);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((DhB)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(DhB paramDhB, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    mwX.Dne(paramDhB, true);
    int i = ((rML)this.Dne).Dne();
    if (i != this.Dne) {
      this.Dne = i;
      this.Dne = new rML();
    } 
    super.Dne(paramDhB, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    Dne((DhB)paramFUH, paramFloat);
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((DhB)paramFUH, paramInt, paramFloat);
  }
  
  protected void Dne(DhB paramDhB, float paramFloat) {
    int i = paramDhB.bzF();
    if (i > 0) {
      float f = 2.0F - (i - paramFloat) / 220.0F * 0.5F;
      GL11.glScalef(f, f, f);
    } else {
      GL11.glScalef(2.0F, 2.0F, 2.0F);
    } 
  }
  
  protected int FWm(DhB paramDhB, int paramInt, float paramFloat) {
    return -1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TSA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */