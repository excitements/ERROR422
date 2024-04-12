import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class bsO extends Pee {
  public boolean Qnq = false;
  
  private ONk Dne;
  
  public float Dne = 1.0F;
  
  public void Dne(int paramInt1, int paramInt2) {
    this.Qnq = false;
  }
  
  protected void FWm(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    if (this.FWm) {
      if (this.Qnq) {
        this.Dne = (paramInt1 - this.bzF + 4) / (this.Dne - 8);
        if (this.Dne < 0.0F)
          this.Dne = 0.0F; 
        if (this.Dne > 1.0F)
          this.Dne = 1.0F; 
        paramMinecraft.Dne.Dne(this.Dne, this.Dne);
        this.Dne = paramMinecraft.Dne.Dne(this.Dne);
      } 
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      FWm(this.bzF + (int)(this.Dne * (this.Dne - 8)), this.Qnq, 0, 66, 4, 20);
      FWm(this.bzF + (int)(this.Dne * (this.Dne - 8)) + 4, this.Qnq, 196, 66, 4, 20);
    } 
  }
  
  public bsO(int paramInt1, int paramInt2, int paramInt3, ONk paramONk, String paramString, float paramFloat) {
    super(paramInt1, paramInt2, paramInt3, 150, 20, paramString);
    this.Dne = null;
    this.Dne = paramONk;
    this.Dne = paramFloat;
  }
  
  public boolean Dne(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    if (super.Dne(paramMinecraft, paramInt1, paramInt2)) {
      this.Dne = (paramInt1 - this.bzF + 4) / (this.Dne - 8);
      if (this.Dne < 0.0F)
        this.Dne = 0.0F; 
      if (this.Dne > 1.0F)
        this.Dne = 1.0F; 
      paramMinecraft.Dne.Dne(this.Dne, this.Dne);
      this.Dne = paramMinecraft.Dne.Dne(this.Dne);
      this.Qnq = true;
      return true;
    } 
    return false;
  }
  
  protected int Dne(boolean paramBoolean) {
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bsO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */