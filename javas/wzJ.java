import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class wzJ implements Callable {
  final Minecraft Dne;
  
  public wzJ(Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
  }
  
  public String Dne() {
    return this.Dne.Dne.getClass().getCanonicalName();
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wzJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */