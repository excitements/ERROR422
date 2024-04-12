import java.net.URI;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class yZI extends qVZ {
  protected void Dne(Pee paramPee) {
    switch (paramPee.aFZ) {
      case 1:
        paramPee.Dne = Character.MIN_VALUE;
        try {
          Class<?> clazz = Class.forName("java.awt.Desktop");
          Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
          clazz.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { new URI("http://www.minecraft.net/store?source=demo") });
        } catch (Throwable throwable) {
          throwable.printStackTrace();
        } 
        break;
      case 2:
        this.Dne.Dne((qVZ)null);
        this.Dne.aFZ();
        break;
    } 
  }
  
  public void bzF() {
    super.bzF();
  }
  
  public void aFZ() {
    super.aFZ();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/demo_bg.png");
    int i = (this.FWm - 248) / 2;
    int j = (this.bzF - 166) / 2;
    FWm(i, j, 0, 0, 248, 166);
  }
  
  static {
  
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    int i = (this.FWm - 248) / 2 + 10;
    int j = (this.bzF - 166) / 2 + 8;
    this.Dne.FWm(KGL.Dne("demo.help.title"), i, j, 2039583);
    j += 12;
    Snh snh = ((Minecraft)this.Dne).Dne;
    String str = KGL.Dne("demo.help.movementShort");
    str = String.format(str, new Object[] { Keyboard.getKeyName(((ulE)((fZI)snh).Dne).Dne), Keyboard.getKeyName(((ulE)((fZI)snh).FWm).Dne), Keyboard.getKeyName(((fZI)snh).bzF.Dne), Keyboard.getKeyName(((fZI)snh).Qnq.Dne) });
    this.Dne.FWm(str, i, j, 5197647);
    str = KGL.Dne("demo.help.movementMouse");
    this.Dne.FWm(str, i, j + 12, 5197647);
    str = KGL.Dne("demo.help.jump");
    str = String.format(str, new Object[] { Keyboard.getKeyName(((fZI)snh).aFZ.Dne) });
    this.Dne.FWm(str, i, j + 24, 5197647);
    str = KGL.Dne("demo.help.inventory");
    str = String.format(str, new Object[] { Keyboard.getKeyName(((ulE)((fZI)snh).zGp).Dne) });
    this.Dne.FWm(str, i, j + 36, 5197647);
    this.Dne.Dne(KGL.Dne("demo.help.fullWrapped"), i, j + 68, 218, 2039583);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void Dne() {
    this.Dne.clear();
    byte b = -16;
    this.Dne.add(new Pee(1, this.FWm / 2 - 116, this.bzF / 2 + 62 + b, 114, 20, KGL.Dne("demo.help.buy")));
    this.Dne.add(new Pee(2, this.FWm / 2 + 2, this.bzF / 2 + 62 + b, 114, 20, KGL.Dne("demo.help.later")));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yZI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */