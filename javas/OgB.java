import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class OgB extends YAD {
  private int Dne = ((SAO)this.Dne).Dne();
  
  public void Dne(FUH paramFUH, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((WDT)paramFUH, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public void Dne(WDT paramWDT, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    int i = ((SAO)this.Dne).Dne();
    if (i != this.Dne) {
      this.Dne = i;
      this.Dne = new SAO();
      Minecraft.Dne().Dne().Dne("Loaded new lava slime model");
    } 
    super.Dne(paramWDT, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(WDT paramWDT, float paramFloat) {
    int i = paramWDT.ATE();
    float f1 = (paramWDT.bzF + (paramWDT.FWm - paramWDT.bzF) * paramFloat) / (i * 0.5F + 1.0F);
    float f2 = 1.0F / (f1 + 1.0F);
    float f3 = i;
    GL11.glScalef(f2 * f3, 1.0F / f2 * f3, f2 * f3);
  }
  
  public OgB() {
    super(new SAO(), 0.25F);
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((WDT)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void Dne(FUH paramFUH, float paramFloat) {
    Dne((WDT)paramFUH, paramFloat);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\OgB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */