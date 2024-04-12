import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class XGv extends Sss {
  private lqs Dne;
  
  protected void Dne(int paramInt1, int paramInt2) {
    String str = this.Dne.d_() ? this.Dne.b_() : KGL.Dne(this.Dne.b_());
    this.Dne.FWm(str, this.Dne / 2 - this.Dne.Dne(str) / 2, 6, 4210752);
    this.Dne.FWm(KGL.Dne("container.inventory"), 8, this.Qnq - 96 + 2, 4210752);
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/furnace.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
    if (this.Dne.FWm()) {
      int m = this.Dne.FWm(12);
      FWm(i + 56, j + 36 + 12 - m, 176, 12 - m, 14, m + 2);
    } 
    int k = this.Dne.Dne(24);
    FWm(i + 79, j + 34, 176, 14, k + 1, 16);
  }
  
  public XGv(MOS paramMOS, lqs paramlqs) {
    super(new bhy(paramMOS, paramlqs));
    this.Dne = paramlqs;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XGv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */