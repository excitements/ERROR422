import org.lwjgl.opengl.GL11;

public class ENB extends YAD {
  private Gor bzF;
  
  public ENB(Gor paramGor1, Gor paramGor2, float paramFloat) {
    super(paramGor1, paramFloat);
    this.bzF = paramGor2;
  }
  
  protected int Dne(Tgj paramTgj, int paramInt, float paramFloat) {
    if (paramTgj.Vxn())
      return 0; 
    if (paramInt == 0) {
      Dne(this.bzF);
      GL11.glEnable(2977);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      return 1;
    } 
    if (paramInt == 1) {
      GL11.glDisable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    } 
    return -1;
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    Dne((Tgj)paramFUH, paramFloat);
  }
  
  protected void Dne(Tgj paramTgj, float paramFloat) {
    float f1 = paramTgj.ATE();
    float f2 = (paramTgj.bzF + (paramTgj.FWm - paramTgj.bzF) * paramFloat) / (f1 * 0.5F + 1.0F);
    float f3 = 1.0F / (f2 + 1.0F);
    GL11.glScalef(f3 * f1, 1.0F / f3 * f1, f3 * f1);
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((Tgj)paramFUH, paramInt, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ENB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */