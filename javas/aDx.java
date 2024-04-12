import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class aDx implements Callable {
  final Minecraft Dne;
  
  public Object call() {
    return Dne();
  }
  
  public aDx(Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
  }
  
  public String Dne() {
    return this.Dne.Dne.getClass().getCanonicalName();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\aDx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */