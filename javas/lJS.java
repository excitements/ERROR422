import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class lJS extends ocu {
  private Minecraft Dne;
  
  private List Dne = new ArrayList();
  
  public void Dne(float paramFloat) {
    ((Minecraft)this.Dne).Dne.Dne("/gui/particles.png");
    for (byte b = 0; b < this.Dne.size(); b++) {
      RDG rDG = this.Dne.get(b);
      int i = (int)(rDG.bzF + (rDG.Dne - rDG.bzF) * paramFloat - 4.0D);
      int j = (int)(rDG.Qnq + (rDG.FWm - rDG.Qnq) * paramFloat - 4.0D);
      float f1 = (float)(rDG.ooe + (rDG.XHL - rDG.ooe) * paramFloat);
      float f2 = (float)(rDG.Zpi + (rDG.div - rDG.Zpi) * paramFloat);
      float f3 = (float)(rDG.kGO + (rDG.IjH - rDG.kGO) * paramFloat);
      float f4 = (float)(rDG.udO + (rDG.mrb - rDG.udO) * paramFloat);
      GL11.glColor4f(f2, f3, f4, f1);
      FWm(i, j, 40, 0, 8, 8);
    } 
  }
  
  public lJS(Minecraft paramMinecraft) {
    this.Dne = (List)paramMinecraft;
  }
  
  public void Dne() {
    for (byte b = 0; b < this.Dne.size(); b++) {
      RDG rDG = this.Dne.get(b);
      rDG.Dne();
      rDG.Dne(this);
      if (rDG.Dne != 0.0D)
        this.Dne.remove(b--); 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lJS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */