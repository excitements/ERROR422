import org.lwjgl.opengl.GL11;

public class ydy extends YAD {
  protected void Dne(VAd paramVAd, float paramFloat) {
    float f1 = (paramVAd.FWm + (paramVAd.One - paramVAd.FWm) * paramFloat) / 20.0F;
    if (f1 < 0.0F)
      f1 = 0.0F; 
    f1 = 1.0F / (f1 * f1 * f1 * f1 * f1 * 2.0F + 1.0F);
    float f2 = (8.0F + f1) / 2.0F;
    float f3 = (8.0F + 1.0F / f1) / 2.0F;
    GL11.glScalef(f3, f2, f3);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  static {
  
  }
  
  public ydy() {
    super(new Wsm(), 0.5F);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    Dne((VAd)paramFUH, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ydy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */