import java.util.concurrent.Callable;
import net.minecraft.client.Dne;
import net.minecraft.client.Minecraft;

public class Tub implements Callable {
  final Minecraft Dne;
  
  public Tub(Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
  }
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    String str = Dne.Dne();
    return !str.equals("vanilla") ? ("Definitely; Client brand changed to '" + str + "'") : ((Minecraft.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */