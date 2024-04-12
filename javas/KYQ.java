import org.lwjgl.opengl.GL11;

public class KYQ extends YAD {
  private float bzF;
  
  public KYQ(Gor paramGor, float paramFloat1, float paramFloat2) {
    super(paramGor, paramFloat1 * paramFloat2);
    this.bzF = paramFloat2;
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    Dne((ZFJ)paramFUH, paramFloat);
  }
  
  protected void Dne(ZFJ paramZFJ, float paramFloat) {
    GL11.glScalef(this.bzF, this.bzF, this.bzF);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KYQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */