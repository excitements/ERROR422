import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class Vdw extends Pee {
  private final String FWm;
  
  private final int zGp;
  
  private boolean Qnq;
  
  private final int DyG;
  
  public void Dne(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    if (this.FWm != null) {
      paramMinecraft.Dne.Dne("/gui/beacon.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.bzF = (paramInt1 >= this.bzF && paramInt2 >= this.Qnq && paramInt1 < this.bzF + this.Dne && paramInt2 < this.Qnq + this.FWm);
      char c = 'Û';
      int i = 0;
      if (this.Dne == null) {
        i += this.Dne * 2;
      } else if (this.Qnq) {
        i += this.Dne * 1;
      } else if (this.bzF) {
        i += this.Dne * 3;
      } 
      FWm(this.bzF, this.Qnq, i, c, this.Dne, this.FWm);
      if (!"/gui/beacon.png".equals(this.FWm))
        paramMinecraft.Dne.Dne(this.FWm); 
      FWm(this.bzF + 2, this.Qnq + 2, this.zGp, this.DyG, 18, 18);
    } 
  }
  
  protected Vdw(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, int paramInt5) {
    super(paramInt1, paramInt2, paramInt3, 22, 22, "");
    this.FWm = paramString;
    this.zGp = paramInt4;
    this.DyG = paramInt5;
  }
  
  public boolean FWm() {
    return this.Qnq;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Qnq = paramBoolean;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Vdw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */