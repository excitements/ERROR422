import java.util.concurrent.Callable;
import net.minecraft.client.Dne;
import net.minecraft.client.Minecraft;

class Aha implements Callable {
  final zHD Dne;
  
  public Object call() {
    return Dne();
  }
  
  Aha(zHD paramzHD) {
    this.Dne = paramzHD;
  }
  
  public String Dne() {
    String str = Dne.Dne();
    if (!str.equals("vanilla"))
      return "Definitely; Client brand changed to '" + str + "'"; 
    str = this.Dne.IjH();
    return !str.equals("vanilla") ? ("Definitely; Server brand changed to '" + str + "'") : ((Minecraft.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Aha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */