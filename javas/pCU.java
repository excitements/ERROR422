import org.lwjgl.opengl.GL11;

public class pCU extends YAD {
  public void Dne(kQo paramkQo, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    super.Dne(paramkQo, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  static {
  
  }
  
  public pCU(Gor paramGor, float paramFloat) {
    super(paramGor, paramFloat);
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((kQo)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((kQo)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(kQo paramkQo, float paramFloat) {
    super.Dne(paramkQo, paramFloat);
    if (paramkQo.LVR())
      GL11.glScalef(0.8F, 0.8F, 0.8F); 
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    Dne((kQo)paramFUH, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pCU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */