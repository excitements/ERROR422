import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class FNi implements Callable {
  final Minecraft Dne;
  
  public String Dne() {
    return "Client (map_client.txt)";
  }
  
  public FNi(Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FNi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */