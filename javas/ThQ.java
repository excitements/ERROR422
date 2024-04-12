import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ThQ extends Sss {
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/crafting.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    this.Dne.FWm(KGL.Dne("container.crafting"), 28, 6, 4210752);
    this.Dne.FWm(KGL.Dne("container.inventory"), 8, this.Qnq - 96 + 2, 4210752);
  }
  
  public ThQ(MOS paramMOS, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super(new uxW(paramMOS, paramQnq, paramInt1, paramInt2, paramInt3));
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ThQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */