import org.lwjgl.opengl.GL11;

public class QiJ extends YAD {
  protected float Dne(Xxe paramXxe, float paramFloat) {
    return paramXxe.IYC + (paramXxe.xXN - paramXxe.IYC) * paramFloat;
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((Xxe)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(Xxe paramXxe, float paramFloat1, float paramFloat2, float paramFloat3) {
    float f1 = paramXxe.FWm + (paramXxe.Dne - paramXxe.FWm) * paramFloat3;
    float f2 = paramXxe.Qnq + (paramXxe.bzF - paramXxe.Qnq) * paramFloat3;
    GL11.glTranslatef(0.0F, 0.5F, 0.0F);
    GL11.glRotatef(180.0F - paramFloat2, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(f1, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
    GL11.glTranslatef(0.0F, -1.2F, 0.0F);
  }
  
  public QiJ(Gor paramGor, float paramFloat) {
    super(paramGor, paramFloat);
  }
  
  public void Dne(Xxe paramXxe, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    super.Dne(paramXxe, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  static {
  
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((Xxe)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    Dne((Xxe)paramFUH, paramFloat1, paramFloat2, paramFloat3);
  }
  
  protected float Dne(FUH paramFUH, float paramFloat) {
    return Dne((Xxe)paramFUH, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QiJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */