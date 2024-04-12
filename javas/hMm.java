import org.lwjgl.opengl.GL11;

public class hMm extends YAD {
  private int Dne = ((ljp)this.Dne).Dne();
  
  protected void Dne(oaw paramoaw, float paramFloat) {
    GL11.glScalef(0.35F, 0.35F, 0.35F);
  }
  
  protected void Dne(oaw paramoaw, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (!paramoaw.haP()) {
      GL11.glTranslatef(0.0F, geR.FWm(paramFloat1 * 0.3F) * 0.1F, 0.0F);
    } else {
      GL11.glTranslatef(0.0F, -0.1F, 0.0F);
    } 
    super.Dne(paramoaw, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((oaw)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3) {
    Dne((oaw)paramFUH, paramDouble1, paramDouble2, paramDouble3);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat1, float paramFloat2, float paramFloat3) {
    Dne((oaw)paramFUH, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((oaw)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public hMm() {
    super(new ljp(), 0.25F);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    Dne((oaw)paramFUH, paramFloat);
  }
  
  public void Dne(oaw paramoaw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    int i = ((ljp)this.Dne).Dne();
    if (i != this.Dne) {
      this.Dne = i;
      this.Dne = new ljp();
    } 
    super.Dne(paramoaw, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(oaw paramoaw, double paramDouble1, double paramDouble2, double paramDouble3) {
    super.Dne(paramoaw, paramDouble1, paramDouble2, paramDouble3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hMm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */