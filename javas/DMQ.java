import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class DMQ extends Pee {
  static {
  
  }
  
  public void Dne(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    if (this.FWm) {
      paramMinecraft.Dne.Dne("/gui/gui.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      boolean bool = (paramInt1 >= this.bzF && paramInt2 >= this.Qnq && paramInt1 < this.bzF + this.Dne && paramInt2 < this.Qnq + this.FWm) ? true : false;
      int i = 106;
      if (bool)
        i += this.FWm; 
      FWm(this.bzF, this.Qnq, 0, i, this.Dne, this.FWm);
    } 
  }
  
  public DMQ(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, paramInt3, 20, 20, "");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DMQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */