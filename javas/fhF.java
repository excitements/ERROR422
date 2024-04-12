import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class fhF implements Callable {
  final Minecraft Dne;
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
  }
  
  public fhF(Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fhF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */