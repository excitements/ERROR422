import org.lwjgl.opengl.GL11;

public class olK extends YAD {
  protected OAi Dne = this.Dne;
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    FWm((pjB)paramFUH, paramFloat);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((pjB)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public olK() {
    super(new OAi(0.0F), 0.5F);
  }
  
  protected void FWm(FUH paramFUH, float paramFloat) {
    Dne((pjB)paramFUH, paramFloat);
  }
  
  protected void Dne(pjB parampjB, float paramFloat) {
    super.FWm(parampjB, paramFloat);
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((pjB)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected int Dne(FUH paramFUH, int paramInt, float paramFloat) {
    return Dne((pjB)paramFUH, paramInt, paramFloat);
  }
  
  protected int Dne(pjB parampjB, int paramInt, float paramFloat) {
    return -1;
  }
  
  public void Dne(pjB parampjB, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    super.Dne(parampjB, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void FWm(pjB parampjB, float paramFloat) {
    float f = 0.9375F;
    if (parampjB.bzF() < 0) {
      f = (float)(f * 0.5D);
      this.Dne = 0.25F;
    } else {
      this.Dne = 0.5F;
    } 
    GL11.glScalef(f, f, f);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\olK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */