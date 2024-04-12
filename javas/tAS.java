import net.minecraft.client.Minecraft;

public class tAS extends Thread {
  final Minecraft Dne;
  
  public tAS(Minecraft paramMinecraft, String paramString) {
    super(paramString);
    this.Dne = paramMinecraft;
  }
  
  public void run() {
    while (this.Dne.DyG) {
      try {
        Thread.sleep(2147483647L);
      } catch (InterruptedException interruptedException) {}
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tAS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */