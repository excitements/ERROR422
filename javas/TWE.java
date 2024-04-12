import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import net.minecraft.client.Minecraft;

public class TWE extends Thread {
  private final DatagramSocket Dne;
  
  private boolean Dne;
  
  private final String FWm;
  
  private final String Dne = '\001';
  
  public static String Dne(String paramString) {
    int i = paramString.indexOf("[MOTD]");
    if (i < 0)
      return "missing no"; 
    int j = paramString.indexOf("[/MOTD]", i + "[MOTD]".length());
    return (j < i) ? "missing no" : paramString.substring(i + "[MOTD]".length(), j);
  }
  
  public static String Dne(String paramString1, String paramString2) {
    return "[MOTD]" + paramString1 + "[/MOTD][AD]" + paramString2 + "[/AD]";
  }
  
  public void interrupt() {
    super.interrupt();
    this.Dne = Character.MIN_VALUE;
  }
  
  public static String FWm(String paramString) {
    int i = paramString.indexOf("[/MOTD]");
    if (i < 0)
      return null; 
    int j = paramString.indexOf("[/MOTD]", i + "[/MOTD]".length());
    if (j >= 0)
      return null; 
    int k = paramString.indexOf("[AD]", i + "[/MOTD]".length());
    if (k < 0)
      return null; 
    int m = paramString.indexOf("[/AD]", k + "[AD]".length());
    return (m < k) ? null : paramString.substring(k + "[AD]".length(), m);
  }
  
  public void run() {
    String str = Dne(this.Dne, this.FWm);
    byte[] arrayOfByte = str.getBytes();
    while (!isInterrupted() && this.Dne != null) {
      try {
        InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
        DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, inetAddress, 4445);
        this.Dne.send(datagramPacket);
      } catch (IOException iOException) {
        Minecraft.Dne().Dne().FWm("LanServerPinger: " + iOException.getMessage());
        break;
      } 
      try {
        sleep(1500L);
      } catch (InterruptedException interruptedException) {}
    } 
  }
  
  public TWE(String paramString1, String paramString2) {
    super("LanServerPinger");
    this.Dne = paramString1;
    this.FWm = paramString2;
    setDaemon(true);
    this.Dne = (String)new DatagramSocket();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TWE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */