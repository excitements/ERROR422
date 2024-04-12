import java.util.Collection;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public abstract class MlO extends Sss {
  private boolean Qnq;
  
  private void zGp() {
    int i = this.aFZ - 124;
    int j = this.zGp;
    Collection collection = ((Minecraft)this.Dne).Dne.Dne();
    if (!collection.isEmpty()) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      int k = 33;
      if (collection.size() > 5)
        k = 132 / (collection.size() - 1); 
      for (NAx nAx : ((Minecraft)this.Dne).Dne.Dne()) {
        String str1 = SXd.Dne[nAx.Dne()];
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        ((Minecraft)this.Dne).Dne.Dne("/gui/inventory.png");
        FWm(i, j, 0, 166, 140, 32);
        if (str1.FWm()) {
          int m = str1.FWm();
          FWm(i + 6, j + 7, 0 + m % 8 * 18, 198 + m / 8 * 18, 18, 18);
        } 
        String str2 = KGL.Dne(str1.Dne());
        if (nAx.bzF() == 1) {
          str2 = str2 + " II";
        } else if (nAx.bzF() == 2) {
          str2 = str2 + " III";
        } else if (nAx.bzF() == 3) {
          str2 = str2 + " IV";
        } 
        this.Dne.Dne(str2, i + 10 + 18, j + 6, 16777215);
        String str3 = SXd.Dne(nAx);
        this.Dne.Dne(str3, i + 10 + 18, j + 6 + 10, 8355711);
        j += k;
      } 
    } 
  }
  
  public MlO(Pdb paramPdb) {
    super(paramPdb);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    super.Dne(paramInt1, paramInt2, paramFloat);
    if (this.Qnq)
      zGp(); 
  }
  
  public void Dne() {
    super.Dne();
    if (!((Minecraft)this.Dne).Dne.Dne().isEmpty()) {
      this.aFZ = 160 + (this.FWm - this.Dne - 200) / 2;
      this.Qnq = true;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MlO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */