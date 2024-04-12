import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class WOS extends Sss {
  private MqS Dne;
  
  private MqS FWm;
  
  protected void Dne(int paramInt1, int paramInt2) {
    this.Dne.FWm(this.FWm.d_() ? this.FWm.b_() : KGL.Dne(this.FWm.b_()), 8, 6, 4210752);
    this.Dne.FWm(this.Dne.d_() ? this.Dne.b_() : KGL.Dne(this.Dne.b_()), 8, this.Qnq - 96 + 2, 4210752);
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/hopper.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
  }
  
  public WOS(MOS paramMOS, MqS paramMqS) {
    super(new Fed(paramMOS, paramMqS));
    this.Dne = paramMOS;
    this.FWm = paramMqS;
    this.FWm = false;
    this.Qnq = '';
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WOS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */