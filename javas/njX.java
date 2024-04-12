import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class njX extends Sss {
  private zio Dne;
  
  public njX(MOS paramMOS, zio paramzio) {
    super(new oss(paramMOS, paramzio));
    this.Dne = paramzio;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    String str = this.Dne.d_() ? this.Dne.b_() : KGL.Dne(this.Dne.b_());
    this.Dne.FWm(str, this.Dne / 2 - this.Dne.Dne(str) / 2, 6, 4210752);
    this.Dne.FWm(KGL.Dne("container.inventory"), 8, this.Qnq - 96 + 2, 4210752);
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/alchemy.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
    int k = this.Dne.Dne();
    if (k > 0) {
      int m = (int)(28.0F * (1.0F - k / 400.0F));
      if (m > 0)
        FWm(i + 97, j + 16, 176, 0, 9, m); 
      int n = k / 2 % 7;
      switch (n) {
        case 0:
          m = 29;
          break;
        case 1:
          m = 24;
          break;
        case 2:
          m = 20;
          break;
        case 3:
          m = 16;
          break;
        case 4:
          m = 11;
          break;
        case 5:
          m = 6;
          break;
        case 6:
          m = 0;
          break;
      } 
      if (m > 0)
        FWm(i + 65, j + 14 + 29 - m, 185, 29 - m, 12, m); 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\njX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */