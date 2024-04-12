import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ClL extends Sss {
  private MqS FWm;
  
  private MqS Dne;
  
  private int DyG = 0;
  
  public ClL(MqS paramMqS1, MqS paramMqS2) {
    super(new ZqW(paramMqS1, paramMqS2));
    this.Dne = paramMqS1;
    this.FWm = paramMqS2;
    this.FWm = false;
    char c = 'Þ';
    int i = c - 108;
    this.DyG = paramMqS2.Qnq() / 9;
    this.Qnq = i + this.DyG * 18;
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/container.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.DyG * 18 + 17);
    FWm(i, j + this.DyG * 18 + 17, 0, 126, this.Dne, 96);
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    this.Dne.FWm(this.FWm.d_() ? this.FWm.b_() : KGL.Dne(this.FWm.b_()), 8, 6, 4210752);
    this.Dne.FWm(this.Dne.d_() ? this.Dne.b_() : KGL.Dne(this.Dne.b_()), 8, this.Qnq - 96 + 2, 4210752);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ClL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */