import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class bod extends Pee {
  private final boolean Qnq;
  
  public bod(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    super(paramInt1, paramInt2, paramInt3, 23, 13, "");
    this.Qnq = paramBoolean;
  }
  
  public void Dne(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    if (this.FWm) {
      boolean bool1 = (paramInt1 >= this.bzF && paramInt2 >= this.Qnq && paramInt1 < this.bzF + this.Dne && paramInt2 < this.Qnq + this.FWm) ? true : false;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      paramMinecraft.Dne.Dne("/gui/book.png");
      boolean bool2 = false;
      char c = 'À';
      if (bool1)
        bool2 += true; 
      if (!this.Qnq)
        c += '\r'; 
      FWm(this.bzF, this.Qnq, bool2, c, 23, 13);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */