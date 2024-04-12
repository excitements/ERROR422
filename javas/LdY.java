import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class LdY extends Pee {
  private final boolean Qnq;
  
  public void Dne(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    if (this.FWm) {
      paramMinecraft.Dne.Dne("/gui/trading.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      boolean bool = (paramInt1 >= this.bzF && paramInt2 >= this.Qnq && paramInt1 < this.bzF + this.Dne && paramInt2 < this.Qnq + this.FWm) ? true : false;
      int i = 0;
      int j = 176;
      if (this.Dne == null) {
        j += this.Dne * 2;
      } else if (bool) {
        j += this.Dne;
      } 
      if (!this.Qnq)
        i += this.FWm; 
      FWm(this.bzF, this.Qnq, j, i, this.Dne, this.FWm);
    } 
  }
  
  public LdY(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    super(paramInt1, paramInt2, paramInt3, 12, 19, "");
    this.Qnq = paramBoolean;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LdY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */