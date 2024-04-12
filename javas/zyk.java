import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class zyk extends Sss {
  public UTs Dne;
  
  protected void Dne(int paramInt1, int paramInt2) {
    String str = this.Dne.d_() ? this.Dne.b_() : KGL.Dne(this.Dne.b_());
    this.Dne.FWm(str, this.Dne / 2 - this.Dne.Dne(str) / 2, 6, 4210752);
    this.Dne.FWm(KGL.Dne("container.inventory"), 8, this.Qnq - 96 + 2, 4210752);
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/trap.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
  }
  
  public zyk(MOS paramMOS, UTs paramUTs) {
    super(new HnX(paramMOS, paramUTs));
    this.Dne = paramUTs;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zyk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */