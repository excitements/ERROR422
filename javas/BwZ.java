import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class BwZ implements Callable {
  final Minecraft Dne;
  
  public String Dne() {
    return Sys.getVersion();
  }
  
  public Object call() {
    return Dne();
  }
  
  public BwZ(Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BwZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */